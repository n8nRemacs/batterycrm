package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AbstractC20330x;
import androidx.compose.animation.core.C20273d1;
import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.C20315s;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.H1;
import androidx.compose.animation.core.J1;
import androidx.compose.animation.core.R0;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: LazyLayoutScrollDeltaBetweenPasses.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/f0;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.layout.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20718f0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public androidx.compose.animation.core.r<Float, C20318t> f29414a;

    /* compiled from: LazyLayoutScrollDeltaBetweenPasses.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1", f = "LazyLayoutScrollDeltaBetweenPasses.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.f0$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f29415q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return C20718f0.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f29415q;
            if (i12 == 0) {
                C42729a0.b(obj);
                androidx.compose.animation.core.r<Float, C20318t> rVar = C20718f0.this.f29414a;
                Float fBoxFloat = Boxing.boxFloat(0.0f);
                R0 r0D = C20310q.d(400.0f, 1, Boxing.boxFloat(0.5f));
                this.f29415q = 1;
                if (C20273d1.g(rVar, fBoxFloat, r0D, true, null, this, 8) == coroutine_suspended) {
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

    /* compiled from: LazyLayoutScrollDeltaBetweenPasses.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2", f = "LazyLayoutScrollDeltaBetweenPasses.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.f0$b */
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f29417q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return C20718f0.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f29417q;
            if (i12 == 0) {
                C42729a0.b(obj);
                androidx.compose.animation.core.r<Float, C20318t> rVar = C20718f0.this.f29414a;
                Float fBoxFloat = Boxing.boxFloat(0.0f);
                R0 r0D = C20310q.d(400.0f, 1, Boxing.boxFloat(0.5f));
                this.f29417q = 1;
                if (C20273d1.g(rVar, fBoxFloat, r0D, true, null, this, 8) == coroutine_suspended) {
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

    public C20718f0() {
        int i12 = kotlin.jvm.internal.A.f406820a;
        H1<Float, C20318t> h12 = J1.f26075a;
        this.f29414a = new androidx.compose.animation.core.r<>(h12, Float.valueOf(0.0f), (AbstractC20330x) h12.a().invoke(Float.valueOf(0.0f)), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final void a(float f12, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k kotlinx.coroutines.T t12) {
        if (f12 <= dVar.M0(C20720g0.f29419a)) {
            return;
        }
        AbstractC22167l.f38720e.getClass();
        AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
        Y41.l<Object, kotlin.G0> f38696h = abstractC22167lA != null ? abstractC22167lA.getF38713f() : null;
        AbstractC22167l abstractC22167lB = AbstractC22167l.a.b(abstractC22167lA);
        try {
            float fFloatValue = ((Number) ((C22082i3) this.f29414a.f26397c).getF42167b()).floatValue();
            androidx.compose.animation.core.r<Float, C20318t> rVar = this.f29414a;
            if (rVar.f26401g) {
                this.f29414a = C20315s.b(rVar, fFloatValue - f12, 0.0f, 30);
                C43259k.d(t12, null, null, new a(null), 3);
            } else {
                int i12 = kotlin.jvm.internal.A.f406820a;
                this.f29414a = new androidx.compose.animation.core.r<>(J1.f26075a, Float.valueOf(-f12), null, 0L, 0L, false, 60, null);
                C43259k.d(t12, null, null, new b(null), 3);
            }
            AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, f38696h);
        } catch (Throwable th2) {
            AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, f38696h);
            throw th2;
        }
    }
}
