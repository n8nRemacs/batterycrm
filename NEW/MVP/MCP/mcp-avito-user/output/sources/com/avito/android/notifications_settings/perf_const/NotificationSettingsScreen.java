package com.avito.android.notifications_settings.perf_const;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: NotificationSettingsPerfConst.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_settings/perf_const/NotificationSettingsScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes15.dex */
public final class NotificationSettingsScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final NotificationSettingsScreen f208009d = new NotificationSettingsScreen();

    @k
    public static final Parcelable.Creator<NotificationSettingsScreen> CREATOR = new a();

    /* compiled from: NotificationSettingsPerfConst.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NotificationSettingsScreen> {
        @Override // android.os.Parcelable.Creator
        public final NotificationSettingsScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return NotificationSettingsScreen.f208009d;
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationSettingsScreen[] newArray(int i12) {
            return new NotificationSettingsScreen[i12];
        }
    }

    public NotificationSettingsScreen() {
        super("NotificationSettings", false, 2, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
