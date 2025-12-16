package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class cld extends sm implements j1g, tsb {
    public final long d;

    public cld(long j, long j2) {
        super(j);
        this.d = j2;
    }

    @Override // defpackage.tsb
    public final int c() {
        return 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        dld dldVar = (dld) l0gVar;
        pe8 pe8Var = p().a;
        pe8Var.v.O(pe8Var, w4e.m0[11], null);
        tm tmVar = this.c;
        ((klc) (tmVar != null ? tmVar : null).V.getValue()).b(dldVar.c);
        k().c(new c04(this.a, dldVar.c.a, 1));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        if (!qaj.c(pzfVar.b)) {
            f();
        }
        k().c(new rj0(this.a, pzfVar));
    }

    @Override // defpackage.tsb
    public final void f() {
        long jS = p().a.s();
        if (jS > 0) {
            hwa hwaVarJ = j();
            hwa.q(hwaVarJ, new hx3(hwaVarJ.t().a.k(), new long[]{jS}, 0));
        }
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.RemoveContactPhoto removeContactPhoto = new Tasks.RemoveContactPhoto();
        removeContactPhoto.requestId = this.a;
        removeContactPhoto.photoId = this.d;
        return fl9.toByteArray(removeContactPhoto);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.G0;
    }

    @Override // defpackage.sm
    public final n2 i() {
        return new zf8(this.d, 20);
    }
}
