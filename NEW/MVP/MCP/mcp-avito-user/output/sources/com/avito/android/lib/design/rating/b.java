package com.avito.android.lib.design.rating;

import Y61.k;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.avito.android.lib.design.rating.RatingBar;
import kotlin.Metadata;

/* compiled from: RatingBar.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/rating/b;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RatingBar f180171b;

    public b(RatingBar ratingBar) {
        this.f180171b = ratingBar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(@k MotionEvent motionEvent) {
        RatingBar ratingBar = this.f180171b;
        RatingBar.a aVar = ratingBar.listener;
        if (aVar == null) {
            return true;
        }
        aVar.a((int) ratingBar.rating);
        return true;
    }
}
