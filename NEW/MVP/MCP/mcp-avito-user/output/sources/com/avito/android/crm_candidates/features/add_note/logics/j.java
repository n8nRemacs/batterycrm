package com.avito.android.crm_candidates.features.add_note.logics;

import Ns.InterfaceC14607b;
import com.avito.android.arch.mvi.t;
import com.avito.android.crm_candidates.features.add_note.entity.JobCrmAddNoteInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: JobCrmAddNoteOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_candidates/features/add_note/logics/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction;", "LNs/b;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements t<JobCrmAddNoteInternalAction, InterfaceC14607b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14607b b(JobCrmAddNoteInternalAction jobCrmAddNoteInternalAction) {
        JobCrmAddNoteInternalAction jobCrmAddNoteInternalAction2 = jobCrmAddNoteInternalAction;
        if (jobCrmAddNoteInternalAction2 instanceof JobCrmAddNoteInternalAction.ChangesSaved) {
            return new InterfaceC14607b.c(((JobCrmAddNoteInternalAction.ChangesSaved) jobCrmAddNoteInternalAction2).f129423b);
        }
        if (jobCrmAddNoteInternalAction2 instanceof JobCrmAddNoteInternalAction.ShowError) {
            return InterfaceC14607b.C0767b.f11779a;
        }
        if (!(jobCrmAddNoteInternalAction2 instanceof JobCrmAddNoteInternalAction.SetData)) {
            return null;
        }
        JobCrmAddNoteInternalAction.SetData setData = (JobCrmAddNoteInternalAction.SetData) jobCrmAddNoteInternalAction2;
        return new InterfaceC14607b.a(setData.f129425b, setData.f129426c, setData.f129427d);
    }
}
