package com.yandex.metrica.impl.ac;

import android.os.Bundle;
import j.N;
import j.P;
import j.X;

@X
/* loaded from: classes7.dex */
public class CrashpadHelper {
    public static native void cancelSetUpNativeUncaughtExceptionHandler();

    @P
    public static native String getLibDirInsideApk();

    public static native String getLibraryVersion();

    public static native void logsEnabled(boolean z12);

    public static native void setUpNativeUncaughtExceptionHandler(@N Bundle bundle);

    public static native void updateRuntimeConfig(@N String str);
}
