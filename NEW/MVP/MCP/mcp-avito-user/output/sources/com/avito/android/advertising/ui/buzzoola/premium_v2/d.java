package com.avito.android.advertising.ui.buzzoola.premium_v2;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: BuzzoolaPremiumV2View.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/premium_v2/d;", "Landroidx/recyclerview/widget/RecyclerView$x;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends RecyclerView.x {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Rect f88680b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f88681c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f88682d;

    public d(j jVar, GestureDetector gestureDetector) {
        this.f88681c = jVar;
        this.f88682d = gestureDetector;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x, androidx.recyclerview.widget.RecyclerView.q
    public final boolean b(@Y61.k RecyclerView recyclerView, @Y61.k MotionEvent motionEvent) {
        TextView textView = this.f88681c.f88696n;
        Rect rect = this.f88680b;
        textView.getHitRect(rect);
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x, androidx.recyclerview.widget.RecyclerView.q
    public final void g2(@Y61.k MotionEvent motionEvent) {
        this.f88682d.onTouchEvent(motionEvent);
    }
}
