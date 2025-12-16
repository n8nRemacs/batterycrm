package com.avito.android.autoteka.presentation.reportGeneration.mvi;

import Rf.InterfaceC15036b;
import com.avito.android.arch.mvi.t;
import com.avito.android.autoteka.deeplinks.AutotekaReportLink;
import com.avito.android.autoteka.deeplinks.ReportDetails;
import com.avito.android.autoteka.deeplinks.ReportGenerationDetails;
import com.avito.android.autoteka.presentation.reportGeneration.mvi.entity.AutotekaReportGenerationInternalAction;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.autoteka.generated.api.get_step_report_status_api.GetStepReportStatusApiResponse;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaReportGenerationOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/reportGeneration/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/autoteka/presentation/reportGeneration/mvi/entity/AutotekaReportGenerationInternalAction;", "LRf/b;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements t<AutotekaReportGenerationInternalAction, InterfaceC15036b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f97823b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ReportGenerationDetails f97824c;

    /* compiled from: AutotekaReportGenerationOneTimeEventProducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97825a;

        static {
            int[] iArr = new int[GetStepReportStatusApiResponse.Status.values().length];
            try {
                iArr[GetStepReportStatusApiResponse.Status.Completed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f97825a = iArr;
        }
    }

    @Inject
    public j(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k ReportGenerationDetails reportGenerationDetails) {
        this.f97823b = aVar;
        this.f97824c = reportGenerationDetails;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15036b b(AutotekaReportGenerationInternalAction autotekaReportGenerationInternalAction) {
        String str;
        AutotekaReportGenerationInternalAction autotekaReportGenerationInternalAction2 = autotekaReportGenerationInternalAction;
        if (autotekaReportGenerationInternalAction2 instanceof AutotekaReportGenerationInternalAction.OpenAuthScreen) {
            return InterfaceC15036b.C0968b.f14539a;
        }
        if (autotekaReportGenerationInternalAction2 instanceof AutotekaReportGenerationInternalAction.Close) {
            return InterfaceC15036b.a.f14538a;
        }
        boolean z12 = autotekaReportGenerationInternalAction2 instanceof AutotekaReportGenerationInternalAction.Response;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f97823b;
        if (z12) {
            com.avito.android.autoteka.items.reportGenerationResponse.c cVar = ((AutotekaReportGenerationInternalAction.Response) autotekaReportGenerationInternalAction2).f97810b;
            if (a.f97825a[cVar.f96992e.ordinal()] == 1 && (str = cVar.f96994g) != null) {
                ReportGenerationDetails reportGenerationDetails = this.f97824c;
                b.a.a(aVar, new AutotekaReportLink(new ReportDetails(reportGenerationDetails.getAutotekaX(), str, reportGenerationDetails.getFromBlock(), null)), null, null, 6);
                return InterfaceC15036b.a.f14538a;
            }
        } else if (autotekaReportGenerationInternalAction2 instanceof AutotekaReportGenerationInternalAction.OpenDeepLink) {
            b.a.a(aVar, ((AutotekaReportGenerationInternalAction.OpenDeepLink) autotekaReportGenerationInternalAction2).f97809b, null, null, 6);
        }
        return null;
    }
}
