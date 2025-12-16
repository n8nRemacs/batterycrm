package com.akita.compose.component.tab_group;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TabGroupStyle.kt */
@P
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/akita/compose/component/tab_group/j;", "", "Landroidx/compose/ui/unit/h;", "subItemSpacing", "compensation", "bottomSpacing", "Lcom/akita/compose/component/badge/i;", "notificationStyle", "notificationOffsetY", "Lcom/akita/compose/foundation/p;", "counterStandardColor", "counterProminentColor", "Lcom/akita/compose/foundation/r;", "titleStyle", "counterStyle", "Lcom/akita/compose/foundation/c;", "titleColor", "<init>", "(FFFLcom/akita/compose/component/badge/i;FLcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/r;Lcom/akita/compose/foundation/r;Lcom/akita/compose/foundation/c;Lkotlin/jvm/internal/w;)V", "tab-group_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    public final float f63020a;

    /* renamed from: b, reason: collision with root package name */
    public final float f63021b;

    /* renamed from: c, reason: collision with root package name */
    public final float f63022c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.badge.i f63023d;

    /* renamed from: e, reason: collision with root package name */
    public final float f63024e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f63025f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f63026g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.r f63027h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.r f63028i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.c f63029j;

    public j(float f12, float f13, float f14, com.akita.compose.component.badge.i iVar, float f15, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, com.akita.compose.foundation.r rVar, com.akita.compose.foundation.r rVar2, com.akita.compose.foundation.c cVar, C42822w c42822w) {
        this.f63020a = f12;
        this.f63021b = f13;
        this.f63022c = f14;
        this.f63023d = iVar;
        this.f63024e = f15;
        this.f63025f = pVar;
        this.f63026g = pVar2;
        this.f63027h = rVar;
        this.f63028i = rVar2;
        this.f63029j = cVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return androidx.compose.ui.unit.h.b(this.f63020a, jVar.f63020a) && androidx.compose.ui.unit.h.b(this.f63021b, jVar.f63021b) && androidx.compose.ui.unit.h.b(this.f63022c, jVar.f63022c) && L.f(this.f63023d, jVar.f63023d) && androidx.compose.ui.unit.h.b(this.f63024e, jVar.f63024e) && L.f(this.f63025f, jVar.f63025f) && L.f(this.f63026g, jVar.f63026g) && L.f(this.f63027h, jVar.f63027h) && L.f(this.f63028i, jVar.f63028i) && L.f(this.f63029j, jVar.f63029j);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return this.f63029j.hashCode() + com.akita.compose.component.accordion.s.a(com.akita.compose.component.accordion.s.a(com.akita.compose.component.accordion.s.b(this.f63026g, com.akita.compose.component.accordion.s.b(this.f63025f, androidx.appcompat.app.r.d(this.f63024e, (this.f63023d.hashCode() + androidx.appcompat.app.r.d(this.f63022c, androidx.appcompat.app.r.d(this.f63021b, Float.hashCode(this.f63020a) * 31, 31), 31)) * 31, 31), 31), 31), 31, this.f63027h), 31, this.f63028i);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabGroupItemStyle(subItemSpacing=");
        H.u(this.f63020a, ", compensation=", sb2);
        H.u(this.f63021b, ", bottomSpacing=", sb2);
        H.u(this.f63022c, ", notificationStyle=", sb2);
        sb2.append(this.f63023d);
        sb2.append(", notificationOffsetY=");
        H.u(this.f63024e, ", counterStandardColor=", sb2);
        sb2.append(this.f63025f);
        sb2.append(", counterProminentColor=");
        sb2.append(this.f63026g);
        sb2.append(", titleStyle=");
        sb2.append(this.f63027h);
        sb2.append(", counterStyle=");
        sb2.append(this.f63028i);
        sb2.append(", titleColor=");
        sb2.append(this.f63029j);
        sb2.append(')');
        return sb2.toString();
    }
}
