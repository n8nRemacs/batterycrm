package com.avito.android.silent_update.permissions;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: SilentUpdatePermissions.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update/permissions/SilentUpdatePermissions;", "Landroid/os/Parcelable;", "_avito_silent-update_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SilentUpdatePermissions implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SilentUpdatePermissions> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f283694b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f283695c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f283696d;

    /* compiled from: SilentUpdatePermissions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SilentUpdatePermissions> {
        @Override // android.os.Parcelable.Creator
        public final SilentUpdatePermissions createFromParcel(Parcel parcel) {
            return new SilentUpdatePermissions(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SilentUpdatePermissions[] newArray(int i12) {
            return new SilentUpdatePermissions[i12];
        }
    }

    public SilentUpdatePermissions(boolean z12, boolean z13, boolean z14) {
        this.f283694b = z12;
        this.f283695c = z13;
        this.f283696d = z14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SilentUpdatePermissions)) {
            return false;
        }
        SilentUpdatePermissions silentUpdatePermissions = (SilentUpdatePermissions) obj;
        return this.f283694b == silentUpdatePermissions.f283694b && this.f283695c == silentUpdatePermissions.f283695c && this.f283696d == silentUpdatePermissions.f283696d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283696d) + r.i(Boolean.hashCode(this.f283694b) * 31, 31, this.f283695c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SilentUpdatePermissions(isStoragePermissionGranted=");
        sb2.append(this.f283694b);
        sb2.append(", isDozeModePermissionGranted=");
        sb2.append(this.f283695c);
        sb2.append(", isInstallPermissionGranted=");
        return r.x(sb2, this.f283696d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f283694b ? 1 : 0);
        parcel.writeInt(this.f283695c ? 1 : 0);
        parcel.writeInt(this.f283696d ? 1 : 0);
    }
}
