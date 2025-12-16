package ru.avito.messenger.api.entity.body.notification;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: Unknown.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/api/entity/body/notification/Unknown;", "Lru/avito/messenger/api/entity/body/notification/NotificationBody;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Unknown implements NotificationBody {

    @k
    public static final Parcelable.Creator<Unknown> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f430733b;

    /* compiled from: Unknown.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Unknown> {
        @Override // android.os.Parcelable.Creator
        public final Unknown createFromParcel(Parcel parcel) {
            return new Unknown(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Unknown[] newArray(int i12) {
            return new Unknown[i12];
        }
    }

    public Unknown(@k String str) {
        this.f430733b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f430733b);
    }
}
