package com.avito.android.job.survey_vacancy_reliability;

import com.avito.android.survey_vacancy_reliability.JobSurveyVacancyReliabilityLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: JobSurveyVacancyReliabilityDeeplinkModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f174688a;

    public e(c cVar) {
        this.f174688a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = this.f174688a;
        d.f174687a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(JobSurveyVacancyReliabilityLink.class, new f(), new C43834a.b.C11809b(cVar));
    }
}
