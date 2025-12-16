package Fc1;

import android.content.Context;
import feedback.shared.sdk.api.network.entities.GetCampaignsResponse;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.C42729a0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xyz.n.a.ke;

@DebugMetadata(c = "feedback.shared.sdk.api.queue.QueueManager$2$1", f = "QueueManager.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: Fc1.j4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13646j4 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super GetCampaignsResponse>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f5599q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ U3 f5600r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13646j4(U3 u32, Continuation<? super C13646j4> continuation) {
        super(2, continuation);
        this.f5600r = u32;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C13646j4(this.f5600r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super GetCampaignsResponse> continuation) {
        return ((C13646j4) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f5599q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C13607f1 c13607f1 = this.f5600r.f5221a;
            this.f5599q = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this));
            rVar.p();
            T1 t12 = c13607f1.f5493a;
            if (t12 == null) {
                t12 = null;
            }
            D1 d1A = t12.a(ke.GET_CAMPAIGNS);
            LinkedHashMap linkedHashMap = d1A.f4847d;
            Context context = c13607f1.f5495c;
            linkedHashMap.put("{uid}", C13688o1.a(context != null ? context : null));
            linkedHashMap.put("{language}", Locale.getDefault().toLanguageTag());
            c13607f1.a().a(new C13762w4(d1A.a(), rVar));
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
