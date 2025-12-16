package com.avito.android.job.survey_vacancy_reliability;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: JobSurveyVacancyReliabilitySendEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/survey_vacancy_reliability/k;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_job_survey-vacancy-reliability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f174710b;

    public k(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7) {
        this.f174710b = new ParametrizedClickStreamEvent(12590, 1, P0.g(new Q("uid", str == null ? "" : str), new Q("u", str2 == null ? "" : str2), new Q("oid", str3 == null ? "" : str3), new Q("iid", str4 == null ? "" : str4), new Q("business_platform", "3"), new Q("survey_vacancy_reliability", str5), new Q("survey_vacancy_mismatch", str6), new Q("survey_vacancy_problem_descr", str7 != null ? str7 : "")), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f174710b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f174710b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f174710b.f90248c;
    }
}
