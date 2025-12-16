package com.avito.android.notifications_permission_messenger.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: NotificationPermissionMessengerDialogDeeplink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "Problem", "b", "_avito_notifications-permission-messenger-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class NotificationPermissionMessengerDialogDeeplink extends DeepLink implements Parcelable {

    @k
    public static final Parcelable.Creator<NotificationPermissionMessengerDialogDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f207940b;

    /* compiled from: NotificationPermissionMessengerDialogDeeplink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$Problem;", "Landroid/os/Parcelable;", "MessengerNotificationChannelDisabled", "ProfileMessengerPushDisabled", "SystemPermissionDisabled", "Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$Problem$MessengerNotificationChannelDisabled;", "Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$Problem$ProfileMessengerPushDisabled;", "Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$Problem$SystemPermissionDisabled;", "_avito_notifications-permission-messenger-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Problem extends Parcelable {

        /* compiled from: NotificationPermissionMessengerDialogDeeplink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$Problem$MessengerNotificationChannelDisabled;", "Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$Problem;", "<init>", "()V", "_avito_notifications-permission-messenger-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MessengerNotificationChannelDisabled implements Problem {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final MessengerNotificationChannelDisabled f207941b = new MessengerNotificationChannelDisabled();

            @k
            public static final Parcelable.Creator<MessengerNotificationChannelDisabled> CREATOR = new a();

            /* compiled from: NotificationPermissionMessengerDialogDeeplink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<MessengerNotificationChannelDisabled> {
                @Override // android.os.Parcelable.Creator
                public final MessengerNotificationChannelDisabled createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return MessengerNotificationChannelDisabled.f207941b;
                }

                @Override // android.os.Parcelable.Creator
                public final MessengerNotificationChannelDisabled[] newArray(int i12) {
                    return new MessengerNotificationChannelDisabled[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof MessengerNotificationChannelDisabled);
            }

            public final int hashCode() {
                return 1787525142;
            }

            @k
            public final String toString() {
                return "MessengerNotificationChannelDisabled";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: NotificationPermissionMessengerDialogDeeplink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$Problem$ProfileMessengerPushDisabled;", "Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$Problem;", "_avito_notifications-permission-messenger-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ProfileMessengerPushDisabled implements Problem {

            @k
            public static final Parcelable.Creator<ProfileMessengerPushDisabled> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<String> f207942b;

            /* compiled from: NotificationPermissionMessengerDialogDeeplink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ProfileMessengerPushDisabled> {
                @Override // android.os.Parcelable.Creator
                public final ProfileMessengerPushDisabled createFromParcel(Parcel parcel) {
                    return new ProfileMessengerPushDisabled(parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                public final ProfileMessengerPushDisabled[] newArray(int i12) {
                    return new ProfileMessengerPushDisabled[i12];
                }
            }

            public ProfileMessengerPushDisabled(@k List<String> list) {
                this.f207942b = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProfileMessengerPushDisabled) && L.f(this.f207942b, ((ProfileMessengerPushDisabled) obj).f207942b);
            }

            public final int hashCode() {
                return this.f207942b.hashCode();
            }

            @k
            public final String toString() {
                return H.p(new StringBuilder("ProfileMessengerPushDisabled(disabledSectionsNames="), this.f207942b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeStringList(this.f207942b);
            }
        }

        /* compiled from: NotificationPermissionMessengerDialogDeeplink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$Problem$SystemPermissionDisabled;", "Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$Problem;", "_avito_notifications-permission-messenger-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SystemPermissionDisabled implements Problem {

            @k
            public static final Parcelable.Creator<SystemPermissionDisabled> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final boolean f207943b;

            /* compiled from: NotificationPermissionMessengerDialogDeeplink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SystemPermissionDisabled> {
                @Override // android.os.Parcelable.Creator
                public final SystemPermissionDisabled createFromParcel(Parcel parcel) {
                    return new SystemPermissionDisabled(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final SystemPermissionDisabled[] newArray(int i12) {
                    return new SystemPermissionDisabled[i12];
                }
            }

            public SystemPermissionDisabled(boolean z12) {
                this.f207943b = z12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SystemPermissionDisabled) && this.f207943b == ((SystemPermissionDisabled) obj).f207943b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f207943b);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("SystemPermissionDisabled(isForeverDenied="), this.f207943b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.f207943b ? 1 : 0);
            }
        }
    }

    /* compiled from: NotificationPermissionMessengerDialogDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NotificationPermissionMessengerDialogDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final NotificationPermissionMessengerDialogDeeplink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(NotificationPermissionMessengerDialogDeeplink.class, parcel, arrayList, iL2, 1);
            }
            return new NotificationPermissionMessengerDialogDeeplink(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationPermissionMessengerDialogDeeplink[] newArray(int i12) {
            return new NotificationPermissionMessengerDialogDeeplink[i12];
        }
    }

    /* compiled from: NotificationPermissionMessengerDialogDeeplink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$b;", "", "a", "b", "c", "Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$b$a;", "Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$b$b;", "Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$b$c;", "_avito_notifications-permission-messenger-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: NotificationPermissionMessengerDialogDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$b$a;", "Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$b;", "LJu/c$b;", "<init>", "()V", "_avito_notifications-permission-messenger-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {
            static {
                new a();
            }
        }

        /* compiled from: NotificationPermissionMessengerDialogDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$b$b;", "Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$b;", "LJu/c$a;", "<init>", "()V", "_avito_notifications-permission-messenger-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink$b$b, reason: collision with other inner class name */
        public static final class C6204b implements b, InterfaceC14249c.a {
            static {
                new C6204b();
            }
        }

        /* compiled from: NotificationPermissionMessengerDialogDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$b$c;", "Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink$b;", "LJu/c$b;", "<init>", "()V", "_avito_notifications-permission-messenger-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f207944b = new c();
        }
    }

    public NotificationPermissionMessengerDialogDeeplink(@k ArrayList arrayList) {
        this.f207940b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationPermissionMessengerDialogDeeplink) && L.f(this.f207940b, ((NotificationPermissionMessengerDialogDeeplink) obj).f207940b);
    }

    public final int hashCode() {
        return this.f207940b.hashCode();
    }

    @k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("NotificationPermissionMessengerDialogDeeplink(problems="), this.f207940b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f207940b, parcel);
        while (itZ.hasNext()) {
            parcel.writeParcelable((Parcelable) itZ.next(), i12);
        }
    }
}
