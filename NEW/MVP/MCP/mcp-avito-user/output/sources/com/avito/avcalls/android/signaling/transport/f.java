package com.avito.avcalls.android.signaling.transport;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.avcalls.android.call.models.MessageChannel;
import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.signaling.proto.IncomingDataMessage;
import com.avito.avcalls.android.signaling.proto.IncomingMessage;
import com.avito.avcalls.android.signaling.proto.IncomingPush;
import com.avito.avcalls.android.signaling.transport.g;
import com.avito.avcalls.android.utils.n;
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
import vQ0.AbstractC49254b;
import vQ0.C49253a;

/* compiled from: SignalingProcessorImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.signaling.transport.SignalingProcessorImpl$2", f = "SignalingProcessorImpl.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332184q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.avcalls.android.signaling.transport.external.a f332185r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f332186s;

    /* compiled from: SignalingProcessorImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/avcalls/android/call/models/MessagePayload;", "Lcom/avito/avcalls/android/call/models/MessageChannel;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "emit", "(Lkotlin/Q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f332187b;

        public a(g gVar) {
            this.f332187b = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            com.avito.avcalls.android.signaling.a aVar;
            int iOrdinal;
            JsonElement jsonElement;
            Q q12 = (Q) obj;
            String str = (String) q12.f406619b;
            MessageChannel messageChannel = (MessageChannel) q12.f406620c;
            g.Companion aVar2 = g.INSTANCE;
            g gVar = this.f332187b;
            gVar.getClass();
            try {
                AbstractC43443a abstractC43443aA = com.avito.avcalls.android.utils.i.a();
                IncomingMessage incomingMessage = (IncomingMessage) abstractC43443aA.d(str, C.e(abstractC43443aA.f412956b, m0.c(IncomingMessage.class)));
                C49253a.Companion companion = C49253a.INSTANCE;
                AbstractC49254b.e.a aVar3 = new AbstractC49254b.e.a(incomingMessage.f332107a.name());
                companion.getClass();
                C49253a.Companion.a(aVar3);
                iOrdinal = incomingMessage.f332107a.ordinal();
                jsonElement = incomingMessage.f332108b;
            } catch (Exception e12) {
                g.Companion companion2 = com.avito.avcalls.android.logger.g.INSTANCE;
                String str2 = "can't parse payload, reason: " + e12.getMessage();
                companion2.getClass();
                g.Companion.a("SignalingProcessor", str2, e12);
                C49253a.Companion companion3 = C49253a.INSTANCE;
                AbstractC49254b.e.C12775b c12775b = AbstractC49254b.e.C12775b.f440775a;
                companion3.getClass();
                C49253a.Companion.a(c12775b);
            }
            if (iOrdinal == 0) {
                AbstractC43443a abstractC43443aA2 = com.avito.avcalls.android.utils.i.a();
                KSerializer<IncomingPush> kSerializerSerializer = IncomingPush.INSTANCE.serializer();
                abstractC43443aA2.getClass();
                aVar = (com.avito.avcalls.android.signaling.a) p0.a(abstractC43443aA2, jsonElement, kSerializerSerializer);
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = null;
            } else {
                AbstractC43443a abstractC43443aA3 = com.avito.avcalls.android.utils.i.a();
                KSerializer<IncomingDataMessage> kSerializerSerializer2 = IncomingDataMessage.INSTANCE.serializer();
                abstractC43443aA3.getClass();
                aVar = (com.avito.avcalls.android.signaling.a) p0.a(abstractC43443aA3, jsonElement, kSerializerSerializer2);
            }
            g.Companion companion4 = com.avito.avcalls.android.logger.g.INSTANCE;
            String str3 = "onNewIncomingMessage(): channel=" + messageChannel + ", rawMessage=" + n.c(str) + ", parsedMessage=" + aVar;
            companion4.getClass();
            g.Companion.c("SignalingProcessor", str3);
            if (aVar != null && !gVar.f332192f.K5(aVar) && (aVar instanceof IncomingDataMessage)) {
                g.Companion.a("SignalingProcessor", "onNewIncomingMessage(): can't emit new incoming data message", null);
                C49253a.Companion companion5 = C49253a.INSTANCE;
                AbstractC49254b.c.a aVar4 = new AbstractC49254b.c.a(((IncomingDataMessage) aVar).f332104b);
                companion5.getClass();
                C49253a.Companion.a(aVar4);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.avito.avcalls.android.signaling.transport.external.a aVar, g gVar, Continuation continuation) {
        super(2, continuation);
        this.f332185r = aVar;
        this.f332186s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new f(this.f332185r, this.f332186s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332184q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var = this.f332185r.f332171a;
            a aVar = new a(this.f332186s);
            this.f332184q = 1;
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
