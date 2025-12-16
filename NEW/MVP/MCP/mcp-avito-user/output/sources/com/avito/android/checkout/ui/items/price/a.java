package com.avito.android.checkout.ui.items.price;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckoutPriceItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/ui/items/price/a;", "Lcom/avito/conveyor_item/a;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f118405b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f118406c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f118407d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f118408e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ArrayList f118409f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f118410g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f118411h;

    public a(@k String str, @k AttributedText attributedText, @k AttributedText attributedText2, @l String str2, @l ArrayList arrayList, boolean z12, @l AttributedText attributedText3) {
        this.f118405b = str;
        this.f118406c = attributedText;
        this.f118407d = attributedText2;
        this.f118408e = str2;
        this.f118409f = arrayList;
        this.f118410g = z12;
        this.f118411h = attributedText3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f118405b, aVar.f118405b) && L.f(this.f118406c, aVar.f118406c) && L.f(this.f118407d, aVar.f118407d) && L.f(this.f118408e, aVar.f118408e) && L.f(this.f118409f, aVar.f118409f) && this.f118410g == aVar.f118410g && L.f(this.f118411h, aVar.f118411h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113512b() {
        return getF112843b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF112843b() {
        return this.f118405b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(this.f118405b.hashCode() * 31, 31, this.f118406c), 31, this.f118407d);
        String str = this.f118408e;
        int iHashCode = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        ArrayList arrayList = this.f118409f;
        int i12 = r.i((iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31, 31, this.f118410g);
        AttributedText attributedText = this.f118411h;
        return i12 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckoutPriceItem(stringId=");
        sb2.append(this.f118405b);
        sb2.append(", title=");
        sb2.append(this.f118406c);
        sb2.append(", price=");
        sb2.append(this.f118407d);
        sb2.append(", oldPrice=");
        sb2.append(this.f118408e);
        sb2.append(", dropDownItems=");
        sb2.append(this.f118409f);
        sb2.append(", isFullFillLine=");
        sb2.append(this.f118410g);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f118411h, ')');
    }
}
