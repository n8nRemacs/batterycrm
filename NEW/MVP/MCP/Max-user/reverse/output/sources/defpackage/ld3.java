package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ld3 {
    public final jd3 a;
    public pd3 b;
    public final jdc c;
    public pe4 d;

    public ld3(jd3 jd3Var, pd3 pd3Var, jdc jdcVar) {
        this.a = jd3Var;
        this.b = pd3Var;
        this.c = jdcVar;
    }

    public final void a() {
        pe4 pe4Var = this.d;
        if (pe4Var != null) {
            pe4Var.close();
        }
        this.d = null;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, k18] */
    public final Drawable b() {
        pd3 pd3Var = this.b;
        boolean z = pd3Var instanceof od3;
        jdc jdcVar = this.c;
        if (z) {
            return (w2c) jdcVar.b.getValue();
        }
        if (pd3Var instanceof nd3) {
            return (r00) jdcVar.c.getValue();
        }
        if (!(pd3Var instanceof md3) && pd3Var != null) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.a instanceof s0h) {
            return (w2c) jdcVar.d.getValue();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (ld3.class.equals(obj != null ? obj.getClass() : null)) {
            return fni.a(this.a, ((ld3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
