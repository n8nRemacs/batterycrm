package defpackage;

/* loaded from: classes.dex */
public final class qsa extends vqa implements oyd {
    public final Object a;

    public qsa(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.drf
    public final Object get() {
        return this.a;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        kta ktaVar = new kta(vtaVar, this.a);
        vtaVar.c(ktaVar);
        ktaVar.run();
    }
}
