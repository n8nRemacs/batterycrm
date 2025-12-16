package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RadioButton.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/material3/Xc;", "", "Landroidx/compose/ui/graphics/T;", "selectedColor", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "<init>", "(JJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Xc {

    /* renamed from: a, reason: collision with root package name */
    public final long f35836a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35837b;

    /* renamed from: c, reason: collision with root package name */
    public final long f35838c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35839d;

    public Xc(long j12, long j13, long j14, long j15, C42822w c42822w) {
        this.f35836a = j12;
        this.f35837b = j13;
        this.f35838c = j14;
        this.f35839d = j15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Xc)) {
            return false;
        }
        Xc xc2 = (Xc) obj;
        return androidx.compose.ui.graphics.T.d(this.f35836a, xc2.f35836a) && androidx.compose.ui.graphics.T.d(this.f35837b, xc2.f35837b) && androidx.compose.ui.graphics.T.d(this.f35838c, xc2.f35838c) && androidx.compose.ui.graphics.T.d(this.f35839d, xc2.f35839d);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f35839d) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f35836a) * 31, 31, this.f35837b), 31, this.f35838c);
    }
}
