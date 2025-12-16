package AV;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.tab_group.layout.d;
import java.util.WeakHashMap;
import lY0.C43707b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f359c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f360d;

    public /* synthetic */ d(ViewGroup viewGroup, int i12, int i13, int i14) {
        this.f357a = i14;
        this.f360d = viewGroup;
        this.f358b = i12;
        this.f359c = i13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i12 = this.f359c;
        int i13 = this.f358b;
        ViewGroup viewGroup = this.f360d;
        switch (this.f357a) {
            case 0:
                int i14 = ShimmerLayout.f180517t;
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue() + i13;
                ShimmerLayout shimmerLayout = (ShimmerLayout) viewGroup;
                shimmerLayout.f180518b = iIntValue;
                if (iIntValue + i12 >= 0) {
                    shimmerLayout.invalidate();
                    break;
                }
                break;
            default:
                int i15 = d.b.f180775n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                d.b bVar = (d.b) viewGroup;
                int iC2 = C43707b.c(animatedFraction, bVar.f180784j, i13);
                int iC3 = C43707b.c(animatedFraction, bVar.f180785k, i12);
                if (iC2 != bVar.f180781g || iC3 != bVar.f180782h) {
                    bVar.f180781g = iC2;
                    bVar.f180782h = iC3;
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    bVar.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }
}
