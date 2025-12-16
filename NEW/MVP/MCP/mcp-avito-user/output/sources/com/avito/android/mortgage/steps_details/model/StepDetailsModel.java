package com.avito.android.mortgage.steps_details.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StepDetailsModel.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/steps_details/model/StepDetailsModel;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class StepDetailsModel implements Parcelable {

    @k
    public static final Parcelable.Creator<StepDetailsModel> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f203821b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f203822c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f203823d;

    /* compiled from: StepDetailsModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StepDetailsModel> {
        @Override // android.os.Parcelable.Creator
        public final StepDetailsModel createFromParcel(Parcel parcel) {
            return new StepDetailsModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StepDetailsModel[] newArray(int i12) {
            return new StepDetailsModel[i12];
        }
    }

    public StepDetailsModel(@k String str, @k String str2, @k String str3) {
        this.f203821b = str;
        this.f203822c = str2;
        this.f203823d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepDetailsModel)) {
            return false;
        }
        StepDetailsModel stepDetailsModel = (StepDetailsModel) obj;
        return L.f(this.f203821b, stepDetailsModel.f203821b) && L.f(this.f203822c, stepDetailsModel.f203822c) && L.f(this.f203823d, stepDetailsModel.f203823d);
    }

    public final int hashCode() {
        return this.f203823d.hashCode() + H.d(this.f203821b.hashCode() * 31, 31, this.f203822c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StepDetailsModel(title=");
        sb2.append(this.f203821b);
        sb2.append(", description=");
        sb2.append(this.f203822c);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f203823d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f203821b);
        parcel.writeString(this.f203822c);
        parcel.writeString(this.f203823d);
    }
}
