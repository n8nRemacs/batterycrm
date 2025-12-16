package androidx.compose.material3;

import androidx.compose.foundation.gestures.C20444d1;
import androidx.compose.foundation.interaction.a;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.input.pointer.C22341t;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/K;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {1496}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class Nf extends SuspendLambda implements Y41.p<androidx.compose.ui.input.pointer.K, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f35181q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f35182r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C21589gd f35183s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f35184t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f35185u;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {1497}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f35186q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f35187r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.K f35188s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C21589gd f35189t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C21543ed f35190u;

        /* compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1498, 1509, 1528}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "event", "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
        /* renamed from: androidx.compose.material3.Nf$a$a, reason: collision with other inner class name */
        public static final class C1639a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public Object f35191q;

            /* renamed from: r, reason: collision with root package name */
            public a.b f35192r;

            /* renamed from: s, reason: collision with root package name */
            public l0.e f35193s;

            /* renamed from: t, reason: collision with root package name */
            public l0.a f35194t;

            /* renamed from: u, reason: collision with root package name */
            public int f35195u;

            /* renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f35196v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ C21589gd f35197w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ C21543ed f35198x;

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f35199y;

            /* compiled from: Slider.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {1545}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.Nf$a$a$a, reason: collision with other inner class name */
            public static final class C1640a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f35200q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ C21543ed f35201r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ l0.a f35202s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.foundation.interaction.a f35203t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1640a(C21543ed c21543ed, l0.a aVar, androidx.compose.foundation.interaction.a aVar2, Continuation<? super C1640a> continuation) {
                    super(2, continuation);
                    this.f35201r = c21543ed;
                    this.f35202s = aVar;
                    this.f35203t = aVar2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C1640a(this.f35201r, this.f35202s, this.f35203t, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((C1640a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f35200q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        boolean z12 = this.f35202s.f406838b;
                        C21543ed c21543ed = this.f35201r;
                        androidx.compose.foundation.interaction.m mVar = z12 ? c21543ed.f36293b : c21543ed.f36294c;
                        this.f35200q = 1;
                        if (mVar.b(this.f35203t, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return kotlin.G0.f406611a;
                }
            }

            /* compiled from: Slider.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/C;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.Nf$a$a$b */
            public static final class b extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.pointer.C, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ C21589gd f35204l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ l0.a f35205m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(C21589gd c21589gd, l0.a aVar) {
                    super(1);
                    this.f35204l = c21589gd;
                    this.f35205m = aVar;
                }

                @Override // Y41.l
                public final kotlin.G0 invoke(androidx.compose.ui.input.pointer.C c12) {
                    float fG2 = l0.g.g(C22341t.f(c12, false));
                    boolean z12 = this.f35205m.f406838b;
                    C21589gd c21589gd = this.f35204l;
                    if (((Boolean) ((C22082i3) c21589gd.f36439l).getF42167b()).booleanValue()) {
                        fG2 = -fG2;
                    }
                    c21589gd.g(fG2, z12);
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1639a(C21589gd c21589gd, C21543ed c21543ed, kotlinx.coroutines.T t12, Continuation<? super C1639a> continuation) {
                super(2, continuation);
                this.f35197w = c21589gd;
                this.f35198x = c21543ed;
                this.f35199y = t12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C1639a c1639a = new C1639a(this.f35197w, this.f35198x, this.f35199y, continuation);
                c1639a.f35196v = obj;
                return c1639a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
                return ((C1639a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0187  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x018f  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0198  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x01cb A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:64:0x01d4 A[Catch: CancellationException -> 0x01da, TryCatch #0 {CancellationException -> 0x01da, blocks: (B:62:0x01cc, B:64:0x01d4, B:66:0x01dd, B:59:0x01ae), top: B:72:0x01ae }] */
            /* JADX WARN: Removed duplicated region for block: B:66:0x01dd A[Catch: CancellationException -> 0x01da, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x01da, blocks: (B:62:0x01cc, B:64:0x01d4, B:66:0x01dd, B:59:0x01ae), top: B:72:0x01ae }] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
                /*
                    Method dump skipped, instructions count: 516
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Nf.a.C1639a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.input.pointer.K k12, C21589gd c21589gd, C21543ed c21543ed, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35188s = k12;
            this.f35189t = c21589gd;
            this.f35190u = c21543ed;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f35188s, this.f35189t, this.f35190u, continuation);
            aVar.f35187r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f35186q;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f35187r;
                C1639a c1639a = new C1639a(this.f35189t, this.f35190u, t12, null);
                this.f35186q = 1;
                if (C20444d1.c(this.f35188s, c1639a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nf(C21589gd c21589gd, androidx.compose.foundation.interaction.m mVar, androidx.compose.foundation.interaction.m mVar2, Continuation<? super Nf> continuation) {
        super(2, continuation);
        this.f35183s = c21589gd;
        this.f35184t = mVar;
        this.f35185u = mVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        Nf nf2 = new Nf(this.f35183s, this.f35184t, this.f35185u, continuation);
        nf2.f35182r = obj;
        return nf2;
    }

    @Override // Y41.p
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        return ((Nf) create(k12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f35181q;
        if (i12 == 0) {
            C42729a0.b(obj);
            androidx.compose.ui.input.pointer.K k12 = (androidx.compose.ui.input.pointer.K) this.f35182r;
            C21589gd c21589gd = this.f35183s;
            a aVar = new a(k12, c21589gd, new C21543ed(c21589gd, this.f35184t, this.f35185u), null);
            this.f35181q = 1;
            if (kotlinx.coroutines.U.c(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
