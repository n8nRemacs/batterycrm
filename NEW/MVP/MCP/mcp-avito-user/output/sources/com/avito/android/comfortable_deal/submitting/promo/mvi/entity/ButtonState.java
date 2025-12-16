package com.avito.android.comfortable_deal.submitting.promo.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoState.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/ButtonState;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ButtonState implements Parcelable {

    @k
    public static final Parcelable.Creator<ButtonState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f123168b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f123169c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f123170d;

    /* compiled from: PromoState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ButtonState> {
        @Override // android.os.Parcelable.Creator
        public final ButtonState createFromParcel(Parcel parcel) {
            return new ButtonState(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonState[] newArray(int i12) {
            return new ButtonState[i12];
        }
    }

    public ButtonState(boolean z12, boolean z13, @l String str) {
        this.f123168b = z12;
        this.f123169c = z13;
        this.f123170d = str;
    }

    public static ButtonState a(ButtonState buttonState, boolean z12, boolean z13, int i12) {
        if ((i12 & 2) != 0) {
            z13 = buttonState.f123169c;
        }
        String str = buttonState.f123170d;
        buttonState.getClass();
        return new ButtonState(z12, z13, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonState)) {
            return false;
        }
        ButtonState buttonState = (ButtonState) obj;
        return this.f123168b == buttonState.f123168b && this.f123169c == buttonState.f123169c && L.f(this.f123170d, buttonState.f123170d);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f123168b) * 31, 31, this.f123169c);
        String str = this.f123170d;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonState(isEnabled=");
        sb2.append(this.f123168b);
        sb2.append(", isLoading=");
        sb2.append(this.f123169c);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f123170d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f123168b ? 1 : 0);
        parcel.writeInt(this.f123169c ? 1 : 0);
        parcel.writeString(this.f123170d);
    }
}
