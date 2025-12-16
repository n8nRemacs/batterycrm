package com.avito.android.evidence_request.mvi.domain.evidence_request;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProofDetailsContent.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_request/ProofDetailsContent;", "Landroid/os/Parcelable;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProofDetailsContent implements Parcelable {

    @k
    public static final Parcelable.Creator<ProofDetailsContent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f148728b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f148729c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f148730d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<ParcelableItem> f148731e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<ParameterSlot> f148732f;

    /* compiled from: ProofDetailsContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProofDetailsContent> {
        @Override // android.os.Parcelable.Creator
        public final ProofDetailsContent createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ProofDetailsContent.class.getClassLoader());
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL3 = 0;
            while (iL3 != i12) {
                iL3 = com.avito.android.actions_sheet.a.l(ProofDetailsContent.class, parcel, arrayList, iL3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(ProofDetailsContent.class, parcel, arrayList2, iL2, 1);
            }
            return new ProofDetailsContent(string, arrayList, arrayList2, z12, attributedText);
        }

        @Override // android.os.Parcelable.Creator
        public final ProofDetailsContent[] newArray(int i12) {
            return new ProofDetailsContent[i12];
        }
    }

    public ProofDetailsContent(@k String str, @k List list, @k List list2, boolean z12, @k AttributedText attributedText) {
        this.f148728b = str;
        this.f148729c = attributedText;
        this.f148730d = z12;
        this.f148731e = list;
        this.f148732f = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProofDetailsContent)) {
            return false;
        }
        ProofDetailsContent proofDetailsContent = (ProofDetailsContent) obj;
        return L.f(this.f148728b, proofDetailsContent.f148728b) && L.f(this.f148729c, proofDetailsContent.f148729c) && this.f148730d == proofDetailsContent.f148730d && L.f(this.f148731e, proofDetailsContent.f148731e) && L.f(this.f148732f, proofDetailsContent.f148732f);
    }

    public final int hashCode() {
        return this.f148732f.hashCode() + H.e(r.i(com.avito.android.actions_sheet.a.b(this.f148728b.hashCode() * 31, 31, this.f148729c), 31, this.f148730d), 31, this.f148731e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProofDetailsContent(title=");
        sb2.append(this.f148728b);
        sb2.append(", description=");
        sb2.append(this.f148729c);
        sb2.append(", showBottomDisclaimer=");
        sb2.append(this.f148730d);
        sb2.append(", topItems=");
        sb2.append(this.f148731e);
        sb2.append(", params=");
        return H.p(sb2, this.f148732f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f148728b);
        parcel.writeParcelable(this.f148729c, i12);
        parcel.writeInt(this.f148730d ? 1 : 0);
        Iterator itJ = C0.j(this.f148731e, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        Iterator itJ2 = C0.j(this.f148732f, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), i12);
        }
    }
}
