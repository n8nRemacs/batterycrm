package com.avito.android.mortgage.verification_flow.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.MortgageVerificationFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationFlowArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/verification_flow/model/VerificationFlowArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class VerificationFlowArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<VerificationFlowArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f203900b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final MortgageVerificationFlow f203901c;

    /* compiled from: VerificationFlowArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationFlowArguments> {
        @Override // android.os.Parcelable.Creator
        public final VerificationFlowArguments createFromParcel(Parcel parcel) {
            return new VerificationFlowArguments(parcel.readString(), MortgageVerificationFlow.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationFlowArguments[] newArray(int i12) {
            return new VerificationFlowArguments[i12];
        }
    }

    public VerificationFlowArguments(@k String str, @k MortgageVerificationFlow mortgageVerificationFlow) {
        this.f203900b = str;
        this.f203901c = mortgageVerificationFlow;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationFlowArguments)) {
            return false;
        }
        VerificationFlowArguments verificationFlowArguments = (VerificationFlowArguments) obj;
        return L.f(this.f203900b, verificationFlowArguments.f203900b) && L.f(this.f203901c, verificationFlowArguments.f203901c);
    }

    public final int hashCode() {
        return this.f203901c.hashCode() + (this.f203900b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "VerificationFlowArguments(applicationId=" + this.f203900b + ", content=" + this.f203901c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f203900b);
        this.f203901c.writeToParcel(parcel, i12);
    }
}
