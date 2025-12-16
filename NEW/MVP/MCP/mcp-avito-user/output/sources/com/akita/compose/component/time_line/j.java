package com.akita.compose.component.time_line;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import com.akita.compose.foundation.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TimeLineStyle.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/akita/compose/component/time_line/j;", "", "Lcom/akita/compose/foundation/p;", "activeColor", "inactiveColor", "Lcom/akita/compose/foundation/r;", "activeTextStyle", "inactiveTextStyle", "Landroidx/compose/ui/unit/h;", "lineThickness", "lineCornerRadius", "nodesLineHeight", "nodeDotSize", "nodeToLineSpacing", "textToNodeSpacing", "<init>", "(Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/r;Lcom/akita/compose/foundation/r;FFFFFFLkotlin/jvm/internal/w;)V", "time-line_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f63150a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f63151b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final r f63152c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final r f63153d;

    /* renamed from: e, reason: collision with root package name */
    public final float f63154e;

    /* renamed from: f, reason: collision with root package name */
    public final float f63155f;

    /* renamed from: g, reason: collision with root package name */
    public final float f63156g;

    /* renamed from: h, reason: collision with root package name */
    public final float f63157h;

    /* renamed from: i, reason: collision with root package name */
    public final float f63158i;

    /* renamed from: j, reason: collision with root package name */
    public final float f63159j;

    public j(p pVar, p pVar2, r rVar, r rVar2, float f12, float f13, float f14, float f15, float f16, float f17, C42822w c42822w) {
        this.f63150a = pVar;
        this.f63151b = pVar2;
        this.f63152c = rVar;
        this.f63153d = rVar2;
        this.f63154e = f12;
        this.f63155f = f13;
        this.f63156g = f14;
        this.f63157h = f15;
        this.f63158i = f16;
        this.f63159j = f17;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f63150a, jVar.f63150a) && L.f(this.f63151b, jVar.f63151b) && L.f(this.f63152c, jVar.f63152c) && L.f(this.f63153d, jVar.f63153d) && androidx.compose.ui.unit.h.b(this.f63154e, jVar.f63154e) && androidx.compose.ui.unit.h.b(this.f63155f, jVar.f63155f) && androidx.compose.ui.unit.h.b(this.f63156g, jVar.f63156g) && androidx.compose.ui.unit.h.b(this.f63157h, jVar.f63157h) && androidx.compose.ui.unit.h.b(this.f63158i, jVar.f63158i) && androidx.compose.ui.unit.h.b(this.f63159j, jVar.f63159j);
    }

    public final int hashCode() {
        int iA2 = s.a(s.a(s.b(this.f63151b, this.f63150a.hashCode() * 31, 31), 31, this.f63152c), 31, this.f63153d);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f63159j) + androidx.appcompat.app.r.d(this.f63158i, androidx.appcompat.app.r.d(this.f63157h, androidx.appcompat.app.r.d(this.f63156g, androidx.appcompat.app.r.d(this.f63155f, androidx.appcompat.app.r.d(this.f63154e, iA2, 31), 31), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeLineStyle(activeColor=");
        sb2.append(this.f63150a);
        sb2.append(", inactiveColor=");
        sb2.append(this.f63151b);
        sb2.append(", activeTextStyle=");
        sb2.append(this.f63152c);
        sb2.append(", inactiveTextStyle=");
        sb2.append(this.f63153d);
        sb2.append(", lineThickness=");
        H.u(this.f63154e, ", lineCornerRadius=", sb2);
        H.u(this.f63155f, ", nodesLineHeight=", sb2);
        H.u(this.f63156g, ", nodeDotSize=", sb2);
        H.u(this.f63157h, ", nodeToLineSpacing=", sb2);
        H.u(this.f63158i, ", textToNodeSpacing=", sb2);
        return H.h(')', this.f63159j, sb2);
    }
}
