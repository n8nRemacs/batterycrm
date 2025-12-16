package defpackage;

/* loaded from: classes.dex */
public final class qra extends k3 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qra(lta ltaVar, int i) {
        super(ltaVar);
        this.b = i;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        switch (this.b) {
            case 0:
                this.a.a(new pra(vtaVar));
                break;
            case 1:
                this.a.a(new msa(vtaVar, 0));
                break;
            default:
                this.a.a(new msa(vtaVar, 1));
                break;
        }
    }
}
