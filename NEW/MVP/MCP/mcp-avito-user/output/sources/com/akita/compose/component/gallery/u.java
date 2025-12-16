package com.akita.compose.component.gallery;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryStyle.kt */
@P
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/akita/compose/component/gallery/u;", "", "Landroidx/compose/ui/unit/h;", "horizontalPadding", "space", "Lcom/akita/compose/foundation/p;", "backgroundItemColor", "maxHeight", "Landroidx/compose/ui/graphics/h1;", "oneItemShape", "firstItemShape", "centerItemShape", "lastItemShape", "<init>", "(FFLcom/akita/compose/foundation/p;FLandroidx/compose/ui/graphics/h1;Landroidx/compose/ui/graphics/h1;Landroidx/compose/ui/graphics/h1;Landroidx/compose/ui/graphics/h1;Lkotlin/jvm/internal/w;)V", "gallery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class u {

    /* renamed from: a, reason: collision with root package name */
    public final float f61628a;

    /* renamed from: b, reason: collision with root package name */
    public final float f61629b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f61630c;

    /* renamed from: d, reason: collision with root package name */
    public final float f61631d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h1 f61632e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h1 f61633f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final h1 f61634g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final h1 f61635h;

    public u(float f12, float f13, com.akita.compose.foundation.p pVar, float f14, h1 h1Var, h1 h1Var2, h1 h1Var3, h1 h1Var4, C42822w c42822w) {
        this.f61628a = f12;
        this.f61629b = f13;
        this.f61630c = pVar;
        this.f61631d = f14;
        this.f61632e = h1Var;
        this.f61633f = h1Var2;
        this.f61634g = h1Var3;
        this.f61635h = h1Var4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return androidx.compose.ui.unit.h.b(this.f61628a, uVar.f61628a) && androidx.compose.ui.unit.h.b(this.f61629b, uVar.f61629b) && L.f(this.f61630c, uVar.f61630c) && androidx.compose.ui.unit.h.b(this.f61631d, uVar.f61631d) && L.f(this.f61632e, uVar.f61632e) && L.f(this.f61633f, uVar.f61633f) && L.f(this.f61634g, uVar.f61634g) && L.f(this.f61635h, uVar.f61635h);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return this.f61635h.hashCode() + ((this.f61634g.hashCode() + ((this.f61633f.hashCode() + ((this.f61632e.hashCode() + androidx.appcompat.app.r.d(this.f61631d, com.akita.compose.component.accordion.s.b(this.f61630c, androidx.appcompat.app.r.d(this.f61629b, Float.hashCode(this.f61628a) * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryStyle(horizontalPadding=");
        H.u(this.f61628a, ", space=", sb2);
        H.u(this.f61629b, ", backgroundItemColor=", sb2);
        sb2.append(this.f61630c);
        sb2.append(", maxHeight=");
        H.u(this.f61631d, ", oneItemShape=", sb2);
        sb2.append(this.f61632e);
        sb2.append(", firstItemShape=");
        sb2.append(this.f61633f);
        sb2.append(", centerItemShape=");
        sb2.append(this.f61634g);
        sb2.append(", lastItemShape=");
        sb2.append(this.f61635h);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u(float f12, float f13, com.akita.compose.foundation.p pVar, float f14, h1 h1Var, h1 h1Var2, h1 h1Var3, h1 h1Var4, int i12, C42822w c42822w) {
        float f15;
        float f16;
        float f17;
        h1 h1VarA;
        h1 h1VarB;
        h1 h1VarA2;
        h1 h1VarB2;
        if ((i12 & 1) != 0) {
            f15 = 16;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
        } else {
            f15 = f12;
        }
        if ((i12 & 2) != 0) {
            f16 = 6;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        } else {
            f16 = f13;
        }
        com.akita.compose.foundation.p pVar2 = (i12 & 4) != 0 ? new com.akita.compose.foundation.p(V.d(4293651176L), V.d(4281216300L), null) : pVar;
        if ((i12 & 8) != 0) {
            f17 = 480;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        } else {
            f17 = f14;
        }
        if ((i12 & 16) != 0) {
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            h1VarA = androidx.compose.foundation.shape.o.a(16);
        } else {
            h1VarA = h1Var;
        }
        if ((i12 & 32) != 0) {
            float f18 = 16;
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            float f19 = 6;
            h1VarB = androidx.compose.foundation.shape.o.b(f18, f19, f19, f18);
        } else {
            h1VarB = h1Var2;
        }
        if ((i12 & 64) != 0) {
            h.a aVar6 = androidx.compose.ui.unit.h.f42849c;
            h1VarA2 = androidx.compose.foundation.shape.o.a(6);
        } else {
            h1VarA2 = h1Var3;
        }
        if ((i12 & 128) != 0) {
            float f22 = 6;
            h.a aVar7 = androidx.compose.ui.unit.h.f42849c;
            float f23 = 16;
            h1VarB2 = androidx.compose.foundation.shape.o.b(f22, f23, f23, f22);
        } else {
            h1VarB2 = h1Var4;
        }
        this(f15, f16, pVar2, f17, h1VarA, h1VarB, h1VarA2, h1VarB2, null);
    }
}
