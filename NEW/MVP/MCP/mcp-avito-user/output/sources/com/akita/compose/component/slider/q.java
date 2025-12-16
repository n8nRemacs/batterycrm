package com.akita.compose.component.slider;

import androidx.compose.foundation.G1;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.O0;
import androidx.compose.foundation.gestures.Y0;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.Q1;
import androidx.compose.runtime.U2;
import j.F;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: SliderState.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/slider/q;", "Landroidx/compose/foundation/gestures/Y0;", "slider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class q implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.ranges.f<Float> f62738a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f62739b;

    /* renamed from: c, reason: collision with root package name */
    public final int f62740c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f62741d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f62742e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final float[] f62743f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final G1 f62744g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f62745h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f62746i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Float, G0> f62747j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f62748k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f62749l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final b f62750m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f62751n;

    /* compiled from: SliderState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.akita.compose.component.slider.SliderState$drag$2", f = "SliderState.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f62752q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ MutatePriority f62754s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f62755t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutatePriority mutatePriority, Y41.p<? super O0, ? super Continuation<? super G0>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f62754s = mutatePriority;
            this.f62755t = (SuspendLambda) pVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return q.this.new a(this.f62754s, this.f62755t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f62752q;
            q qVar = q.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                ((C22082i3) qVar.f62742e).setValue(Boolean.TRUE);
                this.f62752q = 1;
                if (qVar.f62744g.c(qVar.f62750m, this.f62754s, this.f62755t, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            ((C22082i3) qVar.f62742e).setValue(Boolean.FALSE);
            return G0.f406611a;
        }
    }

    /* compiled from: SliderState.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/akita/compose/component/slider/q$b", "Landroidx/compose/foundation/gestures/O0;", "slider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements O0 {
        public b() {
        }

        @Override // androidx.compose.foundation.gestures.O0
        public final void a(float f12) {
            q.this.b(f12);
        }
    }

    /* compiled from: SliderState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.a<G0> aVar;
            q qVar = q.this;
            if (!((Boolean) ((C22082i3) qVar.f62742e).getF42167b()).booleanValue() && (aVar = qVar.f62739b) != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    public q() {
        this(0.0f, null, null, 0, 15, null);
    }

    @Override // androidx.compose.foundation.gestures.Y0
    @Y61.l
    public final Object a(@Y61.k MutatePriority mutatePriority, @Y61.k Y41.p<? super O0, ? super Continuation<? super G0>, ? extends Object> pVar, @Y61.k Continuation<? super G0> continuation) {
        Object objC = U.c(new a(mutatePriority, pVar, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
    }

    public final void b(float f12) {
        float fE2 = ((C22061e3) this.f62746i).e();
        C22040c3 c22040c3 = (C22040c3) this.f62745h;
        float f13 = 2;
        float fMax = Math.max(fE2 - (c22040c3.f() / f13), 0.0f);
        float fMin = Math.min(c22040c3.f() / f13, fMax);
        C22040c3 c22040c32 = (C22040c3) this.f62748k;
        float f14 = c22040c32.f() + f12;
        InterfaceC22192v1 interfaceC22192v1 = this.f62749l;
        c22040c32.S6(((C22040c3) interfaceC22192v1).f() + f14);
        ((C22040c3) interfaceC22192v1).S6(0.0f);
        float fA2 = r.a(c22040c32.f(), this.f62743f, fMin, fMax);
        kotlin.ranges.f<Float> fVar = this.f62738a;
        float f15 = fMax - fMin;
        float fB2 = E0.e.b(fVar.d().floatValue(), fVar.g().floatValue(), kotlin.ranges.s.f(f15 == 0.0f ? 0.0f : (fA2 - fMin) / f15, 0.0f, 1.0f));
        if (fB2 == ((C22040c3) this.f62741d).f()) {
            return;
        }
        Y41.l<? super Float, G0> lVar = this.f62747j;
        if (lVar != null) {
            lVar.invoke(Float.valueOf(fB2));
        } else {
            d(fB2);
        }
    }

    public final float c() {
        kotlin.ranges.f<Float> fVar = this.f62738a;
        float fFloatValue = fVar.d().floatValue();
        float fFloatValue2 = fVar.g().floatValue() - fFloatValue;
        return kotlin.ranges.s.f(fFloatValue2 == 0.0f ? 0.0f : (kotlin.ranges.s.f(((C22040c3) this.f62741d).f(), fVar.d().floatValue(), fVar.g().floatValue()) - fFloatValue) / fFloatValue2, 0.0f, 1.0f);
    }

    public final void d(float f12) {
        kotlin.ranges.f<Float> fVar = this.f62738a;
        ((C22040c3) this.f62741d).S6(r.a(kotlin.ranges.s.f(f12, fVar.d().floatValue(), fVar.g().floatValue()), this.f62743f, fVar.d().floatValue(), fVar.g().floatValue()));
    }

    public q(float f12, @F int i12, @Y61.l Y41.a aVar, @Y61.k kotlin.ranges.f fVar) {
        float[] fArr;
        this.f62738a = fVar;
        this.f62739b = aVar;
        this.f62740c = i12;
        this.f62741d = Q1.a(f12);
        this.f62742e = C22126m3.g(Boolean.FALSE);
        if (i12 == 0) {
            fArr = new float[0];
        } else {
            int i13 = i12 + 2;
            float[] fArr2 = new float[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                fArr2[i14] = i14 / (i12 + 1);
            }
            fArr = fArr2;
        }
        this.f62743f = fArr;
        this.f62744g = new G1();
        this.f62745h = Q1.a(0.0f);
        this.f62746i = U2.a(0);
        kotlin.ranges.f<Float> fVar2 = this.f62738a;
        float fFloatValue = fVar2.d().floatValue();
        float fFloatValue2 = fVar2.g().floatValue() - fFloatValue;
        this.f62748k = Q1.a(E0.e.b(0.0f, 0.0f, kotlin.ranges.s.f(fFloatValue2 == 0.0f ? 0.0f : (f12 - fFloatValue) / fFloatValue2, 0.0f, 1.0f)));
        this.f62749l = Q1.a(0.0f);
        this.f62750m = new b();
        this.f62751n = new c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q(float f12, kotlin.ranges.f fVar, Y41.a aVar, int i12, int i13, C42822w c42822w) {
        f12 = (i13 & 1) != 0 ? 0.0f : f12;
        fVar = (i13 & 2) != 0 ? kotlin.ranges.s.m(0.0f, 1.0f) : fVar;
        this(f12, (i13 & 8) != 0 ? 0 : i12, (i13 & 4) != 0 ? null : aVar, fVar);
    }
}
