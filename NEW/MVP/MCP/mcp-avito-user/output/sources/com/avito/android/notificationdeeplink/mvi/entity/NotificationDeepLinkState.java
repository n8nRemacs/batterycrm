package com.avito.android.notificationdeeplink.mvi.entity;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NotificationDeepLinkState.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notificationdeeplink/mvi/entity/NotificationDeepLinkState;", "Landroid/os/Parcelable;", "a", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NotificationDeepLinkState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final G0 f207818b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f207816c = new a(null);

    @k
    public static final Parcelable.Creator<NotificationDeepLinkState> CREATOR = new b();

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final NotificationDeepLinkState f207817d = new NotificationDeepLinkState(G0.f406611a);

    /* compiled from: NotificationDeepLinkState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notificationdeeplink/mvi/entity/NotificationDeepLinkState$a;", "", "<init>", "()V", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: NotificationDeepLinkState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<NotificationDeepLinkState> {
        @Override // android.os.Parcelable.Creator
        public final NotificationDeepLinkState createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new NotificationDeepLinkState(G0.f406611a);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationDeepLinkState[] newArray(int i12) {
            return new NotificationDeepLinkState[i12];
        }
    }

    public NotificationDeepLinkState(@k G0 g02) {
        this.f207818b = g02;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationDeepLinkState) && L.f(this.f207818b, ((NotificationDeepLinkState) obj).f207818b);
    }

    public final int hashCode() {
        return this.f207818b.hashCode();
    }

    @k
    public final String toString() {
        return c.v(new StringBuilder("NotificationDeepLinkState(stub="), this.f207818b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
