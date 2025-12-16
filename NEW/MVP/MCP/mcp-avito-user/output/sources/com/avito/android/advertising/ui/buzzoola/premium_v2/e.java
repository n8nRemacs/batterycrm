package com.avito.android.advertising.ui.buzzoola.premium_v2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Metadata;

/* compiled from: BuzzoolaPremiumV2View.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/premium_v2/e;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f88683b;

    public e(j jVar) {
        this.f88683b = jVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(@Y61.k MotionEvent motionEvent) {
        this.f88683b.f88696n.performClick();
        return true;
    }
}
