package com.avito.android.mortgage.landing.list.items.expandable_block;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExpandableBlockItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/expandable_block/ExpandableBlockItem;", "Lcom/avito/android/mortgage/landing/list/items/LandingItem;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ExpandableBlockItem implements LandingItem, b.InterfaceC10495b {

    @k
    public static final Parcelable.Creator<ExpandableBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f199693b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f199694c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f199695d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f199696e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f199697f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f199698g;

    /* renamed from: h, reason: collision with root package name */
    public final long f199699h;

    /* compiled from: ExpandableBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExpandableBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final ExpandableBlockItem createFromParcel(Parcel parcel) {
            return new ExpandableBlockItem(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(ExpandableBlockItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ExpandableBlockItem[] newArray(int i12) {
            return new ExpandableBlockItem[i12];
        }
    }

    public ExpandableBlockItem(@k String str, @l String str2, @l AttributedText attributedText, boolean z12, boolean z13, boolean z14) {
        this.f199693b = str;
        this.f199694c = str2;
        this.f199695d = attributedText;
        this.f199696e = z12;
        this.f199697f = z13;
        this.f199698g = z14;
        this.f199699h = a.C10492a.a(this);
    }

    public static ExpandableBlockItem a(ExpandableBlockItem expandableBlockItem, boolean z12, int i12) {
        String str = expandableBlockItem.f199693b;
        String str2 = expandableBlockItem.f199694c;
        AttributedText attributedText = expandableBlockItem.f199695d;
        if ((i12 & 8) != 0) {
            z12 = expandableBlockItem.f199696e;
        }
        boolean z13 = z12;
        boolean z14 = expandableBlockItem.f199697f;
        boolean z15 = (i12 & 32) != 0 ? expandableBlockItem.f199698g : false;
        expandableBlockItem.getClass();
        return new ExpandableBlockItem(str, str2, attributedText, z13, z14, z15);
    }

    @Override // com.avito.android.mortgage.landing.list.items.LandingItem
    @k
    public final LandingItem N() {
        return a(this, false, 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpandableBlockItem)) {
            return false;
        }
        ExpandableBlockItem expandableBlockItem = (ExpandableBlockItem) obj;
        return L.f(this.f199693b, expandableBlockItem.f199693b) && L.f(this.f199694c, expandableBlockItem.f199694c) && L.f(this.f199695d, expandableBlockItem.f199695d) && this.f199696e == expandableBlockItem.f199696e && this.f199697f == expandableBlockItem.f199697f && this.f199698g == expandableBlockItem.f199698g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80342e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154762b() {
        return this.f199693b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF284029b() {
        return this.f199699h;
    }

    public final int hashCode() {
        int iHashCode = this.f199693b.hashCode() * 31;
        String str = this.f199694c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f199695d;
        return Boolean.hashCode(this.f199698g) + r.i(r.i((iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31, 31, this.f199696e), 31, this.f199697f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExpandableBlockItem(stringId=");
        sb2.append(this.f199693b);
        sb2.append(", title=");
        sb2.append(this.f199694c);
        sb2.append(", description=");
        sb2.append(this.f199695d);
        sb2.append(", isExpanded=");
        sb2.append(this.f199696e);
        sb2.append(", isLast=");
        sb2.append(this.f199697f);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f199698g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f199693b);
        parcel.writeString(this.f199694c);
        parcel.writeParcelable(this.f199695d, i12);
        parcel.writeInt(this.f199696e ? 1 : 0);
        parcel.writeInt(this.f199697f ? 1 : 0);
        parcel.writeInt(this.f199698g ? 1 : 0);
    }

    public /* synthetic */ ExpandableBlockItem(String str, String str2, AttributedText attributedText, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) == 0 ? attributedText : null, (i12 & 8) != 0 ? false : z12, (i12 & 16) == 0 ? z13 : false, (i12 & 32) != 0 ? true : z14);
    }
}
