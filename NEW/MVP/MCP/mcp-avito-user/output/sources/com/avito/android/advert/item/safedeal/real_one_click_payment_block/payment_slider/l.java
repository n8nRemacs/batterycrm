package com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: PaymentSliderForegroundView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/payment_slider/l;", "Landroid/widget/FrameLayout;", "", "text", "Lkotlin/G0;", "setProgressText", "(Ljava/lang/String;)V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f78990g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f78991b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f78992c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public ObjectAnimator f78993d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Handler f78994e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f78995f;

    /* compiled from: PaymentSliderForegroundView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ObjectAnimator objectAnimator = l.this.f78993d;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentSliderForegroundView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a f78997b;

        public b(Y41.a aVar) {
            this.f78997b = aVar;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.f78997b.invoke();
        }
    }

    public /* synthetic */ l(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }

    public final void setProgressText(@Y61.k String text) {
        this.f78992c = text;
        this.f78991b.setText(text);
    }

    @X41.j
    public l(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.f78994e = new Handler(Looper.getMainLooper());
        this.f78995f = new a();
        this.f78991b = (TextView) View.inflate(context, R.layout.advert_details_safedeal_payment_slider_foreground, this).findViewById(R.id.payment_block_slider_foreground_text);
        setBackground(C43852a.a(context, R.drawable.safedeal_payment_slider_button_background_selector));
    }
}
