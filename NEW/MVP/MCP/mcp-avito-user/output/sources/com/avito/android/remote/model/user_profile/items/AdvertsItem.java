package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AdvertsItem.kt */
@d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/AdvertsItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "Lcom/avito/android/remote/model/user_profile/items/AdvertsItem$Status;", "status", "<init>", "(Lcom/avito/android/remote/model/user_profile/items/AdvertsItem$Status;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/user_profile/items/AdvertsItem$Status;", "getStatus", "()Lcom/avito/android/remote/model/user_profile/items/AdvertsItem$Status;", "Status", "StatusItem", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertsItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<AdvertsItem> CREATOR = new Creator();

    @c("status")
    @k
    private final Status status;

    /* compiled from: AdvertsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertsItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertsItem createFromParcel(@k Parcel parcel) {
            return new AdvertsItem(Status.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertsItem[] newArray(int i12) {
            return new AdvertsItem[i12];
        }
    }

    /* compiled from: AdvertsItem.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/AdvertsItem$Status;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/user_profile/items/AdvertsItem$StatusItem;", "active", "inactive", "rejected", "<init>", "(Lcom/avito/android/remote/model/user_profile/items/AdvertsItem$StatusItem;Lcom/avito/android/remote/model/user_profile/items/AdvertsItem$StatusItem;Lcom/avito/android/remote/model/user_profile/items/AdvertsItem$StatusItem;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/user_profile/items/AdvertsItem$StatusItem;", "getActive", "()Lcom/avito/android/remote/model/user_profile/items/AdvertsItem$StatusItem;", "getInactive", "getRejected", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status implements Parcelable {

        @k
        public static final Parcelable.Creator<Status> CREATOR = new Creator();

        @c("active")
        @k
        private final StatusItem active;

        @c("inactive")
        @l
        private final StatusItem inactive;

        @c("rejected")
        @l
        private final StatusItem rejected;

        /* compiled from: AdvertsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Status> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Status createFromParcel(@k Parcel parcel) {
                Parcelable.Creator<StatusItem> creator = StatusItem.CREATOR;
                return new Status(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Status[] newArray(int i12) {
                return new Status[i12];
            }
        }

        public Status(@k StatusItem statusItem, @l StatusItem statusItem2, @l StatusItem statusItem3) {
            this.active = statusItem;
            this.inactive = statusItem2;
            this.rejected = statusItem3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final StatusItem getActive() {
            return this.active;
        }

        @l
        public final StatusItem getInactive() {
            return this.inactive;
        }

        @l
        public final StatusItem getRejected() {
            return this.rejected;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.active.writeToParcel(parcel, flags);
            StatusItem statusItem = this.inactive;
            if (statusItem == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                statusItem.writeToParcel(parcel, flags);
            }
            StatusItem statusItem2 = this.rejected;
            if (statusItem2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                statusItem2.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: AdvertsItem.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/AdvertsItem$StatusItem;", "Landroid/os/Parcelable;", "", "title", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StatusItem implements Parcelable {

        @k
        public static final Parcelable.Creator<StatusItem> CREATOR = new Creator();

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StatusItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final StatusItem createFromParcel(@k Parcel parcel) {
                return new StatusItem(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final StatusItem[] newArray(int i12) {
                return new StatusItem[i12];
            }
        }

        public StatusItem(@k String str) {
            this.title = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
        }
    }

    public AdvertsItem(@k Status status) {
        this.status = status;
    }

    @k
    public final Status getStatus() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.status.writeToParcel(parcel, flags);
    }
}
