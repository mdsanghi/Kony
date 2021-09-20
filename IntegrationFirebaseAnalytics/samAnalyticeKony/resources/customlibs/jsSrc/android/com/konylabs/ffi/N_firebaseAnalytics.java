package com.konylabs.ffi;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;
import com.konylabs.api.TableLib;
import com.konylabs.vm.LuaTable;



import com.mki.AndroidAnalyticsFFI1.MainActivity;
import com.konylabs.libintf.Library;
import com.konylabs.libintf.JSLibrary;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;


public class N_firebaseAnalytics extends JSLibrary {

 
	String[] methods = { };


 Library libs[] = null;
 public Library[] getClasses() {
 libs = new Library[1];
 libs[0] = new MainActivity();
 return libs;
 }



	public N_firebaseAnalytics(){
	}

	public Object[] execute(int index, Object[] params) {
		// TODO Auto-generated method stub
		Object[] ret = null;
 
		int paramLen = params.length;
 int inc = 1;
		switch (index) {
 		default:
			break;
		}
 
		return ret;
	}

	public String[] getMethods() {
		// TODO Auto-generated method stub
		return methods;
	}
	public String getNameSpace() {
		// TODO Auto-generated method stub
		return "firebaseAnalytics";
	}


	/*
	 * return should be status(0 and !0),address
	 */
 


class MainActivity extends JSLibrary {

 
 
	public static final String analyticslogEvent = "analyticslogEvent";
 
	String[] methods = { analyticslogEvent };

	public Object createInstance(final Object[] params) {
 return new com.mki.AndroidAnalyticsFFI1.MainActivity(
 );
 }


	public Object[] execute(int index, Object[] params) {
		// TODO Auto-generated method stub
		Object[] ret = null;
 
		int paramLen = params.length;
 int inc = 1;
		switch (index) {
 		case 0:
 if (paramLen < 3 || paramLen > 4){ return new Object[] {new Double(100),"Invalid Params"};}
 inc = 1;
 
 java.lang.String event0 = null;
 if(params[0+inc] != null && params[0+inc] != LuaNil.nil) {
 event0 = (java.lang.String)params[0+inc];
 }
 java.lang.String param0 = null;
 if(params[1+inc] != null && params[1+inc] != LuaNil.nil) {
 param0 = (java.lang.String)params[1+inc];
 }
 java.lang.String paramValue0 = null;
 if(params[2+inc] != null && params[2+inc] != LuaNil.nil) {
 paramValue0 = (java.lang.String)params[2+inc];
 }
 ret = this.analyticslogEvent(params[0]
 ,event0
 ,param0
 ,paramValue0
 );
 
 			break;
 		default:
			break;
		}
 
		return ret;
	}

	public String[] getMethods() {
		// TODO Auto-generated method stub
		return methods;
	}
	public String getNameSpace() {
		// TODO Auto-generated method stub
		return "MainActivity";
	}

	/*
	 * return should be status(0 and !0),address
	 */
 
 
 	public final Object[] analyticslogEvent( Object self ,java.lang.String inputKey0
 ,java.lang.String inputKey1
 ,java.lang.String inputKey2
 ){
 
		Object[] ret = null;
 ((com.mki.AndroidAnalyticsFFI1.MainActivity)self).analyticslogEvent( inputKey0
 , inputKey1
 , inputKey2
 );
 
 ret = new Object[]{LuaNil.nil, new Double(0)};
 		return ret;
	}
 
}

};
