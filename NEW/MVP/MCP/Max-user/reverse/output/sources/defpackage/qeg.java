package defpackage;

import android.content.Context;
import android.util.Log;

/* loaded from: classes2.dex */
public final class qeg {
    public final String a;
    public final xpb b;
    public volatile boolean c;
    public final Context d;
    public final Object e = ipi.b(2, new peg(this, 1));
    public final Object f = ipi.b(2, new peg(this, 0));
    public final ms3 g = new ms3(1);
    public final kya h;
    public final hc8 i;
    public final kme j;
    public final vd k;

    public qeg(Context context, String str, xpb xpbVar) {
        this.a = str;
        this.b = xpbVar;
        this.d = context.getApplicationContext();
        this.h = new kya(context, str);
        this.i = new hc8(context, str);
        this.j = new kme(str);
        this.k = new vd(context, 11, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final seg a() {
        return (seg) this.e.getValue();
    }

    public final void b(String str, String str2) {
        if (this.c) {
            Log.d("Tracer", "Tracer is disabled");
            return;
        }
        ms3 ms3Var = this.g;
        ms3Var.getClass();
        String strZ = vmf.Z(31, str);
        String strZ2 = vmf.Z(31, str2);
        synchronized (ms3Var.a) {
            String str3 = (String) ms3Var.a.remove(strZ);
            ms3Var.a.put(strZ, strZ2);
            if (str3 == null && ms3Var.a.size() > 30) {
                ms3Var.a.entrySet().iterator().remove();
            }
        }
    }
}
