package com.avito.android.serp.adapter.resizable_service_widget.block.item;

import Y41.l;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.adapter.resizable_service_widget.row.item.ResizableServiceWidgetRowListItem;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47691c;

/* compiled from: ResizableServiceWidgetBlockPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/resizable_service_widget/row/item/ResizableServiceWidgetRowListItem;", "rowListItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/serp/adapter/resizable_service_widget/row/item/ResizableServiceWidgetRowListItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c extends N implements l<ResizableServiceWidgetRowListItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f270712l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f270713m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ResizableServiceWidgetBlockItem f270714n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, int i12, ResizableServiceWidgetBlockItem resizableServiceWidgetBlockItem) {
        super(1);
        this.f270712l = dVar;
        this.f270713m = i12;
        this.f270714n = resizableServiceWidgetBlockItem;
    }

    @Override // Y41.l
    public final G0 invoke(ResizableServiceWidgetRowListItem resizableServiceWidgetRowListItem) {
        ResizableServiceWidgetRowListItem resizableServiceWidgetRowListItem2 = resizableServiceWidgetRowListItem;
        d dVar = this.f270712l;
        Integer numValueOf = Integer.valueOf(this.f270713m);
        Analytics analytics = this.f270714n.f270699e;
        d.a.a(dVar.f270717d, numValueOf, "services_widget", resizableServiceWidgetRowListItem2.f270735d, null, null, null, null, analytics, 120);
        InterfaceC47691c.a.a(dVar.f270716c.get(), resizableServiceWidgetRowListItem2.f270740i, null, 14);
        return G0.f406611a;
    }
}
