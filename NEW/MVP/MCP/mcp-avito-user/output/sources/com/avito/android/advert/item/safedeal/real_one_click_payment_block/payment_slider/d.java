package com.avito.android.advert.item.safedeal.real_one_click_payment_block.payment_slider;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Metadata;

/* compiled from: PaymentSlider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/payment_slider/d;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentSlider f78957b;

    public d(PaymentSlider paymentSlider) {
        this.f78957b = paymentSlider;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(@Y61.k MotionEvent motionEvent) {
        o oVar = this.f78957b.f78949f;
        if (oVar == null) {
            return false;
        }
        oVar.ED();
        return false;
    }
}
