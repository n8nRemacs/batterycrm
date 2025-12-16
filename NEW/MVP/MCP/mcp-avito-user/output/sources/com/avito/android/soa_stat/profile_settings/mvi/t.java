package com.avito.android.soa_stat.profile_settings.mvi;

import Vw0.InterfaceC15723b;
import com.avito.android.soa_stat.profile_settings.mvi.entity.SoaStatSettingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SoaStatSettingOneTimeProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/mvi/t;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction;", "LVw0/b;", "<init>", "()V", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t implements com.avito.android.arch.mvi.t<SoaStatSettingInternalAction, InterfaceC15723b> {
    @Inject
    public t() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15723b b(SoaStatSettingInternalAction soaStatSettingInternalAction) {
        SoaStatSettingInternalAction soaStatSettingInternalAction2 = soaStatSettingInternalAction;
        if (!(soaStatSettingInternalAction2 instanceof SoaStatSettingInternalAction.ToggleSettingError)) {
            return null;
        }
        SoaStatSettingInternalAction.ToggleSettingError toggleSettingError = (SoaStatSettingInternalAction.ToggleSettingError) soaStatSettingInternalAction2;
        return new InterfaceC15723b.a(toggleSettingError.f284152b, toggleSettingError.f284153c);
    }
}
