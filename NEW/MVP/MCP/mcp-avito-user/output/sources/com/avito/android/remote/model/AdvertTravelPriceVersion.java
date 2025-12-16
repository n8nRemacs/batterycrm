package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertTravelPriceVersion.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/AdvertTravelPriceVersion;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "NewPrice1Discount1", "NewPrice1Discount2", "NewPrice2Discount1", "NewPrice2Discount2", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertTravelPriceVersion implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdvertTravelPriceVersion[] $VALUES;

    @k
    public static final Parcelable.Creator<AdvertTravelPriceVersion> CREATOR;

    @c("NewPrice1Discount1")
    public static final AdvertTravelPriceVersion NewPrice1Discount1 = new AdvertTravelPriceVersion("NewPrice1Discount1", 0);

    @c("NewPrice1Discount2")
    public static final AdvertTravelPriceVersion NewPrice1Discount2 = new AdvertTravelPriceVersion("NewPrice1Discount2", 1);

    @c("NewPrice2Discount1")
    public static final AdvertTravelPriceVersion NewPrice2Discount1 = new AdvertTravelPriceVersion("NewPrice2Discount1", 2);

    @c("NewPrice2Discount2")
    public static final AdvertTravelPriceVersion NewPrice2Discount2 = new AdvertTravelPriceVersion("NewPrice2Discount2", 3);

    private static final /* synthetic */ AdvertTravelPriceVersion[] $values() {
        return new AdvertTravelPriceVersion[]{NewPrice1Discount1, NewPrice1Discount2, NewPrice2Discount1, NewPrice2Discount2};
    }

    static {
        AdvertTravelPriceVersion[] advertTravelPriceVersionArr$values = $values();
        $VALUES = advertTravelPriceVersionArr$values;
        $ENTRIES = kotlin.enums.c.a(advertTravelPriceVersionArr$values);
        CREATOR = new Parcelable.Creator<AdvertTravelPriceVersion>() { // from class: com.avito.android.remote.model.AdvertTravelPriceVersion.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AdvertTravelPriceVersion createFromParcel(@k Parcel parcel) {
                return AdvertTravelPriceVersion.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AdvertTravelPriceVersion[] newArray(int i12) {
                return new AdvertTravelPriceVersion[i12];
            }
        };
    }

    private AdvertTravelPriceVersion(String str, int i12) {
    }

    @k
    public static a<AdvertTravelPriceVersion> getEntries() {
        return $ENTRIES;
    }

    public static AdvertTravelPriceVersion valueOf(String str) {
        return (AdvertTravelPriceVersion) Enum.valueOf(AdvertTravelPriceVersion.class, str);
    }

    public static AdvertTravelPriceVersion[] values() {
        return (AdvertTravelPriceVersion[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(name());
    }
}
