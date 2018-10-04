package iterator;

import java.util.Iterator;

public class MyCollection extends BaseCollection {

	@Override
	public Iterator<String> iterator() {
		return new MyIterator();
	}

	private class MyIterator implements Iterator<String>{

		

			int index = 0;
			String ultimo = null;

			@Override
			public boolean hasNext() {
				return index < data.size();
			}

			@Override
			public String next() {
				ultimo = data.get(index);
				index++;
				return ultimo+2;
			}

			@Override
			public void remove() {
				data.remove(ultimo);
				index--;
			}
		
	}
}