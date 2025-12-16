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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/autoteka/model/KindOfDiscount;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "DISCOUNT", "DYNAMIC_DISCOUNT", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KindOfDiscount implements Parcelable {

    @k
    public static final Parcelable.Creator<KindOfDiscount> CREATOR;

    @c("discount")
    public static final KindOfDiscount DISCOUNT;

    @c("dynamicDiscount")
    public static final KindOfDiscount DYNAMIC_DISCOUNT;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KindOfDiscount[] f253299b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f253300c;

    static {
        KindOfDiscount kindOfDiscount = new KindOfDiscount("DISCOUNT", 0);
        DISCOUNT = kindOfDiscount;
        KindOfDiscount kindOfDiscount2 = new KindOfDiscount("DYNAMIC_DISCOUNT", 1);
        DYNAMIC_DISCOUNT = kindOfDiscount2;
        KindOfDiscount[] kindOfDiscountArr = {kindOfDiscount, kindOfDiscount2};
        f253299b = kindOfDiscountArr;
        f253300c = kotlin.enums.c.a(kindOfDiscountArr);
        CREATOR = new Parcelable.Creator<KindOfDiscount>() { // from class: com.avito.android.remote.autoteka.model.KindOfDiscount.a
            @Override // android.os.Parcelable.Creator
            public final KindOfDiscount createFromParcel(Parcel parcel) {
                return KindOfDiscount.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final KindOfDiscount[] newArray(int i12) {
                return new KindOfDiscount[i12];
            }
        };
    }

    private KindOfDiscount(String str, int i12) {
    }

    public static KindOfDiscount valueOf(String str) {
        return (KindOfDiscount) Enum.valueOf(KindOfDiscount.class, str);
    }

    public static KindOfDiscount[] values() {
        return (KindOfDiscount[]) f253299b.clone();
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
