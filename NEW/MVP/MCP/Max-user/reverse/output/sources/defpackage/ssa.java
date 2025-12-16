package defpackage;

/* loaded from: classes.dex */
public final class ssa extends k3 {
    public final j0e b;
    public final int c;

    public ssa(vqa vqaVar, j0e j0eVar, int i) {
        super(vqaVar);
        this.b = j0eVar;
        this.c = i;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        j0e j0eVar = this.b;
        boolean z = j0eVar instanceof qgg;
        lta ltaVar = this.a;
        if (z) {
            ltaVar.a(vtaVar);
        } else {
            ltaVar.a(new rsa(vtaVar, j0eVar.a(), this.c));
        }
    }
}
