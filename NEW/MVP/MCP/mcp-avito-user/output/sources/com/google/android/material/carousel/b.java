package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.C23434z;
import androidx.recyclerview.widget.RecyclerView;
import j.P;

/* compiled from: CarouselLayoutManager.java */
/* loaded from: classes6.dex */
class b extends C23434z {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f356150p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f356150p = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    @P
    public final PointF a(int i12) {
        if (this.f356150p.f356140w == null) {
            return null;
        }
        return new PointF(r0.F1(r1.f356166a, i12) - r0.f356135r, 0.0f);
    }

    @Override // androidx.recyclerview.widget.C23434z
    public final int h(View view, int i12) {
        CarouselLayoutManager carouselLayoutManager = this.f356150p;
        return (int) (carouselLayoutManager.f356135r - carouselLayoutManager.F1(carouselLayoutManager.f356140w.f356166a, RecyclerView.m.t0(view)));
    }
}
