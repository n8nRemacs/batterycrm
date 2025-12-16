package com.akita.compose.component.selector_card;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BorderStateSizes.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/akita/compose/component/selector_card/a;", "", "Landroidx/compose/ui/unit/h;", "default", "error", "selected", "<init>", "(FFFLkotlin/jvm/internal/w;)V", "selector-card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f62630a;

    /* renamed from: b, reason: collision with root package name */
    public final float f62631b;

    /* renamed from: c, reason: collision with root package name */
    public final float f62632c;

    public a(float f12, float f13, float f14, C42822w c42822w) {
        this.f62630a = f12;
        this.f62631b = f13;
        this.f62632c = f14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return androidx.compose.ui.unit.h.b(this.f62630a, aVar.f62630a) && androidx.compose.ui.unit.h.b(this.f62631b, aVar.f62631b) && androidx.compose.ui.unit.h.b(this.f62632c, aVar.f62632c);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f62632c) + r.d(this.f62631b, Float.hashCode(this.f62630a) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BorderStateSizes(default=");
        H.u(this.f62630a, ", error=", sb2);
        H.u(this.f62631b, ", selected=", sb2);
        return H.h(')', this.f62632c, sb2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(float f12, float f13, float f14, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f12 = androidx.compose.ui.unit.h.f42851e;
        }
        if ((i12 & 2) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f13 = androidx.compose.ui.unit.h.f42851e;
        }
        if ((i12 & 4) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f14 = androidx.compose.ui.unit.h.f42851e;
        }
        this(f12, f13, f14, null);
    }
}
