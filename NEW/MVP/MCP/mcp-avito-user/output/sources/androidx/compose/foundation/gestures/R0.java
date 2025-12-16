package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.AbstractC20431a0;
import androidx.compose.foundation.gestures.N0;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Draggable2D.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/R0;", "Landroidx/compose/foundation/gestures/I0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class R0 extends I0 {

    /* compiled from: Draggable2D.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/Z;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/Z;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.Draggable2DNode$drag$2", f = "Draggable2D.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<Z, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27442q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27443r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.p<Y41.l<? super AbstractC20431a0.b, kotlin.G0>, Continuation<? super kotlin.G0>, Object> f27444s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ R0 f27445t;

        /* compiled from: Draggable2D.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/a0$b;", "dragDelta", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/gestures/a0$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.gestures.R0$a$a, reason: collision with other inner class name */
        public static final class C1572a extends kotlin.jvm.internal.N implements Y41.l<AbstractC20431a0.b, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Z f27446l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ R0 f27447m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1572a(Z z12, R0 r02) {
                super(1);
                this.f27446l = z12;
                this.f27447m = r02;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(AbstractC20431a0.b bVar) {
                long j12 = bVar.f27545a;
                this.f27447m.getClass();
                this.f27446l.a();
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.p<? super Y41.l<? super AbstractC20431a0.b, kotlin.G0>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, R0 r02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f27444s = pVar;
            this.f27445t = r02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f27444s, this.f27445t, continuation);
            aVar.f27443r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Z z12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(z12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27442q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C1572a c1572a = new C1572a((Z) this.f27443r, this.f27445t);
                this.f27442q = 1;
                if (((N0.a) this.f27444s).invoke(c1572a, this) == coroutine_suspended) {
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

    public R0() {
        throw null;
    }

    @Override // androidx.compose.foundation.gestures.I0
    @Y61.l
    public final Object r2(@Y61.k Y41.p<? super Y41.l<? super AbstractC20431a0.b, kotlin.G0>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
        MutatePriority mutatePriority = MutatePriority.f26797b;
        new a(pVar, this, null);
        throw null;
    }

    @Override // androidx.compose.foundation.gestures.I0
    public final void s2(long j12) {
        l0.g.a(j12);
        throw null;
    }

    @Override // androidx.compose.foundation.gestures.I0
    public final void t2(long j12) {
        androidx.compose.ui.unit.B.a(j12);
        throw null;
    }

    @Override // androidx.compose.foundation.gestures.I0
    public final boolean u2() {
        return false;
    }
}
