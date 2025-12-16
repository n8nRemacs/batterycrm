package com.avito.beduin.v2.component.scrollable_containers.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.beduin.v2.component.scrollable_containers.compose.h;
import com.avito.beduin.v2.interaction.scroll_to.api.ScrollToPositionInteraction;
import dU0.InterfaceC39628a;
import fU0.AbstractC40338a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: HandleScrollToPositionInteraction.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: HandleScrollToPositionInteraction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.component.scrollable_containers.compose.a$a, reason: collision with other inner class name */
    public static final class C10425a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C10425a f336228l = new C10425a();

        public C10425a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: HandleScrollToPositionInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.beduin.v2.component.scrollable_containers.compose.HandleScrollToPositionInteractionKt$HandleScrollToPositionInteraction$2", f = "HandleScrollToPositionInteraction.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f336229q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC39628a> f336230r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.engine.utils.c<AbstractC40338a> f336231s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f336232t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ f f336233u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f336234v;

        /* compiled from: HandleScrollToPositionInteraction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/scroll_to/api/ScrollToPositionInteraction;", "interaction", "Lkotlin/G0;", "emit", "(Lcom/avito/beduin/v2/interaction/scroll_to/api/ScrollToPositionInteraction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.component.scrollable_containers.compose.a$b$a, reason: collision with other inner class name */
        public static final class C10426a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y41.a<G0> f336235b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f336236c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f336237d;

            /* compiled from: HandleScrollToPositionInteraction.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.beduin.v2.component.scrollable_containers.compose.a$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C10427a {
                static {
                    int[] iArr = new int[ScrollToPositionInteraction.Alignment.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        ScrollToPositionInteraction.Alignment alignment = ScrollToPositionInteraction.Alignment.f337821c;
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        ScrollToPositionInteraction.Alignment alignment2 = ScrollToPositionInteraction.Alignment.f337821c;
                        iArr[2] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                }
            }

            public C10426a(Y41.a<G0> aVar, f fVar, boolean z12) {
                this.f336235b = aVar;
                this.f336236c = fVar;
                this.f336237d = z12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                ScrollToPositionInteraction scrollToPositionInteraction = (ScrollToPositionInteraction) obj;
                int i12 = scrollToPositionInteraction.f337817a;
                this.f336235b.invoke();
                int iOrdinal = scrollToPositionInteraction.f337819c.ordinal();
                f fVar = this.f336236c;
                boolean z12 = scrollToPositionInteraction.f337818b;
                if (iOrdinal == 0) {
                    if (z12) {
                        Object objG = fVar.g(i12, continuation);
                        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
                    }
                    Object objA = fVar.a(i12, continuation);
                    return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
                }
                boolean z13 = this.f336237d;
                if (iOrdinal == 1) {
                    Object objC = a.c(fVar, z12, z13, i12, continuation);
                    return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
                }
                if (iOrdinal != 2) {
                    return G0.f406611a;
                }
                Object objB = a.b(fVar, z12, z13, i12, continuation);
                return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.component.scrollable_containers.compose.a$b$b, reason: collision with other inner class name */
        public static final class C10428b implements InterfaceC43160i<InterfaceC39628a> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f336238b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.avito.beduin.v2.engine.utils.c f336239c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.beduin.v2.component.scrollable_containers.compose.a$b$b$a, reason: collision with other inner class name */
            public static final class C10429a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f336240b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ com.avito.beduin.v2.engine.utils.c f336241c;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.beduin.v2.component.scrollable_containers.compose.HandleScrollToPositionInteractionKt$HandleScrollToPositionInteraction$2$invokeSuspend$$inlined$filter$1$2", f = "HandleScrollToPositionInteraction.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.beduin.v2.component.scrollable_containers.compose.a$b$b$a$a, reason: collision with other inner class name */
                public static final class C10430a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f336242q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f336243r;

                    public C10430a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f336242q = obj;
                        this.f336243r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C10429a.this.emit(null, this);
                    }
                }

                public C10429a(InterfaceC43172j interfaceC43172j, com.avito.beduin.v2.engine.utils.c cVar) {
                    this.f336240b = interfaceC43172j;
                    this.f336241c = cVar;
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
                        boolean r0 = r6 instanceof com.avito.beduin.v2.component.scrollable_containers.compose.a.b.C10428b.C10429a.C10430a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.beduin.v2.component.scrollable_containers.compose.a$b$b$a$a r0 = (com.avito.beduin.v2.component.scrollable_containers.compose.a.b.C10428b.C10429a.C10430a) r0
                        int r1 = r0.f336243r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f336243r = r1
                        goto L18
                    L13:
                        com.avito.beduin.v2.component.scrollable_containers.compose.a$b$b$a$a r0 = new com.avito.beduin.v2.component.scrollable_containers.compose.a$b$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f336242q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f336243r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L56
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        r6 = r5
                        dU0.a r6 = (dU0.InterfaceC39628a) r6
                        com.avito.beduin.v2.engine.utils.c r2 = r4.f336241c
                        if (r2 == 0) goto L56
                        T[] r2 = r2.f336915a
                        fU0.a[] r2 = (fU0.AbstractC40338a[]) r2
                        if (r2 == 0) goto L56
                        fU0.a r6 = r6.getF337716c()
                        int r6 = kotlin.collections.C42756l.H(r6, r2)
                        if (r6 < 0) goto L56
                        r0.f336243r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f336240b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L56
                        return r1
                    L56:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.component.scrollable_containers.compose.a.b.C10428b.C10429a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public C10428b(InterfaceC43160i interfaceC43160i, com.avito.beduin.v2.engine.utils.c cVar) {
                this.f336238b = interfaceC43160i;
                this.f336239c = cVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC39628a> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f336238b.collect(new C10429a(interfaceC43172j, this.f336239c), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/l1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC43160i<Object> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C10428b f336245b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/l1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.beduin.v2.component.scrollable_containers.compose.a$b$c$a, reason: collision with other inner class name */
            public static final class C10431a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f336246b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.beduin.v2.component.scrollable_containers.compose.HandleScrollToPositionInteractionKt$HandleScrollToPositionInteraction$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "HandleScrollToPositionInteraction.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.beduin.v2.component.scrollable_containers.compose.a$b$c$a$a, reason: collision with other inner class name */
                public static final class C10432a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f336247q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f336248r;

                    public C10432a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f336247q = obj;
                        this.f336248r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C10431a.this.emit(null, this);
                    }
                }

                public C10431a(InterfaceC43172j interfaceC43172j) {
                    this.f336246b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.beduin.v2.component.scrollable_containers.compose.a.b.c.C10431a.C10432a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.beduin.v2.component.scrollable_containers.compose.a$b$c$a$a r0 = (com.avito.beduin.v2.component.scrollable_containers.compose.a.b.c.C10431a.C10432a) r0
                        int r1 = r0.f336248r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f336248r = r1
                        goto L18
                    L13:
                        com.avito.beduin.v2.component.scrollable_containers.compose.a$b$c$a$a r0 = new com.avito.beduin.v2.component.scrollable_containers.compose.a$b$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f336247q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f336248r
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
                        boolean r6 = r5 instanceof com.avito.beduin.v2.interaction.scroll_to.api.ScrollToPositionInteraction
                        if (r6 == 0) goto L43
                        r0.f336248r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f336246b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.component.scrollable_containers.compose.a.b.c.C10431a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public c(C10428b c10428b) {
                this.f336245b = c10428b;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f336245b.collect(new C10431a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC43160i<? extends InterfaceC39628a> interfaceC43160i, com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar, Y41.a<G0> aVar, f fVar, boolean z12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f336230r = interfaceC43160i;
            this.f336231s = cVar;
            this.f336232t = aVar;
            this.f336233u = fVar;
            this.f336234v = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f336230r, this.f336231s, this.f336232t, this.f336233u, this.f336234v, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f336229q;
            if (i12 == 0) {
                C42729a0.b(obj);
                c cVar = new c(new C10428b(this.f336230r, this.f336231s));
                C10426a c10426a = new C10426a(this.f336232t, this.f336233u, this.f336234v);
                this.f336229q = 1;
                if (cVar.collect(c10426a, this) == coroutine_suspended) {
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

    /* compiled from: HandleScrollToPositionInteraction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f336250l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.engine.utils.c<AbstractC40338a> f336251m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ f f336252n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f336253o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f336254p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f336255q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12, com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar, f fVar, Y41.a<G0> aVar, int i12, int i13) {
            super(2);
            this.f336250l = z12;
            this.f336251m = cVar;
            this.f336252n = fVar;
            this.f336253o = aVar;
            this.f336254p = i12;
            this.f336255q = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f336254p | 1);
            com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar = this.f336251m;
            a.a(this.f336250l, cVar, this.f336252n, this.f336253o, a12, iA2, this.f336255q);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r14, @Y61.l com.avito.beduin.v2.engine.utils.c<fU0.AbstractC40338a> r15, @Y61.k com.avito.beduin.v2.component.scrollable_containers.compose.f r16, @Y61.l Y41.a<kotlin.G0> r17, @Y61.l androidx.compose.runtime.A r18, int r19, int r20) {
        /*
            r7 = r15
            r8 = r16
            r9 = r19
            r0 = 1879469037(0x70066bed, float:1.6640586E29)
            r1 = r18
            androidx.compose.runtime.B r10 = r1.E(r0)
            boolean r0 = r10.B(r15)
            if (r0 == 0) goto L17
            r0 = 32
            goto L19
        L17:
            r0 = 16
        L19:
            r0 = r0 | r9
            r1 = r9 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L2a
            boolean r1 = r10.B(r8)
            if (r1 == 0) goto L27
            r1 = 256(0x100, float:3.59E-43)
            goto L29
        L27:
            r1 = 128(0x80, float:1.8E-43)
        L29:
            r0 = r0 | r1
        L2a:
            r1 = r20 & 8
            if (r1 == 0) goto L33
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L30:
            r2 = r17
            goto L45
        L33:
            r2 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L30
            r2 = r17
            boolean r3 = r10.u(r2)
            if (r3 == 0) goto L42
            r3 = 2048(0x800, float:2.87E-42)
            goto L44
        L42:
            r3 = 1024(0x400, float:1.435E-42)
        L44:
            r0 = r0 | r3
        L45:
            r0 = r0 & 5851(0x16db, float:8.199E-42)
            r3 = 1170(0x492, float:1.64E-42)
            if (r0 != r3) goto L57
            boolean r0 = r10.c()
            if (r0 != 0) goto L52
            goto L57
        L52:
            r10.f()
            r4 = r2
            goto La3
        L57:
            if (r1 == 0) goto L5d
            com.avito.beduin.v2.component.scrollable_containers.compose.a$a r0 = com.avito.beduin.v2.component.scrollable_containers.compose.a.C10425a.f336228l
            r11 = r0
            goto L5e
        L5d:
            r11 = r2
        L5e:
            androidx.compose.runtime.J3 r0 = com.avito.beduin.v2.render.compose.C36345b.f338050a
            java.lang.Object r0 = r10.o(r0)
            com.avito.beduin.v2.render.compose.G r0 = (com.avito.beduin.v2.render.compose.G) r0
            r1 = 2051557006(0x7a48468e, float:2.599726E35)
            r10.C(r1)
            boolean r1 = r10.B(r0)
            java.lang.Object r2 = r10.t()
            if (r1 != 0) goto L7f
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L84
        L7f:
            kotlinx.coroutines.flow.i<dU0.a> r2 = r0.f338043f
            r10.H(r2)
        L84:
            r1 = r2
            kotlinx.coroutines.flow.i r1 = (kotlinx.coroutines.flow.InterfaceC43160i) r1
            r0 = 0
            r10.X(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            java.lang.Object[] r12 = new java.lang.Object[]{r1, r15, r0, r8}
            com.avito.beduin.v2.component.scrollable_containers.compose.a$b r13 = new com.avito.beduin.v2.component.scrollable_containers.compose.a$b
            r6 = 0
            r0 = r13
            r2 = r15
            r3 = r11
            r4 = r16
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.compose.runtime.C22187u0.g(r12, r13, r10)
            r4 = r11
        La3:
            androidx.compose.runtime.c2 r10 = r10.Z()
            if (r10 == 0) goto Lb9
            com.avito.beduin.v2.component.scrollable_containers.compose.a$c r11 = new com.avito.beduin.v2.component.scrollable_containers.compose.a$c
            r0 = r11
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.f38184d = r11
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.component.scrollable_containers.compose.a.a(boolean, com.avito.beduin.v2.engine.utils.c, com.avito.beduin.v2.component.scrollable_containers.compose.f, Y41.a, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.beduin.v2.component.scrollable_containers.compose.f r11, boolean r12, boolean r13, int r14, kotlin.coroutines.Continuation r15) {
        /*
            boolean r0 = r15 instanceof com.avito.beduin.v2.component.scrollable_containers.compose.b
            if (r0 == 0) goto L13
            r0 = r15
            com.avito.beduin.v2.component.scrollable_containers.compose.b r0 = (com.avito.beduin.v2.component.scrollable_containers.compose.b) r0
            int r1 = r0.f336261v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f336261v = r1
            goto L18
        L13:
            com.avito.beduin.v2.component.scrollable_containers.compose.b r0 = new com.avito.beduin.v2.component.scrollable_containers.compose.b
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f336260u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f336261v
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2c
            goto L34
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            kotlin.C42729a0.b(r15)
            goto Lac
        L39:
            int r14 = r0.f336259t
            boolean r13 = r0.f336258s
            boolean r12 = r0.f336257r
            com.avito.beduin.v2.component.scrollable_containers.compose.f r11 = r0.f336256q
            kotlin.C42729a0.b(r15)
            goto L59
        L45:
            kotlin.C42729a0.b(r15)
            r0.f336256q = r11
            r0.f336257r = r12
            r0.f336258s = r13
            r0.f336259t = r14
            r0.f336261v = r4
            java.lang.Object r15 = d(r11, r14, r13, r0)
            if (r15 != r1) goto L59
            goto Lae
        L59:
            com.avito.beduin.v2.component.scrollable_containers.compose.h r15 = r11.e()
            java.util.List<com.avito.beduin.v2.component.scrollable_containers.compose.h$a> r2 = r15.f336275a
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L65:
            boolean r4 = r2.hasNext()
            r6 = 0
            if (r4 == 0) goto L78
            java.lang.Object r4 = r2.next()
            r7 = r4
            com.avito.beduin.v2.component.scrollable_containers.compose.h$a r7 = (com.avito.beduin.v2.component.scrollable_containers.compose.h.a) r7
            int r7 = r7.f336278a
            if (r7 != r14) goto L65
            goto L79
        L78:
            r4 = r6
        L79:
            com.avito.beduin.v2.component.scrollable_containers.compose.h$a r4 = (com.avito.beduin.v2.component.scrollable_containers.compose.h.a) r4
            if (r4 == 0) goto Lac
            long r7 = r15.f336276b
            if (r13 == 0) goto L89
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
        L87:
            int r13 = (int) r7
            goto L8d
        L89:
            r13 = 32
            long r7 = r7 >> r13
            goto L87
        L8d:
            int r13 = r13 / r5
            int r15 = r4.f336279b
            int r15 = r15 / r5
            int r13 = r13 - r15
            if (r12 == 0) goto La0
            int r12 = -r13
            r0.f336256q = r6
            r0.f336261v = r5
            java.lang.Object r11 = r11.f(r14, r12, r0)
            if (r11 != r1) goto Lac
            goto Lae
        La0:
            int r12 = -r13
            r0.f336256q = r6
            r0.f336261v = r3
            java.lang.Object r11 = r11.d(r14, r12, r0)
            if (r11 != r1) goto Lac
            goto Lae
        Lac:
            kotlin.G0 r1 = kotlin.G0.f406611a
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.component.scrollable_containers.compose.a.b(com.avito.beduin.v2.component.scrollable_containers.compose.f, boolean, boolean, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.beduin.v2.component.scrollable_containers.compose.f r11, boolean r12, boolean r13, int r14, kotlin.coroutines.Continuation r15) {
        /*
            boolean r0 = r15 instanceof com.avito.beduin.v2.component.scrollable_containers.compose.c
            if (r0 == 0) goto L13
            r0 = r15
            com.avito.beduin.v2.component.scrollable_containers.compose.c r0 = (com.avito.beduin.v2.component.scrollable_containers.compose.c) r0
            int r1 = r0.f336267v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f336267v = r1
            goto L18
        L13:
            com.avito.beduin.v2.component.scrollable_containers.compose.c r0 = new com.avito.beduin.v2.component.scrollable_containers.compose.c
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f336266u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f336267v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L39
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            goto L34
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            kotlin.C42729a0.b(r15)
            goto Laa
        L39:
            int r14 = r0.f336265t
            boolean r13 = r0.f336264s
            boolean r12 = r0.f336263r
            com.avito.beduin.v2.component.scrollable_containers.compose.f r11 = r0.f336262q
            kotlin.C42729a0.b(r15)
            goto L59
        L45:
            kotlin.C42729a0.b(r15)
            r0.f336262q = r11
            r0.f336263r = r12
            r0.f336264s = r13
            r0.f336265t = r14
            r0.f336267v = r5
            java.lang.Object r15 = d(r11, r14, r13, r0)
            if (r15 != r1) goto L59
            goto Lac
        L59:
            com.avito.beduin.v2.component.scrollable_containers.compose.h r15 = r11.e()
            java.util.List<com.avito.beduin.v2.component.scrollable_containers.compose.h$a> r2 = r15.f336275a
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L65:
            boolean r5 = r2.hasNext()
            r6 = 0
            if (r5 == 0) goto L78
            java.lang.Object r5 = r2.next()
            r7 = r5
            com.avito.beduin.v2.component.scrollable_containers.compose.h$a r7 = (com.avito.beduin.v2.component.scrollable_containers.compose.h.a) r7
            int r7 = r7.f336278a
            if (r7 != r14) goto L65
            goto L79
        L78:
            r5 = r6
        L79:
            com.avito.beduin.v2.component.scrollable_containers.compose.h$a r5 = (com.avito.beduin.v2.component.scrollable_containers.compose.h.a) r5
            if (r5 == 0) goto Laa
            long r7 = r15.f336276b
            if (r13 == 0) goto L89
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
        L87:
            int r13 = (int) r7
            goto L8d
        L89:
            r13 = 32
            long r7 = r7 >> r13
            goto L87
        L8d:
            int r15 = r5.f336279b
            int r13 = r13 - r15
            if (r12 == 0) goto L9e
            int r12 = -r13
            r0.f336262q = r6
            r0.f336267v = r4
            java.lang.Object r11 = r11.f(r14, r12, r0)
            if (r11 != r1) goto Laa
            goto Lac
        L9e:
            int r12 = -r13
            r0.f336262q = r6
            r0.f336267v = r3
            java.lang.Object r11 = r11.d(r14, r12, r0)
            if (r11 != r1) goto Laa
            goto Lac
        Laa:
            kotlin.G0 r1 = kotlin.G0.f406611a
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.component.scrollable_containers.compose.a.c(com.avito.beduin.v2.component.scrollable_containers.compose.f, boolean, boolean, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object d(f fVar, int i12, boolean z12, ContinuationImpl continuationImpl) {
        List<h.a> list = fVar.e().f336275a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((h.a) it.next()).f336278a == i12) {
                    return G0.f406611a;
                }
            }
        }
        if (fVar.c() > i12) {
            Object objA = fVar.a(i12, continuationImpl);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
        }
        Object objD = fVar.d(i12, (-((int) (z12 ? fVar.e().f336276b & 4294967295L : fVar.e().f336276b >> 32))) + 1, continuationImpl);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : G0.f406611a;
    }
}
