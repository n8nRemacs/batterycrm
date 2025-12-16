package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NavigationBar.kt */
@androidx.compose.runtime.F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/material3/Ha;", "", "Landroidx/compose/ui/graphics/T;", "selectedIconColor", "selectedTextColor", "selectedIndicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "<init>", "(JJJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Ha {

    /* renamed from: a, reason: collision with root package name */
    public final long f34839a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34840b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34841c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34842d;

    /* renamed from: e, reason: collision with root package name */
    public final long f34843e;

    /* renamed from: f, reason: collision with root package name */
    public final long f34844f;

    /* renamed from: g, reason: collision with root package name */
    public final long f34845g;

    public Ha(long j12, long j13, long j14, long j15, long j16, long j17, long j18, C42822w c42822w) {
        this.f34839a = j12;
        this.f34840b = j13;
        this.f34841c = j14;
        this.f34842d = j15;
        this.f34843e = j16;
        this.f34844f = j17;
        this.f34845g = j18;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Ha)) {
            return false;
        }
        Ha ha2 = (Ha) obj;
        return androidx.compose.ui.graphics.T.d(this.f34839a, ha2.f34839a) && androidx.compose.ui.graphics.T.d(this.f34842d, ha2.f34842d) && androidx.compose.ui.graphics.T.d(this.f34840b, ha2.f34840b) && androidx.compose.ui.graphics.T.d(this.f34843e, ha2.f34843e) && androidx.compose.ui.graphics.T.d(this.f34841c, ha2.f34841c) && androidx.compose.ui.graphics.T.d(this.f34844f, ha2.f34844f) && androidx.compose.ui.graphics.T.d(this.f34845g, ha2.f34845g);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f34845g) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f34839a) * 31, 31, this.f34842d), 31, this.f34840b), 31, this.f34843e), 31, this.f34841c), 31, this.f34844f);
    }
}
