package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import androidx.compose.ui.graphics.T;
import j.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.w0;

/* compiled from: ContextMenuUi.android.kt */
@F3
@k0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/contextmenu/g;", "", "Landroidx/compose/ui/graphics/T;", "backgroundColor", "textColor", "iconColor", "disabledTextColor", "disabledIconColor", "<init>", "(JJJJJLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f27023a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27024b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27025c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27026d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27027e;

    public g(long j12, long j13, long j14, long j15, long j16, C42822w c42822w) {
        this.f27023a = j12;
        this.f27024b = j13;
        this.f27025c = j14;
        this.f27026d = j15;
        this.f27027e = j16;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return T.d(this.f27023a, gVar.f27023a) && T.d(this.f27024b, gVar.f27024b) && T.d(this.f27025c, gVar.f27025c) && T.d(this.f27026d, gVar.f27026d) && T.d(this.f27027e, gVar.f27027e);
    }

    public final int hashCode() {
        T.a aVar = T.f39320b;
        int i12 = w0.f410662c;
        return Long.hashCode(this.f27027e) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f27023a) * 31, 31, this.f27024b), 31, this.f27025c), 31, this.f27026d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContextMenuColors(backgroundColor=");
        H.z(this.f27023a, ", textColor=", sb2);
        H.z(this.f27024b, ", iconColor=", sb2);
        H.z(this.f27025c, ", disabledTextColor=", sb2);
        H.z(this.f27026d, ", disabledIconColor=", sb2);
        sb2.append((Object) T.j(this.f27027e));
        sb2.append(')');
        return sb2.toString();
    }
}
