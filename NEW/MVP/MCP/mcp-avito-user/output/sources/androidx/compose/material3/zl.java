package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppBar.kt */
@InterfaceC21537e7
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/material3/zl;", "", "Landroidx/compose/ui/graphics/T;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "<init>", "(JJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.F3
/* loaded from: classes.dex */
public final class zl {

    /* renamed from: a, reason: collision with root package name */
    public final long f37861a;

    /* renamed from: b, reason: collision with root package name */
    public final long f37862b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37863c;

    /* renamed from: d, reason: collision with root package name */
    public final long f37864d;

    /* renamed from: e, reason: collision with root package name */
    public final long f37865e;

    public zl(long j12, long j13, long j14, long j15, long j16, C42822w c42822w) {
        this.f37861a = j12;
        this.f37862b = j13;
        this.f37863c = j14;
        this.f37864d = j15;
        this.f37865e = j16;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zl)) {
            return false;
        }
        zl zlVar = (zl) obj;
        return androidx.compose.ui.graphics.T.d(this.f37861a, zlVar.f37861a) && androidx.compose.ui.graphics.T.d(this.f37862b, zlVar.f37862b) && androidx.compose.ui.graphics.T.d(this.f37863c, zlVar.f37863c) && androidx.compose.ui.graphics.T.d(this.f37864d, zlVar.f37864d) && androidx.compose.ui.graphics.T.d(this.f37865e, zlVar.f37865e);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f37865e) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f37861a) * 31, 31, this.f37862b), 31, this.f37863c), 31, this.f37864d);
    }
}
