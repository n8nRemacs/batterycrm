package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class v5a extends sm implements j1g, tsb {
    public final String d;
    public final long o;

    public v5a(long j, String str, long j2) {
        super(j);
        this.d = str;
        this.o = j2;
    }

    @Override // defpackage.tsb
    public final int c() {
        return 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) throws Throwable {
        w5a w5aVar = (w5a) l0gVar;
        long j = this.o;
        if (j == -1) {
            if (w5aVar.c.isEmpty()) {
                return;
            }
            k().c(new c04(this.a, w5aVar.c, 2));
            return;
        }
        si9 si9VarM = n().m(j);
        boolean zIsEmpty = w5aVar.c.isEmpty();
        jm9 jm9Var = jm9.ACTIVE;
        String str = this.d;
        if (zIsEmpty || si9VarM == null) {
            n().a.c.d().m(new wsg(j, null, 0));
            if (si9VarM != null) {
                String str2 = si9VarM.Y;
                if (!fni.a(str2, str) && str2 != null && str != null && !vmf.s(str2, str, false)) {
                    n().v(this.o, u45.k(str2, "\n", str), null, l(), jm9Var);
                }
            }
        } else {
            sz szVar = w5aVar.c;
            tm tmVar = this.c;
            if (tmVar == null) {
                tmVar = null;
            }
            n().s(si9VarM, po8.e(szVar, (m4e) tmVar.G.getValue()));
            if (fni.a(si9VarM.Y, str)) {
                n().v(this.o, null, null, l(), jm9Var);
            }
        }
        tm tmVar2 = this.c;
        she.v((c6i) (tmVar2 != null ? tmVar2 : null).h.getValue());
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        if (qaj.c(pzfVar.b)) {
            return;
        }
        f();
    }

    @Override // defpackage.tsb
    public final void f() {
        r().d(this.a);
        n().a.c.d().m(new wsg(this.o, null, 0));
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.MsgSharePreview msgSharePreview = new Tasks.MsgSharePreview();
        msgSharePreview.requestId = this.a;
        msgSharePreview.text = this.d;
        msgSharePreview.messageId = this.o;
        return fl9.toByteArray(msgSharePreview);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.B0;
    }

    @Override // defpackage.sm
    public final n2 i() {
        zf8 zf8Var = new zf8((xhb) null, 14);
        zf8Var.x("text", this.d);
        return zf8Var;
    }
}
