package com.avito.android.virtual_deal_room_client_creation;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: Screens.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/VDRClientListScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes5.dex */
public final class VDRClientListScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final VDRClientListScreen f326480d = new VDRClientListScreen();

    @k
    public static final Parcelable.Creator<VDRClientListScreen> CREATOR = new a();

    /* compiled from: Screens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VDRClientListScreen> {
        @Override // android.os.Parcelable.Creator
        public final VDRClientListScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return VDRClientListScreen.f326480d;
        }

        @Override // android.os.Parcelable.Creator
        public final VDRClientListScreen[] newArray(int i12) {
            return new VDRClientListScreen[i12];
        }
    }

    public VDRClientListScreen() {
        super("VDRClientList", false, 2, null);
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
