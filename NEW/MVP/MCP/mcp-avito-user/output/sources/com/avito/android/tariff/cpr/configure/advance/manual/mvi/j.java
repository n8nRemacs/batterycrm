package com.avito.android.tariff.cpr.configure.advance.manual.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.tariff.cpr.configure.advance.manual.mvi.entity.CprConfigureAdvanceManualInternalAction;
import fB0.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CprConfigureAdvanceManualOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction;", "LfB0/b;", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements t<CprConfigureAdvanceManualInternalAction, fB0.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final fB0.b b(CprConfigureAdvanceManualInternalAction cprConfigureAdvanceManualInternalAction) {
        CprConfigureAdvanceManualInternalAction cprConfigureAdvanceManualInternalAction2 = cprConfigureAdvanceManualInternalAction;
        if (cprConfigureAdvanceManualInternalAction2 instanceof CprConfigureAdvanceManualInternalAction.InvalidValue) {
            return b.C11135b.f395774a;
        }
        if (!(cprConfigureAdvanceManualInternalAction2 instanceof CprConfigureAdvanceManualInternalAction.HandleDeeplink)) {
            return null;
        }
        CprConfigureAdvanceManualInternalAction.HandleDeeplink handleDeeplink = (CprConfigureAdvanceManualInternalAction.HandleDeeplink) cprConfigureAdvanceManualInternalAction2;
        return new b.a(handleDeeplink.f295422b, handleDeeplink.f295423c);
    }
}
