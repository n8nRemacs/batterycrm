package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class y0 {
    public static final w0 j = new w0();
    public static final NullPointerException k = new NullPointerException("No image request was specified!");
    public static final AtomicLong l = new AtomicLong();
    public final Context a;
    public brf d;
    public boolean h;
    public rf7 b = null;
    public rf7 c = null;
    public n54 e = null;
    public boolean f = false;
    public boolean g = false;
    public i45 i = null;

    public y0(Context context) {
        this.a = context;
    }

    public final b2c a() {
        b2c b2cVar;
        rf7 rf7Var;
        if (!(this.d == null || (this.b == null && this.c == null))) {
            throw new IllegalStateException("Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
        }
        if (this.b == null && (rf7Var = this.c) != null) {
            this.b = rf7Var;
            this.c = null;
        }
        ml6.i();
        c2c c2cVar = (c2c) this;
        ml6.i();
        try {
            i45 i45Var = c2cVar.i;
            String strValueOf = String.valueOf(l.getAndIncrement());
            if (i45Var instanceof b2c) {
                b2cVar = (b2c) i45Var;
            } else {
                vl3 vl3Var = c2cVar.n;
                b2c b2cVar2 = new b2c((Resources) vl3Var.a, (fs4) vl3Var.b, (v35) vl3Var.c, (Executor) vl3Var.d, (jf9) vl3Var.o, (sz) vl3Var.X);
                brf brfVar = (brf) vl3Var.Y;
                if (brfVar != null) {
                    b2cVar2.A = ((Boolean) brfVar.get()).booleanValue();
                }
                b2cVar = b2cVar2;
            }
            brf brfVarB = c2cVar.b(b2cVar, strValueOf);
            rf7 rf7Var2 = c2cVar.b;
            kk4 kk4Var = c2cVar.m.h;
            jp0 jp0VarV = (kk4Var == null || rf7Var2 == null) ? null : rf7Var2.o != null ? kk4Var.v(rf7Var2, null) : kk4Var.p(rf7Var2, null);
            b2cVar.getClass();
            ml6.i();
            b2cVar.f(strValueOf);
            b2cVar.q = false;
            b2cVar.z = brfVarB;
            b2cVar.t(null);
            b2cVar.y = jp0VarV;
            b2cVar.t(null);
            ml6.i();
            synchronized (b2cVar) {
                b2cVar.B = c2cVar.b;
                b2cVar.C = c2cVar.c;
            }
            ml6.i();
            b2cVar.n = this.h;
            boolean z = this.f;
            if (z) {
                if (b2cVar.d == null) {
                    jc7 jc7Var = new jc7();
                    jc7Var.b = false;
                    jc7Var.a = 4;
                    jc7Var.c = 0;
                    b2cVar.d = jc7Var;
                }
                b2cVar.d.b = z;
                if (b2cVar.e == null) {
                    nr6 nr6Var = new nr6(this.a);
                    b2cVar.e = nr6Var;
                    nr6Var.a = b2cVar;
                }
            }
            n54 n54Var = this.e;
            if (n54Var != null) {
                b2cVar.a(n54Var);
            }
            if (this.g) {
                b2cVar.a(j);
            }
            ml6.i();
            return b2cVar;
        } catch (Throwable th) {
            ml6.i();
            throw th;
        }
    }

    public final brf b(b2c b2cVar, String str) {
        y0 y0Var;
        b2c b2cVar2;
        String str2;
        brf nj7Var;
        brf brfVar = this.d;
        if (brfVar != null) {
            return brfVar;
        }
        rf7 rf7Var = this.b;
        if (rf7Var != null) {
            y0Var = this;
            b2cVar2 = b2cVar;
            str2 = str;
            nj7Var = new x0(y0Var, b2cVar2, str2, rf7Var, 1);
        } else {
            y0Var = this;
            b2cVar2 = b2cVar;
            str2 = str;
            nj7Var = null;
        }
        if (nj7Var != null && y0Var.c != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(nj7Var);
            arrayList.add(new x0(y0Var, b2cVar2, str2, y0Var.c, 1));
            nj7Var = new nj7(arrayList, false);
        }
        return nj7Var == null ? new we4(0) : nj7Var;
    }
}
