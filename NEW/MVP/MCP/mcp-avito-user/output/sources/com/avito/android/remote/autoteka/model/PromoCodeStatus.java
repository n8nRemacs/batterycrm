package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutotekaPurchaseResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/autoteka/model/PromoCodeStatus;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "SUCCESS", "ERROR", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PromoCodeStatus implements Parcelable {

    @k
    public static final Parcelable.Creator<PromoCodeStatus> CREATOR;

    @c("error")
    public static final PromoCodeStatus ERROR;

    @c("initial")
    public static final PromoCodeStatus INITIAL;

    @c("success")
    public static final PromoCodeStatus SUCCESS;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PromoCodeStatus[] f253301b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f253302c;

    static {
        PromoCodeStatus promoCodeStatus = new PromoCodeStatus("INITIAL", 0);
        INITIAL = promoCodeStatus;
        PromoCodeStatus promoCodeStatus2 = new PromoCodeStatus("SUCCESS", 1);
        SUCCESS = promoCodeStatus2;
        PromoCodeStatus promoCodeStatus3 = new PromoCodeStatus("ERROR", 2);
        ERROR = promoCodeStatus3;
        PromoCodeStatus[] promoCodeStatusArr = {promoCodeStatus, promoCodeStatus2, promoCodeStatus3};
        f253301b = promoCodeStatusArr;
        f253302c = kotlin.enums.c.a(promoCodeStatusArr);
        CREATOR = new Parcelable.Creator<PromoCodeStatus>() { // from class: com.avito.android.remote.autoteka.model.PromoCodeStatus.a
            @Override // android.os.Parcelable.Creator
            public final PromoCodeStatus createFromParcel(Parcel parcel) {
                return PromoCodeStatus.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PromoCodeStatus[] newArray(int i12) {
                return new PromoCodeStatus[i12];
            }
        };
    }

    private PromoCodeStatus(String str, int i12) {
    }

    public static PromoCodeStatus valueOf(String str) {
        return (PromoCodeStatus) Enum.valueOf(PromoCodeStatus.class, str);
    }

    public static PromoCodeStatus[] values() {
        return (PromoCodeStatus[]) f253301b.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
