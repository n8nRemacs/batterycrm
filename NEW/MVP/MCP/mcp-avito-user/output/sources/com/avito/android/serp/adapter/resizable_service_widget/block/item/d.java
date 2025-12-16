package com.avito.android.serp.adapter.resizable_service_widget.block.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.di.B;
import com.avito.android.serp.analytics.widgets_tracker.g;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: ResizableServiceWidgetBlockPresenter.kt */
@B
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/resizable_service_widget/block/item/d;", "LTV0/d;", "Lcom/avito/android/serp/adapter/resizable_service_widget/block/item/f;", "Lcom/avito/android/serp/adapter/resizable_service_widget/block/item/ResizableServiceWidgetBlockItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements TV0.d<f, ResizableServiceWidgetBlockItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.serp.adapter.resizable_service_widget.row.item.e f270715b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f270716c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g f270717d;

    @Inject
    public d(@k com.avito.android.serp.adapter.resizable_service_widget.row.item.e eVar, @k h31.e<InterfaceC47690b> eVar2, @k g gVar) {
        this.f270715b = eVar;
        this.f270716c = eVar2;
        this.f270717d = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        ResizableServiceWidgetBlockItem resizableServiceWidgetBlockItem = (ResizableServiceWidgetBlockItem) aVar;
        ArrayList arrayList = fVar.f270723d;
        arrayList.clear();
        arrayList.addAll(resizableServiceWidgetBlockItem.f270698d);
        fVar.f270721b.c(fVar.f270724e);
        fVar.f270722c.notifyDataSetChanged();
        this.f270715b.f270745b = new c(this, i12, resizableServiceWidgetBlockItem);
    }
}
