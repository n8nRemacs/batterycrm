package com.avito.android.vas_autoprolong;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: PerfScreens.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_autoprolong/VasAutoprolongPerfScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes5.dex */
public final class VasAutoprolongPerfScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final VasAutoprolongPerfScreen f319455d = new VasAutoprolongPerfScreen();

    @k
    public static final Parcelable.Creator<VasAutoprolongPerfScreen> CREATOR = new a();

    /* compiled from: PerfScreens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasAutoprolongPerfScreen> {
        @Override // android.os.Parcelable.Creator
        public final VasAutoprolongPerfScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return VasAutoprolongPerfScreen.f319455d;
        }

        @Override // android.os.Parcelable.Creator
        public final VasAutoprolongPerfScreen[] newArray(int i12) {
            return new VasAutoprolongPerfScreen[i12];
        }
    }

    public VasAutoprolongPerfScreen() {
        super("VasAutoprolongScreen", false, 2, null);
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
