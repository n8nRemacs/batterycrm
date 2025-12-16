package com.avito.android.developments_agency_search.screen.big_filters.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import ww.InterfaceC49691b;

/* compiled from: BigFiltersOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/q;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "Lww/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class q implements com.avito.android.arch.mvi.t<BigFiltersInternalAction, InterfaceC49691b> {
    @Inject
    public q() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49691b b(BigFiltersInternalAction bigFiltersInternalAction) {
        BigFiltersInternalAction bigFiltersInternalAction2 = bigFiltersInternalAction;
        if (bigFiltersInternalAction2 instanceof BigFiltersInternalAction.SendScreenResult) {
            return new InterfaceC49691b.c(((BigFiltersInternalAction.SendScreenResult) bigFiltersInternalAction2).f136705b);
        }
        if (bigFiltersInternalAction2 instanceof BigFiltersInternalAction.CloseScreen) {
            return InterfaceC49691b.a.f441869a;
        }
        if (bigFiltersInternalAction2 instanceof BigFiltersInternalAction.UpdateApplyButtonVisibility) {
            return new InterfaceC49691b.e(((BigFiltersInternalAction.UpdateApplyButtonVisibility) bigFiltersInternalAction2).f136707b);
        }
        if (bigFiltersInternalAction2 instanceof BigFiltersInternalAction.ShowLocationGroupScreen) {
            return new InterfaceC49691b.d(((BigFiltersInternalAction.ShowLocationGroupScreen) bigFiltersInternalAction2).f136706b);
        }
        if (bigFiltersInternalAction2 instanceof BigFiltersInternalAction.RefreshSearchResultCount) {
            return InterfaceC49691b.C12837b.f441870a;
        }
        return null;
    }
}
