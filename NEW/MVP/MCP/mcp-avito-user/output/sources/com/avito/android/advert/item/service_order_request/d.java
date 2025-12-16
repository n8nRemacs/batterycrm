package com.avito.android.advert.item.service_order_request;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.service_order_request.ServiceOrderRequestItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.service_order.ServiceOrder;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrderRequestItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/service_order_request/d;", "Lcom/avito/android/advert/item/service_order_request/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements com.avito.android.advert.item.service_order_request.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n f79888b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final W6.a f79889c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public y f79890d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f79891e;

    /* compiled from: ServiceOrderRequestItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f79892l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ServiceOrderRequestItem f79893m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ServiceOrderRequestItem serviceOrderRequestItem, d dVar) {
            super(0);
            this.f79892l = dVar;
            this.f79893m = serviceOrderRequestItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            n nVar = this.f79892l.f79888b;
            ServiceOrderRequestItem.Action action = this.f79893m.f79871d;
            nVar.a(action.f79880b, action.f79881c);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrderRequestItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ServiceOrderRequestItem f79894l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f79895m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ServiceOrderRequestItem serviceOrderRequestItem, d dVar) {
            super(0);
            this.f79894l = serviceOrderRequestItem;
            this.f79895m = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ServiceOrderRequestItem.Action action = this.f79894l.f79872e;
            if (action != null) {
                this.f79895m.f79888b.a(action.f79880b, action.f79881c);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrderRequestItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<DeepLink, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            d.this.f79888b.b(deepLink);
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k n nVar, @Y61.k W6.a aVar) {
        this.f79888b = nVar;
        this.f79889c = aVar;
        this.f79891e = !aVar.a();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        ServiceOrderRequestItem serviceOrderRequestItem = (ServiceOrderRequestItem) aVar;
        k(jVar, serviceOrderRequestItem);
        y yVar = this.f79890d;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f79890d = (y) this.f79888b.c().t0(new h(this, jVar, serviceOrderRequestItem));
    }

    public final void k(j jVar, ServiceOrderRequestItem serviceOrderRequestItem) {
        ServiceOrder.Tooltip tooltip;
        jVar.er(serviceOrderRequestItem, new a(serviceOrderRequestItem, this), new b(serviceOrderRequestItem, this), new c());
        if (!this.f79891e || (tooltip = serviceOrderRequestItem.f79874g) == null) {
            return;
        }
        jVar.G20(tooltip.getTitle(), tooltip.getBody());
        this.f79889c.b();
        this.f79891e = false;
    }
}
