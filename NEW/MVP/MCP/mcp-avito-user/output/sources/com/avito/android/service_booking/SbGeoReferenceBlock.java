package com.avito.android.service_booking;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlock.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/avito/android/service_booking/SbGeoReferenceBlock;", "Lcom/avito/android/service_booking/ServiceBookingBlock;", "", "title", AddressParameter.TYPE, "", "Lcom/avito/android/remote/model/GeoReference;", "geoReferences", "Lcom/avito/android/service_booking/SbGeoReferenceBlock$SbRedirectMap;", "redirectMap", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/service_booking/SbGeoReferenceBlock$SbRedirectMap;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/avito/android/service_booking/SbGeoReferenceBlock$SbRedirectMap;", "e", "()Lcom/avito/android/service_booking/SbGeoReferenceBlock$SbRedirectMap;", "SbRedirectMap", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbGeoReferenceBlock implements ServiceBookingBlock {

    @k
    public static final Parcelable.Creator<SbGeoReferenceBlock> CREATOR = new a();

    @c(AddressParameter.TYPE)
    @l
    private final String address;

    @c("geoReferences")
    @l
    private final List<GeoReference> geoReferences;

    @c("redirectMap")
    @l
    private final SbRedirectMap redirectMap;

    @c("title")
    @l
    private final String title;

    /* compiled from: ServiceBookingBlock.kt */
    @d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/service_booking/SbGeoReferenceBlock$SbRedirectMap;", "Landroid/os/Parcelable;", "", AddressParameter.TYPE, "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SbRedirectMap implements Parcelable {

        @k
        public static final Parcelable.Creator<SbRedirectMap> CREATOR = new a();

        @c("text")
        @l
        private final String address;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        /* compiled from: ServiceBookingBlock.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SbRedirectMap> {
            @Override // android.os.Parcelable.Creator
            public final SbRedirectMap createFromParcel(Parcel parcel) {
                return new SbRedirectMap(parcel.readString(), (DeepLink) parcel.readParcelable(SbRedirectMap.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SbRedirectMap[] newArray(int i12) {
                return new SbRedirectMap[i12];
            }
        }

        public SbRedirectMap(@l String str, @l DeepLink deepLink) {
            this.address = str;
            this.uri = deepLink;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SbRedirectMap)) {
                return false;
            }
            SbRedirectMap sbRedirectMap = (SbRedirectMap) obj;
            return L.f(this.address, sbRedirectMap.address) && L.f(this.uri, sbRedirectMap.uri);
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        public final int hashCode() {
            String str = this.address;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            DeepLink deepLink = this.uri;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SbRedirectMap(address=");
            sb2.append(this.address);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.address);
            parcel.writeParcelable(this.uri, i12);
        }
    }

    /* compiled from: ServiceBookingBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SbGeoReferenceBlock> {
        @Override // android.os.Parcelable.Creator
        public final SbGeoReferenceBlock createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(SbGeoReferenceBlock.class, parcel, arrayList, iL2, 1);
                }
            }
            return new SbGeoReferenceBlock(string, string2, arrayList, parcel.readInt() != 0 ? SbRedirectMap.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SbGeoReferenceBlock[] newArray(int i12) {
            return new SbGeoReferenceBlock[i12];
        }
    }

    public SbGeoReferenceBlock(@l String str, @l String str2, @l List<GeoReference> list, @l SbRedirectMap sbRedirectMap) {
        this.title = str;
        this.address = str2;
        this.geoReferences = list;
        this.redirectMap = sbRedirectMap;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    public final List<GeoReference> d() {
        return this.geoReferences;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final SbRedirectMap getRedirectMap() {
        return this.redirectMap;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SbGeoReferenceBlock)) {
            return false;
        }
        SbGeoReferenceBlock sbGeoReferenceBlock = (SbGeoReferenceBlock) obj;
        return L.f(this.title, sbGeoReferenceBlock.title) && L.f(this.address, sbGeoReferenceBlock.address) && L.f(this.geoReferences, sbGeoReferenceBlock.geoReferences) && L.f(this.redirectMap, sbGeoReferenceBlock.redirectMap);
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<GeoReference> list = this.geoReferences;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        SbRedirectMap sbRedirectMap = this.redirectMap;
        return iHashCode3 + (sbRedirectMap != null ? sbRedirectMap.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SbGeoReferenceBlock(title=" + this.title + ", address=" + this.address + ", geoReferences=" + this.geoReferences + ", redirectMap=" + this.redirectMap + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.address);
        List<GeoReference> list = this.geoReferences;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        SbRedirectMap sbRedirectMap = this.redirectMap;
        if (sbRedirectMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sbRedirectMap.writeToParcel(parcel, i12);
        }
    }
}
