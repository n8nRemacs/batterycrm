package com.avito.android.mortgage.document_requirements.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Document.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_requirements/model/RequirementParagraph;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RequirementParagraph implements Parcelable {

    @k
    public static final Parcelable.Creator<RequirementParagraph> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f198975b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f198976c;

    /* renamed from: d, reason: collision with root package name */
    public final int f198977d;

    /* compiled from: Document.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RequirementParagraph> {
        @Override // android.os.Parcelable.Creator
        public final RequirementParagraph createFromParcel(Parcel parcel) {
            return new RequirementParagraph(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (AttributedText) parcel.readParcelable(RequirementParagraph.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RequirementParagraph[] newArray(int i12) {
            return new RequirementParagraph[i12];
        }
    }

    public RequirementParagraph(@l @e0 Integer num, @k AttributedText attributedText, int i12) {
        this.f198975b = num;
        this.f198976c = attributedText;
        this.f198977d = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequirementParagraph)) {
            return false;
        }
        RequirementParagraph requirementParagraph = (RequirementParagraph) obj;
        return L.f(this.f198975b, requirementParagraph.f198975b) && L.f(this.f198976c, requirementParagraph.f198976c) && this.f198977d == requirementParagraph.f198977d;
    }

    public final int hashCode() {
        Integer num = this.f198975b;
        return Integer.hashCode(this.f198977d) + com.avito.android.actions_sheet.a.b((num == null ? 0 : num.hashCode()) * 31, 31, this.f198976c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RequirementParagraph(title=");
        sb2.append(this.f198975b);
        sb2.append(", description=");
        sb2.append(this.f198976c);
        sb2.append(", bottomPaddingDp=");
        return r.t(sb2, this.f198977d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.f198975b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f198976c, i12);
        parcel.writeInt(this.f198977d);
    }

    public /* synthetic */ RequirementParagraph(Integer num, AttributedText attributedText, int i12, int i13, C42822w c42822w) {
        this(num, attributedText, (i13 & 4) != 0 ? 24 : i12);
    }
}
