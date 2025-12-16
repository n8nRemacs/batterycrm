package com.avito.android.remote.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FmpProductsUtil.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/fmp/Size;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Size implements Parcelable {

    @k
    public static final Parcelable.Creator<Size> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f253472b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f253473c;

    /* compiled from: FmpProductsUtil.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Size> {
        @Override // android.os.Parcelable.Creator
        public final Size createFromParcel(Parcel parcel) {
            return new Size(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Size[] newArray(int i12) {
            return new Size[i12];
        }
    }

    public Size(@l Integer num, @l Integer num2) {
        this.f253472b = num;
        this.f253473c = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return L.f(this.f253472b, size.f253472b) && L.f(this.f253473c, size.f253473c);
    }

    public final int hashCode() {
        Integer num = this.f253472b;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f253473c;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Size(width=");
        sb2.append(this.f253472b);
        sb2.append(", height=");
        return s.j(sb2, this.f253473c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.f253472b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f253473c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
    }
}
