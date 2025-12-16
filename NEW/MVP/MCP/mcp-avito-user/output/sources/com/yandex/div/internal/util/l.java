package com.yandex.div.internal.util;

import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.view.C22823h0;
import androidx.viewpager.widget.ViewPager;
import j.N;
import j.k0;

/* compiled from: NestedHorizontalScrollCompanion.java */
/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f370171a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f370172b;

    /* renamed from: c, reason: collision with root package name */
    public final float f370173c;

    /* renamed from: d, reason: collision with root package name */
    public float f370174d;

    /* renamed from: e, reason: collision with root package name */
    public float f370175e;

    /* compiled from: NestedHorizontalScrollCompanion.java */
    public class b extends ViewPager.l {

        /* renamed from: b, reason: collision with root package name */
        public final ViewPager f370176b;

        /* renamed from: c, reason: collision with root package name */
        public int f370177c = -1;

        /* renamed from: d, reason: collision with root package name */
        public float f370178d;

        public b(ViewPager viewPager, a aVar) {
            this.f370176b = viewPager;
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public final void c(int i12) {
            this.f370177c = i12;
            if (i12 == 0) {
                this.f370178d = -1.0f;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public final void h(int i12, float f12, int i13) {
            boolean z12 = i12 == this.f370176b.getAdapter().c() - 1;
            if ((i12 == 0 || z12) && this.f370177c == 1 && this.f370178d == 0.0f && f12 == 0.0f) {
                l lVar = l.this;
                if (lVar.f370172b) {
                    C22823h0.d(lVar.f370171a);
                }
            }
            this.f370178d = f12;
        }
    }

    @k0
    public l(@N ViewGroup viewGroup, float f12) {
        this.f370171a = viewGroup;
        C22823h0.J(viewGroup, true);
        this.f370173c = f12;
    }

    public final void a(@N MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f370174d = motionEvent.getX();
            this.f370175e = motionEvent.getY();
            return;
        }
        ViewGroup viewGroup = this.f370171a;
        if (action != 1) {
            if (action == 2) {
                float fAbs = Math.abs(motionEvent.getX() - this.f370174d);
                float fAbs2 = Math.abs(motionEvent.getY() - this.f370175e);
                if (this.f370172b || fAbs < this.f370173c || fAbs <= fAbs2) {
                    return;
                }
                this.f370172b = true;
                C22823h0.T(viewGroup);
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.f370172b = false;
        C22823h0.U(viewGroup);
    }
}
