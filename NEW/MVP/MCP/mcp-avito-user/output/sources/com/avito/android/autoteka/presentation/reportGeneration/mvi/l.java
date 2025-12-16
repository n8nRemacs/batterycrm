package com.avito.android.autoteka.presentation.reportGeneration.mvi;

import Rf.AbstractC15037c;
import com.avito.android.arch.mvi.u;
import com.avito.android.autoteka.presentation.reportGeneration.mvi.entity.AutotekaReportGenerationInternalAction;
import com.avito.android.remote.autoteka.generated.api.get_step_report_status_api.GetStepReportStatusApiResponse;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaReportGenerationReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/reportGeneration/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/autoteka/presentation/reportGeneration/mvi/entity/AutotekaReportGenerationInternalAction;", "LRf/c;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements u<AutotekaReportGenerationInternalAction, AbstractC15037c> {

    /* compiled from: AutotekaReportGenerationReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97828a;

        static {
            int[] iArr = new int[GetStepReportStatusApiResponse.Status.values().length];
            try {
                iArr[GetStepReportStatusApiResponse.Status.Completed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f97828a = iArr;
        }
    }

    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final AbstractC15037c a(AutotekaReportGenerationInternalAction autotekaReportGenerationInternalAction, AbstractC15037c abstractC15037c) {
        AutotekaReportGenerationInternalAction autotekaReportGenerationInternalAction2 = autotekaReportGenerationInternalAction;
        AbstractC15037c abstractC15037c2 = abstractC15037c;
        if (autotekaReportGenerationInternalAction2 instanceof AutotekaReportGenerationInternalAction.Response) {
            com.avito.android.autoteka.items.reportGenerationResponse.c cVar = ((AutotekaReportGenerationInternalAction.Response) autotekaReportGenerationInternalAction2).f97810b;
            return a.f97828a[cVar.f96992e.ordinal()] == 1 ? abstractC15037c2 : new AbstractC15037c.C0969c(cVar);
        }
        if (autotekaReportGenerationInternalAction2 instanceof AutotekaReportGenerationInternalAction.Loading) {
            AbstractC15037c.f14540c.getClass();
            return new AbstractC15037c.d(AbstractC15037c.f14541d);
        }
        if (!(autotekaReportGenerationInternalAction2 instanceof AutotekaReportGenerationInternalAction.Error)) {
            return abstractC15037c2;
        }
        ApiError apiError = ((AutotekaReportGenerationInternalAction.Error) autotekaReportGenerationInternalAction2).f97805b;
        return new AbstractC15037c.b(new com.avito.android.autoteka.items.fullScreenError.reportGenerationError.c(null, com.avito.android.autoteka.helpers.j.c(apiError), com.avito.android.autoteka.helpers.j.b(apiError), com.avito.android.autoteka.helpers.j.a(apiError), 1, null), apiError);
    }
}
