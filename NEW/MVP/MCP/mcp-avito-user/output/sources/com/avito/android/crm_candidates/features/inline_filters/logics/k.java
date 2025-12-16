package com.avito.android.crm_candidates.features.inline_filters.logics;

import Ss.InterfaceC15218a;
import Ts.InterfaceC15402b;
import Us.InterfaceC15563a;
import com.avito.android.arch.mvi.t;
import com.avito.android.crm_candidates.features.full_filters.entity.FilterItem;
import com.avito.android.crm_candidates.features.inline_filters.entity.JobCrmInlineFiltersInternalAction;
import com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmInlineFiltersOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/features/inline_filters/logics/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction;", "LTs/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements t<JobCrmInlineFiltersInternalAction, InterfaceC15402b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15218a f129664b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15563a f129665c;

    /* compiled from: JobCrmInlineFiltersOneTimeEventProducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129666a;

        static {
            int[] iArr = new int[JobCrmInlineFilterItem.FilterType.values().length];
            try {
                JobCrmInlineFilterItem.FilterType filterType = JobCrmInlineFilterItem.FilterType.f130108c;
                iArr[9] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                JobCrmInlineFilterItem.FilterType filterType2 = JobCrmInlineFilterItem.FilterType.f130108c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                JobCrmInlineFilterItem.FilterType filterType3 = JobCrmInlineFilterItem.FilterType.f130108c;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                JobCrmInlineFilterItem.FilterType filterType4 = JobCrmInlineFilterItem.FilterType.f130108c;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                JobCrmInlineFilterItem.FilterType filterType5 = JobCrmInlineFilterItem.FilterType.f130108c;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                JobCrmInlineFilterItem.FilterType filterType6 = JobCrmInlineFilterItem.FilterType.f130108c;
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                JobCrmInlineFilterItem.FilterType filterType7 = JobCrmInlineFilterItem.FilterType.f130108c;
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                JobCrmInlineFilterItem.FilterType filterType8 = JobCrmInlineFilterItem.FilterType.f130108c;
                iArr[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                JobCrmInlineFilterItem.FilterType filterType9 = JobCrmInlineFilterItem.FilterType.f130108c;
                iArr[7] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                JobCrmInlineFilterItem.FilterType filterType10 = JobCrmInlineFilterItem.FilterType.f130108c;
                iArr[8] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f129666a = iArr;
        }
    }

    @Inject
    public k(@Y61.k InterfaceC15218a interfaceC15218a, @Y61.k InterfaceC15563a interfaceC15563a) {
        this.f129664b = interfaceC15218a;
        this.f129665c = interfaceC15563a;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15402b b(JobCrmInlineFiltersInternalAction jobCrmInlineFiltersInternalAction) {
        FilterItem.FilterType filterType;
        JobCrmInlineFiltersInternalAction jobCrmInlineFiltersInternalAction2 = jobCrmInlineFiltersInternalAction;
        if (jobCrmInlineFiltersInternalAction2 instanceof JobCrmInlineFiltersInternalAction.ShowError) {
            return InterfaceC15402b.a.f15959a;
        }
        if (!(jobCrmInlineFiltersInternalAction2 instanceof JobCrmInlineFiltersInternalAction.OpenFilterInput)) {
            return null;
        }
        JobCrmInlineFiltersInternalAction.OpenFilterInput openFilterInput = (JobCrmInlineFiltersInternalAction.OpenFilterInput) jobCrmInlineFiltersInternalAction2;
        JobCrmInlineFilterItem jobCrmInlineFilterItem = openFilterInput.f129627b;
        if (a.f129666a[jobCrmInlineFilterItem.f130104c.ordinal()] != 1) {
            return new InterfaceC15402b.C1086b(jobCrmInlineFilterItem);
        }
        List<JobCrmInlineFilterItem> list = openFilterInput.f129628c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((JobCrmInlineFilterItem) obj).f130104c != JobCrmInlineFilterItem.FilterType.f130116k) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            JobCrmInlineFilterItem jobCrmInlineFilterItem2 = (JobCrmInlineFilterItem) it.next();
            String str = jobCrmInlineFilterItem2.f130103b;
            switch (jobCrmInlineFilterItem2.f130104c.ordinal()) {
                case 0:
                    filterType = FilterItem.FilterType.f129569c;
                    break;
                case 1:
                    filterType = FilterItem.FilterType.f129568b;
                    break;
                case 2:
                    filterType = FilterItem.FilterType.f129570d;
                    break;
                case 3:
                    filterType = FilterItem.FilterType.f129570d;
                    break;
                case 4:
                    filterType = FilterItem.FilterType.f129570d;
                    break;
                case 5:
                    filterType = FilterItem.FilterType.f129570d;
                    break;
                case 6:
                    filterType = FilterItem.FilterType.f129571e;
                    break;
                case 7:
                    filterType = FilterItem.FilterType.f129572f;
                    break;
                case 8:
                    filterType = FilterItem.FilterType.f129569c;
                    break;
                case 9:
                    filterType = FilterItem.FilterType.f129569c;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(new FilterItem(str, filterType, jobCrmInlineFilterItem2.f130107f, this.f129665c.c(jobCrmInlineFilterItem2.f130103b)));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        JobCrmListFilterItem jobCrmListFilterItemD = this.f129664b.d();
        if (jobCrmListFilterItemD != null) {
            arrayList3.add(new FilterItem(jobCrmListFilterItemD.f130144j, FilterItem.FilterType.f129571e, jobCrmListFilterItemD.f130136b, Collections.singletonList(jobCrmListFilterItemD)));
        }
        return new InterfaceC15402b.c(arrayList3);
    }
}
