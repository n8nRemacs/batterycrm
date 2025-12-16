package com.avito.android.str_seller_orders_calendar.utils;

import Y61.k;
import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.C23434z;
import kotlin.Metadata;

/* compiled from: DynamicScrollGridLayoutManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/utils/b;", "Landroidx/recyclerview/widget/z;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends C23434z {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ DynamicScrollGridLayoutManager f291213p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DynamicScrollGridLayoutManager dynamicScrollGridLayoutManager, Context context) {
        super(context);
        this.f291213p = dynamicScrollGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    @k
    public final PointF a(int i12) {
        int i13 = DynamicScrollGridLayoutManager.f291191B;
        DynamicScrollGridLayoutManager dynamicScrollGridLayoutManager = this.f291213p;
        return new PointF((dynamicScrollGridLayoutManager.A1(i12) - dynamicScrollGridLayoutManager.A1(dynamicScrollGridLayoutManager.f291194s)) * dynamicScrollGridLayoutManager.f291195t, (dynamicScrollGridLayoutManager.B1(i12) - dynamicScrollGridLayoutManager.B1(dynamicScrollGridLayoutManager.f291194s)) * dynamicScrollGridLayoutManager.f291196u);
    }
}
