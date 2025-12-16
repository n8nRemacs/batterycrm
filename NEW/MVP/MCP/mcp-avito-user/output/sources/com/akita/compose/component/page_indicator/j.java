package com.akita.compose.component.page_indicator;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.l;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PageIndicatorStyle.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/akita/compose/component/page_indicator/j;", "", "Lcom/akita/compose/foundation/p;", "backgroundColor", "Landroidx/compose/ui/unit/h;", "cornerRadius", "dotsSpacing", "Landroidx/compose/foundation/layout/T1;", "contentPadding", "visitedDotsColor", "activeDotColor", "inactiveDotColor", "inactiveDotSize", "secondaryDotSize", "tertiaryDotSize", "Landroidx/compose/ui/unit/l;", "activeDotSize", "<init>", "(Lcom/akita/compose/foundation/p;FFLandroidx/compose/foundation/layout/T1;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;FFFJLkotlin/jvm/internal/w;)V", "page-indicator_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f62354a;

    /* renamed from: b, reason: collision with root package name */
    public final float f62355b;

    /* renamed from: c, reason: collision with root package name */
    public final float f62356c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final T1 f62357d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final p f62358e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final p f62359f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final p f62360g;

    /* renamed from: h, reason: collision with root package name */
    public final float f62361h;

    /* renamed from: i, reason: collision with root package name */
    public final float f62362i;

    /* renamed from: j, reason: collision with root package name */
    public final float f62363j;

    /* renamed from: k, reason: collision with root package name */
    public final long f62364k;

    public j(p pVar, float f12, float f13, T1 t12, p pVar2, p pVar3, p pVar4, float f14, float f15, float f16, long j12, C42822w c42822w) {
        this.f62354a = pVar;
        this.f62355b = f12;
        this.f62356c = f13;
        this.f62357d = t12;
        this.f62358e = pVar2;
        this.f62359f = pVar3;
        this.f62360g = pVar4;
        this.f62361h = f14;
        this.f62362i = f15;
        this.f62363j = f16;
        this.f62364k = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f62354a, jVar.f62354a) && androidx.compose.ui.unit.h.b(this.f62355b, jVar.f62355b) && androidx.compose.ui.unit.h.b(this.f62356c, jVar.f62356c) && L.f(this.f62357d, jVar.f62357d) && L.f(this.f62358e, jVar.f62358e) && L.f(this.f62359f, jVar.f62359f) && L.f(this.f62360g, jVar.f62360g) && androidx.compose.ui.unit.h.b(this.f62361h, jVar.f62361h) && androidx.compose.ui.unit.h.b(this.f62362i, jVar.f62362i) && androidx.compose.ui.unit.h.b(this.f62363j, jVar.f62363j) && androidx.compose.ui.unit.l.b(this.f62364k, jVar.f62364k);
    }

    public final int hashCode() {
        int iHashCode = this.f62354a.hashCode() * 31;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        int iD2 = r.d(this.f62363j, r.d(this.f62362i, r.d(this.f62361h, s.b(this.f62360g, s.b(this.f62359f, s.b(this.f62358e, (this.f62357d.hashCode() + r.d(this.f62356c, r.d(this.f62355b, iHashCode, 31), 31)) * 31, 31), 31), 31), 31), 31), 31);
        l.a aVar2 = androidx.compose.ui.unit.l.f42859b;
        return Long.hashCode(this.f62364k) + iD2;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PageIndicatorStyle(backgroundColor=");
        sb2.append(this.f62354a);
        sb2.append(", cornerRadius=");
        H.u(this.f62355b, ", dotsSpacing=", sb2);
        H.u(this.f62356c, ", contentPadding=", sb2);
        sb2.append(this.f62357d);
        sb2.append(", visitedDotsColor=");
        sb2.append(this.f62358e);
        sb2.append(", activeDotColor=");
        sb2.append(this.f62359f);
        sb2.append(", inactiveDotColor=");
        sb2.append(this.f62360g);
        sb2.append(", inactiveDotSize=");
        H.u(this.f62361h, ", secondaryDotSize=", sb2);
        H.u(this.f62362i, ", tertiaryDotSize=", sb2);
        H.u(this.f62363j, ", activeDotSize=", sb2);
        sb2.append((Object) androidx.compose.ui.unit.l.e(this.f62364k));
        sb2.append(')');
        return sb2.toString();
    }
}
