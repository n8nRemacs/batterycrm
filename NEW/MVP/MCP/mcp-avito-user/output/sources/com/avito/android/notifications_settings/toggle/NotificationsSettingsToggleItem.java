package com.avito.android.notifications_settings.toggle;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationsSettingsToggleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_settings/toggle/NotificationsSettingsToggleItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NotificationsSettingsToggleItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<NotificationsSettingsToggleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f208180b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f208181c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f208182d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f208183e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f208184f;

    /* compiled from: NotificationsSettingsToggleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NotificationsSettingsToggleItem> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsSettingsToggleItem createFromParcel(Parcel parcel) {
            return new NotificationsSettingsToggleItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsSettingsToggleItem[] newArray(int i12) {
            return new NotificationsSettingsToggleItem[i12];
        }
    }

    public NotificationsSettingsToggleItem(@k String str, @k String str2, @k String str3, @k String str4, boolean z12) {
        this.f208180b = str;
        this.f208181c = str2;
        this.f208182d = str3;
        this.f208183e = str4;
        this.f208184f = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsSettingsToggleItem)) {
            return false;
        }
        NotificationsSettingsToggleItem notificationsSettingsToggleItem = (NotificationsSettingsToggleItem) obj;
        return L.f(this.f208180b, notificationsSettingsToggleItem.f208180b) && L.f(this.f208181c, notificationsSettingsToggleItem.f208181c) && L.f(this.f208182d, notificationsSettingsToggleItem.f208182d) && L.f(this.f208183e, notificationsSettingsToggleItem.f208183e) && this.f208184f == notificationsSettingsToggleItem.f208184f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222258b() {
        return getF174286b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF174286b() {
        return this.f208180b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f208184f) + H.d(H.d(H.d(this.f208180b.hashCode() * 31, 31, this.f208181c), 31, this.f208182d), 31, this.f208183e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationsSettingsToggleItem(stringId=");
        sb2.append(this.f208180b);
        sb2.append(", section=");
        sb2.append(this.f208181c);
        sb2.append(", channel=");
        sb2.append(this.f208182d);
        sb2.append(", text=");
        sb2.append(this.f208183e);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f208184f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f208180b);
        parcel.writeString(this.f208181c);
        parcel.writeString(this.f208182d);
        parcel.writeString(this.f208183e);
        parcel.writeInt(this.f208184f ? 1 : 0);
    }
}
