package QU;

import Ug0.C15517a;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.advert_core.price_list.v2.section.g;
import com.avito.android.advert_core.service_education.o;
import com.avito.android.lib.design.accordion.Accordion;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f13726b;

    public /* synthetic */ a(View view, int i12) {
        this.f13725a = i12;
        this.f13726b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f13726b;
        switch (this.f13725a) {
            case 0:
                int i12 = Accordion.f178177n;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(layoutParams);
                return;
            case 1:
                int i13 = Accordion.f178177n;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(layoutParams2);
                return;
            case 2:
                String[] strArr = C15517a.f16549B;
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams3.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(layoutParams3);
                return;
            case 3:
                int i14 = g.f84170i;
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                layoutParams4.height = iIntValue;
                view.setLayoutParams(layoutParams4);
                return;
            case 4:
                int i15 = o.f84326i;
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                layoutParams5.height = iIntValue2;
                view.setLayoutParams(layoutParams5);
                return;
            case 5:
                int i16 = o.f84326i;
                int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
                layoutParams6.height = iIntValue3;
                view.setLayoutParams(layoutParams6);
                return;
            default:
                ru.cyberity.cbr.camera.photo.presentation.document.b.a(view, valueAnimator);
                return;
        }
    }
}
