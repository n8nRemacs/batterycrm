package com.avito.android.notifications_settings.title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationsSettingsTitleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_settings/title/NotificationsSettingsTitleItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NotificationsSettingsTitleItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<NotificationsSettingsTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f208170b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f208171c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f208172d;

    /* compiled from: NotificationsSettingsTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NotificationsSettingsTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsSettingsTitleItem createFromParcel(Parcel parcel) {
            return new NotificationsSettingsTitleItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsSettingsTitleItem[] newArray(int i12) {
            return new NotificationsSettingsTitleItem[i12];
        }
    }

    public NotificationsSettingsTitleItem(@k String str, @k String str2, @k String str3) {
        this.f208170b = str;
        this.f208171c = str2;
        this.f208172d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsSettingsTitleItem)) {
            return false;
        }
        NotificationsSettingsTitleItem notificationsSettingsTitleItem = (NotificationsSettingsTitleItem) obj;
        return L.f(this.f208170b, notificationsSettingsTitleItem.f208170b) && L.f(this.f208171c, notificationsSettingsTitleItem.f208171c) && L.f(this.f208172d, notificationsSettingsTitleItem.f208172d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return getF200563b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF200563b() {
        return this.f208170b;
    }

    public final int hashCode() {
        return this.f208172d.hashCode() + H.d(this.f208170b.hashCode() * 31, 31, this.f208171c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationsSettingsTitleItem(stringId=");
        sb2.append(this.f208170b);
        sb2.append(", title=");
        sb2.append(this.f208171c);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f208172d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f208170b);
        parcel.writeString(this.f208171c);
        parcel.writeString(this.f208172d);
    }
}
