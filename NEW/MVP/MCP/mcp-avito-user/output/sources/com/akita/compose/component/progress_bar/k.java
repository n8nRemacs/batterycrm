package com.akita.compose.component.progress_bar;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProgressBarStyle.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/akita/compose/component/progress_bar/k;", "", "Lcom/akita/compose/foundation/p;", "trackColor", "progressColor", "Landroidx/compose/ui/unit/h;", "height", "minEdgeWidth", "segmentSpacing", "cornerRadius", "<init>", "(Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;FFFFLkotlin/jvm/internal/w;)V", "progress-bar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f62403a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f62404b;

    /* renamed from: c, reason: collision with root package name */
    public final float f62405c;

    /* renamed from: d, reason: collision with root package name */
    public final float f62406d;

    /* renamed from: e, reason: collision with root package name */
    public final float f62407e;

    /* renamed from: f, reason: collision with root package name */
    public final float f62408f;

    public k(p pVar, p pVar2, float f12, float f13, float f14, float f15, C42822w c42822w) {
        this.f62403a = pVar;
        this.f62404b = pVar2;
        this.f62405c = f12;
        this.f62406d = f13;
        this.f62407e = f14;
        this.f62408f = f15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f62403a, kVar.f62403a) && L.f(this.f62404b, kVar.f62404b) && androidx.compose.ui.unit.h.b(this.f62405c, kVar.f62405c) && androidx.compose.ui.unit.h.b(this.f62406d, kVar.f62406d) && androidx.compose.ui.unit.h.b(this.f62407e, kVar.f62407e) && androidx.compose.ui.unit.h.b(this.f62408f, kVar.f62408f);
    }

    public final int hashCode() {
        int iB2 = s.b(this.f62404b, this.f62403a.hashCode() * 31, 31);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f62408f) + r.d(this.f62407e, r.d(this.f62406d, r.d(this.f62405c, iB2, 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarStyle(trackColor=");
        sb2.append(this.f62403a);
        sb2.append(", progressColor=");
        sb2.append(this.f62404b);
        sb2.append(", height=");
        H.u(this.f62405c, ", minEdgeWidth=", sb2);
        H.u(this.f62406d, ", segmentSpacing=", sb2);
        H.u(this.f62407e, ", cornerRadius=", sb2);
        return H.h(')', this.f62408f, sb2);
    }
}
