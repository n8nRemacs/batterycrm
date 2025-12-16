package com.avito.android.cart_snippet_actions.models.ui;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import wn.C49654a;

/* compiled from: Stepper.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/models/ui/Stepper;", "Landroid/os/Parcelable;", "_avito_cart-snippet-actions_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Stepper implements Parcelable {

    @k
    public static final Parcelable.Creator<Stepper> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f116271b;

    /* renamed from: c, reason: collision with root package name */
    public final int f116272c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f116273d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final PrintableText f116274e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f116275f;

    /* compiled from: Stepper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Stepper> {
        @Override // android.os.Parcelable.Creator
        public final Stepper createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Stepper(i12, i13, boolValueOf, (PrintableText) parcel.readParcelable(Stepper.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Stepper[] newArray(int i12) {
            return new Stepper[i12];
        }
    }

    public Stepper(int i12, int i13, @l Boolean bool, @l PrintableText printableText, boolean z12) {
        this.f116271b = i12;
        this.f116272c = i13;
        this.f116273d = bool;
        this.f116274e = printableText;
        this.f116275f = z12;
    }

    public static Stepper a(Stepper stepper, int i12, PrintableText printableText, int i13) {
        int i14 = stepper.f116272c;
        Boolean bool = stepper.f116273d;
        if ((i13 & 8) != 0) {
            printableText = stepper.f116274e;
        }
        boolean z12 = stepper.f116275f;
        stepper.getClass();
        return new Stepper(i12, i14, bool, printableText, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stepper)) {
            return false;
        }
        Stepper stepper = (Stepper) obj;
        return this.f116271b == stepper.f116271b && this.f116272c == stepper.f116272c && L.f(this.f116273d, stepper.f116273d) && L.f(this.f116274e, stepper.f116274e) && this.f116275f == stepper.f116275f;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f116272c, Integer.hashCode(this.f116271b) * 31, 31);
        Boolean bool = this.f116273d;
        int iHashCode = (iE2 + (bool == null ? 0 : bool.hashCode())) * 31;
        PrintableText printableText = this.f116274e;
        return Boolean.hashCode(this.f116275f) + ((iHashCode + (printableText != null ? printableText.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stepper(value=");
        sb2.append(this.f116271b);
        sb2.append(", maxValue=");
        sb2.append(this.f116272c);
        sb2.append(", isIcon=");
        sb2.append(this.f116273d);
        sb2.append(", errorMessage=");
        sb2.append(this.f116274e);
        sb2.append(", showOnlyErrorState=");
        return r.x(sb2, this.f116275f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f116271b);
        parcel.writeInt(this.f116272c);
        Boolean bool = this.f116273d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.f116274e, i12);
        parcel.writeInt(this.f116275f ? 1 : 0);
    }

    public /* synthetic */ Stepper(int i12, int i13, Boolean bool, PrintableText printableText, boolean z12, int i14, C42822w c42822w) {
        this(i12, i13, (i14 & 4) != 0 ? null : bool, (i14 & 8) != 0 ? C49654a.a(i12, i13) : printableText, (i14 & 16) != 0 ? false : z12);
    }
}
