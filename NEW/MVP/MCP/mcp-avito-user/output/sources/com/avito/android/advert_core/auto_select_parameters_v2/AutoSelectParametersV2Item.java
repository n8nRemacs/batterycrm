package com.avito.android.advert_core.auto_select_parameters_v2;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_core.auto_select_parameters_v2.advantage.AutoSelectExpandableAdvantageItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import pb.InterfaceC47047c;

/* compiled from: AutoSelectParametersV2Item.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/auto_select_parameters_v2/AutoSelectParametersV2Item;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lpb/c;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AutoSelectParametersV2Item implements BlockItem, InterfaceC47047c, l1 {

    @k
    public static final Parcelable.Creator<AutoSelectParametersV2Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f82935b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f82936c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Image f82937d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<AutoSelectExpandableAdvantageItem> f82938e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AttributedText f82939f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f82940g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f82941h;

    /* renamed from: i, reason: collision with root package name */
    public final long f82942i;

    /* renamed from: j, reason: collision with root package name */
    public final int f82943j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final SerpDisplayType f82944k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final SerpViewType f82945l;

    /* compiled from: AutoSelectParametersV2Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectParametersV2Item> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectParametersV2Item createFromParcel(Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AutoSelectParametersV2Item.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(AutoSelectParametersV2Item.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(AutoSelectParametersV2Item.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(AutoSelectExpandableAdvantageItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AutoSelectParametersV2Item(attributedText, attributedText2, image, arrayList, (AttributedText) parcel.readParcelable(AutoSelectParametersV2Item.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectParametersV2Item[] newArray(int i12) {
            return new AutoSelectParametersV2Item[i12];
        }
    }

    public AutoSelectParametersV2Item(@k AttributedText attributedText, @k AttributedText attributedText2, @k Image image, @k List<AutoSelectExpandableAdvantageItem> list, @k AttributedText attributedText3, @k String str, @k String str2, long j12, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f82935b = attributedText;
        this.f82936c = attributedText2;
        this.f82937d = image;
        this.f82938e = list;
        this.f82939f = attributedText3;
        this.f82940g = str;
        this.f82941h = str2;
        this.f82942i = j12;
        this.f82943j = i12;
        this.f82944k = serpDisplayType;
        this.f82945l = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AutoSelectParametersV2Item(this.f82935b, this.f82936c, this.f82937d, this.f82938e, this.f82939f, this.f82940g, this.f82941h, this.f82942i, i12, this.f82944k, this.f82945l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectParametersV2Item)) {
            return false;
        }
        AutoSelectParametersV2Item autoSelectParametersV2Item = (AutoSelectParametersV2Item) obj;
        return L.f(this.f82935b, autoSelectParametersV2Item.f82935b) && L.f(this.f82936c, autoSelectParametersV2Item.f82936c) && L.f(this.f82937d, autoSelectParametersV2Item.f82937d) && L.f(this.f82938e, autoSelectParametersV2Item.f82938e) && L.f(this.f82939f, autoSelectParametersV2Item.f82939f) && L.f(this.f82940g, autoSelectParametersV2Item.f82940g) && L.f(this.f82941h, autoSelectParametersV2Item.f82941h) && this.f82942i == autoSelectParametersV2Item.f82942i && this.f82943j == autoSelectParametersV2Item.f82943j && this.f82944k == autoSelectParametersV2Item.f82944k && this.f82945l == autoSelectParametersV2Item.f82945l;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF82942i() {
        return this.f82942i;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF82943j() {
        return this.f82943j;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF82941h() {
        return this.f82941h;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF82945l() {
        return this.f82945l;
    }

    public final int hashCode() {
        return this.f82945l.hashCode() + com.avito.android.actions_sheet.a.h(this.f82944k, r.e(this.f82943j, r.g(H.d(H.d(com.avito.android.actions_sheet.a.b(H.e(com.avito.android.actions_sheet.a.g(this.f82937d, com.avito.android.actions_sheet.a.b(this.f82935b.hashCode() * 31, 31, this.f82936c), 31), 31, this.f82938e), 31, this.f82939f), 31, this.f82940g), 31, this.f82941h), 31, this.f82942i), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectParametersV2Item(title=");
        sb2.append(this.f82935b);
        sb2.append(", description=");
        sb2.append(this.f82936c);
        sb2.append(", image=");
        sb2.append(this.f82937d);
        sb2.append(", advantages=");
        sb2.append(this.f82938e);
        sb2.append(", footer=");
        sb2.append(this.f82939f);
        sb2.append(", componentSlug=");
        sb2.append(this.f82940g);
        sb2.append(", stringId=");
        sb2.append(this.f82941h);
        sb2.append(", id=");
        sb2.append(this.f82942i);
        sb2.append(", spanCount=");
        sb2.append(this.f82943j);
        sb2.append(", displayType=");
        sb2.append(this.f82944k);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f82945l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f82935b, i12);
        parcel.writeParcelable(this.f82936c, i12);
        parcel.writeParcelable(this.f82937d, i12);
        Iterator itJ = C0.j(this.f82938e, parcel);
        while (itJ.hasNext()) {
            ((AutoSelectExpandableAdvantageItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f82939f, i12);
        parcel.writeString(this.f82940g);
        parcel.writeString(this.f82941h);
        parcel.writeLong(this.f82942i);
        parcel.writeInt(this.f82943j);
        parcel.writeString(this.f82944k.name());
        parcel.writeString(this.f82945l.name());
    }

    public /* synthetic */ AutoSelectParametersV2Item(AttributedText attributedText, AttributedText attributedText2, Image image, List list, AttributedText attributedText3, String str, String str2, long j12, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(attributedText, attributedText2, image, list, attributedText3, str, str2, j12, i12, (i13 & 512) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 1024) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
