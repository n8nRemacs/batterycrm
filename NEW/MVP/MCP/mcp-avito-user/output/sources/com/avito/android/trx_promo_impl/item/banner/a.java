package com.avito.android.trx_promo_impl.item.banner;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoBannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/item/banner/a;", "Lcom/avito/conveyor_item/a;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f304199b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f304200c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f304201d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ArrayList f304202e;

    public a(@InterfaceC42150f int i12, @k String str, @l AttributedText attributedText, @l ArrayList arrayList) {
        this.f304199b = i12;
        this.f304200c = str;
        this.f304201d = attributedText;
        this.f304202e = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return this.f304199b == aVar.f304199b && L.f(this.f304200c, aVar.f304200c) && L.f(this.f304201d, aVar.f304201d) && L.f(this.f304202e, aVar.f304202e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269870b() {
        return -1379468607;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF298268b() {
        return "trx_promo_banner";
    }

    public final int hashCode() {
        int iD2 = H.d(r.e(this.f304199b, 186146143, 31), 31, this.f304200c);
        AttributedText attributedText = this.f304201d;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ArrayList arrayList = this.f304202e;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoBannerItem(stringId=trx_promo_banner, styleAttr=");
        sb2.append(this.f304199b);
        sb2.append(", title=");
        sb2.append(this.f304200c);
        sb2.append(", description=");
        sb2.append(this.f304201d);
        sb2.append(", buttons=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f304202e, ')');
    }
}
