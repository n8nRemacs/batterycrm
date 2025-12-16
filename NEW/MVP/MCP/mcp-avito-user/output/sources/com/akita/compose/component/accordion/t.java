package com.akita.compose.component.accordion;

import androidx.compose.animation.core.N;
import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AccordionStyle.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/akita/compose/component/accordion/t;", "", "Lcom/akita/compose/foundation/r;", "titleTextStyle", "contentTextStyle", "Landroidx/compose/ui/unit/h;", "contentPaddingTop", "paddingBottom", "arrowTextSpacing", "Landroidx/compose/foundation/layout/T1;", "arrowInsets", "Lcom/akita/compose/component/spinner/h;", "spinnerStyle", "", "animationDuration", "Landroidx/compose/animation/core/N;", "easing", "<init>", "(Lcom/akita/compose/foundation/r;Lcom/akita/compose/foundation/r;FFFLandroidx/compose/foundation/layout/T1;Lcom/akita/compose/component/spinner/h;ILandroidx/compose/animation/core/N;Lkotlin/jvm/internal/w;)V", "accordion_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.r f60265a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.r f60266b;

    /* renamed from: c, reason: collision with root package name */
    public final float f60267c;

    /* renamed from: d, reason: collision with root package name */
    public final float f60268d;

    /* renamed from: e, reason: collision with root package name */
    public final float f60269e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final T1 f60270f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.spinner.h f60271g;

    /* renamed from: h, reason: collision with root package name */
    public final int f60272h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final N f60273i;

    public t(com.akita.compose.foundation.r rVar, com.akita.compose.foundation.r rVar2, float f12, float f13, float f14, T1 t12, com.akita.compose.component.spinner.h hVar, int i12, N n12, C42822w c42822w) {
        this.f60265a = rVar;
        this.f60266b = rVar2;
        this.f60267c = f12;
        this.f60268d = f13;
        this.f60269e = f14;
        this.f60270f = t12;
        this.f60271g = hVar;
        this.f60272h = i12;
        this.f60273i = n12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return L.f(this.f60265a, tVar.f60265a) && L.f(this.f60266b, tVar.f60266b) && androidx.compose.ui.unit.h.b(this.f60267c, tVar.f60267c) && androidx.compose.ui.unit.h.b(this.f60268d, tVar.f60268d) && androidx.compose.ui.unit.h.b(this.f60269e, tVar.f60269e) && L.f(this.f60270f, tVar.f60270f) && L.f(this.f60271g, tVar.f60271g) && this.f60272h == tVar.f60272h && L.f(this.f60273i, tVar.f60273i);
    }

    public final int hashCode() {
        int iA2 = s.a(this.f60265a.hashCode() * 31, 31, this.f60266b);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return this.f60273i.hashCode() + androidx.appcompat.app.r.e(this.f60272h, (this.f60271g.hashCode() + ((this.f60270f.hashCode() + androidx.appcompat.app.r.d(this.f60269e, androidx.appcompat.app.r.d(this.f60268d, androidx.appcompat.app.r.d(this.f60267c, iA2, 31), 31), 31)) * 31)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccordionStyle(titleTextStyle=");
        sb2.append(this.f60265a);
        sb2.append(", contentTextStyle=");
        sb2.append(this.f60266b);
        sb2.append(", contentPaddingTop=");
        H.u(this.f60267c, ", paddingBottom=", sb2);
        H.u(this.f60268d, ", arrowTextSpacing=", sb2);
        H.u(this.f60269e, ", arrowInsets=", sb2);
        sb2.append(this.f60270f);
        sb2.append(", spinnerStyle=");
        sb2.append(this.f60271g);
        sb2.append(", animationDuration=");
        sb2.append(this.f60272h);
        sb2.append(", easing=");
        sb2.append(this.f60273i);
        sb2.append(')');
        return sb2.toString();
    }
}
