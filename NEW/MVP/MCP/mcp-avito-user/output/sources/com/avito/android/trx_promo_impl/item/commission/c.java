package com.avito.android.trx_promo_impl.item.commission;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoCommissionItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/item/commission/c;", "Lcom/avito/conveyor_item/a;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedText f304226b;

    /* renamed from: c, reason: collision with root package name */
    public int f304227c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f304228d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f304229e;

    /* renamed from: f, reason: collision with root package name */
    public final int f304230f;

    /* renamed from: g, reason: collision with root package name */
    public final int f304231g;

    /* renamed from: h, reason: collision with root package name */
    public final int f304232h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ArrayList f304233i;

    public c(@Y61.k AttributedText attributedText, int i12, @l String str, @Y61.k String str2, int i13, int i14, int i15, @Y61.k ArrayList arrayList) {
        this.f304226b = attributedText;
        this.f304227c = i12;
        this.f304228d = str;
        this.f304229e = str2;
        this.f304230f = i13;
        this.f304231g = i14;
        this.f304232h = i15;
        this.f304233i = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f304226b, cVar.f304226b) && this.f304227c == cVar.f304227c && L.f(this.f304228d, cVar.f304228d) && L.f(this.f304229e, cVar.f304229e) && this.f304230f == cVar.f304230f && this.f304231g == cVar.f304231g && this.f304232h == cVar.f304232h && this.f304233i.equals(cVar.f304233i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF117182c() {
        return -1565448704;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF330995b() {
        return "trx_promo_commission";
    }

    public final int hashCode() {
        int iE2 = r.e(this.f304227c, com.avito.android.actions_sheet.a.b(-1284269568, 31, this.f304226b), 31);
        String str = this.f304228d;
        return this.f304233i.hashCode() + r.e(this.f304232h, r.e(this.f304231g, r.e(this.f304230f, H.d((iE2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f304229e), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoCommissionItem(stringId=trx_promo_commission, title=");
        sb2.append(this.f304226b);
        sb2.append(", value=");
        sb2.append(this.f304227c);
        sb2.append(", valuePrefix=");
        sb2.append(this.f304228d);
        sb2.append(", valueSuffix=");
        sb2.append(this.f304229e);
        sb2.append(", step=");
        sb2.append(this.f304230f);
        sb2.append(", minValue=");
        sb2.append(this.f304231g);
        sb2.append(", maxValue=");
        sb2.append(this.f304232h);
        sb2.append(", valueRanges=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f304233i, ')');
    }
}
