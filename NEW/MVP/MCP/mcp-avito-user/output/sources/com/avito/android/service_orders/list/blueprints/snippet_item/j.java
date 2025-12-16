package com.avito.android.service_orders.list.blueprints.snippet_item;

import com.avito.android.service_orders.list.blueprints.ServiceOrdersListSnippetItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrdersListSnippetPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/ServiceOrdersListSnippetItem$a;", "contact", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/service_orders/list/blueprints/ServiceOrdersListSnippetItem$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class j extends N implements Y41.l<ServiceOrdersListSnippetItem.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f279348l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceOrdersListSnippetItem f279349m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ServiceOrdersListSnippetItem serviceOrdersListSnippetItem, k kVar) {
        super(1);
        this.f279348l = kVar;
        this.f279349m = serviceOrdersListSnippetItem;
    }

    @Override // Y41.l
    public final G0 invoke(ServiceOrdersListSnippetItem.a aVar) {
        ServiceOrdersListSnippetItem.a aVar2 = aVar;
        com.avito.android.service_orders.list.l lVar = this.f279348l.f279350b;
        if (lVar != null) {
            lVar.d(this.f279349m.f279231d, aVar2);
        }
        return G0.f406611a;
    }
}
