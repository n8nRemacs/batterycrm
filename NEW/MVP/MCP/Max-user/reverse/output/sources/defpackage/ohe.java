package defpackage;

/* loaded from: classes2.dex */
public final class ohe extends hge {
    public final long b;

    public ohe(long j) {
        this.b = j;
    }

    @Override // defpackage.hge
    public final void u() {
        ve2 ve2VarB = b();
        ve2VarB.getClass();
        StringBuilder sb = new StringBuilder("storeChatFromCache chatId = ");
        long j = this.b;
        sb.append(j);
        wqi.c("ve2", sb.toString(), new Object[0]);
        sf2 sf2VarK = ve2VarB.K(j);
        if (sf2VarK != null) {
            ((ie4) ve2VarB.m.get()).b.i(j, sf2VarK.b);
        } else {
            wqi.e("ve2", "storeChatFromCache, chatId = " + j, null);
        }
    }
}
