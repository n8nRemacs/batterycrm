package com.avito.android.service_booking.mvi.step.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingMviStepState.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/StepBlockProperty;", "Landroid/os/Parcelable;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StepBlockProperty implements Parcelable {

    @k
    public static final Parcelable.Creator<StepBlockProperty> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Boolean f274735b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f274736c;

    /* compiled from: ServiceBookingMviStepState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StepBlockProperty> {
        @Override // android.os.Parcelable.Creator
        public final StepBlockProperty createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StepBlockProperty(boolValueOf, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StepBlockProperty[] newArray(int i12) {
            return new StepBlockProperty[i12];
        }
    }

    public StepBlockProperty(@l Boolean bool, boolean z12) {
        this.f274735b = bool;
        this.f274736c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepBlockProperty)) {
            return false;
        }
        StepBlockProperty stepBlockProperty = (StepBlockProperty) obj;
        return L.f(this.f274735b, stepBlockProperty.f274735b) && this.f274736c == stepBlockProperty.f274736c;
    }

    public final int hashCode() {
        Boolean bool = this.f274735b;
        return Boolean.hashCode(this.f274736c) + ((bool == null ? 0 : bool.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StepBlockProperty(isOptional=");
        sb2.append(this.f274735b);
        sb2.append(", isValueNull=");
        return r.x(sb2, this.f274736c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Boolean bool = this.f274735b;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.f274736c ? 1 : 0);
    }
}
