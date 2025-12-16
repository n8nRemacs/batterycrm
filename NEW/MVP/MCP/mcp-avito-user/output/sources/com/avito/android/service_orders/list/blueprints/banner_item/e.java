package com.avito.android.service_orders.list.blueprints.banner_item;

import Mu0.InterfaceC14531a;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersBannerItem;
import com.avito.android.service_orders.list.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrdersBannerPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f279263l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceOrdersBannerItem f279264m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ServiceOrdersBannerItem serviceOrdersBannerItem) {
        super(0);
        this.f279263l = fVar;
        this.f279264m = serviceOrdersBannerItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        l lVar = this.f279263l.f279265b;
        if (lVar != null) {
            lVar.f279388c.accept(new InterfaceC14531a.d(this.f279264m));
        }
        return G0.f406611a;
    }
}
