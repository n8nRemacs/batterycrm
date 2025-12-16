package defpackage;

import android.content.Context;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class am3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ am3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static u1c b(Context context, float f, float f2, int i, int i2, j1c j1cVar) {
        r1e r1eVarB = i9j.b(context);
        float f3 = 16;
        return new u1c((-f) + kti.d(vw4.d().getDisplayMetrics().density * f3), ((r1eVarB.b - f) - i) - kti.d(vw4.d().getDisplayMetrics().density * f3), (-f2) + kti.d(vw4.d().getDisplayMetrics().density * f3) + r1eVarB.c + j1cVar.a, ((((r1eVarB.a - r1eVarB.d) - f2) - i2) - kti.d(f3 * vw4.d().getDisplayMetrics().density)) - j1cVar.b);
    }

    public final am3 a(Serializable serializable) {
        switch (this.a) {
            case 0:
                ((PrintStream) this.b).print(serializable);
                break;
            default:
                ((PrintWriter) this.b).print(serializable);
                break;
        }
        return this;
    }
}
