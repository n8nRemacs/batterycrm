package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Slider.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/material3/Te;", "", "Landroidx/compose/ui/graphics/T;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "<init>", "(JJJJJJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Te {

    /* renamed from: a, reason: collision with root package name */
    public final long f35486a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35487b;

    /* renamed from: c, reason: collision with root package name */
    public final long f35488c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35489d;

    /* renamed from: e, reason: collision with root package name */
    public final long f35490e;

    /* renamed from: f, reason: collision with root package name */
    public final long f35491f;

    /* renamed from: g, reason: collision with root package name */
    public final long f35492g;

    /* renamed from: h, reason: collision with root package name */
    public final long f35493h;

    /* renamed from: i, reason: collision with root package name */
    public final long f35494i;

    /* renamed from: j, reason: collision with root package name */
    public final long f35495j;

    public Te(long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j22, long j23, C42822w c42822w) {
        this.f35486a = j12;
        this.f35487b = j13;
        this.f35488c = j14;
        this.f35489d = j15;
        this.f35490e = j16;
        this.f35491f = j17;
        this.f35492g = j18;
        this.f35493h = j19;
        this.f35494i = j22;
        this.f35495j = j23;
    }

    @androidx.compose.runtime.F3
    public final long a(boolean z12, boolean z13) {
        return z12 ? z13 ? this.f35488c : this.f35490e : z13 ? this.f35493h : this.f35495j;
    }

    @androidx.compose.runtime.F3
    public final long b(boolean z12, boolean z13) {
        return z12 ? z13 ? this.f35487b : this.f35489d : z13 ? this.f35492g : this.f35494i;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Te)) {
            return false;
        }
        Te te2 = (Te) obj;
        return androidx.compose.ui.graphics.T.d(this.f35486a, te2.f35486a) && androidx.compose.ui.graphics.T.d(this.f35487b, te2.f35487b) && androidx.compose.ui.graphics.T.d(this.f35488c, te2.f35488c) && androidx.compose.ui.graphics.T.d(this.f35489d, te2.f35489d) && androidx.compose.ui.graphics.T.d(this.f35490e, te2.f35490e) && androidx.compose.ui.graphics.T.d(this.f35491f, te2.f35491f) && androidx.compose.ui.graphics.T.d(this.f35492g, te2.f35492g) && androidx.compose.ui.graphics.T.d(this.f35493h, te2.f35493h) && androidx.compose.ui.graphics.T.d(this.f35494i, te2.f35494i) && androidx.compose.ui.graphics.T.d(this.f35495j, te2.f35495j);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f35495j) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f35486a) * 31, 31, this.f35487b), 31, this.f35488c), 31, this.f35489d), 31, this.f35490e), 31, this.f35491f), 31, this.f35492g), 31, this.f35493h), 31, this.f35494i);
    }
}
