package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class s9b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t9b b;

    public /* synthetic */ s9b(t9b t9bVar, int i) {
        this.a = i;
        this.b = t9bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t9b t9bVar = this.b;
                if (!t9bVar.c.get()) {
                    t9bVar.b.execute(new ui(10, t9bVar, true));
                    break;
                }
                break;
            default:
                t9b t9bVar2 = this.b;
                if (!t9bVar2.c.get()) {
                    t9bVar2.b.execute(new ui(10, t9bVar2, false));
                    break;
                }
                break;
        }
    }
}
