package com.avito.android.mortgage.landing.list.items.usp_manager_banner;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.mortgage.api.model.landing.LandingManagerUspItem;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UspManagerBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/usp_manager_banner/UspManagerBannerItem;", "Lcom/avito/android/mortgage/landing/list/items/LandingItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UspManagerBannerItem implements LandingItem {

    @Y61.k
    public static final Parcelable.Creator<UspManagerBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f200029b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UniversalImage f200030c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f200031d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<LandingManagerUspItem> f200032e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final UspManagerBannerAction f200033f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f200034g;

    /* compiled from: UspManagerBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UspManagerBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final UspManagerBannerItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(UspManagerBannerItem.class.getClassLoader());
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(LandingManagerUspItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new UspManagerBannerItem(string, universalImage, string2, arrayList, parcel.readInt() == 0 ? null : UspManagerBannerAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final UspManagerBannerItem[] newArray(int i12) {
            return new UspManagerBannerItem[i12];
        }
    }

    public UspManagerBannerItem(@Y61.k String str, @Y61.k UniversalImage universalImage, @Y61.k String str2, @Y61.k List<LandingManagerUspItem> list, @Y61.l UspManagerBannerAction uspManagerBannerAction, boolean z12) {
        this.f200029b = str;
        this.f200030c = universalImage;
        this.f200031d = str2;
        this.f200032e = list;
        this.f200033f = uspManagerBannerAction;
        this.f200034g = z12;
    }

    @Override // com.avito.android.mortgage.landing.list.items.LandingItem
    @Y61.k
    public final LandingItem N() {
        return new UspManagerBannerItem(this.f200029b, this.f200030c, this.f200031d, this.f200032e, this.f200033f, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UspManagerBannerItem)) {
            return false;
        }
        UspManagerBannerItem uspManagerBannerItem = (UspManagerBannerItem) obj;
        return L.f(this.f200029b, uspManagerBannerItem.f200029b) && L.f(this.f200030c, uspManagerBannerItem.f200030c) && L.f(this.f200031d, uspManagerBannerItem.f200031d) && L.f(this.f200032e, uspManagerBannerItem.f200032e) && L.f(this.f200033f, uspManagerBannerItem.f200033f) && this.f200034g == uspManagerBannerItem.f200034g;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF162925b() {
        return this.f200029b;
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(com.avito.android.actions_sheet.a.a(this.f200029b.hashCode() * 31, 31, this.f200030c), 31, this.f200031d), 31, this.f200032e);
        UspManagerBannerAction uspManagerBannerAction = this.f200033f;
        return Boolean.hashCode(this.f200034g) + ((iE2 + (uspManagerBannerAction == null ? 0 : uspManagerBannerAction.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UspManagerBannerItem(stringId=");
        sb2.append(this.f200029b);
        sb2.append(", image=");
        sb2.append(this.f200030c);
        sb2.append(", title=");
        sb2.append(this.f200031d);
        sb2.append(", usp=");
        sb2.append(this.f200032e);
        sb2.append(", action=");
        sb2.append(this.f200033f);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f200034g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f200029b);
        parcel.writeParcelable(this.f200030c, i12);
        parcel.writeString(this.f200031d);
        Iterator itJ = C0.j(this.f200032e, parcel);
        while (itJ.hasNext()) {
            ((LandingManagerUspItem) itJ.next()).writeToParcel(parcel, i12);
        }
        UspManagerBannerAction uspManagerBannerAction = this.f200033f;
        if (uspManagerBannerAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uspManagerBannerAction.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f200034g ? 1 : 0);
    }

    public /* synthetic */ UspManagerBannerItem(String str, UniversalImage universalImage, String str2, List list, UspManagerBannerAction uspManagerBannerAction, boolean z12, int i12, C42822w c42822w) {
        this(str, universalImage, str2, list, uspManagerBannerAction, (i12 & 32) != 0 ? true : z12);
    }
}
