package com.avito.android.remote.notification;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: NotificationIdentifier.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/NotificationIdentifier;", "Landroid/os/Parcelable;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NotificationIdentifier implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<NotificationIdentifier> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f253961b;

    /* renamed from: c, reason: collision with root package name */
    public final int f253962c;

    /* compiled from: NotificationIdentifier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NotificationIdentifier> {
        @Override // android.os.Parcelable.Creator
        public final NotificationIdentifier createFromParcel(Parcel parcel) {
            return new NotificationIdentifier(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationIdentifier[] newArray(int i12) {
            return new NotificationIdentifier[i12];
        }
    }

    public NotificationIdentifier(@Y61.l String str, int i12) {
        this.f253961b = str;
        this.f253962c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationIdentifier)) {
            return false;
        }
        NotificationIdentifier notificationIdentifier = (NotificationIdentifier) obj;
        return kotlin.jvm.internal.L.f(this.f253961b, notificationIdentifier.f253961b) && this.f253962c == notificationIdentifier.f253962c;
    }

    public final int hashCode() {
        String str = this.f253961b;
        return Integer.hashCode(this.f253962c) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationIdentifier(tag=");
        sb2.append(this.f253961b);
        sb2.append(", id=");
        return androidx.appcompat.app.r.t(sb2, this.f253962c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f253961b);
        parcel.writeInt(this.f253962c);
    }
}
