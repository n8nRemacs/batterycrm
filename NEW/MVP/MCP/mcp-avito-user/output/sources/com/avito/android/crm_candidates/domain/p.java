package com.avito.android.crm_candidates.domain;

import Qs.C14929b;
import com.avito.android.R;
import com.avito.android.crm_candidates.domain.r;
import com.avito.android.crm_candidates.features.full_filters.entity.FilterItem;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.Badge;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.Enrichment;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.Note;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.Property;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.Vacancy;
import com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.JobCrmBannerItem;
import com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.job.crm_candidates_public.generated.api.api_apply_action_v_3.JobApplicationApiBadgesV3;
import com.avito.android.job.crm_candidates_public.generated.api.api_apply_action_v_3.JobApplicationChatbotResultV3EnrichedPropertiesItem;
import com.avito.android.job.crm_candidates_public.generated.api.api_apply_action_v_3.JobApplicationChatbotResultV3Overview;
import com.avito.android.job.crm_candidates_public.generated.api.api_apply_action_v_3.JobApplicationEnrichmentV3EnrichedPropertiesItem;
import com.avito.android.job.crm_candidates_public.generated.api.api_apply_action_v_3.JobApplicationEnrichmentV3Overview;
import com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationApiBadgesV3;
import com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationChatbotResultV3Overview;
import com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationEnrichmentV3Overview;
import com.avito.android.job.crm_candidates_public.generated.api.api_put_applicant_note.JobApplicationApiBadgesV3;
import com.avito.android.job.crm_candidates_public.generated.api.api_put_applicant_note.JobApplicationChatbotResultV3Overview;
import com.avito.android.job.crm_candidates_public.generated.api.api_put_applicant_note.JobApplicationEnrichmentV3Overview;
import com.avito.android.job.crm_candidates_public.generated.api.api_view_counters_v_3.ApiViewCountersV3Response;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.util.V2;
import jP.C42292a;
import jP.C42293b;
import jP.C42294c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kP.C42613a;
import kP.C42614b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import lP.C43667a;
import mP.C43989a;
import mP.C43990b;
import mP.C43991c;
import mP.C43993e;
import mP.C43994f;
import mP.C43995g;
import mP.C43996h;
import mP.C43997i;
import nP.C44306b;
import nP.C44307c;
import nP.C44308d;
import nP.C44310f;
import nP.C44311g;
import nP.C44312h;
import nP.C44313i;
import oP.C44674a;
import oP.C44675b;

