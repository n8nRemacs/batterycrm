package com.avito.android.push;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PushToken.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/push/PushToken;", "Landroid/os/Parcelable;", "_common_push-models_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PushToken implements Parcelable {

    @k
    public static final Parcelable.Creator<PushToken> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f245932b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PushService f245933c;

    /* compiled from: PushToken.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PushToken> {
        @Override // android.os.Parcelable.Creator
        public final PushToken createFromParcel(Parcel parcel) {
            return new PushToken(parcel.readString(), PushService.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final PushToken[] newArray(int i12) {
            return new PushToken[i12];
        }
    }

    public PushToken(@k String str, @k PushService pushService) {
        this.f245932b = str;
        this.f245933c = pushService;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushToken)) {
            return false;
        }
        PushToken pushToken = (PushToken) obj;
        return L.f(this.f245932b, pushToken.f245932b) && this.f245933c == pushToken.f245933c;
    }

    public final int hashCode() {
        return this.f245933c.hashCode() + (this.f245932b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "PushToken(token=" + this.f245932b + ", pushService=" + this.f245933c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f245932b);
        parcel.writeString(this.f245933c.name());
    }
}
