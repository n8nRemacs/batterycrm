package com.avito.android.autoteka.items.directPurchase;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.autoteka.deeplinks.DirectPurchaseDetails;
import com.avito.android.autoteka.domain.AutotekaItems;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DirectPurchaseItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/directPurchase/c;", "Lcom/avito/conveyor_item/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96738b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f96739c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f96740d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DirectPurchaseDetails.Button f96741e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DirectPurchaseDetails.Button f96742f;

    public c(String str, String str2, AttributedText attributedText, DirectPurchaseDetails.Button button, DirectPurchaseDetails.Button button2, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_DIRECT_PURCHASE";
        }
        this.f96738b = str;
        this.f96739c = str2;
        this.f96740d = attributedText;
        this.f96741e = button;
        this.f96742f = button2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f96738b, cVar.f96738b) && L.f(this.f96739c, cVar.f96739c) && L.f(this.f96740d, cVar.f96740d) && L.f(this.f96741e, cVar.f96741e) && L.f(this.f96742f, cVar.f96742f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269930b() {
        return getF96738b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96738b() {
        return this.f96738b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f96738b.hashCode() * 31, 31, this.f96739c);
        AttributedText attributedText = this.f96740d;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        DirectPurchaseDetails.Button button = this.f96741e;
        int iHashCode2 = (iHashCode + (button == null ? 0 : button.hashCode())) * 31;
        DirectPurchaseDetails.Button button2 = this.f96742f;
        return iHashCode2 + (button2 != null ? button2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DirectPurchaseItem(stringId=" + this.f96738b + ", title=" + this.f96739c + ", description=" + this.f96740d + ", primaryButton=" + this.f96741e + ", secondaryButton=" + this.f96742f + ')';
    }
}
