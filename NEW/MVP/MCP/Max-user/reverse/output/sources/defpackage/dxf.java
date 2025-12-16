package defpackage;

import android.os.StrictMode;
import android.util.Log;

/* loaded from: classes.dex */
public final class dxf extends h6f {
    @Override // defpackage.h6f
    public final String b() {
        throw null;
    }

    @Override // defpackage.h6f
    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception e) {
            Log.e("SoLoader", "Error loading library: " + str, e);
            return 0;
        }
    }

    @Override // defpackage.h6f
    public final String toString() {
        return "SystemLoadWrapperSoSource[" + fwf.getClassLoaderLdLoadLibrary() + "]";
    }
}
