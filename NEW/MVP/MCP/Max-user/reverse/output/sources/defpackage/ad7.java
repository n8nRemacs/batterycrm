package defpackage;

import android.os.Build;
import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ad7 implements wwg {
    public final /* synthetic */ int a;
    public final x8a b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ad7(int i) {
        this(x8a.b(), 0);
        this.a = i;
        switch (i) {
            case 1:
                this(x8a.b(), 1);
                break;
            case 2:
                this(x8a.b(), 2);
                break;
            default:
                break;
        }
    }

    public ee7 a() {
        Object objF;
        Object objF2;
        Object objF3;
        s90 s90Var = fe7.o;
        x8a x8aVar = this.b;
        x8aVar.getClass();
        Object objF4 = null;
        try {
            objF = x8aVar.f(s90Var);
        } catch (IllegalArgumentException unused) {
            objF = null;
        }
        Integer num = (Integer) objF;
        if (num != null) {
            x8aVar.n(re7.x, num);
        } else {
            ce7 ce7Var = ee7.A;
            try {
                objF2 = x8aVar.f(fe7.X);
            } catch (IllegalArgumentException unused2) {
                objF2 = null;
            }
            if (Objects.equals(objF2, 1)) {
                x8aVar.n(re7.x, 4101);
                x8aVar.n(re7.y, u75.c);
            } else {
                x8aVar.n(re7.x, 256);
            }
        }
        fe7 fe7Var = new fe7(fjb.a(x8aVar));
        bf7.F(fe7Var);
        ee7 ee7Var = new ee7(fe7Var);
        try {
            objF3 = x8aVar.f(bf7.D);
        } catch (IllegalArgumentException unused3) {
            objF3 = null;
        }
        Size size = (Size) objF3;
        if (size != null) {
            ee7Var.t = new Rational(size.getWidth(), size.getHeight());
        }
        s90 s90Var2 = ks7.K;
        Object objC = ayi.c();
        try {
            objC = x8aVar.f(s90Var2);
        } catch (IllegalArgumentException unused4) {
        }
        z5j.e((Executor) objC, "The IO executor can't be null");
        s90 s90Var3 = fe7.c;
        if (x8aVar.a.containsKey(s90Var3)) {
            Integer num2 = (Integer) x8aVar.f(s90Var3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            }
            if (num2.intValue() == 3) {
                try {
                    objF4 = x8aVar.f(fe7.u0);
                } catch (IllegalArgumentException unused5) {
                }
                if (objF4 == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
        }
        return ee7Var;
    }

    public r8c b() {
        s8c s8cVar = new s8c(fjb.a(this.b));
        bf7.F(s8cVar);
        r8c r8cVar = new r8c(s8cVar);
        r8cVar.q = r8c.y;
        return r8cVar;
    }

    public void c() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.b.n(bf7.C, 2);
        }
    }

    public final Object d(aod aodVar) {
        switch (this.a) {
            case 0:
                this.b.n(bf7.H, aodVar);
                break;
            case 1:
                this.b.n(bf7.H, aodVar);
                break;
            case 2:
                this.b.n(bf7.H, aodVar);
                break;
            default:
                this.b.n(bf7.H, aodVar);
                break;
        }
        return this;
    }

    @Override // defpackage.pn5
    public final c8a o() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.wwg
    public final xwg q() {
        switch (this.a) {
            case 0:
                return new id7(fjb.a(this.b));
            case 1:
                return new fe7(fjb.a(this.b));
            case 2:
                return new s8c(fjb.a(this.b));
            default:
                return new t1h(fjb.a(this.b));
        }
    }

    public ad7(x8a x8aVar, int i) {
        Object objF;
        Object objF2;
        Object objF3;
        Object objF4;
        this.a = i;
        switch (i) {
            case 1:
                this.b = x8aVar;
                Object objF5 = null;
                try {
                    objF = x8aVar.f(a2g.f0);
                } catch (IllegalArgumentException unused) {
                    objF = null;
                }
                Class cls = (Class) objF;
                if (cls != null && !cls.equals(ee7.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                this.b.n(xwg.p0, zwg.a);
                x8a x8aVar2 = this.b;
                x8aVar2.n(a2g.f0, ee7.class);
                try {
                    objF5 = x8aVar2.f(a2g.e0);
                } catch (IllegalArgumentException unused2) {
                }
                if (objF5 == null) {
                    this.b.n(a2g.e0, ee7.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                this.b = x8aVar;
                Object objF6 = null;
                try {
                    objF2 = x8aVar.f(a2g.f0);
                } catch (IllegalArgumentException unused3) {
                    objF2 = null;
                }
                Class cls2 = (Class) objF2;
                if (cls2 != null && !cls2.equals(r8c.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
                }
                this.b.n(xwg.p0, zwg.b);
                x8a x8aVar3 = this.b;
                x8aVar3.n(a2g.f0, r8c.class);
                try {
                    objF6 = x8aVar3.f(a2g.e0);
                } catch (IllegalArgumentException unused4) {
                }
                if (objF6 == null) {
                    this.b.n(a2g.e0, r8c.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                Object objF7 = -1;
                try {
                    objF7 = x8aVar.f(bf7.C);
                } catch (IllegalArgumentException unused5) {
                }
                if (((Integer) objF7).intValue() == -1) {
                    x8aVar.n(bf7.C, 2);
                    return;
                }
                return;
            case 3:
                this.b = x8aVar;
                if (x8aVar.a.containsKey(t1h.b)) {
                    Object objF8 = null;
                    try {
                        objF3 = x8aVar.f(a2g.f0);
                    } catch (IllegalArgumentException unused6) {
                        objF3 = null;
                    }
                    Class cls3 = (Class) objF3;
                    if (cls3 != null && !cls3.equals(s1h.class)) {
                        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls3);
                    }
                    this.b.n(xwg.p0, zwg.d);
                    x8a x8aVar4 = this.b;
                    x8aVar4.n(a2g.f0, s1h.class);
                    try {
                        objF8 = x8aVar4.f(a2g.e0);
                    } catch (IllegalArgumentException unused7) {
                    }
                    if (objF8 == null) {
                        x8aVar4.n(a2g.e0, s1h.class.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("VideoOutput is required");
            default:
                this.b = x8aVar;
                Object objF9 = null;
                try {
                    objF4 = x8aVar.f(a2g.f0);
                } catch (IllegalArgumentException unused8) {
                    objF4 = null;
                }
                Class cls4 = (Class) objF4;
                if (cls4 != null && !cls4.equals(dd7.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls4);
                }
                this.b.n(xwg.p0, zwg.c);
                x8a x8aVar5 = this.b;
                x8aVar5.n(a2g.f0, dd7.class);
                try {
                    objF9 = x8aVar5.f(a2g.e0);
                } catch (IllegalArgumentException unused9) {
                }
                if (objF9 == null) {
                    x8aVar5.n(a2g.e0, dd7.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ad7(uah uahVar) {
        this.a = 3;
        x8a x8aVarB = x8a.b();
        x8aVarB.n(t1h.b, uahVar);
        this(x8aVarB, 3);
    }
}
