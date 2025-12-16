package va1;

import B91.C13112e;
import Ba1.AbstractC13126d;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class b extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C13112e f440845l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C13112e c13112e) {
        super(0);
        this.f440845l = c13112e;
    }

    @Override // Y41.a
    public final Object invoke() {
        C13112e c13112e = this.f440845l;
        AbstractC13126d.a(c13112e.f1108e);
        ImageView imageView = c13112e.f1108e;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setFillAfter(true);
        imageView.startAnimation(alphaAnimation);
        c13112e.f1108e.setVisibility(0);
        return G0.f406611a;
    }
}
