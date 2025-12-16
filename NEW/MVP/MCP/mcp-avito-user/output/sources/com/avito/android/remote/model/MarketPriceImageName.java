package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketPriceImageName.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/MarketPriceImageName;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "LOWEST", "LOW", "NORMAL", "HIGH", "HIGHEST", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MarketPriceImageName implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MarketPriceImageName[] $VALUES;

    @k
    public static final Parcelable.Creator<MarketPriceImageName> CREATOR;

    @c("lowest")
    public static final MarketPriceImageName LOWEST = new MarketPriceImageName("LOWEST", 0);

    @c(Constants.LOW)
    public static final MarketPriceImageName LOW = new MarketPriceImageName("LOW", 1);

    @c(Constants.NORMAL)
    public static final MarketPriceImageName NORMAL = new MarketPriceImageName("NORMAL", 2);

    @c(Constants.HIGH)
    public static final MarketPriceImageName HIGH = new MarketPriceImageName("HIGH", 3);

    @c("highest")
    public static final MarketPriceImageName HIGHEST = new MarketPriceImageName("HIGHEST", 4);

    private static final /* synthetic */ MarketPriceImageName[] $values() {
        return new MarketPriceImageName[]{LOWEST, LOW, NORMAL, HIGH, HIGHEST};
    }

    static {
        MarketPriceImageName[] marketPriceImageNameArr$values = $values();
        $VALUES = marketPriceImageNameArr$values;
        $ENTRIES = kotlin.enums.c.a(marketPriceImageNameArr$values);
        CREATOR = new Parcelable.Creator<MarketPriceImageName>() { // from class: com.avito.android.remote.model.MarketPriceImageName.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MarketPriceImageName createFromParcel(@k Parcel parcel) {
                return MarketPriceImageName.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MarketPriceImageName[] newArray(int i12) {
                return new MarketPriceImageName[i12];
            }
        };
    }

    private MarketPriceImageName(String str, int i12) {
    }

    @k
    public static a<MarketPriceImageName> getEntries() {
        return $ENTRIES;
    }

    public static MarketPriceImageName valueOf(String str) {
        return (MarketPriceImageName) Enum.valueOf(MarketPriceImageName.class, str);
    }

    public static MarketPriceImageName[] values() {
        return (MarketPriceImageName[]) $VALUES.clone();
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
