package com.konylabs.ffi;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;
import com.konylabs.api.TableLib;
import com.konylabs.vm.LuaTable;



import com.mki.samplekonyffi.konyAdapter;
import com.konylabs.libintf.Library;
import com.konylabs.libintf.JSLibrary;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;


public class NDD_com_mki_samplekonyffi extends JSLibrary {

 
 
	public static final String initializeFFI = "initializeFFI";
 
	String[] methods = { initializeFFI };


 Library libs[] = null;
 public Library[] getClasses() {
 libs = new Library[0];
 return libs;
 }



	public NDD_com_mki_samplekonyffi(){
	}

	public Object[] execute(int index, Object[] params) {
		// TODO Auto-generated method stub
		Object[] ret = null;
 
		int paramLen = params.length;
 int inc = 1;
		switch (index) {
 		case 0:
 if (paramLen != 1){ return new Object[] {new Double(100),"Invalid Params"}; }
 com.konylabs.vm.Function ffiCallback0 = null;
 if(params[0] != null && params[0] != LuaNil.nil) {
 ffiCallback0 = (com.konylabs.vm.Function)params[0];
 }
 ret = this.initializeFFI( ffiCallback0 );
 
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
		return "com.mki.samplekonyffi";
	}


	/*
	 * return should be status(0 and !0),address
	 */
 
 
 	public final Object[] initializeFFI( com.konylabs.vm.Function inputKey0 ){
 
		Object[] ret = null;
 com.mki.samplekonyffi.konyAdapter.initializectosSDK( (com.konylabs.vm.Function)inputKey0
 );
 
 ret = new Object[]{LuaNil.nil, new Double(0)};
 		return ret;
	}
 
};
