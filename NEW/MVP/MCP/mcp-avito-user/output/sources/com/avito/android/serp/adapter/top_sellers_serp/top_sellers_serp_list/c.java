package com.avito.android.serp.adapter.top_sellers_serp.top_sellers_serp_list;

import com.avito.android.analytics.event.C28450y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47691c;

/* compiled from: TopSellerSerpPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f272495l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TopSellerSerpItem f272496m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, TopSellerSerpItem topSellerSerpItem) {
        super(0);
        this.f272495l = dVar;
        this.f272496m = topSellerSerpItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f272495l;
        TopSellerSerpItem topSellerSerpItem = this.f272496m;
        dVar.f272498c.c(new C28450y(dVar.f272499d.a(), topSellerSerpItem.f272487c));
        InterfaceC47691c.a.a(dVar.f272497b.get(), topSellerSerpItem.f272490f.getDeepLink(), null, 14);
        return G0.f406611a;
    }
}
