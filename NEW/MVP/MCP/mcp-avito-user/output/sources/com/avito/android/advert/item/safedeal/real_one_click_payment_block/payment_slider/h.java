package com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.n;
import com.avito.android.util.C1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: PaymentSliderBackgroundView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/payment_slider/h;", "Landroid/widget/FrameLayout;", "", "text", "Lkotlin/G0;", "setDefaultText", "(Ljava/lang/String;)V", "", "offset", "setDefaultTextHorizontalOffset", "(I)V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f78962k = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f78963b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f78964c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f78965d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Drawable f78966e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public String f78967f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f78968g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public ObjectAnimator f78969h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Handler f78970i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f78971j;

    /* compiled from: PaymentSliderBackgroundView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a f78972b;

        public a(Y41.a aVar) {
            this.f78972b = aVar;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.f78972b.invoke();
        }
    }

    /* compiled from: PaymentSliderBackgroundView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ObjectAnimator objectAnimator = h.this.f78969h;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
            return G0.f406611a;
        }
    }

    public /* synthetic */ h(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }

    public final void a(float f12, float f13) {
        float fMin = ((f12 > 0.0f ? (Math.min(f12, f13) / f13) * 100 : 0.0f) * 255) / 100;
        Drawable drawable = this.f78966e;
        if (drawable == null) {
            return;
        }
        drawable.setAlpha((int) fMin);
    }

    public final void b() {
        C1.f318564a.getClass();
        if (C1.a() && this.f78968g) {
            c();
            n.b bVar = n.f78999d;
            TextView textView = this.f78964c;
            bVar.getClass();
            ObjectAnimator objectAnimatorA = n.b.a(textView);
            this.f78969h = objectAnimatorA;
            objectAnimatorA.addListener(new b());
            this.f78970i.postDelayed(new g(0, this.f78971j), 2000L);
        }
    }

    public final void c() {
        this.f78970i.removeCallbacksAndMessages(null);
        ObjectAnimator objectAnimator = this.f78969h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f78964c.setText(this.f78967f);
    }

    public final void setDefaultText(@Y61.k String text) {
        this.f78967f = text;
        this.f78964c.setText(text);
    }

    public final void setDefaultTextHorizontalOffset(int offset) {
        View view = this.f78963b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = offset;
        view.setLayoutParams(layoutParams);
    }

    @X41.j
    public h(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        Drawable drawableA = C43852a.a(context, R.drawable.safedeal_payment_slider_background_selector);
        Drawable drawableA2 = C43852a.a(context, R.drawable.safedeal_payment_slider_background_selector);
        this.f78966e = drawableA2;
        this.f78968g = true;
        this.f78970i = new Handler(Looper.getMainLooper());
        this.f78971j = new c();
        View viewInflate = View.inflate(context, R.layout.advert_details_safedeal_payment_slider_background, this);
        setBackground(drawableA);
        this.f78963b = viewInflate.findViewById(R.id.payment_block_slider_background_left_space);
        this.f78964c = (TextView) viewInflate.findViewById(R.id.payment_block_slider_background_text);
        View viewFindViewById = viewInflate.findViewById(R.id.payment_block_slider_background_text_overlay);
        viewFindViewById.setBackground(drawableA2);
        if (drawableA2 != null) {
            drawableA2.setAlpha(0);
        }
        this.f78965d = viewFindViewById;
    }

    /* compiled from: Animator.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "androidx/core/animation/j", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            h hVar = h.this;
            hVar.f78970i.postDelayed(new a(hVar.f78971j), 1500L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
