package com.avito.android.lib.design.toast_bar;

import android.widget.FrameLayout;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToastBarViewBase.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f181116l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f181117m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, FrameLayout frameLayout) {
        super(0);
        this.f181116l = iVar;
        this.f181117m = frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // Y41.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke() {
        /*
            r5 = this;
            com.avito.android.lib.design.toast_bar.i r0 = r5.f181116l
            android.app.Activity r1 = com.avito.android.lib.design.toast_bar.i.a(r0)
            r2 = 0
            if (r1 == 0) goto L25
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L25
            com.avito.android.lib.util.i r3 = com.avito.android.lib.util.i.f181373a
            r3.getClass()
            android.view.View r1 = r1.getDecorView()
            androidx.core.view.J0 r1 = androidx.core.view.C22823h0.o(r1)
            if (r1 == 0) goto L25
            int r3 = com.avito.android.lib.util.i.f181375c
            androidx.core.graphics.k r1 = r1.e(r3)
            goto L26
        L25:
            r1 = r2
        L26:
            r0.f181086C = r1
            r1 = 0
            r0.setAlpha(r1)
            int r1 = r0.getTopMargin()
            float r1 = (float) r1
            r0.f181109x = r1
            float r1 = com.avito.android.lib.design.toast_bar.i.c(r0)
            r0.f181108w = r1
            r0.setY(r1)
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L4b
            android.view.ViewParent r1 = r0.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r0)
        L4b:
            android.app.Activity r1 = com.avito.android.lib.design.toast_bar.i.a(r0)
            if (r1 == 0) goto L5c
            android.app.Application r1 = r1.getApplication()
            if (r1 == 0) goto L5c
            com.avito.android.lib.design.toast_bar.i$d r3 = r0.f181085B
            r1.registerActivityLifecycleCallbacks(r3)
        L5c:
            android.widget.FrameLayout r1 = r5.f181117m
            android.widget.FrameLayout$LayoutParams r3 = com.avito.android.lib.design.toast_bar.i.b(r0)
            r1.addView(r0, r3)
            boolean r1 = r0.isSwipeEnabled
            if (r1 == 0) goto L6c
            r0.j()
        L6c:
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r1 = r1.alpha(r3)
            float r3 = r0.f181109x
            android.view.ViewPropertyAnimator r1 = r1.translationY(r3)
            r3 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
            r1.setListener(r2)
            int r1 = r0.getDuration()
            r2 = -1
            if (r1 == r2) goto L9a
            com.avito.android.lib.design.toast_bar.g r1 = new com.avito.android.lib.design.toast_bar.g
            r2 = 2
            r1.<init>(r0, r2)
            int r2 = r0.getDuration()
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
        L9a:
            kotlin.G0 r0 = kotlin.G0.f406611a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.toast_bar.j.invoke():java.lang.Object");
    }
}
