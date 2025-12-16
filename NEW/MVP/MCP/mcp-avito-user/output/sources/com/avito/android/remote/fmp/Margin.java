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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/fmp/Margin;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Margin implements Parcelable {

    @k
    public static final Parcelable.Creator<Margin> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f253464b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f253465c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f253466d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f253467e;

    /* compiled from: FmpProductsUtil.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Margin> {
        @Override // android.os.Parcelable.Creator
        public final Margin createFromParcel(Parcel parcel) {
            return new Margin(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Margin[] newArray(int i12) {
            return new Margin[i12];
        }
    }

    public Margin(@l Integer num, @l Integer num2, @l Integer num3, @l Integer num4) {
        this.f253464b = num;
        this.f253465c = num2;
        this.f253466d = num3;
        this.f253467e = num4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Margin)) {
            return false;
        }
        Margin margin = (Margin) obj;
        return L.f(this.f253464b, margin.f253464b) && L.f(this.f253465c, margin.f253465c) && L.f(this.f253466d, margin.f253466d) && L.f(this.f253467e, margin.f253467e);
    }

    public final int hashCode() {
        Integer num = this.f253464b;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f253465c;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f253466d;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f253467e;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Margin(top=");
        sb2.append(this.f253464b);
        sb2.append(", bottom=");
        sb2.append(this.f253465c);
        sb2.append(", left=");
        sb2.append(this.f253466d);
        sb2.append(", right=");
        return s.j(sb2, this.f253467e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.f253464b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f253465c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.f253466d;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Integer num4 = this.f253467e;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
    }
}
