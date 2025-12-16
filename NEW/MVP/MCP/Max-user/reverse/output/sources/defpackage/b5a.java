package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class b5a extends sm implements j1g {
    public final long[] X;
    public final String Y;
    public final long d;
    public final long o;

    public b5a(long j, long j2, long j3, long[] jArr) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = jArr;
        this.Y = b5a.class.getName();
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        c5a c5aVar = (c5a) l0gVar;
        String str = this.Y;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, ho7.f(c5aVar.c.e, "onSuccess: reactionsCount = "), null);
            }
        }
        m8a m8aVar = c5aVar.c;
        m8a m8aVar2 = new m8a(this.X.length);
        for (long j : this.X) {
            m8aVar2.f(j, m8aVar.d(j));
        }
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        nxg nxgVar = (nxg) tmVar.Z.getValue();
        tm tmVar2 = this.c;
        if (tmVar2 == null) {
            tmVar2 = null;
        }
        svi.e(nxgVar, ((q2b) ((lzf) tmVar2.Y.getValue())).a(), null, new a5a(this, m8aVar2, null), 2);
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        String str = this.Y;
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.Y;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, "onFail " + pzfVar + "}", null);
        }
    }

    @Override // defpackage.sm
    public final n2 i() {
        long[] jArr = this.X;
        if (jArr.length == 0) {
            throw new IllegalArgumentException("messageIds is empty, MsgGetReactions requires at least one messageId");
        }
        zf8 zf8Var = new zf8(xhb.t1, 7);
        if (jArr.length == 0) {
            throw new IllegalArgumentException("mesageIds can't be empty");
        }
        zf8Var.t(this.o, ApiProtocol.PARAM_CHAT_ID);
        zf8Var.q("messageIds", jArr);
        return zf8Var;
    }
}
