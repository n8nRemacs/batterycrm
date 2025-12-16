package com.avito.android.mortgage.phone_confirm.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: PhoneConfirmed.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/model/PhoneConfirmed;", "Landroid/os/Parcelable;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PhoneConfirmed implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final PhoneConfirmed f201586b = new PhoneConfirmed();

    @k
    public static final Parcelable.Creator<PhoneConfirmed> CREATOR = new a();

    /* compiled from: PhoneConfirmed.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneConfirmed> {
        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmed createFromParcel(Parcel parcel) {
            parcel.readInt();
            return PhoneConfirmed.f201586b;
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmed[] newArray(int i12) {
            return new PhoneConfirmed[i12];
        }
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
