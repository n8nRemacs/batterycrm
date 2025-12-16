package com.avito.android.publish.free_delivery.perf;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: FreeDeliveryPerfScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/free_delivery/perf/FreeDeliveryPerfScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes16.dex */
public final class FreeDeliveryPerfScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final FreeDeliveryPerfScreen f235871d = new FreeDeliveryPerfScreen();

    @k
    public static final Parcelable.Creator<FreeDeliveryPerfScreen> CREATOR = new a();

    /* compiled from: FreeDeliveryPerfScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FreeDeliveryPerfScreen> {
        @Override // android.os.Parcelable.Creator
        public final FreeDeliveryPerfScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return FreeDeliveryPerfScreen.f235871d;
        }

        @Override // android.os.Parcelable.Creator
        public final FreeDeliveryPerfScreen[] newArray(int i12) {
            return new FreeDeliveryPerfScreen[i12];
        }
    }

    public FreeDeliveryPerfScreen() {
        super("FreeDeliveryPublish", false, 2, null);
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
