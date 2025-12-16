package com.avito.android.comparison;

import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: GestureProxyView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/p;", "Landroidx/constraintlayout/motion/widget/MotionLayout$j;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p implements MotionLayout.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestureProxyView f124187b;

    public p(GestureProxyView gestureProxyView) {
        this.f124187b = gestureProxyView;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.j
    public final void a(int i12) {
        RecyclerView recyclerView = this.f124187b.bodyRecycler;
        recyclerView.J0();
        recyclerView.A0(0);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.j
    public final void b() {
        RecyclerView recyclerView = this.f124187b.bodyRecycler;
        recyclerView.J0();
        recyclerView.A0(0);
    }
}
