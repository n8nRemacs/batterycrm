package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class gj3 extends sm implements j1g, tsb {
    public final long[] X;
    public final long[] Y;
    public final Long Z;
    public final rj3 d;
    public final byte o;
    public final String s0;

    public gj3(long j, rj3 rj3Var, byte b, long[] jArr, long[] jArr2, Long l, String str) {
        super(j);
        this.d = rj3Var;
        this.o = b;
        this.X = jArr;
        this.Y = jArr2;
        this.Z = l;
        this.s0 = str;
    }

    @Override // defpackage.tsb
    public final int c() {
        return 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        Long l;
        if (!((hj3) l0gVar).c || (l = this.Z) == null) {
            return;
        }
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        ((c6i) tmVar.h.getValue()).b(new oge(l.longValue(), ys.C(this.X), null, true, rs4.REGULAR));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        if (qaj.c(pzfVar.b)) {
            return;
        }
        f();
        k().c(new rj0(pzfVar));
    }

    @Override // defpackage.tsb
    public final void f() {
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.Complain complain = new Tasks.Complain();
        complain.requestId = this.a;
        Long l = this.Z;
        complain.parentId = l != null ? l.longValue() : 0L;
        complain.ids = this.X;
        complain.serverIds = this.Y;
        complain.typeId = this.d.a;
        complain.reasonId = this.o;
        String str = this.s0;
        if (str == null) {
            str = "";
        }
        complain.details = str;
        return fl9.toByteArray(complain);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.c1;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        long[] jArr = this.Y;
        Long l = this.Z;
        if (l == null) {
            return new fh2(this.d, this.o, jArr, l, this.s0);
        }
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        pb2 pb2Var = (pb2) ((w63) tmVar.X.getValue()).j(this.Z.longValue()).a.getValue();
        return new fh2(this.d, this.o, jArr, pb2Var != null ? Long.valueOf(pb2Var.b.a) : null, this.s0);
    }
}
