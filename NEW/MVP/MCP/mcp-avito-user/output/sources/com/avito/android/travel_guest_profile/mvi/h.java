package com.avito.android.travel_guest_profile.mvi;

import QE0.c;
import com.avito.android.arch.mvi.t;
import com.avito.android.travel_guest_profile.mvi.entity.TravelGuestProfileInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TravelGuestProfileOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "LQE0/c;", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements t<TravelGuestProfileInternalAction, QE0.c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final QE0.c b(TravelGuestProfileInternalAction travelGuestProfileInternalAction) {
        QE0.c dVar;
        TravelGuestProfileInternalAction travelGuestProfileInternalAction2 = travelGuestProfileInternalAction;
        if (travelGuestProfileInternalAction2 instanceof TravelGuestProfileInternalAction.CloseScreen) {
            return c.a.f13612a;
        }
        if (travelGuestProfileInternalAction2 instanceof TravelGuestProfileInternalAction.OpenDeeplink) {
            dVar = new c.b(((TravelGuestProfileInternalAction.OpenDeeplink) travelGuestProfileInternalAction2).f302176b);
        } else if (travelGuestProfileInternalAction2 instanceof TravelGuestProfileInternalAction.OpenPhotoGallery) {
            TravelGuestProfileInternalAction.OpenPhotoGallery openPhotoGallery = (TravelGuestProfileInternalAction.OpenPhotoGallery) travelGuestProfileInternalAction2;
            dVar = new c.C0892c(openPhotoGallery.f302177b, openPhotoGallery.f302178c);
        } else if (travelGuestProfileInternalAction2 instanceof TravelGuestProfileInternalAction.ReviewsLoadingError) {
            dVar = new c.e(((TravelGuestProfileInternalAction.ReviewsLoadingError) travelGuestProfileInternalAction2).f302182b, false);
        } else if (travelGuestProfileInternalAction2 instanceof TravelGuestProfileInternalAction.ReviewsPaginationError) {
            dVar = new c.e(((TravelGuestProfileInternalAction.ReviewsPaginationError) travelGuestProfileInternalAction2).f302186b, true);
        } else {
            if (!(travelGuestProfileInternalAction2 instanceof TravelGuestProfileInternalAction.OpenSortingOptionsDialog)) {
                return null;
            }
            TravelGuestProfileInternalAction.OpenSortingOptionsDialog openSortingOptionsDialog = (TravelGuestProfileInternalAction.OpenSortingOptionsDialog) travelGuestProfileInternalAction2;
            dVar = new c.d(openSortingOptionsDialog.f302179b, openSortingOptionsDialog.f302180c);
        }
        return dVar;
    }
}
