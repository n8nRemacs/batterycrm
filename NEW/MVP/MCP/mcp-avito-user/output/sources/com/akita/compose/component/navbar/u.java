package com.akita.compose.component.navbar;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NavBarStyle.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/akita/compose/component/navbar/u;", "", "Landroidx/compose/ui/unit/h;", "minHeight", "paddingHorizontal", "backButtonMarginStart", "Lcom/akita/compose/foundation/p;", "backgroundColor", "Lcom/akita/compose/foundation/r;", "titleStyle", "titleSpacing", "contentColor", "textActionStyle", "", "backIcon", "actionIconSize", "largeActionSize", "<init>", "(FFFLcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/r;FLcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/r;IFFLkotlin/jvm/internal/w;)V", "navbar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class u {

    /* renamed from: a, reason: collision with root package name */
    public final float f62290a;

    /* renamed from: b, reason: collision with root package name */
    public final float f62291b;

    /* renamed from: c, reason: collision with root package name */
    public final float f62292c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f62293d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.r f62294e;

    /* renamed from: f, reason: collision with root package name */
    public final float f62295f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f62296g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.r f62297h;

    /* renamed from: i, reason: collision with root package name */
    public final int f62298i;

    /* renamed from: j, reason: collision with root package name */
    public final float f62299j;

    /* renamed from: k, reason: collision with root package name */
    public final float f62300k;

    public u(float f12, float f13, float f14, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.r rVar, float f15, com.akita.compose.foundation.p pVar2, com.akita.compose.foundation.r rVar2, @InterfaceC42165v int i12, float f16, float f17, C42822w c42822w) {
        this.f62290a = f12;
        this.f62291b = f13;
        this.f62292c = f14;
        this.f62293d = pVar;
        this.f62294e = rVar;
        this.f62295f = f15;
        this.f62296g = pVar2;
        this.f62297h = rVar2;
        this.f62298i = i12;
        this.f62299j = f16;
        this.f62300k = f17;
    }

    public static u a(u uVar, com.akita.compose.foundation.p pVar, int i12, int i13) {
        float f12 = uVar.f62290a;
        float f13 = uVar.f62291b;
        float f14 = uVar.f62292c;
        com.akita.compose.foundation.p pVar2 = (i13 & 8) != 0 ? uVar.f62293d : pVar;
        com.akita.compose.foundation.r rVar = uVar.f62294e;
        float f15 = uVar.f62295f;
        com.akita.compose.foundation.p pVar3 = uVar.f62296g;
        com.akita.compose.foundation.r rVar2 = uVar.f62297h;
        float f16 = uVar.f62299j;
        float f17 = uVar.f62300k;
        uVar.getClass();
        return new u(f12, f13, f14, pVar2, rVar, f15, pVar3, rVar2, i12, f16, f17, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return androidx.compose.ui.unit.h.b(this.f62290a, uVar.f62290a) && androidx.compose.ui.unit.h.b(this.f62291b, uVar.f62291b) && androidx.compose.ui.unit.h.b(this.f62292c, uVar.f62292c) && L.f(this.f62293d, uVar.f62293d) && L.f(this.f62294e, uVar.f62294e) && androidx.compose.ui.unit.h.b(this.f62295f, uVar.f62295f) && L.f(this.f62296g, uVar.f62296g) && L.f(this.f62297h, uVar.f62297h) && this.f62298i == uVar.f62298i && androidx.compose.ui.unit.h.b(this.f62299j, uVar.f62299j) && androidx.compose.ui.unit.h.b(this.f62300k, uVar.f62300k);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f62300k) + androidx.appcompat.app.r.d(this.f62299j, androidx.appcompat.app.r.e(this.f62298i, com.akita.compose.component.accordion.s.a(com.akita.compose.component.accordion.s.b(this.f62296g, androidx.appcompat.app.r.d(this.f62295f, com.akita.compose.component.accordion.s.a(com.akita.compose.component.accordion.s.b(this.f62293d, androidx.appcompat.app.r.d(this.f62292c, androidx.appcompat.app.r.d(this.f62291b, Float.hashCode(this.f62290a) * 31, 31), 31), 31), 31, this.f62294e), 31), 31), 31, this.f62297h), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavBarStyle(minHeight=");
        H.u(this.f62290a, ", paddingHorizontal=", sb2);
        H.u(this.f62291b, ", backButtonMarginStart=", sb2);
        H.u(this.f62292c, ", backgroundColor=", sb2);
        sb2.append(this.f62293d);
        sb2.append(", titleStyle=");
        sb2.append(this.f62294e);
        sb2.append(", titleSpacing=");
        H.u(this.f62295f, ", contentColor=", sb2);
        sb2.append(this.f62296g);
        sb2.append(", textActionStyle=");
        sb2.append(this.f62297h);
        sb2.append(", backIcon=");
        sb2.append(this.f62298i);
        sb2.append(", actionIconSize=");
        H.u(this.f62299j, ", largeActionSize=", sb2);
        return H.h(')', this.f62300k, sb2);
    }
}
