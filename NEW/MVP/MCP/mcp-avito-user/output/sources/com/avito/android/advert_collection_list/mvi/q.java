package com.avito.android.advert_collection_list.mvi;

import Q7.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertCollectionListOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/q;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "LQ7/b;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class q implements com.avito.android.arch.mvi.t<AdvertCollectionListInternalAction, Q7.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_list.i f82296b;

    @Inject
    public q(@Y61.k com.avito.android.advert_collection_list.i iVar) {
        this.f82296b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.t
    public final Q7.b b(AdvertCollectionListInternalAction advertCollectionListInternalAction) {
        AdvertCollectionListInternalAction advertCollectionListInternalAction2 = advertCollectionListInternalAction;
        if (advertCollectionListInternalAction2 instanceof AdvertCollectionListInternalAction.CollectionLinkLoaded) {
            return new b.e(((AdvertCollectionListInternalAction.CollectionLinkLoaded) advertCollectionListInternalAction2).f82199b);
        }
        if (advertCollectionListInternalAction2 instanceof AdvertCollectionListInternalAction.CollectionDeleted) {
            return new b.i(this.f82296b.getF82169c(), false);
        }
        if (advertCollectionListInternalAction2 instanceof AdvertCollectionListInternalAction.OpenDeeplink) {
            AdvertCollectionListInternalAction.OpenDeeplink openDeeplink = (AdvertCollectionListInternalAction.OpenDeeplink) advertCollectionListInternalAction2;
            return new b.C0889b(openDeeplink.f82206b, openDeeplink.f82207c);
        }
        if (advertCollectionListInternalAction2 instanceof AdvertCollectionListInternalAction.OpenDeleteCollectionDialog) {
            return new b.c(((AdvertCollectionListInternalAction.OpenDeleteCollectionDialog) advertCollectionListInternalAction2).f82208b);
        }
        if (advertCollectionListInternalAction2 instanceof AdvertCollectionListInternalAction.OpenSelectBottomSheet) {
            AdvertCollectionListInternalAction.OpenSelectBottomSheet openSelectBottomSheet = (AdvertCollectionListInternalAction.OpenSelectBottomSheet) advertCollectionListInternalAction2;
            return new b.d(openSelectBottomSheet.f82209b, openSelectBottomSheet.f82210c);
        }
        if (advertCollectionListInternalAction2 instanceof AdvertCollectionListInternalAction.CollectionCreated) {
            return new b.a(((AdvertCollectionListInternalAction.CollectionCreated) advertCollectionListInternalAction2).f82195d);
        }
        if (advertCollectionListInternalAction2 instanceof AdvertCollectionListInternalAction.ShowError) {
            return new b.i(((AdvertCollectionListInternalAction.ShowError) advertCollectionListInternalAction2).f82215b, true);
        }
        if (advertCollectionListInternalAction2 instanceof AdvertCollectionListInternalAction.CollectionListLoadingError) {
            return new b.i(((AdvertCollectionListInternalAction.CollectionListLoadingError) advertCollectionListInternalAction2).f82202b.getMessage(), true);
        }
        if (advertCollectionListInternalAction2 instanceof AdvertCollectionListInternalAction.CollectionListLoaded) {
            return new b.g();
        }
        if (advertCollectionListInternalAction2 instanceof AdvertCollectionListInternalAction.SendCollectionListViewEvent) {
            AdvertCollectionListInternalAction.SendCollectionListViewEvent sendCollectionListViewEvent = (AdvertCollectionListInternalAction.SendCollectionListViewEvent) advertCollectionListInternalAction2;
            return new b.h(sendCollectionListViewEvent.f82212b, sendCollectionListViewEvent.f82213c, sendCollectionListViewEvent.f82214d);
        }
        String str = null;
        Object[] objArr = 0;
        if (advertCollectionListInternalAction2 instanceof AdvertCollectionListInternalAction.OpenAuthorizationBottomSheet) {
            return new b.C0889b(new AuthenticateLink(AuthSource.f92705h0, false, ((AdvertCollectionListInternalAction.OpenAuthorizationBottomSheet) advertCollectionListInternalAction2).f82205b, 2, (C42822w) null), str, 2, objArr == true ? 1 : 0);
        }
        if (advertCollectionListInternalAction2 instanceof AdvertCollectionListInternalAction.SaveCollectionIdToAnalytics) {
            return new b.f(((AdvertCollectionListInternalAction.SaveCollectionIdToAnalytics) advertCollectionListInternalAction2).f82211b);
        }
        return null;
    }
}
