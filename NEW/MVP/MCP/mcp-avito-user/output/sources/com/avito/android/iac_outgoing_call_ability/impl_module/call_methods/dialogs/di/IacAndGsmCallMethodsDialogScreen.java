package com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.di;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: IacCallMethodsDialogPerformanceTrackerModule.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/di/IacAndGsmCallMethodsDialogScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes14.dex */
public final class IacAndGsmCallMethodsDialogScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final IacAndGsmCallMethodsDialogScreen f168457d = new IacAndGsmCallMethodsDialogScreen();

    @k
    public static final Parcelable.Creator<IacAndGsmCallMethodsDialogScreen> CREATOR = new a();

    /* compiled from: IacCallMethodsDialogPerformanceTrackerModule.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacAndGsmCallMethodsDialogScreen> {
        @Override // android.os.Parcelable.Creator
        public final IacAndGsmCallMethodsDialogScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return IacAndGsmCallMethodsDialogScreen.f168457d;
        }

        @Override // android.os.Parcelable.Creator
        public final IacAndGsmCallMethodsDialogScreen[] newArray(int i12) {
            return new IacAndGsmCallMethodsDialogScreen[i12];
        }
    }

    public IacAndGsmCallMethodsDialogScreen() {
        super("IacAndGsmCallMethodsDialog", false, 2, null);
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
