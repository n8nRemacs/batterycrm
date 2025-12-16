package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class rp8 extends wh6 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public rp8(s9g s9gVar, Object obj, Object obj2) {
        super(s9gVar);
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.wh6, defpackage.s9g
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // defpackage.wh6, defpackage.s9g
    public final m9g f(int i, m9g m9gVar, boolean z) {
        this.e.f(i, m9gVar, z);
        if (Objects.equals(m9gVar.b, this.g) && z) {
            m9gVar.b = h;
        }
        return m9gVar;
    }

    @Override // defpackage.wh6, defpackage.s9g
    public final Object l(int i) {
        Object objL = this.e.l(i);
        return Objects.equals(objL, this.g) ? h : objL;
    }

    @Override // defpackage.wh6, defpackage.s9g
    public final q9g m(int i, q9g q9gVar, long j) {
        this.e.m(i, q9gVar, j);
        if (Objects.equals(q9gVar.a, this.f)) {
            q9gVar.a = q9g.q;
        }
        return q9gVar;
    }
}
