package com.avito.android.advert_collection.mvi;

import I7.b;
import com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction;
import com.avito.android.arch.mvi.t;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertCollectionOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "LI7/b;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m implements t<AdvertCollectionInternalAction, I7.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection.l f81679b;

    @Inject
    public m(@Y61.k com.avito.android.advert_collection.l lVar) {
        this.f81679b = lVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final I7.b b(AdvertCollectionInternalAction advertCollectionInternalAction) {
        AdvertCollectionInternalAction advertCollectionInternalAction2 = advertCollectionInternalAction;
        if (advertCollectionInternalAction2 instanceof AdvertCollectionInternalAction.CollectionLinkLoaded) {
            AdvertCollectionInternalAction.CollectionLinkLoaded collectionLinkLoaded = (AdvertCollectionInternalAction.CollectionLinkLoaded) advertCollectionInternalAction2;
            return new b.g(collectionLinkLoaded.f81574b, collectionLinkLoaded.f81575c);
        }
        if (advertCollectionInternalAction2 instanceof AdvertCollectionInternalAction.CloseScreen) {
            return b.a.f7976a;
        }
        if (advertCollectionInternalAction2 instanceof AdvertCollectionInternalAction.OpenDeeplink) {
            AdvertCollectionInternalAction.OpenDeeplink openDeeplink = (AdvertCollectionInternalAction.OpenDeeplink) advertCollectionInternalAction2;
            return new b.c(openDeeplink.f81595c, openDeeplink.f81594b, openDeeplink.f81596d);
        }
        if (advertCollectionInternalAction2 instanceof AdvertCollectionInternalAction.OpenSelectBottomSheet) {
            return new b.f(((AdvertCollectionInternalAction.OpenSelectBottomSheet) advertCollectionInternalAction2).f81598b);
        }
        if (advertCollectionInternalAction2 instanceof AdvertCollectionInternalAction.ShowSimilarAdverts) {
            return new b.j(((AdvertCollectionInternalAction.ShowSimilarAdverts) advertCollectionInternalAction2).f81607b);
        }
        boolean z12 = advertCollectionInternalAction2 instanceof AdvertCollectionInternalAction.LoadAdvertError;
        com.avito.android.advert_collection.l lVar = this.f81679b;
        if (z12) {
            return new b.k(lVar.getF81542d());
        }
        if (advertCollectionInternalAction2 instanceof AdvertCollectionInternalAction.LoadWidgetsError) {
            if (!(((AdvertCollectionInternalAction.LoadWidgetsError) advertCollectionInternalAction2).f81590b instanceof ApiError.NotFound)) {
                return new b.k(lVar.getF81542d());
            }
        } else {
            if (advertCollectionInternalAction2.equals(AdvertCollectionInternalAction.LoadCollectionLinkError.f81583b)) {
                return new b.k(lVar.getF81541c());
            }
            if (advertCollectionInternalAction2.equals(AdvertCollectionInternalAction.RequestLocation.f81601b)) {
                return b.h.f7986a;
            }
            if (advertCollectionInternalAction2.equals(AdvertCollectionInternalAction.LocationNotFound.f81593b)) {
                return new b.k(lVar.getF81543e());
            }
            if (advertCollectionInternalAction2.equals(AdvertCollectionInternalAction.OpenDeleteCollectionDialog.f81597b)) {
                return b.d.f7981a;
            }
            if (advertCollectionInternalAction2.equals(AdvertCollectionInternalAction.CollectionDeleteError.f81572b)) {
                return new b.k(lVar.getF81546h());
            }
            if (advertCollectionInternalAction2.equals(AdvertCollectionInternalAction.CollectionDeleted.f81573b)) {
                return new b.C0449b(lVar.getF81545g());
            }
            if (advertCollectionInternalAction2 instanceof AdvertCollectionInternalAction.SaveAnalyticsInfo) {
                AdvertCollectionInternalAction.SaveAnalyticsInfo saveAnalyticsInfo = (AdvertCollectionInternalAction.SaveAnalyticsInfo) advertCollectionInternalAction2;
                return new b.i(saveAnalyticsInfo.f81603b, saveAnalyticsInfo.f81604c, saveAnalyticsInfo.f81605d, saveAnalyticsInfo.f81606e);
            }
            if (advertCollectionInternalAction2 instanceof AdvertCollectionInternalAction.ApiErrorReceived) {
                return new b.k(((AdvertCollectionInternalAction.ApiErrorReceived) advertCollectionInternalAction2).f81570b);
            }
            if (advertCollectionInternalAction2.equals(AdvertCollectionInternalAction.PublishOnboardingClick.f81600b)) {
                return b.e.f7982a;
            }
        }
        return null;
    }
}
