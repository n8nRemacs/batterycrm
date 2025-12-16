package com.avito.android.comfortable_deal.deal_income_details.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealIncomeDetailsDialogArguments.kt */
@F3
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal_income_details/model/DealIncomeDetailsDialogArguments;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DealIncomeDetailsDialogArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<DealIncomeDetailsDialogArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UniversalImage f121833b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f121834c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f121835d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f121836e;

    /* renamed from: f, reason: collision with root package name */
    public final int f121837f;

    /* renamed from: g, reason: collision with root package name */
    public final int f121838g;

    /* renamed from: h, reason: collision with root package name */
    public final int f121839h;

    /* renamed from: i, reason: collision with root package name */
    public final int f121840i;

    /* compiled from: DealIncomeDetailsDialogArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DealIncomeDetailsDialogArguments> {
        @Override // android.os.Parcelable.Creator
        public final DealIncomeDetailsDialogArguments createFromParcel(Parcel parcel) {
            return new DealIncomeDetailsDialogArguments((UniversalImage) parcel.readParcelable(DealIncomeDetailsDialogArguments.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(DealIncomeDetailsDialogArguments.class.getClassLoader()), (AttributedText) parcel.readParcelable(DealIncomeDetailsDialogArguments.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DealIncomeDetailsDialogArguments[] newArray(int i12) {
            return new DealIncomeDetailsDialogArguments[i12];
        }
    }

    public DealIncomeDetailsDialogArguments(@k UniversalImage universalImage, @k String str, @k AttributedText attributedText, @k AttributedText attributedText2, int i12, int i13, int i14, int i15) {
        this.f121833b = universalImage;
        this.f121834c = str;
        this.f121835d = attributedText;
        this.f121836e = attributedText2;
        this.f121837f = i12;
        this.f121838g = i13;
        this.f121839h = i14;
        this.f121840i = i15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DealIncomeDetailsDialogArguments)) {
            return false;
        }
        DealIncomeDetailsDialogArguments dealIncomeDetailsDialogArguments = (DealIncomeDetailsDialogArguments) obj;
        return L.f(this.f121833b, dealIncomeDetailsDialogArguments.f121833b) && L.f(this.f121834c, dealIncomeDetailsDialogArguments.f121834c) && L.f(this.f121835d, dealIncomeDetailsDialogArguments.f121835d) && L.f(this.f121836e, dealIncomeDetailsDialogArguments.f121836e) && this.f121837f == dealIncomeDetailsDialogArguments.f121837f && this.f121838g == dealIncomeDetailsDialogArguments.f121838g && this.f121839h == dealIncomeDetailsDialogArguments.f121839h && this.f121840i == dealIncomeDetailsDialogArguments.f121840i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121840i) + r.e(this.f121839h, r.e(this.f121838g, r.e(this.f121837f, com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(H.d(this.f121833b.hashCode() * 31, 31, this.f121834c), 31, this.f121835d), 31, this.f121836e), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DealIncomeDetailsDialogArguments(image=");
        sb2.append(this.f121833b);
        sb2.append(", backgroundGradient=");
        sb2.append(this.f121834c);
        sb2.append(", title=");
        sb2.append(this.f121835d);
        sb2.append(", description=");
        sb2.append(this.f121836e);
        sb2.append(", objectPriceByContract=");
        sb2.append(this.f121837f);
        sb2.append(", agentCommission=");
        sb2.append(this.f121838g);
        sb2.append(", productCommission=");
        sb2.append(this.f121839h);
        sb2.append(", productCommissionRate=");
        return r.t(sb2, this.f121840i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f121833b, i12);
        parcel.writeString(this.f121834c);
        parcel.writeParcelable(this.f121835d, i12);
        parcel.writeParcelable(this.f121836e, i12);
        parcel.writeInt(this.f121837f);
        parcel.writeInt(this.f121838g);
        parcel.writeInt(this.f121839h);
        parcel.writeInt(this.f121840i);
    }
}
