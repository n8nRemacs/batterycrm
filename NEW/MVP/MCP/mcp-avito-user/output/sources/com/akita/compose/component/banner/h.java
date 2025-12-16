package com.akita.compose.component.banner;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.layout.V1;
import androidx.compose.foundation.shape.n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.accordion.s;
import com.akita.compose.component.button.t;
import com.akita.compose.foundation.modifier.f;
import com.akita.compose.foundation.p;
import com.akita.compose.foundation.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BannerStyle.kt */
@P
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/akita/compose/component/banner/h;", "", "Landroidx/compose/foundation/layout/T1;", "contentPadding", "Landroidx/compose/ui/graphics/h1;", "shape", "Lcom/akita/compose/foundation/p;", "backgroundColor", "Lcom/akita/compose/foundation/r;", "titleStyle", "contentTextStyle", "Lcom/akita/compose/component/button/t;", "buttonStyle", "Landroidx/compose/ui/unit/h;", "titleAndContentSpacing", "contentAndButtonSpacing", "sideContentSpacing", "Lcom/akita/compose/component/close_button/c;", "closeButtonStyle", "closeButtonPadding", "Lcom/akita/compose/foundation/modifier/f;", "shadows", "shadowCornerRadius", "", "blurRadius", "<init>", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/ui/graphics/h1;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/r;Lcom/akita/compose/foundation/r;Lcom/akita/compose/component/button/t;FFFLcom/akita/compose/component/close_button/c;Landroidx/compose/foundation/layout/T1;Lcom/akita/compose/foundation/modifier/f;FILkotlin/jvm/internal/w;)V", "banner_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class h {

    /* renamed from: o, reason: collision with root package name */
    public static final int f60462o;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final T1 f60463a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h1 f60464b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p f60465c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final r f60466d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final r f60467e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final t f60468f;

    /* renamed from: g, reason: collision with root package name */
    public final float f60469g;

    /* renamed from: h, reason: collision with root package name */
    public final float f60470h;

    /* renamed from: i, reason: collision with root package name */
    public final float f60471i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.akita.compose.component.close_button.c f60472j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final T1 f60473k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final com.akita.compose.foundation.modifier.f f60474l;

    /* renamed from: m, reason: collision with root package name */
    public final float f60475m;

    /* renamed from: n, reason: collision with root package name */
    public final int f60476n;

    static {
        f.a aVar = com.akita.compose.foundation.modifier.f.f63621c;
        f60462o = 8;
    }

    public h(T1 t12, h1 h1Var, p pVar, r rVar, r rVar2, t tVar, float f12, float f13, float f14, com.akita.compose.component.close_button.c cVar, T1 t13, com.akita.compose.foundation.modifier.f fVar, float f15, int i12, C42822w c42822w) {
        this.f60463a = t12;
        this.f60464b = h1Var;
        this.f60465c = pVar;
        this.f60466d = rVar;
        this.f60467e = rVar2;
        this.f60468f = tVar;
        this.f60469g = f12;
        this.f60470h = f13;
        this.f60471i = f14;
        this.f60472j = cVar;
        this.f60473k = t13;
        this.f60474l = fVar;
        this.f60475m = f15;
        this.f60476n = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.foundation.layout.T1] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.graphics.h1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.foundation.layout.T1] */
    public static h a(h hVar, V1 v12, n nVar, com.akita.compose.component.close_button.c cVar, V1 v13, int i12) {
        V1 v14 = (i12 & 1) != 0 ? hVar.f60463a : v12;
        n nVar2 = (i12 & 2) != 0 ? hVar.f60464b : nVar;
        p pVar = hVar.f60465c;
        r rVar = hVar.f60466d;
        r rVar2 = hVar.f60467e;
        t tVar = hVar.f60468f;
        float f12 = hVar.f60469g;
        float f13 = hVar.f60470h;
        float f14 = hVar.f60471i;
        com.akita.compose.component.close_button.c cVar2 = (i12 & 512) != 0 ? hVar.f60472j : cVar;
        V1 v15 = (i12 & 1024) != 0 ? hVar.f60473k : v13;
        com.akita.compose.foundation.modifier.f fVar = hVar.f60474l;
        float f15 = hVar.f60475m;
        int i13 = hVar.f60476n;
        hVar.getClass();
        return new h(v14, nVar2, pVar, rVar, rVar2, tVar, f12, f13, f14, cVar2, v15, fVar, f15, i13, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f60463a, hVar.f60463a) && L.f(this.f60464b, hVar.f60464b) && L.f(this.f60465c, hVar.f60465c) && L.f(this.f60466d, hVar.f60466d) && L.f(this.f60467e, hVar.f60467e) && L.f(this.f60468f, hVar.f60468f) && androidx.compose.ui.unit.h.b(this.f60469g, hVar.f60469g) && androidx.compose.ui.unit.h.b(this.f60470h, hVar.f60470h) && androidx.compose.ui.unit.h.b(this.f60471i, hVar.f60471i) && L.f(this.f60472j, hVar.f60472j) && L.f(this.f60473k, hVar.f60473k) && L.f(this.f60474l, hVar.f60474l) && androidx.compose.ui.unit.h.b(this.f60475m, hVar.f60475m) && this.f60476n == hVar.f60476n;
    }

    public final int hashCode() {
        int iHashCode = (this.f60468f.hashCode() + s.a(s.a(s.b(this.f60465c, (this.f60464b.hashCode() + (this.f60463a.hashCode() * 31)) * 31, 31), 31, this.f60466d), 31, this.f60467e)) * 31;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        int iHashCode2 = (this.f60473k.hashCode() + ((this.f60472j.hashCode() + androidx.appcompat.app.r.d(this.f60471i, androidx.appcompat.app.r.d(this.f60470h, androidx.appcompat.app.r.d(this.f60469g, iHashCode, 31), 31), 31)) * 31)) * 31;
        com.akita.compose.foundation.modifier.f fVar = this.f60474l;
        return Integer.hashCode(this.f60476n) + androidx.appcompat.app.r.d(this.f60475m, (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerStyle(contentPadding=");
        sb2.append(this.f60463a);
        sb2.append(", shape=");
        sb2.append(this.f60464b);
        sb2.append(", backgroundColor=");
        sb2.append(this.f60465c);
        sb2.append(", titleStyle=");
        sb2.append(this.f60466d);
        sb2.append(", contentTextStyle=");
        sb2.append(this.f60467e);
        sb2.append(", buttonStyle=");
        sb2.append(this.f60468f);
        sb2.append(", titleAndContentSpacing=");
        H.u(this.f60469g, ", contentAndButtonSpacing=", sb2);
        H.u(this.f60470h, ", sideContentSpacing=", sb2);
        H.u(this.f60471i, ", closeButtonStyle=", sb2);
        sb2.append(this.f60472j);
        sb2.append(", closeButtonPadding=");
        sb2.append(this.f60473k);
        sb2.append(", shadows=");
        sb2.append(this.f60474l);
        sb2.append(", shadowCornerRadius=");
        H.u(this.f60475m, ", blurRadius=", sb2);
        return androidx.appcompat.app.r.t(sb2, this.f60476n, ')');
    }
}
