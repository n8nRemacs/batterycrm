package com.avito.android.extended_profile_widgets.adapter.premium_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.extended_profile_widgets.adapter.premium_banner.adapter.banner.PremiumBannerItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PremiumBannerListItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/premium_banner/PremiumBannerListItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PremiumBannerListItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<PremiumBannerListItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154571b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154572c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<PremiumBannerItem> f154573d;

    /* renamed from: e, reason: collision with root package name */
    public final int f154574e;

    /* compiled from: PremiumBannerListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PremiumBannerListItem> {
        @Override // android.os.Parcelable.Creator
        public final PremiumBannerListItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            GridElementType gridElementType = (GridElementType) parcel.readParcelable(PremiumBannerListItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(PremiumBannerItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new PremiumBannerListItem(string, gridElementType, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PremiumBannerListItem[] newArray(int i12) {
            return new PremiumBannerListItem[i12];
        }
    }

    public PremiumBannerListItem(@k String str, @k GridElementType gridElementType, @k List<PremiumBannerItem> list, int i12) {
        this.f154571b = str;
        this.f154572c = gridElementType;
        this.f154573d = list;
        this.f154574e = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBannerListItem)) {
            return false;
        }
        PremiumBannerListItem premiumBannerListItem = (PremiumBannerListItem) obj;
        return L.f(this.f154571b, premiumBannerListItem.f154571b) && L.f(this.f154572c, premiumBannerListItem.f154572c) && L.f(this.f154573d, premiumBannerListItem.f154573d) && this.f154574e == premiumBannerListItem.f154574e;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154934c() {
        return this.f154572c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF106316b() {
        return this.f154571b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f154574e) + H.e(com.avito.android.bxcontent.mvi.entity.f.b(this.f154572c, this.f154571b.hashCode() * 31, 31), 31, this.f154573d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PremiumBannerListItem(stringId=");
        sb2.append(this.f154571b);
        sb2.append(", gridType=");
        sb2.append(this.f154572c);
        sb2.append(", bannerList=");
        sb2.append(this.f154573d);
        sb2.append(", scrollPosition=");
        return r.t(sb2, this.f154574e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154571b);
        parcel.writeParcelable(this.f154572c, i12);
        Iterator itJ = C0.j(this.f154573d, parcel);
        while (itJ.hasNext()) {
            ((PremiumBannerItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f154574e);
    }

    public /* synthetic */ PremiumBannerListItem(String str, GridElementType gridElementType, List list, int i12, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, list, (i13 & 8) != 0 ? 0 : i12);
    }
}
