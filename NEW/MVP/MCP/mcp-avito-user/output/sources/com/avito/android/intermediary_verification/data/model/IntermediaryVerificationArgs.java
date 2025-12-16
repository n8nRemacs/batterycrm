package com.avito.android.intermediary_verification.data.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IntermediaryVerificationData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/intermediary_verification/data/model/IntermediaryVerificationArgs;", "Landroid/os/Parcelable;", "_avito_intermediary-verification_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IntermediaryVerificationArgs implements Parcelable {

    @k
    public static final Parcelable.Creator<IntermediaryVerificationArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final IntermediaryVerificationData f173088b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final IntermediaryVerificationWaitingData f173089c;

    /* compiled from: IntermediaryVerificationData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IntermediaryVerificationArgs> {
        @Override // android.os.Parcelable.Creator
        public final IntermediaryVerificationArgs createFromParcel(Parcel parcel) {
            return new IntermediaryVerificationArgs(IntermediaryVerificationData.CREATOR.createFromParcel(parcel), IntermediaryVerificationWaitingData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final IntermediaryVerificationArgs[] newArray(int i12) {
            return new IntermediaryVerificationArgs[i12];
        }
    }

    public IntermediaryVerificationArgs(@k IntermediaryVerificationData intermediaryVerificationData, @k IntermediaryVerificationWaitingData intermediaryVerificationWaitingData) {
        this.f173088b = intermediaryVerificationData;
        this.f173089c = intermediaryVerificationWaitingData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntermediaryVerificationArgs)) {
            return false;
        }
        IntermediaryVerificationArgs intermediaryVerificationArgs = (IntermediaryVerificationArgs) obj;
        return L.f(this.f173088b, intermediaryVerificationArgs.f173088b) && L.f(this.f173089c, intermediaryVerificationArgs.f173089c);
    }

    public final int hashCode() {
        return this.f173089c.hashCode() + (this.f173088b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "IntermediaryVerificationArgs(initialData=" + this.f173088b + ", waitingData=" + this.f173089c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f173088b.writeToParcel(parcel, i12);
        this.f173089c.writeToParcel(parcel, i12);
    }
}
