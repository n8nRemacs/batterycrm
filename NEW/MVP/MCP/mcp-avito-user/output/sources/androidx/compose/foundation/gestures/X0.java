package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.AbstractC20431a0;
import androidx.compose.foundation.gestures.N0;
import androidx.compose.foundation.gestures.V0;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: Draggable.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/X0;", "Landroidx/compose/foundation/gestures/I0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X0 extends I0 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public Orientation f27508A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f27509B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public Y41.q<? super kotlinx.coroutines.T, ? super l0.g, ? super Continuation<? super kotlin.G0>, ? extends Object> f27510C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public Y41.q<? super kotlinx.coroutines.T, ? super Float, ? super Continuation<? super kotlin.G0>, ? extends Object> f27511D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f27512E;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public Y0 f27513z;

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/O0;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/O0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", i = {}, l = {300}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<O0, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27514q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27515r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.p<Y41.l<? super AbstractC20431a0.b, kotlin.G0>, Continuation<? super kotlin.G0>, Object> f27516s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ X0 f27517t;

        /* compiled from: Draggable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/a0$b;", "dragDelta", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/gestures/a0$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.gestures.X0$a$a, reason: collision with other inner class name */
        public static final class C1575a extends kotlin.jvm.internal.N implements Y41.l<AbstractC20431a0.b, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ O0 f27518l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ X0 f27519m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1575a(O0 o02, X0 x02) {
                super(1);
                this.f27518l = o02;
                this.f27519m = x02;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(AbstractC20431a0.b bVar) {
                long j12 = bVar.f27545a;
                X0 x02 = this.f27519m;
                long jK2 = l0.g.k(j12, x02.f27512E ? -1.0f : 1.0f);
                Orientation orientation = x02.f27508A;
                Y41.q<kotlinx.coroutines.T, l0.g, Continuation<? super kotlin.G0>, Object> qVar = V0.f27505a;
                this.f27518l.a(Float.intBitsToFloat((int) (orientation == Orientation.f27425b ? jK2 & 4294967295L : jK2 >> 32)));
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.p<? super Y41.l<? super AbstractC20431a0.b, kotlin.G0>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, X0 x02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f27516s = pVar;
            this.f27517t = x02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f27516s, this.f27517t, continuation);
            aVar.f27515r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(O0 o02, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(o02, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27514q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C1575a c1575a = new C1575a((O0) this.f27515r, this.f27517t);
                this.f27514q = 1;
                if (((N0.a) this.f27516s).invoke(c1575a, this) == coroutine_suspended) {
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

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", i = {}, l = {309}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27520q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27521r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f27523t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f27523t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            b bVar = X0.this.new b(this.f27523t, continuation);
            bVar.f27521r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27520q;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f27521r;
                Y41.q<? super kotlinx.coroutines.T, ? super l0.g, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar = X0.this.f27510C;
                l0.g gVarA = l0.g.a(this.f27523t);
                this.f27520q = 1;
                if (((V0.a) qVar).invoke(t12, gVarA, this) == coroutine_suspended) {
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

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", i = {}, l = {316}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27524q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27525r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f27527t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f27527t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            c cVar = X0.this.new c(this.f27527t, continuation);
            cVar.f27525r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27524q;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f27525r;
                X0 x02 = X0.this;
                Y41.q<? super kotlinx.coroutines.T, ? super Float, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar = x02.f27511D;
                long jG2 = androidx.compose.ui.unit.B.g(this.f27527t, x02.f27512E ? -1.0f : 1.0f);
                Orientation orientation = x02.f27508A;
                Y41.q<kotlinx.coroutines.T, l0.g, Continuation<? super kotlin.G0>, Object> qVar2 = V0.f27505a;
                Float fBoxFloat = Boxing.boxFloat(orientation == Orientation.f27425b ? androidx.compose.ui.unit.B.d(jG2) : androidx.compose.ui.unit.B.c(jG2));
                this.f27524q = 1;
                if (qVar.invoke(t12, fBoxFloat, this) == coroutine_suspended) {
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

    public X0() {
        throw null;
    }

    @Override // androidx.compose.foundation.gestures.I0
    @Y61.l
    public final Object r2(@Y61.k Y41.p<? super Y41.l<? super AbstractC20431a0.b, kotlin.G0>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objA = this.f27513z.a(MutatePriority.f26798c, new a(pVar, this, null), continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.G0.f406611a;
    }

    @Override // androidx.compose.foundation.gestures.I0
    public final void s2(long j12) {
        if (!this.f42893o || kotlin.jvm.internal.L.f(this.f27510C, V0.f27505a)) {
            return;
        }
        C43259k.d(Y1(), null, CoroutineStart.f410683e, new b(j12, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.I0
    public final void t2(long j12) {
        if (!this.f42893o || kotlin.jvm.internal.L.f(this.f27511D, V0.f27506b)) {
            return;
        }
        C43259k.d(Y1(), null, CoroutineStart.f410683e, new c(j12, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.I0
    /* renamed from: u2, reason: from getter */
    public final boolean getF27509B() {
        return this.f27509B;
    }
}
