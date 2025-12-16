package androidx.media3.session;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class C0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f51929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G0 f51930c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.D0 f51931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f51932e;

    public /* synthetic */ C0(G0 g02, com.google.common.util.concurrent.D0 d02, int i12, int i13) {
        this.f51929b = i13;
        this.f51930c = g02;
        this.f51931d = d02;
        this.f51932e = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i12 = this.f51932e;
        com.google.common.util.concurrent.D0 d02 = this.f51931d;
        G0 g02 = this.f51930c;
        switch (this.f51929b) {
            case 0:
                int i13 = G0.f52048x;
                g02.getClass();
                C23252q<?> c23252q = (C23252q) G0.s(d02);
                if (c23252q != null) {
                    g02.n(c23252q);
                    G0.t(i12, c23252q);
                    break;
                }
                break;
            default:
                int i14 = G0.f52048x;
                g02.getClass();
                C23252q<?> c23252q2 = (C23252q) G0.s(d02);
                if (c23252q2 != null) {
                    g02.n(c23252q2);
                    G0.t(i12, c23252q2);
                    break;
                }
                break;
        }
    }
}
