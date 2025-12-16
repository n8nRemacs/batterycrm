package androidx.compose.material3;

import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Slider.kt */
@InterfaceC21537e7
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/gd;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.F3
/* renamed from: androidx.compose.material3.gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21589gd {

    /* renamed from: a, reason: collision with root package name */
    public final int f36428a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.a<kotlin.G0> f36429b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.ranges.f<Float> f36430c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f36431d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f36432e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final float[] f36433f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f36434g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f36435h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f36436i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f36437j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f36438k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f36439l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Boolean, kotlin.G0> f36440m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f36441n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f36442o;

    public C21589gd() {
        this(0.0f, 0.0f, 0, null, null, 31, null);
    }

    public final float a() {
        return ((C22040c3) this.f36432e).f();
    }

    public final float b() {
        return ((C22040c3) this.f36431d).f();
    }

    public final float c() {
        kotlin.ranges.f<Float> fVar = this.f36430c;
        return Tf.i(fVar.d().floatValue(), fVar.g().floatValue(), a());
    }

    public final float d() {
        kotlin.ranges.f<Float> fVar = this.f36430c;
        return Tf.i(fVar.d().floatValue(), fVar.g().floatValue(), b());
    }

    public final int e() {
        return (int) Math.floor((1.0f - d()) * this.f36428a);
    }

    public final int f() {
        return (int) Math.floor(c() * this.f36428a);
    }

    public final void g(float f12, boolean z12) {
        long jE2;
        InterfaceC22192v1 interfaceC22192v1 = this.f36438k;
        InterfaceC22192v1 interfaceC22192v12 = this.f36437j;
        InterfaceC22192v1 interfaceC22192v13 = this.f36441n;
        InterfaceC22192v1 interfaceC22192v14 = this.f36442o;
        float[] fArr = this.f36433f;
        if (z12) {
            C22040c3 c22040c3 = (C22040c3) interfaceC22192v12;
            ((C22040c3) interfaceC22192v12).S6(c22040c3.f() + f12);
            C22040c3 c22040c32 = (C22040c3) interfaceC22192v14;
            C22040c3 c22040c33 = (C22040c3) interfaceC22192v13;
            ((C22040c3) interfaceC22192v1).S6(h(c22040c32.f(), c22040c33.f(), a()));
            float f13 = ((C22040c3) interfaceC22192v1).f();
            jE2 = Tf.e(Tf.g(kotlin.ranges.s.f(c22040c3.f(), c22040c32.f(), f13), fArr, c22040c32.f(), c22040c33.f()), f13);
        } else {
            C22040c3 c22040c34 = (C22040c3) interfaceC22192v1;
            ((C22040c3) interfaceC22192v1).S6(c22040c34.f() + f12);
            C22040c3 c22040c35 = (C22040c3) interfaceC22192v14;
            C22040c3 c22040c36 = (C22040c3) interfaceC22192v13;
            ((C22040c3) interfaceC22192v12).S6(h(c22040c35.f(), c22040c36.f(), b()));
            float f14 = ((C22040c3) interfaceC22192v12).f();
            jE2 = Tf.e(f14, Tf.g(kotlin.ranges.s.f(c22040c34.f(), f14, c22040c36.f()), fArr, c22040c35.f(), c22040c36.f()));
        }
        float f15 = ((C22040c3) interfaceC22192v14).f();
        float f16 = ((C22040c3) interfaceC22192v13).f();
        kotlin.ranges.f<Float> fVar = this.f36430c;
        float fFloatValue = fVar.d().floatValue();
        float fFloatValue2 = fVar.g().floatValue();
        long jE3 = Tf.e(Tf.j(f15, f16, Vf.b(jE2), fFloatValue, fFloatValue2), Tf.j(f15, f16, Vf.a(jE2), fFloatValue, fFloatValue2));
        if (jE3 == Tf.e(b(), a())) {
            return;
        }
        j(Vf.b(jE3));
        i(Vf.a(jE3));
    }

    public final float h(float f12, float f13, float f14) {
        kotlin.ranges.f<Float> fVar = this.f36430c;
        return Tf.j(fVar.d().floatValue(), fVar.g().floatValue(), f14, f12, f13);
    }

    public final void i(float f12) {
        float fB2 = b();
        kotlin.ranges.f<Float> fVar = this.f36430c;
        ((C22040c3) this.f36432e).S6(Tf.g(kotlin.ranges.s.f(f12, fB2, fVar.g().floatValue()), this.f36433f, fVar.d().floatValue(), fVar.g().floatValue()));
    }

    public final void j(float f12) {
        kotlin.ranges.f<Float> fVar = this.f36430c;
        ((C22040c3) this.f36431d).S6(Tf.g(kotlin.ranges.s.f(f12, fVar.d().floatValue(), a()), this.f36433f, fVar.d().floatValue(), fVar.g().floatValue()));
    }

    public C21589gd(float f12, float f13, int i12, Y41.a aVar, kotlin.ranges.f fVar, int i13, C42822w c42822w) {
        f12 = (i13 & 1) != 0 ? 0.0f : f12;
        f13 = (i13 & 2) != 0 ? 1.0f : f13;
        i12 = (i13 & 4) != 0 ? 0 : i12;
        aVar = (i13 & 8) != 0 ? null : aVar;
        fVar = (i13 & 16) != 0 ? kotlin.ranges.s.m(0.0f, 1.0f) : fVar;
        this.f36428a = i12;
        this.f36429b = aVar;
        this.f36430c = fVar;
        this.f36431d = androidx.compose.runtime.Q1.a(f12);
        this.f36432e = androidx.compose.runtime.Q1.a(f13);
        this.f36433f = Tf.h(i12);
        this.f36434g = androidx.compose.runtime.Q1.a(0.0f);
        this.f36435h = androidx.compose.runtime.Q1.a(0.0f);
        this.f36436i = androidx.compose.runtime.U2.a(0);
        this.f36437j = androidx.compose.runtime.Q1.a(0.0f);
        this.f36438k = androidx.compose.runtime.Q1.a(0.0f);
        this.f36439l = C22126m3.g(Boolean.FALSE);
        this.f36440m = new C21566fd(this);
        this.f36441n = androidx.compose.runtime.Q1.a(0.0f);
        this.f36442o = androidx.compose.runtime.Q1.a(0.0f);
    }
}
