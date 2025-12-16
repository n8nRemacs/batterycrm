package com.akita.compose.component.toast_bar;

import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ToastBarStyle.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/akita/compose/component/toast_bar/J;", "", "Lcom/akita/compose/foundation/r;", "textStyle", "Lcom/akita/compose/component/button/t;", "buttonStyle", "Lcom/akita/compose/foundation/p;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/h;", "cornerRadius", "textHorizontalOffset", "textVerticalOffset", "Landroidx/compose/foundation/layout/T1;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "leftItemToTextPadding", "rightItemToTextHorizontalPadding", "rightItemToTextVerticalPadding", "leftItemHorizontalOffset", "rightItemHorizontalOffset", "textPaddingBottom", "<init>", "(Lcom/akita/compose/foundation/r;Lcom/akita/compose/component/button/t;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;FFFLandroidx/compose/foundation/layout/T1;Landroidx/compose/foundation/layout/T1;FFFFFFLkotlin/jvm/internal/w;)V", "toast-bar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.r f63215a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.button.t f63216b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f63217c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f63218d;

    /* renamed from: e, reason: collision with root package name */
    public final float f63219e;

    /* renamed from: f, reason: collision with root package name */
    public final float f63220f;

    /* renamed from: g, reason: collision with root package name */
    public final float f63221g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final T1 f63222h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final T1 f63223i;

    /* renamed from: j, reason: collision with root package name */
    public final float f63224j;

    /* renamed from: k, reason: collision with root package name */
    public final float f63225k;

    /* renamed from: l, reason: collision with root package name */
    public final float f63226l;

    /* renamed from: m, reason: collision with root package name */
    public final float f63227m;

    /* renamed from: n, reason: collision with root package name */
    public final float f63228n;

    /* renamed from: o, reason: collision with root package name */
    public final float f63229o;

    public J(com.akita.compose.foundation.r rVar, com.akita.compose.component.button.t tVar, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, float f12, float f13, float f14, T1 t12, T1 t13, float f15, float f16, float f17, float f18, float f19, float f22, C42822w c42822w) {
        this.f63215a = rVar;
        this.f63216b = tVar;
        this.f63217c = pVar;
        this.f63218d = pVar2;
        this.f63219e = f12;
        this.f63220f = f13;
        this.f63221g = f14;
        this.f63222h = t12;
        this.f63223i = t13;
        this.f63224j = f15;
        this.f63225k = f16;
        this.f63226l = f17;
        this.f63227m = f18;
        this.f63228n = f19;
        this.f63229o = f22;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j12 = (J) obj;
        return L.f(this.f63215a, j12.f63215a) && L.f(this.f63216b, j12.f63216b) && L.f(this.f63217c, j12.f63217c) && L.f(this.f63218d, j12.f63218d) && androidx.compose.ui.unit.h.b(this.f63219e, j12.f63219e) && androidx.compose.ui.unit.h.b(this.f63220f, j12.f63220f) && androidx.compose.ui.unit.h.b(this.f63221g, j12.f63221g) && L.f(this.f63222h, j12.f63222h) && L.f(this.f63223i, j12.f63223i) && androidx.compose.ui.unit.h.b(this.f63224j, j12.f63224j) && androidx.compose.ui.unit.h.b(this.f63225k, j12.f63225k) && androidx.compose.ui.unit.h.b(this.f63226l, j12.f63226l) && androidx.compose.ui.unit.h.b(this.f63227m, j12.f63227m) && androidx.compose.ui.unit.h.b(this.f63228n, j12.f63228n) && androidx.compose.ui.unit.h.b(this.f63229o, j12.f63229o);
    }

    public final int hashCode() {
        int iB2 = com.akita.compose.component.accordion.s.b(this.f63218d, com.akita.compose.component.accordion.s.b(this.f63217c, (this.f63216b.hashCode() + (this.f63215a.hashCode() * 31)) * 31, 31), 31);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f63229o) + androidx.appcompat.app.r.d(this.f63228n, androidx.appcompat.app.r.d(this.f63227m, androidx.appcompat.app.r.d(this.f63226l, androidx.appcompat.app.r.d(this.f63225k, androidx.appcompat.app.r.d(this.f63224j, (this.f63223i.hashCode() + ((this.f63222h.hashCode() + androidx.appcompat.app.r.d(this.f63221g, androidx.appcompat.app.r.d(this.f63220f, androidx.appcompat.app.r.d(this.f63219e, iB2, 31), 31), 31)) * 31)) * 31, 31), 31), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToastBarStyle(textStyle=");
        sb2.append(this.f63215a);
        sb2.append(", buttonStyle=");
        sb2.append(this.f63216b);
        sb2.append(", backgroundColor=");
        sb2.append(this.f63217c);
        sb2.append(", contentColor=");
        sb2.append(this.f63218d);
        sb2.append(", cornerRadius=");
        androidx.compose.foundation.H.u(this.f63219e, ", textHorizontalOffset=", sb2);
        androidx.compose.foundation.H.u(this.f63220f, ", textVerticalOffset=", sb2);
        androidx.compose.foundation.H.u(this.f63221g, ", padding=", sb2);
        sb2.append(this.f63222h);
        sb2.append(", margin=");
        sb2.append(this.f63223i);
        sb2.append(", leftItemToTextPadding=");
        androidx.compose.foundation.H.u(this.f63224j, ", rightItemToTextHorizontalPadding=", sb2);
        androidx.compose.foundation.H.u(this.f63225k, ", rightItemToTextVerticalPadding=", sb2);
        androidx.compose.foundation.H.u(this.f63226l, ", leftItemHorizontalOffset=", sb2);
        androidx.compose.foundation.H.u(this.f63227m, ", rightItemHorizontalOffset=", sb2);
        androidx.compose.foundation.H.u(this.f63228n, ", textPaddingBottom=", sb2);
        return androidx.compose.foundation.H.h(')', this.f63229o, sb2);
    }
}
