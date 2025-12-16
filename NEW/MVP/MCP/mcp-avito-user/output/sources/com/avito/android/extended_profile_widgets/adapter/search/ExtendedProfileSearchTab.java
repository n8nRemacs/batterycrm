package com.avito.android.extended_profile_widgets.adapter.search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSearchTab.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/ExtendedProfileSearchTab;", "Landroid/os/Parcelable;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileSearchTab implements Parcelable {

    @k
    public static final Parcelable.Creator<ExtendedProfileSearchTab> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f154616b;

    /* renamed from: c, reason: collision with root package name */
    public final int f154617c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ExtendedProfileSearchTabType f154618d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f154619e;

    /* compiled from: ExtendedProfileSearchTab.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileSearchTab> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSearchTab createFromParcel(Parcel parcel) {
            return new ExtendedProfileSearchTab((PrintableText) parcel.readParcelable(ExtendedProfileSearchTab.class.getClassLoader()), parcel.readInt(), ExtendedProfileSearchTabType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSearchTab[] newArray(int i12) {
            return new ExtendedProfileSearchTab[i12];
        }
    }

    public ExtendedProfileSearchTab(@k PrintableText printableText, int i12, @k ExtendedProfileSearchTabType extendedProfileSearchTabType, boolean z12) {
        this.f154616b = printableText;
        this.f154617c = i12;
        this.f154618d = extendedProfileSearchTabType;
        this.f154619e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileSearchTab)) {
            return false;
        }
        ExtendedProfileSearchTab extendedProfileSearchTab = (ExtendedProfileSearchTab) obj;
        return L.f(this.f154616b, extendedProfileSearchTab.f154616b) && this.f154617c == extendedProfileSearchTab.f154617c && this.f154618d == extendedProfileSearchTab.f154618d && this.f154619e == extendedProfileSearchTab.f154619e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f154619e) + ((this.f154618d.hashCode() + r.e(this.f154617c, this.f154616b.hashCode() * 31, 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileSearchTab(title=");
        sb2.append(this.f154616b);
        sb2.append(", advertsCount=");
        sb2.append(this.f154617c);
        sb2.append(", tabType=");
        sb2.append(this.f154618d);
        sb2.append(", isActive=");
        return r.x(sb2, this.f154619e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f154616b, i12);
        parcel.writeInt(this.f154617c);
        parcel.writeString(this.f154618d.name());
        parcel.writeInt(this.f154619e ? 1 : 0);
    }
}
