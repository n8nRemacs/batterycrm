package defpackage;

/* loaded from: classes.dex */
public final class nod {
    public zmd a;
    public epc b;
    public String d;
    public f07 e;
    public qod g;
    public ood h;
    public ood i;
    public ood j;
    public long k;
    public long l;
    public gge m;
    public int c = -1;
    public i17 f = new i17();

    public static void b(ood oodVar, String str) {
        if (oodVar != null) {
            if (oodVar.Y != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (oodVar.Z != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (oodVar.s0 != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (oodVar.t0 != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final ood a() {
        int i = this.c;
        if (!(i >= 0)) {
            throw new IllegalStateException(("code < 0: " + this.c).toString());
        }
        zmd zmdVar = this.a;
        if (zmdVar == null) {
            throw new IllegalStateException("request == null");
        }
        epc epcVar = this.b;
        if (epcVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new ood(zmdVar, epcVar, str, i, this.e, this.f.c(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        throw new IllegalStateException("message == null");
    }
}
