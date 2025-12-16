package com.avito.android.mortgage.selected_appeal.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealComment;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealCreditInfo;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectedAppealArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/model/SelectedAppealArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SelectedAppealArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectedAppealArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f203438b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f203439c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f203440d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f203441e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f203442f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ApplicationAppealCreditInfo f203443g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ApplicationAppealComment f203444h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f203445i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f203446j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f203447k;

    /* compiled from: SelectedAppealArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectedAppealArguments> {
        @Override // android.os.Parcelable.Creator
        public final SelectedAppealArguments createFromParcel(Parcel parcel) {
            return new SelectedAppealArguments(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(SelectedAppealArguments.class.getClassLoader()), parcel.readInt() == 0 ? null : ApplicationAppealCreditInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ApplicationAppealComment.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectedAppealArguments[] newArray(int i12) {
            return new SelectedAppealArguments[i12];
        }
    }

    public SelectedAppealArguments(@k String str, @k String str2, @k String str3, @k String str4, @l AttributedText attributedText, @l ApplicationAppealCreditInfo applicationAppealCreditInfo, @l ApplicationAppealComment applicationAppealComment, @l String str5, @l String str6, @l String str7) {
        this.f203438b = str;
        this.f203439c = str2;
        this.f203440d = str3;
        this.f203441e = str4;
        this.f203442f = attributedText;
        this.f203443g = applicationAppealCreditInfo;
        this.f203444h = applicationAppealComment;
        this.f203445i = str5;
        this.f203446j = str6;
        this.f203447k = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedAppealArguments)) {
            return false;
        }
        SelectedAppealArguments selectedAppealArguments = (SelectedAppealArguments) obj;
        return L.f(this.f203438b, selectedAppealArguments.f203438b) && L.f(this.f203439c, selectedAppealArguments.f203439c) && L.f(this.f203440d, selectedAppealArguments.f203440d) && L.f(this.f203441e, selectedAppealArguments.f203441e) && L.f(this.f203442f, selectedAppealArguments.f203442f) && L.f(this.f203443g, selectedAppealArguments.f203443g) && L.f(this.f203444h, selectedAppealArguments.f203444h) && L.f(this.f203445i, selectedAppealArguments.f203445i) && L.f(this.f203446j, selectedAppealArguments.f203446j) && L.f(this.f203447k, selectedAppealArguments.f203447k);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(this.f203438b.hashCode() * 31, 31, this.f203439c), 31, this.f203440d), 31, this.f203441e);
        AttributedText attributedText = this.f203442f;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ApplicationAppealCreditInfo applicationAppealCreditInfo = this.f203443g;
        int iHashCode2 = (iHashCode + (applicationAppealCreditInfo == null ? 0 : applicationAppealCreditInfo.hashCode())) * 31;
        ApplicationAppealComment applicationAppealComment = this.f203444h;
        int iHashCode3 = (iHashCode2 + (applicationAppealComment == null ? 0 : applicationAppealComment.hashCode())) * 31;
        String str = this.f203445i;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f203446j;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f203447k;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedAppealArguments(applicationId=");
        sb2.append(this.f203438b);
        sb2.append(", appealId=");
        sb2.append(this.f203439c);
        sb2.append(", iconUrl=");
        sb2.append(this.f203440d);
        sb2.append(", title=");
        sb2.append(this.f203441e);
        sb2.append(", status=");
        sb2.append(this.f203442f);
        sb2.append(", creditInfo=");
        sb2.append(this.f203443g);
        sb2.append(", comment=");
        sb2.append(this.f203444h);
        sb2.append(", selectBankButtonTitle=");
        sb2.append(this.f203445i);
        sb2.append(", applicantType=");
        sb2.append(this.f203446j);
        sb2.append(", currentMortgageStage=");
        return C22026a.c(sb2, this.f203447k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f203438b);
        parcel.writeString(this.f203439c);
        parcel.writeString(this.f203440d);
        parcel.writeString(this.f203441e);
        parcel.writeParcelable(this.f203442f, i12);
        ApplicationAppealCreditInfo applicationAppealCreditInfo = this.f203443g;
        if (applicationAppealCreditInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            applicationAppealCreditInfo.writeToParcel(parcel, i12);
        }
        ApplicationAppealComment applicationAppealComment = this.f203444h;
        if (applicationAppealComment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            applicationAppealComment.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f203445i);
        parcel.writeString(this.f203446j);
        parcel.writeString(this.f203447k);
    }
}
