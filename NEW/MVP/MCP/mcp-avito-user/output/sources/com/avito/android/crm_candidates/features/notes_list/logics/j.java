package com.avito.android.crm_candidates.features.notes_list.logics;

import Ws.InterfaceC15795b;
import com.avito.android.arch.mvi.t;
import com.avito.android.crm_candidates.features.notes_list.entity.JobCrmNotesListInternalAction;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: JobCrmNotesListOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/features/notes_list/logics/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/crm_candidates/features/notes_list/entity/JobCrmNotesListInternalAction;", "LWs/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements t<JobCrmNotesListInternalAction, InterfaceC15795b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f129725b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f129726c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f129727d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f129728e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f129729f;

    @Inject
    public j(@Y61.k @Named("CANDIDATE_NAME") String str, @Y61.k @Named("APPLICANT_ID") String str2, @Y61.k @Named("APPLICATION_ID") String str3, @Y61.l @Named("VACANCY_ID") String str4, @Y61.l @Named("CV_ID") String str5) {
        this.f129725b = str;
        this.f129726c = str2;
        this.f129727d = str3;
        this.f129728e = str4;
        this.f129729f = str5;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15795b b(JobCrmNotesListInternalAction jobCrmNotesListInternalAction) {
        JobCrmNotesListInternalAction jobCrmNotesListInternalAction2 = jobCrmNotesListInternalAction;
        if (!(jobCrmNotesListInternalAction2 instanceof JobCrmNotesListInternalAction.AddNewNote)) {
            return null;
        }
        return new InterfaceC15795b.a(((JobCrmNotesListInternalAction.AddNewNote) jobCrmNotesListInternalAction2).f129702b, this.f129725b, this.f129726c, this.f129727d, this.f129728e, this.f129729f);
    }
}
