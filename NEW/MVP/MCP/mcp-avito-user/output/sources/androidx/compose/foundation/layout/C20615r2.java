package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: WindowInsetsConnection.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/r2;", "Landroidx/compose/animation/core/X;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20615r2 implements androidx.compose.animation.core.X {

    /* renamed from: a, reason: collision with root package name */
    public final float f28732a;

    public C20615r2(@Y61.k androidx.compose.ui.unit.d dVar) {
        this.f28732a = dVar.getF42844b() * 386.0878f * 160.0f * 0.84f;
    }

    @Override // androidx.compose.animation.core.X
    /* renamed from: a */
    public final float getF26186a() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.X
    public final long b(float f12) {
        C20577i c20577i = C20577i.f28642a;
        float f13 = D2.f28229a * this.f28732a;
        c20577i.getClass();
        return (long) (Math.exp(Math.log((Math.abs(f12) * 0.35f) / f13) / D2.f28231c) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.X
    public final float c(float f12, float f13) {
        return f12 + f(f13);
    }

    @Override // androidx.compose.animation.core.X
    public final float d(float f12, float f13, long j12) {
        long jB2 = b(f13);
        float f14 = jB2 > 0 ? j12 / jB2 : 1.0f;
        float f15 = f(f13);
        C20577i.f28642a.getClass();
        return (Float.intBitsToFloat((int) (C20577i.a(f14) >> 32)) * f15) + f12;
    }

    @Override // androidx.compose.animation.core.X
    public final float e(long j12, float f12) {
        long jB2 = b(f12);
        float f13 = jB2 > 0 ? j12 / jB2 : 1.0f;
        float f14 = f(f12);
        C20577i.f28642a.getClass();
        return ((Float.intBitsToFloat((int) (C20577i.a(f13) & 4294967295L)) * f14) / jB2) * 1.0E9f;
    }

    public final float f(float f12) {
        C20577i c20577i = C20577i.f28642a;
        float f13 = D2.f28229a;
        float f14 = this.f28732a;
        c20577i.getClass();
        return Math.signum(f12) * ((float) (Math.exp((D2.f28230b / D2.f28231c) * Math.log((Math.abs(f12) * 0.35f) / (f13 * f14))) * f13 * f14));
    }
}
