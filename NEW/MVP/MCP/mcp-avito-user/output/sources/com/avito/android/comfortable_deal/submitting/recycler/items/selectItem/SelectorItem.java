package com.avito.android.comfortable_deal.submitting.recycler.items.selectItem;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectorItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/recycler/items/selectItem/SelectorItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SelectorItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<SelectorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f123231b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f123232c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f123233d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<DescriptionItem> f123234e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f123235f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f123236g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final DeepLink f123237h;

    /* compiled from: SelectorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectorItem> {
        @Override // android.os.Parcelable.Creator
        public final SelectorItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(SelectorItem.class.getClassLoader());
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(DescriptionItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SelectorItem(string, universalImage, string2, arrayList, parcel.readString(), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(SelectorItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SelectorItem[] newArray(int i12) {
            return new SelectorItem[i12];
        }
    }

    public SelectorItem(@k String str, @l UniversalImage universalImage, @k String str2, @k List<DescriptionItem> list, @k String str3, boolean z12, @l DeepLink deepLink) {
        this.f123231b = str;
        this.f123232c = universalImage;
        this.f123233d = str2;
        this.f123234e = list;
        this.f123235f = str3;
        this.f123236g = z12;
        this.f123237h = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectorItem)) {
            return false;
        }
        SelectorItem selectorItem = (SelectorItem) obj;
        return L.f(this.f123231b, selectorItem.f123231b) && L.f(this.f123232c, selectorItem.f123232c) && L.f(this.f123233d, selectorItem.f123233d) && L.f(this.f123234e, selectorItem.f123234e) && L.f(this.f123235f, selectorItem.f123235f) && this.f123236g == selectorItem.f123236g && L.f(this.f123237h, selectorItem.f123237h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75535g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75536h() {
        return this.f123231b;
    }

    public final int hashCode() {
        int iHashCode = this.f123231b.hashCode() * 31;
        UniversalImage universalImage = this.f123232c;
        int i12 = r.i(H.d(H.e(H.d((iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f123233d), 31, this.f123234e), 31, this.f123235f), 31, this.f123236g);
        DeepLink deepLink = this.f123237h;
        return i12 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectorItem(stringId=");
        sb2.append(this.f123231b);
        sb2.append(", image=");
        sb2.append(this.f123232c);
        sb2.append(", title=");
        sb2.append(this.f123233d);
        sb2.append(", descriptions=");
        sb2.append(this.f123234e);
        sb2.append(", buttonText=");
        sb2.append(this.f123235f);
        sb2.append(", isChecked=");
        sb2.append(this.f123236g);
        sb2.append(", nextLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f123237h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f123231b);
        parcel.writeParcelable(this.f123232c, i12);
        parcel.writeString(this.f123233d);
        Iterator itJ = C0.j(this.f123234e, parcel);
        while (itJ.hasNext()) {
            ((DescriptionItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f123235f);
        parcel.writeInt(this.f123236g ? 1 : 0);
        parcel.writeParcelable(this.f123237h, i12);
    }

    public /* synthetic */ SelectorItem(String str, UniversalImage universalImage, String str2, List list, String str3, boolean z12, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, universalImage, str2, list, str3, z12, (i12 & 64) != 0 ? null : deepLink);
    }
}
