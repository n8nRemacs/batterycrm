package com.avito.android.comparison.items.header_item;

import Rq.InterfaceC15071a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ComparisonHeaderPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comparison/items/header_item/i;", "LTV0/d;", "Lcom/avito/android/comparison/items/header_item/k;", "Lcom/avito/android/comparison/items/header_item/b;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements TV0.d<k, b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC15071a.e, G0> f123972b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC15071a.j, G0> f123973c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC15071a.h, G0> f123974d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC15071a.f, G0> f123975e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC15071a.g, G0> f123976f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC15071a.d, G0> f123977g;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k Y41.l<? super InterfaceC15071a.e, G0> lVar, @Y61.k Y41.l<? super InterfaceC15071a.j, G0> lVar2, @Y61.k Y41.l<? super InterfaceC15071a.h, G0> lVar3, @Y61.k Y41.l<? super InterfaceC15071a.f, G0> lVar4, @Y61.k Y41.l<? super InterfaceC15071a.g, G0> lVar5, @Y61.k Y41.l<? super InterfaceC15071a.d, G0> lVar6) {
        this.f123972b = lVar;
        this.f123973c = lVar2;
        this.f123974d = lVar3;
        this.f123975e = lVar4;
        this.f123976f = lVar5;
        this.f123977g = lVar6;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        k kVar = (k) eVar;
        b bVar = (b) aVar;
        kVar.km(bVar.f123955g, bVar.f123951c);
        kVar.setTitle(bVar.f123953e);
        kVar.p(bVar.f123954f);
        kVar.bE(bVar.f123957i, new e(bVar, this));
        n nVar = bVar.f123958j;
        if (nVar != null) {
            kVar.fq(true);
            kVar.Nu(new f(this, nVar));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            kVar.fq(false);
        }
        kVar.p3(new g(bVar, this));
        kVar.dE(new h(this, i12, bVar));
    }
}
