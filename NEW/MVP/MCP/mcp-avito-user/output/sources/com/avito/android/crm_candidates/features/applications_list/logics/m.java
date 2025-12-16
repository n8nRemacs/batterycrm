package com.avito.android.crm_candidates.features.applications_list.logics;

import Ps.InterfaceC14834b;
import com.avito.android.arch.mvi.t;
import com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: JobCrmApplicationsListOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/logics/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction;", "LPs/b;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements t<JobCrmApplicationsListInternalAction, InterfaceC14834b> {

    /* compiled from: JobCrmApplicationsListOneTimeEventProducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[JobCrmApplicationsListInternalAction.LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                JobCrmApplicationsListInternalAction.LoadType loadType = JobCrmApplicationsListInternalAction.LoadType.f129480b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                JobCrmApplicationsListInternalAction.LoadType loadType2 = JobCrmApplicationsListInternalAction.LoadType.f129480b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                JobCrmApplicationsListInternalAction.LoadType loadType3 = JobCrmApplicationsListInternalAction.LoadType.f129480b;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14834b b(JobCrmApplicationsListInternalAction jobCrmApplicationsListInternalAction) {
        JobCrmApplicationsListInternalAction jobCrmApplicationsListInternalAction2 = jobCrmApplicationsListInternalAction;
        if (jobCrmApplicationsListInternalAction2 instanceof JobCrmApplicationsListInternalAction.ShowContent) {
            int iOrdinal = ((JobCrmApplicationsListInternalAction.ShowContent) jobCrmApplicationsListInternalAction2).f129487b.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 3 || iOrdinal == 4) {
                return InterfaceC14834b.C0873b.f13359a;
            }
            return null;
        }
        if (jobCrmApplicationsListInternalAction2 instanceof JobCrmApplicationsListInternalAction.ShowResults) {
            JobCrmApplicationsListInternalAction.ShowResults showResults = (JobCrmApplicationsListInternalAction.ShowResults) jobCrmApplicationsListInternalAction2;
            return new InterfaceC14834b.d(showResults.f129494b, showResults.f129495c);
        }
        if (!(jobCrmApplicationsListInternalAction2 instanceof JobCrmApplicationsListInternalAction.ShowError)) {
            if (jobCrmApplicationsListInternalAction2 instanceof JobCrmApplicationsListInternalAction.UpdateItemContents) {
                return InterfaceC14834b.C0873b.f13359a;
            }
            if (jobCrmApplicationsListInternalAction2 instanceof JobCrmApplicationsListInternalAction.ShowOptions) {
                return new InterfaceC14834b.c(((JobCrmApplicationsListInternalAction.ShowOptions) jobCrmApplicationsListInternalAction2).f129493b);
            }
            return null;
        }
        int iOrdinal2 = ((JobCrmApplicationsListInternalAction.ShowError) jobCrmApplicationsListInternalAction2).f129489b.ordinal();
        if (iOrdinal2 == 1 || iOrdinal2 == 3 || iOrdinal2 == 4) {
            return InterfaceC14834b.a.f13358a;
        }
        return null;
    }
}
