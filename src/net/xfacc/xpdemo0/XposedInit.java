package net.xfacc.xpdemo0;

import android.util.Log;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

public class XposedInit implements IXposedHookLoadPackage {

	private final String TAG = "Xposed";

	public Class<?> clazz = null;

	public void log(String s) {
		Log.d(TAG, s);
		XposedBridge.log(s);
	}

	@Override
	public void handleLoadPackage(final LoadPackageParam lpparam) {
//		try {
//			new CertTrustMeHook().handleLoadPackage(lpparam);
//		} catch (Throwable e) {
//			Log.i("jw", "hook err:" + Log.getStackTraceString(e));
//		}

		HookAppAllMethod.hookMethod(lpparam);

	}

}
