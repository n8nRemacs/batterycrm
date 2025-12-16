package iP;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.job.crm_candidates_public.generated.api.api_view_counters_v_3.ApiViewCountersV3Response;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import jP.C42292a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import lP.C43667a;
import mP.C43991c;
import nP.C44305a;
import nP.C44308d;
import oP.C44674a;
import pP.C46987a;

/* compiled from: CrmCandidatesApi.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H§@¢\u0006\u0004\b\r\u0010\u0005J¾\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\b\u001f\u0010 J \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00022\b\b\u0001\u0010\"\u001a\u00020!H§@¢\u0006\u0004\b$\u0010%J0\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00022\u000e\b\u0001\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060&2\b\b\u0001\u0010(\u001a\u00020\u0014H§@¢\u0006\u0004\b*\u0010+J¦\u0001\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\b-\u0010.J\u0094\u0001\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u000f2\b\b\u0001\u0010/\u001a\u00020\u00062\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"LiP/a;", "", "Lcom/avito/android/remote/model/TypedResult;", "LlP/a;", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "action", "applicationID", "LjP/a;", "d", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LpP/a;", "g", "cursor", "", "createdAtFrom", "createdAtTo", "vacancies", "status", "", "notViewed", "hasPhone", "location", "statuses", "applicationStatuses", "employee", "ageFrom", "ageTo", "gender", "LmP/c;", "c", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LnP/a;", "request", "LnP/d;", "a", "(LnP/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "ids", "isViewed", "LoP/a;", "b", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/job/crm_candidates_public/generated/api/api_view_counters_v_3/ApiViewCountersV3Response;", "f", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dateFilterId", "LkP/o;", "e", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_job_crm-candidates_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: iP.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC41329a {
    @o("3/crm/note/put")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@J81.a @k C44305a c44305a, @k Continuation<? super TypedResult<C44308d>> continuation);

    @o("3/crm/updateJobApplicationsViewedStatus")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object b(@J81.c("ids") @k List<String> list, @J81.c("isViewed") boolean z12, @k Continuation<? super TypedResult<C44674a>> continuation);

    @f("3/crm/jobApplications")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@l @t("cursor") String str, @l @t("createdAtFrom") Long l12, @l @t("createdAtTo") Long l13, @l @t("vacancies") String str2, @l @t("status") String str3, @l @t("notViewed") Boolean bool, @l @t("hasPhone") Boolean bool2, @l @t("location") String str4, @l @t("statuses") String str5, @l @t("applicationStatuses") String str6, @l @t("employee") String str7, @l @t("ageFrom") Long l14, @l @t("ageTo") Long l15, @l @t("gender") Long l16, @k Continuation<? super TypedResult<C43991c>> continuation);

    @o("3/crm/applyAction")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object d(@J81.c("action") @l String str, @J81.c("applicationID") @l String str2, @k Continuation<? super TypedResult<C42292a>> continuation);

    @f("5/crm/getFilters")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object e(@t("createdAtFrom") long j12, @t("createdAtTo") long j13, @t("dateFilterId") @k String str, @l @t("status") String str2, @l @t("vacancies") String str3, @l @t("location") String str4, @l @t("applicationStatuses") String str5, @l @t("employee") String str6, @l @t("ageFrom") Long l12, @l @t("ageTo") Long l13, @l @t("gender") Long l14, @k Continuation<? super TypedResult<kP.o>> continuation);

    @f("3/crm/viewCounters")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object f(@l @t("createdAtFrom") Long l12, @l @t("createdAtTo") Long l13, @l @t("notViewed") Boolean bool, @l @t("hasPhone") Boolean bool2, @l @t("vacancies") String str, @l @t("statuses") String str2, @l @t("location") String str3, @l @t("applicationStatuses") String str4, @l @t("employee") String str5, @l @t("ageFrom") Long l14, @l @t("ageTo") Long l15, @l @t("gender") Long l16, @k Continuation<? super TypedResult<ApiViewCountersV3Response>> continuation);

    @f("3/crm/entryPointStatus")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object g(@k Continuation<? super TypedResult<C46987a>> continuation);

    @f("1/crm/jobCompanyBanner")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object h(@k Continuation<? super TypedResult<C43667a>> continuation);
}
