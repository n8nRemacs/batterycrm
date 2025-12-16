package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AdjustParameters.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/AdjustParameters;", "Landroid/os/Parcelable;", "", "categoryId", "microCategoryId", "Lcom/avito/android/remote/model/AdvertisementVerticalAlias;", "verticalAlias", "Lcom/avito/android/remote/model/AdvertisementCategoryAlias;", "categoryAlias", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertisementVerticalAlias;Lcom/avito/android/remote/model/AdvertisementCategoryAlias;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCategoryId", "()Ljava/lang/String;", "getMicroCategoryId", "Lcom/avito/android/remote/model/AdvertisementVerticalAlias;", "getVerticalAlias", "()Lcom/avito/android/remote/model/AdvertisementVerticalAlias;", "Lcom/avito/android/remote/model/AdvertisementCategoryAlias;", "getCategoryAlias", "()Lcom/avito/android/remote/model/AdvertisementCategoryAlias;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdjustParameters implements Parcelable {

    @k
    public static final Parcelable.Creator<AdjustParameters> CREATOR = new Creator();

    @c("category")
    @l
    private final AdvertisementCategoryAlias categoryAlias;

    @c("categoryId")
    @l
    private final String categoryId;

    @c("microCategoryId")
    @l
    private final String microCategoryId;

    @c("vertical")
    @l
    private final AdvertisementVerticalAlias verticalAlias;

    /* compiled from: AdjustParameters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdjustParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdjustParameters createFromParcel(@k Parcel parcel) {
            return new AdjustParameters(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AdvertisementVerticalAlias.valueOf(parcel.readString()), parcel.readInt() != 0 ? AdvertisementCategoryAlias.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdjustParameters[] newArray(int i12) {
            return new AdjustParameters[i12];
        }
    }

    public AdjustParameters(@l String str, @l String str2, @l AdvertisementVerticalAlias advertisementVerticalAlias, @l AdvertisementCategoryAlias advertisementCategoryAlias) {
        this.categoryId = str;
        this.microCategoryId = str2;
        this.verticalAlias = advertisementVerticalAlias;
        this.categoryAlias = advertisementCategoryAlias;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AdvertisementCategoryAlias getCategoryAlias() {
        return this.categoryAlias;
    }

    @l
    public final String getCategoryId() {
        return this.categoryId;
    }

    @l
    public final String getMicroCategoryId() {
        return this.microCategoryId;
    }

    @l
    public final AdvertisementVerticalAlias getVerticalAlias() {
        return this.verticalAlias;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.categoryId);
        parcel.writeString(this.microCategoryId);
        AdvertisementVerticalAlias advertisementVerticalAlias = this.verticalAlias;
        if (advertisementVerticalAlias == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(advertisementVerticalAlias.name());
        }
        AdvertisementCategoryAlias advertisementCategoryAlias = this.categoryAlias;
        if (advertisementCategoryAlias == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(advertisementCategoryAlias.name());
        }
    }
}
