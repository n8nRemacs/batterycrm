package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* loaded from: classes.dex */
public final class t22 {
    public final xo8 a;
    public final ArrayMap b = new ArrayMap(4);

    public t22(xo8 xo8Var) {
        this.a = xo8Var;
    }

    public static t22 a(Context context, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        return new t22(i >= 30 ? new w22(context, null) : i >= 29 ? new v22(context, null) : i >= 28 ? new u22(context, null) : new xo8(context, new x22(handler)));
    }

    public final i12 b(String str) {
        i12 i12Var;
        synchronized (this.b) {
            i12Var = (i12) this.b.get(str);
            if (i12Var == null) {
                try {
                    i12 i12Var2 = new i12(this.a.C(str), str);
                    this.b.put(str, i12Var2);
                    i12Var = i12Var2;
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(e.getMessage(), e);
                }
            }
        }
        return i12Var;
    }
}
