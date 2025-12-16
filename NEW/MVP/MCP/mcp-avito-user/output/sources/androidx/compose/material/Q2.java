package androidx.compose.material;

import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Switch.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/material/Q2;", "Landroidx/compose/material/sa;", "Landroidx/compose/ui/graphics/T;", "checkedThumbColor", "checkedTrackColor", "uncheckedThumbColor", "uncheckedTrackColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Q2 implements InterfaceC21344sa {

    /* renamed from: a, reason: collision with root package name */
    public final long f33068a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33069b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33070c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33071d;

    /* renamed from: e, reason: collision with root package name */
    public final long f33072e;

    /* renamed from: f, reason: collision with root package name */
    public final long f33073f;

    /* renamed from: g, reason: collision with root package name */
    public final long f33074g;

    /* renamed from: h, reason: collision with root package name */
    public final long f33075h;

    public Q2(long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, C42822w c42822w) {
        this.f33068a = j12;
        this.f33069b = j13;
        this.f33070c = j14;
        this.f33071d = j15;
        this.f33072e = j16;
        this.f33073f = j17;
        this.f33074g = j18;
        this.f33075h = j19;
    }

    @Override // androidx.compose.material.InterfaceC21344sa
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 a(boolean z12, boolean z13, @Y61.l androidx.compose.runtime.A a12) {
        a12.C(-1176343362);
        return androidx.compose.foundation.H.g(z12 ? z13 ? this.f33069b : this.f33071d : z13 ? this.f33073f : this.f33075h, a12);
    }

    @Override // androidx.compose.material.InterfaceC21344sa
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 b(boolean z12, boolean z13, @Y61.l androidx.compose.runtime.A a12) {
        a12.C(-66424183);
        return androidx.compose.foundation.H.g(z12 ? z13 ? this.f33068a : this.f33070c : z13 ? this.f33072e : this.f33074g, a12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q2.class != obj.getClass()) {
            return false;
        }
        Q2 q22 = (Q2) obj;
        return androidx.compose.ui.graphics.T.d(this.f33068a, q22.f33068a) && androidx.compose.ui.graphics.T.d(this.f33069b, q22.f33069b) && androidx.compose.ui.graphics.T.d(this.f33070c, q22.f33070c) && androidx.compose.ui.graphics.T.d(this.f33071d, q22.f33071d) && androidx.compose.ui.graphics.T.d(this.f33072e, q22.f33072e) && androidx.compose.ui.graphics.T.d(this.f33073f, q22.f33073f) && androidx.compose.ui.graphics.T.d(this.f33074g, q22.f33074g) && androidx.compose.ui.graphics.T.d(this.f33075h, q22.f33075h);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f33075h) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f33068a) * 31, 31, this.f33069b), 31, this.f33070c), 31, this.f33071d), 31, this.f33072e), 31, this.f33073f), 31, this.f33074g);
    }
}
