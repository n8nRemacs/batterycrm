package com.avito.android.extended_profile_selection_create.select.mvi;

import RA.a;
import RA.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameConfig;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExtendedProfileSelectionCreateOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "LRA/b;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements t<ExtendedProfileSelectionCreateInternalAction, RA.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSelectionCreateConfig f152401b;

    @Inject
    public m(@Y61.k ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig) {
        this.f152401b = extendedProfileSelectionCreateConfig;
    }

    @Override // com.avito.android.arch.mvi.t
    public final RA.b b(ExtendedProfileSelectionCreateInternalAction extendedProfileSelectionCreateInternalAction) {
        RA.b cVar;
        ExtendedProfileSelectionCreateInternalAction extendedProfileSelectionCreateInternalAction2 = extendedProfileSelectionCreateInternalAction;
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.CloseScreen) {
            return b.a.f14179a;
        }
        if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.OpenFiltersScreen) {
            ExtendedProfileSelectionCreateInternalAction.OpenFiltersScreen openFiltersScreen = (ExtendedProfileSelectionCreateInternalAction.OpenFiltersScreen) extendedProfileSelectionCreateInternalAction2;
            cVar = new b.C0944b(openFiltersScreen.f152330b, openFiltersScreen.f152331c, openFiltersScreen.f152332d);
        } else {
            if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.AdvertsLoadingError) {
                ExtendedProfileSelectionCreateInternalAction.AdvertsLoadingError advertsLoadingError = (ExtendedProfileSelectionCreateInternalAction.AdvertsLoadingError) extendedProfileSelectionCreateInternalAction2;
                if (!advertsLoadingError.f152318c) {
                    cVar = new b.e(advertsLoadingError.f152317b, new a.i(false));
                }
                return null;
            }
            if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.CreateSelectionError) {
                cVar = new b.e(((ExtendedProfileSelectionCreateInternalAction.CreateSelectionError) extendedProfileSelectionCreateInternalAction2).f152321b, null);
            } else if (extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.CreateSelectionIncorrectValues) {
                cVar = new b.f(((ExtendedProfileSelectionCreateInternalAction.CreateSelectionIncorrectValues) extendedProfileSelectionCreateInternalAction2).f152322b);
            } else {
                if (!(extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.CreateSelectionSuccess)) {
                    if (!(extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.UpdateItems ? true : extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.AdvertsLoaded ? true : extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.AdvertsLoading ? true : extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.CreateSelectionLoading ? true : extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.CreateSelectionItemListIdCreated ? true : extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.HighlightContinueText ? true : extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.ShowMoreActions ? true : extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.CloseSelectionMenu ? true : extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.SelectAll ? true : extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.UnselectAll ? true : extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.SelectedAdvertsLoaded ? true : extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.SelectedAdvertsLoadedError ? true : extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.SelectedAdvertsLoading ? true : extendedProfileSelectionCreateInternalAction2 instanceof ExtendedProfileSelectionCreateInternalAction.SelectAdvert)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return null;
                }
                ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig = this.f152401b;
                ExtendedProfileSelectionCreateInternalAction.CreateSelectionSuccess createSelectionSuccess = (ExtendedProfileSelectionCreateInternalAction.CreateSelectionSuccess) extendedProfileSelectionCreateInternalAction2;
                cVar = new b.c(new ExtendedProfileSetSelectionNameConfig(extendedProfileSelectionCreateConfig.f151612c, createSelectionSuccess.f152326b, createSelectionSuccess.f152327c, extendedProfileSelectionCreateConfig.f151619j != null, extendedProfileSelectionCreateConfig.f151622m, extendedProfileSelectionCreateConfig.f151623n, 0, 64, null), createSelectionSuccess.f152328d);
            }
        }
        return cVar;
    }
}
