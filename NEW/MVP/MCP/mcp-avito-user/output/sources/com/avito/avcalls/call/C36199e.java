package com.avito.avcalls.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.avcalls.a;
import com.avito.avcalls.call.models.CallMetaInfo;
import com.avito.avcalls.call.models.CallState;
import com.avito.avcalls.call.models.CreateCallMetaInfo;
import com.avito.avcalls.call.models.TerminateReason;
import com.avito.avcalls.call.r;
import com.avito.avcalls.signaling.proto.VoipMessage;
import com.avito.avcalls.utils.AvCallsException;
import java.util.HashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: CallManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/avcalls/call/e;", "", "Companion", "a", "b", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.avcalls.call.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36199e {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final com.avito.avcalls.utils.logs.a f332652k = new com.avito.avcalls.utils.logs.a("CallManager");

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.T f332653a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final y f332654b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.signaling.c f332655c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.g f332656d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f332657e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.rtc.device.video.capturing.i f332658f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final J f332659g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final CQ0.b f332660h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.connection_quality.d f332661i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, a> f332662j;

    /* compiled from: CallManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/call/e$a;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.call.e$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final r f332663a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final kotlinx.coroutines.T f332664b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f332665c;

        public a(@Y61.k r rVar, @Y61.k kotlinx.coroutines.T t12, boolean z12) {
            this.f332663a = rVar;
            this.f332664b = t12;
            this.f332665c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f332663a, aVar.f332663a) && kotlin.jvm.internal.L.f(this.f332664b, aVar.f332664b) && this.f332665c == aVar.f332665c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f332665c) + ((this.f332664b.hashCode() + (this.f332663a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CallSessionInfo(callSession=");
            sb2.append(this.f332663a);
            sb2.append(", callStateCollectingScope=");
            sb2.append(this.f332664b);
            sb2.append(", isNewIncomingCallNotifiedViaObserver=");
            return androidx.appcompat.app.r.x(sb2, this.f332665c, ')');
        }
    }

    /* compiled from: CallManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/avcalls/call/e$b;", "", "<init>", "()V", "Lcom/avito/avcalls/utils/logs/a;", "logs", "Lcom/avito/avcalls/utils/logs/a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.call.e$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: CallManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.call.e$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f332666a;

        static {
            int[] iArr = new int[VoipMessage.MessageType.values().length];
            try {
                VoipMessage.MessageType messageType = VoipMessage.MessageType.f333356b;
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f332666a = iArr;
        }
    }

    /* compiled from: CallManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.call.e$d */
    public /* synthetic */ class d extends kotlin.jvm.internal.H implements Y41.p<String, CallState, G0> {
        @Override // Y41.p
        public final G0 invoke(String str, CallState callState) {
            C36199e.b((C36199e) this.receiver, str, callState);
            return G0.f406611a;
        }
    }

    /* compiled from: CallManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.call.CallManager$registerCallSession$1", f = "CallManager.kt", i = {}, l = {337}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.avcalls.call.e$e, reason: collision with other inner class name */
    public static final class C10330e extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f332667q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ r f332668r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C36199e f332669s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ l0.a f332670t;

        /* compiled from: CallManager.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/call/models/CallState;", "newState", "Lkotlin/G0;", "emit", "(Lcom/avito/avcalls/call/models/CallState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.avcalls.call.e$e$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C36199e f332671b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r f332672c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l0.a f332673d;

            /* compiled from: CallManager.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/avcalls/a$g;", "Lkotlin/G0;", "invoke", "(Lcom/avito/avcalls/a$g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.avcalls.call.e$e$a$a, reason: collision with other inner class name */
            public static final class C10331a extends kotlin.jvm.internal.N implements Y41.l<a.g, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ CallState f332674l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10331a(CallState callState) {
                    super(1);
                    this.f332674l = callState;
                }

                @Override // Y41.l
                public final G0 invoke(a.g gVar) {
                    CallState callState = this.f332674l;
                    String userId = callState.getPeerStatus().getUserId();
                    String localUserId = callState.getLocalUserId();
                    callState.getIsVideo();
                    gVar.h(callState, userId, localUserId, callState.getCallMetaInfo());
                    return G0.f406611a;
                }
            }

            /* compiled from: CallManager.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/avcalls/a$g;", "Lkotlin/G0;", "invoke", "(Lcom/avito/avcalls/a$g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.avcalls.call.e$e$a$b */
            public static final class b extends kotlin.jvm.internal.N implements Y41.l<a.g, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ CallState f332675l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(CallState callState) {
                    super(1);
                    this.f332675l = callState;
                }

                @Override // Y41.l
                public final G0 invoke(a.g gVar) {
                    gVar.k(this.f332675l);
                    return G0.f406611a;
                }
            }

            /* compiled from: CallManager.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.avcalls.call.CallManager$registerCallSession$1$1", f = "CallManager.kt", i = {0, 0, 0, 1, 1, 1}, l = {351, 363, 384}, m = "emit", n = {"this", "newState", "callSessionInfo", "this", "newState", "callSessionInfo"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
            /* renamed from: com.avito.avcalls.call.e$e$a$c */
            public static final class c extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public Object f332676q;

                /* renamed from: r, reason: collision with root package name */
                public CallState f332677r;

                /* renamed from: s, reason: collision with root package name */
                public Object f332678s;

                /* renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f332679t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ a<T> f332680u;

                /* renamed from: v, reason: collision with root package name */
                public int f332681v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public c(a<? super T> aVar, Continuation<? super c> continuation) {
                    super(continuation);
                    this.f332680u = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f332679t = obj;
                    this.f332681v |= BeduinInputModel.MIN_TEXT_VERSION;
                    return this.f332680u.emit(null, this);
                }
            }

            public a(C36199e c36199e, r rVar, l0.a aVar) {
                this.f332671b = c36199e;
                this.f332672c = rVar;
                this.f332673d = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(@Y61.k com.avito.avcalls.call.models.CallState r13, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r14) throws com.avito.avcalls.utils.AvCallsException.CallNotFoundException {
                /*
                    Method dump skipped, instructions count: 305
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.C36199e.C10330e.a.emit(com.avito.avcalls.call.models.CallState, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10330e(r rVar, C36199e c36199e, l0.a aVar, Continuation<? super C10330e> continuation) {
            super(2, continuation);
            this.f332668r = rVar;
            this.f332669s = c36199e;
            this.f332670t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new C10330e(this.f332668r, this.f332669s, this.f332670t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((C10330e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f332667q;
            if (i12 == 0) {
                C42729a0.b(obj);
                r rVar = this.f332668r;
                Z1<CallState> z12 = rVar.f332803m;
                a aVar = new a(this.f332669s, rVar, this.f332670t);
                this.f332667q = 1;
                if (z12.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public C36199e(kotlinx.coroutines.T t12, y yVar, com.avito.avcalls.signaling.c cVar, a.g gVar, CoroutineContext coroutineContext, com.avito.avcalls.rtc.device.video.capturing.i iVar, J j12, CQ0.b bVar, com.avito.avcalls.connection_quality.d dVar, int i12, C42822w c42822w) {
        if ((i12 & 16) != 0) {
            kotlinx.coroutines.scheduling.c cVar2 = C43262l0.f411945a;
            coroutineContext = kotlinx.coroutines.internal.K.f411877a;
        }
        this.f332653a = t12;
        this.f332654b = yVar;
        this.f332655c = cVar;
        this.f332656d = gVar;
        this.f332657e = coroutineContext;
        this.f332658f = iVar;
        this.f332659g = j12;
        this.f332660h = bVar;
        this.f332661i = dVar;
        this.f332662j = new HashMap<>();
        C43259k.d(t12, null, null, new C36195a(this, null), 3);
        C43259k.d(t12, null, null, new C36196b(this, null), 3);
        C43259k.d(t12, null, null, new C36197c(this, null), 3);
        C43259k.d(t12, null, null, new C36198d(this, null), 3);
    }

    public static final void b(C36199e c36199e, String str, CallState callState) {
        c36199e.getClass();
        C43259k.d(c36199e.f332653a, null, null, new C36201g(c36199e, str, callState, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.avcalls.call.C36199e r6, com.avito.avcalls.call.C36199e.a r7, com.avito.avcalls.call.models.CallState r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof com.avito.avcalls.call.C36204j
            if (r0 == 0) goto L16
            r0 = r9
            com.avito.avcalls.call.j r0 = (com.avito.avcalls.call.C36204j) r0
            int r1 = r0.f332693t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f332693t = r1
            goto L1b
        L16:
            com.avito.avcalls.call.j r0 = new com.avito.avcalls.call.j
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f332691r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f332693t
            java.lang.String r3 = "unregisterCallSession"
            com.avito.avcalls.utils.logs.a r4 = com.avito.avcalls.call.C36199e.f332652k
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 != r5) goto L35
            java.lang.Object r6 = r0.f332690q
            r7 = r6
            com.avito.avcalls.call.e$a r7 = (com.avito.avcalls.call.C36199e.a) r7
            kotlin.C42729a0.b(r9)
            goto L65
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.C42729a0.b(r9)
            java.lang.String r8 = r8.getCallId()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            r4.b(r3, r8)
            java.util.HashMap<java.lang.String, com.avito.avcalls.call.e$a> r8 = r6.f332662j
            com.avito.avcalls.call.r r9 = r7.f332663a
            java.lang.String r9 = r9.f332791a
            r8.remove(r9)
            com.avito.avcalls.call.k r8 = new com.avito.avcalls.call.k
            r9 = 1
            r8.<init>(r9)
            r0.f332690q = r7
            r0.f332693t = r5
            java.lang.Object r6 = r6.i(r8, r0)
            if (r6 != r1) goto L65
            goto L75
        L65:
            kotlinx.coroutines.T r6 = r7.f332664b
            r7 = 0
            kotlinx.coroutines.U.b(r6, r7)
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "done"
            r4.c(r7, r3, r6)
            kotlin.G0 r1 = kotlin.G0.f406611a
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.C36199e.c(com.avito.avcalls.call.e, com.avito.avcalls.call.e$a, com.avito.avcalls.call.models.CallState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a(@Y61.k String str) throws AvCallsException.InvalidCallStateException, AvCallsException.CallNotFoundException {
        r rVar;
        f332652k.b("acceptIncomingCall", str);
        a aVar = this.f332662j.get(str);
        if (aVar == null || (rVar = aVar.f332663a) == null) {
            throw new AvCallsException.CallNotFoundException(str);
        }
        if (rVar instanceof K) {
            K k12 = (K) rVar;
            C43259k.d(k12.f332792b, null, null, new L(k12, null), 3);
        } else {
            throw new AvCallsException.InvalidCallStateException("Expected IncomingCall, but found " + m0.f406844a.b(rVar.getClass()).l0());
        }
    }

    public final void d(@Y61.k String str, boolean z12, @Y61.k DQ0.a aVar) {
        r rVar;
        Object[] objArr = {str, com.avito.android.bxcontent.mvi.entity.f.l("isLocal=", z12), aVar};
        com.avito.avcalls.utils.logs.a aVar2 = f332652k;
        aVar2.b("attachVideoRenderer", objArr);
        a aVar3 = this.f332662j.get(str);
        if (aVar3 == null || (rVar = aVar3.f332663a) == null) {
            aVar2.a("attachVideoRenderer", "callSession not found for callId", null);
            return;
        }
        r.f332790n.b("attachVideoRenderer", com.avito.android.bxcontent.mvi.entity.f.l("isLocal=", z12));
        if (rVar.a().getIsVideo()) {
            rVar.f332798h.H(z12, aVar);
        }
    }

    @Y61.k
    public final CallState e(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12, @Y61.k CreateCallMetaInfo createCallMetaInfo) {
        f332652k.b("createOutgoingCall", str, "from=".concat(str2), "to=".concat(str3), com.avito.android.bxcontent.mvi.entity.f.l("isVideo=", z12), "metaInfo=" + createCallMetaInfo);
        d dVar = new d(2, this, C36199e.class, "handleStatsReport", "handleStatsReport(Ljava/lang/String;Lcom/avito/avcalls/call/models/CallState;)V", 0);
        y yVar = this.f332654b;
        yVar.getClass();
        kotlinx.coroutines.T t12 = this.f332653a;
        C43238h c43238hA = y.a(t12, str);
        Q q12 = new Q(str, str2, str3, z12, c43238hA, y.b(t12, str), new A(str, str2, yVar.f332847b, c43238hA), yVar.f332846a, yVar.f332848c, createCallMetaInfo, yVar.f332849d.f332870b, new com.avito.avcalls.stats.d(), dVar, new CallMetaInfo(createCallMetaInfo.getScenario(), null, null, null, null, null, null, 120, null));
        j(q12);
        C43259k.d(c43238hA, null, null, new S(q12, null), 3);
        return q12.a();
    }

    public final void f(@Y61.k String str, boolean z12, @Y61.k DQ0.a aVar) {
        r rVar;
        Object[] objArr = {str, com.avito.android.bxcontent.mvi.entity.f.l("isLocal=", z12), aVar};
        com.avito.avcalls.utils.logs.a aVar2 = f332652k;
        aVar2.b("detachVideoRenderer", objArr);
        a aVar3 = this.f332662j.get(str);
        if (aVar3 == null || (rVar = aVar3.f332663a) == null) {
            aVar2.a("detachVideoRenderer", "callSession not found for callId", null);
            return;
        }
        r.f332790n.b("detachVideoRenderer", com.avito.android.bxcontent.mvi.entity.f.l("isLocal=", z12));
        if (rVar.a().getIsVideo()) {
            rVar.f332798h.N(z12, aVar);
        }
    }

    public final void g(@Y61.k String str, boolean z12) {
        r rVar;
        Object[] objArr = {str, Boolean.valueOf(z12)};
        com.avito.avcalls.utils.logs.a aVar = f332652k;
        aVar.b("enableSendingAudio", objArr);
        a aVar2 = this.f332662j.get(str);
        if (aVar2 == null || (rVar = aVar2.f332663a) == null) {
            aVar.a("enableSendingAudio", "callSession not found for callId", null);
        } else {
            r.f332790n.b("enableSendingAudio", Boolean.valueOf(z12));
            rVar.i(r.b.f332804b, z12);
        }
    }

    public final void h(@Y61.k String str, boolean z12) {
        r rVar;
        Object[] objArr = {str, Boolean.valueOf(z12)};
        com.avito.avcalls.utils.logs.a aVar = f332652k;
        aVar.b("enableSendingVideo", objArr);
        a aVar2 = this.f332662j.get(str);
        if (aVar2 == null || (rVar = aVar2.f332663a) == null) {
            aVar.a("enableSendingVideo", "callSession not found for callId", null);
            return;
        }
        r.f332790n.b("enableSendingVideo", Boolean.valueOf(z12));
        if (rVar.a().getIsVideo()) {
            rVar.i(r.b.f332805c, z12);
        }
    }

    public final Object i(Y41.l lVar, ContinuationImpl continuationImpl) {
        Object objG = C43259k.g(this.f332657e, new C36202h(lVar, this, null), continuationImpl);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    public final void j(r rVar) {
        String str = rVar.f332791a;
        f332652k.b("registerCallSession", str);
        C43238h c43238hA = kotlinx.coroutines.U.a(this.f332653a.getF398827h().plus(t1.b()).plus(new kotlinx.coroutines.S("call_state_coroutine_" + str)));
        this.f332662j.put(str, new a(rVar, c43238hA, false));
        C43259k.d(c43238hA, null, null, new C10330e(rVar, this, new l0.a(), null), 3);
    }

    public final boolean k(@Y61.k String str, @Y61.k String str2) throws AvCallsException.CallNotFoundException {
        r rVar;
        com.avito.avcalls.rtc.media.b bVar;
        f332652k.b("sendDtmf", str, str2);
        a aVar = this.f332662j.get(str);
        if (aVar == null || (rVar = aVar.f332663a) == null) {
            throw new AvCallsException.CallNotFoundException(str);
        }
        r.f332790n.b("sendDtmf", str2);
        com.avito.avcalls.rtc.q qVar = rVar.f332798h;
        qVar.F().b("sendDtmf", str2);
        com.avito.avcalls.rtc.g gVar = qVar.f333215b;
        if (gVar.f333152p == null && (bVar = gVar.f333146j) != null) {
            gVar.f333152p = gVar.f333144h.q(bVar);
        }
        com.avito.avcalls.rtc.media.d dVar = gVar.f333152p;
        if (dVar == null) {
            return false;
        }
        com.avito.avcalls.config.h hVar = gVar.f333138b;
        return dVar.a(hVar.getF332860k(), hVar.getF332861l(), str2);
    }

    public final void l(@Y61.k String str) throws AvCallsException.InvalidCallStateException, AvCallsException.CallNotFoundException {
        r rVar;
        f332652k.b("sendRingingForIncomingCall", str);
        a aVar = this.f332662j.get(str);
        if (aVar == null || (rVar = aVar.f332663a) == null) {
            throw new AvCallsException.CallNotFoundException(str);
        }
        if (rVar instanceof K) {
            K k12 = (K) rVar;
            C43259k.d(k12.f332792b, null, null, new N(k12, null), 3);
        } else {
            throw new AvCallsException.InvalidCallStateException("Expected IncomingCall, but found " + m0.f406844a.b(rVar.getClass()).l0());
        }
    }

    public final void m(@Y61.k String str) throws AvCallsException.InvalidCallStateException, AvCallsException.CallNotFoundException {
        r rVar;
        f332652k.b("startOutgoingCall", str);
        a aVar = this.f332662j.get(str);
        if (aVar == null || (rVar = aVar.f332663a) == null) {
            throw new AvCallsException.CallNotFoundException(str);
        }
        if (rVar instanceof Q) {
            Q q12 = (Q) rVar;
            C43259k.d(q12.f332792b, null, null, new U(q12, null), 3);
        } else {
            throw new AvCallsException.InvalidCallStateException("Expected IncomingCall, but found " + m0.f406844a.b(rVar.getClass()).l0());
        }
    }

    public final void n(@Y61.k String str, @Y61.k TerminateReason terminateReason, boolean z12) throws AvCallsException.CallNotFoundException {
        r rVar;
        f332652k.b("terminateCall", str, terminateReason, com.avito.android.bxcontent.mvi.entity.f.l("isLocally=", z12));
        a aVar = this.f332662j.get(str);
        if (aVar == null || (rVar = aVar.f332663a) == null) {
            throw new AvCallsException.CallNotFoundException(str);
        }
        C43259k.d(rVar.f332792b, null, null, new x(rVar, terminateReason, z12, null), 3);
    }
}
