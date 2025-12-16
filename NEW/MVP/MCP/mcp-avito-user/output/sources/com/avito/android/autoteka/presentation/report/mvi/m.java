package com.avito.android.autoteka.presentation.report.mvi;

import Pf.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.autoteka.presentation.report.mvi.entity.AutotekaReportInternalAction;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaReportReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/report/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction;", "LPf/c;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m implements u<AutotekaReportInternalAction, Pf.c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Pf.c a(AutotekaReportInternalAction autotekaReportInternalAction, Pf.c cVar) {
        AutotekaReportInternalAction autotekaReportInternalAction2 = autotekaReportInternalAction;
        Pf.c cVar2 = cVar;
        if (autotekaReportInternalAction2 instanceof AutotekaReportInternalAction.Error) {
            ApiError apiError = ((AutotekaReportInternalAction.Error) autotekaReportInternalAction2).f97724b;
            return new c.b(new com.avito.android.autoteka.items.fullScreenError.report.c(null, com.avito.android.autoteka.helpers.j.c(apiError), com.avito.android.autoteka.helpers.j.b(apiError), com.avito.android.autoteka.helpers.j.a(apiError), 1, null), apiError);
        }
        if (!(autotekaReportInternalAction2 instanceof AutotekaReportInternalAction.Loading)) {
            return autotekaReportInternalAction2 instanceof AutotekaReportInternalAction.Data ? new c.d(((AutotekaReportInternalAction.Data) autotekaReportInternalAction2).f97721b) : cVar2;
        }
        Pf.c.f13218c.getClass();
        return Pf.c.f13219d;
    }
}
