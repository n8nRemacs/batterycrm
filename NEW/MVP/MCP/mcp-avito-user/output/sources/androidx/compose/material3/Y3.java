package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DatePicker.kt */
@InterfaceC21537e7
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/Y3;", "", "Landroidx/compose/ui/graphics/T;", "containerColor", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContainerColor", "dayInSelectionRangeContentColor", "dividerColor", "Landroidx/compose/material3/vi;", "dateTextFieldColors", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/vi;Lkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f35861a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35862b;

    /* renamed from: c, reason: collision with root package name */
    public final long f35863c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35864d;

    /* renamed from: e, reason: collision with root package name */
    public final long f35865e;

    /* renamed from: f, reason: collision with root package name */
    public final long f35866f;

    /* renamed from: g, reason: collision with root package name */
    public final long f35867g;

    /* renamed from: h, reason: collision with root package name */
    public final long f35868h;

    /* renamed from: i, reason: collision with root package name */
    public final long f35869i;

    /* renamed from: j, reason: collision with root package name */
    public final long f35870j;

    /* renamed from: k, reason: collision with root package name */
    public final long f35871k;

    /* renamed from: l, reason: collision with root package name */
    public final long f35872l;

    /* renamed from: m, reason: collision with root package name */
    public final long f35873m;

    /* renamed from: n, reason: collision with root package name */
    public final long f35874n;

    /* renamed from: o, reason: collision with root package name */
    public final long f35875o;

    /* renamed from: p, reason: collision with root package name */
    public final long f35876p;

    /* renamed from: q, reason: collision with root package name */
    public final long f35877q;

    /* renamed from: r, reason: collision with root package name */
    public final long f35878r;

    /* renamed from: s, reason: collision with root package name */
    public final long f35879s;

    /* renamed from: t, reason: collision with root package name */
    public final long f35880t;

    /* renamed from: u, reason: collision with root package name */
    public final long f35881u;

    /* renamed from: v, reason: collision with root package name */
    public final long f35882v;

    /* renamed from: w, reason: collision with root package name */
    public final long f35883w;

    /* renamed from: x, reason: collision with root package name */
    public final long f35884x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final C21935vi f35885y;

    public Y3(long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, C21935vi c21935vi, C42822w c42822w) {
        this.f35861a = j12;
        this.f35862b = j13;
        this.f35863c = j14;
        this.f35864d = j15;
        this.f35865e = j16;
        this.f35866f = j17;
        this.f35867g = j18;
        this.f35868h = j19;
        this.f35869i = j22;
        this.f35870j = j23;
        this.f35871k = j24;
        this.f35872l = j25;
        this.f35873m = j26;
        this.f35874n = j27;
        this.f35875o = j28;
        this.f35876p = j29;
        this.f35877q = j32;
        this.f35878r = j33;
        this.f35879s = j34;
        this.f35880t = j35;
        this.f35881u = j36;
        this.f35882v = j37;
        this.f35883w = j38;
        this.f35884x = j39;
        this.f35885y = c21935vi;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (!(obj instanceof Y3)) {
            return false;
        }
        Y3 y32 = (Y3) obj;
        return androidx.compose.ui.graphics.T.d(this.f35861a, y32.f35861a) && androidx.compose.ui.graphics.T.d(this.f35862b, y32.f35862b) && androidx.compose.ui.graphics.T.d(this.f35863c, y32.f35863c) && androidx.compose.ui.graphics.T.d(this.f35864d, y32.f35864d) && androidx.compose.ui.graphics.T.d(this.f35865e, y32.f35865e) && androidx.compose.ui.graphics.T.d(this.f35867g, y32.f35867g) && androidx.compose.ui.graphics.T.d(this.f35868h, y32.f35868h) && androidx.compose.ui.graphics.T.d(this.f35869i, y32.f35869i) && androidx.compose.ui.graphics.T.d(this.f35870j, y32.f35870j) && androidx.compose.ui.graphics.T.d(this.f35871k, y32.f35871k) && androidx.compose.ui.graphics.T.d(this.f35872l, y32.f35872l) && androidx.compose.ui.graphics.T.d(this.f35873m, y32.f35873m) && androidx.compose.ui.graphics.T.d(this.f35874n, y32.f35874n) && androidx.compose.ui.graphics.T.d(this.f35875o, y32.f35875o) && androidx.compose.ui.graphics.T.d(this.f35876p, y32.f35876p) && androidx.compose.ui.graphics.T.d(this.f35877q, y32.f35877q) && androidx.compose.ui.graphics.T.d(this.f35878r, y32.f35878r) && androidx.compose.ui.graphics.T.d(this.f35879s, y32.f35879s) && androidx.compose.ui.graphics.T.d(this.f35880t, y32.f35880t) && androidx.compose.ui.graphics.T.d(this.f35881u, y32.f35881u) && androidx.compose.ui.graphics.T.d(this.f35882v, y32.f35882v) && androidx.compose.ui.graphics.T.d(this.f35883w, y32.f35883w);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f35883w) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f35861a) * 31, 31, this.f35862b), 31, this.f35863c), 31, this.f35864d), 31, this.f35865e), 31, this.f35867g), 31, this.f35868h), 31, this.f35869i), 31, this.f35870j), 31, this.f35871k), 31, this.f35872l), 31, this.f35873m), 31, this.f35874n), 31, this.f35875o), 31, this.f35876p), 31, this.f35877q), 31, this.f35878r), 31, this.f35879s), 31, this.f35880t), 31, this.f35881u), 31, this.f35882v);
    }
}
