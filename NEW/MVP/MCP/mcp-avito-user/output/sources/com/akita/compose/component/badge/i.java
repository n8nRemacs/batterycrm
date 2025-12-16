package com.akita.compose.component.badge;

import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import com.akita.compose.foundation.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: BadgeStyle.kt */
@F3
@s0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/akita/compose/component/badge/i;", "", "Landroidx/compose/ui/unit/h;", "minHeight", "maxHeight", "minWidth", "cornerSize", "Lcom/akita/compose/foundation/p;", "backgroundColor", "strokeWidth", "strokeColor", "paddingStart", "paddingEnd", "Lcom/akita/compose/foundation/r;", "textStyle", "textColor", "textCompensation", "Lcom/akita/compose/foundation/modifier/e;", "upperShadow", "bottomShadow", "Lcom/akita/compose/component/badge/h;", "showAnimation", "Lcom/akita/compose/component/badge/g;", "pulsationAnimation", "<init>", "(FFFFLcom/akita/compose/foundation/p;FLcom/akita/compose/foundation/p;FFLcom/akita/compose/foundation/r;Lcom/akita/compose/foundation/p;Landroidx/compose/ui/unit/h;Lcom/akita/compose/foundation/modifier/e;Lcom/akita/compose/foundation/modifier/e;Lcom/akita/compose/component/badge/h;Lcom/akita/compose/component/badge/g;Lkotlin/jvm/internal/w;)V", "badge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f60400a;

    /* renamed from: b, reason: collision with root package name */
    public final float f60401b;

    /* renamed from: c, reason: collision with root package name */
    public final float f60402c;

    /* renamed from: d, reason: collision with root package name */
    public final float f60403d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final p f60404e;

    /* renamed from: f, reason: collision with root package name */
    public final float f60405f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final p f60406g;

    /* renamed from: h, reason: collision with root package name */
    public final float f60407h;

    /* renamed from: i, reason: collision with root package name */
    public final float f60408i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final r f60409j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final p f60410k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final androidx.compose.ui.unit.h f60411l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final com.akita.compose.foundation.modifier.e f60412m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final com.akita.compose.foundation.modifier.e f60413n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final h f60414o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final g f60415p;

    public i(float f12, float f13, float f14, float f15, p pVar, float f16, p pVar2, float f17, float f18, r rVar, p pVar3, androidx.compose.ui.unit.h hVar, com.akita.compose.foundation.modifier.e eVar, com.akita.compose.foundation.modifier.e eVar2, h hVar2, g gVar, C42822w c42822w) {
        this.f60400a = f12;
        this.f60401b = f13;
        this.f60402c = f14;
        this.f60403d = f15;
        this.f60404e = pVar;
        this.f60405f = f16;
        this.f60406g = pVar2;
        this.f60407h = f17;
        this.f60408i = f18;
        this.f60409j = rVar;
        this.f60410k = pVar3;
        this.f60411l = hVar;
        this.f60412m = eVar;
        this.f60413n = eVar2;
        this.f60414o = hVar2;
        this.f60415p = gVar;
    }

    public static i a(i iVar, p pVar, float f12, p pVar2, r rVar, p pVar3, int i12) {
        float f13 = iVar.f60400a;
        float f14 = iVar.f60401b;
        float f15 = iVar.f60402c;
        float f16 = iVar.f60403d;
        p pVar4 = (i12 & 16) != 0 ? iVar.f60404e : pVar;
        float f17 = (i12 & 32) != 0 ? iVar.f60405f : f12;
        p pVar5 = (i12 & 64) != 0 ? iVar.f60406g : pVar2;
        float f18 = iVar.f60407h;
        float f19 = iVar.f60408i;
        r rVar2 = (i12 & 512) != 0 ? iVar.f60409j : rVar;
        p pVar6 = (i12 & 1024) != 0 ? iVar.f60410k : pVar3;
        androidx.compose.ui.unit.h hVar = iVar.f60411l;
        com.akita.compose.foundation.modifier.e eVar = iVar.f60412m;
        com.akita.compose.foundation.modifier.e eVar2 = iVar.f60413n;
        h hVar2 = iVar.f60414o;
        g gVar = iVar.f60415p;
        iVar.getClass();
        return new i(f13, f14, f15, f16, pVar4, f17, pVar5, f18, f19, rVar2, pVar6, hVar, eVar, eVar2, hVar2, gVar, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return androidx.compose.ui.unit.h.b(this.f60400a, iVar.f60400a) && androidx.compose.ui.unit.h.b(this.f60401b, iVar.f60401b) && androidx.compose.ui.unit.h.b(this.f60402c, iVar.f60402c) && androidx.compose.ui.unit.h.b(this.f60403d, iVar.f60403d) && L.f(this.f60404e, iVar.f60404e) && androidx.compose.ui.unit.h.b(this.f60405f, iVar.f60405f) && L.f(this.f60406g, iVar.f60406g) && androidx.compose.ui.unit.h.b(this.f60407h, iVar.f60407h) && androidx.compose.ui.unit.h.b(this.f60408i, iVar.f60408i) && L.f(this.f60409j, iVar.f60409j) && L.f(this.f60410k, iVar.f60410k) && L.f(this.f60411l, iVar.f60411l) && L.f(this.f60412m, iVar.f60412m) && L.f(this.f60413n, iVar.f60413n) && L.f(this.f60414o, iVar.f60414o) && L.f(this.f60415p, iVar.f60415p);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        int iD2 = androidx.appcompat.app.r.d(this.f60408i, androidx.appcompat.app.r.d(this.f60407h, s.b(this.f60406g, androidx.appcompat.app.r.d(this.f60405f, s.b(this.f60404e, androidx.appcompat.app.r.d(this.f60403d, androidx.appcompat.app.r.d(this.f60402c, androidx.appcompat.app.r.d(this.f60401b, Float.hashCode(this.f60400a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        r rVar = this.f60409j;
        int iHashCode = (iD2 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        p pVar = this.f60410k;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        androidx.compose.ui.unit.h hVar = this.f60411l;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : Float.hashCode(hVar.f42852b))) * 31;
        com.akita.compose.foundation.modifier.e eVar = this.f60412m;
        int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        com.akita.compose.foundation.modifier.e eVar2 = this.f60413n;
        int iHashCode5 = (iHashCode4 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        h hVar2 = this.f60414o;
        int iHashCode6 = (iHashCode5 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31;
        g gVar = this.f60415p;
        return iHashCode6 + (gVar != null ? gVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BadgeStyle(minHeight=");
        H.u(this.f60400a, ", maxHeight=", sb2);
        H.u(this.f60401b, ", minWidth=", sb2);
        H.u(this.f60402c, ", cornerSize=", sb2);
        H.u(this.f60403d, ", backgroundColor=", sb2);
        sb2.append(this.f60404e);
        sb2.append(", strokeWidth=");
        H.u(this.f60405f, ", strokeColor=", sb2);
        sb2.append(this.f60406g);
        sb2.append(", paddingStart=");
        H.u(this.f60407h, ", paddingEnd=", sb2);
        H.u(this.f60408i, ", textStyle=", sb2);
        sb2.append(this.f60409j);
        sb2.append(", textColor=");
        sb2.append(this.f60410k);
        sb2.append(", textCompensation=");
        sb2.append(this.f60411l);
        sb2.append(", upperShadow=");
        sb2.append(this.f60412m);
        sb2.append(", bottomShadow=");
        sb2.append(this.f60413n);
        sb2.append(", showAnimation=");
        sb2.append(this.f60414o);
        sb2.append(", pulsationAnimation=");
        sb2.append(this.f60415p);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(float f12, float f13, float f14, float f15, p pVar, float f16, p pVar2, float f17, float f18, r rVar, p pVar3, androidx.compose.ui.unit.h hVar, com.akita.compose.foundation.modifier.e eVar, com.akita.compose.foundation.modifier.e eVar2, h hVar2, g gVar, int i12, C42822w c42822w) {
        float f19;
        float f22;
        if ((i12 & 128) != 0) {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            f19 = 0;
        } else {
            f19 = f17;
        }
        if ((i12 & 256) != 0) {
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            f22 = 0;
        } else {
            f22 = f18;
        }
        this(f12, f13, f14, f15, pVar, f16, pVar2, f19, f22, (i12 & 512) != 0 ? null : rVar, (i12 & 1024) != 0 ? null : pVar3, (i12 & 2048) != 0 ? null : hVar, (i12 & 4096) != 0 ? null : eVar, (i12 & 8192) != 0 ? null : eVar2, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : hVar2, (i12 & 32768) != 0 ? null : gVar, null);
    }
}
