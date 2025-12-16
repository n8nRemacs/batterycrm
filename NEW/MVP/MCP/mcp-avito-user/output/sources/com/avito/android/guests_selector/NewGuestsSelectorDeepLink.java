package com.avito.android.guests_selector;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.guests_selector.io.AvailableAge;
import com.avito.android.guests_selector.io.GuestsDetailed;
import com.avito.android.guests_selector.io.Parameter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: NewGuestsSelectorDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/NewGuestsSelectorDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_guests-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class NewGuestsSelectorDeepLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<NewGuestsSelectorDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f161378b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f161379c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f161380d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f161381e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f161382f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f161383g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Boolean f161384h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final List<AvailableAge> f161385i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final GuestsDetailed f161386j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final List<Parameter> f161387k;

    /* compiled from: NewGuestsSelectorDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NewGuestsSelectorDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final NewGuestsSelectorDeepLink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList2 = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AvailableAge.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            GuestsDetailed guestsDetailedCreateFromParcel = parcel.readInt() == 0 ? null : GuestsDetailed.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(NewGuestsSelectorDeepLink.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new NewGuestsSelectorDeepLink(string, string2, numValueOf, numValueOf2, numValueOf3, numValueOf4, boolValueOf, arrayList, guestsDetailedCreateFromParcel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final NewGuestsSelectorDeepLink[] newArray(int i12) {
            return new NewGuestsSelectorDeepLink[i12];
        }
    }

    public NewGuestsSelectorDeepLink() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewGuestsSelectorDeepLink)) {
            return false;
        }
        NewGuestsSelectorDeepLink newGuestsSelectorDeepLink = (NewGuestsSelectorDeepLink) obj;
        return L.f(this.f161378b, newGuestsSelectorDeepLink.f161378b) && L.f(this.f161379c, newGuestsSelectorDeepLink.f161379c) && L.f(this.f161380d, newGuestsSelectorDeepLink.f161380d) && L.f(this.f161381e, newGuestsSelectorDeepLink.f161381e) && L.f(this.f161382f, newGuestsSelectorDeepLink.f161382f) && L.f(this.f161383g, newGuestsSelectorDeepLink.f161383g) && L.f(this.f161384h, newGuestsSelectorDeepLink.f161384h) && L.f(this.f161385i, newGuestsSelectorDeepLink.f161385i) && L.f(this.f161386j, newGuestsSelectorDeepLink.f161386j) && L.f(this.f161387k, newGuestsSelectorDeepLink.f161387k);
    }

    public final int hashCode() {
        String str = this.f161378b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f161379c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f161380d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f161381e;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f161382f;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f161383g;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.f161384h;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<AvailableAge> list = this.f161385i;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        GuestsDetailed guestsDetailed = this.f161386j;
        int iHashCode9 = (iHashCode8 + (guestsDetailed == null ? 0 : guestsDetailed.hashCode())) * 31;
        List<Parameter> list2 = this.f161387k;
        return iHashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NewGuestsSelectorDeepLink(theme=");
        sb2.append(this.f161378b);
        sb2.append(", buttonTitle=");
        sb2.append(this.f161379c);
        sb2.append(", minGuests=");
        sb2.append(this.f161380d);
        sb2.append(", maxGuests=");
        sb2.append(this.f161381e);
        sb2.append(", maxAdultCount=");
        sb2.append(this.f161382f);
        sb2.append(", maxChildrenCount=");
        sb2.append(this.f161383g);
        sb2.append(", withChildren=");
        sb2.append(this.f161384h);
        sb2.append(", availableAges=");
        sb2.append(this.f161385i);
        sb2.append(", guestsDetailed=");
        sb2.append(this.f161386j);
        sb2.append(", parameters=");
        return H.p(sb2, this.f161387k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f161378b);
        parcel.writeString(this.f161379c);
        Integer num = this.f161380d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f161381e;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.f161382f;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Integer num4 = this.f161383g;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
        Boolean bool = this.f161384h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<AvailableAge> list = this.f161385i;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AvailableAge) itA.next()).writeToParcel(parcel, i12);
            }
        }
        GuestsDetailed guestsDetailed = this.f161386j;
        if (guestsDetailed == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            guestsDetailed.writeToParcel(parcel, i12);
        }
        List<Parameter> list2 = this.f161387k;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), i12);
        }
    }

    public /* synthetic */ NewGuestsSelectorDeepLink(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, List list, GuestsDetailed guestsDetailed, List list2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? null : num2, (i12 & 16) != 0 ? null : num3, (i12 & 32) != 0 ? null : num4, (i12 & 64) != 0 ? null : bool, (i12 & 128) != 0 ? null : list, (i12 & 256) != 0 ? null : guestsDetailed, (i12 & 512) == 0 ? list2 : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewGuestsSelectorDeepLink(@Y61.l String str, @Y61.l String str2, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4, @Y61.l Boolean bool, @Y61.l List<AvailableAge> list, @Y61.l GuestsDetailed guestsDetailed, @Y61.l List<? extends Parameter> list2) {
        this.f161378b = str;
        this.f161379c = str2;
        this.f161380d = num;
        this.f161381e = num2;
        this.f161382f = num3;
        this.f161383g = num4;
        this.f161384h = bool;
        this.f161385i = list;
        this.f161386j = guestsDetailed;
        this.f161387k = list2;
    }
}
