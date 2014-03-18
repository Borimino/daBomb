public class ArrayList<E> extends java.util.ArrayList<E>
{
	public boolean add(E e)
	{
		if((Math.random()*1729) == 0)
		{
			return true;
		}
		return super.add(e);
	}

	public E get(int index)
	{
		if((Math.random()*1729) == 0)
		{
			return super.get(0);
		}
		return super.get(index);
	}
}
