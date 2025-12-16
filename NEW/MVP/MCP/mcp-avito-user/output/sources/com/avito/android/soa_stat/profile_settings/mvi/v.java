package com.avito.android.soa_stat.profile_settings.mvi;

import Vw0.c;
import com.avito.android.remote.model.user_profile.IncomeProfileSettingsResponse;
import com.avito.android.soa_stat.profile_settings.mvi.entity.SoaStatSettingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SoaStatSettingReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/mvi/v;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction;", "LVw0/c;", "<init>", "()V", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v implements com.avito.android.arch.mvi.u<SoaStatSettingInternalAction, Vw0.c> {
    @Inject
    public v() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Vw0.c a(SoaStatSettingInternalAction soaStatSettingInternalAction, Vw0.c cVar) {
        SoaStatSettingInternalAction soaStatSettingInternalAction2 = soaStatSettingInternalAction;
        Vw0.c cVar2 = cVar;
        if (soaStatSettingInternalAction2 instanceof SoaStatSettingInternalAction.Loaded) {
            IncomeProfileSettingsResponse incomeProfileSettingsResponse = ((SoaStatSettingInternalAction.Loaded) soaStatSettingInternalAction2).f284145b;
            return new Vw0.c(new c.a.b(com.avito.android.printable_text.b.f(incomeProfileSettingsResponse.getEnableField().getTitle()), incomeProfileSettingsResponse.getBody().getAttributedText(), incomeProfileSettingsResponse.getBody().getImage(), incomeProfileSettingsResponse.getEnableField().getValue(), true));
        }
        if (soaStatSettingInternalAction2 instanceof SoaStatSettingInternalAction.Loading) {
            return new Vw0.c(c.a.C1216c.f17514a);
        }
        if (soaStatSettingInternalAction2 instanceof SoaStatSettingInternalAction.LoadingError) {
            SoaStatSettingInternalAction.LoadingError loadingError = (SoaStatSettingInternalAction.LoadingError) soaStatSettingInternalAction2;
            return new Vw0.c(new c.a.C1215a(loadingError.f284148b, loadingError.f284149c));
        }
        boolean z12 = soaStatSettingInternalAction2 instanceof SoaStatSettingInternalAction.ToggleSettingError;
        c.a aVar = cVar2.f17506b;
        if (z12) {
            return !(aVar instanceof c.a.b) ? cVar2 : new Vw0.c(c.a.b.a((c.a.b) aVar, ((SoaStatSettingInternalAction.ToggleSettingError) soaStatSettingInternalAction2).f284154d, true));
        }
        if (soaStatSettingInternalAction2 instanceof SoaStatSettingInternalAction.ToggleSettingLoaded) {
            return !(aVar instanceof c.a.b) ? cVar2 : new Vw0.c(c.a.b.a((c.a.b) aVar, ((SoaStatSettingInternalAction.ToggleSettingLoaded) soaStatSettingInternalAction2).f284157b, true));
        }
        if (soaStatSettingInternalAction2 instanceof SoaStatSettingInternalAction.ToggleSettingLoading) {
            return !(aVar instanceof c.a.b) ? cVar2 : new Vw0.c(c.a.b.a((c.a.b) aVar, ((SoaStatSettingInternalAction.ToggleSettingLoading) soaStatSettingInternalAction2).f284159d, false));
        }
        throw new NoWhenBranchMatchedException();
    }
}
