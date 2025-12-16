package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Chip.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/ye;", "", "Landroidx/compose/ui/graphics/T;", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "<init>", "(JJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21997ye {

    /* renamed from: a, reason: collision with root package name */
    public final long f37773a;

    /* renamed from: b, reason: collision with root package name */
    public final long f37774b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37775c;

    /* renamed from: d, reason: collision with root package name */
    public final long f37776d;

    /* renamed from: e, reason: collision with root package name */
    public final long f37777e;

    /* renamed from: f, reason: collision with root package name */
    public final long f37778f;

    /* renamed from: g, reason: collision with root package name */
    public final long f37779g;

    /* renamed from: h, reason: collision with root package name */
    public final long f37780h;

    /* renamed from: i, reason: collision with root package name */
    public final long f37781i;

    /* renamed from: j, reason: collision with root package name */
    public final long f37782j;

    /* renamed from: k, reason: collision with root package name */
    public final long f37783k;

    /* renamed from: l, reason: collision with root package name */
    public final long f37784l;

    /* renamed from: m, reason: collision with root package name */
    public final long f37785m;

    public C21997ye(long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j22, long j23, long j24, long j25, long j26, C42822w c42822w) {
        this.f37773a = j12;
        this.f37774b = j13;
        this.f37775c = j14;
        this.f37776d = j15;
        this.f37777e = j16;
        this.f37778f = j17;
        this.f37779g = j18;
        this.f37780h = j19;
        this.f37781i = j22;
        this.f37782j = j23;
        this.f37783k = j24;
        this.f37784l = j25;
        this.f37785m = j26;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C21997ye)) {
            return false;
        }
        C21997ye c21997ye = (C21997ye) obj;
        return androidx.compose.ui.graphics.T.d(this.f37773a, c21997ye.f37773a) && androidx.compose.ui.graphics.T.d(this.f37774b, c21997ye.f37774b) && androidx.compose.ui.graphics.T.d(this.f37775c, c21997ye.f37775c) && androidx.compose.ui.graphics.T.d(this.f37776d, c21997ye.f37776d) && androidx.compose.ui.graphics.T.d(this.f37777e, c21997ye.f37777e) && androidx.compose.ui.graphics.T.d(this.f37778f, c21997ye.f37778f) && androidx.compose.ui.graphics.T.d(this.f37779g, c21997ye.f37779g) && androidx.compose.ui.graphics.T.d(this.f37780h, c21997ye.f37780h) && androidx.compose.ui.graphics.T.d(this.f37781i, c21997ye.f37781i) && androidx.compose.ui.graphics.T.d(this.f37782j, c21997ye.f37782j) && androidx.compose.ui.graphics.T.d(this.f37783k, c21997ye.f37783k) && androidx.compose.ui.graphics.T.d(this.f37784l, c21997ye.f37784l) && androidx.compose.ui.graphics.T.d(this.f37785m, c21997ye.f37785m);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f37785m) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f37773a) * 31, 31, this.f37774b), 31, this.f37775c), 31, this.f37776d), 31, this.f37777e), 31, this.f37778f), 31, this.f37779g), 31, this.f37780h), 31, this.f37781i), 31, this.f37782j), 31, this.f37783k), 31, this.f37784l);
    }
}
