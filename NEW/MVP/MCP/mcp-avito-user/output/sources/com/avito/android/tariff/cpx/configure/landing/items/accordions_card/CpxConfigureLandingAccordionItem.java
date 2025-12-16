package com.avito.android.tariff.cpx.configure.landing.items.accordions_card;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureLandingAccordionsCardItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/items/accordions_card/CpxConfigureLandingAccordionItem;", "Landroid/os/Parcelable;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CpxConfigureLandingAccordionItem implements Parcelable {

    @k
    public static final Parcelable.Creator<CpxConfigureLandingAccordionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f295941b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f295942c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f295943d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f295944e;

    /* compiled from: CpxConfigureLandingAccordionsCardItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxConfigureLandingAccordionItem> {
        @Override // android.os.Parcelable.Creator
        public final CpxConfigureLandingAccordionItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            return new CpxConfigureLandingAccordionItem(parcel.readInt() != 0, (AttributedText) parcel.readParcelable(CpxConfigureLandingAccordionItem.class.getClassLoader()), string, (AttributedText) parcel.readParcelable(CpxConfigureLandingAccordionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CpxConfigureLandingAccordionItem[] newArray(int i12) {
            return new CpxConfigureLandingAccordionItem[i12];
        }
    }

    public CpxConfigureLandingAccordionItem(boolean z12, @k AttributedText attributedText, @k String str, @k AttributedText attributedText2) {
        this.f295941b = str;
        this.f295942c = attributedText;
        this.f295943d = attributedText2;
        this.f295944e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CpxConfigureLandingAccordionItem)) {
            return false;
        }
        CpxConfigureLandingAccordionItem cpxConfigureLandingAccordionItem = (CpxConfigureLandingAccordionItem) obj;
        return L.f(this.f295941b, cpxConfigureLandingAccordionItem.f295941b) && L.f(this.f295942c, cpxConfigureLandingAccordionItem.f295942c) && L.f(this.f295943d, cpxConfigureLandingAccordionItem.f295943d) && this.f295944e == cpxConfigureLandingAccordionItem.f295944e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f295944e) + com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(this.f295941b.hashCode() * 31, 31, this.f295942c), 31, this.f295943d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxConfigureLandingAccordionItem(tagId=");
        sb2.append(this.f295941b);
        sb2.append(", title=");
        sb2.append(this.f295942c);
        sb2.append(", description=");
        sb2.append(this.f295943d);
        sb2.append(", isExpanded=");
        return r.x(sb2, this.f295944e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f295941b);
        parcel.writeParcelable(this.f295942c, i12);
        parcel.writeParcelable(this.f295943d, i12);
        parcel.writeInt(this.f295944e ? 1 : 0);
    }
}
