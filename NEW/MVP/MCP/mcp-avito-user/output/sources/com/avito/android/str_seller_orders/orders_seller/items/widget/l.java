package com.avito.android.str_seller_orders.orders_seller.items.widget;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f289520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f289521c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f289522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f289523e;

    public l(View view, View view2, View view3, k kVar) {
        this.f289520b = view;
        this.f289521c = view2;
        this.f289522d = view3;
        this.f289523e = kVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        View view2 = this.f289521c;
        int measuredHeight = view2.getMeasuredHeight();
        View view3 = this.f289522d;
        int iMax = Math.max(measuredHeight, view3.getMeasuredHeight());
        int i22 = k.f289516c;
        this.f289523e.getClass();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.height = iMax;
        view2.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
        layoutParams2.height = iMax;
        view3.setLayoutParams(layoutParams2);
        this.f289520b.removeOnLayoutChangeListener(this);
    }
}
