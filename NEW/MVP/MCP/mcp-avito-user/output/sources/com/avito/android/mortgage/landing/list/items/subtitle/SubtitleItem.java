package com.avito.android.mortgage.landing.list.items.subtitle;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.conveyor_item.a;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SubtitleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/subtitle/SubtitleItem;", "Lcom/avito/android/mortgage/landing/list/items/LandingItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SubtitleItem implements LandingItem {

    @k
    public static final Parcelable.Creator<SubtitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f200008b;

    /* renamed from: c, reason: collision with root package name */
    public final int f200009c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f200010d;

    /* compiled from: SubtitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SubtitleItem> {
        @Override // android.os.Parcelable.Creator
        public final SubtitleItem createFromParcel(Parcel parcel) {
            return new SubtitleItem(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SubtitleItem[] newArray(int i12) {
            return new SubtitleItem[i12];
        }
    }

    public SubtitleItem(@k String str, @e0 int i12, boolean z12) {
        this.f200008b = str;
        this.f200009c = i12;
        this.f200010d = z12;
    }

    @Override // com.avito.android.mortgage.landing.list.items.LandingItem
    @k
    public final LandingItem N() {
        return new SubtitleItem(this.f200008b, this.f200009c, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubtitleItem)) {
            return false;
        }
        SubtitleItem subtitleItem = (SubtitleItem) obj;
        return L.f(this.f200008b, subtitleItem.f200008b) && this.f200009c == subtitleItem.f200009c && this.f200010d == subtitleItem.f200010d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78384b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78385c() {
        return this.f200008b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200010d) + r.e(this.f200009c, this.f200008b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubtitleItem(stringId=");
        sb2.append(this.f200008b);
        sb2.append(", title=");
        sb2.append(this.f200009c);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f200010d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f200008b);
        parcel.writeInt(this.f200009c);
        parcel.writeInt(this.f200010d ? 1 : 0);
    }

    public /* synthetic */ SubtitleItem(String str, int i12, boolean z12, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 4) != 0 ? true : z12);
    }
}
