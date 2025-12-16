package androidx.compose.material;

import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Slider.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/P2;", "Landroidx/compose/material/g8;", "Landroidx/compose/ui/graphics/T;", "thumbColor", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "<init>", "(JJJJJJJJJJLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class P2 implements InterfaceC21184g8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f33035a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33036b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33037c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33038d;

    /* renamed from: e, reason: collision with root package name */
    public final long f33039e;

    /* renamed from: f, reason: collision with root package name */
    public final long f33040f;

    /* renamed from: g, reason: collision with root package name */
    public final long f33041g;

    /* renamed from: h, reason: collision with root package name */
    public final long f33042h;

    /* renamed from: i, reason: collision with root package name */
    public final long f33043i;

    /* renamed from: j, reason: collision with root package name */
    public final long f33044j;

    public P2(long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j22, long j23, C42822w c42822w) {
        this.f33035a = j12;
        this.f33036b = j13;
        this.f33037c = j14;
        this.f33038d = j15;
        this.f33039e = j16;
        this.f33040f = j17;
        this.f33041g = j18;
        this.f33042h = j19;
        this.f33043i = j22;
        this.f33044j = j23;
    }

    @Override // androidx.compose.material.InterfaceC21184g8
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 a(boolean z12, boolean z13, @Y61.l androidx.compose.runtime.A a12) {
        a12.C(1575395620);
        return androidx.compose.foundation.H.g(z12 ? z13 ? this.f33037c : this.f33038d : z13 ? this.f33039e : this.f33040f, a12);
    }

    @Override // androidx.compose.material.InterfaceC21184g8
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 b(boolean z12, boolean z13, @Y61.l androidx.compose.runtime.A a12) {
        a12.C(-1491563694);
        return androidx.compose.foundation.H.g(z12 ? z13 ? this.f33041g : this.f33042h : z13 ? this.f33043i : this.f33044j, a12);
    }

    @Override // androidx.compose.material.InterfaceC21184g8
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 c(boolean z12, @Y61.l androidx.compose.runtime.A a12) {
        a12.C(-1733795637);
        return androidx.compose.foundation.H.g(z12 ? this.f33035a : this.f33036b, a12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P2.class != obj.getClass()) {
            return false;
        }
        P2 p22 = (P2) obj;
        return androidx.compose.ui.graphics.T.d(this.f33035a, p22.f33035a) && androidx.compose.ui.graphics.T.d(this.f33036b, p22.f33036b) && androidx.compose.ui.graphics.T.d(this.f33037c, p22.f33037c) && androidx.compose.ui.graphics.T.d(this.f33038d, p22.f33038d) && androidx.compose.ui.graphics.T.d(this.f33039e, p22.f33039e) && androidx.compose.ui.graphics.T.d(this.f33040f, p22.f33040f) && androidx.compose.ui.graphics.T.d(this.f33041g, p22.f33041g) && androidx.compose.ui.graphics.T.d(this.f33042h, p22.f33042h) && androidx.compose.ui.graphics.T.d(this.f33043i, p22.f33043i) && androidx.compose.ui.graphics.T.d(this.f33044j, p22.f33044j);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f33044j) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f33035a) * 31, 31, this.f33036b), 31, this.f33037c), 31, this.f33038d), 31, this.f33039e), 31, this.f33040f), 31, this.f33041g), 31, this.f33042h), 31, this.f33043i);
    }
}
