package com.avito.android.mortgage.acceptance_dialog.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AcceptanceDialogArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/acceptance_dialog/model/AcceptanceDialogArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AcceptanceDialogArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<AcceptanceDialogArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f198187b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f198188c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f198189d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PrintableText f198190e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final PrintableText f198191f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ButtonStyle f198192g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Parcelable f198193h;

    /* compiled from: AcceptanceDialogArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AcceptanceDialogArguments> {
        @Override // android.os.Parcelable.Creator
        public final AcceptanceDialogArguments createFromParcel(Parcel parcel) {
            return new AcceptanceDialogArguments(parcel.readString(), (PrintableText) parcel.readParcelable(AcceptanceDialogArguments.class.getClassLoader()), (PrintableText) parcel.readParcelable(AcceptanceDialogArguments.class.getClassLoader()), (PrintableText) parcel.readParcelable(AcceptanceDialogArguments.class.getClassLoader()), (PrintableText) parcel.readParcelable(AcceptanceDialogArguments.class.getClassLoader()), ButtonStyle.CREATOR.createFromParcel(parcel), parcel.readParcelable(AcceptanceDialogArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AcceptanceDialogArguments[] newArray(int i12) {
            return new AcceptanceDialogArguments[i12];
        }
    }

    public AcceptanceDialogArguments(@k String str, @k PrintableText printableText, @k PrintableText printableText2, @k PrintableText printableText3, @k PrintableText printableText4, @k ButtonStyle buttonStyle, @l Parcelable parcelable) {
        this.f198187b = str;
        this.f198188c = printableText;
        this.f198189d = printableText2;
        this.f198190e = printableText3;
        this.f198191f = printableText4;
        this.f198192g = buttonStyle;
        this.f198193h = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcceptanceDialogArguments)) {
            return false;
        }
        AcceptanceDialogArguments acceptanceDialogArguments = (AcceptanceDialogArguments) obj;
        return L.f(this.f198187b, acceptanceDialogArguments.f198187b) && L.f(this.f198188c, acceptanceDialogArguments.f198188c) && L.f(this.f198189d, acceptanceDialogArguments.f198189d) && L.f(this.f198190e, acceptanceDialogArguments.f198190e) && L.f(this.f198191f, acceptanceDialogArguments.f198191f) && this.f198192g == acceptanceDialogArguments.f198192g && L.f(this.f198193h, acceptanceDialogArguments.f198193h);
    }

    public final int hashCode() {
        int iHashCode = (this.f198192g.hashCode() + com.avito.android.actions_sheet.a.f(this.f198191f, com.avito.android.actions_sheet.a.f(this.f198190e, com.avito.android.actions_sheet.a.f(this.f198189d, com.avito.android.actions_sheet.a.f(this.f198188c, this.f198187b.hashCode() * 31, 31), 31), 31), 31)) * 31;
        Parcelable parcelable = this.f198193h;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AcceptanceDialogArguments(requestKey=");
        sb2.append(this.f198187b);
        sb2.append(", title=");
        sb2.append(this.f198188c);
        sb2.append(", description=");
        sb2.append(this.f198189d);
        sb2.append(", acceptButtonText=");
        sb2.append(this.f198190e);
        sb2.append(", declineButtonText=");
        sb2.append(this.f198191f);
        sb2.append(", acceptButtonStyle=");
        sb2.append(this.f198192g);
        sb2.append(", requestedAction=");
        return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f198193h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f198187b);
        parcel.writeParcelable(this.f198188c, i12);
        parcel.writeParcelable(this.f198189d, i12);
        parcel.writeParcelable(this.f198190e, i12);
        parcel.writeParcelable(this.f198191f, i12);
        this.f198192g.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f198193h, i12);
    }

    public /* synthetic */ AcceptanceDialogArguments(String str, PrintableText printableText, PrintableText printableText2, PrintableText printableText3, PrintableText printableText4, ButtonStyle buttonStyle, Parcelable parcelable, int i12, C42822w c42822w) {
        this(str, printableText, printableText2, printableText3, printableText4, buttonStyle, (i12 & 64) != 0 ? null : parcelable);
    }
}
