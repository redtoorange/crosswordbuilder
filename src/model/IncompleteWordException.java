package model;

/**
 * IncompleteWordException.java - DESCRIPTION
 *
 * @author - Andrew M.
 * @version - 04/Feb/2017
 */
public class IncompleteWordException extends Exception{
	public IncompleteWordException() {
		super( "The Word - Defintion pair is incomplete." );
	}
}