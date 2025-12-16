package com.avito.android.wallet.page.topup.form;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: TopUpFormPerfScreen.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/TopUpFormPerfScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes5.dex */
public final class TopUpFormPerfScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final TopUpFormPerfScreen f328244d = new TopUpFormPerfScreen();

    @k
    public static final Parcelable.Creator<TopUpFormPerfScreen> CREATOR = new a();

    /* compiled from: TopUpFormPerfScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TopUpFormPerfScreen> {
        @Override // android.os.Parcelable.Creator
        public final TopUpFormPerfScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return TopUpFormPerfScreen.f328244d;
        }

        @Override // android.os.Parcelable.Creator
        public final TopUpFormPerfScreen[] newArray(int i12) {
            return new TopUpFormPerfScreen[i12];
        }
    }

    public TopUpFormPerfScreen() {
        super("WalletReplenishmentParameters", false, 2, null);
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
