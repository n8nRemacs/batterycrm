package com.avito.android.serp.adapter.slider.sales_slider;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Metadata;

/* compiled from: SalesSlider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/slider/sales_slider/e;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SalesSlider f272306b;

    public e(SalesSlider salesSlider) {
        this.f272306b = salesSlider;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(@Y61.k MotionEvent motionEvent) {
        SalesSlider salesSlider = this.f272306b;
        if (salesSlider.f272293k) {
            return false;
        }
        o oVar = salesSlider.f272291i;
        if (oVar != null) {
            oVar.vk();
        }
        salesSlider.f272293k = true;
        return true;
    }
}
