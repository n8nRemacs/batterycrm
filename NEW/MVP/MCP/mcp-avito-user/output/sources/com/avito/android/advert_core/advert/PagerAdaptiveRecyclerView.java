package com.avito.android.advert_core.advert;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: PagerAdaptiveRecyclerView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert_core/advert/PagerAdaptiveRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PagerAdaptiveRecyclerView extends RecyclerView {

    /* renamed from: F0, reason: collision with root package name */
    public float f82660F0;

    /* renamed from: G0, reason: collision with root package name */
    public float f82661G0;

    /* renamed from: H0, reason: collision with root package name */
    public float f82662H0;

    /* renamed from: I0, reason: collision with root package name */
    public float f82663I0;

    public PagerAdaptiveRecyclerView(@Y61.k Context context, @Y61.k AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Y61.k MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f82660F0 = 0.0f;
            this.f82661G0 = 0.0f;
            this.f82662H0 = motionEvent.getX();
            this.f82663I0 = motionEvent.getY();
        } else if (action == 2) {
            float x12 = motionEvent.getX();
            float y12 = motionEvent.getY();
            this.f82660F0 = Math.abs(x12 - this.f82662H0) + this.f82660F0;
            float fAbs = Math.abs(y12 - this.f82663I0) + this.f82661G0;
            this.f82661G0 = fAbs;
            this.f82662H0 = x12;
            this.f82663I0 = y12;
            if (this.f82660F0 > fAbs) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
