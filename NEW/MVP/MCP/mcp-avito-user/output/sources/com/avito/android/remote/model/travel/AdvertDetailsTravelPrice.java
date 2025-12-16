package com.avito.android.remote.model.travel;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: AdvertDetailsTravelPrice.kt */
@d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/travel/AdvertDetailsTravelPrice;", "Landroid/os/Parcelable;", "", "price", "oldPrice", "discount", "subTitle", "Lcom/avito/android/remote/model/travel/AdvertDetailsTravelPrice$Version;", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/travel/AdvertDetailsTravelPrice$Version;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPrice", "()Ljava/lang/String;", "getOldPrice", "getDiscount", "getSubTitle", "Lcom/avito/android/remote/model/travel/AdvertDetailsTravelPrice$Version;", "getVersion", "()Lcom/avito/android/remote/model/travel/AdvertDetailsTravelPrice$Version;", "Version", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertDetailsTravelPrice implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDetailsTravelPrice> CREATOR = new Creator();

    @c("discount")
    @l
    private final String discount;

    @c("oldPrice")
    @l
    private final String oldPrice;

    @c("price")
    @l
    private final String price;

    @c("subTitle")
    @l
    private final String subTitle;

    @c("version")
    @l
    private final Version version;

    /* compiled from: AdvertDetailsTravelPrice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertDetailsTravelPrice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsTravelPrice createFromParcel(@k Parcel parcel) {
            return new AdvertDetailsTravelPrice(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Version.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsTravelPrice[] newArray(int i12) {
            return new AdvertDetailsTravelPrice[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertDetailsTravelPrice.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/travel/AdvertDetailsTravelPrice$Version;", "", "(Ljava/lang/String;I)V", "NewPrice1Discount1", "NewPrice1Discount2", "NewPrice2Discount1", "NewPrice2Discount2", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Version {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Version[] $VALUES;

        @c("NewPrice1Discount1")
        public static final Version NewPrice1Discount1 = new Version("NewPrice1Discount1", 0);

        @c("NewPrice1Discount2")
        public static final Version NewPrice1Discount2 = new Version("NewPrice1Discount2", 1);

        @c("NewPrice2Discount1")
        public static final Version NewPrice2Discount1 = new Version("NewPrice2Discount1", 2);

        @c("NewPrice2Discount2")
        public static final Version NewPrice2Discount2 = new Version("NewPrice2Discount2", 3);

        private static final /* synthetic */ Version[] $values() {
            return new Version[]{NewPrice1Discount1, NewPrice1Discount2, NewPrice2Discount1, NewPrice2Discount2};
        }

        static {
            Version[] versionArr$values = $values();
            $VALUES = versionArr$values;
            $ENTRIES = kotlin.enums.c.a(versionArr$values);
        }

        private Version(String str, int i12) {
        }

        @k
        public static a<Version> getEntries() {
            return $ENTRIES;
        }

        public static Version valueOf(String str) {
            return (Version) Enum.valueOf(Version.class, str);
        }

        public static Version[] values() {
            return (Version[]) $VALUES.clone();
        }
    }

    public AdvertDetailsTravelPrice(@l String str, @l String str2, @l String str3, @l String str4, @l Version version) {
        this.price = str;
        this.oldPrice = str2;
        this.discount = str3;
        this.subTitle = str4;
        this.version = version;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getDiscount() {
        return this.discount;
    }

    @l
    public final String getOldPrice() {
        return this.oldPrice;
    }

    @l
    public final String getPrice() {
        return this.price;
    }

    @l
    public final String getSubTitle() {
        return this.subTitle;
    }

    @l
    public final Version getVersion() {
        return this.version;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.price);
        parcel.writeString(this.oldPrice);
        parcel.writeString(this.discount);
        parcel.writeString(this.subTitle);
        Version version = this.version;
        if (version == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(version.name());
        }
    }
}
