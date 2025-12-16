package com.avito.android.toggle_comparison_state.deep_linking;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ToggleComparisonStateLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/toggle_comparison_state/deep_linking/ToggleComparisonStateLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class ToggleComparisonStateLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ToggleComparisonStateLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f301573b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f301574c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f301575d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f301576e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Boolean f301577f;

    /* compiled from: ToggleComparisonStateLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ToggleComparisonStateLink> {
        @Override // android.os.Parcelable.Creator
        public final ToggleComparisonStateLink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ToggleComparisonStateLink(string, string2, string3, string4, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ToggleComparisonStateLink[] newArray(int i12) {
            return new ToggleComparisonStateLink[i12];
        }
    }

    public /* synthetic */ ToggleComparisonStateLink(String str, String str2, String str3, String str4, Boolean bool, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToggleComparisonStateLink)) {
            return false;
        }
        ToggleComparisonStateLink toggleComparisonStateLink = (ToggleComparisonStateLink) obj;
        return L.f(this.f301573b, toggleComparisonStateLink.f301573b) && L.f(this.f301574c, toggleComparisonStateLink.f301574c) && L.f(this.f301575d, toggleComparisonStateLink.f301575d) && L.f(this.f301576e, toggleComparisonStateLink.f301576e) && L.f(this.f301577f, toggleComparisonStateLink.f301577f);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f301573b.hashCode() * 31, 31, this.f301574c), 31, this.f301575d);
        String str = this.f301576e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f301577f;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToggleComparisonStateLink(categoryId=");
        sb2.append(this.f301573b);
        sb2.append(", itemId=");
        sb2.append(this.f301574c);
        sb2.append(", fromPage=");
        sb2.append(this.f301575d);
        sb2.append(", context=");
        sb2.append(this.f301576e);
        sb2.append(", isAdded=");
        return C0.g(sb2, this.f301577f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f301573b);
        parcel.writeString(this.f301574c);
        parcel.writeString(this.f301575d);
        parcel.writeString(this.f301576e);
        Boolean bool = this.f301577f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public ToggleComparisonStateLink(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Boolean bool) {
        this.f301573b = str;
        this.f301574c = str2;
        this.f301575d = str3;
        this.f301576e = str4;
        this.f301577f = bool;
    }
}
