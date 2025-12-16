package com.avito.android.crm_candidates.features.notes_list.logics;

import com.avito.android.arch.mvi.u;
import com.avito.android.crm_candidates.features.notes_list.entity.JobCrmNotesListInternalAction;
import com.avito.android.crm_candidates.features.notes_list.entity.JobCrmNotesListState;
import com.avito.android.crm_candidates.view.list_items.notes_list.JobCrmNoteItem;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmNotesListReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_candidates/features/notes_list/logics/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/crm_candidates/features/notes_list/entity/JobCrmNotesListInternalAction;", "Lcom/avito/android/crm_candidates/features/notes_list/entity/JobCrmNotesListState;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements u<JobCrmNotesListInternalAction, JobCrmNotesListState> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final JobCrmNotesListState a(JobCrmNotesListInternalAction jobCrmNotesListInternalAction, JobCrmNotesListState jobCrmNotesListState) {
        JobCrmNotesListInternalAction jobCrmNotesListInternalAction2 = jobCrmNotesListInternalAction;
        JobCrmNotesListState jobCrmNotesListState2 = jobCrmNotesListState;
        if (!(jobCrmNotesListInternalAction2 instanceof JobCrmNotesListInternalAction.ShowContent)) {
            if (jobCrmNotesListInternalAction2 instanceof JobCrmNotesListInternalAction.AddNewNote) {
                return jobCrmNotesListState2;
            }
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList = ((JobCrmNotesListInternalAction.ShowContent) jobCrmNotesListInternalAction2).f129703b;
        boolean z12 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((JobCrmNoteItem) it.next()).f130167f) {
                    z12 = true;
                    break;
                }
            }
        }
        return new JobCrmNotesListState(arrayList, !z12);
    }
}
