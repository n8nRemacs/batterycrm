package com.avito.android.guests_selector.io;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvailableAge.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/io/AvailableAge;", "Landroid/os/Parcelable;", "_avito_guests-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AvailableAge implements Parcelable {

    @k
    public static final Parcelable.Creator<AvailableAge> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f161438b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f161439c;

    /* compiled from: AvailableAge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AvailableAge> {
        @Override // android.os.Parcelable.Creator
        public final AvailableAge createFromParcel(Parcel parcel) {
            return new AvailableAge(parcel.readString(), (PrintableText) parcel.readParcelable(AvailableAge.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AvailableAge[] newArray(int i12) {
            return new AvailableAge[i12];
        }
    }

    public AvailableAge(@k String str, @k PrintableText printableText) {
        this.f161438b = str;
        this.f161439c = printableText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableAge)) {
            return false;
        }
        AvailableAge availableAge = (AvailableAge) obj;
        return L.f(this.f161438b, availableAge.f161438b) && L.f(this.f161439c, availableAge.f161439c);
    }

    public final int hashCode() {
        return this.f161439c.hashCode() + (this.f161438b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvailableAge(id=");
        sb2.append(this.f161438b);
        sb2.append(", value=");
        return c.m(sb2, this.f161439c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f161438b);
        parcel.writeParcelable(this.f161439c, i12);
    }
}
