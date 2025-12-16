package defpackage;

/* loaded from: classes2.dex */
public final class yad extends xfh {
    public final long b;
    public final bwf c = new bwf(new ffb(23, this));

    public yad(long j) {
        this.b = j;
        gq9 gq9Var = gq9.a;
        d53 d53Var = new d53(((w63) gq9Var.getAccessor().c(109)).j(j), 12);
        int i = s65.d;
        gw0.w(gw0.u(new g56(gw0.l(zs0.g(d53Var, v9j.h(1, y65.SECONDS)), new cj0(29)), new xad(this, null), 1), ((q2b) gq9Var.getDispatchers()).a().limitedParallelism(1, "reactions:lastReactedMessageId")), this.a);
    }

    @Override // defpackage.xfh
    public final void s() {
        vad vadVarT = t();
        d7j.c(vadVarT.a, null);
        vadVarT.s();
    }

    public final vad t() {
        return (vad) this.c.getValue();
    }
}
