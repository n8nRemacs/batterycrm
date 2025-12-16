package com.avito.android.tariff_lf_constructor.configure.level.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.tariff_lf_constructor.configure.level.mvi.entity.ConstructorConfigureLevelInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import mD0.InterfaceC43951c;

/* compiled from: ConstructorConfigureLevelOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction;", "LmD0/c;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements t<ConstructorConfigureLevelInternalAction, InterfaceC43951c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC43951c b(ConstructorConfigureLevelInternalAction constructorConfigureLevelInternalAction) {
        ConstructorConfigureLevelInternalAction constructorConfigureLevelInternalAction2 = constructorConfigureLevelInternalAction;
        if (constructorConfigureLevelInternalAction2 instanceof ConstructorConfigureLevelInternalAction.Close) {
            return InterfaceC43951c.a.f414423a;
        }
        if (constructorConfigureLevelInternalAction2 instanceof ConstructorConfigureLevelInternalAction.HandleDeeplink) {
            return new InterfaceC43951c.b(((ConstructorConfigureLevelInternalAction.HandleDeeplink) constructorConfigureLevelInternalAction2).f299837b);
        }
        return null;
    }
}
