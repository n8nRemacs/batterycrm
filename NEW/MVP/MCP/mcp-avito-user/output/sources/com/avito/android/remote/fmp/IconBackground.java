package com.avito.android.remote.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FmpProductsUtil.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/fmp/IconBackground;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class IconBackground implements Parcelable {

    @k
    public static final Parcelable.Creator<IconBackground> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UniversalColor f253457b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f253458c;

    /* compiled from: FmpProductsUtil.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IconBackground> {
        @Override // android.os.Parcelable.Creator
        public final IconBackground createFromParcel(Parcel parcel) {
            return new IconBackground((UniversalColor) parcel.readParcelable(IconBackground.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final IconBackground[] newArray(int i12) {
            return new IconBackground[i12];
        }
    }

    public IconBackground(@l UniversalColor universalColor, @l Integer num) {
        this.f253457b = universalColor;
        this.f253458c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconBackground)) {
            return false;
        }
        IconBackground iconBackground = (IconBackground) obj;
        return L.f(this.f253457b, iconBackground.f253457b) && L.f(this.f253458c, iconBackground.f253458c);
    }

    public final int hashCode() {
        UniversalColor universalColor = this.f253457b;
        int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
        Integer num = this.f253458c;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IconBackground(color=");
        sb2.append(this.f253457b);
        sb2.append(", cornerRadius=");
        return s.j(sb2, this.f253458c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f253457b, i12);
        Integer num = this.f253458c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
