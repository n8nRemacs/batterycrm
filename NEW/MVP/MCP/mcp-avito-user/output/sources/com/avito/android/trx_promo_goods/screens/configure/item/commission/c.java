package com.avito.android.trx_promo_goods.screens.configure.item.commission;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsConfigureCommissionItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/item/commission/c;", "Lcom/avito/conveyor_item/a;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f303487b;

    /* renamed from: c, reason: collision with root package name */
    public final float f303488c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f303489d;

    /* renamed from: e, reason: collision with root package name */
    public final float f303490e;

    /* renamed from: f, reason: collision with root package name */
    public final float f303491f;

    /* renamed from: g, reason: collision with root package name */
    public final float f303492g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ArrayList f303493h;

    public c(@k AttributedText attributedText, float f12, @k String str, float f13, float f14, float f15, @k ArrayList arrayList) {
        this.f303487b = attributedText;
        this.f303488c = f12;
        this.f303489d = str;
        this.f303490e = f13;
        this.f303491f = f14;
        this.f303492g = f15;
        this.f303493h = arrayList;
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
        return L.f(this.f303487b, cVar.f303487b) && Float.compare(this.f303488c, cVar.f303488c) == 0 && L.f(this.f303489d, cVar.f303489d) && Float.compare(this.f303490e, cVar.f303490e) == 0 && Float.compare(this.f303491f, cVar.f303491f) == 0 && Float.compare(this.f303492g, cVar.f303492g) == 0 && this.f303493h.equals(cVar.f303493h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return -1307756478;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF298293b() {
        return "trx_promo_goods_configure_commission";
    }

    public final int hashCode() {
        return this.f303493h.hashCode() + r.d(this.f303492g, r.d(this.f303491f, r.d(this.f303490e, H.d(r.d(this.f303488c, com.avito.android.actions_sheet.a.b(-1885745154, 31, this.f303487b), 31), 31, this.f303489d), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoGoodsConfigureCommissionItem(stringId=trx_promo_goods_configure_commission, title=");
        sb2.append(this.f303487b);
        sb2.append(", value=");
        sb2.append(this.f303488c);
        sb2.append(", valueSuffix=");
        sb2.append(this.f303489d);
        sb2.append(", step=");
        sb2.append(this.f303490e);
        sb2.append(", minValue=");
        sb2.append(this.f303491f);
        sb2.append(", maxValue=");
        sb2.append(this.f303492g);
        sb2.append(", valueRanges=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f303493h, ')');
    }
}
