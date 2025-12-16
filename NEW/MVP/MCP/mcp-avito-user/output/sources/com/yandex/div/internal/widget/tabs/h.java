package com.yandex.div.internal.widget.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import java.util.WeakHashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f370491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f370492b;

    public /* synthetic */ h(ViewGroup viewGroup, int i12) {
        this.f370491a = i12;
        this.f370492b = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup = this.f370492b;
        switch (this.f370491a) {
            case 0:
                int i12 = BaseIndicatorTabLayout.d.f370420w;
                BaseIndicatorTabLayout.d dVar = (BaseIndicatorTabLayout.d) viewGroup;
                dVar.getClass();
                dVar.f370439t = 1.0f - valueAnimator.getAnimatedFraction();
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                dVar.postInvalidateOnAnimation();
                break;
            default:
                androidx.interpolator.view.animation.b bVar = BaseIndicatorTabLayout.f370383F;
                BaseIndicatorTabLayout baseIndicatorTabLayout = (BaseIndicatorTabLayout) viewGroup;
                baseIndicatorTabLayout.getClass();
                baseIndicatorTabLayout.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
        }
    }
}
