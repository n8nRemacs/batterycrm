package com.avito.android.crm_candidates.domain;

import Qs.C14929b;
import com.avito.android.crm_candidates.features.full_filters.entity.FilterItem;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem;
import com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.JobCrmBannerItem;
import com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import com.avito.android.job.crm_candidates_public.generated.api.api_view_counters_v_3.ApiViewCountersV3Response;
import jP.C42292a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import lP.C43667a;
import mP.C43991c;
import nP.C44308d;
import oP.C44674a;

/* compiled from: JobCrmCandidatesMapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/domain/o;", "", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface o {
    @Y61.k
    JobCrmApplicationItem a(@Y61.k JobCrmApplicationItem jobCrmApplicationItem, @Y61.k C44674a c44674a);

    @Y61.k
    List<JobCrmListFilterItem> b(@Y61.k kP.o oVar);

    @Y61.k
    JobCrmApplicationItem c(@Y61.k C42292a c42292a);

    @Y61.k
    List<JobCrmListFilterItem> d(@Y61.k kP.o oVar);

    @Y61.k
    List<FilterItem> e(@Y61.k kP.o oVar, @Y61.k List<FilterItem> list);

    @Y61.k
    List<JobCrmListFilterItem> f(@Y61.k kP.o oVar);

    @Y61.k
    JobCrmApplicationItem g(@Y61.k C44308d c44308d);

    @Y61.l
    JobCrmListFilterItem h(@Y61.k ArrayList arrayList);

    @Y61.k
    JobCrmBannerItem i(@Y61.k C43667a c43667a);

    @Y61.k
    List<JobCrmListFilterItem> j(@Y61.k kP.o oVar);

    @Y61.k
    List<JobCrmListFilterItem> k(@Y61.k kP.o oVar);

    @Y61.k
    List l(@Y61.k String str, @Y61.k ArrayList arrayList);

    @Y61.k
    ArrayList m(@Y61.k ArrayList arrayList);

    @Y61.k
    List<JobCrmListFilterItem> n(@Y61.k kP.o oVar);

    @Y61.k
    ArrayList o(@Y61.k C43991c c43991c);

    @Y61.l
    JobCrmListFilterItem p(@Y61.k kP.o oVar);

    @Y61.k
    List<JobCrmInlineFilterItem> q(@Y61.k kP.o oVar);

    @Y61.k
    List<JobCrmListFilterItem> r(@Y61.k kP.o oVar);

    @Y61.k
    C14929b s(@Y61.k ApiViewCountersV3Response apiViewCountersV3Response);
}
