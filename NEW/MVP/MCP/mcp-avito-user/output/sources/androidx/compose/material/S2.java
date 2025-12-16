package androidx.compose.material;

import androidx.compose.animation.core.C20310q;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExposedDropdownMenu.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/S2;", "Landroidx/compose/material/ob;", "Landroidx/compose/ui/graphics/T;", "textColor", "disabledTextColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "errorIndicatorColor", "disabledIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "backgroundColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "", "focused", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class S2 implements InterfaceC21291ob {

    /* renamed from: a, reason: collision with root package name */
    public final long f33144a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33145b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33146c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33147d;

    /* renamed from: e, reason: collision with root package name */
    public final long f33148e;

    /* renamed from: f, reason: collision with root package name */
    public final long f33149f;

    /* renamed from: g, reason: collision with root package name */
    public final long f33150g;

    /* renamed from: h, reason: collision with root package name */
    public final long f33151h;

    /* renamed from: i, reason: collision with root package name */
    public final long f33152i;

    /* renamed from: j, reason: collision with root package name */
    public final long f33153j;

    /* renamed from: k, reason: collision with root package name */
    public final long f33154k;

    /* renamed from: l, reason: collision with root package name */
    public final long f33155l;

    /* renamed from: m, reason: collision with root package name */
    public final long f33156m;

    /* renamed from: n, reason: collision with root package name */
    public final long f33157n;

    /* renamed from: o, reason: collision with root package name */
    public final long f33158o;

    /* renamed from: p, reason: collision with root package name */
    public final long f33159p;

    /* renamed from: q, reason: collision with root package name */
    public final long f33160q;

    /* renamed from: r, reason: collision with root package name */
    public final long f33161r;

    /* renamed from: s, reason: collision with root package name */
    public final long f33162s;

    /* renamed from: t, reason: collision with root package name */
    public final long f33163t;

    /* renamed from: u, reason: collision with root package name */
    public final long f33164u;

    /* renamed from: v, reason: collision with root package name */
    public final long f33165v;

    public S2(long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j32, long j33, long j34, long j35, long j36, long j37, C42822w c42822w) {
        this.f33144a = j12;
        this.f33145b = j13;
        this.f33146c = j14;
        this.f33147d = j15;
        this.f33148e = j16;
        this.f33149f = j17;
        this.f33150g = j18;
        this.f33151h = j19;
        this.f33152i = j22;
        this.f33153j = j23;
        this.f33154k = j24;
        this.f33155l = j25;
        this.f33156m = j26;
        this.f33157n = j27;
        this.f33158o = j28;
        this.f33159p = j29;
        this.f33160q = j32;
        this.f33161r = j33;
        this.f33162s = j34;
        this.f33163t = j35;
        this.f33164u = j36;
        this.f33165v = j37;
    }

    @Override // androidx.compose.material.InterfaceC21291ob
    @InterfaceC22132o
    @Y61.k
    /* renamed from: a */
    public final InterfaceC22204y1 mo2a(boolean z12, boolean z13, @Y61.l androidx.compose.runtime.A a12) {
        a12.C(-776179197);
        return androidx.compose.foundation.H.g(!z12 ? this.f33153j : z13 ? this.f33154k : this.f33152i, a12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material.InterfaceC21291ob
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 b(boolean z12, boolean z13, @Y61.k androidx.compose.foundation.interaction.k kVar, @Y61.l androidx.compose.runtime.A a12) {
        a12.C(-1749156593);
        return androidx.compose.foundation.H.g(!z12 ? this.f33162s : z13 ? this.f33163t : ((Boolean) androidx.compose.foundation.interaction.f.a(kVar, a12, 0).getF42167b()).booleanValue() ? this.f33160q : this.f33161r, a12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material.InterfaceC21291ob
    @InterfaceC22132o
    @Y61.k
    public final androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> c(boolean z12, boolean z13, @Y61.k androidx.compose.foundation.interaction.k kVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> i3M;
        a12.C(476110356);
        long j12 = !z12 ? this.f33151h : z13 ? this.f33150g : ((Boolean) androidx.compose.foundation.interaction.f.a(kVar, a12, (i12 >> 6) & 14).getF42167b()).booleanValue() ? this.f33148e : this.f33149f;
        if (z12) {
            a12.C(-889472281);
            i3M = androidx.compose.animation.l2.b(j12, C20310q.e(150, 0, null, 6), a12, 48, 12);
            a12.h();
        } else {
            a12.C(-889369423);
            i3M = C22126m3.m(androidx.compose.ui.graphics.T.a(j12), a12);
            a12.h();
        }
        a12.h();
        return i3M;
    }

    @Override // androidx.compose.material.InterfaceC21291ob
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 d(boolean z12, @Y61.l androidx.compose.runtime.A a12) {
        a12.C(1742462291);
        return androidx.compose.foundation.H.g(z12 ? this.f33164u : this.f33165v, a12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material.InterfaceC21291ob
    @InterfaceC22132o
    @Y61.k
    public final androidx.compose.runtime.I3 e(boolean z12, boolean z13, @Y61.k androidx.compose.foundation.interaction.k kVar, @Y61.l androidx.compose.runtime.A a12) {
        a12.C(79259602);
        return androidx.compose.foundation.H.g(!z12 ? this.f33157n : z13 ? this.f33158o : ((Boolean) androidx.compose.foundation.interaction.f.a(kVar, a12, 0).getF42167b()).booleanValue() ? this.f33156m : this.f33155l, a12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S2.class != obj.getClass()) {
            return false;
        }
        S2 s22 = (S2) obj;
        return androidx.compose.ui.graphics.T.d(this.f33144a, s22.f33144a) && androidx.compose.ui.graphics.T.d(this.f33145b, s22.f33145b) && androidx.compose.ui.graphics.T.d(this.f33146c, s22.f33146c) && androidx.compose.ui.graphics.T.d(this.f33147d, s22.f33147d) && androidx.compose.ui.graphics.T.d(this.f33148e, s22.f33148e) && androidx.compose.ui.graphics.T.d(this.f33149f, s22.f33149f) && androidx.compose.ui.graphics.T.d(this.f33150g, s22.f33150g) && androidx.compose.ui.graphics.T.d(this.f33151h, s22.f33151h) && androidx.compose.ui.graphics.T.d(this.f33152i, s22.f33152i) && androidx.compose.ui.graphics.T.d(this.f33153j, s22.f33153j) && androidx.compose.ui.graphics.T.d(this.f33154k, s22.f33154k) && androidx.compose.ui.graphics.T.d(this.f33155l, s22.f33155l) && androidx.compose.ui.graphics.T.d(this.f33156m, s22.f33156m) && androidx.compose.ui.graphics.T.d(this.f33157n, s22.f33157n) && androidx.compose.ui.graphics.T.d(this.f33158o, s22.f33158o) && androidx.compose.ui.graphics.T.d(this.f33159p, s22.f33159p) && androidx.compose.ui.graphics.T.d(this.f33160q, s22.f33160q) && androidx.compose.ui.graphics.T.d(this.f33161r, s22.f33161r) && androidx.compose.ui.graphics.T.d(this.f33162s, s22.f33162s) && androidx.compose.ui.graphics.T.d(this.f33163t, s22.f33163t) && androidx.compose.ui.graphics.T.d(this.f33164u, s22.f33164u) && androidx.compose.ui.graphics.T.d(this.f33165v, s22.f33165v);
    }

    @Override // androidx.compose.material.InterfaceC21291ob
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 f(@Y61.l androidx.compose.runtime.A a12) {
        a12.C(-28962788);
        return androidx.compose.foundation.H.g(this.f33159p, a12);
    }

    @Override // androidx.compose.material.InterfaceC21291ob
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 g(boolean z12, boolean z13, @Y61.l androidx.compose.runtime.A a12) {
        a12.C(1665901393);
        return androidx.compose.foundation.H.g(!z12 ? this.f33157n : z13 ? this.f33158o : this.f33155l, a12);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f33165v) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f33144a) * 31, 31, this.f33145b), 31, this.f33146c), 31, this.f33147d), 31, this.f33148e), 31, this.f33149f), 31, this.f33150g), 31, this.f33151h), 31, this.f33152i), 31, this.f33153j), 31, this.f33154k), 31, this.f33155l), 31, this.f33156m), 31, this.f33157n), 31, this.f33158o), 31, this.f33159p), 31, this.f33160q), 31, this.f33161r), 31, this.f33162s), 31, this.f33163t), 31, this.f33164u);
    }
}
