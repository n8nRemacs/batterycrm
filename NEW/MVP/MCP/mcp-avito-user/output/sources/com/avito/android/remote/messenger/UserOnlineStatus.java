package com.avito.android.remote.messenger;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: UserOnlineStatus.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/messenger/UserOnlineStatus;", "Landroid/os/Parcelable;", "", "timeDiff", "lastActionTime", "<init>", "(JJ)V", "J", "c", "()J", "getLastActionTime", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserOnlineStatus implements Parcelable {

    @k
    public static final Parcelable.Creator<UserOnlineStatus> CREATOR = new a();

    @c("lastActionTime")
    private final long lastActionTime;

    @c("timeDiff")
    private final long timeDiff;

    /* compiled from: UserOnlineStatus.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserOnlineStatus> {
        @Override // android.os.Parcelable.Creator
        public final UserOnlineStatus createFromParcel(Parcel parcel) {
            return new UserOnlineStatus(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final UserOnlineStatus[] newArray(int i12) {
            return new UserOnlineStatus[i12];
        }
    }

    public UserOnlineStatus(long j12, long j13) {
        this.timeDiff = j12;
        this.lastActionTime = j13;
    }

    /* renamed from: c, reason: from getter */
    public final long getTimeDiff() {
        return this.timeDiff;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.timeDiff);
        parcel.writeLong(this.lastActionTime);
    }
}
