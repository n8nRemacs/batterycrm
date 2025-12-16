package com.akita.compose.component.selector_card;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.H0;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.toggle.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectorCardStyle.kt */
@H0
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/akita/compose/component/selector_card/h;", "", "Lcom/akita/compose/foundation/c;", "backgroundColor", "Lcom/akita/compose/component/selector_card/a;", "borderSize", "borderColor", "Lcom/akita/compose/component/toggle/u;", "switcherStyle", "checkmarkStyle", "Landroidx/compose/ui/unit/h;", "cornerRadius", "Landroidx/compose/foundation/layout/T1;", "contentPadding", "indicatorPadding", "<init>", "(Lcom/akita/compose/foundation/c;Lcom/akita/compose/component/selector_card/a;Lcom/akita/compose/foundation/c;Lcom/akita/compose/component/toggle/u;Lcom/akita/compose/component/toggle/u;FLandroidx/compose/foundation/layout/T1;Landroidx/compose/foundation/layout/T1;Lkotlin/jvm/internal/w;)V", "selector-card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.akita.compose.foundation.c f62663a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f62664b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.akita.compose.foundation.c f62665c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final u f62666d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final u f62667e;

    /* renamed from: f, reason: collision with root package name */
    public final float f62668f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final T1 f62669g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final T1 f62670h;

    public h(com.akita.compose.foundation.c cVar, a aVar, com.akita.compose.foundation.c cVar2, u uVar, u uVar2, float f12, T1 t12, T1 t13, C42822w c42822w) {
        this.f62663a = cVar;
        this.f62664b = aVar;
        this.f62665c = cVar2;
        this.f62666d = uVar;
        this.f62667e = uVar2;
        this.f62668f = f12;
        this.f62669g = t12;
        this.f62670h = t13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f62663a, hVar.f62663a) && L.f(this.f62664b, hVar.f62664b) && L.f(this.f62665c, hVar.f62665c) && L.f(this.f62666d, hVar.f62666d) && L.f(this.f62667e, hVar.f62667e) && androidx.compose.ui.unit.h.b(this.f62668f, hVar.f62668f) && L.f(this.f62669g, hVar.f62669g) && L.f(this.f62670h, hVar.f62670h);
    }

    public final int hashCode() {
        int iHashCode = (this.f62667e.hashCode() + ((this.f62666d.hashCode() + ((this.f62665c.hashCode() + ((this.f62664b.hashCode() + (this.f62663a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return this.f62670h.hashCode() + ((this.f62669g.hashCode() + r.d(this.f62668f, iHashCode, 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectorCardStyle(backgroundColor=");
        sb2.append(this.f62663a);
        sb2.append(", borderSize=");
        sb2.append(this.f62664b);
        sb2.append(", borderColor=");
        sb2.append(this.f62665c);
        sb2.append(", switcherStyle=");
        sb2.append(this.f62666d);
        sb2.append(", checkmarkStyle=");
        sb2.append(this.f62667e);
        sb2.append(", cornerRadius=");
        H.u(this.f62668f, ", contentPadding=", sb2);
        sb2.append(this.f62669g);
        sb2.append(", indicatorPadding=");
        sb2.append(this.f62670h);
        sb2.append(')');
        return sb2.toString();
    }
}
