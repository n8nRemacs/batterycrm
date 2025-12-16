package com.avito.android.advertising.ui.buzzoola.premium;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: AdBuzzoolaPremiumV1View.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/premium/b;", "Landroidx/recyclerview/widget/RecyclerView$x;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends RecyclerView.x {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Rect f88628b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f88629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f88630d;

    public b(h hVar, GestureDetector gestureDetector) {
        this.f88629c = hVar;
        this.f88630d = gestureDetector;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x, androidx.recyclerview.widget.RecyclerView.q
    public final boolean b(@Y61.k RecyclerView recyclerView, @Y61.k MotionEvent motionEvent) {
        TextView textView = this.f88629c.f88642l;
        Rect rect = this.f88628b;
        textView.getHitRect(rect);
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x, androidx.recyclerview.widget.RecyclerView.q
    public final void g2(@Y61.k MotionEvent motionEvent) {
        this.f88630d.onTouchEvent(motionEvent);
    }
}
