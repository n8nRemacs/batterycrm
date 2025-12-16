package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction;
import javax.inject.Inject;
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

/* compiled from: BeduinBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/i;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements com.avito.android.arch.mvi.b<BeduinInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.handler.flow.processor.b f176302a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.interaction.navigation_controller.c f176303b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<dU0.f> f176304c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final k f176305d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<com.avito.beduin.v2.interaction.navigation.flow.t> f176306e;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<BeduinInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f176307b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.lib.beduin_v2.feature.mvi.i$a$a, reason: collision with other inner class name */
        public static final class C5222a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f176308b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.mvi.BeduinBootstrap$produce$$inlined$map$1$2", f = "BeduinBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.lib.beduin_v2.feature.mvi.i$a$a$a, reason: collision with other inner class name */
            public static final class C5223a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f176309q;

                /* renamed from: r, reason: collision with root package name */
                public int f176310r;

                public C5223a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f176309q = obj;
                    this.f176310r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C5222a.this.emit(null, this);
                }
            }

            public C5222a(InterfaceC43172j interfaceC43172j) {
                this.f176308b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.lib.beduin_v2.feature.mvi.i.a.C5222a.C5223a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.lib.beduin_v2.feature.mvi.i$a$a$a r0 = (com.avito.android.lib.beduin_v2.feature.mvi.i.a.C5222a.C5223a) r0
                    int r1 = r0.f176310r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f176310r = r1
                    goto L18
                L13:
                    com.avito.android.lib.beduin_v2.feature.mvi.i$a$a$a r0 = new com.avito.android.lib.beduin_v2.feature.mvi.i$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f176309q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f176310r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L72
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.beduin.v2.handler.flow.processor.a r5 = (com.avito.beduin.v2.handler.flow.processor.a) r5
                    boolean r6 = r5 instanceof com.avito.beduin.v2.handler.flow.processor.a.b
                    if (r6 == 0) goto L44
                    com.avito.beduin.v2.handler.flow.processor.a$b r5 = (com.avito.beduin.v2.handler.flow.processor.a.b) r5
                    com.avito.beduin.v2.handler.flow.m r5 = r5.f337170a
                    com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$ShowContent r6 = new com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$ShowContent
                    r6.<init>(r5)
                    goto L67
                L44:
                    boolean r6 = r5 instanceof com.avito.beduin.v2.handler.flow.processor.a.C10444a
                    if (r6 == 0) goto L75
                    com.avito.beduin.v2.handler.flow.processor.a$a r5 = (com.avito.beduin.v2.handler.flow.processor.a.C10444a) r5
                    dU0.f r5 = r5.f337169a
                    dU0.b r5 = r5.f393891b
                    boolean r6 = r5 instanceof dU0.InterfaceC39628a
                    if (r6 == 0) goto L5a
                    com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$SendComponentInteraction r6 = new com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$SendComponentInteraction
                    dU0.a r5 = (dU0.InterfaceC39628a) r5
                    r6.<init>(r5)
                    goto L67
                L5a:
                    boolean r6 = r5 instanceof HU0.b
                    if (r6 == 0) goto L62
                    com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$Reload r5 = com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction.Reload.f176259b
                    r6 = r5
                    goto L67
                L62:
                    com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$SendPlatformInteraction r6 = new com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$SendPlatformInteraction
                    r6.<init>(r5)
                L67:
                    r0.f176310r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f176308b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L72
                    return r1
                L72:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                L75:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.feature.mvi.i.a.C5222a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i) {
            this.f176307b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super BeduinInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f176307b.collect(new C5222a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<BeduinInternalAction.OnBeduinScreen> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f176312b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f176313b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.mvi.BeduinBootstrap$produce$$inlined$mapNotNull$1$2", f = "BeduinBootstrap.kt", i = {}, l = {222}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.lib.beduin_v2.feature.mvi.i$b$a$a, reason: collision with other inner class name */
            public static final class C5224a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f176314q;

                /* renamed from: r, reason: collision with root package name */
                public int f176315r;

                public C5224a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f176314q = obj;
                    this.f176315r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f176313b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.lib.beduin_v2.feature.mvi.i.b.a.C5224a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.lib.beduin_v2.feature.mvi.i$b$a$a r0 = (com.avito.android.lib.beduin_v2.feature.mvi.i.b.a.C5224a) r0
                    int r1 = r0.f176315r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f176315r = r1
                    goto L18
                L13:
                    com.avito.android.lib.beduin_v2.feature.mvi.i$b$a$a r0 = new com.avito.android.lib.beduin_v2.feature.mvi.i$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f176314q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f176315r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.beduin.v2.interaction.navigation.flow.t r5 = (com.avito.beduin.v2.interaction.navigation.flow.t) r5
                    if (r5 == 0) goto L3e
                    com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$OnBeduinScreen r6 = new com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction$OnBeduinScreen
                    r6.<init>(r5)
                    goto L3f
                L3e:
                    r6 = 0
                L3f:
                    if (r6 == 0) goto L4c
                    r0.f176315r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f176313b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.feature.mvi.i.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i) {
            this.f176312b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super BeduinInternalAction.OnBeduinScreen> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f176312b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.mvi.BeduinBootstrap$produce$$inlined$transform$1", f = "BeduinBootstrap.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BeduinInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f176317q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f176318r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f176319s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ i f176320t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<BeduinInternalAction> f176321b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f176322c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.mvi.BeduinBootstrap$produce$$inlined$transform$1$1", f = "BeduinBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.lib.beduin_v2.feature.mvi.i$c$a$a, reason: collision with other inner class name */
            public static final class C5225a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f176323q;

                /* renamed from: r, reason: collision with root package name */
                public int f176324r;

                public C5225a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f176323q = obj;
                    this.f176324r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, i iVar) {
                this.f176322c = iVar;
                this.f176321b = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.lib.beduin_v2.feature.mvi.i.c.a.C5225a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.lib.beduin_v2.feature.mvi.i$c$a$a r0 = (com.avito.android.lib.beduin_v2.feature.mvi.i.c.a.C5225a) r0
                    int r1 = r0.f176324r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f176324r = r1
                    goto L18
                L13:
                    com.avito.android.lib.beduin_v2.feature.mvi.i$c$a$a r0 = new com.avito.android.lib.beduin_v2.feature.mvi.i$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f176323q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f176324r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    dU0.f r5 = (dU0.f) r5
                    com.avito.android.lib.beduin_v2.feature.mvi.i r6 = r4.f176322c
                    com.avito.beduin.v2.handler.flow.processor.b r6 = r6.f176302a
                    r0.f176324r = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.feature.mvi.i.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC43160i interfaceC43160i, Continuation continuation, i iVar) {
            super(2, continuation);
            this.f176319s = interfaceC43160i;
            this.f176320t = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f176319s, continuation, this.f176320t);
            cVar.f176318r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BeduinInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f176317q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f176318r, this.f176320t);
                this.f176317q = 1;
                if (this.f176319s.collect(aVar, this) == coroutine_suspended) {
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

    @Inject
    public i(@Y61.k com.avito.beduin.v2.handler.flow.processor.b bVar, @Y61.k com.avito.beduin.v2.interaction.navigation_controller.c cVar, @Y61.k InterfaceC43160i<dU0.f> interfaceC43160i, @Y61.k k kVar, @Y61.k InterfaceC43160i<com.avito.beduin.v2.interaction.navigation.flow.t> interfaceC43160i2) {
        this.f176302a = bVar;
        this.f176303b = cVar;
        this.f176304c = interfaceC43160i;
        this.f176305d = kVar;
        this.f176306e = interfaceC43160i2;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<BeduinInternalAction> a() {
        InterfaceC43160i interfaceC43160iG = C43175k.G(new c(this.f176304c, null, this));
        com.avito.beduin.v2.handler.flow.processor.b bVar = this.f176302a;
        bVar.getClass();
        return C43175k.N(interfaceC43160iG, new a(C43175k.G(new com.avito.beduin.v2.handler.flow.processor.h(bVar, null, this.f176303b))), this.f176305d, new b(this.f176306e));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
