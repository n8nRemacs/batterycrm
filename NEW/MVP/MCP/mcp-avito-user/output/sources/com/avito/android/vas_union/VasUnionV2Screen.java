package com.avito.android.vas_union;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: VasUnionV2PerfScreens.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_union/VasUnionV2Screen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes5.dex */
public final class VasUnionV2Screen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final VasUnionV2Screen f323113d = new VasUnionV2Screen();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f323114e = "vasUnionV2";

    @k
    public static final Parcelable.Creator<VasUnionV2Screen> CREATOR = new a();

    /* compiled from: VasUnionV2PerfScreens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasUnionV2Screen> {
        @Override // android.os.Parcelable.Creator
        public final VasUnionV2Screen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return VasUnionV2Screen.f323113d;
        }

        @Override // android.os.Parcelable.Creator
        public final VasUnionV2Screen[] newArray(int i12) {
            return new VasUnionV2Screen[i12];
        }
    }

    public VasUnionV2Screen() {
        super("VasUnionV2", false, 2, null);
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
