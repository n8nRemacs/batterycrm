package Ha1;

import android.widget.LinearLayout;
import ru.mts.biometry.sdk.view.modalcard.wheel.view.WheelView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WheelView f7289c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7290d;

    public /* synthetic */ c(WheelView wheelView, int i12, int i13) {
        this.f7288b = i13;
        this.f7289c = wheelView;
        this.f7290d = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7288b) {
            case 0:
                WheelView wheelView = this.f7289c;
                LinearLayout linearLayout = wheelView.f436643H;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                wheelView.p((((linearLayout.getChildCount() / 2) + this.f7290d) - wheelView.f436650O) * wheelView.f436648M);
                break;
            case 1:
                WheelView wheelView2 = this.f7289c;
                wheelView2.p((this.f7290d - wheelView2.f436650O) * wheelView2.f436648M);
                break;
            case 2:
                WheelView wheelView3 = this.f7289c;
                wheelView3.p(this.f7290d * wheelView3.f436648M);
                break;
            case 3:
                WheelView wheelView4 = this.f7289c;
                wheelView4.p((wheelView4.f436645J - this.f7290d) + wheelView4.f436648M);
                wheelView4.u();
                break;
            default:
                WheelView wheelView5 = this.f7289c;
                wheelView5.p(wheelView5.f436645J - this.f7290d);
                wheelView5.u();
                break;
        }
    }
}
