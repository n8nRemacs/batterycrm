package com.avito.android.autoteka.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.util.UtmParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPreviewSearchLink.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/AutotekaPreviewSearchDetails;", "Landroid/os/Parcelable;", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutotekaPreviewSearchDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaPreviewSearchDetails> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f96224b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f96225c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UtmParams f96226d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AutotekaStep f96227e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f96228f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f96229g;

    /* compiled from: AutotekaPreviewSearchLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaPreviewSearchDetails> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaPreviewSearchDetails createFromParcel(Parcel parcel) {
            return new AutotekaPreviewSearchDetails(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UtmParams) parcel.readParcelable(AutotekaPreviewSearchDetails.class.getClassLoader()), parcel.readInt() == 0 ? null : AutotekaStep.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaPreviewSearchDetails[] newArray(int i12) {
            return new AutotekaPreviewSearchDetails[i12];
        }
    }

    public AutotekaPreviewSearchDetails(@l String str, @l Integer num, @l UtmParams utmParams, @l AutotekaStep autotekaStep, boolean z12, boolean z13) {
        this.f96224b = str;
        this.f96225c = num;
        this.f96226d = utmParams;
        this.f96227e = autotekaStep;
        this.f96228f = z12;
        this.f96229g = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutotekaPreviewSearchDetails)) {
            return false;
        }
        AutotekaPreviewSearchDetails autotekaPreviewSearchDetails = (AutotekaPreviewSearchDetails) obj;
        return L.f(this.f96224b, autotekaPreviewSearchDetails.f96224b) && L.f(this.f96225c, autotekaPreviewSearchDetails.f96225c) && L.f(this.f96226d, autotekaPreviewSearchDetails.f96226d) && this.f96227e == autotekaPreviewSearchDetails.f96227e && this.f96228f == autotekaPreviewSearchDetails.f96228f && this.f96229g == autotekaPreviewSearchDetails.f96229g;
    }

    public final int hashCode() {
        String str = this.f96224b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f96225c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        UtmParams utmParams = this.f96226d;
        int iHashCode3 = (iHashCode2 + (utmParams == null ? 0 : utmParams.f318752b.hashCode())) * 31;
        AutotekaStep autotekaStep = this.f96227e;
        return Boolean.hashCode(this.f96229g) + r.i((iHashCode3 + (autotekaStep != null ? autotekaStep.hashCode() : 0)) * 31, 31, this.f96228f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaPreviewSearchDetails(searchKey=");
        sb2.append(this.f96224b);
        sb2.append(", fromBlock=");
        sb2.append(this.f96225c);
        sb2.append(", utmParams=");
        sb2.append(this.f96226d);
        sb2.append(", autotekaStep=");
        sb2.append(this.f96227e);
        sb2.append(", isRepurchase=");
        sb2.append(this.f96228f);
        sb2.append(", hideExampleReportButton=");
        return r.x(sb2, this.f96229g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f96224b);
        Integer num = this.f96225c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f96226d, i12);
        AutotekaStep autotekaStep = this.f96227e;
        if (autotekaStep == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(autotekaStep.name());
        }
        parcel.writeInt(this.f96228f ? 1 : 0);
        parcel.writeInt(this.f96229g ? 1 : 0);
    }

    public /* synthetic */ AutotekaPreviewSearchDetails(String str, Integer num, UtmParams utmParams, AutotekaStep autotekaStep, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, num, utmParams, autotekaStep, z12, z13);
    }
}
