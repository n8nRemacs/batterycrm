package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AbstractC20431a0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.channels.C43108m;
import s0.C47949a;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class J0 implements PointerInputEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I0 f27281b;

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {512}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27282q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27283r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ I0 f27284s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.K f27285t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.q<androidx.compose.ui.input.pointer.C, androidx.compose.ui.input.pointer.C, l0.g, kotlin.G0> f27286u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Y41.l<androidx.compose.ui.input.pointer.C, kotlin.G0> f27287v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f27288w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Boolean> f27289x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.ui.input.pointer.C, l0.g, kotlin.G0> f27290y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(I0 i02, androidx.compose.ui.input.pointer.K k12, Y41.q<? super androidx.compose.ui.input.pointer.C, ? super androidx.compose.ui.input.pointer.C, ? super l0.g, kotlin.G0> qVar, Y41.l<? super androidx.compose.ui.input.pointer.C, kotlin.G0> lVar, Y41.a<kotlin.G0> aVar, Y41.a<Boolean> aVar2, Y41.p<? super androidx.compose.ui.input.pointer.C, ? super l0.g, kotlin.G0> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f27284s = i02;
            this.f27285t = k12;
            this.f27286u = qVar;
            this.f27287v = lVar;
            this.f27288w = aVar;
            this.f27289x = aVar2;
            this.f27290y = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f27284s, this.f27285t, this.f27286u, this.f27287v, this.f27288w, this.f27289x, this.f27290y, continuation);
            aVar.f27283r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r14.f27282q
                androidx.compose.foundation.gestures.I0 r2 = r14.f27284s
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 != r3) goto L17
                java.lang.Object r0 = r14.f27283r
                kotlinx.coroutines.T r0 = (kotlinx.coroutines.T) r0
                kotlin.C42729a0.b(r15)     // Catch: java.util.concurrent.CancellationException -> L15
                goto L6f
            L15:
                r15 = move-exception
                goto L5c
            L17:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1f:
                kotlin.C42729a0.b(r15)
                java.lang.Object r15 = r14.f27283r
                kotlinx.coroutines.T r15 = (kotlinx.coroutines.T) r15
                androidx.compose.foundation.gestures.Orientation r7 = r2.f27268r     // Catch: java.util.concurrent.CancellationException -> L5a
                androidx.compose.ui.input.pointer.K r1 = r14.f27285t     // Catch: java.util.concurrent.CancellationException -> L5a
                Y41.q<androidx.compose.ui.input.pointer.C, androidx.compose.ui.input.pointer.C, l0.g, kotlin.G0> r8 = r14.f27286u     // Catch: java.util.concurrent.CancellationException -> L5a
                Y41.l<androidx.compose.ui.input.pointer.C, kotlin.G0> r11 = r14.f27287v     // Catch: java.util.concurrent.CancellationException -> L5a
                Y41.a<kotlin.G0> r10 = r14.f27288w     // Catch: java.util.concurrent.CancellationException -> L5a
                Y41.a<java.lang.Boolean> r5 = r14.f27289x     // Catch: java.util.concurrent.CancellationException -> L5a
                Y41.p<androidx.compose.ui.input.pointer.C, l0.g, kotlin.G0> r9 = r14.f27290y     // Catch: java.util.concurrent.CancellationException -> L5a
                r14.f27283r = r15     // Catch: java.util.concurrent.CancellationException -> L5a
                r14.f27282q = r3     // Catch: java.util.concurrent.CancellationException -> L5a
                float r3 = androidx.compose.foundation.gestures.C20495q0.f27918a     // Catch: java.util.concurrent.CancellationException -> L5a
                kotlin.jvm.internal.l0$g r6 = new kotlin.jvm.internal.l0$g     // Catch: java.util.concurrent.CancellationException -> L5a
                r6.<init>()     // Catch: java.util.concurrent.CancellationException -> L5a
                androidx.compose.foundation.gestures.r0 r3 = new androidx.compose.foundation.gestures.r0     // Catch: java.util.concurrent.CancellationException -> L5a
                r12 = 0
                r4 = r3
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.util.concurrent.CancellationException -> L5a
                java.lang.Object r1 = androidx.compose.foundation.gestures.C20444d1.c(r1, r3, r14)     // Catch: java.util.concurrent.CancellationException -> L5a
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.util.concurrent.CancellationException -> L5a
                if (r1 != r3) goto L51
                goto L53
            L51:
                kotlin.G0 r1 = kotlin.G0.f406611a     // Catch: java.util.concurrent.CancellationException -> L5a
            L53:
                if (r1 != r0) goto L6f
                return r0
            L56:
                r13 = r0
                r0 = r15
                r15 = r13
                goto L5c
            L5a:
                r0 = move-exception
                goto L56
            L5c:
                kotlinx.coroutines.channels.m r1 = r2.f27272v
                if (r1 == 0) goto L69
                androidx.compose.foundation.gestures.a0$a r2 = androidx.compose.foundation.gestures.AbstractC20431a0.a.f27544a
                java.lang.Object r1 = r1.w(r2)
                kotlinx.coroutines.channels.B.a(r1)
            L69:
                boolean r0 = kotlinx.coroutines.U.e(r0)
                if (r0 == 0) goto L72
            L6f:
                kotlin.G0 r15 = kotlin.G0.f406611a
                return r15
            L72:
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.J0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "change", "Ll0/g;", "delta", "Lkotlin/G0;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/C;J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.input.pointer.C, l0.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.util.a f27291l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ I0 f27292m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(I0 i02, androidx.compose.ui.input.pointer.util.a aVar) {
            super(2);
            this.f27291l = aVar;
            this.f27292m = i02;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.ui.input.pointer.C c12, l0.g gVar) {
            long j12 = gVar.f413387a;
            r0.d.a(this.f27291l, c12);
            C43108m c43108m = this.f27292m.f27272v;
            if (c43108m != null) {
                kotlinx.coroutines.channels.B.a(c43108m.w(new AbstractC20431a0.b(j12, null)));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0 f27293l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(I0 i02) {
            super(0);
            this.f27293l = i02;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C43108m c43108m = this.f27293l.f27272v;
            if (c43108m != null) {
                kotlinx.coroutines.channels.B.a(c43108m.w(AbstractC20431a0.a.f27544a));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "upEvent", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.pointer.C, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.util.a f27294l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.K f27295m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ I0 f27296n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.ui.input.pointer.util.a aVar, androidx.compose.ui.input.pointer.K k12, I0 i02) {
            super(1);
            this.f27294l = aVar;
            this.f27295m = k12;
            this.f27296n = i02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.input.pointer.C c12) {
            androidx.compose.ui.input.pointer.util.a aVar = this.f27294l;
            r0.d.a(aVar, c12);
            float fG2 = this.f27295m.getViewConfiguration().g();
            long jA2 = androidx.compose.ui.unit.C.a(fG2, fG2);
            if (androidx.compose.ui.unit.B.c(jA2) <= 0.0f || androidx.compose.ui.unit.B.d(jA2) <= 0.0f) {
                C47949a.b("maximumVelocity should be a positive value. You specified=" + ((Object) androidx.compose.ui.unit.B.h(jA2)));
            }
            float fC2 = androidx.compose.ui.unit.B.c(jA2);
            VelocityTracker1D velocityTracker1D = aVar.f40303a;
            float fB2 = velocityTracker1D.b(fC2);
            float fD2 = androidx.compose.ui.unit.B.d(jA2);
            VelocityTracker1D velocityTracker1D2 = aVar.f40304b;
            long jA3 = androidx.compose.ui.unit.C.a(fB2, velocityTracker1D2.b(fD2));
            C42756l.y(null, velocityTracker1D.f40294d);
            velocityTracker1D.f40295e = 0;
            C42756l.y(null, velocityTracker1D2.f40294d);
            velocityTracker1D2.f40295e = 0;
            aVar.f40305c = 0L;
            C43108m c43108m = this.f27296n.f27272v;
            if (c43108m != null) {
                Y41.q<kotlinx.coroutines.T, l0.g, Continuation<? super kotlin.G0>, Object> qVar = V0.f27505a;
                kotlinx.coroutines.channels.B.a(c43108m.w(new AbstractC20431a0.d(androidx.compose.ui.unit.C.a(Float.isNaN(androidx.compose.ui.unit.B.c(jA3)) ? 0.0f : androidx.compose.ui.unit.B.c(jA3), Float.isNaN(androidx.compose.ui.unit.B.d(jA3)) ? 0.0f : androidx.compose.ui.unit.B.d(jA3)), null)));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "down", "slopTriggerChange", "Ll0/g;", "postSlopOffset", "Lkotlin/G0;", "invoke-0AR0LA0", "(Landroidx/compose/ui/input/pointer/C;Landroidx/compose/ui/input/pointer/C;J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.ui.input.pointer.C, androidx.compose.ui.input.pointer.C, l0.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0 f27297l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.util.a f27298m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(I0 i02, androidx.compose.ui.input.pointer.util.a aVar) {
            super(3);
            this.f27297l = i02;
            this.f27298m = aVar;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.ui.input.pointer.C c12, androidx.compose.ui.input.pointer.C c13, l0.g gVar) {
            androidx.compose.ui.input.pointer.C c14 = c12;
            androidx.compose.ui.input.pointer.C c15 = c13;
            long j12 = gVar.f413387a;
            I0 i02 = this.f27297l;
            if (i02.f27269s.invoke(c14).booleanValue()) {
                if (!i02.f27274x) {
                    if (i02.f27272v == null) {
                        i02.f27272v = kotlinx.coroutines.channels.A.a(Integer.MAX_VALUE, null, null, 6);
                    }
                    i02.f27274x = true;
                    C43259k.d(i02.Y1(), null, null, new N0(i02, null), 3);
                }
                r0.d.a(this.f27298m, c14);
                long jI2 = l0.g.i(c15.f40118c, j12);
                C43108m c43108m = i02.f27272v;
                if (c43108m != null) {
                    kotlinx.coroutines.channels.B.a(c43108m.w(new AbstractC20431a0.c(jI2, null)));
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0 f27299l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(I0 i02) {
            super(0);
            this.f27299l = i02;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(!this.f27299l.getF27509B());
        }
    }

    public J0(I0 i02) {
        this.f27281b = i02;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        androidx.compose.ui.input.pointer.util.a aVar = new androidx.compose.ui.input.pointer.util.a();
        I0 i02 = this.f27281b;
        Object objC = kotlinx.coroutines.U.c(new a(this.f27281b, k12, new e(i02, aVar), new d(aVar, k12, i02), new c(i02), new f(i02), new b(i02, aVar), null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }
}
