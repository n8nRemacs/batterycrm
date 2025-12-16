package com.avito.android.cpx_promo.priceinput;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: CpxPromoPriceInputPerfScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/CpxPromoPriceInputPerfScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes12.dex */
public final class CpxPromoPriceInputPerfScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final CpxPromoPriceInputPerfScreen f127290d = new CpxPromoPriceInputPerfScreen();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final String f127291e = "cpxPromoPriceInput";

    @Y61.k
    public static final Parcelable.Creator<CpxPromoPriceInputPerfScreen> CREATOR = new a();

    /* compiled from: CpxPromoPriceInputPerfScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxPromoPriceInputPerfScreen> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromoPriceInputPerfScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return CpxPromoPriceInputPerfScreen.f127290d;
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromoPriceInputPerfScreen[] newArray(int i12) {
            return new CpxPromoPriceInputPerfScreen[i12];
        }
    }

    public CpxPromoPriceInputPerfScreen() {
        super("CpxPromoPriceInput", false, 2, null);
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
