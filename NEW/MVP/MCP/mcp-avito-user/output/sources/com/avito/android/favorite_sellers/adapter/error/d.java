package com.avito.android.favorite_sellers.adapter.error;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ErrorItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f155559l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ErrorItem f155560m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ErrorItem errorItem) {
        super(0);
        this.f155559l = eVar;
        this.f155560m = errorItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f155559l.f155561b.K5(new vC.f(this.f155560m.f155554c));
        return G0.f406611a;
    }
}
