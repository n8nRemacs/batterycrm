package com.google.accompanist.placeholder;

import androidx.appcompat.app.r;
import androidx.compose.animation.core.C20278f0;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import kotlin.w0;
import l0.n;

/* compiled from: PlaceholderHighlight.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/google/accompanist/placeholder/l;", "Lcom/google/accompanist/placeholder/c;", "Landroidx/compose/ui/graphics/T;", "highlightColor", "Landroidx/compose/animation/core/f0;", "", "animationSpec", "progressForMaxAlpha", "<init>", "(JLandroidx/compose/animation/core/f0;FLkotlin/jvm/internal/w;)V", "placeholder_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class l implements c {

    /* renamed from: b, reason: collision with root package name */
    public final long f342906b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C20278f0<Float> f342907c;

    /* renamed from: d, reason: collision with root package name */
    public final float f342908d;

    public l() {
        throw null;
    }

    public /* synthetic */ l(long j12, C20278f0 c20278f0, float f12, int i12, C42822w c42822w) {
        this(j12, c20278f0, (i12 & 4) != 0 ? 0.6f : f12, null);
    }

    public final float a(float f12) {
        float f13 = this.f342908d;
        return f12 <= f13 ? E0.e.b(0.0f, 1.0f, f12 / f13) : E0.e.b(1.0f, 0.0f, (f12 - f13) / (1.0f - f13));
    }

    @Y61.k
    public final J b(long j12, float f12) {
        J.a aVar = J.f39287a;
        long j13 = this.f342906b;
        return J.a.c(aVar, C42745f0.U(T.a(T.c(j13, 0.0f)), T.a(j13), T.a(T.c(j13, 0.0f))), l0.h.a(0.0f, 0.0f), s.a(Math.max(n.e(j12), n.c(j12)) * f12 * 2, 0.01f));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return T.d(this.f342906b, lVar.f342906b) && L.f(this.f342907c, lVar.f342907c) && Float.valueOf(this.f342908d).equals(Float.valueOf(lVar.f342908d));
    }

    public final int hashCode() {
        T.a aVar = T.f39320b;
        int i12 = w0.f410662c;
        return Float.hashCode(this.f342908d) + ((this.f342907c.hashCode() + (Long.hashCode(this.f342906b) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shimmer(highlightColor=");
        H.z(this.f342906b, ", animationSpec=", sb2);
        sb2.append(this.f342907c);
        sb2.append(", progressForMaxAlpha=");
        return r.k(')', this.f342908d, sb2);
    }

    public l(long j12, C20278f0 c20278f0, float f12, C42822w c42822w) {
        this.f342906b = j12;
        this.f342907c = c20278f0;
        this.f342908d = f12;
    }
}
