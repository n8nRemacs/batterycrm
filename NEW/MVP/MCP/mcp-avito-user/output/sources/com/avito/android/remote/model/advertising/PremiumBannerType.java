package com.avito.android.remote.model.advertising;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PremiumBannerType.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/advertising/PremiumBannerType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Companion", "PROFILE_PROMO", "DIRECT_SALES", "BRAND_SPACE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PremiumBannerType implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PremiumBannerType[] $VALUES;

    @k
    public static final Parcelable.Creator<PremiumBannerType> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    @c("PROFILE_PROMO")
    public static final PremiumBannerType PROFILE_PROMO = new PremiumBannerType("PROFILE_PROMO", 0);

    @c("DIRECT_SALES")
    public static final PremiumBannerType DIRECT_SALES = new PremiumBannerType("DIRECT_SALES", 1);

    @c("BRAND_SPACE")
    public static final PremiumBannerType BRAND_SPACE = new PremiumBannerType("BRAND_SPACE", 2);

    /* compiled from: PremiumBannerType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/advertising/PremiumBannerType$Companion;", "", "()V", "parse", "Lcom/avito/android/remote/model/advertising/PremiumBannerType;", "string", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final PremiumBannerType parse(@l String string) {
            return L.f(string, "PROFILE_PROMO") ? PremiumBannerType.PROFILE_PROMO : L.f(string, "1") ? PremiumBannerType.BRAND_SPACE : PremiumBannerType.DIRECT_SALES;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PremiumBannerType[] $values() {
        return new PremiumBannerType[]{PROFILE_PROMO, DIRECT_SALES, BRAND_SPACE};
    }

    static {
        PremiumBannerType[] premiumBannerTypeArr$values = $values();
        $VALUES = premiumBannerTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(premiumBannerTypeArr$values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<PremiumBannerType>() { // from class: com.avito.android.remote.model.advertising.PremiumBannerType.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PremiumBannerType createFromParcel(@k Parcel parcel) {
                return PremiumBannerType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PremiumBannerType[] newArray(int i12) {
                return new PremiumBannerType[i12];
            }
        };
    }

    private PremiumBannerType(String str, int i12) {
    }

    @k
    public static a<PremiumBannerType> getEntries() {
        return $ENTRIES;
    }

    public static PremiumBannerType valueOf(String str) {
        return (PremiumBannerType) Enum.valueOf(PremiumBannerType.class, str);
    }

    public static PremiumBannerType[] values() {
        return (PremiumBannerType[]) $VALUES.clone();
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
