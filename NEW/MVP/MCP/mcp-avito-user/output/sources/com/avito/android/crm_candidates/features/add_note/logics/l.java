package com.avito.android.crm_candidates.features.add_note.logics;

import com.avito.android.arch.mvi.u;
import com.avito.android.crm_candidates.features.add_note.entity.JobCrmAddNoteInternalAction;
import com.avito.android.crm_candidates.features.add_note.entity.JobCrmAddNoteState;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;

/* compiled from: JobCrmAddNoteReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/features/add_note/logics/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction;", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteState;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements u<JobCrmAddNoteInternalAction, JobCrmAddNoteState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f129476b;

    @Inject
    public l(@Y61.k @Named("NOTE_TEXT") String str) {
        this.f129476b = str;
    }

    @Override // com.avito.android.arch.mvi.u
    public final JobCrmAddNoteState a(JobCrmAddNoteInternalAction jobCrmAddNoteInternalAction, JobCrmAddNoteState jobCrmAddNoteState) {
        JobCrmAddNoteInternalAction jobCrmAddNoteInternalAction2 = jobCrmAddNoteInternalAction;
        JobCrmAddNoteState jobCrmAddNoteState2 = jobCrmAddNoteState;
        if (jobCrmAddNoteInternalAction2 instanceof JobCrmAddNoteInternalAction.ShowLoading) {
            return JobCrmAddNoteState.a(jobCrmAddNoteState2, false, true, 1);
        }
        if (jobCrmAddNoteInternalAction2 instanceof JobCrmAddNoteInternalAction.ChangesSaved) {
            return JobCrmAddNoteState.a(jobCrmAddNoteState2, false, false, 1);
        }
        if (jobCrmAddNoteInternalAction2 instanceof JobCrmAddNoteInternalAction.NoteInputChange) {
            String str = ((JobCrmAddNoteInternalAction.NoteInputChange) jobCrmAddNoteInternalAction2).f129424b;
            return JobCrmAddNoteState.a(jobCrmAddNoteState2, (C43066x.K(str) || str.equals(this.f129476b)) ? false : true, false, 2);
        }
        if (jobCrmAddNoteInternalAction2 instanceof JobCrmAddNoteInternalAction.ShowError) {
            return JobCrmAddNoteState.a(jobCrmAddNoteState2, false, false, 1);
        }
        if (jobCrmAddNoteInternalAction2 instanceof JobCrmAddNoteInternalAction.SetData) {
            return jobCrmAddNoteState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
