package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class c7a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ d4h d;

    public /* synthetic */ c7a(d4h d4hVar, long j, boolean z, int i) {
        this.a = i;
        this.d = d4hVar;
        this.b = j;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((f7a) ((h08) this.d).b).e.p(this.b, this.c);
                break;
            default:
                ((s2f) ((v32) this.d).c).d.p(this.b, this.c);
                break;
        }
    }
}
