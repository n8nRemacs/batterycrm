package com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import androidx.dynamicanimation.animation.c;
import com.avito.android.R;
import com.avito.android.util.C1;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import m.C43852a;

/* compiled from: PaymentSliderButtonView.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/payment_slider/k;", "Landroid/widget/FrameLayout;", "", "getButtonAnimateRightPosition", "()F", "", "getInitialWidth", "()I", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends FrameLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f78979j = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f78980b;

    /* renamed from: c, reason: collision with root package name */
    public final int f78981c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f78982d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public androidx.dynamicanimation.animation.i f78983e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public androidx.dynamicanimation.animation.i f78984f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Handler f78985g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f78986h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f78987i;

    /* compiled from: PaymentSliderButtonView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            k kVar = k.this;
            androidx.dynamicanimation.animation.i iVar = kVar.f78984f;
            if (iVar != null) {
                iVar.j();
            }
            androidx.dynamicanimation.animation.i iVar2 = kVar.f78983e;
            if (iVar2 != null) {
                iVar2.f46032b = kVar.getF78980b();
                iVar2.f46033c = true;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentSliderButtonView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            k kVar = k.this;
            androidx.dynamicanimation.animation.i iVar = kVar.f78983e;
            if (iVar != null) {
                iVar.j();
            }
            androidx.dynamicanimation.animation.i iVar2 = kVar.f78984f;
            if (iVar2 != null) {
                iVar2.f46032b = kVar.getButtonAnimateRightPosition();
                iVar2.f46033c = true;
            }
            return G0.f406611a;
        }
    }

    public /* synthetic */ k(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getButtonAnimateRightPosition() {
        return (this.f78981c / 2) + getF78980b();
    }

    public final void b(int i12) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i12;
        setLayoutParams(layoutParams);
    }

    public final void c() {
        C1.f318564a.getClass();
        if (C1.a() && this.f78982d) {
            d();
            androidx.dynamicanimation.animation.i iVar = new androidx.dynamicanimation.animation.i(new androidx.dynamicanimation.animation.g(getF78980b()));
            androidx.dynamicanimation.animation.j jVar = new androidx.dynamicanimation.animation.j();
            jVar.b(600.0f);
            jVar.a(0.15f);
            jVar.f46058i = getButtonAnimateRightPosition();
            iVar.f46047t = jVar;
            final int i12 = 1;
            iVar.c(new c.r(this) { // from class: com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.j

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f78978b;

                {
                    this.f78978b = this;
                }

                @Override // androidx.dynamicanimation.animation.c.r
                public final void a(float f12) {
                    k kVar = this.f78978b;
                    switch (i12) {
                        case 0:
                            int i13 = k.f78979j;
                            kVar.b((int) f12);
                            break;
                        default:
                            int i14 = k.f78979j;
                            kVar.b((int) f12);
                            break;
                    }
                }
            });
            this.f78983e = iVar;
            androidx.dynamicanimation.animation.i iVar2 = new androidx.dynamicanimation.animation.i(new androidx.dynamicanimation.animation.g(getButtonAnimateRightPosition()));
            androidx.dynamicanimation.animation.j jVar2 = new androidx.dynamicanimation.animation.j();
            jVar2.b(480.0f);
            jVar2.a(0.26f);
            jVar2.f46058i = getF78980b();
            iVar2.f46047t = jVar2;
            final int i13 = 0;
            iVar2.c(new c.r(this) { // from class: com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.j

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f78978b;

                {
                    this.f78978b = this;
                }

                @Override // androidx.dynamicanimation.animation.c.r
                public final void a(float f12) {
                    k kVar = this.f78978b;
                    switch (i13) {
                        case 0:
                            int i132 = k.f78979j;
                            kVar.b((int) f12);
                            break;
                        default:
                            int i14 = k.f78979j;
                            kVar.b((int) f12);
                            break;
                    }
                }
            });
            this.f78984f = iVar2;
            androidx.dynamicanimation.animation.i iVar3 = this.f78983e;
            if (iVar3 != null) {
                final int i14 = 0;
                iVar3.b(new c.q(this) { // from class: com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.i

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ k f78976b;

                    {
                        this.f78976b = this;
                    }

                    @Override // androidx.dynamicanimation.animation.c.q
                    public final void a(androidx.dynamicanimation.animation.c cVar, boolean z12, float f12, float f13) {
                        k kVar = this.f78976b;
                        switch (i14) {
                            case 0:
                                if (!z12) {
                                    kVar.f78985g.postDelayed(new g(3, kVar.f78987i), 1000L);
                                    break;
                                } else {
                                    int i15 = k.f78979j;
                                    break;
                                }
                            default:
                                if (!z12) {
                                    kVar.f78985g.postDelayed(new g(2, kVar.f78986h), 1000L);
                                    break;
                                } else {
                                    int i16 = k.f78979j;
                                    break;
                                }
                        }
                    }
                });
            }
            androidx.dynamicanimation.animation.i iVar4 = this.f78984f;
            if (iVar4 != null) {
                final int i15 = 1;
                iVar4.b(new c.q(this) { // from class: com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider.i

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ k f78976b;

                    {
                        this.f78976b = this;
                    }

                    @Override // androidx.dynamicanimation.animation.c.q
                    public final void a(androidx.dynamicanimation.animation.c cVar, boolean z12, float f12, float f13) {
                        k kVar = this.f78976b;
                        switch (i15) {
                            case 0:
                                if (!z12) {
                                    kVar.f78985g.postDelayed(new g(3, kVar.f78987i), 1000L);
                                    break;
                                } else {
                                    int i152 = k.f78979j;
                                    break;
                                }
                            default:
                                if (!z12) {
                                    kVar.f78985g.postDelayed(new g(2, kVar.f78986h), 1000L);
                                    break;
                                } else {
                                    int i16 = k.f78979j;
                                    break;
                                }
                        }
                    }
                });
            }
            this.f78985g.postDelayed(new g(1, this.f78986h), 2000L);
        }
    }

    public final void d() {
        this.f78985g.removeCallbacksAndMessages(null);
        androidx.dynamicanimation.animation.i iVar = this.f78983e;
        if (iVar != null) {
            iVar.d();
        }
        androidx.dynamicanimation.animation.i iVar2 = this.f78984f;
        if (iVar2 != null) {
            iVar2.d();
        }
    }

    /* renamed from: getInitialWidth, reason: from getter */
    public final int getF78980b() {
        return this.f78980b;
    }

    @X41.j
    public k(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        int iB2 = y6.b(52);
        this.f78980b = iB2;
        int iB3 = y6.b(20);
        int iB4 = y6.b(16);
        this.f78981c = iB4;
        this.f78982d = true;
        this.f78985g = new Handler(Looper.getMainLooper());
        this.f78986h = new b();
        this.f78987i = new a();
        setLayoutParams(new FrameLayout.LayoutParams(iB2, iB2));
        setBackground(C43852a.a(context, R.drawable.safedeal_payment_slider_button_background_selector));
        ImageView imageView = new ImageView(context, attributeSet, i12, i13);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iB3, iB3);
        layoutParams.setMarginEnd(iB4);
        layoutParams.gravity = 8388629;
        imageView.setImageDrawable(C35835l0.m(context, R.attr.ic_arrowRight20, R.attr.constantWhite));
        addView(imageView, layoutParams);
    }
}
