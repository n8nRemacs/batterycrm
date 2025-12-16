package com.avito.android.evidence_request.mvi.domain.evidence_request;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProofType.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_request/ProofType;", "Landroid/os/Parcelable;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProofType implements Parcelable {

    @k
    public static final Parcelable.Creator<ProofType> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f148733b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f148734c;

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
        this.f148733b = str;
        this.f148734c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProofType)) {
            return false;
        }
        ProofType proofType = (ProofType) obj;
        return L.f(this.f148733b, proofType.f148733b) && L.f(this.f148734c, proofType.f148734c);
    }

    public final int hashCode() {
        return this.f148734c.hashCode() + (this.f148733b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProofType(id=");
        sb2.append(this.f148733b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f148734c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f148733b);
        parcel.writeString(this.f148734c);
    }
}
