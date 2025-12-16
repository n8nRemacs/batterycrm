package com.avito.android.success;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: SuccessScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/success/SuccessScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes4.dex */
public final class SuccessScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final SuccessScreen f291566d = new SuccessScreen();

    @Y61.k
    public static final Parcelable.Creator<SuccessScreen> CREATOR = new a();

    /* compiled from: SuccessScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuccessScreen> {
        @Override // android.os.Parcelable.Creator
        public final SuccessScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return SuccessScreen.f291566d;
        }

        @Override // android.os.Parcelable.Creator
        public final SuccessScreen[] newArray(int i12) {
            return new SuccessScreen[i12];
        }
    }

    public SuccessScreen() {
        super("Success", false, 2, null);
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