/* compiled from: JobCrmCandidatesMapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/domain/p;", "Lcom/avito/android/crm_candidates/domain/o;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.b f129417a;

    /* compiled from: JobCrmCandidatesMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129418a;

        static {
            int[] iArr = new int[ApiViewCountersV3Response.Type.values().length];
            try {
                iArr[ApiViewCountersV3Response.Type.Viewed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiViewCountersV3Response.Type.Unviewed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f129418a = iArr;
        }
    }

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(Integer.valueOf(((JobCrmInlineFilterItem) t12).f130104c.f130119b), Integer.valueOf(((JobCrmInlineFilterItem) t13).f130104c.f130119b));
        }
    }

    @Inject
    public p(@Y61.k com.avito.android.date_time_formatter.b bVar) {
        this.f129417a = bVar;
    }

    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    public final JobCrmApplicationItem a(@Y61.k JobCrmApplicationItem jobCrmApplicationItem, @Y61.k C44674a c44674a) {
        C44675b c44675b = (C44675b) C42745f0.G(c44674a.a());
        return new JobCrmApplicationItem(jobCrmApplicationItem.f130004b, jobCrmApplicationItem.f130005c, jobCrmApplicationItem.f130006d, jobCrmApplicationItem.f130007e, c44675b != null ? c44675b.getIsViewed() : false, jobCrmApplicationItem.f130009g, jobCrmApplicationItem.f130010h, jobCrmApplicationItem.f130011i, jobCrmApplicationItem.f130012j, jobCrmApplicationItem.f130013k, jobCrmApplicationItem.f130014l, jobCrmApplicationItem.f130015m, jobCrmApplicationItem.f130016n, jobCrmApplicationItem.f130017o, jobCrmApplicationItem.f130018p, jobCrmApplicationItem.f130019q, jobCrmApplicationItem.f130020r, jobCrmApplicationItem.f130021s);
    }

    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    public final List<JobCrmListFilterItem> b(@Y61.k kP.o oVar) {
        List<kP.h> listA = oVar.a();
        if (listA == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (kP.h hVar : listA) {
            if (L.f(hVar.getWidget().getType(), "crmStatusSelect")) {
                List<kP.f> listB = hVar.b();
                G0 g02 = null;
                if (listB != null) {
                    kP.g selectedOption = hVar.getSelectedOption();
                    kP.k valueStatus = selectedOption != null ? selectedOption.getValueStatus() : null;
                    if (valueStatus == null) {
                        V2.f318762a.d("JobCrmCandidatesMapper", "Crm status filter has empty selected option.");
                        return C42784z0.f406748b;
                    }
                    for (kP.f fVar : listB) {
                        kP.k valueStatus2 = fVar.getValueStatus();
                        if (valueStatus2 == null) {
                            V2.f318762a.d("JobCrmCandidatesMapper", "Crm status filter has empty value.");
                            return C42784z0.f406748b;
                        }
                        arrayList.add(new JobCrmListFilterItem(fVar.getTitle(), "", String.valueOf(valueStatus2.getCount()), L.f(valueStatus2.getId(), valueStatus.getId()), false, false, null, null, valueStatus2.getId(), 128, null));
                    }
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    V2.f318762a.d("JobCrmCandidatesMapper", "Empty options list when mapping status filter.");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    public final JobCrmApplicationItem c(@Y61.k C42292a c42292a) {
        DeepLink deepLink;
        DeepLink deepLink2;
        DeepLink deepLink3;
        DeepLink deepLink4;
        C42784z0 c42784z0;
        C42784z0 c42784z02;
        Vacancy vacancy;
        Enrichment enrichment;
        Enrichment enrichment2;
        List<C42293b> listC = c42292a.c();
        if (listC != null) {
            DeepLink deepLink5 = null;
            DeepLink deepLink6 = null;
            DeepLink deepLink7 = null;
            DeepLink deepLink8 = null;
            for (C42293b c42293b : listC) {
                C42294c value = c42293b.getValue();
                DeepLink uri = value != null ? value.getUri() : null;
                String type = c42293b.getType();
                if (type != null) {
                    switch (type.hashCode()) {
                        case -1436108013:
                            if (type.equals(NotificationsSettings.Section.SECTION_MESSENGER)) {
                                deepLink6 = uri;
                                break;
                            } else {
                                break;
                            }
                        case -934426579:
                            if (type.equals("resume")) {
                                deepLink7 = uri;
                                break;
                            } else {
                                break;
                            }
                        case -892481550:
                            if (type.equals("status")) {
                                deepLink8 = uri;
                                break;
                            } else {
                                break;
                            }
                        case 106642798:
                            if (type.equals("phone")) {
                                deepLink5 = uri;
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
            deepLink = deepLink5;
            deepLink2 = deepLink6;
            deepLink3 = deepLink7;
            deepLink4 = deepLink8;
        } else {
            deepLink = null;
            deepLink2 = null;
            deepLink3 = null;
            deepLink4 = null;
        }
        String name = c42292a.getApplicant().getName();
        List<String> listA = c42292a.getApplicant().a();
        if (listA == null) {
            listA = C42784z0.f406748b;
        }
        List<String> list = listA;
        String price = c42292a.getPrice();
        if (price == null) {
            price = "";
        }
        String str = price;
        String strA = this.f129417a.a(Long.valueOf(c42292a.getCreated()), TimeUnit.SECONDS);
        boolean isViewed = c42292a.getIsViewed();
        List<JobApplicationApiBadgesV3> listB = c42292a.b();
        if (listB != null) {
            List<JobApplicationApiBadgesV3> list2 = listB;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (JobApplicationApiBadgesV3 jobApplicationApiBadgesV3 : list2) {
                String text = jobApplicationApiBadgesV3.getText();
                DockingBadgeType.Predefined predefinedA = r.a(jobApplicationApiBadgesV3.getColor().f173964b);
                JobApplicationApiBadgesV3.Icon icon = jobApplicationApiBadgesV3.getIcon();
                arrayList.add(new Badge(text, predefinedA, (icon == null ? -1 : r.a.f129420a[icon.ordinal()]) == 1 ? Integer.valueOf(R.attr.textIconDone) : null));
            }
            c42784z0 = arrayList;
        } else {
            c42784z0 = C42784z0.f406748b;
        }
        List<jP.h> listC2 = c42292a.getApplicant().c();
        if (listC2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (jP.h hVar : listC2) {
                Long managerId = hVar.getManagerId();
                String managerName = hVar.getManagerName();
                String text2 = hVar.getText();
                Long lB2 = r.b(hVar.getUpdatedAt());
                Note note = (managerId == null || managerName == null || text2 == null || lB2 == null) ? null : new Note(managerId.longValue(), managerName, text2, lB2.longValue());
                if (note != null) {
                    arrayList2.add(note);
                }
            }
            c42784z02 = arrayList2;
        } else {
            c42784z02 = C42784z0.f406748b;
        }
        String id2 = c42292a.getId();
        jP.e vacancy2 = c42292a.getVacancy();
        Long itemId = vacancy2.getItemId();
        Vacancy vacancy3 = itemId != null ? new Vacancy(vacancy2.getTitle(), vacancy2.getLocation(), String.valueOf(itemId.longValue())) : null;
        String resumeId = c42292a.getApplicant().getResumeId();
        String userId = c42292a.getApplicant().getUserId();
        jP.g enrichment3 = c42292a.getEnrichment();
        if (enrichment3 != null) {
            String name2 = c42292a.getApplicant().getName();
            String description = enrichment3.getDescription();
            String text3 = enrichment3.getOverview().getText();
            JobApplicationEnrichmentV3Overview.Color color = enrichment3.getOverview().getColor();
            DockingBadgeType.Predefined predefinedA2 = color != null ? r.a(color.f173978b) : null;
            String title = enrichment3.getTitle();
            List<JobApplicationEnrichmentV3EnrichedPropertiesItem> listB2 = enrichment3.b();
            ArrayList arrayList3 = new ArrayList(C42745f0.q(listB2, 10));
            Iterator it = listB2.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                JobApplicationEnrichmentV3EnrichedPropertiesItem jobApplicationEnrichmentV3EnrichedPropertiesItem = (JobApplicationEnrichmentV3EnrichedPropertiesItem) next;
                arrayList3.add(new Property(jobApplicationEnrichmentV3EnrichedPropertiesItem.getLabel(), jobApplicationEnrichmentV3EnrichedPropertiesItem.getValue(), r.a(jobApplicationEnrichmentV3EnrichedPropertiesItem.getValueColor().f173975b), AK.c.g(i12, "enrichmentProperty")));
                i12 = i13;
                it = it;
                vacancy3 = vacancy3;
            }
            vacancy = vacancy3;
            enrichment = new Enrichment(name2, description, text3, predefinedA2, title, arrayList3);
        } else {
            vacancy = vacancy3;
            enrichment = null;
        }
        jP.f chatbotResult = c42292a.getChatbotResult();
        if (chatbotResult != null) {
            String name3 = c42292a.getApplicant().getName();
            String description2 = chatbotResult.getDescription();
            String text4 = chatbotResult.getOverview().getText();
            JobApplicationChatbotResultV3Overview.Color color2 = chatbotResult.getOverview().getColor();
            DockingBadgeType.Predefined predefinedA3 = color2 != null ? r.a(color2.f173972b) : null;
            String title2 = chatbotResult.getTitle();
            List<JobApplicationChatbotResultV3EnrichedPropertiesItem> listB3 = chatbotResult.b();
            ArrayList arrayList4 = new ArrayList(C42745f0.q(listB3, 10));
            Iterator it2 = listB3.iterator();
            int i14 = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                JobApplicationChatbotResultV3EnrichedPropertiesItem jobApplicationChatbotResultV3EnrichedPropertiesItem = (JobApplicationChatbotResultV3EnrichedPropertiesItem) next2;
                arrayList4.add(new Property(jobApplicationChatbotResultV3EnrichedPropertiesItem.getLabel(), jobApplicationChatbotResultV3EnrichedPropertiesItem.getValue(), r.a(jobApplicationChatbotResultV3EnrichedPropertiesItem.getValueColor().f173969b), AK.c.g(i14, "enrichmentProperty")));
                it2 = it2;
                i14 = i15;
            }
            enrichment2 = new Enrichment(name3, description2, text4, predefinedA3, title2, arrayList4);
        } else {
            enrichment2 = null;
        }
        return new JobCrmApplicationItem(name, list, str, strA, isViewed, c42784z0, c42784z02, deepLink, deepLink2, deepLink3, deepLink4, vacancy, null, resumeId, userId, enrichment, enrichment2, id2);
    }

    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    public final List<JobCrmListFilterItem> d(@Y61.k kP.o oVar) {
        List<C42614b> listC;
        List<kP.h> listA = oVar.a();
        if (listA == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (kP.h hVar : listA) {
            if (L.f(hVar.getWidget().getType(), "crmApplicationStatusesMultiselect")) {
                List<kP.f> listB = hVar.b();
                G0 g02 = null;
                setP0 = null;
                Set setP0 = null;
                if (listB != null) {
                    kP.g selectedOption = hVar.getSelectedOption();
                    if (selectedOption != null && (listC = selectedOption.c()) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (C42614b c42614b : listC) {
                            String id2 = c42614b != null ? c42614b.getId() : null;
                            if (id2 != null) {
                                arrayList2.add(id2);
                            }
                        }
                        setP0 = C42745f0.P0(arrayList2);
                    }
                    for (kP.f fVar : listB) {
                        C42614b valueApplicationStatus = fVar.getValueApplicationStatus();
                        if (valueApplicationStatus == null) {
                            V2.f318762a.d("JobCrmCandidatesMapper", "Crm application status filter has empty value.");
                            return C42784z0.f406748b;
                        }
                        String id3 = valueApplicationStatus.getId();
                        arrayList.add(new JobCrmListFilterItem(fVar.getTitle(), "", "", setP0 != null && setP0.contains(id3), true, false, null, null, id3, 128, null));
                    }
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    V2.f318762a.d("JobCrmCandidatesMapper", "Empty options list when mapping application status filter.");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0178 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0166  */
    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.android.crm_candidates.features.full_filters.entity.FilterItem> e(@Y61.k kP.o r18, @Y61.k java.util.List<com.avito.android.crm_candidates.features.full_filters.entity.FilterItem> r19) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.domain.p.e(kP.o, java.util.List):java.util.List");
    }

    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    public final List<JobCrmListFilterItem> f(@Y61.k kP.o oVar) {
        List<kP.e> listE;
        List<kP.h> listA = oVar.a();
        if (listA == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (kP.h hVar : listA) {
            if (L.f(hVar.getWidget().getType(), "crmManagerMultiselect")) {
                List<kP.f> listB = hVar.b();
                G0 g02 = null;
                setP0 = null;
                Set setP0 = null;
                if (listB != null) {
                    kP.g selectedOption = hVar.getSelectedOption();
                    if (selectedOption != null && (listE = selectedOption.e()) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (kP.e eVar : listE) {
                            String id2 = eVar != null ? eVar.getId() : null;
                            if (id2 != null) {
                                arrayList2.add(id2);
                            }
                        }
                        setP0 = C42745f0.P0(arrayList2);
                    }
                    for (kP.f fVar : listB) {
                        kP.e valueEmployee = fVar.getValueEmployee();
                        if (valueEmployee == null) {
                            V2.f318762a.d("JobCrmCandidatesMapper", "Crm employee filter has empty value.");
                            return C42784z0.f406748b;
                        }
                        String id3 = valueEmployee.getId();
                        arrayList.add(new JobCrmListFilterItem(fVar.getTitle(), "", "", setP0 != null && setP0.contains(id3), true, false, null, null, id3, 128, null));
                    }
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    V2.f318762a.d("JobCrmCandidatesMapper", "Empty options list when mapping employee filter.");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    public final JobCrmApplicationItem g(@Y61.k C44308d c44308d) {
        DeepLink deepLink;
        DeepLink deepLink2;
        DeepLink deepLink3;
        DeepLink deepLink4;
        C42784z0 c42784z0;
        C42784z0 c42784z02;
        Vacancy vacancy;
        Enrichment enrichment;
        Enrichment enrichment2;
        List<C44306b> listC = c44308d.c();
        if (listC != null) {
            DeepLink deepLink5 = null;
            DeepLink deepLink6 = null;
            DeepLink deepLink7 = null;
            DeepLink deepLink8 = null;
            for (C44306b c44306b : listC) {
                C44307c value = c44306b.getValue();
                DeepLink uri = value != null ? value.getUri() : null;
                String type = c44306b.getType();
                if (type != null) {
                    switch (type.hashCode()) {
                        case -1436108013:
                            if (type.equals(NotificationsSettings.Section.SECTION_MESSENGER)) {
                                deepLink6 = uri;
                                break;
                            } else {
                                break;
                            }
                        case -934426579:
                            if (type.equals("resume")) {
                                deepLink7 = uri;
                                break;
                            } else {
                                break;
                            }
                        case -892481550:
                            if (type.equals("status")) {
                                deepLink8 = uri;
                                break;
                            } else {
                                break;
                            }
                        case 106642798:
                            if (type.equals("phone")) {
                                deepLink5 = uri;
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
            deepLink = deepLink5;
            deepLink2 = deepLink6;
            deepLink3 = deepLink7;
            deepLink4 = deepLink8;
        } else {
            deepLink = null;
            deepLink2 = null;
            deepLink3 = null;
            deepLink4 = null;
        }
        String name = c44308d.getApplicant().getName();
        List<String> listA = c44308d.getApplicant().a();
        if (listA == null) {
            listA = C42784z0.f406748b;
        }
        List<String> list = listA;
        String price = c44308d.getPrice();
        if (price == null) {
            price = "";
        }
        String str = price;
        String strA = this.f129417a.a(Long.valueOf(c44308d.getCreated()), TimeUnit.SECONDS);
        boolean isViewed = c44308d.getIsViewed();
        List<com.avito.android.job.crm_candidates_public.generated.api.api_put_applicant_note.JobApplicationApiBadgesV3> listB = c44308d.b();
        if (listB != null) {
            List<com.avito.android.job.crm_candidates_public.generated.api.api_put_applicant_note.JobApplicationApiBadgesV3> list2 = listB;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (com.avito.android.job.crm_candidates_public.generated.api.api_put_applicant_note.JobApplicationApiBadgesV3 jobApplicationApiBadgesV3 : list2) {
                String text = jobApplicationApiBadgesV3.getText();
                DockingBadgeType.Predefined predefinedA = r.a(jobApplicationApiBadgesV3.getColor().f173998b);
                JobApplicationApiBadgesV3.Icon icon = jobApplicationApiBadgesV3.getIcon();
                arrayList.add(new Badge(text, predefinedA, (icon == null ? -1 : r.a.f129421b[icon.ordinal()]) == 1 ? Integer.valueOf(R.attr.textIconDone) : null));
            }
            c42784z0 = arrayList;
        } else {
            c42784z0 = C42784z0.f406748b;
        }
        List<C44313i> listC2 = c44308d.getApplicant().c();
        if (listC2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (C44313i c44313i : listC2) {
                Long managerId = c44313i.getManagerId();
                String managerName = c44313i.getManagerName();
                String text2 = c44313i.getText();
                Long lB2 = r.b(c44313i.getUpdatedAt());
                Note note = (managerId == null || managerName == null || text2 == null || lB2 == null) ? null : new Note(managerId.longValue(), managerName, text2, lB2.longValue());
                if (note != null) {
                    arrayList2.add(note);
                }
            }
            c42784z02 = arrayList2;
        } else {
            c42784z02 = C42784z0.f406748b;
        }
        String id2 = c44308d.getId();
        C44310f vacancy2 = c44308d.getVacancy();
        Long itemId = vacancy2.getItemId();
        Vacancy vacancy3 = itemId != null ? new Vacancy(vacancy2.getTitle(), vacancy2.getLocation(), String.valueOf(itemId.longValue())) : null;
        String resumeId = c44308d.getApplicant().getResumeId();
        String userId = c44308d.getApplicant().getUserId();
        C44312h enrichment3 = c44308d.getEnrichment();
        if (enrichment3 != null) {
            String name2 = c44308d.getApplicant().getName();
            String description = enrichment3.getDescription();
            String text3 = enrichment3.getOverview().getText();
            JobApplicationEnrichmentV3Overview.Color color = enrichment3.getOverview().getColor();
            DockingBadgeType.Predefined predefinedA2 = color != null ? r.a(color.f174012b) : null;
            String title = enrichment3.getTitle();
            List<com.avito.android.job.crm_candidates_public.generated.api.api_put_applicant_note.JobApplicationEnrichmentV3EnrichedPropertiesItem> listB2 = enrichment3.b();
            ArrayList arrayList3 = new ArrayList(C42745f0.q(listB2, 10));
            Iterator it = listB2.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                com.avito.android.job.crm_candidates_public.generated.api.api_put_applicant_note.JobApplicationEnrichmentV3EnrichedPropertiesItem jobApplicationEnrichmentV3EnrichedPropertiesItem = (com.avito.android.job.crm_candidates_public.generated.api.api_put_applicant_note.JobApplicationEnrichmentV3EnrichedPropertiesItem) next;
                arrayList3.add(new Property(jobApplicationEnrichmentV3EnrichedPropertiesItem.getLabel(), jobApplicationEnrichmentV3EnrichedPropertiesItem.getValue(), r.a(jobApplicationEnrichmentV3EnrichedPropertiesItem.getValueColor().f174009b), AK.c.g(i12, "enrichmentProperty")));
                i12 = i13;
                it = it;
                vacancy3 = vacancy3;
            }
            vacancy = vacancy3;
            enrichment = new Enrichment(name2, description, text3, predefinedA2, title, arrayList3);
        } else {
            vacancy = vacancy3;
            enrichment = null;
        }
        C44311g chatbotResult = c44308d.getChatbotResult();
        if (chatbotResult != null) {
            String name3 = c44308d.getApplicant().getName();
            String description2 = chatbotResult.getDescription();
            String text4 = chatbotResult.getOverview().getText();
            JobApplicationChatbotResultV3Overview.Color color2 = chatbotResult.getOverview().getColor();
            DockingBadgeType.Predefined predefinedA3 = color2 != null ? r.a(color2.f174006b) : null;
            String title2 = chatbotResult.getTitle();
            List<com.avito.android.job.crm_candidates_public.generated.api.api_put_applicant_note.JobApplicationChatbotResultV3EnrichedPropertiesItem> listB3 = chatbotResult.b();
            ArrayList arrayList4 = new ArrayList(C42745f0.q(listB3, 10));
            Iterator it2 = listB3.iterator();
            int i14 = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                com.avito.android.job.crm_candidates_public.generated.api.api_put_applicant_note.JobApplicationChatbotResultV3EnrichedPropertiesItem jobApplicationChatbotResultV3EnrichedPropertiesItem = (com.avito.android.job.crm_candidates_public.generated.api.api_put_applicant_note.JobApplicationChatbotResultV3EnrichedPropertiesItem) next2;
                arrayList4.add(new Property(jobApplicationChatbotResultV3EnrichedPropertiesItem.getLabel(), jobApplicationChatbotResultV3EnrichedPropertiesItem.getValue(), r.a(jobApplicationChatbotResultV3EnrichedPropertiesItem.getValueColor().f174003b), AK.c.g(i14, "enrichmentProperty")));
                it2 = it2;
                i14 = i15;
            }
            enrichment2 = new Enrichment(name3, description2, text4, predefinedA3, title2, arrayList4);
        } else {
            enrichment2 = null;
        }
        return new JobCrmApplicationItem(name, list, str, strA, isViewed, c42784z0, c42784z02, deepLink, deepLink2, deepLink3, deepLink4, vacancy, null, resumeId, userId, enrichment, enrichment2, id2);
    }

    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.l
    public final JobCrmListFilterItem h(@Y61.k ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FilterItem filterItem = (FilterItem) it.next();
            if ("age".equals(filterItem.f129564b)) {
                JobCrmListFilterItem jobCrmListFilterItem = (JobCrmListFilterItem) C42745f0.G(filterItem.f129567e);
                if (jobCrmListFilterItem == null) {
                    return null;
                }
                return new JobCrmListFilterItem(filterItem.f129566d, "", "", true, false, false, null, jobCrmListFilterItem.f130143i, jobCrmListFilterItem.f130144j);
            }
        }
        return null;
    }

    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    public final JobCrmBannerItem i(@Y61.k C43667a c43667a) {
        return new JobCrmBannerItem(c43667a.getActionUrl(), new UniversalImage(c43667a.getImage(), c43667a.getImageDark()), c43667a.getBannerId(), c43667a.getTitle(), c43667a.getSubtitle(), c43667a.getActionTitle());
    }

    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    public final List<JobCrmListFilterItem> j(@Y61.k kP.o oVar) {
        List<kP.j> listG;
        List<kP.h> listA = oVar.a();
        if (listA == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (kP.h hVar : listA) {
            if (L.f(hVar.getWidget().getType(), "crmLocationMultiselect")) {
                List<kP.f> listB = hVar.b();
                G0 g02 = null;
                setP0 = null;
                Set setP0 = null;
                if (listB != null) {
                    kP.g selectedOption = hVar.getSelectedOption();
                    if (selectedOption != null && (listG = selectedOption.g()) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (kP.j jVar : listG) {
                            Long lValueOf = jVar != null ? Long.valueOf(jVar.getId()) : null;
                            if (lValueOf != null) {
                                arrayList2.add(lValueOf);
                            }
                        }
                        setP0 = C42745f0.P0(arrayList2);
                    }
                    for (kP.f fVar : listB) {
                        kP.j valueLocation = fVar.getValueLocation();
                        if (valueLocation == null) {
                            V2.f318762a.d("JobCrmCandidatesMapper", "Crm location filter has empty value.");
                            return C42784z0.f406748b;
                        }
                        long id2 = valueLocation.getId();
                        arrayList.add(new JobCrmListFilterItem(fVar.getTitle(), "", "", setP0 != null && setP0.contains(Long.valueOf(id2)), true, false, null, null, String.valueOf(id2), 128, null));
                    }
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    V2.f318762a.d("JobCrmCandidatesMapper", "Empty options list when mapping location filter.");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem> k(@Y61.k kP.o r23) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.domain.p.k(kP.o):java.util.List");
    }

    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    public final List l(@Y61.k String str, @Y61.k ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FilterItem filterItem = (FilterItem) it.next();
            if (str.equals(filterItem.f129564b)) {
                List<JobCrmListFilterItem> list = filterItem.f129567e;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
                for (JobCrmListFilterItem jobCrmListFilterItem : list) {
                    arrayList2.add(new JobCrmListFilterItem(filterItem.f129566d, "", "", jobCrmListFilterItem.f130139e, jobCrmListFilterItem.f130140f, false, jobCrmListFilterItem.f130142h, null, jobCrmListFilterItem.f130144j));
                }
                return arrayList2;
            }
        }
        return C42784z0.f406748b;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m(@Y61.k java.util.ArrayList r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L9:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r10.next()
            com.avito.android.crm_candidates.features.full_filters.entity.FilterItem r1 = (com.avito.android.crm_candidates.features.full_filters.entity.FilterItem) r1
            java.lang.String r2 = r1.f129564b
            int r3 = r2.hashCode()
            switch(r3) {
                case -1249512767: goto L68;
                case -727131559: goto L5c;
                case 3076014: goto L50;
                case 835260333: goto L44;
                case 1318692896: goto L38;
                case 1901043637: goto L2c;
                case 1990574480: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L9
        L1f:
            java.lang.String r3 = "applicationStatuses"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28
            goto L9
        L28:
            com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem$FilterType r2 = com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem.FilterType.f130112g
        L2a:
            r5 = r2
            goto L74
        L2c:
            java.lang.String r3 = "location"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L35
            goto L9
        L35:
            com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem$FilterType r2 = com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem.FilterType.f130110e
            goto L2a
        L38:
            java.lang.String r3 = "statuses"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L41
            goto L9
        L41:
            com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem$FilterType r2 = com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem.FilterType.f130108c
            goto L2a
        L44:
            java.lang.String r3 = "manager"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4d
            goto L9
        L4d:
            com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem$FilterType r2 = com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem.FilterType.f130113h
            goto L2a
        L50:
            java.lang.String r3 = "date"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L59
            goto L9
        L59:
            com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem$FilterType r2 = com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem.FilterType.f130109d
            goto L2a
        L5c:
            java.lang.String r3 = "vacancies"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L65
            goto L9
        L65:
            com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem$FilterType r2 = com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem.FilterType.f130111f
            goto L2a
        L68:
            java.lang.String r3 = "gender"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L71
            goto L9
        L71:
            com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem$FilterType r2 = com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem.FilterType.f130114i
            goto L2a
        L74:
            java.util.List<com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem> r2 = r1.f129567e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            r4 = 0
            if (r3 == 0) goto L88
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L88
        L86:
            r7 = r4
            goto L9e
        L88:
            java.util.Iterator r2 = r2.iterator()
        L8c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L86
            java.lang.Object r3 = r2.next()
            com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem r3 = (com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem) r3
            boolean r3 = r3.f130139e
            if (r3 == 0) goto L8c
            r2 = 1
            r7 = r2
        L9e:
            com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem r2 = new com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem
            java.lang.String r4 = r1.f129564b
            java.lang.String r8 = r1.f129566d
            r3 = r2
            r6 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            r0.add(r2)
            goto L9
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.domain.p.m(java.util.ArrayList):java.util.ArrayList");
    }

    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    public final List<JobCrmListFilterItem> n(@Y61.k kP.o oVar) {
        List<kP.h> listA = oVar.a();
        if (listA == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (kP.h hVar : listA) {
            if (L.f(hVar.getWidget().getType(), "crmGenderSelect")) {
                List<kP.f> listB = hVar.b();
                G0 g02 = null;
                if (listB != null) {
                    kP.g selectedOption = hVar.getSelectedOption();
                    kP.i valueGender = selectedOption != null ? selectedOption.getValueGender() : null;
                    for (kP.f fVar : listB) {
                        kP.i valueGender2 = fVar.getValueGender();
                        if (valueGender2 == null) {
                            V2.f318762a.d("JobCrmCandidatesMapper", "Crm gender filter has empty value.");
                            return C42784z0.f406748b;
                        }
                        long id2 = valueGender2.getId();
                        arrayList.add(new JobCrmListFilterItem(fVar.getTitle(), "", "", valueGender != null && id2 == valueGender.getId(), false, false, null, null, String.valueOf(id2), 128, null));
                    }
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    V2.f318762a.d("JobCrmCandidatesMapper", "Empty options list when mapping application status filter.");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    public final ArrayList o(@Y61.k C43991c c43991c) {
        DeepLink deepLink;
        DeepLink deepLink2;
        DeepLink deepLink3;
        DeepLink deepLink4;
        C42784z0 c42784z0;
        C42784z0 c42784z02;
        Iterator it;
        Enrichment enrichment;
        Enrichment enrichment2;
        List<C43993e> listA = c43991c.a();
        int i12 = 10;
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        Iterator it2 = listA.iterator();
        while (it2.hasNext()) {
            C43993e c43993e = (C43993e) it2.next();
            List<C43989a> listC = c43993e.c();
            if (listC != null) {
                DeepLink deepLink5 = null;
                DeepLink deepLink6 = null;
                DeepLink deepLink7 = null;
                DeepLink deepLink8 = null;
                for (C43989a c43989a : listC) {
                    C43990b value = c43989a.getValue();
                    DeepLink uri = value != null ? value.getUri() : null;
                    String type = c43989a.getType();
                    if (type != null) {
                        switch (type.hashCode()) {
                            case -1436108013:
                                if (type.equals(NotificationsSettings.Section.SECTION_MESSENGER)) {
                                    deepLink6 = uri;
                                    break;
                                } else {
                                    break;
                                }
                            case -934426579:
                                if (type.equals("resume")) {
                                    deepLink7 = uri;
                                    break;
                                } else {
                                    break;
                                }
                            case -892481550:
                                if (type.equals("status")) {
                                    deepLink8 = uri;
                                    break;
                                } else {
                                    break;
                                }
                            case 106642798:
                                if (type.equals("phone")) {
                                    deepLink5 = uri;
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
                deepLink = deepLink5;
                deepLink2 = deepLink6;
                deepLink3 = deepLink7;
                deepLink4 = deepLink8;
            } else {
                deepLink = null;
                deepLink2 = null;
                deepLink3 = null;
                deepLink4 = null;
            }
            String name = c43993e.getApplicant().getName();
            List<String> listA2 = c43993e.getApplicant().a();
            if (listA2 == null) {
                listA2 = C42784z0.f406748b;
            }
            List<String> list = listA2;
            String price = c43993e.getPrice();
            if (price == null) {
                price = "";
            }
            String str = price;
            String strA = this.f129417a.a(Long.valueOf(c43993e.getCreated()), TimeUnit.SECONDS);
            boolean isViewed = c43993e.getIsViewed();
            List<com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationApiBadgesV3> listB = c43993e.b();
            if (listB != null) {
                List<com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationApiBadgesV3> list2 = listB;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, i12));
                for (com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationApiBadgesV3 jobApplicationApiBadgesV3 : list2) {
                    String text = jobApplicationApiBadgesV3.getText();
                    DockingBadgeType.Predefined predefinedA = r.a(jobApplicationApiBadgesV3.getColor().f173981b);
                    JobApplicationApiBadgesV3.Icon icon = jobApplicationApiBadgesV3.getIcon();
                    arrayList2.add(new Badge(text, predefinedA, (icon == null ? -1 : r.a.f129422c[icon.ordinal()]) == 1 ? Integer.valueOf(R.attr.textIconDone) : null));
                }
                c42784z0 = arrayList2;
            } else {
                c42784z0 = C42784z0.f406748b;
            }
            List<C43997i> listC2 = c43993e.getApplicant().c();
            if (listC2 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (C43997i c43997i : listC2) {
                    Long managerId = c43997i.getManagerId();
                    String managerName = c43997i.getManagerName();
                    String text2 = c43997i.getText();
                    Long lB2 = r.b(c43997i.getUpdatedAt());
                    Note note = (managerId == null || managerName == null || text2 == null || lB2 == null) ? null : new Note(managerId.longValue(), managerName, text2, lB2.longValue());
                    if (note != null) {
                        arrayList3.add(note);
                    }
                }
                c42784z02 = arrayList3;
            } else {
                c42784z02 = C42784z0.f406748b;
            }
            String id2 = c43993e.getId();
            C43994f vacancy = c43993e.getVacancy();
            Long itemId = vacancy.getItemId();
            Vacancy vacancy2 = itemId != null ? new Vacancy(vacancy.getTitle(), vacancy.getLocation(), String.valueOf(itemId.longValue())) : null;
            String resumeId = c43993e.getApplicant().getResumeId();
            String userId = c43993e.getApplicant().getUserId();
            C43996h enrichment3 = c43993e.getEnrichment();
            if (enrichment3 != null) {
                String name2 = c43993e.getApplicant().getName();
                String description = enrichment3.getDescription();
                String text3 = enrichment3.getOverview().getText();
                JobApplicationEnrichmentV3Overview.Color color = enrichment3.getOverview().getColor();
                DockingBadgeType.Predefined predefinedA2 = color != null ? r.a(color.f173995b) : null;
                String title = enrichment3.getTitle();
                List<com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationEnrichmentV3EnrichedPropertiesItem> listB2 = enrichment3.b();
                ArrayList arrayList4 = new ArrayList(C42745f0.q(listB2, 10));
                Iterator it3 = listB2.iterator();
                int i13 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationEnrichmentV3EnrichedPropertiesItem jobApplicationEnrichmentV3EnrichedPropertiesItem = (com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationEnrichmentV3EnrichedPropertiesItem) next;
                    arrayList4.add(new Property(jobApplicationEnrichmentV3EnrichedPropertiesItem.getLabel(), jobApplicationEnrichmentV3EnrichedPropertiesItem.getValue(), r.a(jobApplicationEnrichmentV3EnrichedPropertiesItem.getValueColor().f173992b), AK.c.g(i13, "enrichmentProperty")));
                    i13 = i14;
                    it3 = it3;
                    it2 = it2;
                }
                it = it2;
                enrichment = new Enrichment(name2, description, text3, predefinedA2, title, arrayList4);
            } else {
                it = it2;
                enrichment = null;
            }
            C43995g chatbotResult = c43993e.getChatbotResult();
            if (chatbotResult != null) {
                String name3 = c43993e.getApplicant().getName();
                String description2 = chatbotResult.getDescription();
                String text4 = chatbotResult.getOverview().getText();
                JobApplicationChatbotResultV3Overview.Color color2 = chatbotResult.getOverview().getColor();
                DockingBadgeType.Predefined predefinedA3 = color2 != null ? r.a(color2.f173989b) : null;
                String title2 = chatbotResult.getTitle();
                List<com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationChatbotResultV3EnrichedPropertiesItem> listB3 = chatbotResult.b();
                ArrayList arrayList5 = new ArrayList(C42745f0.q(listB3, 10));
                int i15 = 0;
                for (Object obj : listB3) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationChatbotResultV3EnrichedPropertiesItem jobApplicationChatbotResultV3EnrichedPropertiesItem = (com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationChatbotResultV3EnrichedPropertiesItem) obj;
                    arrayList5.add(new Property(jobApplicationChatbotResultV3EnrichedPropertiesItem.getLabel(), jobApplicationChatbotResultV3EnrichedPropertiesItem.getValue(), r.a(jobApplicationChatbotResultV3EnrichedPropertiesItem.getValueColor().f173986b), AK.c.g(i15, "enrichmentProperty")));
                    i15 = i16;
                }
                enrichment2 = new Enrichment(name3, description2, text4, predefinedA3, title2, arrayList5);
            } else {
                enrichment2 = null;
            }
            arrayList.add(new JobCrmApplicationItem(name, list, str, strA, isViewed, c42784z0, c42784z02, deepLink, deepLink2, deepLink3, deepLink4, vacancy2, null, resumeId, userId, enrichment, enrichment2, id2));
            it2 = it;
            i12 = 10;
        }
        return arrayList;
    }

    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.l
    public final JobCrmListFilterItem p(@Y61.k kP.o oVar) {
        List<kP.h> listA = oVar.a();
        if (listA == null) {
            return null;
        }
        for (kP.h hVar : listA) {
            if (L.f(hVar.getWidget().getType(), "crmAgeSelect")) {
                kP.g selectedOption = hVar.getSelectedOption();
                C42613a valueAgeFromTo = selectedOption != null ? selectedOption.getValueAgeFromTo() : null;
                return new JobCrmListFilterItem(hVar.getTitle(), "", "", false, false, false, null, new Q(valueAgeFromTo != null ? valueAgeFromTo.getFrom() : null, valueAgeFromTo != null ? valueAgeFromTo.getTo() : null), hVar.getId());
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022f A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0128  */
    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem> q(@Y61.k kP.o r17) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.domain.p.q(kP.o):java.util.List");
    }

    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    public final List<JobCrmListFilterItem> r(@Y61.k kP.o oVar) {
        Set setP0;
        List<kP.l> listI;
        List<kP.h> listA = oVar.a();
        if (listA == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (kP.h hVar : listA) {
            if (L.f(hVar.getWidget().getType(), "crmVacancySelect")) {
                List<kP.f> listB = hVar.b();
                G0 g02 = null;
                if (listB != null) {
                    for (kP.f fVar : listB) {
                        kP.l valueVacancy = fVar.getValueVacancy();
                        if (valueVacancy == null) {
                            V2.f318762a.d("JobCrmCandidatesMapper", "Crm vacancy filter has empty fields.");
                            return C42784z0.f406748b;
                        }
                        long id2 = valueVacancy.getId();
                        kP.g selectedOption = hVar.getSelectedOption();
                        if (selectedOption == null || (listI = selectedOption.i()) == null) {
                            setP0 = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (kP.l lVar : listI) {
                                Long lValueOf = lVar != null ? Long.valueOf(lVar.getId()) : null;
                                if (lValueOf != null) {
                                    arrayList2.add(lValueOf);
                                }
                            }
                            setP0 = C42745f0.P0(arrayList2);
                        }
                        arrayList.add(new JobCrmListFilterItem(fVar.getTitle(), valueVacancy.getLocation(), "", setP0 != null && setP0.contains(Long.valueOf(id2)), true, false, null, null, String.valueOf(valueVacancy.getId()), 128, null));
                    }
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    V2.f318762a.d("JobCrmCandidatesMapper", "Empty options list when mapping vacancy filter.");
                }
            }
        }
        return arrayList;
    }

    @Override // com.avito.android.crm_candidates.domain.o
    @Y61.k
    public final C14929b s(@Y61.k ApiViewCountersV3Response apiViewCountersV3Response) {
        int count = (int) apiViewCountersV3Response.getCount();
        int i12 = a.f129418a[apiViewCountersV3Response.getType().ordinal()];
        boolean z12 = true;
        if (i12 != 1) {
            if (i12 != 2) {
                V2.f318762a.d("JobCrmCandidatesMapper", "Unknown viewed type when mapping viewed counter.");
            } else {
                z12 = false;
            }
        }
        return new C14929b(count, z12);
    }
}
