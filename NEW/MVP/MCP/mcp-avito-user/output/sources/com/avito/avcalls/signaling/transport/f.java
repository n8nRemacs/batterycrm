package com.avito.avcalls.signaling.transport;

import Y41.p;
import Y61.k;
import com.avito.avcalls.call.models.MessageChannel;
import com.avito.avcalls.signaling.proto.IncomingDataMessage;
import com.avito.avcalls.signaling.proto.IncomingMessage;
import com.avito.avcalls.signaling.proto.IncomingPush;
import com.avito.avcalls.signaling.transport.g;
import com.avito.avcalls.utils.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import kotlinx.serialization.C;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.p0;
import uQ0.C48937a;
import uQ0.b;

/* compiled from: SignalingProcessorImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.signaling.transport.SignalingProcessorImpl$2", f = "SignalingProcessorImpl.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f333406q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.avcalls.signaling.transport.external.a f333407r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f333408s;

    /* compiled from: SignalingProcessorImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/avcalls/call/models/MessagePayload;", "Lcom/avito/avcalls/call/models/MessageChannel;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "emit", "(Lkotlin/Q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f333409b;

        public a(g gVar) {
            this.f333409b = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            com.avito.avcalls.signaling.a aVar;
            int iOrdinal;
            JsonElement jsonElement;
            Q q12 = (Q) obj;
            String str = (String) q12.f406619b;
            MessageChannel messageChannel = (MessageChannel) q12.f406620c;
            g.Companion aVar2 = g.INSTANCE;
            g gVar = this.f333409b;
            gVar.getClass();
            try {
                AbstractC43443a abstractC43443aA = com.avito.avcalls.utils.i.a();
                IncomingMessage incomingMessage = (IncomingMessage) abstractC43443aA.d(str, C.e(abstractC43443aA.f412956b, m0.c(IncomingMessage.class)));
                C48937a.Companion companion = C48937a.INSTANCE;
                b.e.a aVar3 = new b.e.a(incomingMessage.f333325a.name());
                companion.getClass();
                C48937a.Companion.a(aVar3);
                iOrdinal = incomingMessage.f333325a.ordinal();
                jsonElement = incomingMessage.f333326b;
            } catch (Exception e12) {
                com.avito.avcalls.logger.g gVar2 = com.avito.avcalls.logger.g.f332960a;
                String str2 = "can't parse payload, reason: " + e12.getMessage();
                gVar2.getClass();
                com.avito.avcalls.logger.g.a("SignalingProcessor", str2, e12);
                C48937a.Companion companion2 = C48937a.INSTANCE;
                b.e.C12715b c12715b = b.e.C12715b.f439953a;
                companion2.getClass();
                C48937a.Companion.a(c12715b);
            }
            if (iOrdinal == 0) {
                AbstractC43443a abstractC43443aA2 = com.avito.avcalls.utils.i.a();
                KSerializer<IncomingPush> kSerializerSerializer = IncomingPush.INSTANCE.serializer();
                abstractC43443aA2.getClass();
                aVar = (com.avito.avcalls.signaling.a) p0.a(abstractC43443aA2, jsonElement, kSerializerSerializer);
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = null;
            } else {
                AbstractC43443a abstractC43443aA3 = com.avito.avcalls.utils.i.a();
                KSerializer<IncomingDataMessage> kSerializerSerializer2 = IncomingDataMessage.INSTANCE.serializer();
                abstractC43443aA3.getClass();
                aVar = (com.avito.avcalls.signaling.a) p0.a(abstractC43443aA3, jsonElement, kSerializerSerializer2);
            }
            Object[] objArr = {"channel=" + messageChannel, "rawMessage=" + l.c(str), "parsedMessage=" + aVar};
            com.avito.avcalls.utils.logs.a aVar4 = g.f333410i;
            aVar4.b("onNewIncomingMessage", objArr);
            if (aVar != null && !gVar.f333415f.K5(aVar) && (aVar instanceof IncomingDataMessage)) {
                aVar4.a("onNewIncomingMessage", "can't emit new incoming data message", null);
                C48937a.Companion companion3 = C48937a.INSTANCE;
                b.c.a aVar5 = new b.c.a(((IncomingDataMessage) aVar).f333322b);
                companion3.getClass();
                C48937a.Companion.a(aVar5);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.avito.avcalls.signaling.transport.external.a aVar, g gVar, Continuation continuation) {
        super(2, continuation);
        this.f333407r = aVar;
        this.f333408s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new f(this.f333407r, this.f333408s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f333406q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var = this.f333407r.f333393a;
            a aVar = new a(this.f333408s);
            this.f333406q = 1;
            e2Var.getClass();
            if (e2.g(e2Var, aVar, this) == coroutine_suspended) {
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
