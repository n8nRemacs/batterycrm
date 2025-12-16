package com.avito.android.mortgage_calculator.internal.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.F3;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DisclaimerItem.kt */
@F3
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/items/DisclaimerDescription;", "Landroid/os/Parcelable;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DisclaimerDescription implements Parcelable {

    @k
    public static final Parcelable.Creator<DisclaimerDescription> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f204389b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f204390c;

    /* compiled from: DisclaimerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DisclaimerDescription> {
        @Override // android.os.Parcelable.Creator
        public final DisclaimerDescription createFromParcel(Parcel parcel) {
            return new DisclaimerDescription((PrintableText) parcel.readParcelable(DisclaimerDescription.class.getClassLoader()), (AttributedText) parcel.readParcelable(DisclaimerDescription.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DisclaimerDescription[] newArray(int i12) {
            return new DisclaimerDescription[i12];
        }
    }

    public DisclaimerDescription(@k PrintableText printableText, @k AttributedText attributedText) {
        this.f204389b = printableText;
        this.f204390c = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisclaimerDescription)) {
            return false;
        }
        DisclaimerDescription disclaimerDescription = (DisclaimerDescription) obj;
        return L.f(this.f204389b, disclaimerDescription.f204389b) && L.f(this.f204390c, disclaimerDescription.f204390c);
    }

    public final int hashCode() {
        return this.f204390c.hashCode() + (this.f204389b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisclaimerDescription(title=");
        sb2.append(this.f204389b);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f204390c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f204389b, i12);
        parcel.writeParcelable(this.f204390c, i12);
    }
}
