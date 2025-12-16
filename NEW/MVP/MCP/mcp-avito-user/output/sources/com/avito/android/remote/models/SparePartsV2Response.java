package com.avito.android.remote.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsV2Response.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/models/SparePartsV2Response;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/models/SparePartsResponse;", "Lcom/avito/android/remote/models/PartsCompatibility;", "partsCompatibility", "Lcom/avito/android/remote/models/SparePartsV2Response$GarageCompatibility;", "garageCompatibility", "<init>", "(Lcom/avito/android/remote/models/SparePartsResponse;Lcom/avito/android/remote/models/SparePartsV2Response$GarageCompatibility;)V", "Lcom/avito/android/remote/models/SparePartsResponse;", "getPartsCompatibility", "()Lcom/avito/android/remote/models/SparePartsResponse;", "Lcom/avito/android/remote/models/SparePartsV2Response$GarageCompatibility;", "c", "()Lcom/avito/android/remote/models/SparePartsV2Response$GarageCompatibility;", "GarageCompatibility", "StatusType", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SparePartsV2Response implements Parcelable {

    @k
    public static final Parcelable.Creator<SparePartsV2Response> CREATOR = new a();

    @c("garageCompatibility")
    @l
    private final GarageCompatibility garageCompatibility;

    @c("partsCompatibility")
    @l
    private final SparePartsResponse partsCompatibility;

    /* compiled from: SparePartsV2Response.kt */
    @d
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/models/SparePartsV2Response$GarageCompatibility;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/models/SparePartsV2Response$StatusType;", "status", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "title", "subtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "blockAction", "rightIconAction", "<init>", "(Lcom/avito/android/remote/models/SparePartsV2Response$StatusType;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/remote/models/SparePartsV2Response$StatusType;", "e", "()Lcom/avito/android/remote/models/SparePartsV2Response$StatusType;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "d", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GarageCompatibility implements Parcelable {

        @k
        public static final Parcelable.Creator<GarageCompatibility> CREATOR = new a();

        @c("blockAction")
        @l
        private final DeepLink blockAction;

        @c("image")
        @l
        private final UniversalImage image;

        @c("rightIconAction")
        @l
        private final DeepLink rightIconAction;

        @c("status")
        @l
        private final StatusType status;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @l
        private final String title;

        /* compiled from: SparePartsV2Response.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GarageCompatibility> {
            @Override // android.os.Parcelable.Creator
            public final GarageCompatibility createFromParcel(Parcel parcel) {
                return new GarageCompatibility(parcel.readInt() == 0 ? null : StatusType.valueOf(parcel.readString()), (UniversalImage) parcel.readParcelable(GarageCompatibility.class.getClassLoader()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(GarageCompatibility.class.getClassLoader()), (DeepLink) parcel.readParcelable(GarageCompatibility.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final GarageCompatibility[] newArray(int i12) {
                return new GarageCompatibility[i12];
            }
        }

        public GarageCompatibility(@l StatusType statusType, @l UniversalImage universalImage, @l String str, @l String str2, @l DeepLink deepLink, @l DeepLink deepLink2) {
            this.status = statusType;
            this.image = universalImage;
            this.title = str;
            this.subtitle = str2;
            this.blockAction = deepLink;
            this.rightIconAction = deepLink2;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final DeepLink getBlockAction() {
            return this.blockAction;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final DeepLink getRightIconAction() {
            return this.rightIconAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final StatusType getStatus() {
            return this.status;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GarageCompatibility)) {
                return false;
            }
            GarageCompatibility garageCompatibility = (GarageCompatibility) obj;
            return this.status == garageCompatibility.status && L.f(this.image, garageCompatibility.image) && L.f(this.title, garageCompatibility.title) && L.f(this.subtitle, garageCompatibility.subtitle) && L.f(this.blockAction, garageCompatibility.blockAction) && L.f(this.rightIconAction, garageCompatibility.rightIconAction);
        }

        @l
        public final UniversalImage getImage() {
            return this.image;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            StatusType statusType = this.status;
            int iHashCode = (statusType == null ? 0 : statusType.hashCode()) * 31;
            UniversalImage universalImage = this.image;
            int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
            String str = this.title;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.blockAction;
            int iHashCode5 = (iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            DeepLink deepLink2 = this.rightIconAction;
            return iHashCode5 + (deepLink2 != null ? deepLink2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GarageCompatibility(status=");
            sb2.append(this.status);
            sb2.append(", image=");
            sb2.append(this.image);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", blockAction=");
            sb2.append(this.blockAction);
            sb2.append(", rightIconAction=");
            return com.avito.android.actions_sheet.a.v(sb2, this.rightIconAction, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            StatusType statusType = this.status;
            if (statusType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(statusType.name());
            }
            parcel.writeParcelable(this.image, i12);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.blockAction, i12);
            parcel.writeParcelable(this.rightIconAction, i12);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SparePartsV2Response.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/models/SparePartsV2Response$StatusType;", "", "(Ljava/lang/String;I)V", "COMPATIBLE", GrsBaseInfo.CountryCodeSource.UNKNOWN, "NO_CAR", "NO_DATA", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StatusType {

        @c("compatible")
        public static final StatusType COMPATIBLE;

        @c("noCar")
        public static final StatusType NO_CAR;

        @c("noData")
        public static final StatusType NO_DATA;

        @c("unknown")
        public static final StatusType UNKNOWN;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ StatusType[] f253950b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f253951c;

        static {
            StatusType statusType = new StatusType("COMPATIBLE", 0);
            COMPATIBLE = statusType;
            StatusType statusType2 = new StatusType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1);
            UNKNOWN = statusType2;
            StatusType statusType3 = new StatusType("NO_CAR", 2);
            NO_CAR = statusType3;
            StatusType statusType4 = new StatusType("NO_DATA", 3);
            NO_DATA = statusType4;
            StatusType[] statusTypeArr = {statusType, statusType2, statusType3, statusType4};
            f253950b = statusTypeArr;
            f253951c = kotlin.enums.c.a(statusTypeArr);
        }

        private StatusType(String str, int i12) {
        }

        public static StatusType valueOf(String str) {
            return (StatusType) Enum.valueOf(StatusType.class, str);
        }

        public static StatusType[] values() {
            return (StatusType[]) f253950b.clone();
        }
    }

    /* compiled from: SparePartsV2Response.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SparePartsV2Response> {
        @Override // android.os.Parcelable.Creator
        public final SparePartsV2Response createFromParcel(Parcel parcel) {
            return new SparePartsV2Response(parcel.readInt() == 0 ? null : SparePartsResponse.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GarageCompatibility.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SparePartsV2Response[] newArray(int i12) {
            return new SparePartsV2Response[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SparePartsV2Response() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final GarageCompatibility getGarageCompatibility() {
        return this.garageCompatibility;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SparePartsV2Response)) {
            return false;
        }
        SparePartsV2Response sparePartsV2Response = (SparePartsV2Response) obj;
        return L.f(this.partsCompatibility, sparePartsV2Response.partsCompatibility) && L.f(this.garageCompatibility, sparePartsV2Response.garageCompatibility);
    }

    public final int hashCode() {
        SparePartsResponse sparePartsResponse = this.partsCompatibility;
        int iHashCode = (sparePartsResponse == null ? 0 : sparePartsResponse.hashCode()) * 31;
        GarageCompatibility garageCompatibility = this.garageCompatibility;
        return iHashCode + (garageCompatibility != null ? garageCompatibility.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SparePartsV2Response(partsCompatibility=" + this.partsCompatibility + ", garageCompatibility=" + this.garageCompatibility + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        SparePartsResponse sparePartsResponse = this.partsCompatibility;
        if (sparePartsResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sparePartsResponse.writeToParcel(parcel, i12);
        }
        GarageCompatibility garageCompatibility = this.garageCompatibility;
        if (garageCompatibility == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            garageCompatibility.writeToParcel(parcel, i12);
        }
    }

    public SparePartsV2Response(@l SparePartsResponse sparePartsResponse, @l GarageCompatibility garageCompatibility) {
        this.partsCompatibility = sparePartsResponse;
        this.garageCompatibility = garageCompatibility;
    }

    public /* synthetic */ SparePartsV2Response(SparePartsResponse sparePartsResponse, GarageCompatibility garageCompatibility, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : sparePartsResponse, (i12 & 2) != 0 ? null : garageCompatibility);
    }
}
