package com.avito.android.developments_agency_search.screen.deal_cabinet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: DealCabinetScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/DealCabinetScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes13.dex */
public final class DealCabinetScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final DealCabinetScreen f136785d = new DealCabinetScreen();

    @Y61.k
    public static final Parcelable.Creator<DealCabinetScreen> CREATOR = new a();

    /* compiled from: DealCabinetScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DealCabinetScreen> {
        @Override // android.os.Parcelable.Creator
        public final DealCabinetScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return DealCabinetScreen.f136785d;
        }

        @Override // android.os.Parcelable.Creator
        public final DealCabinetScreen[] newArray(int i12) {
            return new DealCabinetScreen[i12];
        }
    }

    public DealCabinetScreen() {
        super("RealtyAgencyProfile", false, 2, null);
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
