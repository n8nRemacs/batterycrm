package com.avito.android.evidence_request.mvi.domain.evidence_request;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProofTypesContent.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_request/ProofTypesContent;", "Landroid/os/Parcelable;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProofTypesContent implements Parcelable {

    @k
    public static final Parcelable.Creator<ProofTypesContent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f148735b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f148736c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<ProofType> f148737d;

    /* compiled from: ProofTypesContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProofTypesContent> {
        @Override // android.os.Parcelable.Creator
        public final ProofTypesContent createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ProofType.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ProofTypesContent(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ProofTypesContent[] newArray(int i12) {
            return new ProofTypesContent[i12];
        }
    }

    public ProofTypesContent(@k String str, @k String str2, @k List<ProofType> list) {
        this.f148735b = str;
        this.f148736c = str2;
        this.f148737d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProofTypesContent)) {
            return false;
        }
        ProofTypesContent proofTypesContent = (ProofTypesContent) obj;
        return L.f(this.f148735b, proofTypesContent.f148735b) && L.f(this.f148736c, proofTypesContent.f148736c) && L.f(this.f148737d, proofTypesContent.f148737d);
    }

    public final int hashCode() {
        return this.f148737d.hashCode() + H.d(this.f148735b.hashCode() * 31, 31, this.f148736c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProofTypesContent(title=");
        sb2.append(this.f148735b);
        sb2.append(", description=");
        sb2.append(this.f148736c);
        sb2.append(", proofs=");
        return H.p(sb2, this.f148737d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f148735b);
        parcel.writeString(this.f148736c);
        Iterator itJ = C0.j(this.f148737d, parcel);
        while (itJ.hasNext()) {
            ((ProofType) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
