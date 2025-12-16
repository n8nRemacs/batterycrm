package com.akita.compose.component.list_item;

import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.layout.V1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ListItemStyle.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/akita/compose/component/list_item/s;", "", "Landroidx/compose/foundation/layout/T1;", "paddingValues", "Landroidx/compose/ui/unit/h;", "horizontalItemsInset", "Lcom/akita/compose/foundation/r;", "titleTextStyle", "subtitleTextStyle", "titleToSubtitleSpacing", "Lcom/akita/compose/component/toggle/u;", "checkboxStyle", "checkmarkStyle", "radioStyle", "switcherStyle", "<init>", "(Landroidx/compose/foundation/layout/T1;FLcom/akita/compose/foundation/r;Lcom/akita/compose/foundation/r;FLcom/akita/compose/component/toggle/u;Lcom/akita/compose/component/toggle/u;Lcom/akita/compose/component/toggle/u;Lcom/akita/compose/component/toggle/u;Lkotlin/jvm/internal/w;)V", "list-item_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final T1 f61949a;

    /* renamed from: b, reason: collision with root package name */
    public final float f61950b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.r f61951c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.r f61952d;

    /* renamed from: e, reason: collision with root package name */
    public final float f61953e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.toggle.u f61954f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.toggle.u f61955g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.toggle.u f61956h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.toggle.u f61957i;

    public s(T1 t12, float f12, com.akita.compose.foundation.r rVar, com.akita.compose.foundation.r rVar2, float f13, com.akita.compose.component.toggle.u uVar, com.akita.compose.component.toggle.u uVar2, com.akita.compose.component.toggle.u uVar3, com.akita.compose.component.toggle.u uVar4, C42822w c42822w) {
        this.f61949a = t12;
        this.f61950b = f12;
        this.f61951c = rVar;
        this.f61952d = rVar2;
        this.f61953e = f13;
        this.f61954f = uVar;
        this.f61955g = uVar2;
        this.f61956h = uVar3;
        this.f61957i = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [androidx.compose.foundation.layout.T1] */
    public static s a(s sVar, V1 v12, com.akita.compose.foundation.r rVar, com.akita.compose.component.toggle.u uVar, int i12) {
        V1 v13 = v12;
        if ((i12 & 1) != 0) {
            v13 = sVar.f61949a;
        }
        V1 v14 = v13;
        float f12 = sVar.f61950b;
        if ((i12 & 4) != 0) {
            rVar = sVar.f61951c;
        }
        com.akita.compose.foundation.r rVar2 = rVar;
        com.akita.compose.foundation.r rVar3 = sVar.f61952d;
        float f13 = sVar.f61953e;
        com.akita.compose.component.toggle.u uVar2 = sVar.f61954f;
        if ((i12 & 64) != 0) {
            uVar = sVar.f61955g;
        }
        com.akita.compose.component.toggle.u uVar3 = sVar.f61956h;
        com.akita.compose.component.toggle.u uVar4 = sVar.f61957i;
        sVar.getClass();
        return new s(v14, f12, rVar2, rVar3, f13, uVar2, uVar, uVar3, uVar4, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return L.f(this.f61949a, sVar.f61949a) && androidx.compose.ui.unit.h.b(this.f61950b, sVar.f61950b) && L.f(this.f61951c, sVar.f61951c) && L.f(this.f61952d, sVar.f61952d) && androidx.compose.ui.unit.h.b(this.f61953e, sVar.f61953e) && L.f(this.f61954f, sVar.f61954f) && L.f(this.f61955g, sVar.f61955g) && L.f(this.f61956h, sVar.f61956h) && L.f(this.f61957i, sVar.f61957i);
    }

    public final int hashCode() {
        int iHashCode = this.f61949a.hashCode() * 31;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return this.f61957i.hashCode() + ((this.f61956h.hashCode() + ((this.f61955g.hashCode() + ((this.f61954f.hashCode() + androidx.appcompat.app.r.d(this.f61953e, com.akita.compose.component.accordion.s.a(com.akita.compose.component.accordion.s.a(androidx.appcompat.app.r.d(this.f61950b, iHashCode, 31), 31, this.f61951c), 31, this.f61952d), 31)) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ListItemStyle(paddingValues=");
        sb2.append(this.f61949a);
        sb2.append(", horizontalItemsInset=");
        H.u(this.f61950b, ", titleTextStyle=", sb2);
        sb2.append(this.f61951c);
        sb2.append(", subtitleTextStyle=");
        sb2.append(this.f61952d);
        sb2.append(", titleToSubtitleSpacing=");
        H.u(this.f61953e, ", checkboxStyle=", sb2);
        sb2.append(this.f61954f);
        sb2.append(", checkmarkStyle=");
        sb2.append(this.f61955g);
        sb2.append(", radioStyle=");
        sb2.append(this.f61956h);
        sb2.append(", switcherStyle=");
        sb2.append(this.f61957i);
        sb2.append(')');
        return sb2.toString();
    }
}
