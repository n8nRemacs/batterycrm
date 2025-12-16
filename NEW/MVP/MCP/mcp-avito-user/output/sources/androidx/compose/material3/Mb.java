package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NavigationRail.kt */
@androidx.compose.runtime.F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/material3/Mb;", "", "Landroidx/compose/ui/graphics/T;", "selectedIconColor", "selectedTextColor", "selectedIndicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "<init>", "(JJJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Mb {

    /* renamed from: a, reason: collision with root package name */
    public final long f35125a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35126b;

    /* renamed from: c, reason: collision with root package name */
    public final long f35127c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35128d;

    /* renamed from: e, reason: collision with root package name */
    public final long f35129e;

    /* renamed from: f, reason: collision with root package name */
    public final long f35130f;

    /* renamed from: g, reason: collision with root package name */
    public final long f35131g;

    public Mb(long j12, long j13, long j14, long j15, long j16, long j17, long j18, C42822w c42822w) {
        this.f35125a = j12;
        this.f35126b = j13;
        this.f35127c = j14;
        this.f35128d = j15;
        this.f35129e = j16;
        this.f35130f = j17;
        this.f35131g = j18;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Mb)) {
            return false;
        }
        Mb mb2 = (Mb) obj;
        return androidx.compose.ui.graphics.T.d(this.f35125a, mb2.f35125a) && androidx.compose.ui.graphics.T.d(this.f35128d, mb2.f35128d) && androidx.compose.ui.graphics.T.d(this.f35126b, mb2.f35126b) && androidx.compose.ui.graphics.T.d(this.f35129e, mb2.f35129e) && androidx.compose.ui.graphics.T.d(this.f35127c, mb2.f35127c) && androidx.compose.ui.graphics.T.d(this.f35130f, mb2.f35130f) && androidx.compose.ui.graphics.T.d(this.f35131g, mb2.f35131g);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f35131g) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f35125a) * 31, 31, this.f35128d), 31, this.f35126b), 31, this.f35129e), 31, this.f35127c), 31, this.f35130f);
    }
}
