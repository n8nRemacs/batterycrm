package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.SizeInfo;
import java.util.ArrayList;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;

/* loaded from: classes8.dex */
public final class fj1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private static final InterfaceC42726C f385383a = C42727D.c(a.f385384a);

    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Handler> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f385384a = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @X41.n
    public static final void a(@Y61.l ViewGroup viewGroup, boolean z12) {
        ((Handler) f385383a.getValue()).post(new D.b(15, viewGroup, z12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ViewGroup viewGroup, View view, Context context, SizeInfo sizeInfo, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewGroup == null || viewGroup.indexOfChild(view) != -1) {
            return;
        }
        RelativeLayout.LayoutParams layoutParamsA = z5.a(context, sizeInfo);
        view.setVisibility(0);
        viewGroup.addView(view, layoutParamsA);
        if (onPreDrawListener != null) {
            rj1.a(view, onPreDrawListener);
        }
    }

    @X41.n
    public static final void a(@Y61.l ViewGroup viewGroup, @Y61.k View view, @Y61.k Context context, @Y61.l SizeInfo sizeInfo, @Y61.l ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        ((Handler) f385383a.getValue()).post(new S0(viewGroup, view, context, sizeInfo, onPreDrawListener, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ViewGroup viewGroup, boolean z12) {
        int childCount;
        if (viewGroup == null || viewGroup.getChildCount() <= 0 || (childCount = viewGroup.getChildCount() - (!z12 ? 1 : 0)) <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(childCount);
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            if (childAt instanceof jf) {
                arrayList.add(childAt);
            }
        }
        viewGroup.removeViews(0, childCount);
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((jf) arrayList.get(i13)).e();
        }
        arrayList.clear();
    }
}
