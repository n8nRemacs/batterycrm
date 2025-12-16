package com.avito.avcalls.android.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.avcalls.android.a;
import com.avito.avcalls.android.call.AbstractC36187o;
import com.avito.avcalls.android.call.models.CallMetaInfo;
import com.avito.avcalls.android.call.models.CreateCallMetaInfo;
import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.rtc.C36192b;
import com.avito.avcalls.android.rtc.C36193c;
import com.avito.avcalls.android.signaling.proto.VoipMessage;
import com.avito.avcalls.android.utils.AvCallsException;
import com.avito.avcalls.android.video.CameraPosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
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
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import org.webrtc.DtmfSender;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpSender;

/* compiled from: CallManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/avcalls/android/call/e;", "", "Companion", "a", "b", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.avcalls.android.call.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36177e {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final T f331485a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v f331486b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.signaling.c f331487c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.g f331488d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f331489e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C<com.avito.avcalls.android.video.b> f331490f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final n2<CameraPosition> f331491g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final wQ0.b f331492h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.connection_quality.d f331493i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, a> f331494j;

    /* compiled from: CallManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/call/e$a;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.call.e$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AbstractC36187o f331495a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final T f331496b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f331497c;

        public a(@Y61.k AbstractC36187o abstractC36187o, @Y61.k T t12, boolean z12) {
            this.f331495a = abstractC36187o;
            this.f331496b = t12;
            this.f331497c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f331495a, aVar.f331495a) && kotlin.jvm.internal.L.f(this.f331496b, aVar.f331496b) && this.f331497c == aVar.f331497c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f331497c) + ((this.f331496b.hashCode() + (this.f331495a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CallSessionInfo(callSession=");
            sb2.append(this.f331495a);
            sb2.append(", callStateCollectingScope=");
            sb2.append(this.f331496b);
            sb2.append(", isNewIncomingCallNotifiedViaObserver=");
            return androidx.appcompat.app.r.x(sb2, this.f331497c, ')');
        }
    }

    /* compiled from: CallManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/avcalls/android/call/e$b;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.call.e$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: CallManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.call.e$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f331498a;

        static {
            int[] iArr = new int[VoipMessage.MessageType.values().length];
            try {
                VoipMessage.MessageType messageType = VoipMessage.MessageType.f332138b;
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f331498a = iArr;
        }
    }

    /* compiled from: CallManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.call.e$d */
    public /* synthetic */ class d extends kotlin.jvm.internal.H implements Y41.p<String, xQ0.b, G0> {
        @Override // Y41.p
        public final G0 invoke(String str, xQ0.b bVar) {
            C36177e.b((C36177e) this.receiver, str, bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: CallManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.android.call.CallManager$registerCallSession$1", f = "CallManager.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.avcalls.android.call.e$e, reason: collision with other inner class name */
    public static final class C10306e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f331499q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ AbstractC36187o f331500r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C36177e f331501s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ l0.a f331502t;

        /* compiled from: CallManager.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LxQ0/b;", "newState", "Lkotlin/G0;", "emit", "(LxQ0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.avcalls.android.call.e$e$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C36177e f331503b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AbstractC36187o f331504c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l0.a f331505d;

            /* compiled from: CallManager.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/avcalls/android/a$g;", "Lkotlin/G0;", "invoke", "(Lcom/avito/avcalls/android/a$g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.avcalls.android.call.e$e$a$a, reason: collision with other inner class name */
            public static final class C10307a extends kotlin.jvm.internal.N implements Y41.l<a.g, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ xQ0.b f331506l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10307a(xQ0.b bVar) {
                    super(1);
                    this.f331506l = bVar;
                }

                @Override // Y41.l
                public final G0 invoke(a.g gVar) {
                    xQ0.b bVar = this.f331506l;
                    gVar.g(bVar, bVar.f442473f.f442492a, bVar.f442469b, bVar.f442478k);
                    return G0.f406611a;
                }
            }

            /* compiled from: CallManager.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/avcalls/android/a$g;", "Lkotlin/G0;", "invoke", "(Lcom/avito/avcalls/android/a$g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.avcalls.android.call.e$e$a$b */
            public static final class b extends kotlin.jvm.internal.N implements Y41.l<a.g, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ xQ0.b f331507l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(xQ0.b bVar) {
                    super(1);
                    this.f331507l = bVar;
                }

                @Override // Y41.l
                public final G0 invoke(a.g gVar) {
                    gVar.c(this.f331507l);
                    return G0.f406611a;
                }
            }

            /* compiled from: CallManager.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.avcalls.android.call.CallManager$registerCallSession$1$1", f = "CallManager.kt", i = {0, 0, 0, 1, 1, 1}, l = {329, 341, 362}, m = "emit", n = {"this", "newState", "callSessionInfo", "this", "newState", "callSessionInfo"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
            /* renamed from: com.avito.avcalls.android.call.e$e$a$c */
            public static final class c extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public Object f331508q;

                /* renamed from: r, reason: collision with root package name */
                public xQ0.b f331509r;

                /* renamed from: s, reason: collision with root package name */
                public Object f331510s;

                /* renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f331511t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ a<T> f331512u;

                /* renamed from: v, reason: collision with root package name */
                public int f331513v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public c(a<? super T> aVar, Continuation<? super c> continuation) {
                    super(continuation);
                    this.f331512u = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f331511t = obj;
                    this.f331513v |= BeduinInputModel.MIN_TEXT_VERSION;
                    return this.f331512u.emit(null, this);
                }
            }

            public a(C36177e c36177e, AbstractC36187o abstractC36187o, l0.a aVar) {
                this.f331503b = c36177e;
                this.f331504c = abstractC36187o;
                this.f331505d = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(@Y61.k xQ0.b r13, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r14) throws com.avito.avcalls.android.utils.AvCallsException.CallNotFoundException {
                /*
                    Method dump skipped, instructions count: 293
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.call.C36177e.C10306e.a.emit(xQ0.b, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10306e(AbstractC36187o abstractC36187o, C36177e c36177e, l0.a aVar, Continuation<? super C10306e> continuation) {
            super(2, continuation);
            this.f331500r = abstractC36187o;
            this.f331501s = c36177e;
            this.f331502t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new C10306e(this.f331500r, this.f331501s, this.f331502t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C10306e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f331499q;
            if (i12 == 0) {
                C42729a0.b(obj);
                AbstractC36187o abstractC36187o = this.f331500r;
                Z1<xQ0.b> z12 = abstractC36187o.f331590m;
                a aVar = new a(this.f331501s, abstractC36187o, this.f331502t);
                this.f331499q = 1;
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

    public C36177e() {
        throw null;
    }

    public C36177e(T t12, v vVar, com.avito.avcalls.android.signaling.c cVar, a.g gVar, CoroutineContext coroutineContext, InterfaceC42726C interfaceC42726C, n2 n2Var, wQ0.b bVar, com.avito.avcalls.android.connection_quality.d dVar, int i12, C42822w c42822w) {
        if ((i12 & 16) != 0) {
            kotlinx.coroutines.scheduling.c cVar2 = C43262l0.f411945a;
            coroutineContext = kotlinx.coroutines.internal.K.f411877a;
        }
        this.f331485a = t12;
        this.f331486b = vVar;
        this.f331487c = cVar;
        this.f331488d = gVar;
        this.f331489e = coroutineContext;
        this.f331490f = interfaceC42726C;
        this.f331491g = n2Var;
        this.f331492h = bVar;
        this.f331493i = dVar;
        this.f331494j = new HashMap<>();
        C43259k.d(t12, null, null, new C36173a(this, null), 3);
        C43259k.d(t12, null, null, new C36174b(this, null), 3);
        C43259k.d(t12, null, null, new C36175c(this, null), 3);
        C43259k.d(t12, null, null, new C36176d(this, null), 3);
    }

    public static final void b(C36177e c36177e, String str, xQ0.b bVar) {
        c36177e.getClass();
        C43259k.d(c36177e.f331485a, null, null, new C36179g(c36177e, str, bVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.avcalls.android.call.C36177e r4, com.avito.avcalls.android.call.C36177e.a r5, xQ0.b r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof com.avito.avcalls.android.call.C36182j
            if (r0 == 0) goto L16
            r0 = r7
            com.avito.avcalls.android.call.j r0 = (com.avito.avcalls.android.call.C36182j) r0
            int r1 = r0.f331525t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f331525t = r1
            goto L1b
        L16:
            com.avito.avcalls.android.call.j r0 = new com.avito.avcalls.android.call.j
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f331523r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f331525t
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f331522q
            r5 = r4
            com.avito.avcalls.android.call.e$a r5 = (com.avito.avcalls.android.call.C36177e.a) r5
            kotlin.C42729a0.b(r7)
            goto L55
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.C42729a0.b(r7)
            java.util.HashMap<java.lang.String, com.avito.avcalls.android.call.e$a> r7 = r4.f331494j
            com.avito.avcalls.android.call.o r2 = r5.f331495a
            java.lang.String r2 = r2.f331578a
            r7.remove(r2)
            com.avito.avcalls.android.call.k r7 = new com.avito.avcalls.android.call.k
            r7.<init>(r6)
            r0.f331522q = r5
            r0.f331525t = r3
            java.lang.Object r4 = r4.i(r7, r0)
            if (r4 != r1) goto L55
            goto L7e
        L55:
            com.avito.avcalls.android.logger.g$a r4 = com.avito.avcalls.android.logger.g.INSTANCE
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "callId="
            r6.<init>(r7)
            com.avito.avcalls.android.call.o r7 = r5.f331495a
            java.lang.String r7 = r7.f331578a
            r6.append(r7)
            java.lang.String r7 = " completely destroyed"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r4.getClass()
            java.lang.String r4 = "CallManager"
            com.avito.avcalls.android.logger.g.Companion.c(r4, r6)
            r4 = 0
            kotlinx.coroutines.T r5 = r5.f331496b
            kotlinx.coroutines.U.b(r5, r4)
            kotlin.G0 r1 = kotlin.G0.f406611a
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.call.C36177e.c(com.avito.avcalls.android.call.e, com.avito.avcalls.android.call.e$a, xQ0.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a(@Y61.k String str) throws AvCallsException.CallNotFoundException, AvCallsException.InvalidCallStateException {
        AbstractC36187o abstractC36187o;
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        String strConcat = "acceptIncomingCall(): callId=".concat(str);
        companion.getClass();
        g.Companion.c("CallManager", strConcat);
        a aVar = this.f331494j.get(str);
        if (aVar == null || (abstractC36187o = aVar.f331495a) == null) {
            throw new AvCallsException.CallNotFoundException(str);
        }
        if (abstractC36187o instanceof F) {
            F f12 = (F) abstractC36187o;
            C43259k.d(f12.f331579b, null, null, new G(f12, null), 3);
        } else {
            throw new AvCallsException.InvalidCallStateException("Expected IncomingCall, but found " + m0.f406844a.b(abstractC36187o.getClass()).l0());
        }
    }

    public final void d(@Y61.k String str, boolean z12, @Y61.k com.avito.avcalls.android.video.w wVar) {
        AbstractC36187o abstractC36187o;
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CallManager", "attachVideoRenderer(): callId=" + str + ", isLocal=" + z12);
        a aVar = this.f331494j.get(str);
        if (aVar == null || (abstractC36187o = aVar.f331495a) == null) {
            g.Companion.a("CallManager", "callSession not found for callId=".concat(str), null);
            return;
        }
        g.Companion.c("CallSession", "attachVideoRenderer(): isLocal=" + z12);
        if (abstractC36187o.c().f442474g) {
            com.avito.avcalls.android.rtc.i iVar = abstractC36187o.f331585h;
            iVar.getClass();
            g.Companion.c("PCSession", "attachVideoRenderer(): isLocal=" + z12);
            com.avito.avcalls.android.rtc.C cE2 = iVar.e(z12);
            if (cE2 != null) {
                g.Companion.c("VideoTrack", "addSink");
                cE2.f331870a.addSink(wVar.f332533b);
            }
        }
    }

    @Y61.k
    public final xQ0.b e(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12, @Y61.k CreateCallMetaInfo createCallMetaInfo) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CallManager", "createOutgoingCall(): to=" + str3 + ", isVideo=" + z12 + ", meta=" + createCallMetaInfo);
        d dVar = new d(2, this, C36177e.class, "handleStatsReport", "handleStatsReport(Ljava/lang/String;Lcom/avito/avcalls/android/call/models/CallState;)V", 0);
        v vVar = this.f331486b;
        vVar.getClass();
        T t12 = this.f331485a;
        C43238h c43238hA = v.a(t12, str);
        L l12 = new L(str, str2, str3, z12, c43238hA, v.b(t12, str), new x(str, str2, vVar.f331632b, c43238hA), vVar.f331631a, vVar.f331633c, createCallMetaInfo, vVar.f331634d.f331673b, new com.avito.avcalls.android.stats.d(), dVar, new CallMetaInfo(createCallMetaInfo.f331568a, null, null, null, null, null, null, 120, null));
        j(l12);
        C43259k.d(c43238hA, null, null, new M(l12, null), 3);
        return l12.c();
    }

    public final void f(@Y61.k String str, boolean z12, @Y61.k com.avito.avcalls.android.video.w wVar) {
        AbstractC36187o abstractC36187o;
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CallManager", "detachVideoRenderer(): callId=" + str + ", isLocal=" + z12);
        a aVar = this.f331494j.get(str);
        if (aVar == null || (abstractC36187o = aVar.f331495a) == null) {
            g.Companion.a("CallManager", "callSession not found for callId=".concat(str), null);
            return;
        }
        g.Companion.c("CallSession", "detachVideoRenderer(): isLocal=" + z12);
        if (abstractC36187o.c().f442474g) {
            com.avito.avcalls.android.rtc.i iVar = abstractC36187o.f331585h;
            iVar.getClass();
            g.Companion.c("PCSession", "detachVideoRenderer(): isLocal=" + z12);
            com.avito.avcalls.android.rtc.C cE2 = iVar.e(z12);
            if (cE2 != null) {
                g.Companion.c("VideoTrack", "removeSink");
                cE2.f331870a.removeSink(wVar.f332533b);
            }
        }
    }

    public final void g(@Y61.k String str, boolean z12) {
        AbstractC36187o abstractC36187o;
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CallManager", "enableSendingAudio(): callId=" + str + ", isEnabled=" + z12);
        a aVar = this.f331494j.get(str);
        if (aVar == null || (abstractC36187o = aVar.f331495a) == null) {
            g.Companion.a("CallManager", "callSession not found for callId=".concat(str), null);
            return;
        }
        g.Companion.c("CallSession", "enableSendingAudio(): isEnabled=" + z12);
        abstractC36187o.b(AbstractC36187o.b.f331591b, z12);
    }

    public final void h(@Y61.k String str, boolean z12) {
        AbstractC36187o abstractC36187o;
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CallManager", "enableSendingVideo() callId=" + str + ", isEnabled=" + z12);
        a aVar = this.f331494j.get(str);
        if (aVar == null || (abstractC36187o = aVar.f331495a) == null) {
            g.Companion.a("CallManager", "callSession not found for callId=".concat(str), null);
            return;
        }
        g.Companion.c("CallSession", "enableSendingVideo(): isEnabled=" + z12);
        if (abstractC36187o.c().f442474g) {
            abstractC36187o.b(AbstractC36187o.b.f331592c, z12);
        }
    }

    public final Object i(Y41.l lVar, ContinuationImpl continuationImpl) {
        Object objG = C43259k.g(this.f331489e, new C36180h(lVar, this, null), continuationImpl);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    public final void j(AbstractC36187o abstractC36187o) {
        CoroutineContext coroutineContextPlus = this.f331485a.getF398924i().plus(t1.b());
        StringBuilder sb2 = new StringBuilder("call_state_coroutine_");
        String str = abstractC36187o.f331578a;
        sb2.append(str);
        C43238h c43238hA = U.a(coroutineContextPlus.plus(new kotlinx.coroutines.S(sb2.toString())));
        this.f331494j.put(str, new a(abstractC36187o, c43238hA, false));
        C43259k.d(c43238hA, null, null, new C10306e(abstractC36187o, this, new l0.a(), null), 3);
    }

    public final boolean k(@Y61.k String str, @Y61.k String str2) throws AvCallsException.CallNotFoundException {
        AbstractC36187o abstractC36187o;
        C36192b c36192b;
        Object next;
        DtmfSender dtmfSenderDtmf;
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CallManager", "sendDtmf(): callId=" + str + ", tone" + str2);
        a aVar = this.f331494j.get(str);
        if (aVar == null || (abstractC36187o = aVar.f331495a) == null) {
            throw new AvCallsException.CallNotFoundException(str);
        }
        StringBuilder sbA = androidx.appcompat.app.r.A("sendDtmf(): tone=", str2, ", state=");
        sbA.append(abstractC36187o.c());
        g.Companion.c("CallSession", sbA.toString());
        com.avito.avcalls.android.rtc.i iVar = abstractC36187o.f331585h;
        iVar.getClass();
        g.Companion.c("PCSession", "sendDtmf(): tone=".concat(str2));
        if (iVar.f331934q == null && (c36192b = iVar.f331928k) != null) {
            List<RtpSender> senders = iVar.f331926i.f331969b.getSenders();
            C36193c c36193c = null;
            if (!(senders instanceof List)) {
                senders = null;
            }
            if (senders != null) {
                Iterator<T> it = senders.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    MediaStreamTrack mediaStreamTrackTrack = ((RtpSender) next).track();
                    if (kotlin.jvm.internal.L.f(mediaStreamTrackTrack != null ? mediaStreamTrackTrack.id() : null, c36192b.a().id())) {
                        break;
                    }
                }
                RtpSender rtpSender = (RtpSender) next;
                if (rtpSender != null && (dtmfSenderDtmf = rtpSender.dtmf()) != null) {
                    c36193c = new C36193c(dtmfSenderDtmf);
                }
            }
            iVar.f331934q = c36193c;
        }
        C36193c c36193c2 = iVar.f331934q;
        if (c36193c2 == null) {
            g.Companion.b(com.avito.avcalls.android.logger.g.INSTANCE, "PCSession", "failed sendDtmf, dtmfSender is uninitialized");
            return false;
        }
        com.avito.avcalls.android.config.h hVar = iVar.f331919b;
        return c36193c2.f331900a.insertDtmf(str2, (int) hVar.getF331664l(), (int) hVar.getF331665m());
    }

    public final void l(@Y61.k String str) throws AvCallsException.CallNotFoundException, AvCallsException.InvalidCallStateException {
        AbstractC36187o abstractC36187o;
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        String strConcat = "sendRingingForIncomingCall(): callId=".concat(str);
        companion.getClass();
        g.Companion.c("CallManager", strConcat);
        a aVar = this.f331494j.get(str);
        if (aVar == null || (abstractC36187o = aVar.f331495a) == null) {
            throw new AvCallsException.CallNotFoundException(str);
        }
        if (abstractC36187o instanceof F) {
            F f12 = (F) abstractC36187o;
            C43259k.d(f12.f331579b, null, null, new I(f12, null), 3);
        } else {
            throw new AvCallsException.InvalidCallStateException("Expected IncomingCall, but found " + m0.f406844a.b(abstractC36187o.getClass()).l0());
        }
    }

    public final void m(@Y61.k String str) throws AvCallsException.CallNotFoundException, AvCallsException.InvalidCallStateException {
        AbstractC36187o abstractC36187o;
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        String strConcat = "startOutgoingCall(): callId=".concat(str);
        companion.getClass();
        g.Companion.c("CallManager", strConcat);
        a aVar = this.f331494j.get(str);
        if (aVar == null || (abstractC36187o = aVar.f331495a) == null) {
            throw new AvCallsException.CallNotFoundException(str);
        }
        if (abstractC36187o instanceof L) {
            L l12 = (L) abstractC36187o;
            C43259k.d(l12.f331579b, null, null, new O(l12, null), 3);
        } else {
            throw new AvCallsException.InvalidCallStateException("Expected IncomingCall, but found " + m0.f406844a.b(abstractC36187o.getClass()).l0());
        }
    }

    public final void n(@Y61.k String str, @Y61.k xQ0.k kVar, boolean z12) throws AvCallsException.CallNotFoundException {
        AbstractC36187o abstractC36187o;
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CallManager", "terminateCall(): callId=" + str + ", reason=" + kVar + ", isLocally=" + z12);
        a aVar = this.f331494j.get(str);
        if (aVar == null || (abstractC36187o = aVar.f331495a) == null) {
            throw new AvCallsException.CallNotFoundException(str);
        }
        C43259k.d(abstractC36187o.f331579b, null, null, new u(abstractC36187o, kVar, z12, null), 3);
    }
}
