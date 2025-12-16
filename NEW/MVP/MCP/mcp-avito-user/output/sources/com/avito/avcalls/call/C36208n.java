package com.avito.avcalls.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.avcalls.call.models.CallState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CallSession.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.call.CallSession$3", f = "CallSession.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.avcalls.call.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36208n extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332731q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f332732r;

    /* compiled from: CallSession.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newAudioTxEnabled", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.avcalls.call.n$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r f332733b;

        public a(r rVar) {
            this.f332733b = rVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            com.avito.avcalls.rtc.media.h hVar;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            r.f332790n.c(com.avito.android.bxcontent.mvi.entity.f.l("newAudioTxEnabled=", zBooleanValue), "flow.newAudioTxEnabled", new Object[0]);
            com.avito.avcalls.rtc.q qVar = this.f332733b.f332798h;
            qVar.F().b("setAudioTxEnabled", Boolean.valueOf(zBooleanValue));
            com.avito.avcalls.rtc.g gVar = qVar.f333215b;
            if (zBooleanValue) {
                com.avito.avcalls.rtc.g.f333136t.c("needsToEnableAudioSession=" + gVar.f333153q, "enableAudioSessionIfNeeded", new Object[0]);
                if (gVar.f333153q) {
                    gVar.f333141e.a(gVar.f333144h.getF282a(), true);
                    com.avito.avcalls.rtc.media.b bVar = gVar.f333146j;
                    if (bVar != null && (hVar = gVar.f333147k) != null) {
                        hVar.y(bVar);
                    }
                    gVar.f333153q = false;
                }
            }
            com.avito.avcalls.rtc.media.b bVar2 = gVar.f333146j;
            if (bVar2 != null && bVar2.isEnabled() != zBooleanValue) {
                bVar2.setEnabled(zBooleanValue);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/n1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.call.n$b */
    public static final class b implements InterfaceC43160i<CallState> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f332734b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/n1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.avcalls.call.n$b$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f332735b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.avcalls.call.CallSession$3$invokeSuspend$$inlined$filterNot$1$2", f = "CallSession.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.avcalls.call.n$b$a$a, reason: collision with other inner class name */
            public static final class C10334a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f332736q;

                /* renamed from: r, reason: collision with root package name */
                public int f332737r;

                public C10334a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f332736q = obj;
                    this.f332737r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f332735b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.avcalls.call.C36208n.b.a.C10334a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.avcalls.call.n$b$a$a r0 = (com.avito.avcalls.call.C36208n.b.a.C10334a) r0
                    int r1 = r0.f332737r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f332737r = r1
                    goto L18
                L13:
                    com.avito.avcalls.call.n$b$a$a r0 = new com.avito.avcalls.call.n$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f332736q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f332737r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L53
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    com.avito.avcalls.call.models.CallState r6 = (com.avito.avcalls.call.models.CallState) r6
                    com.avito.avcalls.call.models.InvitingState r2 = r6.getInvitingState()
                    boolean r2 = r2 instanceof com.avito.avcalls.call.models.InvitingState.Terminating
                    if (r2 != 0) goto L53
                    com.avito.avcalls.call.models.InvitingState r6 = r6.getInvitingState()
                    boolean r6 = r6 instanceof com.avito.avcalls.call.models.InvitingState.Terminated
                    if (r6 == 0) goto L48
                    goto L53
                L48:
                    r0.f332737r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f332735b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L53
                    return r1
                L53:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.C36208n.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i) {
            this.f332734b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super CallState> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f332734b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.call.n$c */
    public static final class c implements InterfaceC43160i<kotlin.Q<? extends Boolean, ? extends Boolean>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f332739b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.avcalls.call.n$c$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f332740b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.avcalls.call.CallSession$3$invokeSuspend$$inlined$map$1$2", f = "CallSession.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.avcalls.call.n$c$a$a, reason: collision with other inner class name */
            public static final class C10335a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f332741q;

                /* renamed from: r, reason: collision with root package name */
                public int f332742r;

                public C10335a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f332741q = obj;
                    this.f332742r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f332740b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.avcalls.call.C36208n.c.a.C10335a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.avcalls.call.n$c$a$a r0 = (com.avito.avcalls.call.C36208n.c.a.C10335a) r0
                    int r1 = r0.f332742r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f332742r = r1
                    goto L18
                L13:
                    com.avito.avcalls.call.n$c$a$a r0 = new com.avito.avcalls.call.n$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f332741q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f332742r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L5e
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.avcalls.call.models.CallState r5 = (com.avito.avcalls.call.models.CallState) r5
                    boolean r6 = com.avito.avcalls.call.z.a(r5)
                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
                    com.avito.avcalls.call.models.MediaStatus r5 = r5.getLocalMediaStatus()
                    com.avito.avcalls.call.models.MediaSenderState r5 = r5.getMss()
                    boolean r5 = r5.getSendingAudio()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                    kotlin.Q r2 = new kotlin.Q
                    r2.<init>(r6, r5)
                    r0.f332742r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f332740b
                    java.lang.Object r5 = r5.emit(r2, r0)
                    if (r5 != r1) goto L5e
                    return r1
                L5e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.C36208n.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(b bVar) {
            this.f332739b = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super kotlin.Q<? extends Boolean, ? extends Boolean>> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f332739b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.call.n$d */
    public static final class d implements InterfaceC43160i<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f332744b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.avcalls.call.n$d$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f332745b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.avcalls.call.CallSession$3$invokeSuspend$$inlined$map$2$2", f = "CallSession.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.avcalls.call.n$d$a$a, reason: collision with other inner class name */
            public static final class C10336a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f332746q;

                /* renamed from: r, reason: collision with root package name */
                public int f332747r;

                public C10336a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f332746q = obj;
                    this.f332747r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f332745b = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, @Y61.k kotlin.coroutines.Continuation r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.avito.avcalls.call.C36208n.d.a.C10336a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.avito.avcalls.call.n$d$a$a r0 = (com.avito.avcalls.call.C36208n.d.a.C10336a) r0
                    int r1 = r0.f332747r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f332747r = r1
                    goto L18
                L13:
                    com.avito.avcalls.call.n$d$a$a r0 = new com.avito.avcalls.call.n$d$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f332746q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f332747r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r9)
                    goto L73
                L29:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L31:
                    kotlin.C42729a0.b(r9)
                    kotlin.Q r8 = (kotlin.Q) r8
                    A r9 = r8.f406619b
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    boolean r9 = r9.booleanValue()
                    B r8 = r8.f406620c
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    com.avito.avcalls.utils.logs.a r2 = com.avito.avcalls.call.r.f332790n
                    java.lang.String r4 = "state.isMediaTxAllowed="
                    java.lang.String r4 = com.avito.android.bxcontent.mvi.entity.f.l(r4, r9)
                    java.lang.String r5 = "state.localMediaStatus.mss.sendingAudio="
                    java.lang.String r5 = com.avito.android.bxcontent.mvi.entity.f.l(r5, r8)
                    java.lang.Object[] r5 = new java.lang.Object[]{r5}
                    java.lang.String r6 = "flow.newAudioTxEnabled"
                    r2.c(r4, r6, r5)
                    if (r9 == 0) goto L63
                    if (r8 == 0) goto L63
                    r8 = r3
                    goto L64
                L63:
                    r8 = 0
                L64:
                    java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
                    r0.f332747r = r3
                    kotlinx.coroutines.flow.j r9 = r7.f332745b
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L73
                    return r1
                L73:
                    kotlin.G0 r8 = kotlin.G0.f406611a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.C36208n.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(InterfaceC43160i interfaceC43160i) {
            this.f332744b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f332744b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36208n(r rVar, Continuation<? super C36208n> continuation) {
        super(2, continuation);
        this.f332732r = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36208n(this.f332732r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C36208n) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332731q;
        if (i12 == 0) {
            C42729a0.b(obj);
            r rVar = this.f332732r;
            InterfaceC43160i interfaceC43160iR = C43175k.r(new d(C43175k.r(new c(new b(rVar.f332803m)))));
            a aVar = new a(rVar);
            this.f332731q = 1;
            if (interfaceC43160iR.collect(aVar, this) == coroutine_suspended) {
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
