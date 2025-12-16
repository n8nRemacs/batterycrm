package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class p0g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j1g b;
    public final /* synthetic */ pzf c;

    public /* synthetic */ p0g(j1g j1gVar, pzf pzfVar, int i) {
        this.a = i;
        this.b = j1gVar;
        this.c = pzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            case 1:
                this.b.e(this.c);
                break;
            default:
                this.b.e(this.c);
                break;
        }
    }
}
