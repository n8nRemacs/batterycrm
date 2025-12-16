package com.avito.android.job.survey_vacancy_reliability;

import android.content.Context;
import com.avito.android.survey_vacancy_reliability.JobSurveyVacancyReliabilityLink;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobSurveyVacancyReliabilityDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "(Landroid/content/Context;)Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a extends N implements Y41.l<Context, com.avito.android.lib.design.bottom_sheet.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f174677l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ JobSurveyVacancyReliabilityLink f174678m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, JobSurveyVacancyReliabilityLink jobSurveyVacancyReliabilityLink) {
        super(1);
        this.f174677l = bVar;
        this.f174678m = jobSurveyVacancyReliabilityLink;
    }

    @Override // Y41.l
    public final com.avito.android.lib.design.bottom_sheet.d invoke(Context context) {
        b bVar = this.f174677l;
        String strA = bVar.f174682g.a();
        String f253025a = bVar.f174681f.getF253025a();
        JobSurveyVacancyReliabilityLink jobSurveyVacancyReliabilityLink = this.f174678m;
        return new h(context, bVar.f174680e, strA, f253025a, jobSurveyVacancyReliabilityLink.f292520b, jobSurveyVacancyReliabilityLink.f292521c);
    }
}
