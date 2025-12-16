package com.avito.android.profile_management_core.edit_text_field;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: NotSavedAlertSettings.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/edit_text_field/NotSavedAlertSettings;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class NotSavedAlertSettings implements Parcelable {

    @k
    public static final Parcelable.Creator<NotSavedAlertSettings> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f226612b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f226613c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f226614d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f226615e;

    /* compiled from: NotSavedAlertSettings.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NotSavedAlertSettings> {
        @Override // android.os.Parcelable.Creator
        public final NotSavedAlertSettings createFromParcel(Parcel parcel) {
            return new NotSavedAlertSettings(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotSavedAlertSettings[] newArray(int i12) {
            return new NotSavedAlertSettings[i12];
        }
    }

    public NotSavedAlertSettings(@k String str, @k String str2, @k String str3, @k String str4) {
        this.f226612b = str;
        this.f226613c = str2;
        this.f226614d = str3;
        this.f226615e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f226612b);
        parcel.writeString(this.f226613c);
        parcel.writeString(this.f226614d);
        parcel.writeString(this.f226615e);
    }
}
