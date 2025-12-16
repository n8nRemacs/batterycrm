package com.avito.android.advertising.loaders.buzzoola;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BuzzoolaBanner.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaLegal;", "Landroid/os/Parcelable;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BuzzoolaLegal implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BuzzoolaLegal> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f88292b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88293c;

    /* renamed from: d, reason: collision with root package name */
    public final int f88294d;

    /* compiled from: BuzzoolaBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BuzzoolaLegal> {
        @Override // android.os.Parcelable.Creator
        public final BuzzoolaLegal createFromParcel(Parcel parcel) {
            return new BuzzoolaLegal(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final BuzzoolaLegal[] newArray(int i12) {
            return new BuzzoolaLegal[i12];
        }
    }

    public BuzzoolaLegal(@Y61.k String str, @InterfaceC42156l int i12, @InterfaceC42156l int i13) {
        this.f88292b = str;
        this.f88293c = i12;
        this.f88294d = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuzzoolaLegal)) {
            return false;
        }
        BuzzoolaLegal buzzoolaLegal = (BuzzoolaLegal) obj;
        return L.f(this.f88292b, buzzoolaLegal.f88292b) && this.f88293c == buzzoolaLegal.f88293c && this.f88294d == buzzoolaLegal.f88294d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f88294d) + r.e(this.f88293c, this.f88292b.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuzzoolaLegal(legalText=");
        sb2.append(this.f88292b);
        sb2.append(", legalTextColor=");
        sb2.append(this.f88293c);
        sb2.append(", legalTextHoverColor=");
        return r.t(sb2, this.f88294d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f88292b);
        parcel.writeInt(this.f88293c);
        parcel.writeInt(this.f88294d);
    }
}
