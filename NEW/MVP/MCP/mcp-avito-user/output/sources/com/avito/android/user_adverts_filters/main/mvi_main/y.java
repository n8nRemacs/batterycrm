package com.avito.android.user_adverts_filters.main.mvi_main;

import com.avito.android.user_adverts_filters.main.exception.FiltersDelegateNotFound;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinModel;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinResult;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinScreen;
import com.avito.android.user_adverts_filters.main.mvi_main.entity.MainFiltersInternalAction;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import rJ0.c;

/* compiled from: MainFiltersReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/y;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "LrJ0/c;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class y implements com.avito.android.arch.mvi.u<MainFiltersInternalAction, rJ0.c> {
    @Inject
    public y() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final rJ0.c a(MainFiltersInternalAction mainFiltersInternalAction, rJ0.c cVar) {
        UserAdvertsFiltersBeduinModel userAdvertsFiltersBeduinModel;
        UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen;
        rJ0.c cVarA;
        MainFiltersInternalAction mainFiltersInternalAction2 = mainFiltersInternalAction;
        rJ0.c cVar2 = cVar;
        if (mainFiltersInternalAction2 instanceof MainFiltersInternalAction.LoadError) {
            MainFiltersInternalAction.LoadError loadError = (MainFiltersInternalAction.LoadError) mainFiltersInternalAction2;
            return rJ0.c.a(cVar2, null, null, null, new c.b.C12370b(loadError.f316225b, loadError.f316226c), 13);
        }
        if (mainFiltersInternalAction2 instanceof MainFiltersInternalAction.Loaded) {
            UserAdvertsFiltersBeduinResult userAdvertsFiltersBeduinResult = ((MainFiltersInternalAction.Loaded) mainFiltersInternalAction2).f316229b;
            LinkedHashMap linkedHashMap = userAdvertsFiltersBeduinResult.f316077c;
            UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen2 = userAdvertsFiltersBeduinResult.f316076b;
            if (linkedHashMap.containsKey(userAdvertsFiltersBeduinScreen2)) {
                cVarA = rJ0.c.a(cVar2, userAdvertsFiltersBeduinResult, null, null, new c.b.a(userAdvertsFiltersBeduinScreen2), 13);
            } else {
                FiltersDelegateNotFound filtersDelegateNotFound = new FiltersDelegateNotFound();
                new MainFiltersInternalAction.LoadError(null, filtersDelegateNotFound);
                cVarA = rJ0.c.a(cVar2, null, null, null, new c.b.C12370b(null, filtersDelegateNotFound), 13);
            }
            return cVarA;
        }
        if (mainFiltersInternalAction2 instanceof MainFiltersInternalAction.MoveTo) {
            MainFiltersInternalAction.MoveTo moveTo = (MainFiltersInternalAction.MoveTo) mainFiltersInternalAction2;
            UserAdvertsFiltersBeduinResult userAdvertsFiltersBeduinResult2 = cVar2.f429741c;
            if (userAdvertsFiltersBeduinResult2 == null || (userAdvertsFiltersBeduinModel = (UserAdvertsFiltersBeduinModel) userAdvertsFiltersBeduinResult2.f316077c.get(moveTo.f316232b)) == null || (userAdvertsFiltersBeduinScreen = userAdvertsFiltersBeduinModel.f316055c) == null) {
                return cVar2;
            }
            c.b aVar = cVar2.f429744f;
            c.b.a aVar2 = aVar instanceof c.b.a ? (c.b.a) aVar : null;
            UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen3 = aVar2 != null ? aVar2.f429747a : null;
            if (aVar2 != null) {
                aVar = new c.b.a(userAdvertsFiltersBeduinScreen);
            }
            return rJ0.c.a(cVar2, null, null, userAdvertsFiltersBeduinScreen3, aVar, 7);
        }
        if (mainFiltersInternalAction2 instanceof MainFiltersInternalAction.ParamsChanged) {
            MainFiltersInternalAction.ParamsChanged paramsChanged = (MainFiltersInternalAction.ParamsChanged) mainFiltersInternalAction2;
            return rJ0.c.a(cVar2, null, P0.l(cVar2.f429742d, new Q(paramsChanged.f316235b, new c.a(paramsChanged.f316236c, paramsChanged.f316237d))), null, null, 27);
        }
        if (mainFiltersInternalAction2 instanceof MainFiltersInternalAction.Loading) {
            return rJ0.c.a(cVar2, null, null, null, c.b.C12371c.f429750a, 13);
        }
        if ((mainFiltersInternalAction2 instanceof MainFiltersInternalAction.ApplyFilters) || (mainFiltersInternalAction2 instanceof MainFiltersInternalAction.ResetScreens) || (mainFiltersInternalAction2 instanceof MainFiltersInternalAction.Close) || (mainFiltersInternalAction2 instanceof MainFiltersInternalAction.NoChange) || (mainFiltersInternalAction2 instanceof MainFiltersInternalAction.RequestError) || (mainFiltersInternalAction2 instanceof MainFiltersInternalAction.RequestLoaded) || (mainFiltersInternalAction2 instanceof MainFiltersInternalAction.RequestLoading)) {
            return cVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
