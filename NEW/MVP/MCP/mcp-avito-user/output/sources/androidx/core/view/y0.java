package androidx.core.view;

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.avito.android.beduin.common.container.horizontal_slider.BeduinBaseHorizontalSliderLayout;
import com.avito.android.lib.design.emotion_selector.ImageSelectorView;
import java.util.WeakHashMap;
import kotlin.jvm.internal.l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45097c;

    public /* synthetic */ y0(int i12, Object obj, Object obj2) {
        this.f45095a = i12;
        this.f45096b = obj;
        this.f45097c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.f45097c;
        Object obj2 = this.f45096b;
        switch (this.f45095a) {
            case 0:
                ((D0) obj2).a();
                break;
            case 1:
                ((TextView) obj2).setText((SpannableString) obj);
                break;
            case 2:
                int i12 = BeduinBaseHorizontalSliderLayout.f103059q;
                l0.f fVar = (l0.f) obj2;
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue() - fVar.f406840b;
                ((BeduinBaseHorizontalSliderLayout) obj).recycler.scrollBy(iIntValue, 0);
                fVar.f406840b += iIntValue;
                break;
            case 3:
                ((ImageSelectorView.b) obj2).f179165g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i13 = ImageSelectorView.f179147k;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                ((ImageSelectorView) obj).postInvalidateOnAnimation();
                break;
            default:
                int i14 = com.avito.android.serp.adapter.gallery.t.f270060n;
                l0.f fVar2 = (l0.f) obj2;
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue() - fVar2.f406840b;
                ((com.avito.android.serp.adapter.gallery.t) obj).f270066g.c(-iIntValue2);
                fVar2.f406840b += iIntValue2;
                break;
        }
    }
}
