package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import androidx.compose.ui.unit.h;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Chip.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/material3/N2;", "", "Landroidx/compose/ui/graphics/T;", "borderColor", "disabledBorderColor", "Landroidx/compose/ui/unit/h;", "borderWidth", "<init>", "(JJFLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes.dex */
public final class N2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f35164a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35165b;

    /* renamed from: c, reason: collision with root package name */
    public final float f35166c;

    public N2(long j12, long j13, float f12, C42822w c42822w) {
        this.f35164a = j12;
        this.f35165b = j13;
        this.f35166c = f12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof N2)) {
            return false;
        }
        N2 n22 = (N2) obj;
        return androidx.compose.ui.graphics.T.d(this.f35164a, n22.f35164a) && androidx.compose.ui.graphics.T.d(this.f35165b, n22.f35165b) && androidx.compose.ui.unit.h.b(this.f35166c, n22.f35166c);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        int iG2 = androidx.appcompat.app.r.g(Long.hashCode(this.f35164a) * 31, 31, this.f35165b);
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f35166c) + iG2;
    }
}
