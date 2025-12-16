package com.avito.android.travel_guest_profile.mvi;

import android.net.Uri;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import com.avito.android.travel_guest_profile.mvi.entity.TravelGuestProfileInternalAction;
import com.avito.android.util.P2;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: TravelGuestProfileReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "LQE0/d;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements u<TravelGuestProfileInternalAction, QE0.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f302197b;

    @Inject
    public j(@Y61.k l lVar) {
        this.f302197b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // com.avito.android.arch.mvi.u
    public final QE0.d a(TravelGuestProfileInternalAction travelGuestProfileInternalAction, QE0.d dVar) {
        Object next;
        List<SearchParametersEntry.SearchParametersBlock> blocks;
        ?? next2;
        TravelGuestProfileInternalAction travelGuestProfileInternalAction2 = travelGuestProfileInternalAction;
        QE0.d dVar2 = dVar;
        boolean z12 = travelGuestProfileInternalAction2 instanceof TravelGuestProfileInternalAction.Init;
        l lVar = this.f302197b;
        if (z12) {
            TravelGuestProfileInternalAction.Init init = (TravelGuestProfileInternalAction.Init) travelGuestProfileInternalAction2;
            return lVar.a(QE0.d.a(dVar2, init.f302169b, init.f302170c, init.f302171d, null, null, null, null, null, null, 504));
        }
        if (travelGuestProfileInternalAction2 instanceof TravelGuestProfileInternalAction.ContentLoaded) {
            return lVar.a(QE0.d.a(dVar2, null, null, null, null, new P2.b(((TravelGuestProfileInternalAction.ContentLoaded) travelGuestProfileInternalAction2).f302168b), null, null, null, null, 495));
        }
        if (travelGuestProfileInternalAction2 instanceof TravelGuestProfileInternalAction.LoadingError) {
            return lVar.a(QE0.d.a(dVar2, null, null, null, null, new P2.a(((TravelGuestProfileInternalAction.LoadingError) travelGuestProfileInternalAction2).f302172b), null, null, null, null, 495));
        }
        if (travelGuestProfileInternalAction2 instanceof TravelGuestProfileInternalAction.LoadingStarted) {
            return lVar.a(QE0.d.a(dVar2, null, null, null, null, P2.c.f318721a, null, null, null, null, 495));
        }
        if (travelGuestProfileInternalAction2 instanceof TravelGuestProfileInternalAction.ReviewsLoadingStarted) {
            return lVar.a(QE0.d.a(dVar2, null, null, null, null, null, P2.c.f318721a, null, null, null, 471));
        }
        if (!(travelGuestProfileInternalAction2 instanceof TravelGuestProfileInternalAction.ReviewsLoaded)) {
            if (!(travelGuestProfileInternalAction2 instanceof TravelGuestProfileInternalAction.ReviewsPaginationLoaded)) {
                return travelGuestProfileInternalAction2 instanceof TravelGuestProfileInternalAction.ReviewsLoadingError ? lVar.a(QE0.d.a(dVar2, null, null, null, null, null, new P2.a(((TravelGuestProfileInternalAction.ReviewsLoadingError) travelGuestProfileInternalAction2).f302182b), null, null, null, 471)) : dVar2;
            }
            RatingDetailsResult ratingDetailsResult = ((TravelGuestProfileInternalAction.ReviewsPaginationLoaded) travelGuestProfileInternalAction2).f302189b;
            Uri nextPage = ratingDetailsResult.getNextPage();
            List<RatingDetailsEntry> list = dVar2.f13629i;
            List<RatingDetailsEntry> entries = ratingDetailsResult.getEntries();
            if (entries == null) {
                entries = C42784z0.f406748b;
            }
            return lVar.a(QE0.d.a(dVar2, null, null, null, null, null, null, nextPage, C42745f0.h0(entries, list), null, 319));
        }
        RatingDetailsResult ratingDetailsResult2 = ((TravelGuestProfileInternalAction.ReviewsLoaded) travelGuestProfileInternalAction2).f302181b;
        List<RatingDetailsEntry> entries2 = ratingDetailsResult2.getEntries();
        if (entries2 != null) {
            Iterator it = entries2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof SearchParametersEntry) {
                    break;
                }
            }
            if (!(next instanceof SearchParametersEntry)) {
                next = null;
            }
            SearchParametersEntry searchParametersEntry = (SearchParametersEntry) next;
            if (searchParametersEntry != null && (blocks = searchParametersEntry.getBlocks()) != null) {
                Iterator it2 = blocks.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = 0;
                        break;
                    }
                    next2 = it2.next();
                    if (next2 instanceof SearchParametersEntry.SearchParametersBlock.Sort) {
                        break;
                    }
                }
                sort = next2 instanceof SearchParametersEntry.SearchParametersBlock.Sort ? next2 : null;
            }
        }
        SearchParametersEntry.SearchParametersBlock.Sort sort = sort;
        P2.b bVar = new P2.b(ratingDetailsResult2);
        Uri nextPage2 = ratingDetailsResult2.getNextPage();
        List<RatingDetailsEntry> entries3 = ratingDetailsResult2.getEntries();
        if (entries3 == null) {
            entries3 = C42784z0.f406748b;
        }
        return lVar.a(QE0.d.a(dVar2, null, null, null, sort, null, bVar, nextPage2, entries3, null, 279));
    }
}
