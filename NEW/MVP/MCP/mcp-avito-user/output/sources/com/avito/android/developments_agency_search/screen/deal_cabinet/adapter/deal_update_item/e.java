package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import zw.b;

/* compiled from: DealUpdateItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f136815l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f136816m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, a aVar) {
        super(0);
        this.f136815l = dVar;
        this.f136816m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f136815l;
        a aVar = this.f136816m;
        dVar.f136813b.invoke(new b.f(aVar.f136808b.getClient().getId(), aVar.f136808b));
        return G0.f406611a;
    }
}
