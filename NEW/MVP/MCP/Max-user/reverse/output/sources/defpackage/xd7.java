package defpackage;

/* loaded from: classes2.dex */
public final class xd7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd7 b;
    public final /* synthetic */ float c;

    public /* synthetic */ xd7(zd7 zd7Var, float f, int i) {
        this.a = i;
        this.b = zd7Var;
        this.c = f;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, k18] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rd7 rd7Var = rd7.a;
                zd7 zd7Var = this.b;
                zd7Var.setRemoteImageState(rd7Var);
                ?? r0 = zd7Var.M0;
                if (r0.e()) {
                    ((r00) r0.getValue()).setLevel(kti.d(this.c * 10000));
                    break;
                }
                break;
            default:
                rd7 rd7Var2 = rd7.a;
                zd7 zd7Var2 = this.b;
                zd7Var2.setRemoteImageState(rd7Var2);
                ?? r02 = zd7Var2.M0;
                if (r02.e()) {
                    ((r00) r02.getValue()).setLevel(kti.d(this.c * 10000));
                    break;
                }
                break;
        }
    }
}
