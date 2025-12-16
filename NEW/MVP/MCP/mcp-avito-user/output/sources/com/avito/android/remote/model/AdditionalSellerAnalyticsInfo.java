package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AdditionalSeller.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/AdditionalSellerAnalyticsInfo;", "Landroid/os/Parcelable;", "", "cardModelId", "catalogId", "addressId", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getCardModelId", "()Ljava/lang/Integer;", "getCatalogId", "getAddressId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdditionalSellerAnalyticsInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<AdditionalSellerAnalyticsInfo> CREATOR = new Creator();

    @c("addressId")
    @l
    private final Integer addressId;

    @c("cardModelId")
    @l
    private final Integer cardModelId;

    @c("catalogId")
    @l
    private final Integer catalogId;

    /* compiled from: AdditionalSeller.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdditionalSellerAnalyticsInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdditionalSellerAnalyticsInfo createFromParcel(@k Parcel parcel) {
            return new AdditionalSellerAnalyticsInfo(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdditionalSellerAnalyticsInfo[] newArray(int i12) {
            return new AdditionalSellerAnalyticsInfo[i12];
        }
    }

    public AdditionalSellerAnalyticsInfo(@l Integer num, @l Integer num2, @l Integer num3) {
        this.cardModelId = num;
        this.catalogId = num2;
        this.addressId = num3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Integer getAddressId() {
        return this.addressId;
    }

    @l
    public final Integer getCardModelId() {
        return this.cardModelId;
    }

    @l
    public final Integer getCatalogId() {
        return this.catalogId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.cardModelId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.catalogId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        Integer num3 = this.addressId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num3);
        }
    }
}
