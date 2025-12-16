package androidx.compose.material3;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Tooltip.kt */
@InterfaceC21537e7
@androidx.compose.runtime.F3
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/E2;", "", "Landroidx/compose/ui/unit/h;", "caretHeight", "caretWidth", "<init>", "(FFLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class E2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f34650a;

    /* renamed from: b, reason: collision with root package name */
    public final float f34651b;

    public E2(float f12, float f13, C42822w c42822w) {
        this.f34650a = f12;
        this.f34651b = f13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E2)) {
            return false;
        }
        E2 e22 = (E2) obj;
        return androidx.compose.ui.unit.h.b(this.f34650a, e22.f34650a) && androidx.compose.ui.unit.h.b(this.f34651b, e22.f34651b);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f34651b) + (Float.hashCode(this.f34650a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CaretProperties(caretHeight=");
        androidx.compose.foundation.H.u(this.f34650a, ", caretWidth=", sb2);
        return androidx.compose.foundation.H.h(')', this.f34651b, sb2);
    }
}
