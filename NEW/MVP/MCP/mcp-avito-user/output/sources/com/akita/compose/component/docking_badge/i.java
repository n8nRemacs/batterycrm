package com.akita.compose.component.docking_badge;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import com.akita.compose.foundation.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DockingBadgeStyle.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/akita/compose/component/docking_badge/i;", "", "Lcom/akita/compose/foundation/r;", "textStyle", "Lcom/akita/compose/foundation/p;", "backgroundColor", "Landroidx/compose/ui/unit/h;", "height", "textVerticalOffset", "<init>", "(Lcom/akita/compose/foundation/r;Lcom/akita/compose/foundation/p;FFLkotlin/jvm/internal/w;)V", "docking-badge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f61542a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f61543b;

    /* renamed from: c, reason: collision with root package name */
    public final float f61544c;

    /* renamed from: d, reason: collision with root package name */
    public final float f61545d;

    public i(r rVar, p pVar, float f12, float f13, C42822w c42822w) {
        this.f61542a = rVar;
        this.f61543b = pVar;
        this.f61544c = f12;
        this.f61545d = f13;
    }

    public static i a(i iVar, p pVar) {
        r rVar = iVar.f61542a;
        float f12 = iVar.f61544c;
        float f13 = iVar.f61545d;
        iVar.getClass();
        return new i(rVar, pVar, f12, f13, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f61542a, iVar.f61542a) && L.f(this.f61543b, iVar.f61543b) && androidx.compose.ui.unit.h.b(this.f61544c, iVar.f61544c) && androidx.compose.ui.unit.h.b(this.f61545d, iVar.f61545d);
    }

    public final int hashCode() {
        int iB2 = s.b(this.f61543b, this.f61542a.hashCode() * 31, 31);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f61545d) + androidx.appcompat.app.r.d(this.f61544c, iB2, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DockingBadgeStyle(textStyle=");
        sb2.append(this.f61542a);
        sb2.append(", backgroundColor=");
        sb2.append(this.f61543b);
        sb2.append(", height=");
        H.u(this.f61544c, ", textVerticalOffset=", sb2);
        return H.h(')', this.f61545d, sb2);
    }
}
