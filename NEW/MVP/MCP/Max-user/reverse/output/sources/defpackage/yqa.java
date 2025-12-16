package defpackage;

/* loaded from: classes.dex */
public final class yqa extends k3 {
    public final /* synthetic */ int b;
    public final m7c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yqa(vqa vqaVar, m7c m7cVar, int i) {
        super(vqaVar);
        this.b = i;
        this.c = m7cVar;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        switch (this.b) {
            case 0:
                this.a.a(new xqa(vtaVar, this.c, 0));
                break;
            default:
                this.a.a(new zra(vtaVar, this.c, 0));
                break;
        }
    }
}
