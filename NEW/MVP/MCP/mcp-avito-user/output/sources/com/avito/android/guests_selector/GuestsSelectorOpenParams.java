package com.avito.android.guests_selector;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.guests_selector.io.GuestsSelectorAvailableAge;
import com.avito.android.guests_selector.io.GuestsSelectorChild;
import com.avito.android.guests_selector.io.Parameter;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GuestsSelectorOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/GuestsSelectorOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GuestsSelectorOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<GuestsSelectorOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f161367b;

    /* renamed from: c, reason: collision with root package name */
    public final int f161368c;

    /* renamed from: d, reason: collision with root package name */
    public final int f161369d;

    /* renamed from: e, reason: collision with root package name */
    public final int f161370e;

    /* renamed from: f, reason: collision with root package name */
    public final int f161371f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<GuestsSelectorAvailableAge> f161372g;

    /* renamed from: h, reason: collision with root package name */
    public final int f161373h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final List<GuestsSelectorChild> f161374i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final PrintableText f161375j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f161376k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final List<Parameter> f161377l;

    /* compiled from: GuestsSelectorOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GuestsSelectorOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final GuestsSelectorOpenParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i16);
            int iL2 = 0;
            int iL3 = 0;
            while (iL3 != i16) {
                iL3 = com.avito.android.actions_sheet.a.l(GuestsSelectorOpenParams.class, parcel, arrayList, iL3, 1);
            }
            int i17 = parcel.readInt();
            int i18 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i18);
            int iL4 = 0;
            while (iL4 != i18) {
                iL4 = com.avito.android.actions_sheet.a.l(GuestsSelectorOpenParams.class, parcel, arrayList2, iL4, 1);
            }
            PrintableText printableText = (PrintableText) parcel.readParcelable(GuestsSelectorOpenParams.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            int i19 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i19);
            while (iL2 != i19) {
                iL2 = com.avito.android.actions_sheet.a.l(GuestsSelectorOpenParams.class, parcel, arrayList3, iL2, 1);
            }
            return new GuestsSelectorOpenParams(string, i12, i13, i14, i15, arrayList, i17, arrayList2, printableText, z12, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final GuestsSelectorOpenParams[] newArray(int i12) {
            return new GuestsSelectorOpenParams[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GuestsSelectorOpenParams(@Y61.k String str, int i12, int i13, int i14, int i15, @Y61.k List<GuestsSelectorAvailableAge> list, int i16, @Y61.k List<GuestsSelectorChild> list2, @Y61.l PrintableText printableText, boolean z12, @Y61.k List<? extends Parameter> list3) {
        this.f161367b = str;
        this.f161368c = i12;
        this.f161369d = i13;
        this.f161370e = i14;
        this.f161371f = i15;
        this.f161372g = list;
        this.f161373h = i16;
        this.f161374i = list2;
        this.f161375j = printableText;
        this.f161376k = z12;
        this.f161377l = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestsSelectorOpenParams)) {
            return false;
        }
        GuestsSelectorOpenParams guestsSelectorOpenParams = (GuestsSelectorOpenParams) obj;
        return L.f(this.f161367b, guestsSelectorOpenParams.f161367b) && this.f161368c == guestsSelectorOpenParams.f161368c && this.f161369d == guestsSelectorOpenParams.f161369d && this.f161370e == guestsSelectorOpenParams.f161370e && this.f161371f == guestsSelectorOpenParams.f161371f && L.f(this.f161372g, guestsSelectorOpenParams.f161372g) && this.f161373h == guestsSelectorOpenParams.f161373h && L.f(this.f161374i, guestsSelectorOpenParams.f161374i) && L.f(this.f161375j, guestsSelectorOpenParams.f161375j) && this.f161376k == guestsSelectorOpenParams.f161376k && L.f(this.f161377l, guestsSelectorOpenParams.f161377l);
    }

    public final int hashCode() {
        int iE2 = H.e(androidx.appcompat.app.r.e(this.f161373h, H.e(androidx.appcompat.app.r.e(this.f161371f, androidx.appcompat.app.r.e(this.f161370e, androidx.appcompat.app.r.e(this.f161369d, androidx.appcompat.app.r.e(this.f161368c, this.f161367b.hashCode() * 31, 31), 31), 31), 31), 31, this.f161372g), 31), 31, this.f161374i);
        PrintableText printableText = this.f161375j;
        return this.f161377l.hashCode() + androidx.appcompat.app.r.i((iE2 + (printableText == null ? 0 : printableText.hashCode())) * 31, 31, this.f161376k);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GuestsSelectorOpenParams(theme=");
        sb2.append(this.f161367b);
        sb2.append(", minGuests=");
        sb2.append(this.f161368c);
        sb2.append(", maxGuests=");
        sb2.append(this.f161369d);
        sb2.append(", maxAdultCount=");
        sb2.append(this.f161370e);
        sb2.append(", maxChildrenCount=");
        sb2.append(this.f161371f);
        sb2.append(", availableAges=");
        sb2.append(this.f161372g);
        sb2.append(", initialAdultGuests=");
        sb2.append(this.f161373h);
        sb2.append(", initialChildren=");
        sb2.append(this.f161374i);
        sb2.append(", buttonTitle=");
        sb2.append(this.f161375j);
        sb2.append(", withChildren=");
        sb2.append(this.f161376k);
        sb2.append(", parameters=");
        return H.p(sb2, this.f161377l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f161367b);
        parcel.writeInt(this.f161368c);
        parcel.writeInt(this.f161369d);
        parcel.writeInt(this.f161370e);
        parcel.writeInt(this.f161371f);
        Iterator itJ = C0.j(this.f161372g, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f161373h);
        Iterator itJ2 = C0.j(this.f161374i, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), i12);
        }
        parcel.writeParcelable(this.f161375j, i12);
        parcel.writeInt(this.f161376k ? 1 : 0);
        Iterator itJ3 = C0.j(this.f161377l, parcel);
        while (itJ3.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ3.next(), i12);
        }
    }
}
