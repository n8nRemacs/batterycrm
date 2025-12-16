package androidx.compose.material;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Ripple.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material/z7;", "", "Landroidx/compose/ui/graphics/T;", "color", "Landroidx/compose/material/ripple/l;", "rippleAlpha", "<init>", "(JLandroidx/compose/material/ripple/l;Lkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.z7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21432z7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f34438a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.material.ripple.l f34439b;

    public C21432z7(long j12, androidx.compose.material.ripple.l lVar, C42822w c42822w) {
        this.f34438a = j12;
        this.f34439b = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21432z7)) {
            return false;
        }
        C21432z7 c21432z7 = (C21432z7) obj;
        return androidx.compose.ui.graphics.T.d(this.f34438a, c21432z7.f34438a) && kotlin.jvm.internal.L.f(this.f34439b, c21432z7.f34439b);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        int iHashCode = Long.hashCode(this.f34438a) * 31;
        androidx.compose.material.ripple.l lVar = this.f34439b;
        return iHashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleConfiguration(color=");
        androidx.compose.foundation.H.z(this.f34438a, ", rippleAlpha=", sb2);
        sb2.append(this.f34439b);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21432z7(long j12, androidx.compose.material.ripple.l lVar, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            androidx.compose.ui.graphics.T.f39320b.getClass();
            j12 = androidx.compose.ui.graphics.T.f39330l;
        }
        this(j12, (i12 & 2) != 0 ? null : lVar, null);
    }
}
