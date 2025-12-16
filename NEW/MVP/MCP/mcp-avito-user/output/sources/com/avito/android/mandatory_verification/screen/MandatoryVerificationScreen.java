package com.avito.android.mandatory_verification.screen;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: MandatoryVerificationScreen.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mandatory_verification/screen/MandatoryVerificationScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes14.dex */
public final class MandatoryVerificationScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final MandatoryVerificationScreen f184809d = new MandatoryVerificationScreen();

    @k
    public static final Parcelable.Creator<MandatoryVerificationScreen> CREATOR = new a();

    /* compiled from: MandatoryVerificationScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MandatoryVerificationScreen> {
        @Override // android.os.Parcelable.Creator
        public final MandatoryVerificationScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return MandatoryVerificationScreen.f184809d;
        }

        @Override // android.os.Parcelable.Creator
        public final MandatoryVerificationScreen[] newArray(int i12) {
            return new MandatoryVerificationScreen[i12];
        }
    }

    public MandatoryVerificationScreen() {
        super("MandatoryVerification", false, 2, null);
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
