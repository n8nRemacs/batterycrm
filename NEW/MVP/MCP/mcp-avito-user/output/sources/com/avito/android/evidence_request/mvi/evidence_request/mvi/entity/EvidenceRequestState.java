package com.avito.android.evidence_request.mvi.evidence_request.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.evidence_request.mvi.domain.evidence_request.EvidenceContent;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceRequestState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_request/mvi/entity/EvidenceRequestState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EvidenceRequestState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final EvidenceContent f149154b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f149152c = new a(null);

    @k
    public static final Parcelable.Creator<EvidenceRequestState> CREATOR = new b();

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final EvidenceRequestState f149153d = new EvidenceRequestState(null);

    /* compiled from: EvidenceRequestState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_request/mvi/entity/EvidenceRequestState$a;", "", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EvidenceRequestState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<EvidenceRequestState> {
        @Override // android.os.Parcelable.Creator
        public final EvidenceRequestState createFromParcel(Parcel parcel) {
            return new EvidenceRequestState(parcel.readInt() == 0 ? null : EvidenceContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EvidenceRequestState[] newArray(int i12) {
            return new EvidenceRequestState[i12];
        }
    }

    public EvidenceRequestState(@l EvidenceContent evidenceContent) {
        this.f149154b = evidenceContent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EvidenceRequestState) && L.f(this.f149154b, ((EvidenceRequestState) obj).f149154b);
    }

    public final int hashCode() {
        EvidenceContent evidenceContent = this.f149154b;
        if (evidenceContent == null) {
            return 0;
        }
        return evidenceContent.hashCode();
    }

    @k
    public final String toString() {
        return "EvidenceRequestState(data=" + this.f149154b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        EvidenceContent evidenceContent = this.f149154b;
        if (evidenceContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            evidenceContent.writeToParcel(parcel, i12);
        }
    }
}
