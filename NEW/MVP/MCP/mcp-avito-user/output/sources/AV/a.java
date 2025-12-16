package AV;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.p;
import com.avito.android.extended_profile_ui_components.BadgeBarV3View;
import com.avito.android.gig_apply.ui.s;
import com.avito.android.glow_animation_text_view.GlowTextAnimationView;
import com.avito.android.glow_animation_text_view.GradientMaskTextView;
import com.avito.android.lib.deprecated_design.input.TextInputView;
import com.avito.android.lib.deprecated_design.input.j;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.tab_group.layout.d;
import com.avito.android.lib.design.text_view.a;
import com.avito.android.mortgage.pre_approval.list.items.title.g;
import com.avito.android.publish.scanner_v2.ScannerOverlay;
import com.avito.android.select.SegmentedControlRedesign;
import com.avito.android.shortcut_navigation_bar.adapter.category_node.h;
import kotlin.reflect.n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f349b;

    public /* synthetic */ a(Object obj, int i12) {
        this.f348a = i12;
        this.f349b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue;
        Object obj = this.f349b;
        switch (this.f348a) {
            case 0:
                int i12 = b.f350g;
                ((b) obj).invalidateSelf();
                return;
            case 1:
                int i13 = ShimmerLayout.f180517t;
                ShimmerLayout shimmerLayout = (ShimmerLayout) obj;
                shimmerLayout.f180519c = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                shimmerLayout.invalidate();
                return;
            case 2:
                int i14 = ScannerOverlay.f239281I;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ScannerOverlay scannerOverlay = (ScannerOverlay) obj;
                RectF rectF = scannerOverlay.f239293e;
                rectF.top = fFloatValue;
                float f12 = scannerOverlay.f239314z + fFloatValue;
                rectF.bottom = f12;
                RectF rectF2 = scannerOverlay.f239294f;
                float f13 = scannerOverlay.f239282A;
                rectF2.top = fFloatValue - f13;
                rectF2.bottom = f12 + f13;
                float f14 = scannerOverlay.f239298j - fFloatValue;
                Matrix matrix = scannerOverlay.f239297i;
                matrix.setTranslate(0.0f, -f14);
                scannerOverlay.f239287F.getShader().setLocalMatrix(matrix);
                scannerOverlay.invalidate();
                return;
            case 3:
                int i15 = GlowTextAnimationView.f161197e;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                GradientMaskTextView gradientMaskTextView = ((GlowTextAnimationView) obj).f161199c;
                gradientMaskTextView.f161201b = fFloatValue2;
                gradientMaskTextView.invalidate();
                return;
            case 4:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                TextView textView = ((p) obj).f113097d;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.height = iIntValue2;
                textView.setLayoutParams(layoutParams);
                return;
            case 5:
                int i16 = com.avito.android.candy.a.f114855o;
                ((com.avito.android.candy.a) obj).f114858d.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 6:
                int i17 = BadgeBarV3View.f153279n;
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BadgeBarV3View badgeBarV3View = (BadgeBarV3View) obj;
                badgeBarV3View.f153290j = fFloatValue3;
                badgeBarV3View.f153291k = 1.0f - fFloatValue3;
                badgeBarV3View.requestLayout();
                badgeBarV3View.invalidate();
                return;
            case 7:
                int i18 = s.f160019a0;
                int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ScrollView scrollView = ((s) obj).f160037R;
                scrollView.setPadding(scrollView.getPaddingLeft(), scrollView.getPaddingTop(), scrollView.getPaddingRight(), iIntValue3);
                return;
            case 8:
                n<Object>[] nVarArr = TextInputView.f178012o;
                Float f15 = (Float) valueAnimator.getAnimatedValue();
                f15.floatValue();
                j jVar = ((TextInputView) obj).f178014c;
                jVar.getClass();
                jVar.f178040d.setValue(jVar, j.f178036u[2], f15);
                return;
            case 9:
                AnimationView.b bVar = ((com.avito.android.lib.design.animation.d) obj).f178343e;
                if (bVar != null) {
                    bVar.a(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 10:
                int i19 = PageIndicatorRe23.f179906k;
                ImageView imageView = (ImageView) obj;
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                PageIndicatorRe23.a.C5291a c5291a = (PageIndicatorRe23.a.C5291a) valueAnimator.getAnimatedValue();
                marginLayoutParams.height = c5291a.f179920b;
                marginLayoutParams.width = c5291a.f179919a;
                marginLayoutParams.setMarginStart(c5291a.f179921c);
                imageView.setLayoutParams(marginLayoutParams);
                return;
            case 11:
                d.a aVar = com.avito.android.lib.design.tab_group.layout.d.f180758n;
                ((com.avito.android.lib.design.tab_group.layout.d) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            case 12:
                a.c cVar = com.avito.android.lib.design.text_view.a.f180919m;
                com.avito.android.lib.design.text_view.a aVar2 = (com.avito.android.lib.design.text_view.a) obj;
                ViewGroup.LayoutParams layoutParams3 = aVar2.getLayoutParams();
                aVar2.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                aVar2.setLayoutParams(layoutParams3);
                return;
            case 13:
                g gVar = (g) obj;
                if (gVar.f201963c.length() != 0 && (iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue()) < 4) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(gVar.f201963c);
                    for (int i22 = 0; i22 < iIntValue; i22++) {
                        sb2.append(".");
                    }
                    gVar.f201962b.setText(sb2.toString());
                    return;
                }
                return;
            case 14:
                int i23 = com.avito.android.pinch_to_zoom.c.f219969C;
                com.avito.android.pinch_to_zoom.c cVar2 = (com.avito.android.pinch_to_zoom.c) obj;
                cVar2.f219984m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar2.l();
                return;
            case 15:
                ((SegmentedControlRedesign) obj).f264973e.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                com.avito.android.select.group_clearance_select.n nVar = (com.avito.android.select.group_clearance_select.n) obj;
                nVar.f265539h.setTranslationY(fFloatValue4);
                nVar.f265541j = fFloatValue4;
                return;
            case 17:
                int i24 = com.avito.android.shortcut_navigation_bar.adapter.category_node.d.f283265e;
                int iIntValue4 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                float animatedFraction = valueAnimator.getAnimatedFraction();
                TextView textView2 = ((com.avito.android.shortcut_navigation_bar.adapter.category_node.d) obj).f283267c;
                textView2.getLayoutParams().width = iIntValue4;
                textView2.setAlpha(1 - animatedFraction);
                textView2.requestLayout();
                return;
            default:
                int i25 = h.f283275e;
                int iIntValue5 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                float animatedFraction2 = valueAnimator.getAnimatedFraction();
                TextView textView3 = ((h) obj).f283277c;
                textView3.getLayoutParams().width = iIntValue5;
                textView3.setAlpha(1 - animatedFraction2);
                textView3.requestLayout();
                return;
        }
    }
}
