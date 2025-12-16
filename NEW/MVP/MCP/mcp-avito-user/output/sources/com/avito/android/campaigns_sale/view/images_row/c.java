package com.avito.android.campaigns_sale.view.images_row;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImagesRowMapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/view/images_row/c;", "", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f114443a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f114444b;

    /* renamed from: c, reason: collision with root package name */
    public final int f114445c;

    /* renamed from: d, reason: collision with root package name */
    public final int f114446d;

    /* renamed from: e, reason: collision with root package name */
    public final float f114447e;

    /* renamed from: f, reason: collision with root package name */
    public final int f114448f;

    /* renamed from: g, reason: collision with root package name */
    public final int f114449g;

    public c(int i12, Integer num, int i13, int i14, float f12, int i15, int i16, int i17, C42822w c42822w) {
        i15 = (i17 & 32) != 0 ? y6.b(58) : i15;
        i16 = (i17 & 64) != 0 ? y6.b(4) : i16;
        this.f114443a = i12;
        this.f114444b = num;
        this.f114445c = i13;
        this.f114446d = i14;
        this.f114447e = f12;
        this.f114448f = i15;
        this.f114449g = i16;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f114443a == cVar.f114443a && L.f(this.f114444b, cVar.f114444b) && this.f114445c == cVar.f114445c && this.f114446d == cVar.f114446d && Float.compare(this.f114447e, cVar.f114447e) == 0 && this.f114448f == cVar.f114448f && this.f114449g == cVar.f114449g;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f114443a) * 31;
        Integer num = this.f114444b;
        return Integer.hashCode(this.f114449g) + r.e(this.f114448f, r.d(this.f114447e, r.e(this.f114446d, r.e(this.f114445c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImagesRowConfig(parentWidthDp=");
        sb2.append(this.f114443a);
        sb2.append(", rowOverlayColor=");
        sb2.append(this.f114444b);
        sb2.append(", counterOverlayColor=");
        sb2.append(this.f114445c);
        sb2.append(", placeholderColor=");
        sb2.append(this.f114446d);
        sb2.append(", overlayAlpha=");
        sb2.append(this.f114447e);
        sb2.append(", cellHeight=");
        sb2.append(this.f114448f);
        sb2.append(", interCellSpacing=");
        return r.t(sb2, this.f114449g, ')');
    }
}
