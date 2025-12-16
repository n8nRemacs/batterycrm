package com.avito.avcalls.android.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.avcalls.android.signaling.proto.IncomingDataMessage;
import com.avito.avcalls.android.signaling.proto.IncomingPush;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: CallSessionSignalingApi.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/call/x;", "Lcom/avito/avcalls/android/signaling/c;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class x implements com.avito.avcalls.android.signaling.c {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f331635a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f331636b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.signaling.p f331637c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.utils.coroutines.e f331638d;

    /* compiled from: CallSessionSignalingApi.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/avcalls/android/call/x$a;", "", "<init>", "()V", "", "PING_TIMEOUT_MILLIS", "J", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.call.x$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: CallSessionSignalingApi.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.android.call.CallSessionSignalingApi$restartPingTimer$1", f = "CallSessionSignalingApi.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f331639q;

        public b(Continuation<? super b> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return x.this.new b(continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((b) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f331639q;
            x xVar = x.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.avcalls.android.signaling.p pVar = xVar.f331637c;
                this.f331639q = 1;
                if (pVar.h(xVar.f331635a, xVar.f331636b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            Companion companion = x.INSTANCE;
            xVar.g();
            return G0.f406611a;
        }
    }

    /* compiled from: CallSessionSignalingApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.avcalls.android.call.CallSessionSignalingApi", f = "CallSessionSignalingApi.kt", i = {0}, l = {120}, m = "updateSdp", n = {"this_$iv"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public x f331641q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f331642r;

        /* renamed from: t, reason: collision with root package name */
        public int f331644t;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f331642r = obj;
            this.f331644t |= BeduinInputModel.MIN_TEXT_VERSION;
            return x.this.j(null, null, null, null, null, this);
        }
    }

    public x(@Y61.k String str, @Y61.k String str2, @Y61.k com.avito.avcalls.android.signaling.p pVar, @Y61.k C43238h c43238h) {
        this.f331635a = str;
        this.f331636b = str2;
        this.f331637c = pVar;
        this.f331638d = new com.avito.avcalls.android.utils.coroutines.e(c43238h);
    }

    @Override // com.avito.avcalls.android.signaling.c
    @Y61.k
    public final InterfaceC43160i<IncomingPush> a() {
        return this.f331637c.a();
    }

    @Override // com.avito.avcalls.android.signaling.c
    @Y61.k
    public final InterfaceC43160i<IncomingDataMessage> b() {
        return this.f331637c.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r12, @Y61.k java.lang.String r13, @Y61.k java.lang.String r14, @Y61.k com.avito.avcalls.android.rtc.Sdp r15, @Y61.k java.util.List r16, @Y61.k xQ0.g r17, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r11 = this;
            r0 = r11
            r1 = r18
            boolean r2 = r1 instanceof com.avito.avcalls.android.call.y
            if (r2 == 0) goto L17
            r2 = r1
            com.avito.avcalls.android.call.y r2 = (com.avito.avcalls.android.call.y) r2
            int r3 = r2.f331648t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f331648t = r3
        L15:
            r10 = r2
            goto L1d
        L17:
            com.avito.avcalls.android.call.y r2 = new com.avito.avcalls.android.call.y
            r2.<init>(r11, r1)
            goto L15
        L1d:
            java.lang.Object r1 = r10.f331646r
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r10.f331648t
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            com.avito.avcalls.android.call.x r2 = r10.f331645q
            kotlin.C42729a0.b(r1)
            goto L56
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.C42729a0.b(r1)
            com.avito.avcalls.android.utils.coroutines.e r1 = r0.f331638d
            r1.b()
            r10.f331645q = r0
            r10.f331648t = r4
            com.avito.avcalls.android.signaling.p r3 = r0.f331637c
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            java.lang.Object r1 = r3.c(r4, r5, r6, r7, r8, r9, r10)
            if (r1 != r2) goto L55
            return r2
        L55:
            r2 = r0
        L56:
            com.avito.avcalls.android.signaling.v r1 = (com.avito.avcalls.android.signaling.v) r1
            r2.g()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.call.x.c(java.lang.String, java.lang.String, java.lang.String, com.avito.avcalls.android.rtc.Sdp, java.util.List, xQ0.g, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k java.lang.String r12, @Y61.k java.lang.String r13, @Y61.k java.lang.String r14, boolean r15, @Y61.k com.avito.avcalls.android.signaling.proto.EndpointInfo r16, @Y61.k com.avito.avcalls.android.call.models.CreateCallMetaInfo r17, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r11 = this;
            r0 = r11
            r1 = r18
            boolean r2 = r1 instanceof com.avito.avcalls.android.call.z
            if (r2 == 0) goto L17
            r2 = r1
            com.avito.avcalls.android.call.z r2 = (com.avito.avcalls.android.call.z) r2
            int r3 = r2.f331652t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f331652t = r3
        L15:
            r10 = r2
            goto L1d
        L17:
            com.avito.avcalls.android.call.z r2 = new com.avito.avcalls.android.call.z
            r2.<init>(r11, r1)
            goto L15
        L1d:
            java.lang.Object r1 = r10.f331650r
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r10.f331652t
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            com.avito.avcalls.android.call.x r2 = r10.f331649q
            kotlin.C42729a0.b(r1)
            goto L51
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.C42729a0.b(r1)
            r10.f331649q = r0
            r10.f331652t = r4
            com.avito.avcalls.android.signaling.p r3 = r0.f331637c
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            java.lang.Object r1 = r3.d(r4, r5, r6, r7, r8, r9, r10)
            if (r1 != r2) goto L50
            return r2
        L50:
            r2 = r0
        L51:
            com.avito.avcalls.android.signaling.v r1 = (com.avito.avcalls.android.signaling.v) r1
            boolean r3 = r1 instanceof com.avito.avcalls.android.signaling.v.c
            if (r3 == 0) goto L5b
            r2.g()
            goto L5f
        L5b:
            boolean r2 = r1 instanceof com.avito.avcalls.android.signaling.v.b
            if (r2 == 0) goto L60
        L5f:
            return r1
        L60:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.call.x.d(java.lang.String, java.lang.String, java.lang.String, boolean, com.avito.avcalls.android.signaling.proto.EndpointInfo, com.avito.avcalls.android.call.models.CreateCallMetaInfo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@Y61.k java.lang.String r5, @Y61.k java.lang.String r6, @Y61.k com.avito.avcalls.android.signaling.proto.EndpointInfo r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.avito.avcalls.android.call.A
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.avcalls.android.call.A r0 = (com.avito.avcalls.android.call.A) r0
            int r1 = r0.f331402t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f331402t = r1
            goto L18
        L13:
            com.avito.avcalls.android.call.A r0 = new com.avito.avcalls.android.call.A
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f331400r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f331402t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.avcalls.android.call.x r5 = r0.f331399q
            kotlin.C42729a0.b(r8)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r8)
            r0.f331399q = r4
            r0.f331402t = r3
            com.avito.avcalls.android.signaling.p r8 = r4.f331637c
            java.lang.Object r8 = r8.e(r5, r6, r7, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            com.avito.avcalls.android.signaling.v r8 = (com.avito.avcalls.android.signaling.v) r8
            boolean r6 = r8 instanceof com.avito.avcalls.android.signaling.v.c
            if (r6 == 0) goto L4e
            r5.g()
            goto L52
        L4e:
            boolean r5 = r8 instanceof com.avito.avcalls.android.signaling.v.b
            if (r5 == 0) goto L53
        L52:
            return r8
        L53:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.call.x.e(java.lang.String, java.lang.String, com.avito.avcalls.android.signaling.proto.EndpointInfo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@Y61.k java.lang.String r12, @Y61.k java.lang.String r13, @Y61.k java.lang.String r14, @Y61.k com.avito.avcalls.android.rtc.Sdp r15, @Y61.k java.util.List r16, @Y61.k xQ0.g r17, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r11 = this;
            r0 = r11
            r1 = r18
            boolean r2 = r1 instanceof com.avito.avcalls.android.call.B
            if (r2 == 0) goto L17
            r2 = r1
            com.avito.avcalls.android.call.B r2 = (com.avito.avcalls.android.call.B) r2
            int r3 = r2.f331406t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f331406t = r3
        L15:
            r10 = r2
            goto L1d
        L17:
            com.avito.avcalls.android.call.B r2 = new com.avito.avcalls.android.call.B
            r2.<init>(r11, r1)
            goto L15
        L1d:
            java.lang.Object r1 = r10.f331404r
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r10.f331406t
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            com.avito.avcalls.android.call.x r2 = r10.f331403q
            kotlin.C42729a0.b(r1)
            goto L56
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.C42729a0.b(r1)
            com.avito.avcalls.android.utils.coroutines.e r1 = r0.f331638d
            r1.b()
            r10.f331403q = r0
            r10.f331406t = r4
            com.avito.avcalls.android.signaling.p r3 = r0.f331637c
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            java.lang.Object r1 = r3.f(r4, r5, r6, r7, r8, r9, r10)
            if (r1 != r2) goto L55
            return r2
        L55:
            r2 = r0
        L56:
            com.avito.avcalls.android.signaling.v r1 = (com.avito.avcalls.android.signaling.v) r1
            r2.g()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.call.x.f(java.lang.String, java.lang.String, java.lang.String, com.avito.avcalls.android.rtc.Sdp, java.util.List, xQ0.g, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void g() {
        this.f331638d.a(10000L, new b(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@Y61.k java.lang.String r5, @Y61.k java.lang.String r6, @Y61.k java.lang.String r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.avito.avcalls.android.call.D
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.avcalls.android.call.D r0 = (com.avito.avcalls.android.call.D) r0
            int r1 = r0.f331414t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f331414t = r1
            goto L18
        L13:
            com.avito.avcalls.android.call.D r0 = new com.avito.avcalls.android.call.D
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f331412r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f331414t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.avcalls.android.call.x r5 = r0.f331411q
            kotlin.C42729a0.b(r8)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r8)
            com.avito.avcalls.android.utils.coroutines.e r8 = r4.f331638d
            r8.b()
            r0.f331411q = r4
            r0.f331414t = r3
            com.avito.avcalls.android.signaling.p r8 = r4.f331637c
            java.lang.Object r8 = r8.i(r5, r6, r7, r0)
            if (r8 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            com.avito.avcalls.android.signaling.v r8 = (com.avito.avcalls.android.signaling.v) r8
            r5.g()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.call.x.h(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(@Y61.k java.lang.String r8, @Y61.k java.lang.String r9, @Y61.k java.lang.String r10, @Y61.k xQ0.g r11, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.avito.avcalls.android.call.E
            if (r0 == 0) goto L14
            r0 = r12
            com.avito.avcalls.android.call.E r0 = (com.avito.avcalls.android.call.E) r0
            int r1 = r0.f331418t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f331418t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.avito.avcalls.android.call.E r0 = new com.avito.avcalls.android.call.E
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f331416r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f331418t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.avito.avcalls.android.call.x r8 = r6.f331415q
            kotlin.C42729a0.b(r12)
            goto L4f
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.C42729a0.b(r12)
            com.avito.avcalls.android.utils.coroutines.e r12 = r7.f331638d
            r12.b()
            r6.f331415q = r7
            r6.f331418t = r2
            com.avito.avcalls.android.signaling.p r1 = r7.f331637c
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r12 = r1.k(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L4e
            return r0
        L4e:
            r8 = r7
        L4f:
            com.avito.avcalls.android.signaling.v r12 = (com.avito.avcalls.android.signaling.v) r12
            r8.g()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.call.x.i(java.lang.String, java.lang.String, java.lang.String, xQ0.g, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(@Y61.k java.lang.String r9, @Y61.k java.lang.String r10, @Y61.k java.lang.String r11, @Y61.l com.avito.avcalls.android.rtc.Sdp r12, @Y61.k java.util.List<com.avito.avcalls.android.rtc.IceCandidate> r13, @Y61.k kotlin.coroutines.Continuation<? super com.avito.avcalls.android.signaling.v<kotlin.G0>> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.avito.avcalls.android.call.x.c
            if (r0 == 0) goto L14
            r0 = r14
            com.avito.avcalls.android.call.x$c r0 = (com.avito.avcalls.android.call.x.c) r0
            int r1 = r0.f331644t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f331644t = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.avito.avcalls.android.call.x$c r0 = new com.avito.avcalls.android.call.x$c
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f331642r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f331644t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.avito.avcalls.android.call.x r9 = r7.f331641q
            kotlin.C42729a0.b(r14)
            goto L50
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.C42729a0.b(r14)
            com.avito.avcalls.android.utils.coroutines.e r14 = r8.f331638d
            r14.b()
            r7.f331641q = r8
            r7.f331644t = r2
            com.avito.avcalls.android.signaling.p r1 = r8.f331637c
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r14 = r1.l(r2, r3, r4, r5, r6, r7)
            if (r14 != r0) goto L4f
            return r0
        L4f:
            r9 = r8
        L50:
            com.avito.avcalls.android.signaling.v r14 = (com.avito.avcalls.android.signaling.v) r14
            r9.g()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.call.x.j(java.lang.String, java.lang.String, java.lang.String, com.avito.avcalls.android.rtc.Sdp, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
