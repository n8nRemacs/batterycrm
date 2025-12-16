package defpackage;

/* loaded from: classes.dex */
public final class qp8 extends vh6 {
    public static final Object o = new Object();
    public final Object c;
    public final Object d;

    public qp8(r9g r9gVar, Object obj, Object obj2) {
        super(r9gVar);
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.vh6, defpackage.r9g
    public final int b(Object obj) {
        Object obj2;
        if (o.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // defpackage.vh6, defpackage.r9g
    public final l9g f(int i, l9g l9gVar, boolean z) {
        this.b.f(i, l9gVar, z);
        if (xxg.a(l9gVar.b, this.d) && z) {
            l9gVar.b = o;
        }
        return l9gVar;
    }

    @Override // defpackage.vh6, defpackage.r9g
    public final Object l(int i) {
        Object objL = this.b.l(i);
        return xxg.a(objL, this.d) ? o : objL;
    }

    @Override // defpackage.vh6, defpackage.r9g
    public final p9g m(int i, p9g p9gVar, long j) {
        this.b.m(i, p9gVar, j);
        if (xxg.a(p9gVar.a, this.c)) {
            p9gVar.a = p9g.B0;
        }
        return p9gVar;
    }
}
