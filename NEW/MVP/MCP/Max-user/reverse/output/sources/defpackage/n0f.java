package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class n0f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0f b;
    public final /* synthetic */ String c;

    public /* synthetic */ n0f(q0f q0fVar, int i, String str) {
        this.a = i;
        this.b = q0fVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q0f.b(this.b, this.c);
                break;
            default:
                q0f.a(this.b, this.c);
                break;
        }
    }
}
