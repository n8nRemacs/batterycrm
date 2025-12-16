package cP;

import J81.f;
import J81.o;
import J81.s;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.job.contact_access_public.generated.api.api_resume_package_pay_checkout_v_1.ServiceId;
import com.avito.android.remote.model.TypedResult;
import dP.C39610a;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import eP.C40033a;
import fP.C40326a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ContactAccessApi.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\nJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LcP/a;", "", "", "resumeId", "Lcom/avito/android/job/contact_access_public/generated/api/api_resume_package_pay_checkout_v_1/ServiceId;", "serviceId", "externalId", "Lcom/avito/android/remote/model/TypedResult;", "LeP/a;", "c", "(JLcom/avito/android/job/contact_access_public/generated/api/api_resume_package_pay_checkout_v_1/ServiceId;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LfP/a;", "request", "b", "(JLfP/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cvId", "", "checkEmployeeBalanceForCv", "LdP/a;", "a", "(JLjava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: cP.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC27082a {
    @f("2/job/resume/current_package")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@t("cvId") long j12, @l @t("checkEmployeeBalanceForCv") Boolean bool, @k Continuation<? super TypedResult<C39610a>> continuation);

    @o("1/job/resume/{resumeId}/purchase-cv-contact")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@s("resumeId") long j12, @J81.a @k C40326a c40326a, @k Continuation<? super TypedResult<Object>> continuation);

    @f("1/job/resume/{resumeId}/pay/checkout")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@s("resumeId") long j12, @t("serviceId") @k ServiceId serviceId, @l @t("externalId") Long l12, @k Continuation<? super TypedResult<C40033a>> continuation);
}
