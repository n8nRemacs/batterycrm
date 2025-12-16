package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C20315s;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.H;
import androidx.compose.animation.core.J;
import androidx.compose.foundation.gestures.G1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: SnapFlingBehavior.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/compose/foundation/gestures/snapping/a;", "", "Landroidx/compose/animation/core/t;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/compose/foundation/gestures/snapping/a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {0}, l = {135, 151}, m = "invokeSuspend", n = {"remainingScrollOffset"}, s = {"L$0"})
/* loaded from: classes.dex */
final class l extends SuspendLambda implements Y41.p<T, Continuation<? super androidx.compose.foundation.gestures.snapping.a<Float, C20318t>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public l0.e f28015q;

    /* renamed from: r, reason: collision with root package name */
    public int f28016r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f28017s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f28018t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ N f28019u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G1 f28020v;

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Lkotlin/G0;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Float, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.e f28021l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f28022m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l0.e eVar, Y41.l<? super Float, G0> lVar) {
            super(1);
            this.f28021l = eVar;
            this.f28022m = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(Float f12) {
            float fFloatValue = f12.floatValue();
            l0.e eVar = this.f28021l;
            float f13 = eVar.f406839b - fFloatValue;
            eVar.f406839b = f13;
            this.f28022m.invoke(Float.valueOf(f13));
            return G0.f406611a;
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Lkotlin/G0;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Float, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.e f28023l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f28024m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l0.e eVar, Y41.l<? super Float, G0> lVar) {
            super(1);
            this.f28023l = eVar;
            this.f28024m = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(Float f12) {
            float fFloatValue = f12.floatValue();
            l0.e eVar = this.f28023l;
            float f13 = eVar.f406839b - fFloatValue;
            eVar.f406839b = f13;
            this.f28024m.invoke(Float.valueOf(f13));
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(o oVar, float f12, Y41.l<? super Float, G0> lVar, G1 g12, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f28017s = oVar;
        this.f28018t = f12;
        this.f28019u = (N) lVar;
        this.f28020v = g12;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new l(this.f28017s, this.f28018t, this.f28019u, this.f28020v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super androidx.compose.foundation.gestures.snapping.a<Float, C20318t>> continuation) {
        return ((l) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l0.e eVar;
        Object objC;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f28016r;
        ?? r62 = this.f28019u;
        o oVar = this.f28017s;
        if (i12 == 0) {
            C42729a0.b(obj);
            H<Float> h12 = oVar.f28032b;
            float f12 = this.f28018t;
            float fB2 = oVar.f28031a.b(f12, J.a(h12, 0.0f, f12));
            if (Float.isNaN(fB2)) {
                androidx.compose.foundation.internal.e.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            eVar = new l0.e();
            float fSignum = Math.signum(f12) * Math.abs(fB2);
            eVar.f406839b = fSignum;
            r62.invoke(Boxing.boxFloat(fSignum));
            float f13 = eVar.f406839b;
            b bVar = new b(eVar, r62);
            this.f28015q = eVar;
            this.f28016r = 1;
            objC = o.c(this.f28017s, this.f28020v, f13, this.f28018t, bVar, this);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return obj;
            }
            l0.e eVar2 = this.f28015q;
            C42729a0.b(obj);
            eVar = eVar2;
            objC = obj;
        }
        androidx.compose.animation.core.r rVar = (androidx.compose.animation.core.r) objC;
        float fA2 = oVar.f28031a.a(((Number) rVar.a()).floatValue());
        if (Float.isNaN(fA2)) {
            androidx.compose.foundation.internal.e.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        eVar.f406839b = fA2;
        androidx.compose.animation.core.r rVarB = C20315s.b(rVar, 0.0f, 0.0f, 30);
        a aVar = new a(eVar, r62);
        this.f28015q = null;
        this.f28016r = 2;
        Object objC2 = t.c(this.f28020v, fA2, fA2, rVarB, oVar.f28033c, aVar, this);
        return objC2 == coroutine_suspended ? coroutine_suspended : objC2;
    }
}
