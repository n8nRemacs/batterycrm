package com.avito.android.mortgage.landing.list.items.offers.offer;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.mortgage.api.model.OfferBadge;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OfferItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/offer/OfferItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OfferItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<OfferItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f199846b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f199847c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f199848d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f199849e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AttributedText f199850f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<OfferBadge> f199851g;

    /* compiled from: OfferItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OfferItem> {
        @Override // android.os.Parcelable.Creator
        public final OfferItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(OfferItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(OfferBadge.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new OfferItem(string, attributedText, z12, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OfferItem[] newArray(int i12) {
            return new OfferItem[i12];
        }
    }

    public OfferItem(@k String str, @k AttributedText attributedText, boolean z12, @l String str2, @k String str3, @k List list) {
        this.f199846b = str;
        this.f199847c = z12;
        this.f199848d = str2;
        this.f199849e = str3;
        this.f199850f = attributedText;
        this.f199851g = list;
    }

    public static OfferItem a(OfferItem offerItem, boolean z12) {
        return new OfferItem(offerItem.f199846b, offerItem.f199850f, z12, offerItem.f199848d, offerItem.f199849e, offerItem.f199851g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferItem)) {
            return false;
        }
        OfferItem offerItem = (OfferItem) obj;
        return L.f(this.f199846b, offerItem.f199846b) && this.f199847c == offerItem.f199847c && L.f(this.f199848d, offerItem.f199848d) && L.f(this.f199849e, offerItem.f199849e) && L.f(this.f199850f, offerItem.f199850f) && L.f(this.f199851g, offerItem.f199851g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395927q() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF395940h() {
        return this.f199846b;
    }

    public final int hashCode() {
        int i12 = r.i(this.f199846b.hashCode() * 31, 31, this.f199847c);
        String str = this.f199848d;
        return this.f199851g.hashCode() + com.avito.android.actions_sheet.a.b(H.d((i12 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f199849e), 31, this.f199850f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OfferItem(stringId=");
        sb2.append(this.f199846b);
        sb2.append(", isChecked=");
        sb2.append(this.f199847c);
        sb2.append(", icon=");
        sb2.append(this.f199848d);
        sb2.append(", title=");
        sb2.append(this.f199849e);
        sb2.append(", subtitle=");
        sb2.append(this.f199850f);
        sb2.append(", badges=");
        return H.p(sb2, this.f199851g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f199846b);
        parcel.writeInt(this.f199847c ? 1 : 0);
        parcel.writeString(this.f199848d);
        parcel.writeString(this.f199849e);
        parcel.writeParcelable(this.f199850f, i12);
        Iterator itJ = C0.j(this.f199851g, parcel);
        while (itJ.hasNext()) {
            ((OfferBadge) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
