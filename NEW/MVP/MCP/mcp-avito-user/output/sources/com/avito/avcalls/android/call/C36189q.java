package com.avito.avcalls.android.call;

import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.signaling.proto.VoipMessage;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import vQ0.AbstractC49254b;
import vQ0.C49253a;

/* compiled from: CallSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.call.CallSession$onNewMessage$1", f = "CallSession.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.avcalls.android.call.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36189q extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331608q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC36187o f331609r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f331610s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ VoipMessage f331611t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36189q(AbstractC36187o abstractC36187o, long j12, VoipMessage voipMessage, Continuation<? super C36189q> continuation) {
        super(2, continuation);
        this.f331609r = abstractC36187o;
        this.f331610s = j12;
        this.f331611t = voipMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36189q(this.f331609r, this.f331610s, this.f331611t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C36189q) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331608q;
        if (i12 == 0) {
            C42729a0.b(obj);
            AbstractC36187o abstractC36187o = this.f331609r;
            Long l12 = abstractC36187o.f331589l;
            VoipMessage voipMessage = this.f331611t;
            long j12 = this.f331610s;
            if (l12 == null || j12 > l12.longValue()) {
                abstractC36187o.f331589l = Boxing.boxLong(j12);
                this.f331608q = 1;
                if (abstractC36187o.e(voipMessage, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                com.avito.avcalls.android.logger.g.INSTANCE.getClass();
                g.Companion.c("CallSession", "drop incoming message [" + voipMessage + "], sqn=[" + j12 + "], lastSqn=[" + l12 + ']');
                C49253a.Companion companion = C49253a.INSTANCE;
                AbstractC49254b.a.C12772a c12772a = new AbstractC49254b.a.C12772a(abstractC36187o.f331578a, voipMessage.f332129a.toString());
                companion.getClass();
                C49253a.Companion.a(c12772a);
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
