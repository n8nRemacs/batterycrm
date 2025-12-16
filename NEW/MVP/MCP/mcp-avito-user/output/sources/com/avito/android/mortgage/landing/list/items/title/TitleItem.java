package com.avito.android.mortgage.landing.list.items.title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.conveyor_item.a;
import j.InterfaceC42150f;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TitleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/title/TitleItem;", "Lcom/avito/android/mortgage/landing/list/items/LandingItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitleItem implements LandingItem {

    @k
    public static final Parcelable.Creator<TitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f200017b;

    /* renamed from: c, reason: collision with root package name */
    public final int f200018c;

    /* renamed from: d, reason: collision with root package name */
    public final int f200019d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f200020e;

    /* compiled from: TitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TitleItem> {
        @Override // android.os.Parcelable.Creator
        public final TitleItem createFromParcel(Parcel parcel) {
            return new TitleItem(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TitleItem[] newArray(int i12) {
            return new TitleItem[i12];
        }
    }

    public TitleItem(@e0 int i12, @InterfaceC42150f int i13, @k String str, boolean z12) {
        this.f200017b = str;
        this.f200018c = i12;
        this.f200019d = i13;
        this.f200020e = z12;
    }

    @Override // com.avito.android.mortgage.landing.list.items.LandingItem
    @k
    public final LandingItem N() {
        return new TitleItem(this.f200018c, this.f200019d, this.f200017b, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleItem)) {
            return false;
        }
        TitleItem titleItem = (TitleItem) obj;
        return L.f(this.f200017b, titleItem.f200017b) && this.f200018c == titleItem.f200018c && this.f200019d == titleItem.f200019d && this.f200020e == titleItem.f200020e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183509b() {
        return this.f200017b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200020e) + r.e(this.f200019d, r.e(this.f200018c, this.f200017b.hashCode() * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TitleItem(stringId=");
        sb2.append(this.f200017b);
        sb2.append(", title=");
        sb2.append(this.f200018c);
        sb2.append(", textAppearance=");
        sb2.append(this.f200019d);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f200020e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f200017b);
        parcel.writeInt(this.f200018c);
        parcel.writeInt(this.f200019d);
        parcel.writeInt(this.f200020e ? 1 : 0);
    }

    public /* synthetic */ TitleItem(String str, int i12, int i13, boolean z12, int i14, C42822w c42822w) {
        this(i12, i13, str, (i14 & 8) != 0 ? true : z12);
    }
}
