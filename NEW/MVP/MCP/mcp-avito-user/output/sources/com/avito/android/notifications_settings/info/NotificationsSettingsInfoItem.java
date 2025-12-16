package com.avito.android.notifications_settings.info;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationsSettingsInfoItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_settings/info/NotificationsSettingsInfoItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NotificationsSettingsInfoItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<NotificationsSettingsInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f208001b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f208002c;

    /* compiled from: NotificationsSettingsInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NotificationsSettingsInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsSettingsInfoItem createFromParcel(Parcel parcel) {
            return new NotificationsSettingsInfoItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsSettingsInfoItem[] newArray(int i12) {
            return new NotificationsSettingsInfoItem[i12];
        }
    }

    public NotificationsSettingsInfoItem(@k String str, @k String str2) {
        this.f208001b = str;
        this.f208002c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsSettingsInfoItem)) {
            return false;
        }
        NotificationsSettingsInfoItem notificationsSettingsInfoItem = (NotificationsSettingsInfoItem) obj;
        return L.f(this.f208001b, notificationsSettingsInfoItem.f208001b) && L.f(this.f208002c, notificationsSettingsInfoItem.f208002c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207394c() {
        return getF202703b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF202703b() {
        return this.f208001b;
    }

    public final int hashCode() {
        return this.f208002c.hashCode() + (this.f208001b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationsSettingsInfoItem(stringId=");
        sb2.append(this.f208001b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f208002c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f208001b);
        parcel.writeString(this.f208002c);
    }
}
