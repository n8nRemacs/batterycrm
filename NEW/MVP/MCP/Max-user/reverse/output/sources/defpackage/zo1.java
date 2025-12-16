package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.calls.impl.service.CallServiceImpl;

/* loaded from: classes.dex */
public final class zo1 {
    public static final String a(int i) {
        zo1 zo1Var = CallServiceImpl.u0;
        int i2 = fge.a;
        if (i == 0) {
            return b(0);
        }
        if (i == -1) {
            return b(fge.f);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CallServiceImpl.w0.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue != fge.f && (i & iIntValue) != 0) {
                arrayList.add(b(iIntValue));
            }
        }
        return ue3.N(arrayList, "|", null, null, null, 62);
    }

    public static String b(int i) {
        return i == fge.b ? "mediaPlayback" : i == fge.f ? "manifest" : i == fge.c ? "mediaProjection" : i == fge.e ? "microphone" : i == fge.d ? "camera" : i == 0 ? "none" : wy1.e(i, "unknown(", ")");
    }

    public static Handler c() {
        if (CallServiceImpl.v0 == null) {
            CallServiceImpl.v0 = new Handler(Looper.getMainLooper());
        }
        Handler handler = CallServiceImpl.v0;
        if (handler != null) {
            return handler;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static void d(Context context) {
        c().post(new ud(context, 19, new Intent(context, (Class<?>) CallServiceImpl.class).putExtra("ACTION", 3)));
    }
}
