package com.avito.android.remote.model.advertising;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BuzzoolaRawResponse.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/advertising/BuzzoolaAdType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "AVITO_DIRECT_BANNER", "AVITO_PREMIUM_BANNER", "AVITO_PREMIUM_BANNER_V2", "AVITO_CREDIT_BUTTON", "AVITO_VIDEO_LENTA_NATIVE", "AVITO_VIDEO_LENTA_MEDIA", "AVITO_MAIN_MEDIA", "AVITO_MAIN_HTML", "AVITO_DIRECT_BANNER_HTML", "AVITO_PREMIUM_MEDIA_X2_BANNER", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BuzzoolaAdType implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BuzzoolaAdType[] $VALUES;

    @k
    public static final Parcelable.Creator<BuzzoolaAdType> CREATOR;

    @c("AVITO_DIRECT_BANNER")
    public static final BuzzoolaAdType AVITO_DIRECT_BANNER = new BuzzoolaAdType("AVITO_DIRECT_BANNER", 0);

    @c("AVITO_PREMIUM_BANNER")
    public static final BuzzoolaAdType AVITO_PREMIUM_BANNER = new BuzzoolaAdType("AVITO_PREMIUM_BANNER", 1);

    @c("AVITO_PREMIUM_V2")
    public static final BuzzoolaAdType AVITO_PREMIUM_BANNER_V2 = new BuzzoolaAdType("AVITO_PREMIUM_BANNER_V2", 2);

    @c("AVITO_CREDIT_BUTTON")
    public static final BuzzoolaAdType AVITO_CREDIT_BUTTON = new BuzzoolaAdType("AVITO_CREDIT_BUTTON", 3);

    @c("AVITO_VIDEO_LENTA_NATIVE")
    public static final BuzzoolaAdType AVITO_VIDEO_LENTA_NATIVE = new BuzzoolaAdType("AVITO_VIDEO_LENTA_NATIVE", 4);

    @c("AVITO_VIDEO_LENTA_MEDIA")
    public static final BuzzoolaAdType AVITO_VIDEO_LENTA_MEDIA = new BuzzoolaAdType("AVITO_VIDEO_LENTA_MEDIA", 5);

    @c("AVITO_MAIN_MEDIA")
    public static final BuzzoolaAdType AVITO_MAIN_MEDIA = new BuzzoolaAdType("AVITO_MAIN_MEDIA", 6);

    @c("AVITO_MAIN_HTML")
    public static final BuzzoolaAdType AVITO_MAIN_HTML = new BuzzoolaAdType("AVITO_MAIN_HTML", 7);

    @c("AVITO_DIRECT_BANNER_HTML")
    public static final BuzzoolaAdType AVITO_DIRECT_BANNER_HTML = new BuzzoolaAdType("AVITO_DIRECT_BANNER_HTML", 8);

    @c("AVITO_PREMIUM_MEDIA_X2_BANNER")
    public static final BuzzoolaAdType AVITO_PREMIUM_MEDIA_X2_BANNER = new BuzzoolaAdType("AVITO_PREMIUM_MEDIA_X2_BANNER", 9);

    private static final /* synthetic */ BuzzoolaAdType[] $values() {
        return new BuzzoolaAdType[]{AVITO_DIRECT_BANNER, AVITO_PREMIUM_BANNER, AVITO_PREMIUM_BANNER_V2, AVITO_CREDIT_BUTTON, AVITO_VIDEO_LENTA_NATIVE, AVITO_VIDEO_LENTA_MEDIA, AVITO_MAIN_MEDIA, AVITO_MAIN_HTML, AVITO_DIRECT_BANNER_HTML, AVITO_PREMIUM_MEDIA_X2_BANNER};
    }

    static {
        BuzzoolaAdType[] buzzoolaAdTypeArr$values = $values();
        $VALUES = buzzoolaAdTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(buzzoolaAdTypeArr$values);
        CREATOR = new Parcelable.Creator<BuzzoolaAdType>() { // from class: com.avito.android.remote.model.advertising.BuzzoolaAdType.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BuzzoolaAdType createFromParcel(@k Parcel parcel) {
                return BuzzoolaAdType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BuzzoolaAdType[] newArray(int i12) {
                return new BuzzoolaAdType[i12];
            }
        };
    }

    private BuzzoolaAdType(String str, int i12) {
    }

    @k
    public static a<BuzzoolaAdType> getEntries() {
        return $ENTRIES;
    }

    public static BuzzoolaAdType valueOf(String str) {
        return (BuzzoolaAdType) Enum.valueOf(BuzzoolaAdType.class, str);
    }

    public static BuzzoolaAdType[] values() {
        return (BuzzoolaAdType[]) $VALUES.clone();
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
