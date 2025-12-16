package androidx.compose.material3;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TabRow.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material3/Jh;", "", "Landroidx/compose/ui/unit/h;", "left", "width", "contentWidth", "<init>", "(FFFLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Jh {

    /* renamed from: a, reason: collision with root package name */
    public final float f34964a;

    /* renamed from: b, reason: collision with root package name */
    public final float f34965b;

    /* renamed from: c, reason: collision with root package name */
    public final float f34966c;

    public Jh(float f12, float f13, float f14, C42822w c42822w) {
        this.f34964a = f12;
        this.f34965b = f13;
        this.f34966c = f14;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jh)) {
            return false;
        }
        Jh jh2 = (Jh) obj;
        return androidx.compose.ui.unit.h.b(this.f34964a, jh2.f34964a) && androidx.compose.ui.unit.h.b(this.f34965b, jh2.f34965b) && androidx.compose.ui.unit.h.b(this.f34966c, jh2.f34966c);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f34966c) + androidx.appcompat.app.r.d(this.f34965b, Float.hashCode(this.f34964a) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabPosition(left=");
        float f12 = this.f34964a;
        androidx.compose.foundation.H.u(f12, ", right=", sb2);
        float f13 = this.f34965b;
        sb2.append((Object) androidx.compose.ui.unit.h.c(f12 + f13));
        sb2.append(", width=");
        sb2.append((Object) androidx.compose.ui.unit.h.c(f13));
        sb2.append(", contentWidth=");
        return androidx.compose.foundation.H.h(')', this.f34966c, sb2);
    }
}
