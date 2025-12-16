package com.avito.android.tariff.cpx.info.items.card;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import uB0.C48873a;
import uB0.C48874b;
import uB0.C48875c;
import uB0.C48876d;
import uB0.C48877e;

/* compiled from: TariffCpxInfoCardItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/card/j;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C48874b f296450a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C48877e f296451b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C48876d f296452c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C48875c f296453d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C48873a f296454e;

    public j(@l C48874b c48874b, @l C48877e c48877e, @l C48876d c48876d, @l C48875c c48875c, @l C48873a c48873a) {
        this.f296450a = c48874b;
        this.f296451b = c48877e;
        this.f296452c = c48876d;
        this.f296453d = c48875c;
        this.f296454e = c48873a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f296450a, jVar.f296450a) && L.f(this.f296451b, jVar.f296451b) && L.f(this.f296452c, jVar.f296452c) && L.f(this.f296453d, jVar.f296453d) && L.f(this.f296454e, jVar.f296454e);
    }

    public final int hashCode() {
        C48874b c48874b = this.f296450a;
        int iHashCode = (c48874b == null ? 0 : c48874b.hashCode()) * 31;
        C48877e c48877e = this.f296451b;
        int iHashCode2 = (iHashCode + (c48877e == null ? 0 : c48877e.hashCode())) * 31;
        C48876d c48876d = this.f296452c;
        int iHashCode3 = (iHashCode2 + (c48876d == null ? 0 : c48876d.hashCode())) * 31;
        C48875c c48875c = this.f296453d;
        int iHashCode4 = (iHashCode3 + (c48875c == null ? 0 : c48875c.hashCode())) * 31;
        C48873a c48873a = this.f296454e;
        return iHashCode4 + (c48873a != null ? c48873a.f439841a.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "TariffCpxInfoItemContentItem(button=" + this.f296450a + ", text=" + this.f296451b + ", progress=" + this.f296452c + ", dottedText=" + this.f296453d + ", badge=" + this.f296454e + ')';
    }

    public /* synthetic */ j(C48874b c48874b, C48877e c48877e, C48876d c48876d, C48875c c48875c, C48873a c48873a, int i12, C42822w c42822w) {
        this(c48874b, c48877e, c48876d, c48875c, (i12 & 16) != 0 ? null : c48873a);
    }
}
