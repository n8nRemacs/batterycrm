package com.akita.compose.component.tab_group;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TabGroupStyle.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/akita/compose/component/tab_group/u;", "", "Landroidx/compose/ui/unit/h;", "tabsSpacing", "Lcom/akita/compose/foundation/p;", "selectedLineColor", "selectedLineSize", "bottomLineColor", "bottomLineSize", "Lcom/akita/compose/component/tab_group/j;", "itemStyle", "<init>", "(FLcom/akita/compose/foundation/p;FLcom/akita/compose/foundation/p;FLcom/akita/compose/component/tab_group/j;Lkotlin/jvm/internal/w;)V", "tab-group_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class u {

    /* renamed from: a, reason: collision with root package name */
    public final float f63094a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f63095b;

    /* renamed from: c, reason: collision with root package name */
    public final float f63096c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f63097d;

    /* renamed from: e, reason: collision with root package name */
    public final float f63098e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final j f63099f;

    public u(float f12, com.akita.compose.foundation.p pVar, float f13, com.akita.compose.foundation.p pVar2, float f14, j jVar, C42822w c42822w) {
        this.f63094a = f12;
        this.f63095b = pVar;
        this.f63096c = f13;
        this.f63097d = pVar2;
        this.f63098e = f14;
        this.f63099f = jVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return androidx.compose.ui.unit.h.b(this.f63094a, uVar.f63094a) && L.f(this.f63095b, uVar.f63095b) && androidx.compose.ui.unit.h.b(this.f63096c, uVar.f63096c) && L.f(this.f63097d, uVar.f63097d) && androidx.compose.ui.unit.h.b(this.f63098e, uVar.f63098e) && L.f(this.f63099f, uVar.f63099f);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return this.f63099f.hashCode() + androidx.appcompat.app.r.d(this.f63098e, com.akita.compose.component.accordion.s.b(this.f63097d, androidx.appcompat.app.r.d(this.f63096c, com.akita.compose.component.accordion.s.b(this.f63095b, Float.hashCode(this.f63094a) * 31, 31), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabGroupStyle(tabsSpacing=");
        H.u(this.f63094a, ", selectedLineColor=", sb2);
        sb2.append(this.f63095b);
        sb2.append(", selectedLineSize=");
        H.u(this.f63096c, ", bottomLineColor=", sb2);
        sb2.append(this.f63097d);
        sb2.append(", bottomLineSize=");
        H.u(this.f63098e, ", itemStyle=", sb2);
        sb2.append(this.f63099f);
        sb2.append(')');
        return sb2.toString();
    }
}
