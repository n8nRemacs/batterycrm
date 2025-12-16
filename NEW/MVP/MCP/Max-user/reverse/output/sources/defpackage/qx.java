package defpackage;

/* loaded from: classes.dex */
public final class qx extends gs4 {
    public final rx c;

    public qx(vta vtaVar, rx rxVar) {
        super(vtaVar);
        this.c = rxVar;
    }

    @Override // defpackage.gs4, defpackage.py4
    public final void dispose() {
        if (getAndSet(4) != 4) {
            this.c.t(this);
        }
    }
}
