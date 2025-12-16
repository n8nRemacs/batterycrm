package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.customview.widget.d;
import androidx.viewpager.widget.ViewPager;
import j.N;
import j.P;
import java.util.Set;

/* compiled from: ScrollableViewPager.java */
/* loaded from: classes7.dex */
public class o extends ViewPager implements com.yandex.div.internal.widget.h {

    /* renamed from: i0, reason: collision with root package name */
    public final com.yandex.div.internal.util.l f370497i0;

    /* renamed from: j0, reason: collision with root package name */
    @P
    public androidx.customview.widget.d f370498j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f370499k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f370500l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f370501m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f370502n0;

    /* renamed from: o0, reason: collision with root package name */
    @P
    public Set<Integer> f370503o0;

    /* renamed from: p0, reason: collision with root package name */
    @P
    public com.yandex.div.internal.widget.g f370504p0;

    /* compiled from: ScrollableViewPager.java */
    public class a extends d.c {
        public a() {
        }

        @Override // androidx.customview.widget.d.c
        public final void e(int i12, int i13) {
            boolean z12 = true;
            if ((i12 & 2) == 0 && (i12 & 1) == 0) {
                z12 = false;
            }
            o.this.f370501m0 = z12;
        }

        @Override // androidx.customview.widget.d.c
        public final boolean k(View view, int i12) {
            return false;
        }
    }

    public o(@N Context context) {
        super(context, null);
        this.f370497i0 = new com.yandex.div.internal.util.l(this, ViewConfiguration.get(getContext()).getScaledTouchSlop());
        this.f370499k0 = true;
        this.f370500l0 = true;
        this.f370501m0 = false;
        this.f370502n0 = false;
    }

    public final boolean B(@N MotionEvent motionEvent) {
        if (!this.f370500l0 && this.f370498j0 != null) {
            if ((motionEvent.getAction() & 255) == 0) {
                this.f370501m0 = false;
            }
            this.f370498j0.l(motionEvent);
        }
        Set<Integer> set = this.f370503o0;
        if (set != null) {
            this.f370502n0 = this.f370499k0 && set.contains(Integer.valueOf(getCurrentItem()));
        }
        return (this.f370501m0 || this.f370502n0 || !this.f370499k0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f370497i0.a(motionEvent);
        return zDispatchTouchEvent;
    }

    @P
    public com.yandex.div.internal.widget.g getOnInterceptTouchEventListener() {
        return this.f370504p0;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@N MotionEvent motionEvent) {
        com.yandex.div.internal.widget.g gVar = this.f370504p0;
        if (gVar != null) {
            gVar.a(this, motionEvent);
        }
        return B(motionEvent) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i12, int i13, int i14, int i15) {
        super.onScrollChanged(i12, i13, i14, i15);
        this.f370497i0.f370172b = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(@N MotionEvent motionEvent) {
        return B(motionEvent) && super.onTouchEvent(motionEvent);
    }

    public void setDisabledScrollPages(@P Set<Integer> set) {
        this.f370503o0 = set;
    }

    public void setEdgeScrollEnabled(boolean z12) {
        this.f370500l0 = z12;
        if (z12) {
            return;
        }
        androidx.customview.widget.d dVar = new androidx.customview.widget.d(getContext(), this, new a());
        this.f370498j0 = dVar;
        dVar.f45391q = 3;
    }

    public void setOnInterceptTouchEventListener(@P com.yandex.div.internal.widget.g gVar) {
        this.f370504p0 = gVar;
    }

    public void setScrollEnabled(boolean z12) {
        this.f370499k0 = z12;
    }
}
