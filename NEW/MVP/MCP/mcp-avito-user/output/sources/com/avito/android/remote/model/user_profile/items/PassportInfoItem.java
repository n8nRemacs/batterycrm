package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: PassportItem.kt */
@d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/PassportInfoItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "Lcom/avito/android/remote/model/user_profile/items/PassportItem;", "passportItem", "Lcom/avito/android/remote/model/user_profile/items/InfoItem;", "infoItem", "<init>", "(Lcom/avito/android/remote/model/user_profile/items/PassportItem;Lcom/avito/android/remote/model/user_profile/items/InfoItem;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/user_profile/items/PassportItem;", "getPassportItem", "()Lcom/avito/android/remote/model/user_profile/items/PassportItem;", "Lcom/avito/android/remote/model/user_profile/items/InfoItem;", "getInfoItem", "()Lcom/avito/android/remote/model/user_profile/items/InfoItem;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PassportInfoItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<PassportInfoItem> CREATOR = new Creator();

    @k
    private final InfoItem infoItem;

    @k
    private final PassportItem passportItem;

    /* compiled from: PassportItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PassportInfoItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PassportInfoItem createFromParcel(@k Parcel parcel) {
            return new PassportInfoItem(PassportItem.CREATOR.createFromParcel(parcel), InfoItem.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PassportInfoItem[] newArray(int i12) {
            return new PassportInfoItem[i12];
        }
    }

    public PassportInfoItem(@k PassportItem passportItem, @k InfoItem infoItem) {
        this.passportItem = passportItem;
        this.infoItem = infoItem;
    }

    @k
    public final InfoItem getInfoItem() {
        return this.infoItem;
    }

    @k
    public final PassportItem getPassportItem() {
        return this.passportItem;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.passportItem.writeToParcel(parcel, flags);
        this.infoItem.writeToParcel(parcel, flags);
    }
}
