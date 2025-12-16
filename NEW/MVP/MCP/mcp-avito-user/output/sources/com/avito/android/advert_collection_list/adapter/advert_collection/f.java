package com.avito.android.advert_collection_list.adapter.advert_collection;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertCollectionPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f82054l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertCollectionItem f82055m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, AdvertCollectionItem advertCollectionItem) {
        super(0);
        this.f82054l = gVar;
        this.f82055m = advertCollectionItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f82054l.f82058d.K5(this.f82055m);
        return G0.f406611a;
    }
}
