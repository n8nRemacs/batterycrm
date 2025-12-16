package androidx.compose.foundation;

import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.U2;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;

/* compiled from: Scroll.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/d2;", "Landroidx/compose/foundation/gestures/U1;", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d2 implements androidx.compose.foundation.gestures.U1 {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final c f27079i = new c(null);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.runtime.saveable.w f27080j;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f27081a;

    /* renamed from: e, reason: collision with root package name */
    public float f27085e;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f27082b = U2.a(0);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.interaction.m f27083c = androidx.compose.foundation.interaction.l.a();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f27084d = U2.a(Integer.MAX_VALUE);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.gestures.U1 f27086f = androidx.compose.foundation.gestures.W1.a(new f());

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final I3 f27087g = C22126m3.d(new e());

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final I3 f27088h = C22126m3.d(new d());

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/foundation/d2;", "it", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/foundation/d2;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, d2, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f27089l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(androidx.compose.runtime.saveable.x xVar, d2 d2Var) {
            return Integer.valueOf(((C22061e3) d2Var.f27081a).e());
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/foundation/d2;", "invoke", "(I)Landroidx/compose/foundation/d2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Integer, d2> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f27090l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final d2 invoke(Integer num) {
            return new d2(num.intValue());
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/d2$c;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(((C22061e3) d2.this.f27081a).e() > 0);
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            d2 d2Var = d2.this;
            return Boolean.valueOf(((C22061e3) d2Var.f27081a).e() < d2Var.g());
        }
    }

    /* compiled from: Scroll.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<Float, Float> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            float fFloatValue = f12.floatValue();
            d2 d2Var = d2.this;
            float fE2 = ((C22061e3) d2Var.f27081a).e() + fFloatValue + d2Var.f27085e;
            float f13 = kotlin.ranges.s.f(fE2, 0.0f, d2Var.g());
            boolean z12 = fE2 == f13;
            InterfaceC22196w1 interfaceC22196w1 = d2Var.f27081a;
            float fE3 = f13 - r4.e();
            int iRound = Math.round(fE3);
            ((C22061e3) interfaceC22196w1).L3(((C22061e3) interfaceC22196w1).e() + iRound);
            d2Var.f27085e = fE3 - iRound;
            if (!z12) {
                fFloatValue = fE3;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    static {
        a aVar = a.f27089l;
        b bVar = b.f27090l;
        androidx.compose.runtime.saveable.w wVar = androidx.compose.runtime.saveable.v.f38606a;
        f27080j = new androidx.compose.runtime.saveable.w(bVar, aVar);
    }

    public d2(int i12) {
        this.f27081a = U2.a(i12);
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean a() {
        return this.f27086f.a();
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean b() {
        return ((Boolean) this.f27087g.getF42167b()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final float c(float f12) {
        return this.f27086f.c(f12);
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean d() {
        return ((Boolean) this.f27088h.getF42167b()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.U1
    @Y61.l
    public final Object e(@Y61.k MutatePriority mutatePriority, @Y61.k Y41.p<? super androidx.compose.foundation.gestures.G1, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objE = this.f27086f.e(mutatePriority, pVar, continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : kotlin.G0.f406611a;
    }

    @Y61.l
    public final Object f(int i12, @Y61.k androidx.compose.animation.core.G1 g12, @Y61.k SuspendLambda suspendLambda) {
        Object objA = androidx.compose.foundation.gestures.F1.a(this, i12 - ((C22061e3) this.f27081a).e(), g12, suspendLambda);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.G0.f406611a;
    }

    public final int g() {
        return ((C22061e3) this.f27084d).e();
    }

    @Y61.l
    public final Object h(int i12, @Y61.k SuspendLambda suspendLambda) {
        return androidx.compose.foundation.gestures.F1.b(this, i12 - ((C22061e3) this.f27081a).e(), suspendLambda);
    }

    public final void i(int i12) {
        ((C22061e3) this.f27084d).L3(i12);
        AbstractC22167l.f38720e.getClass();
        AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
        Y41.l<Object, kotlin.G0> lVarE = abstractC22167lA != null ? abstractC22167lA.e() : null;
        AbstractC22167l abstractC22167lB = AbstractC22167l.a.b(abstractC22167lA);
        InterfaceC22196w1 interfaceC22196w1 = this.f27081a;
        try {
            if (((C22061e3) interfaceC22196w1).e() > i12) {
                ((C22061e3) interfaceC22196w1).L3(i12);
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
        } finally {
            AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, lVarE);
        }
    }
}
