package com.avito.android.advert_collection_list;

import Q7.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertCollectionListFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertCollectionListFragment f82080l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f82081m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AdvertCollectionListFragment advertCollectionListFragment, String str) {
        super(0);
        this.f82080l = advertCollectionListFragment;
        this.f82081m = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f82080l.q5().accept(new a.c(this.f82081m));
        return G0.f406611a;
    }
}
