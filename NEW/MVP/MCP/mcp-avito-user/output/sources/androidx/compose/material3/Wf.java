package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;

/* compiled from: Slider.kt */
@InterfaceC21537e7
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/Wf;", "Landroidx/compose/foundation/gestures/Y0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.F3
/* loaded from: classes.dex */
public final class Wf implements androidx.compose.foundation.gestures.Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f35769a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.a<kotlin.G0> f35770b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.ranges.f<Float> f35771c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f35772d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Float, kotlin.G0> f35773e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final float[] f35774f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f35775g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f35776h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f35777i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f35778j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Y41.a<kotlin.G0> f35779k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f35780l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f35781m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final b f35782n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.G1 f35783o;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.SliderState$drag$2", f = "Slider.kt", i = {}, l = {1820}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f35784q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ MutatePriority f35786s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f35787t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutatePriority mutatePriority, Y41.p<? super androidx.compose.foundation.gestures.O0, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35786s = mutatePriority;
            this.f35787t = (SuspendLambda) pVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return Wf.this.new a(this.f35786s, this.f35787t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f35784q;
            Wf wf2 = Wf.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                ((C22082i3) wf2.f35778j).setValue(Boolean.TRUE);
                this.f35784q = 1;
                if (wf2.f35783o.c(wf2.f35782n, this.f35786s, this.f35787t, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            ((C22082i3) wf2.f35778j).setValue(Boolean.FALSE);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material3/Wf$b", "Landroidx/compose/foundation/gestures/O0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements androidx.compose.foundation.gestures.O0 {
        public b() {
        }

        @Override // androidx.compose.foundation.gestures.O0
        public final void a(float f12) {
            Wf.this.b(f12);
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            Y41.a<kotlin.G0> aVar;
            Wf wf2 = Wf.this;
            if (!((Boolean) ((C22082i3) wf2.f35778j).getF42167b()).booleanValue() && (aVar = wf2.f35770b) != null) {
                aVar.invoke();
            }
            return kotlin.G0.f406611a;
        }
    }

    public Wf() {
        this(0.0f, 0, null, null, 15, null);
    }

    @Override // androidx.compose.foundation.gestures.Y0
    @Y61.l
    public final Object a(@Y61.k MutatePriority mutatePriority, @Y61.k Y41.p<? super androidx.compose.foundation.gestures.O0, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objC = kotlinx.coroutines.U.c(new a(mutatePriority, pVar, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }

    public final void b(float f12) {
        float fE2 = ((C22061e3) this.f35775g).e();
        C22040c3 c22040c3 = (C22040c3) this.f35777i;
        float f13 = 2;
        float fMax = Math.max(fE2 - (c22040c3.f() / f13), 0.0f);
        float fMin = Math.min(c22040c3.f() / f13, fMax);
        C22040c3 c22040c32 = (C22040c3) this.f35780l;
        float f14 = c22040c32.f() + f12;
        InterfaceC22192v1 interfaceC22192v1 = this.f35781m;
        c22040c32.S6(((C22040c3) interfaceC22192v1).f() + f14);
        ((C22040c3) interfaceC22192v1).S6(0.0f);
        float fG2 = Tf.g(c22040c32.f(), this.f35774f, fMin, fMax);
        kotlin.ranges.f<Float> fVar = this.f35771c;
        float fJ2 = Tf.j(fMin, fMax, fG2, fVar.d().floatValue(), fVar.g().floatValue());
        if (fJ2 == ((C22040c3) this.f35772d).f()) {
            return;
        }
        Y41.l<? super Float, kotlin.G0> lVar = this.f35773e;
        if (lVar != null) {
            lVar.invoke(Float.valueOf(fJ2));
        } else {
            d(fJ2);
        }
    }

    public final float c() {
        kotlin.ranges.f<Float> fVar = this.f35771c;
        return Tf.i(fVar.d().floatValue(), fVar.g().floatValue(), kotlin.ranges.s.f(((C22040c3) this.f35772d).f(), fVar.d().floatValue(), fVar.g().floatValue()));
    }

    public final void d(float f12) {
        kotlin.ranges.f<Float> fVar = this.f35771c;
        ((C22040c3) this.f35772d).S6(Tf.g(kotlin.ranges.s.f(f12, fVar.d().floatValue(), fVar.g().floatValue()), this.f35774f, fVar.d().floatValue(), fVar.g().floatValue()));
    }

    public Wf(float f12, @j.F int i12, @Y61.l Y41.a<kotlin.G0> aVar, @Y61.k kotlin.ranges.f<Float> fVar) {
        this.f35769a = i12;
        this.f35770b = aVar;
        this.f35771c = fVar;
        this.f35772d = androidx.compose.runtime.Q1.a(f12);
        this.f35774f = Tf.h(i12);
        this.f35775g = androidx.compose.runtime.U2.a(0);
        this.f35777i = androidx.compose.runtime.Q1.a(0.0f);
        this.f35778j = C22126m3.g(Boolean.FALSE);
        this.f35779k = new c();
        this.f35780l = androidx.compose.runtime.Q1.a(Tf.j(fVar.d().floatValue(), fVar.g().floatValue(), f12, 0.0f, 0.0f));
        this.f35781m = androidx.compose.runtime.Q1.a(0.0f);
        this.f35782n = new b();
        this.f35783o = new androidx.compose.foundation.G1();
    }

    public /* synthetic */ Wf(float f12, int i12, Y41.a aVar, kotlin.ranges.f fVar, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0.0f : f12, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? null : aVar, (i13 & 8) != 0 ? kotlin.ranges.s.m(0.0f, 1.0f) : fVar);
    }
}
