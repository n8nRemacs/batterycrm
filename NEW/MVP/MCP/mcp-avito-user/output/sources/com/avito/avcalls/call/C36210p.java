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
@DebugMetadata(c = "com.avito.avcalls.call.CallSession$5", f = "CallSession.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.avcalls.call.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36210p extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332768q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f332769r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f332770s;

    /* compiled from: CallSession.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "localSendingVideo", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.avcalls.call.p$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r f332771b;

        public a(r rVar) {
            this.f332771b = rVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            r.f332790n.c(com.avito.android.bxcontent.mvi.entity.f.l("localSendingVideo=", zBooleanValue), "flow.newCameraEnabled", new Object[0]);
            r rVar = this.f332771b;
            rVar.f332798h.O(zBooleanValue, rVar.a().getDefaultCamera());
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/n1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.call.p$b */
    public static final class b implements InterfaceC43160i<CallState> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f332772b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/n1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.avcalls.call.p$b$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f332773b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.avcalls.call.CallSession$5$invokeSuspend$$inlined$filterNot$1$2", f = "CallSession.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.avcalls.call.p$b$a$a, reason: collision with other inner class name */
            public static final class C10340a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f332774q;

                /* renamed from: r, reason: collision with root package name */
                public int f332775r;

                public C10340a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f332774q = obj;
                    this.f332775r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f332773b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.avcalls.call.C36210p.b.a.C10340a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.avcalls.call.p$b$a$a r0 = (com.avito.avcalls.call.C36210p.b.a.C10340a) r0
                    int r1 = r0.f332775r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f332775r = r1
                    goto L18
                L13:
                    com.avito.avcalls.call.p$b$a$a r0 = new com.avito.avcalls.call.p$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f332774q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f332775r
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
                    r0.f332775r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f332773b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L53
                    return r1
                L53:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.C36210p.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i) {
            this.f332772b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super CallState> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f332772b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.call.p$c */
    public static final class c implements InterfaceC43160i<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f332777b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.avcalls.call.p$c$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f332778b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.avcalls.call.CallSession$5$invokeSuspend$$inlined$map$1$2", f = "CallSession.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.avcalls.call.p$c$a$a, reason: collision with other inner class name */
            public static final class C10341a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f332779q;

                /* renamed from: r, reason: collision with root package name */
                public int f332780r;

                public C10341a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f332779q = obj;
                    this.f332780r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f332778b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.avcalls.call.C36210p.c.a.C10341a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.avcalls.call.p$c$a$a r0 = (com.avito.avcalls.call.C36210p.c.a.C10341a) r0
                    int r1 = r0.f332780r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f332780r = r1
                    goto L18
                L13:
                    com.avito.avcalls.call.p$c$a$a r0 = new com.avito.avcalls.call.p$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f332779q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f332780r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L51
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.avcalls.call.models.CallState r5 = (com.avito.avcalls.call.models.CallState) r5
                    com.avito.avcalls.call.models.MediaStatus r5 = r5.getLocalMediaStatus()
                    com.avito.avcalls.call.models.MediaSenderState r5 = r5.getMss()
                    boolean r5 = r5.getSendingVideo()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                    r0.f332780r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f332778b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L51
                    return r1
                L51:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.C36210p.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(b bVar) {
            this.f332777b = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f332777b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36210p(boolean z12, r rVar, Continuation<? super C36210p> continuation) {
        super(2, continuation);
        this.f332769r = z12;
        this.f332770s = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36210p(this.f332769r, this.f332770s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C36210p) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332768q;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (!this.f332769r) {
                return G0.f406611a;
            }
            r rVar = this.f332770s;
            InterfaceC43160i interfaceC43160iR = C43175k.r(new c(new b(rVar.f332803m)));
            a aVar = new a(rVar);
            this.f332768q = 1;
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
