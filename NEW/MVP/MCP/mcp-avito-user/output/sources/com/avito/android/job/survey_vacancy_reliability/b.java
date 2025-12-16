package com.avito.android.job.survey_vacancy_reliability;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.H;
import com.avito.android.survey_vacancy_reliability.JobSurveyVacancyReliabilityLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: JobSurveyVacancyReliabilityDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/survey_vacancy_reliability/b;", "Lev/b;", "Lcom/avito/android/survey_vacancy_reliability/JobSurveyVacancyReliabilityLink;", "_avito_job_survey-vacancy-reliability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC40162b<JobSurveyVacancyReliabilityLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.d f174679d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f174680e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final H f174681f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final E f174682g;

    @Inject
    public b(@Y61.k a.d dVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k H h12, @Y61.k E e12) {
        this.f174679d = dVar;
        this.f174680e = interfaceC28373a;
        this.f174681f = h12;
        this.f174682g = e12;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f174679d.k0(new a(this, (JobSurveyVacancyReliabilityLink) deepLink));
        return AbstractC14250d.c.f9171c;
    }
}
