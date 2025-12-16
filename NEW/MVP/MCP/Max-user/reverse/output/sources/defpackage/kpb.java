package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class kpb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wpb b;
    public final /* synthetic */ kda c;

    public /* synthetic */ kpb(wpb wpbVar, kda kdaVar, int i) {
        this.a = i;
        this.b = wpbVar;
        this.c = kdaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wpb wpbVar = this.b;
                wpbVar.v.post(new kpb(wpbVar, this.c, 2));
                break;
            case 1:
                wpb wpbVar2 = this.b;
                wpbVar2.v.post(new kpb(wpbVar2, this.c, 3));
                break;
            case 2:
                WeakReference weakReference = this.b.T;
                j01 j01Var = weakReference == null ? null : (j01) weakReference.get();
                if (j01Var != null) {
                    j01Var.onNegotiationError(this.c);
                    break;
                }
                break;
            default:
                WeakReference weakReference2 = this.b.T;
                j01 j01Var2 = weakReference2 == null ? null : (j01) weakReference2.get();
                if (j01Var2 != null) {
                    j01Var2.onNegotiationError(this.c);
                    break;
                }
                break;
        }
    }
}
