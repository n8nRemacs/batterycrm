package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NavigationDrawer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/material3/B6;", "Landroidx/compose/material3/ab;", "Landroidx/compose/ui/graphics/T;", "selectedIconColor", "unselectedIconColor", "selectedTextColor", "unselectedTextColor", "selectedContainerColor", "unselectedContainerColor", "selectedBadgeColor", "unselectedBadgeColor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class B6 implements InterfaceC21449ab {

    /* renamed from: a, reason: collision with root package name */
    public final long f34541a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34542b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34543c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34544d;

    /* renamed from: e, reason: collision with root package name */
    public final long f34545e;

    /* renamed from: f, reason: collision with root package name */
    public final long f34546f;

    /* renamed from: g, reason: collision with root package name */
    public final long f34547g;

    /* renamed from: h, reason: collision with root package name */
    public final long f34548h;

    public B6(long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, C42822w c42822w) {
        this.f34541a = j12;
        this.f34542b = j13;
        this.f34543c = j14;
        this.f34544d = j15;
        this.f34545e = j16;
        this.f34546f = j17;
        this.f34547g = j18;
        this.f34548h = j19;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B6)) {
            return false;
        }
        B6 b62 = (B6) obj;
        if (androidx.compose.ui.graphics.T.d(this.f34541a, b62.f34541a) && androidx.compose.ui.graphics.T.d(this.f34542b, b62.f34542b) && androidx.compose.ui.graphics.T.d(this.f34543c, b62.f34543c) && androidx.compose.ui.graphics.T.d(this.f34544d, b62.f34544d) && androidx.compose.ui.graphics.T.d(this.f34545e, b62.f34545e) && androidx.compose.ui.graphics.T.d(this.f34546f, b62.f34546f) && androidx.compose.ui.graphics.T.d(this.f34547g, b62.f34547g)) {
            return androidx.compose.ui.graphics.T.d(this.f34548h, b62.f34548h);
        }
        return false;
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f34548h) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f34541a) * 31, 31, this.f34542b), 31, this.f34543c), 31, this.f34544d), 31, this.f34545e), 31, this.f34546f), 31, this.f34547g);
    }
}
