package com.avito.android.photo_gallery.ui;

import android.view.MotionEvent;
import android.widget.ScrollView;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: PagerAdaptiveScrollView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/ui/j;", "Landroid/widget/ScrollView;", "LR70/e;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j extends ScrollView implements R70.e {

    /* renamed from: b, reason: collision with root package name */
    public float f217718b;

    /* renamed from: c, reason: collision with root package name */
    public float f217719c;

    /* renamed from: d, reason: collision with root package name */
    public float f217720d;

    /* renamed from: e, reason: collision with root package name */
    public float f217721e;

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Y61.k MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f217718b = 0.0f;
            this.f217719c = 0.0f;
            this.f217720d = motionEvent.getX();
            this.f217721e = motionEvent.getY();
        } else if (action == 2) {
            float x12 = motionEvent.getX();
            float y12 = motionEvent.getY();
            this.f217718b = Math.abs(x12 - this.f217720d) + this.f217718b;
            float fAbs = Math.abs(y12 - this.f217721e) + this.f217719c;
            this.f217719c = fAbs;
            this.f217720d = x12;
            this.f217721e = y12;
            if (this.f217718b > fAbs) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i12, int i13, int i14, int i15) {
        super.onScrollChanged(i12, i13, i14, i15);
        throw null;
    }
}
