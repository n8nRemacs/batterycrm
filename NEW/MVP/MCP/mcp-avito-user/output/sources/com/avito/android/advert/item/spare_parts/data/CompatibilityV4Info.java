package com.avito.android.advert.item.spare_parts.data;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsV4Dto.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/data/CompatibilityV4Info;", "Landroid/os/Parcelable;", "GarageCompatibilityButton", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CompatibilityV4Info implements Parcelable {

    @k
    public static final Parcelable.Creator<CompatibilityV4Info> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f80423b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f80424c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f80425d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f80426e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f80427f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final GarageCompatibilityButton f80428g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f80429h;

    /* compiled from: SparePartsV4Dto.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/data/CompatibilityV4Info$GarageCompatibilityButton;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class GarageCompatibilityButton implements Parcelable {

        @k
        public static final Parcelable.Creator<GarageCompatibilityButton> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f80430b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f80431c;

        /* compiled from: SparePartsV4Dto.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GarageCompatibilityButton> {
            @Override // android.os.Parcelable.Creator
            public final GarageCompatibilityButton createFromParcel(Parcel parcel) {
                return new GarageCompatibilityButton(parcel.readString(), (DeepLink) parcel.readParcelable(GarageCompatibilityButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final GarageCompatibilityButton[] newArray(int i12) {
                return new GarageCompatibilityButton[i12];
            }
        }

        public GarageCompatibilityButton(@k String str, @l DeepLink deepLink) {
            this.f80430b = str;
            this.f80431c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GarageCompatibilityButton)) {
                return false;
            }
            GarageCompatibilityButton garageCompatibilityButton = (GarageCompatibilityButton) obj;
            return L.f(this.f80430b, garageCompatibilityButton.f80430b) && L.f(this.f80431c, garageCompatibilityButton.f80431c);
        }

        public final int hashCode() {
            int iHashCode = this.f80430b.hashCode() * 31;
            DeepLink deepLink = this.f80431c;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GarageCompatibilityButton(text=");
            sb2.append(this.f80430b);
            sb2.append(", action=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f80431c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f80430b);
            parcel.writeParcelable(this.f80431c, i12);
        }
    }

    /* compiled from: SparePartsV4Dto.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CompatibilityV4Info> {
        @Override // android.os.Parcelable.Creator
        public final CompatibilityV4Info createFromParcel(Parcel parcel) {
            return new CompatibilityV4Info(parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(CompatibilityV4Info.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(CompatibilityV4Info.class.getClassLoader()), parcel.readInt() == 0 ? null : GarageCompatibilityButton.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CompatibilityV4Info[] newArray(int i12) {
            return new CompatibilityV4Info[i12];
        }
    }

    public CompatibilityV4Info(@k String str, @l String str2, @l UniversalImage universalImage, @l String str3, @l DeepLink deepLink, @l GarageCompatibilityButton garageCompatibilityButton, @l String str4) {
        this.f80423b = str;
        this.f80424c = str2;
        this.f80425d = universalImage;
        this.f80426e = str3;
        this.f80427f = deepLink;
        this.f80428g = garageCompatibilityButton;
        this.f80429h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompatibilityV4Info)) {
            return false;
        }
        CompatibilityV4Info compatibilityV4Info = (CompatibilityV4Info) obj;
        return L.f(this.f80423b, compatibilityV4Info.f80423b) && L.f(this.f80424c, compatibilityV4Info.f80424c) && L.f(this.f80425d, compatibilityV4Info.f80425d) && L.f(this.f80426e, compatibilityV4Info.f80426e) && L.f(this.f80427f, compatibilityV4Info.f80427f) && L.f(this.f80428g, compatibilityV4Info.f80428g) && L.f(this.f80429h, compatibilityV4Info.f80429h);
    }

    public final int hashCode() {
        int iHashCode = this.f80423b.hashCode() * 31;
        String str = this.f80424c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UniversalImage universalImage = this.f80425d;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str2 = this.f80426e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f80427f;
        int iHashCode5 = (iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        GarageCompatibilityButton garageCompatibilityButton = this.f80428g;
        int iHashCode6 = (iHashCode5 + (garageCompatibilityButton == null ? 0 : garageCompatibilityButton.hashCode())) * 31;
        String str3 = this.f80429h;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompatibilityV4Info(title=");
        sb2.append(this.f80423b);
        sb2.append(", subtitle=");
        sb2.append(this.f80424c);
        sb2.append(", image=");
        sb2.append(this.f80425d);
        sb2.append(", rightIcon=");
        sb2.append(this.f80426e);
        sb2.append(", blockAction=");
        sb2.append(this.f80427f);
        sb2.append(", button=");
        sb2.append(this.f80428g);
        sb2.append(", disclaimer=");
        return C22026a.c(sb2, this.f80429h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f80423b);
        parcel.writeString(this.f80424c);
        parcel.writeParcelable(this.f80425d, i12);
        parcel.writeString(this.f80426e);
        parcel.writeParcelable(this.f80427f, i12);
        GarageCompatibilityButton garageCompatibilityButton = this.f80428g;
        if (garageCompatibilityButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            garageCompatibilityButton.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f80429h);
    }
}
