package com.avito.android.evidence_request.mvi.domain.evidence_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceDetailsContent.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_details/EvidenceDetailsContent;", "Landroid/os/Parcelable;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EvidenceDetailsContent implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<EvidenceDetailsContent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f148659b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AttributedText f148660c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f148661d;

    /* compiled from: EvidenceDetailsContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EvidenceDetailsContent> {
        @Override // android.os.Parcelable.Creator
        public final EvidenceDetailsContent createFromParcel(Parcel parcel) {
            return new EvidenceDetailsContent((AttributedText) parcel.readParcelable(EvidenceDetailsContent.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final EvidenceDetailsContent[] newArray(int i12) {
            return new EvidenceDetailsContent[i12];
        }
    }

    public EvidenceDetailsContent(@Y61.k AttributedText attributedText, @Y61.k String str, boolean z12) {
        this.f148659b = str;
        this.f148660c = attributedText;
        this.f148661d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvidenceDetailsContent)) {
            return false;
        }
        EvidenceDetailsContent evidenceDetailsContent = (EvidenceDetailsContent) obj;
        return L.f(this.f148659b, evidenceDetailsContent.f148659b) && L.f(this.f148660c, evidenceDetailsContent.f148660c) && this.f148661d == evidenceDetailsContent.f148661d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f148661d) + com.avito.android.actions_sheet.a.b(this.f148659b.hashCode() * 31, 31, this.f148660c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EvidenceDetailsContent(title=");
        sb2.append(this.f148659b);
        sb2.append(", description=");
        sb2.append(this.f148660c);
        sb2.append(", bottomDisclaimer=");
        return androidx.appcompat.app.r.x(sb2, this.f148661d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f148659b);
        parcel.writeParcelable(this.f148660c, i12);
        parcel.writeInt(this.f148661d ? 1 : 0);
    }
}
