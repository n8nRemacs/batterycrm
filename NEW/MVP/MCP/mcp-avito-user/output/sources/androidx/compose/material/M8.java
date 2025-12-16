package androidx.compose.material;

import androidx.compose.foundation.gestures.C20444d1;
import androidx.compose.foundation.interaction.a;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22204y1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/K;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {1082}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class M8 extends SuspendLambda implements Y41.p<androidx.compose.ui.input.pointer.K, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f32911q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f32912r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f32913s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f32914t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f32915u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f32916v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f32917w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f32918x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f32919y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f32920z;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {1083}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f32921q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f32922r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.K f32923s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f32924t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ float f32925u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ C21406x7 f32926v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22192v1 f32927w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f32928x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22192v1 f32929y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f32930z;

        /* compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1084, 1095, 1117}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "event", "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
        /* renamed from: androidx.compose.material.M8$a$a, reason: collision with other inner class name */
        public static final class C1632a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: A, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f32931A;

            /* renamed from: B, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f32932B;

            /* renamed from: C, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22192v1 f32933C;

            /* renamed from: D, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f32934D;

            /* renamed from: q, reason: collision with root package name */
            public Object f32935q;

            /* renamed from: r, reason: collision with root package name */
            public a.b f32936r;

            /* renamed from: s, reason: collision with root package name */
            public l0.e f32937s;

            /* renamed from: t, reason: collision with root package name */
            public l0.a f32938t;

            /* renamed from: u, reason: collision with root package name */
            public int f32939u;

            /* renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f32940v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ boolean f32941w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ float f32942x;

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ C21406x7 f32943y;

            /* renamed from: z, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22192v1 f32944z;

            /* compiled from: Slider.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {1135}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material.M8$a$a$a, reason: collision with other inner class name */
            public static final class C1633a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f32945q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ C21406x7 f32946r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ l0.a f32947s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.foundation.interaction.a f32948t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1633a(C21406x7 c21406x7, l0.a aVar, androidx.compose.foundation.interaction.a aVar2, Continuation<? super C1633a> continuation) {
                    super(2, continuation);
                    this.f32946r = c21406x7;
                    this.f32947s = aVar;
                    this.f32948t = aVar2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new C1633a(this.f32946r, this.f32947s, this.f32948t, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((C1633a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f32945q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        boolean z12 = this.f32947s.f406838b;
                        C21406x7 c21406x7 = this.f32946r;
                        androidx.compose.foundation.interaction.m mVar = z12 ? c21406x7.f34391a : c21406x7.f34392b;
                        this.f32945q = 1;
                        if (mVar.b(this.f32948t, this) == coroutine_suspended) {
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
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: androidx.compose.material.M8$a$a$b */
            public static final class b extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.pointer.C, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ InterfaceC22204y1 f32949l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ l0.a f32950m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ boolean f32951n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(InterfaceC22204y1 interfaceC22204y1, l0.a aVar, boolean z12) {
                    super(1);
                    this.f32949l = interfaceC22204y1;
                    this.f32950m = aVar;
                    this.f32951n = z12;
                }

                @Override // Y41.l
                public final kotlin.G0 invoke(androidx.compose.ui.input.pointer.C c12) {
                    float fG2 = l0.g.g(C22341t.f(c12, false));
                    Y41.p pVar = (Y41.p) this.f32949l.getF42167b();
                    Boolean boolValueOf = Boolean.valueOf(this.f32950m.f406838b);
                    if (this.f32951n) {
                        fG2 = -fG2;
                    }
                    pVar.invoke(boolValueOf, Float.valueOf(fG2));
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1632a(boolean z12, float f12, C21406x7 c21406x7, InterfaceC22192v1 interfaceC22192v1, kotlinx.coroutines.T t12, InterfaceC22204y1 interfaceC22204y1, InterfaceC22192v1 interfaceC22192v12, InterfaceC22204y1 interfaceC22204y12, Continuation continuation) {
                super(2, continuation);
                this.f32941w = z12;
                this.f32942x = f12;
                this.f32943y = c21406x7;
                this.f32944z = interfaceC22192v1;
                this.f32931A = t12;
                this.f32932B = interfaceC22204y1;
                this.f32933C = interfaceC22192v12;
                this.f32934D = interfaceC22204y12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                InterfaceC22204y1 interfaceC22204y1 = this.f32934D;
                C1632a c1632a = new C1632a(this.f32941w, this.f32942x, this.f32943y, this.f32944z, this.f32931A, this.f32932B, this.f32933C, interfaceC22204y1, continuation);
                c1632a.f32940v = obj;
                return c1632a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
                return ((C1632a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x016f  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0183  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x018e  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x01c4 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x01cd A[Catch: CancellationException -> 0x01d3, TryCatch #1 {CancellationException -> 0x01d3, blocks: (B:63:0x01c5, B:65:0x01cd, B:67:0x01d6, B:60:0x01a5), top: B:75:0x01a5 }] */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01d6 A[Catch: CancellationException -> 0x01d3, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x01d3, blocks: (B:63:0x01c5, B:65:0x01cd, B:67:0x01d6, B:60:0x01a5), top: B:75:0x01a5 }] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 513
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.M8.a.C1632a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.input.pointer.K k12, boolean z12, float f12, C21406x7 c21406x7, InterfaceC22192v1 interfaceC22192v1, InterfaceC22204y1 interfaceC22204y1, InterfaceC22192v1 interfaceC22192v12, InterfaceC22204y1 interfaceC22204y12, Continuation continuation) {
            super(2, continuation);
            this.f32923s = k12;
            this.f32924t = z12;
            this.f32925u = f12;
            this.f32926v = c21406x7;
            this.f32927w = interfaceC22192v1;
            this.f32928x = interfaceC22204y1;
            this.f32929y = interfaceC22192v12;
            this.f32930z = interfaceC22204y12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            InterfaceC22204y1 interfaceC22204y1 = this.f32930z;
            a aVar = new a(this.f32923s, this.f32924t, this.f32925u, this.f32926v, this.f32927w, this.f32928x, this.f32929y, interfaceC22204y1, continuation);
            aVar.f32922r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f32921q;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f32922r;
                InterfaceC22204y1 interfaceC22204y1 = this.f32930z;
                C1632a c1632a = new C1632a(this.f32924t, this.f32925u, this.f32926v, this.f32927w, t12, this.f32928x, this.f32929y, interfaceC22204y1, null);
                this.f32921q = 1;
                if (C20444d1.c(this.f32923s, c1632a, this) == coroutine_suspended) {
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
    public M8(androidx.compose.foundation.interaction.m mVar, androidx.compose.foundation.interaction.m mVar2, InterfaceC22192v1 interfaceC22192v1, InterfaceC22192v1 interfaceC22192v12, InterfaceC22204y1 interfaceC22204y1, boolean z12, float f12, InterfaceC22204y1 interfaceC22204y12, Continuation continuation) {
        super(2, continuation);
        this.f32913s = mVar;
        this.f32914t = mVar2;
        this.f32915u = interfaceC22192v1;
        this.f32916v = interfaceC22192v12;
        this.f32917w = interfaceC22204y1;
        this.f32918x = z12;
        this.f32919y = f12;
        this.f32920z = interfaceC22204y12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        InterfaceC22204y1 interfaceC22204y1 = this.f32920z;
        M8 m82 = new M8(this.f32913s, this.f32914t, this.f32915u, this.f32916v, this.f32917w, this.f32918x, this.f32919y, interfaceC22204y1, continuation);
        m82.f32912r = obj;
        return m82;
    }

    @Override // Y41.p
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        return ((M8) create(k12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f32911q;
        if (i12 == 0) {
            C42729a0.b(obj);
            androidx.compose.ui.input.pointer.K k12 = (androidx.compose.ui.input.pointer.K) this.f32912r;
            InterfaceC22204y1 interfaceC22204y1 = this.f32917w;
            androidx.compose.foundation.interaction.m mVar = this.f32913s;
            androidx.compose.foundation.interaction.m mVar2 = this.f32914t;
            InterfaceC22192v1 interfaceC22192v1 = this.f32915u;
            InterfaceC22192v1 interfaceC22192v12 = this.f32916v;
            a aVar = new a(k12, this.f32918x, this.f32919y, new C21406x7(mVar, mVar2, interfaceC22192v1, interfaceC22192v12, interfaceC22204y1), interfaceC22192v1, this.f32920z, interfaceC22192v12, interfaceC22204y1, null);
            this.f32911q = 1;
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
