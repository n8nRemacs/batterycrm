package Ha1;

import ru.mts.biometry.sdk.view.modalcard.wheel.view.WheelView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WheelView f7287c;

    public /* synthetic */ b(WheelView wheelView, int i12) {
        this.f7286b = i12;
        this.f7287c = wheelView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WheelView wheelView = this.f7287c;
        switch (this.f7286b) {
            case 0:
                int i12 = WheelView.f436641T;
                int scrollY = wheelView.getScrollY();
                int i13 = wheelView.f436645J;
                if (i13 != scrollY) {
                    wheelView.f436645J = wheelView.getScrollY();
                    wheelView.postDelayed(wheelView.f436644I, 50L);
                    break;
                } else {
                    int i14 = wheelView.f436648M;
                    int i15 = i13 % i14;
                    if (i15 != 0) {
                        wheelView.post(i15 > i14 / 2 ? new c(wheelView, i15, 3) : new c(wheelView, i15, 4));
                        break;
                    } else {
                        wheelView.u();
                        break;
                    }
                }
            case 1:
                wheelView.p(1);
                break;
            default:
                wheelView.p(1);
                break;
        }
    }
}
