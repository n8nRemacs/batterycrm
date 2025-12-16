package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class l5a extends sm implements j1g {
    public final long X;
    public final String Y;
    public final long d;
    public final String o;

    public l5a(String str, long j, long j2, long j3) {
        super(j);
        this.d = j2;
        this.o = str;
        this.X = j3;
        this.Y = l5a.class.getName();
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        m5a m5aVar = (m5a) l0gVar;
        k().c(new ds2(this.a, this.o, m5aVar.c, m5aVar.d, m5aVar.o));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        k().c(new rj0(this.a, pzfVar));
    }

    @Override // defpackage.sm
    public final n2 i() {
        pb2 pb2VarM = l().M(this.d);
        if (pb2VarM != null) {
            rf2 rf2Var = pb2VarM.b;
            if (rf2Var.a != 0 || l().Y(pb2VarM)) {
                long j = rf2Var.a;
                zf8 zf8Var = new zf8((xhb) null, 10);
                zf8Var.t(j, ApiProtocol.PARAM_CHAT_ID);
                zf8Var.x("query", this.o);
                zf8Var.j(100, "count");
                long j2 = this.X;
                if (j2 != 0) {
                    zf8Var.t(j2, "marker");
                }
                return zf8Var;
            }
        }
        wqi.e(this.Y, "createRequest: No chat or serverId == 0. return null", null);
        return null;
    }
}
