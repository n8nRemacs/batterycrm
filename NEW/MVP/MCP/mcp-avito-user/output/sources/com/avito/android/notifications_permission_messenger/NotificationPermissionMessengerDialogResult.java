package com.avito.android.notifications_permission_messenger;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationPermissionMessengerDialogResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/NotificationPermissionMessengerDialogResult;", "Landroid/os/Parcelable;", "a", "OnEnableClicked", "OnSkipClicked", "Lcom/avito/android/notifications_permission_messenger/NotificationPermissionMessengerDialogResult$OnEnableClicked;", "Lcom/avito/android/notifications_permission_messenger/NotificationPermissionMessengerDialogResult$OnSkipClicked;", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface NotificationPermissionMessengerDialogResult extends Parcelable {

    /* renamed from: V1, reason: collision with root package name */
    @Y61.k
    public static final a f207897V1 = a.f207900a;

    /* compiled from: NotificationPermissionMessengerDialogResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/NotificationPermissionMessengerDialogResult$OnEnableClicked;", "Lcom/avito/android/notifications_permission_messenger/NotificationPermissionMessengerDialogResult;", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnEnableClicked implements NotificationPermissionMessengerDialogResult {

        @Y61.k
        public static final Parcelable.Creator<OnEnableClicked> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final NotificationPermissionMessengerDialogDeeplink f207898b;

        /* compiled from: NotificationPermissionMessengerDialogResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnEnableClicked> {
            @Override // android.os.Parcelable.Creator
            public final OnEnableClicked createFromParcel(Parcel parcel) {
                return new OnEnableClicked((NotificationPermissionMessengerDialogDeeplink) parcel.readParcelable(OnEnableClicked.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OnEnableClicked[] newArray(int i12) {
                return new OnEnableClicked[i12];
            }
        }

        public OnEnableClicked(@Y61.k NotificationPermissionMessengerDialogDeeplink notificationPermissionMessengerDialogDeeplink) {
            this.f207898b = notificationPermissionMessengerDialogDeeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnEnableClicked) && L.f(this.f207898b, ((OnEnableClicked) obj).f207898b);
        }

        public final int hashCode() {
            return this.f207898b.f207940b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnEnableClicked(link=" + this.f207898b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f207898b, i12);
        }
    }

    /* compiled from: NotificationPermissionMessengerDialogResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/NotificationPermissionMessengerDialogResult$OnSkipClicked;", "Lcom/avito/android/notifications_permission_messenger/NotificationPermissionMessengerDialogResult;", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSkipClicked implements NotificationPermissionMessengerDialogResult {

        @Y61.k
        public static final Parcelable.Creator<OnSkipClicked> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final NotificationPermissionMessengerDialogDeeplink f207899b;

        /* compiled from: NotificationPermissionMessengerDialogResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnSkipClicked> {
            @Override // android.os.Parcelable.Creator
            public final OnSkipClicked createFromParcel(Parcel parcel) {
                return new OnSkipClicked((NotificationPermissionMessengerDialogDeeplink) parcel.readParcelable(OnSkipClicked.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OnSkipClicked[] newArray(int i12) {
                return new OnSkipClicked[i12];
            }
        }

        public OnSkipClicked(@Y61.k NotificationPermissionMessengerDialogDeeplink notificationPermissionMessengerDialogDeeplink) {
            this.f207899b = notificationPermissionMessengerDialogDeeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSkipClicked) && L.f(this.f207899b, ((OnSkipClicked) obj).f207899b);
        }

        public final int hashCode() {
            return this.f207899b.f207940b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnSkipClicked(link=" + this.f207899b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f207899b, i12);
        }
    }

    /* compiled from: NotificationPermissionMessengerDialogResult.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/NotificationPermissionMessengerDialogResult$a;", "", "<init>", "()V", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f207900a = new a();
    }

    /* compiled from: NotificationPermissionMessengerDialogResult.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }
}
