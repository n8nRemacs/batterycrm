package com.avito.android.select_districts.perfomance;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: SelectDistrictsScreen.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/perfomance/SelectDistrictsScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes3.dex */
public final class SelectDistrictsScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final SelectDistrictsScreen f267115d = new SelectDistrictsScreen();

    @k
    public static final Parcelable.Creator<SelectDistrictsScreen> CREATOR = new a();

    /* compiled from: SelectDistrictsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectDistrictsScreen> {
        @Override // android.os.Parcelable.Creator
        public final SelectDistrictsScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return SelectDistrictsScreen.f267115d;
        }

        @Override // android.os.Parcelable.Creator
        public final SelectDistrictsScreen[] newArray(int i12) {
            return new SelectDistrictsScreen[i12];
        }
    }

    public SelectDistrictsScreen() {
        super("DistrictsPicker", false, 2, null);
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
