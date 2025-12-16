package androidx.media3.session;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class E1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52042d;

    public /* synthetic */ E1(int i12, int i13, Object obj) {
        this.f52040b = i13;
        this.f52041c = obj;
        this.f52042d = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52040b) {
            case 0:
                G1 g12 = ((F1) this.f52041c).f52046h;
                if (g12.u(25) || g12.u(33)) {
                    boolean zU2 = g12.u(33);
                    int i12 = this.f52042d;
                    if (!zU2) {
                        g12.H(i12);
                        break;
                    } else {
                        g12.R(i12, 1);
                        break;
                    }
                }
                break;
            case 1:
                G1 g13 = ((F1) this.f52041c).f52046h;
                if (g13.u(26) || g13.u(34)) {
                    int i13 = this.f52042d;
                    if (i13 == -100) {
                        if (!g13.u(34)) {
                            g13.L(true);
                            break;
                        } else {
                            g13.r(1, true);
                            break;
                        }
                    } else if (i13 == -1) {
                        if (!g13.u(34)) {
                            g13.N();
                            break;
                        } else {
                            g13.P(1);
                            break;
                        }
                    } else if (i13 == 1) {
                        if (!g13.u(34)) {
                            g13.v();
                            break;
                        } else {
                            g13.s(1);
                            break;
                        }
                    } else if (i13 == 100) {
                        if (!g13.u(34)) {
                            g13.L(false);
                            break;
                        } else {
                            g13.r(1, false);
                            break;
                        }
                    } else if (i13 == 101) {
                        if (!g13.u(34)) {
                            g13.L(!g13.t0());
                            break;
                        } else {
                            g13.r(1, !g13.t0());
                            break;
                        }
                    } else {
                        androidx.media3.common.util.s.g();
                        break;
                    }
                }
                break;
            default:
                ((C23229i0) this.f52041c).f52501j.remove(Integer.valueOf(this.f52042d));
                break;
        }
    }
}
