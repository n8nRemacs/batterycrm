package androidx.compose.foundation;

import androidx.compose.runtime.F3;
import androidx.compose.ui.graphics.T;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OverscrollConfiguration.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/K1;", "", "Landroidx/compose/ui/graphics/T;", "glowColor", "Landroidx/compose/foundation/layout/T1;", "drawPadding", "<init>", "(JLandroidx/compose/foundation/layout/T1;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
@W0
@F3
/* loaded from: classes.dex */
public final class K1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26751a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.layout.T1 f26752b;

    public K1(long j12, androidx.compose.foundation.layout.T1 t12, C42822w c42822w) {
        this.f26751a = j12;
        this.f26752b = t12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!K1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        K1 k12 = (K1) obj;
        return androidx.compose.ui.graphics.T.d(this.f26751a, k12.f26751a) && kotlin.jvm.internal.L.f(this.f26752b, k12.f26752b);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return this.f26752b.hashCode() + (Long.hashCode(this.f26751a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        H.z(this.f26751a, ", drawPadding=", sb2);
        sb2.append(this.f26752b);
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ K1(long j12, androidx.compose.foundation.layout.T1 t12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? androidx.compose.ui.graphics.V.d(4284900966L) : j12, (i12 & 2) != 0 ? androidx.compose.foundation.layout.R1.c(0.0f, 0.0f, 3) : t12, null);
    }
}
