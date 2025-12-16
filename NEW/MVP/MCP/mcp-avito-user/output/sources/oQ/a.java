package OQ;

import J81.o;
import PQ.d;
import Y61.k;
import Y61.l;
import com.avito.android.job.vacancy_call_action.generated.api.vacancy_call_action_v_3.VacancyCallActionV3Response;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: VacancyCallActionApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LOQ/a;", "", "LPQ/d;", "request", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/job/vacancy_call_action/generated/api/vacancy_call_action_v_3/VacancyCallActionV3Response;", "a", "(LPQ/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_job_vacancy-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes14.dex */
public interface a {
    @o("3/job/seekers/vacancy/call/action")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@J81.a @k d dVar, @k Continuation<? super TypedResult<VacancyCallActionV3Response>> continuation);
}
