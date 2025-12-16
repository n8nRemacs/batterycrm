package com.avito.android.user_adverts_filters.main.mvi_main;

import com.avito.android.user_adverts_filters.UserAdvertsFiltersData;
import com.avito.android.user_adverts_filters.main.mvi_main.entity.MainFiltersInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import rJ0.InterfaceC47555b;

/* compiled from: MainFiltersEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/t;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "LrJ0/b;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class t implements com.avito.android.arch.mvi.t<MainFiltersInternalAction, InterfaceC47555b> {
    @Inject
    public t() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47555b b(MainFiltersInternalAction mainFiltersInternalAction) {
        MainFiltersInternalAction mainFiltersInternalAction2 = mainFiltersInternalAction;
        if (mainFiltersInternalAction2 instanceof MainFiltersInternalAction.ApplyFilters) {
            MainFiltersInternalAction.ApplyFilters applyFilters = (MainFiltersInternalAction.ApplyFilters) mainFiltersInternalAction2;
            return new InterfaceC47555b.C12369b(new UserAdvertsFiltersData(applyFilters.f316223d, applyFilters.f316221b, applyFilters.f316222c));
        }
        if (mainFiltersInternalAction2 instanceof MainFiltersInternalAction.Close) {
            return InterfaceC47555b.a.f429736a;
        }
        if (mainFiltersInternalAction2 instanceof MainFiltersInternalAction.ResetScreens) {
            return new InterfaceC47555b.d(((MainFiltersInternalAction.ResetScreens) mainFiltersInternalAction2).f316245c);
        }
        if (mainFiltersInternalAction2 instanceof MainFiltersInternalAction.RequestError) {
            return new InterfaceC47555b.c(((MainFiltersInternalAction.RequestError) mainFiltersInternalAction2).f316238b);
        }
        return null;
    }
}
