package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileJobCompanyCarousel.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJt\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0013J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b)\u0010$J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b.\u0010/R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b\u0007\u0010\u0017R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b7\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b8\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b9\u0010\u0013R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010\u001e¨\u0006<"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileJobCompanyCarouselItem;", "Landroid/os/Parcelable;", "", AddressParameter.TYPE, "Lcom/avito/android/remote/model/ExtendedProfileCarouselContacts;", "contacts", "", "isFavorite", "", "Lcom/avito/android/remote/model/GeoReference;", "geoReferences", "location", "price", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfileCarouselContacts;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/ExtendedProfileCarouselContacts;", "component3", "()Z", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfileCarouselContacts;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/ExtendedProfileJobCompanyCarouselItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAddress", "Lcom/avito/android/remote/model/ExtendedProfileCarouselContacts;", "getContacts", "Z", "Ljava/util/List;", "getGeoReferences", "getLocation", "getPrice", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileJobCompanyCarouselItem implements Parcelable {

    @k
    public static final Parcelable.Creator<ExtendedProfileJobCompanyCarouselItem> CREATOR = new Creator();

    @c(AddressParameter.TYPE)
    @l
    private final String address;

    @c("contacts")
    @l
    private final ExtendedProfileCarouselContacts contacts;

    @c("geoReferences")
    @l
    private final List<GeoReference> geoReferences;

    @c("isFavorite")
    private final boolean isFavorite;

    @c("widgetName")
    @l
    private final String location;

    @c("price")
    @l
    private final String price;

    @c("title")
    @l
    private final String title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* compiled from: ExtendedProfileJobCompanyCarousel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileJobCompanyCarouselItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileJobCompanyCarouselItem createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            ArrayList arrayList = null;
            ExtendedProfileCarouselContacts extendedProfileCarouselContactsCreateFromParcel = parcel.readInt() == 0 ? null : ExtendedProfileCarouselContacts.CREATOR.createFromParcel(parcel);
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = a.l(ExtendedProfileJobCompanyCarouselItem.class, parcel, arrayList, iL2, 1);
                }
            }
            return new ExtendedProfileJobCompanyCarouselItem(string, extendedProfileCarouselContactsCreateFromParcel, z12, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ExtendedProfileJobCompanyCarouselItem.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileJobCompanyCarouselItem[] newArray(int i12) {
            return new ExtendedProfileJobCompanyCarouselItem[i12];
        }
    }

    public ExtendedProfileJobCompanyCarouselItem(@l String str, @l ExtendedProfileCarouselContacts extendedProfileCarouselContacts, boolean z12, @l List<GeoReference> list, @l String str2, @l String str3, @l String str4, @l DeepLink deepLink) {
        this.address = str;
        this.contacts = extendedProfileCarouselContacts;
        this.isFavorite = z12;
        this.geoReferences = list;
        this.location = str2;
        this.price = str3;
        this.title = str4;
        this.uri = deepLink;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final ExtendedProfileCarouselContacts getContacts() {
        return this.contacts;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @l
    public final List<GeoReference> component4() {
        return this.geoReferences;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    @k
    public final ExtendedProfileJobCompanyCarouselItem copy(@l String address, @l ExtendedProfileCarouselContacts contacts, boolean isFavorite, @l List<GeoReference> geoReferences, @l String location, @l String price, @l String title, @l DeepLink uri) {
        return new ExtendedProfileJobCompanyCarouselItem(address, contacts, isFavorite, geoReferences, location, price, title, uri);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileJobCompanyCarouselItem)) {
            return false;
        }
        ExtendedProfileJobCompanyCarouselItem extendedProfileJobCompanyCarouselItem = (ExtendedProfileJobCompanyCarouselItem) other;
        return L.f(this.address, extendedProfileJobCompanyCarouselItem.address) && L.f(this.contacts, extendedProfileJobCompanyCarouselItem.contacts) && this.isFavorite == extendedProfileJobCompanyCarouselItem.isFavorite && L.f(this.geoReferences, extendedProfileJobCompanyCarouselItem.geoReferences) && L.f(this.location, extendedProfileJobCompanyCarouselItem.location) && L.f(this.price, extendedProfileJobCompanyCarouselItem.price) && L.f(this.title, extendedProfileJobCompanyCarouselItem.title) && L.f(this.uri, extendedProfileJobCompanyCarouselItem.uri);
    }

    @l
    public final String getAddress() {
        return this.address;
    }

    @l
    public final ExtendedProfileCarouselContacts getContacts() {
        return this.contacts;
    }

    @l
    public final List<GeoReference> getGeoReferences() {
        return this.geoReferences;
    }

    @l
    public final String getLocation() {
        return this.location;
    }

    @l
    public final String getPrice() {
        return this.price;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final DeepLink getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.address;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ExtendedProfileCarouselContacts extendedProfileCarouselContacts = this.contacts;
        int i12 = r.i((iHashCode + (extendedProfileCarouselContacts == null ? 0 : extendedProfileCarouselContacts.hashCode())) * 31, 31, this.isFavorite);
        List<GeoReference> list = this.geoReferences;
        int iHashCode2 = (i12 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.location;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.price;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DeepLink deepLink = this.uri;
        return iHashCode5 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileJobCompanyCarouselItem(address=");
        sb2.append(this.address);
        sb2.append(", contacts=");
        sb2.append(this.contacts);
        sb2.append(", isFavorite=");
        sb2.append(this.isFavorite);
        sb2.append(", geoReferences=");
        sb2.append(this.geoReferences);
        sb2.append(", location=");
        sb2.append(this.location);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", uri=");
        return a.v(sb2, this.uri, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.address);
        ExtendedProfileCarouselContacts extendedProfileCarouselContacts = this.contacts;
        if (extendedProfileCarouselContacts == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            extendedProfileCarouselContacts.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isFavorite ? 1 : 0);
        List<GeoReference> list = this.geoReferences;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.location);
        parcel.writeString(this.price);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.uri, flags);
    }
}
