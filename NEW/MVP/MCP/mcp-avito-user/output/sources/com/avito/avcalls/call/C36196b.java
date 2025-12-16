package com.avito.avcalls.call;

import com.avito.avcalls.call.C36199e;
import com.avito.avcalls.call.models.TerminateReason;
import com.avito.avcalls.signaling.proto.IncomingDataMessage;
import com.avito.avcalls.signaling.proto.VoipMessage;
import com.avito.avcalls.utils.AvCallsException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CallManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.call.CallManager$2", f = "CallManager.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.avcalls.call.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36196b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332643q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C36199e f332644r;

    /* compiled from: CallManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/signaling/proto/IncomingDataMessage;", "incomingMessage", "Lkotlin/G0;", "emit", "(Lcom/avito/avcalls/signaling/proto/IncomingDataMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.avcalls.call.b$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C36199e f332645b;

        public a(C36199e c36199e) {
            this.f332645b = c36199e;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) throws AvCallsException.CallNotFoundException {
            IncomingDataMessage incomingDataMessage = (IncomingDataMessage) obj;
            C36199e.Companion companion = C36199e.INSTANCE;
            C36199e c36199e = this.f332645b;
            com.avito.avcalls.utils.logs.a aVar = C36199e.f332652k;
            aVar.b("processIncomingEvents", incomingDataMessage);
            C36199e.a aVar2 = c36199e.f332662j.get(incomingDataMessage.f333322b);
            r rVar = aVar2 != null ? aVar2.f332663a : null;
            if (rVar != null) {
                VoipMessage voipMessage = incomingDataMessage.f333323c;
                if (C36199e.c.f332666a[voipMessage.f333347a.ordinal()] == 1) {
                    c36199e.n(incomingDataMessage.f333322b, TerminateReason.INSTANCE.fromReason(voipMessage.f333351e), false);
                } else {
                    C43259k.d(rVar.f332792b, null, null, new C36213t(incomingDataMessage.f333323c, rVar, incomingDataMessage.f333324d, null), 3);
                }
            } else {
                aVar.a("processIncomingEvents", "callSession not found for callId", null);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36196b(C36199e c36199e, Continuation<? super C36196b> continuation) {
        super(2, continuation);
        this.f332644r = c36199e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36196b(this.f332644r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C36196b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332643q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C36199e c36199e = this.f332644r;
            InterfaceC43160i<IncomingDataMessage> interfaceC43160iB = c36199e.f332655c.b();
            a aVar = new a(c36199e);
            this.f332643q = 1;
            if (interfaceC43160iB.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
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
