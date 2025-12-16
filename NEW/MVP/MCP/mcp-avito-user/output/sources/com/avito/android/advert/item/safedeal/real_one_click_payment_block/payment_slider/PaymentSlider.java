package com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaymentSlider.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/payment_slider/PaymentSlider;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/payment_slider/o;", "listener", "Lkotlin/G0;", "setPaymentListener", "(Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/payment_slider/o;)V", "", "text", "setPriceText", "(Ljava/lang/String;)V", "setProgressText", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PaymentSlider extends FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f78944i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f78945b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h f78946c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final k f78947d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final l f78948e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public o f78949f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f78950g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final GestureDetector f78951h;

    @X41.j
    public PaymentSlider(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@Y61.k View view, int i12) {
        super.onVisibilityChanged(view, i12);
        h hVar = this.f78946c;
        k kVar = this.f78947d;
        if (i12 == 0) {
            kVar.c();
            hVar.b();
        } else {
            kVar.d();
            hVar.c();
        }
    }

    public final void setPaymentListener(@Y61.l o listener) {
        this.f78949f = listener;
    }

    public final void setPriceText(@Y61.k String text) {
        this.f78946c.setDefaultText(text);
    }

    public final void setProgressText(@Y61.k String text) {
        this.f78948e.setProgressText(text);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaymentSlider(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12, i13);
        this.f78945b = 70;
        int iB2 = y6.b(4);
        this.f78951h = new GestureDetector(context, new d(this));
        k kVar = new k(context, attributeSet, i12, i13);
        this.f78947d = kVar;
        h hVar = new h(context, attributeSet, i12, i13);
        hVar.setDefaultTextHorizontalOffset(kVar.getF78980b() + iB2);
        this.f78946c = hVar;
        l lVar = new l(context, attributeSet, i12, i13);
        lVar.setVisibility(8);
        this.f78948e = lVar;
        addView(hVar);
        addView(kVar);
        addView(lVar);
        kVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                final int i15 = 2;
                char c12 = 1;
                final int i16 = 0;
                final PaymentSlider paymentSlider = this.f78952b;
                paymentSlider.f78951h.onTouchEvent(motionEvent);
                int action = motionEvent.getAction();
                h hVar2 = paymentSlider.f78946c;
                k kVar2 = paymentSlider.f78947d;
                if (action == 0) {
                    boolean z12 = motionEvent.getX() <= view.getX() + ((float) view.getWidth());
                    if (!z12) {
                        return z12;
                    }
                    kVar2.d();
                    hVar2.c();
                    return z12;
                }
                if (action != 1) {
                    if (action != 2) {
                        return false;
                    }
                    if (motionEvent.getX() > kVar2.getX() + paymentSlider.getWidth()) {
                        kVar2.b(paymentSlider.getWidth());
                        hVar2.a(paymentSlider.getWidth(), paymentSlider.getWidth());
                    } else if (motionEvent.getX() > kVar2.getX() + kVar2.getWidth()) {
                        kVar2.b((int) motionEvent.getX());
                        hVar2.a(motionEvent.getX(), paymentSlider.getWidth());
                    } else if (motionEvent.getX() < kVar2.getX() + paymentSlider.getWidth() && motionEvent.getX() > kVar2.getX() + kVar2.getF78980b()) {
                        kVar2.b((int) motionEvent.getX());
                        hVar2.a(motionEvent.getX(), paymentSlider.getWidth());
                    } else if (motionEvent.getX() < kVar2.getWidth()) {
                        kVar2.b(kVar2.f78980b);
                        hVar2.a(0.0f, paymentSlider.getWidth());
                    }
                    if (paymentSlider.f78950g) {
                        return true;
                    }
                    paymentSlider.f78950g = true;
                    o oVar = paymentSlider.f78949f;
                    if (oVar == null) {
                        return true;
                    }
                    oVar.rH();
                    return true;
                }
                if (kVar2.getX() + kVar2.getWidth() > (paymentSlider.getWidth() * paymentSlider.f78945b) / 100) {
                    kVar2.f78982d = false;
                    hVar2.f78968g = false;
                    if (Build.VERSION.SDK_INT >= 30) {
                        kVar2.performHapticFeedback(16);
                    }
                    final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(kVar2.getWidth(), paymentSlider.getWidth());
                    valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.b
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            PaymentSlider paymentSlider2 = paymentSlider;
                            ValueAnimator valueAnimator2 = valueAnimatorOfInt;
                            switch (i15) {
                                case 0:
                                    int i17 = PaymentSlider.f78944i;
                                    paymentSlider2.f78947d.b(((Integer) valueAnimator2.getAnimatedValue()).intValue());
                                    break;
                                case 1:
                                    int i18 = PaymentSlider.f78944i;
                                    paymentSlider2.f78946c.a(((Float) valueAnimator2.getAnimatedValue()).floatValue(), paymentSlider2.getWidth());
                                    break;
                                default:
                                    int i19 = PaymentSlider.f78944i;
                                    paymentSlider2.f78947d.b(((Integer) valueAnimator2.getAnimatedValue()).intValue());
                                    break;
                            }
                        }
                    });
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.addListener(new e(paymentSlider));
                    animatorSet.playTogether(valueAnimatorOfInt);
                    animatorSet.start();
                } else {
                    c cVar = new c(paymentSlider);
                    final ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(kVar2.getWidth(), kVar2.getF78980b());
                    valueAnimatorOfInt2.setInterpolator(new AccelerateDecelerateInterpolator());
                    valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.b
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            PaymentSlider paymentSlider2 = paymentSlider;
                            ValueAnimator valueAnimator2 = valueAnimatorOfInt2;
                            switch (i16) {
                                case 0:
                                    int i17 = PaymentSlider.f78944i;
                                    paymentSlider2.f78947d.b(((Integer) valueAnimator2.getAnimatedValue()).intValue());
                                    break;
                                case 1:
                                    int i18 = PaymentSlider.f78944i;
                                    paymentSlider2.f78946c.a(((Float) valueAnimator2.getAnimatedValue()).floatValue(), paymentSlider2.getWidth());
                                    break;
                                default:
                                    int i19 = PaymentSlider.f78944i;
                                    paymentSlider2.f78947d.b(((Integer) valueAnimator2.getAnimatedValue()).intValue());
                                    break;
                            }
                        }
                    });
                    final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(kVar2.getWidth(), 0.0f);
                    final char c13 = c12 == true ? 1 : 0;
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.b
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            PaymentSlider paymentSlider2 = paymentSlider;
                            ValueAnimator valueAnimator2 = valueAnimatorOfFloat;
                            switch (c13) {
                                case 0:
                                    int i17 = PaymentSlider.f78944i;
                                    paymentSlider2.f78947d.b(((Integer) valueAnimator2.getAnimatedValue()).intValue());
                                    break;
                                case 1:
                                    int i18 = PaymentSlider.f78944i;
                                    paymentSlider2.f78946c.a(((Float) valueAnimator2.getAnimatedValue()).floatValue(), paymentSlider2.getWidth());
                                    break;
                                default:
                                    int i19 = PaymentSlider.f78944i;
                                    paymentSlider2.f78947d.b(((Integer) valueAnimator2.getAnimatedValue()).intValue());
                                    break;
                            }
                        }
                    });
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.addListener(new f(cVar));
                    animatorSet2.playTogether(valueAnimatorOfInt2, valueAnimatorOfFloat);
                    animatorSet2.start();
                }
                paymentSlider.f78950g = false;
                return true;
            }
        });
    }
}
