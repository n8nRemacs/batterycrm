package com.avito.android.advertising.loaders.buzzoola;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BuzzoolaBanner.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaTextWithColor;", "Landroid/os/Parcelable;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BuzzoolaTextWithColor implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BuzzoolaTextWithColor> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f88310b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f88311c;

    /* compiled from: BuzzoolaBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BuzzoolaTextWithColor> {
        @Override // android.os.Parcelable.Creator
        public final BuzzoolaTextWithColor createFromParcel(Parcel parcel) {
            return new BuzzoolaTextWithColor(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final BuzzoolaTextWithColor[] newArray(int i12) {
            return new BuzzoolaTextWithColor[i12];
        }
    }

    public BuzzoolaTextWithColor(@Y61.k String str, @Y61.l @InterfaceC42156l Integer num) {
        this.f88310b = str;
        this.f88311c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuzzoolaTextWithColor)) {
            return false;
        }
        BuzzoolaTextWithColor buzzoolaTextWithColor = (BuzzoolaTextWithColor) obj;
        return L.f(this.f88310b, buzzoolaTextWithColor.f88310b) && L.f(this.f88311c, buzzoolaTextWithColor.f88311c);
    }

    public final int hashCode() {
        int iHashCode = this.f88310b.hashCode() * 31;
        Integer num = this.f88311c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuzzoolaTextWithColor(text=");
        sb2.append(this.f88310b);
        sb2.append(", color=");
        return s.j(sb2, this.f88311c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f88310b);
        Integer num = this.f88311c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
