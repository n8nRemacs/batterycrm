package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class do8 {
    public final c0g a;
    public final Map b = Collections.synchronizedMap(new kr8(10, 0));
    public final Map c = Collections.synchronizedMap(new kr8(10, 0));
    public final Map d = Collections.synchronizedMap(new kr8(10, 0));
    public final Map e = Collections.synchronizedMap(new kr8(10, 0));
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    public do8(c0g c0gVar) {
        this.a = c0gVar;
    }

    public final ao8 a(Context context, np8 np8Var, boolean z, boolean z2) {
        int i;
        ao8 ao8Var;
        int i2 = ivd.g0;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("This thread is main!");
        }
        Map map = this.b;
        Map map2 = this.d;
        Map map3 = this.c;
        c0g c0gVar = this.a;
        if (!z) {
            ao8 ao8Var2 = (ao8) map.get(np8Var);
            int iOrdinal = np8Var.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1) {
                throw new IllegalStateException("Wrong marker weight");
            }
            c0gVar.getClass();
            i = i2;
            ao8Var = ao8Var2;
        } else if (z2) {
            ao8Var = (ao8) map3.get(np8Var);
            int iOrdinal2 = np8Var.ordinal();
            if (iOrdinal2 == 0) {
                c0gVar.getClass();
                i = ivd.d0;
            } else {
                if (iOrdinal2 != 1) {
                    throw new IllegalStateException("Wrong marker weight");
                }
                c0gVar.getClass();
                i = ivd.c0;
            }
        } else {
            ao8Var = (ao8) map2.get(np8Var);
            int iOrdinal3 = np8Var.ordinal();
            if (iOrdinal3 == 0) {
                c0gVar.getClass();
                i = ivd.f0;
            } else {
                if (iOrdinal3 != 1) {
                    throw new IllegalStateException("Wrong marker weight");
                }
                c0gVar.getClass();
                i = ivd.e0;
            }
        }
        if (ao8Var != null) {
            return ao8Var;
        }
        Bitmap bitmapO = tfi.o(i, ctd.f(a93.s0, c0gVar.a).k, context);
        ao8 ao8Var3 = new ao8(bitmapO, t49.b(bitmapO));
        if (!z) {
            map.put(np8Var, ao8Var3);
            return ao8Var3;
        }
        if (z2) {
            map3.put(np8Var, ao8Var3);
            return ao8Var3;
        }
        map2.put(np8Var, ao8Var3);
        return ao8Var3;
    }
}
