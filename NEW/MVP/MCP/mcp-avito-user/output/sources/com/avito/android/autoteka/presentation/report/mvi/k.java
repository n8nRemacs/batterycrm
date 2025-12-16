package com.avito.android.autoteka.presentation.report.mvi;

import Pf.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.autoteka.analytics.event.report.ReportButtons;
import com.avito.android.autoteka.deeplinks.ReportDetails;
import com.avito.android.autoteka.presentation.report.mvi.entity.AutotekaReportInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaReportOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/report/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction;", "LPf/b;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements t<AutotekaReportInternalAction, Pf.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.a f97751b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ReportDetails f97752c;

    @Inject
    public k(@Y61.k com.avito.android.autoteka.data.a aVar, @Y61.k ReportDetails reportDetails) {
        this.f97751b = aVar;
        this.f97752c = reportDetails;
    }

    @Override // com.avito.android.arch.mvi.t
    public final Pf.b b(AutotekaReportInternalAction autotekaReportInternalAction) {
        AutotekaReportInternalAction autotekaReportInternalAction2 = autotekaReportInternalAction;
        boolean z12 = autotekaReportInternalAction2 instanceof AutotekaReportInternalAction.ShareReport;
        com.avito.android.autoteka.data.a aVar = this.f97751b;
        if (z12) {
            AutotekaReportInternalAction.ShareReport shareReport = (AutotekaReportInternalAction.ShareReport) autotekaReportInternalAction2;
            aVar.k(shareReport.f97730d, ReportButtons.f96097d, shareReport.f97729c);
            return new b.c(shareReport.f97728b);
        }
        if (!(autotekaReportInternalAction2 instanceof AutotekaReportInternalAction.DownloadPdf)) {
            if (autotekaReportInternalAction2 instanceof AutotekaReportInternalAction.OpenAuthScreen) {
                return b.C0857b.f13216a;
            }
            return null;
        }
        ReportDetails reportDetails = this.f97752c;
        aVar.k(reportDetails.getAutotekaX(), ReportButtons.f96096c, reportDetails.getReportPublicId());
        AutotekaReportInternalAction.DownloadPdf downloadPdf = (AutotekaReportInternalAction.DownloadPdf) autotekaReportInternalAction2;
        return new b.a(downloadPdf.f97723c, downloadPdf.f97722b);
    }
}
