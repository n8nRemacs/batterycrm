package com.airbnb.lottie.compose;

import androidx.compose.foundation.G1;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.airbnb.lottie.C27291k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: LottieAnimatable.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/g;", "Lcom/airbnb/lottie/compose/c;", "<init>", "()V", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.airbnb.lottie.compose.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27271g implements InterfaceC27267c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59449b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59450c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59451d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59452e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59453f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59454g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59455h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final I3 f59456i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59457j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59458k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59459l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59460m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final I3 f59461n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final I3 f59462o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final G1 f59463p;

    /* compiled from: LottieAnimatable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.airbnb.lottie.compose.g$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Float> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Float invoke() {
            C27271g c27271g = C27271g.this;
            C27291k c27291kU = c27271g.u();
            float fA2 = 0.0f;
            if (c27291kU != null) {
                if (c27271g.getSpeed() < 0.0f) {
                    AbstractC27282s abstractC27282sM = c27271g.m();
                    if (abstractC27282sM != null) {
                        fA2 = abstractC27282sM.b(c27291kU);
                    }
                } else {
                    AbstractC27282s abstractC27282sM2 = c27271g.m();
                    fA2 = abstractC27282sM2 != null ? abstractC27282sM2.a(c27291kU) : 1.0f;
                }
            }
            return Float.valueOf(fA2);
        }
    }

    /* compiled from: LottieAnimatable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.airbnb.lottie.compose.g$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Float> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Float invoke() {
            C27271g c27271g = C27271g.this;
            return Float.valueOf((((Boolean) ((C22082i3) c27271g.f59452e).getF42167b()).booleanValue() && c27271g.w() % 2 == 0) ? -c27271g.getSpeed() : c27271g.getSpeed());
        }
    }

    /* compiled from: LottieAnimatable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.airbnb.lottie.compose.g$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            C27271g c27271g = C27271g.this;
            return Boolean.valueOf(c27271g.w() == ((Number) ((C22082i3) c27271g.f59451d).getF42167b()).intValue() && c27271g.c() == ((Number) c27271g.f59461n.getF42167b()).floatValue());
        }
    }

    public C27271g() {
        Boolean bool = Boolean.FALSE;
        this.f59449b = C22126m3.g(bool);
        this.f59450c = C22126m3.g(1);
        this.f59451d = C22126m3.g(1);
        this.f59452e = C22126m3.g(bool);
        this.f59453f = C22126m3.g(null);
        this.f59454g = C22126m3.g(Float.valueOf(1.0f));
        this.f59455h = C22126m3.g(bool);
        this.f59456i = C22126m3.d(new b());
        this.f59457j = C22126m3.g(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.f59458k = C22126m3.g(fValueOf);
        this.f59459l = C22126m3.g(fValueOf);
        this.f59460m = C22126m3.g(Long.MIN_VALUE);
        this.f59461n = C22126m3.d(new a());
        this.f59462o = C22126m3.d(new c());
        this.f59463p = new G1();
    }

    public static final boolean a(C27271g c27271g, int i12, long j12) {
        C27291k c27291kU = c27271g.u();
        if (c27291kU == null) {
            return true;
        }
        InterfaceC22204y1 interfaceC22204y1 = c27271g.f59460m;
        long jLongValue = ((Number) ((C22082i3) interfaceC22204y1).getF42167b()).longValue() == Long.MIN_VALUE ? 0L : j12 - ((Number) ((C22082i3) interfaceC22204y1).getF42167b()).longValue();
        ((C22082i3) interfaceC22204y1).setValue(Long.valueOf(j12));
        AbstractC27282s abstractC27282sM = c27271g.m();
        float fB2 = abstractC27282sM != null ? abstractC27282sM.b(c27291kU) : 0.0f;
        AbstractC27282s abstractC27282sM2 = c27271g.m();
        float fA2 = abstractC27282sM2 != null ? abstractC27282sM2.a(c27291kU) : 1.0f;
        float fB3 = (jLongValue / 1000000) / c27291kU.b();
        I3 i32 = c27271g.f59456i;
        float fFloatValue = ((Number) i32.getF42167b()).floatValue() * fB3;
        float fFloatValue2 = ((Number) i32.getF42167b()).floatValue();
        InterfaceC22204y1 interfaceC22204y12 = c27271g.f59458k;
        float fFloatValue3 = fFloatValue2 < 0.0f ? fB2 - (((Number) ((C22082i3) interfaceC22204y12).getF42167b()).floatValue() + fFloatValue) : (((Number) ((C22082i3) interfaceC22204y12).getF42167b()).floatValue() + fFloatValue) - fA2;
        if (fB2 == fA2) {
            c27271g.p(fB2);
        } else {
            if (fFloatValue3 < 0.0f) {
                c27271g.p(kotlin.ranges.s.f(((Number) ((C22082i3) interfaceC22204y12).getF42167b()).floatValue(), fB2, fA2) + fFloatValue);
                return true;
            }
            float f12 = fA2 - fB2;
            int i13 = (int) (fFloatValue3 / f12);
            int i14 = i13 + 1;
            if (c27271g.w() + i14 <= i12) {
                c27271g.j(c27271g.w() + i14);
                float f13 = fFloatValue3 - (i13 * f12);
                c27271g.p(((Number) i32.getF42167b()).floatValue() < 0.0f ? fA2 - f13 : fB2 + f13);
                return true;
            }
            c27271g.p(((Number) c27271g.f59461n.getF42167b()).floatValue());
            c27271g.j(i12);
        }
        return false;
    }

    public static final void d(C27271g c27271g, boolean z12) {
        ((C22082i3) c27271g.f59449b).setValue(Boolean.valueOf(z12));
    }

    @Override // com.airbnb.lottie.compose.InterfaceC27267c
    @Y61.l
    public final Object b(@Y61.l C27291k c27291k, int i12, int i13, boolean z12, float f12, @Y61.l AbstractC27282s abstractC27282s, float f13, @Y61.k LottieCancellationBehavior lottieCancellationBehavior, @Y61.k Continuation continuation) {
        Object objB = this.f59463p.b(MutatePriority.f26797b, new C27268d(this, i12, i13, z12, f12, abstractC27282s, c27291k, f13, lottieCancellationBehavior, null), (SuspendLambda) continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : G0.f406611a;
    }

    @Override // com.airbnb.lottie.compose.r
    public final float c() {
        return ((Number) ((C22082i3) this.f59459l).getF42167b()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.r
    public final float getSpeed() {
        return ((Number) ((C22082i3) this.f59454g).getF42167b()).floatValue();
    }

    @Override // androidx.compose.runtime.I3
    /* renamed from: getValue */
    public final Float getF42167b() {
        return Float.valueOf(c());
    }

    public final void j(int i12) {
        ((C22082i3) this.f59450c).setValue(Integer.valueOf(i12));
    }

    @Override // com.airbnb.lottie.compose.r
    @Y61.l
    public final AbstractC27282s m() {
        return (AbstractC27282s) ((C22082i3) this.f59453f).getF42167b();
    }

    public final void p(float f12) {
        C27291k c27291kU;
        ((C22082i3) this.f59458k).setValue(Float.valueOf(f12));
        if (((Boolean) ((C22082i3) this.f59455h).getF42167b()).booleanValue() && (c27291kU = u()) != null) {
            f12 -= f12 % (1 / c27291kU.f59595n);
        }
        ((C22082i3) this.f59459l).setValue(Float.valueOf(f12));
    }

    @Override // com.airbnb.lottie.compose.InterfaceC27267c
    @Y61.l
    public final Object t(@Y61.l C27291k c27291k, float f12, boolean z12, @Y61.k Continuation continuation) {
        Object objB = this.f59463p.b(MutatePriority.f26797b, new C27272h(this, c27291k, f12, z12, null), (SuspendLambda) continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : G0.f406611a;
    }

    @Override // com.airbnb.lottie.compose.r
    @Y61.l
    public final C27291k u() {
        return (C27291k) ((C22082i3) this.f59457j).getF42167b();
    }

    @Override // com.airbnb.lottie.compose.r
    public final int w() {
        return ((Number) ((C22082i3) this.f59450c).getF42167b()).intValue();
    }
}
