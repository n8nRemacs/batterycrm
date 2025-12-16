package com.avito.android.imv_cars_details.mvi;

import WM.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.imv_cars_details.mvi.entity.ImvCarsDetailsInternalAction;
import com.avito.android.remote.imv_cars_details.models.ImvCarsDetailsResponse;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvCarsDetailsReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_cars_details/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "LWM/c;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements u<ImvCarsDetailsInternalAction, WM.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.imv_cars_details.presentation.a f170008b;

    @Inject
    public l(@Y61.k com.avito.android.imv_cars_details.presentation.a aVar) {
        this.f170008b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final WM.c a(ImvCarsDetailsInternalAction imvCarsDetailsInternalAction, WM.c cVar) {
        ImvCarsDetailsInternalAction imvCarsDetailsInternalAction2 = imvCarsDetailsInternalAction;
        WM.c cVar2 = cVar;
        if (imvCarsDetailsInternalAction2 instanceof ImvCarsDetailsInternalAction.ShowLoadedContent) {
            ImvCarsDetailsInternalAction.ShowLoadedContent showLoadedContent = (ImvCarsDetailsInternalAction.ShowLoadedContent) imvCarsDetailsInternalAction2;
            ImvCarsDetailsResponse imvCarsDetailsResponse = showLoadedContent.f169992b;
            return new WM.c(false, null, new c.b(imvCarsDetailsResponse.getNavigationTitle(), this.f170008b.a(imvCarsDetailsResponse, showLoadedContent.f169993c)));
        }
        if (!(imvCarsDetailsInternalAction2 instanceof ImvCarsDetailsInternalAction.UpdateItems)) {
            return imvCarsDetailsInternalAction2 instanceof ImvCarsDetailsInternalAction.ShowLoadingError ? WM.c.a(cVar2, false, ((ImvCarsDetailsInternalAction.ShowLoadingError) imvCarsDetailsInternalAction2).f169994b, null, 4) : imvCarsDetailsInternalAction2.equals(ImvCarsDetailsInternalAction.StartLoading.f169996b) ? WM.c.a(cVar2, true, null, null, 6) : cVar2;
        }
        c.b bVar = cVar2.f17887d;
        return WM.c.a(cVar2, false, null, bVar != null ? new c.b(bVar.f17888a, ((ImvCarsDetailsInternalAction.UpdateItems) imvCarsDetailsInternalAction2).f169997b) : null, 3);
    }
}
