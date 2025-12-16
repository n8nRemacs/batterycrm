package com.avito.android.evidence_request.mvi.domain.evidence_request;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: EvidenceContent.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_request/EvidenceContent;", "Landroid/os/Parcelable;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EvidenceContent implements Parcelable {

    @k
    public static final Parcelable.Creator<EvidenceContent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ProofTypesContent f148726b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f148727c;

    /* compiled from: EvidenceContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EvidenceContent> {
        @Override // android.os.Parcelable.Creator
        public final EvidenceContent createFromParcel(Parcel parcel) {
            ProofTypesContent proofTypesContentCreateFromParcel = ProofTypesContent.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(parcel.readString(), ProofDetailsContent.CREATOR.createFromParcel(parcel));
            }
            return new EvidenceContent(proofTypesContentCreateFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final EvidenceContent[] newArray(int i12) {
            return new EvidenceContent[i12];
        }
    }

    public EvidenceContent(@k ProofTypesContent proofTypesContent, @k LinkedHashMap linkedHashMap) {
        this.f148726b = proofTypesContent;
        this.f148727c = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvidenceContent)) {
            return false;
        }
        EvidenceContent evidenceContent = (EvidenceContent) obj;
        return L.f(this.f148726b, evidenceContent.f148726b) && this.f148727c.equals(evidenceContent.f148727c);
    }

    public final int hashCode() {
        return this.f148727c.hashCode() + (this.f148726b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EvidenceContent(types=");
        sb2.append(this.f148726b);
        sb2.append(", details=");
        return h.e(sb2, this.f148727c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f148726b.writeToParcel(parcel, i12);
        LinkedHashMap linkedHashMap = this.f148727c;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            ((ProofDetailsContent) entry.getValue()).writeToParcel(parcel, i12);
        }
    }
}
