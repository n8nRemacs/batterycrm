package defpackage;

/* loaded from: classes2.dex */
public final class oxa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uxa b;

    public /* synthetic */ oxa(uxa uxaVar, int i) {
        this.a = i;
        this.b = uxaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uxa uxaVar = this.b;
                cm6 cm6Var = uxaVar.C0;
                if (cm6Var != null) {
                    cm6Var.invoke();
                }
                uxaVar.invalidate();
                break;
            default:
                uxa uxaVar2 = this.b;
                cm6 cm6Var2 = uxaVar2.C0;
                if (cm6Var2 != null) {
                    cm6Var2.invoke();
                }
                uxaVar2.invalidate();
                break;
        }
    }
}
