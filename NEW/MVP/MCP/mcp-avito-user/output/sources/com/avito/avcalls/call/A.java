package com.avito.avcalls.call;

import com.avito.avcalls.signaling.proto.IncomingDataMessage;
import com.avito.avcalls.signaling.proto.IncomingPush;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: CallSessionSignalingApi.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/call/A;", "Lcom/avito/avcalls/signaling/c;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class A implements com.avito.avcalls.signaling.c {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f332546a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f332547b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.signaling.p f332548c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.utils.coroutines.e f332549d;

    /* compiled from: CallSessionSignalingApi.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/avcalls/call/A$a;", "", "<init>", "()V", "", "PING_TIMEOUT_MILLIS", "J", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.call.A$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: CallSessionSignalingApi.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.call.CallSessionSignalingApi$restartPingTimer$1", f = "CallSessionSignalingApi.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f332550q;

        public b(Continuation<? super b> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return A.this.new b(continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((b) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f332550q;
            A a12 = A.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.avcalls.signaling.p pVar = a12.f332548c;
                this.f332550q = 1;
                if (pVar.h(a12.f332546a, a12.f332547b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            Companion companion = A.INSTANCE;
            a12.g();
            return G0.f406611a;
        }
    }

    public A(@Y61.k String str, @Y61.k String str2, @Y61.k com.avito.avcalls.signaling.p pVar, @Y61.k C43238h c43238h) {
        this.f332546a = str;
        this.f332547b = str2;
        this.f332548c = pVar;
        this.f332549d = new com.avito.avcalls.utils.coroutines.e(c43238h);
    }

    @Override // com.avito.avcalls.signaling.c
    @Y61.k
    public final InterfaceC43160i<IncomingPush> a() {
        return this.f332548c.a();
    }

    @Override // com.avito.avcalls.signaling.c
    @Y61.k
    public final InterfaceC43160i<IncomingDataMessage> b() {
        return this.f332548c.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r12, @Y61.k java.lang.String r13, @Y61.k java.lang.String r14, @Y61.k com.avito.avcalls.rtc.connecting.Sdp r15, @Y61.k java.util.List r16, @Y61.k com.avito.avcalls.call.models.MediaSenderState r17, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r11 = this;
            r0 = r11
            r1 = r18
            boolean r2 = r1 instanceof com.avito.avcalls.call.B
            if (r2 == 0) goto L17
            r2 = r1
            com.avito.avcalls.call.B r2 = (com.avito.avcalls.call.B) r2
            int r3 = r2.f332555t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f332555t = r3
        L15:
            r10 = r2
            goto L1d
        L17:
            com.avito.avcalls.call.B r2 = new com.avito.avcalls.call.B
            r2.<init>(r11, r1)
            goto L15
        L1d:
            java.lang.Object r1 = r10.f332553r
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r10.f332555t
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            com.avito.avcalls.call.A r2 = r10.f332552q
            kotlin.C42729a0.b(r1)
            goto L56
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.C42729a0.b(r1)
            com.avito.avcalls.utils.coroutines.e r1 = r0.f332549d
            r1.b()
            r10.f332552q = r0
            r10.f332555t = r4
            com.avito.avcalls.signaling.p r3 = r0.f332548c
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
            com.avito.avcalls.signaling.x r1 = (com.avito.avcalls.signaling.x) r1
            r2.g()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.A.c(java.lang.String, java.lang.String, java.lang.String, com.avito.avcalls.rtc.connecting.Sdp, java.util.List, com.avito.avcalls.call.models.MediaSenderState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k java.lang.String r12, @Y61.k java.lang.String r13, @Y61.k java.lang.String r14, boolean r15, @Y61.k com.avito.avcalls.signaling.proto.EndpointInfo r16, @Y61.k com.avito.avcalls.call.models.CreateCallMetaInfo r17, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r11 = this;
            r0 = r11
            r1 = r18
            boolean r2 = r1 instanceof com.avito.avcalls.call.C
            if (r2 == 0) goto L17
            r2 = r1
            com.avito.avcalls.call.C r2 = (com.avito.avcalls.call.C) r2
            int r3 = r2.f332559t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f332559t = r3
        L15:
            r10 = r2
            goto L1d
        L17:
            com.avito.avcalls.call.C r2 = new com.avito.avcalls.call.C
            r2.<init>(r11, r1)
            goto L15
        L1d:
            java.lang.Object r1 = r10.f332557r
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r10.f332559t
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            com.avito.avcalls.call.A r2 = r10.f332556q
            kotlin.C42729a0.b(r1)
            goto L51
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.C42729a0.b(r1)
            r10.f332556q = r0
            r10.f332559t = r4
            com.avito.avcalls.signaling.p r3 = r0.f332548c
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
            com.avito.avcalls.signaling.x r1 = (com.avito.avcalls.signaling.x) r1
            boolean r3 = r1 instanceof com.avito.avcalls.signaling.x.c
            if (r3 == 0) goto L5b
            r2.g()
            goto L5f
        L5b:
            boolean r2 = r1 instanceof com.avito.avcalls.signaling.x.b
            if (r2 == 0) goto L60
        L5f:
            return r1
        L60:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.A.d(java.lang.String, java.lang.String, java.lang.String, boolean, com.avito.avcalls.signaling.proto.EndpointInfo, com.avito.avcalls.call.models.CreateCallMetaInfo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@Y61.k java.lang.String r5, @Y61.k java.lang.String r6, @Y61.k com.avito.avcalls.signaling.proto.EndpointInfo r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.avito.avcalls.call.D
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.avcalls.call.D r0 = (com.avito.avcalls.call.D) r0
            int r1 = r0.f332563t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f332563t = r1
            goto L18
        L13:
            com.avito.avcalls.call.D r0 = new com.avito.avcalls.call.D
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f332561r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f332563t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.avcalls.call.A r5 = r0.f332560q
            kotlin.C42729a0.b(r8)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r8)
            r0.f332560q = r4
            r0.f332563t = r3
            com.avito.avcalls.signaling.p r8 = r4.f332548c
            java.lang.Object r8 = r8.e(r5, r6, r7, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            com.avito.avcalls.signaling.x r8 = (com.avito.avcalls.signaling.x) r8
            boolean r6 = r8 instanceof com.avito.avcalls.signaling.x.c
            if (r6 == 0) goto L4e
            r5.g()
            goto L52
        L4e:
            boolean r5 = r8 instanceof com.avito.avcalls.signaling.x.b
            if (r5 == 0) goto L53
        L52:
            return r8
        L53:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.A.e(java.lang.String, java.lang.String, com.avito.avcalls.signaling.proto.EndpointInfo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@Y61.k java.lang.String r12, @Y61.k java.lang.String r13, @Y61.k java.lang.String r14, @Y61.k com.avito.avcalls.rtc.connecting.Sdp r15, @Y61.k java.util.List r16, @Y61.k com.avito.avcalls.call.models.MediaSenderState r17, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r11 = this;
            r0 = r11
            r1 = r18
            boolean r2 = r1 instanceof com.avito.avcalls.call.E
            if (r2 == 0) goto L17
            r2 = r1
            com.avito.avcalls.call.E r2 = (com.avito.avcalls.call.E) r2
            int r3 = r2.f332567t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f332567t = r3
        L15:
            r10 = r2
            goto L1d
        L17:
            com.avito.avcalls.call.E r2 = new com.avito.avcalls.call.E
            r2.<init>(r11, r1)
            goto L15
        L1d:
            java.lang.Object r1 = r10.f332565r
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r10.f332567t
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            com.avito.avcalls.call.A r2 = r10.f332564q
            kotlin.C42729a0.b(r1)
            goto L56
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.C42729a0.b(r1)
            com.avito.avcalls.utils.coroutines.e r1 = r0.f332549d
            r1.b()
            r10.f332564q = r0
            r10.f332567t = r4
            com.avito.avcalls.signaling.p r3 = r0.f332548c
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
            com.avito.avcalls.signaling.x r1 = (com.avito.avcalls.signaling.x) r1
            r2.g()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.A.f(java.lang.String, java.lang.String, java.lang.String, com.avito.avcalls.rtc.connecting.Sdp, java.util.List, com.avito.avcalls.call.models.MediaSenderState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void g() {
        this.f332549d.a(10000L, new b(null));
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
            boolean r0 = r8 instanceof com.avito.avcalls.call.G
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.avcalls.call.G r0 = (com.avito.avcalls.call.G) r0
            int r1 = r0.f332575t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f332575t = r1
            goto L18
        L13:
            com.avito.avcalls.call.G r0 = new com.avito.avcalls.call.G
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f332573r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f332575t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.avcalls.call.A r5 = r0.f332572q
            kotlin.C42729a0.b(r8)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r8)
            com.avito.avcalls.utils.coroutines.e r8 = r4.f332549d
            r8.b()
            r0.f332572q = r4
            r0.f332575t = r3
            com.avito.avcalls.signaling.p r8 = r4.f332548c
            java.lang.Object r8 = r8.i(r5, r6, r7, r0)
            if (r8 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            com.avito.avcalls.signaling.x r8 = (com.avito.avcalls.signaling.x) r8
            r5.g()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.A.h(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(@Y61.k java.lang.String r8, @Y61.k java.lang.String r9, @Y61.k java.lang.String r10, @Y61.k com.avito.avcalls.call.models.MediaSenderState r11, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.avito.avcalls.call.H
            if (r0 == 0) goto L14
            r0 = r12
            com.avito.avcalls.call.H r0 = (com.avito.avcalls.call.H) r0
            int r1 = r0.f332579t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f332579t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.avito.avcalls.call.H r0 = new com.avito.avcalls.call.H
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f332577r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f332579t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.avito.avcalls.call.A r8 = r6.f332576q
            kotlin.C42729a0.b(r12)
            goto L4f
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.C42729a0.b(r12)
            com.avito.avcalls.utils.coroutines.e r12 = r7.f332549d
            r12.b()
            r6.f332576q = r7
            r6.f332579t = r2
            com.avito.avcalls.signaling.p r1 = r7.f332548c
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
            com.avito.avcalls.signaling.x r12 = (com.avito.avcalls.signaling.x) r12
            r8.g()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.A.i(java.lang.String, java.lang.String, java.lang.String, com.avito.avcalls.call.models.MediaSenderState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(@Y61.k java.lang.String r9, @Y61.k java.lang.String r10, @Y61.k java.lang.String r11, @Y61.l com.avito.avcalls.rtc.connecting.Sdp r12, @Y61.k java.util.List r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.avito.avcalls.call.I
            if (r0 == 0) goto L14
            r0 = r14
            com.avito.avcalls.call.I r0 = (com.avito.avcalls.call.I) r0
            int r1 = r0.f332583t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f332583t = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.avito.avcalls.call.I r0 = new com.avito.avcalls.call.I
            r0.<init>(r8, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f332581r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f332583t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.avito.avcalls.call.A r9 = r7.f332580q
            kotlin.C42729a0.b(r14)
            goto L50
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.C42729a0.b(r14)
            com.avito.avcalls.utils.coroutines.e r14 = r8.f332549d
            r14.b()
            r7.f332580q = r8
            r7.f332583t = r2
            com.avito.avcalls.signaling.p r1 = r8.f332548c
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
            com.avito.avcalls.signaling.x r14 = (com.avito.avcalls.signaling.x) r14
            r9.g()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.A.j(java.lang.String, java.lang.String, java.lang.String, com.avito.avcalls.rtc.connecting.Sdp, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
