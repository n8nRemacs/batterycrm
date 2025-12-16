package com.avito.android.advert_collection_list;

import Q7.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertCollectionListFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "collectionId", "Lcom/avito/android/advert_collection_list/actions/a;", "action", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lcom/avito/android/advert_collection_list/actions/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements Y41.p<String, com.avito.android.advert_collection_list.actions.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertCollectionListFragment f82082l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AdvertCollectionListFragment advertCollectionListFragment) {
        super(2);
        this.f82082l = advertCollectionListFragment;
    }

    @Override // Y41.p
    public final G0 invoke(String str, com.avito.android.advert_collection_list.actions.a aVar) {
        this.f82082l.q5().accept(new a.C0888a(aVar.f82003a, str));
        return G0.f406611a;
    }
}
