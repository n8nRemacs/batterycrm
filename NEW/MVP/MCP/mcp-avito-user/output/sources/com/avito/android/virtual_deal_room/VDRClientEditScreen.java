package com.avito.android.virtual_deal_room;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: Screens.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room/VDRClientEditScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes5.dex */
public final class VDRClientEditScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final VDRClientEditScreen f326098d = new VDRClientEditScreen();

    @k
    public static final Parcelable.Creator<VDRClientEditScreen> CREATOR = new a();

    /* compiled from: Screens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VDRClientEditScreen> {
        @Override // android.os.Parcelable.Creator
        public final VDRClientEditScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return VDRClientEditScreen.f326098d;
        }

        @Override // android.os.Parcelable.Creator
        public final VDRClientEditScreen[] newArray(int i12) {
            return new VDRClientEditScreen[i12];
        }
    }

    public VDRClientEditScreen() {
        super("VDRClientEdit", false, 2, null);
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
