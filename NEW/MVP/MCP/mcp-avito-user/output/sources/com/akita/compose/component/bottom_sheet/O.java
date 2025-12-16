package com.akita.compose.component.bottom_sheet;

import androidx.compose.foundation.layout.T1;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BottomSheetStyle.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/akita/compose/component/bottom_sheet/O;", "", "Landroidx/compose/ui/unit/h;", "maxWidth", "Landroidx/compose/ui/graphics/h1;", "shape", "Lcom/akita/compose/foundation/p;", "backgroundColor", "scrimColor", "handleColor", "handleWidth", "handleHeight", "handleShape", "Landroidx/compose/foundation/layout/T1;", "handlePadding", "topInset", "<init>", "(FLandroidx/compose/ui/graphics/h1;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;FFLandroidx/compose/ui/graphics/h1;Landroidx/compose/foundation/layout/T1;FLkotlin/jvm/internal/w;)V", "bottom-sheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class O {

    /* renamed from: a, reason: collision with root package name */
    public final float f60539a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h1 f60540b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f60541c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f60542d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f60543e;

    /* renamed from: f, reason: collision with root package name */
    public final float f60544f;

    /* renamed from: g, reason: collision with root package name */
    public final float f60545g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final h1 f60546h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final T1 f60547i;

    /* renamed from: j, reason: collision with root package name */
    public final float f60548j;

    public O(float f12, h1 h1Var, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, com.akita.compose.foundation.p pVar3, float f13, float f14, h1 h1Var2, T1 t12, float f15, C42822w c42822w) {
        this.f60539a = f12;
        this.f60540b = h1Var;
        this.f60541c = pVar;
        this.f60542d = pVar2;
        this.f60543e = pVar3;
        this.f60544f = f13;
        this.f60545g = f14;
        this.f60546h = h1Var2;
        this.f60547i = t12;
        this.f60548j = f15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o12 = (O) obj;
        return androidx.compose.ui.unit.h.b(this.f60539a, o12.f60539a) && kotlin.jvm.internal.L.f(this.f60540b, o12.f60540b) && kotlin.jvm.internal.L.f(this.f60541c, o12.f60541c) && kotlin.jvm.internal.L.f(this.f60542d, o12.f60542d) && kotlin.jvm.internal.L.f(this.f60543e, o12.f60543e) && androidx.compose.ui.unit.h.b(this.f60544f, o12.f60544f) && androidx.compose.ui.unit.h.b(this.f60545g, o12.f60545g) && kotlin.jvm.internal.L.f(this.f60546h, o12.f60546h) && kotlin.jvm.internal.L.f(this.f60547i, o12.f60547i) && androidx.compose.ui.unit.h.b(this.f60548j, o12.f60548j);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f60548j) + ((this.f60547i.hashCode() + ((this.f60546h.hashCode() + androidx.appcompat.app.r.d(this.f60545g, androidx.appcompat.app.r.d(this.f60544f, com.akita.compose.component.accordion.s.b(this.f60543e, com.akita.compose.component.accordion.s.b(this.f60542d, com.akita.compose.component.accordion.s.b(this.f60541c, (this.f60540b.hashCode() + (Float.hashCode(this.f60539a) * 31)) * 31, 31), 31), 31), 31), 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BottomSheetStyle(maxWidth=");
        androidx.compose.foundation.H.u(this.f60539a, ", shape=", sb2);
        sb2.append(this.f60540b);
        sb2.append(", backgroundColor=");
        sb2.append(this.f60541c);
        sb2.append(", scrimColor=");
        sb2.append(this.f60542d);
        sb2.append(", handleColor=");
        sb2.append(this.f60543e);
        sb2.append(", handleWidth=");
        androidx.compose.foundation.H.u(this.f60544f, ", handleHeight=", sb2);
        androidx.compose.foundation.H.u(this.f60545g, ", handleShape=", sb2);
        sb2.append(this.f60546h);
        sb2.append(", handlePadding=");
        sb2.append(this.f60547i);
        sb2.append(", topInset=");
        return androidx.compose.foundation.H.h(')', this.f60548j, sb2);
    }
}
