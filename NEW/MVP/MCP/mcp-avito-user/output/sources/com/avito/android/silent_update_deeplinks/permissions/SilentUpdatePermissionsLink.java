package com.avito.android.silent_update_deeplinks.permissions;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: SilentUpdatePermissionsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update_deeplinks/permissions/SilentUpdatePermissionsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_silent-update-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class SilentUpdatePermissionsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<SilentUpdatePermissionsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f283751b;

    /* compiled from: SilentUpdatePermissionsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SilentUpdatePermissionsLink> {
        @Override // android.os.Parcelable.Creator
        public final SilentUpdatePermissionsLink createFromParcel(Parcel parcel) {
            return new SilentUpdatePermissionsLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SilentUpdatePermissionsLink[] newArray(int i12) {
            return new SilentUpdatePermissionsLink[i12];
        }
    }

    public SilentUpdatePermissionsLink(@l String str) {
        this.f283751b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f283751b);
    }
}
