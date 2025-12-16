package com.akita.compose.component.gallery.internal;

import Y61.k;
import androidx.compose.foundation.gestures.snapping.g;
import androidx.compose.foundation.gestures.snapping.u;
import androidx.compose.foundation.gestures.snapping.v;
import androidx.compose.foundation.lazy.K;
import androidx.compose.foundation.lazy.Y;
import androidx.compose.foundation.lazy.w0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.ranges.s;

/* compiled from: LimitedSnapFlingBehavior.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/gallery/internal/b;", "Landroidx/compose/foundation/gestures/snapping/u;", "gallery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class b implements u {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final w0 f61607a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final v f61608b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f61609c;

    public b(@k w0 w0Var, @k v vVar) {
        this.f61607a = w0Var;
        this.f61608b = vVar;
        this.f61609c = new g(w0Var, vVar);
    }

    @Override // androidx.compose.foundation.gestures.snapping.u
    public final float a(float f12) {
        return this.f61609c.a(f12);
    }

    @Override // androidx.compose.foundation.gestures.snapping.u
    public final float b(float f12, float f13) {
        w0 w0Var = this.f61607a;
        Y yJ2 = w0Var.j();
        K k12 = (K) C42745f0.G(yJ2.h());
        if (k12 == null) {
            return 0.0f;
        }
        int f28952r = yJ2.getF28952r() + k12.getF28969q();
        if (f28952r <= 0) {
            return 0.0f;
        }
        int iH2 = w0Var.h();
        float f14 = f28952r;
        return Math.signum(f12) * s.a(Math.abs((s.g(s.g((int) ((f13 / f14) + iH2), iH2 - 1, iH2 + 1), 0, yJ2.getF28948n() - 1) - iH2) * f14) - f14, 0.0f);
    }
}
