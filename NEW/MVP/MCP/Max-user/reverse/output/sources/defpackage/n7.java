package defpackage;

/* loaded from: classes2.dex */
public final class n7 implements tm6, n9f {
    public long a;

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        long j = this.a;
        dsd dsdVarC = dsd.c(1, "SELECT * FROM draft_uploads WHERE chat_id = ?");
        dsdVarC.k(1, j);
        return new yr8(new l35((m35) obj, dsdVarC, 1));
    }

    @Override // defpackage.n9f
    public m9f d() {
        return new wib(this);
    }
}
