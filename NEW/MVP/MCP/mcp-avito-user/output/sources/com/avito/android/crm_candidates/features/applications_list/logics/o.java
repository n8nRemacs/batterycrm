package com.avito.android.crm_candidates.features.applications_list.logics;

import androidx.compose.runtime.C22026a;
import com.avito.android.arch.mvi.u;
import com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction;
import com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListState;
import com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.JobCrmBannerItem;
import com.avito.android.crm_candidates.view.list_items.applications_list.error_item.JobCrmErrorItem;
import com.avito.android.crm_candidates.view.list_items.applications_list.loading_item.JobCrmLoadingItem;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmApplicationsListReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/logics/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListState;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o implements u<JobCrmApplicationsListInternalAction, JobCrmApplicationsListState> {

    /* compiled from: JobCrmApplicationsListReducer.kt */
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
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                JobCrmApplicationsListInternalAction.LoadType loadType3 = JobCrmApplicationsListInternalAction.LoadType.f129480b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                JobCrmApplicationsListInternalAction.LoadType loadType4 = JobCrmApplicationsListInternalAction.LoadType.f129480b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final JobCrmApplicationsListState a(JobCrmApplicationsListInternalAction jobCrmApplicationsListInternalAction, JobCrmApplicationsListState jobCrmApplicationsListState) {
        JobCrmApplicationsListState jobCrmApplicationsListStateA;
        JobCrmApplicationsListInternalAction jobCrmApplicationsListInternalAction2 = jobCrmApplicationsListInternalAction;
        JobCrmApplicationsListState jobCrmApplicationsListState2 = jobCrmApplicationsListState;
        boolean z12 = jobCrmApplicationsListInternalAction2 instanceof JobCrmApplicationsListInternalAction.ShowLoading;
        List<ParcelableItem> list = jobCrmApplicationsListState2.f129501f;
        if (z12) {
            int iOrdinal = ((JobCrmApplicationsListInternalAction.ShowLoading) jobCrmApplicationsListInternalAction2).f129492d.ordinal();
            if (iOrdinal == 0) {
                return p.c(null, 29);
            }
            if (iOrdinal == 1) {
                return JobCrmApplicationsListState.a(jobCrmApplicationsListState2, true, null, 27);
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3 || iOrdinal == 4) {
                    return jobCrmApplicationsListState2;
                }
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList = new ArrayList(list);
            if (!arrayList.isEmpty() && (C42745f0.Q(arrayList) instanceof JobCrmErrorItem)) {
                C22026a.e(1, arrayList);
            }
            if (arrayList.isEmpty() || !(C42745f0.Q(arrayList) instanceof JobCrmLoadingItem)) {
                arrayList.add(new JobCrmLoadingItem(((ParcelableItem) C42745f0.Q(arrayList)).getF130049b(), true, null, 4, null));
            }
            G0 g02 = G0.f406611a;
            return JobCrmApplicationsListState.a(jobCrmApplicationsListState2, false, arrayList, 15);
        }
        if (jobCrmApplicationsListInternalAction2 instanceof JobCrmApplicationsListInternalAction.ShowContent) {
            JobCrmApplicationsListInternalAction.ShowContent showContent = (JobCrmApplicationsListInternalAction.ShowContent) jobCrmApplicationsListInternalAction2;
            int iOrdinal2 = showContent.f129487b.ordinal();
            List<ParcelableItem> list2 = showContent.f129488c;
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                jobCrmApplicationsListStateA = p.a(p.c(list2.isEmpty() ? JobCrmApplicationsListState.ListState.f129503c : JobCrmApplicationsListState.ListState.f129502b, 30), list2);
            } else if (iOrdinal2 == 2) {
                jobCrmApplicationsListStateA = p.a(jobCrmApplicationsListState2, list2);
            } else {
                if (iOrdinal2 != 3 && iOrdinal2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                jobCrmApplicationsListStateA = p.b(jobCrmApplicationsListState2, (ParcelableItem) C42745f0.E(list2));
            }
            return jobCrmApplicationsListStateA;
        }
        if (!(jobCrmApplicationsListInternalAction2 instanceof JobCrmApplicationsListInternalAction.ShowError)) {
            if (!(jobCrmApplicationsListInternalAction2 instanceof JobCrmApplicationsListInternalAction.CloseBanner)) {
                return jobCrmApplicationsListInternalAction2 instanceof JobCrmApplicationsListInternalAction.UpdateItemContents ? p.b(jobCrmApplicationsListState2, ((JobCrmApplicationsListInternalAction.UpdateItemContents) jobCrmApplicationsListInternalAction2).f129496b) : jobCrmApplicationsListState2;
            }
            ArrayList arrayList2 = new ArrayList(list);
            Iterator it = arrayList2.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (((ParcelableItem) it.next()) instanceof JobCrmBannerItem) {
                    break;
                }
                i12++;
            }
            if (i12 != -1) {
                arrayList2.remove(i12);
            }
            G0 g03 = G0.f406611a;
            return JobCrmApplicationsListState.a(jobCrmApplicationsListState2, false, arrayList2, 15);
        }
        int iOrdinal3 = ((JobCrmApplicationsListInternalAction.ShowError) jobCrmApplicationsListInternalAction2).f129489b.ordinal();
        if (iOrdinal3 == 0) {
            return p.c(null, 23);
        }
        if (iOrdinal3 == 1) {
            return JobCrmApplicationsListState.a(jobCrmApplicationsListState2, false, null, 27);
        }
        if (iOrdinal3 != 2) {
            if (iOrdinal3 == 3 || iOrdinal3 == 4) {
                return jobCrmApplicationsListState2;
            }
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList3 = new ArrayList(list);
        if (!arrayList3.isEmpty() && (C42745f0.Q(arrayList3) instanceof JobCrmLoadingItem)) {
            C22026a.e(1, arrayList3);
        }
        arrayList3.add(new JobCrmErrorItem(((ParcelableItem) C42745f0.Q(arrayList3)).getF130049b(), null, 2, null));
        G0 g04 = G0.f406611a;
        return JobCrmApplicationsListState.a(jobCrmApplicationsListState2, false, arrayList3, 15);
    }
}
