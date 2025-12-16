package com.avito.android.auto_evidence_request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoEvidenceRequestOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_evidence_request/AutoEvidenceRequestOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutoEvidenceRequestOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<AutoEvidenceRequestOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f95037b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f95038c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f95039d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f95040e;

    /* compiled from: AutoEvidenceRequestOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoEvidenceRequestOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final AutoEvidenceRequestOpenParams createFromParcel(Parcel parcel) {
            return new AutoEvidenceRequestOpenParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoEvidenceRequestOpenParams[] newArray(int i12) {
            return new AutoEvidenceRequestOpenParams[i12];
        }
    }

    public AutoEvidenceRequestOpenParams(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4) {
        this.f95037b = str;
        this.f95038c = str2;
        this.f95039d = str3;
        this.f95040e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoEvidenceRequestOpenParams)) {
            return false;
        }
        AutoEvidenceRequestOpenParams autoEvidenceRequestOpenParams = (AutoEvidenceRequestOpenParams) obj;
        return L.f(this.f95037b, autoEvidenceRequestOpenParams.f95037b) && L.f(this.f95038c, autoEvidenceRequestOpenParams.f95038c) && L.f(this.f95039d, autoEvidenceRequestOpenParams.f95039d) && L.f(this.f95040e, autoEvidenceRequestOpenParams.f95040e);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f95037b.hashCode() * 31, 31, this.f95038c), 31, this.f95039d);
        String str = this.f95040e;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoEvidenceRequestOpenParams(itemId=");
        sb2.append(this.f95037b);
        sb2.append(", appealId=");
        sb2.append(this.f95038c);
        sb2.append(", proofType=");
        sb2.append(this.f95039d);
        sb2.append(", appealUrl=");
        return C22026a.c(sb2, this.f95040e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f95037b);
        parcel.writeString(this.f95038c);
        parcel.writeString(this.f95039d);
        parcel.writeString(this.f95040e);
    }

    public /* synthetic */ AutoEvidenceRequestOpenParams(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4);
    }
}
