package com.avito.android.evidence_request.repository.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ProofType.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/repository/model/ProofType;", "Landroid/os/Parcelable;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProofType implements Parcelable {

    @k
    public static final Parcelable.Creator<ProofType> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f149206b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f149207c;

    /* compiled from: ProofType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProofType> {
        @Override // android.os.Parcelable.Creator
        public final ProofType createFromParcel(Parcel parcel) {
            return new ProofType(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProofType[] newArray(int i12) {
            return new ProofType[i12];
        }
    }

    public ProofType(@k String str, @k String str2) {
        this.f149206b = str;
        this.f149207c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f149206b);
        parcel.writeString(this.f149207c);
    }
}
