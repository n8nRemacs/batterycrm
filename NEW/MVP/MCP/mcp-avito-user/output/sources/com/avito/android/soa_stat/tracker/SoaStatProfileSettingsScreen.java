package com.avito.android.soa_stat.tracker;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: SoaStatProfileSettingsScreen.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/soa_stat/tracker/SoaStatProfileSettingsScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes3.dex */
public final class SoaStatProfileSettingsScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final SoaStatProfileSettingsScreen f284266d = new SoaStatProfileSettingsScreen();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f284267e = "data";

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f284268f = "enable-setting";

    @k
    public static final Parcelable.Creator<SoaStatProfileSettingsScreen> CREATOR = new a();

    /* compiled from: SoaStatProfileSettingsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SoaStatProfileSettingsScreen> {
        @Override // android.os.Parcelable.Creator
        public final SoaStatProfileSettingsScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return SoaStatProfileSettingsScreen.f284266d;
        }

        @Override // android.os.Parcelable.Creator
        public final SoaStatProfileSettingsScreen[] newArray(int i12) {
            return new SoaStatProfileSettingsScreen[i12];
        }
    }

    public SoaStatProfileSettingsScreen() {
        super("SoaStatProfileSettings", false, 2, null);
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
