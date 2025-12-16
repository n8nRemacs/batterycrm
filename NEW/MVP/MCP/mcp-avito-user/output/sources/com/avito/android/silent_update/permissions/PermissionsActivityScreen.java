package com.avito.android.silent_update.permissions;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: PermissionsActivityScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/silent_update/permissions/PermissionsActivityScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes3.dex */
public final class PermissionsActivityScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final PermissionsActivityScreen f283693d = new PermissionsActivityScreen();

    @Y61.k
    public static final Parcelable.Creator<PermissionsActivityScreen> CREATOR = new a();

    /* compiled from: PermissionsActivityScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PermissionsActivityScreen> {
        @Override // android.os.Parcelable.Creator
        public final PermissionsActivityScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return PermissionsActivityScreen.f283693d;
        }

        @Override // android.os.Parcelable.Creator
        public final PermissionsActivityScreen[] newArray(int i12) {
            return new PermissionsActivityScreen[i12];
        }
    }

    public PermissionsActivityScreen() {
        super("SilentUpdatePermissions", false, 2, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
