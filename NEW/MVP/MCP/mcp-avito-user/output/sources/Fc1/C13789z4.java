package Fc1;

import Fc1.B3;
import Fc1.F7;
import com.google.gson.Gson;
import feedback.shared.sdk.api.network.entities.Answer;
import feedback.shared.sdk.api.network.entities.CampaignPagesResult;
import java.text.ParseException;
import kotlin.C42729a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONException;
import xyz.n.a.ke;

@kotlin.jvm.internal.s0
@DebugMetadata(c = "feedback.shared.sdk.api.queue.QueueManager$2$2", f = "QueueManager.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: Fc1.z4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13789z4 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super Answer>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f5922q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ U3 f5923r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B3 f5924s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13789z4(U3 u32, B3 b32, Continuation<? super C13789z4> continuation) {
        super(2, continuation);
        this.f5923r = u32;
        this.f5924s = b32;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C13789z4(this.f5923r, this.f5924s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super Answer> continuation) {
        return ((C13789z4) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws JSONException, ParseException {
        Object objA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f5922q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C13607f1 c13607f1 = this.f5923r.f5221a;
            B3 b32 = this.f5924s;
            int i13 = B3.a.f4824a[b32.f4822a.ordinal()];
            if (i13 == 1) {
                throw new kotlin.G(null, 1, null);
            }
            String str = b32.f4823b;
            if (i13 == 2) {
                Object objBoxInt = str != null ? Boxing.boxInt(Integer.parseInt(str)) : null;
                if (objBoxInt == null) {
                    throw new NullPointerException("null cannot be cast to non-null type feedback.shared.sdk.api.network.entities.CampaignPagesResult");
                }
                objA = (CampaignPagesResult) objBoxInt;
            } else if (i13 == 3) {
                D6 d62 = F7.a.f4960a;
                if (d62 == null) {
                    d62 = null;
                }
                ((InterfaceC13766x) d62.f4854B.f393949a).get();
                if (str == null) {
                    kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
                    str = "";
                }
                objA = C13587d.a(str);
            } else {
                if (i13 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                D6 d63 = F7.a.f4960a;
                if (d63 == null) {
                    d63 = null;
                }
                objA = ((Gson) d63.f4886y.get()).d(CampaignPagesResult.class, str);
            }
            CampaignPagesResult campaignPagesResult = (CampaignPagesResult) objA;
            this.f5922q = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this));
            rVar.p();
            T1 t12 = c13607f1.f5493a;
            D1 d1A = (t12 != null ? t12 : null).a(ke.POST_ANSWERS);
            d1A.f4847d.put("{projectId}", String.valueOf(campaignPagesResult.getProjectId()));
            c13607f1.a().a(new C13786z1(campaignPagesResult, d1A.a(), rVar));
            obj = rVar.o();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
