package com.avito.android.sbc.confirm;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.paid_services.routing.ProgressState;
import kotlin.Metadata;

/* compiled from: ConfirmDiscountDispatchTariffSuccessActivity.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/confirm/CreateDiscountDispatchTariffSuccessArgs;", "Landroid/os/Parcelable;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreateDiscountDispatchTariffSuccessArgs implements Parcelable {

    @k
    public static final Parcelable.Creator<CreateDiscountDispatchTariffSuccessArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f259149b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f259150c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f259151d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f259152e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ProgressState f259153f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ProgressState f259154g;

    /* renamed from: h, reason: collision with root package name */
    public final float f259155h;

    /* compiled from: ConfirmDiscountDispatchTariffSuccessActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreateDiscountDispatchTariffSuccessArgs> {
        @Override // android.os.Parcelable.Creator
        public final CreateDiscountDispatchTariffSuccessArgs createFromParcel(Parcel parcel) {
            return new CreateDiscountDispatchTariffSuccessArgs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), ProgressState.valueOf(parcel.readString()), ProgressState.valueOf(parcel.readString()), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final CreateDiscountDispatchTariffSuccessArgs[] newArray(int i12) {
            return new CreateDiscountDispatchTariffSuccessArgs[i12];
        }
    }

    public CreateDiscountDispatchTariffSuccessArgs(@k String str, @k String str2, @k String str3, @k String str4, @k ProgressState progressState, @k ProgressState progressState2, float f12) {
        this.f259149b = str;
        this.f259150c = str2;
        this.f259151d = str3;
        this.f259152e = str4;
        this.f259153f = progressState;
        this.f259154g = progressState2;
        this.f259155h = f12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f259149b);
        parcel.writeString(this.f259150c);
        parcel.writeString(this.f259151d);
        parcel.writeString(this.f259152e);
        parcel.writeString(this.f259153f.name());
        parcel.writeString(this.f259154g.name());
        parcel.writeFloat(this.f259155h);
    }
}
