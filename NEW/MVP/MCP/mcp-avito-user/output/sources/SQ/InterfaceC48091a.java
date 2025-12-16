package sQ;

import J81.o;
import J81.s;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: InterviewInvitationApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LsQ/a;", "", "", "jobApplyId", "Lcom/avito/android/remote/model/TypedResult;", "LsQ/d;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "params", "Lkotlin/G0;", "b", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: sQ.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC48091a {
    @J81.f("2/job/interview/get-tpl/{jobApplyId}")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @l
    Object a(@s("jobApplyId") @k String str, @k Continuation<? super TypedResult<C48094d>> continuation);

    @o("2/job/interview/invite/{jobApplyId}")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.e
    @l
    Object b(@s("jobApplyId") @k String str, @J81.d @k Map<String, String> map, @k Continuation<? super TypedResult<G0>> continuation);
}
