package com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert.item.hotel.hotel_offer.AdvertDetailsHotelOffer;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsInnerOfferItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/inner_offer/AdvertDetailsInnerOfferItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Size", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsInnerOfferItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsInnerOfferItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f76032b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Size f76033c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<Image> f76034d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AttributedText f76035e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsHotelOffer.Installment f76036f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AttributedText f76037g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsHotelOffer.Action f76038h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final DeepLink f76039i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertDetailsInnerOfferItem.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/inner_offer/AdvertDetailsInnerOfferItem$Size;", "", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class Size implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Size> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        public static final Size f76040b;

        /* renamed from: c, reason: collision with root package name */
        public static final Size f76041c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Size[] f76042d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f76043e;

        /* compiled from: AdvertDetailsInnerOfferItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Size> {
            @Override // android.os.Parcelable.Creator
            public final Size createFromParcel(Parcel parcel) {
                return Size.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Size[] newArray(int i12) {
                return new Size[i12];
            }
        }

        static {
            Size size = new Size("SMALL", 0);
            f76040b = size;
            Size size2 = new Size("BIG", 1);
            f76041c = size2;
            Size[] sizeArr = {size, size2};
            f76042d = sizeArr;
            f76043e = kotlin.enums.c.a(sizeArr);
            CREATOR = new a();
        }

        public Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) f76042d.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AdvertDetailsInnerOfferItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsInnerOfferItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsInnerOfferItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Size sizeCreateFromParcel = Size.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsInnerOfferItem.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertDetailsInnerOfferItem(string, sizeCreateFromParcel, arrayList, (AttributedText) parcel.readParcelable(AdvertDetailsInnerOfferItem.class.getClassLoader()), parcel.readInt() == 0 ? null : AdvertDetailsHotelOffer.Installment.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(AdvertDetailsInnerOfferItem.class.getClassLoader()), AdvertDetailsHotelOffer.Action.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(AdvertDetailsInnerOfferItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsInnerOfferItem[] newArray(int i12) {
            return new AdvertDetailsInnerOfferItem[i12];
        }
    }

    public AdvertDetailsInnerOfferItem(@Y61.k String str, @Y61.k Size size, @Y61.k List<Image> list, @Y61.k AttributedText attributedText, @Y61.l AdvertDetailsHotelOffer.Installment installment, @Y61.k AttributedText attributedText2, @Y61.k AdvertDetailsHotelOffer.Action action, @Y61.k DeepLink deepLink) {
        this.f76032b = str;
        this.f76033c = size;
        this.f76034d = list;
        this.f76035e = attributedText;
        this.f76036f = installment;
        this.f76037g = attributedText2;
        this.f76038h = action;
        this.f76039i = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsInnerOfferItem)) {
            return false;
        }
        AdvertDetailsInnerOfferItem advertDetailsInnerOfferItem = (AdvertDetailsInnerOfferItem) obj;
        return L.f(this.f76032b, advertDetailsInnerOfferItem.f76032b) && this.f76033c == advertDetailsInnerOfferItem.f76033c && L.f(this.f76034d, advertDetailsInnerOfferItem.f76034d) && L.f(this.f76035e, advertDetailsInnerOfferItem.f76035e) && L.f(this.f76036f, advertDetailsInnerOfferItem.f76036f) && L.f(this.f76037g, advertDetailsInnerOfferItem.f76037g) && L.f(this.f76038h, advertDetailsInnerOfferItem.f76038h) && L.f(this.f76039i, advertDetailsInnerOfferItem.f76039i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74796b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF200606b() {
        return this.f76032b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(H.e((this.f76033c.hashCode() + (this.f76032b.hashCode() * 31)) * 31, 31, this.f76034d), 31, this.f76035e);
        AdvertDetailsHotelOffer.Installment installment = this.f76036f;
        return this.f76039i.hashCode() + ((this.f76038h.hashCode() + com.avito.android.actions_sheet.a.b((iB2 + (installment == null ? 0 : installment.hashCode())) * 31, 31, this.f76037g)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsInnerOfferItem(stringId=");
        sb2.append(this.f76032b);
        sb2.append(", size=");
        sb2.append(this.f76033c);
        sb2.append(", images=");
        sb2.append(this.f76034d);
        sb2.append(", price=");
        sb2.append(this.f76035e);
        sb2.append(", installments=");
        sb2.append(this.f76036f);
        sb2.append(", amenities=");
        sb2.append(this.f76037g);
        sb2.append(", actionButton=");
        sb2.append(this.f76038h);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f76039i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f76032b);
        this.f76033c.writeToParcel(parcel, i12);
        Iterator itJ = C0.j(this.f76034d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f76035e, i12);
        AdvertDetailsHotelOffer.Installment installment = this.f76036f;
        if (installment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installment.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f76037g, i12);
        this.f76038h.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f76039i, i12);
    }
}
