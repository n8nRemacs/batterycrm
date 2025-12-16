package androidx.media3.session;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class E0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G0 f52038c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.D0 f52039d;

    public /* synthetic */ E0(G0 g02, com.google.common.util.concurrent.D0 d02, int i12) {
        this.f52037b = i12;
        this.f52038c = g02;
        this.f52039d = d02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.D0 d02 = this.f52039d;
        G0 g02 = this.f52038c;
        switch (this.f52037b) {
            case 0:
                int i12 = G0.f52048x;
                g02.getClass();
                C23252q<?> c23252q = (C23252q) G0.s(d02);
                if (c23252q != null) {
                    g02.n(c23252q);
                    break;
                }
                break;
            case 1:
                int i13 = G0.f52048x;
                g02.getClass();
                C23252q<?> c23252q2 = (C23252q) G0.s(d02);
                if (c23252q2 != null) {
                    g02.n(c23252q2);
                    break;
                }
                break;
            default:
                int i14 = G0.f52048x;
                g02.getClass();
                C23252q<?> c23252q3 = (C23252q) G0.s(d02);
                if (c23252q3 != null) {
                    g02.n(c23252q3);
                    break;
                }
                break;
        }
    }
}
