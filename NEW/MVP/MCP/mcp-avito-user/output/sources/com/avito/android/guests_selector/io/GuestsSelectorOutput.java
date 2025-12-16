package com.avito.android.guests_selector.io;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GuestsSelectorOutput.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/io/GuestsSelectorOutput;", "Landroid/os/Parcelable;", "_avito_guests-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GuestsSelectorOutput implements Parcelable {

    @k
    public static final Parcelable.Creator<GuestsSelectorOutput> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f161448b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<GuestsSelectorChildOutput> f161449c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f161450d;

    /* compiled from: GuestsSelectorOutput.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GuestsSelectorOutput> {
        @Override // android.os.Parcelable.Creator
        public final GuestsSelectorOutput createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(GuestsSelectorChildOutput.CREATOR, parcel, arrayList, iC2, 1);
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GuestsSelectorOutput(i12, arrayList, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final GuestsSelectorOutput[] newArray(int i12) {
            return new GuestsSelectorOutput[i12];
        }
    }

    public GuestsSelectorOutput(int i12, @k List<GuestsSelectorChildOutput> list, @l Boolean bool) {
        this.f161448b = i12;
        this.f161449c = list;
        this.f161450d = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestsSelectorOutput)) {
            return false;
        }
        GuestsSelectorOutput guestsSelectorOutput = (GuestsSelectorOutput) obj;
        return this.f161448b == guestsSelectorOutput.f161448b && L.f(this.f161449c, guestsSelectorOutput.f161449c) && L.f(this.f161450d, guestsSelectorOutput.f161450d);
    }

    public final int hashCode() {
        int iE2 = H.e(Integer.hashCode(this.f161448b) * 31, 31, this.f161449c);
        Boolean bool = this.f161450d;
        return iE2 + (bool == null ? 0 : bool.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GuestsSelectorOutput(adultGuestsCount=");
        sb2.append(this.f161448b);
        sb2.append(", children=");
        sb2.append(this.f161449c);
        sb2.append(", withPets=");
        return C0.g(sb2, this.f161450d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f161448b);
        Iterator itJ = C0.j(this.f161449c, parcel);
        while (itJ.hasNext()) {
            ((GuestsSelectorChildOutput) itJ.next()).writeToParcel(parcel, i12);
        }
        Boolean bool = this.f161450d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ GuestsSelectorOutput(int i12, List list, Boolean bool, int i13, C42822w c42822w) {
        this(i12, list, (i13 & 4) != 0 ? null : bool);
    }
}
