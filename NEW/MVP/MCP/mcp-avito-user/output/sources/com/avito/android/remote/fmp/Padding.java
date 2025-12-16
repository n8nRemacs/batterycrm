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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/fmp/Padding;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Padding implements Parcelable {

    @k
    public static final Parcelable.Creator<Padding> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f253468b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f253469c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f253470d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f253471e;

    /* compiled from: FmpProductsUtil.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Padding> {
        @Override // android.os.Parcelable.Creator
        public final Padding createFromParcel(Parcel parcel) {
            return new Padding(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Padding[] newArray(int i12) {
            return new Padding[i12];
        }
    }

    public Padding(@l Integer num, @l Integer num2, @l Integer num3, @l Integer num4) {
        this.f253468b = num;
        this.f253469c = num2;
        this.f253470d = num3;
        this.f253471e = num4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Padding)) {
            return false;
        }
        Padding padding = (Padding) obj;
        return L.f(this.f253468b, padding.f253468b) && L.f(this.f253469c, padding.f253469c) && L.f(this.f253470d, padding.f253470d) && L.f(this.f253471e, padding.f253471e);
    }

    public final int hashCode() {
        Integer num = this.f253468b;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f253469c;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f253470d;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f253471e;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Padding(top=");
        sb2.append(this.f253468b);
        sb2.append(", bottom=");
        sb2.append(this.f253469c);
        sb2.append(", left=");
        sb2.append(this.f253470d);
        sb2.append(", right=");
        return s.j(sb2, this.f253471e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.f253468b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f253469c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.f253470d;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Integer num4 = this.f253471e;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
    }
}
