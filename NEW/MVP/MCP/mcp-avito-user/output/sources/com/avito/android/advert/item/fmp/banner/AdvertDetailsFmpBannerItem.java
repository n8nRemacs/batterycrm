package com.avito.android.advert.item.fmp.banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.fmp.AnalyticsEvent;
import com.avito.android.remote.fmp.FMPBannerBackground;
import com.avito.android.remote.fmp.FMPBannerButton;
import com.avito.android.remote.fmp.FMPBannerPadding;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: AdvertDetailsFmpBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/fmp/banner/AdvertDetailsFmpBannerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsFmpBannerItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsFmpBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f75413b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f75414c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f75415d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f75416e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f75417f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final FMPBannerBackground f75418g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final FMPBannerButton f75419h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final FMPBannerPadding f75420i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final List<AnalyticsEvent> f75421j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final List<AnalyticsEvent> f75422k;

    /* renamed from: l, reason: collision with root package name */
    public final long f75423l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f75424m;

    /* renamed from: n, reason: collision with root package name */
    public final int f75425n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public SerpDisplayType f75426o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final SerpViewType f75427p;

    /* compiled from: AdvertDetailsFmpBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsFmpBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFmpBannerItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AdvertDetailsFmpBannerItem.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(AdvertDetailsFmpBannerItem.class.getClassLoader());
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(AdvertDetailsFmpBannerItem.class.getClassLoader());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(AdvertDetailsFmpBannerItem.class.getClassLoader());
            AttributedText attributedText3 = (AttributedText) parcel.readParcelable(AdvertDetailsFmpBannerItem.class.getClassLoader());
            FMPBannerBackground fMPBannerBackground = (FMPBannerBackground) parcel.readParcelable(AdvertDetailsFmpBannerItem.class.getClassLoader());
            FMPBannerButton fMPBannerButton = (FMPBannerButton) parcel.readParcelable(AdvertDetailsFmpBannerItem.class.getClassLoader());
            FMPBannerPadding fMPBannerPadding = (FMPBannerPadding) parcel.readParcelable(AdvertDetailsFmpBannerItem.class.getClassLoader());
            int iL2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(AdvertDetailsFmpBannerItem.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsFmpBannerItem.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new AdvertDetailsFmpBannerItem(attributedText, attributedText2, universalImage, deepLink, attributedText3, fMPBannerBackground, fMPBannerButton, fMPBannerPadding, arrayList, arrayList2, parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFmpBannerItem[] newArray(int i12) {
            return new AdvertDetailsFmpBannerItem[i12];
        }
    }

    public AdvertDetailsFmpBannerItem(@l AttributedText attributedText, @l AttributedText attributedText2, @l UniversalImage universalImage, @l DeepLink deepLink, @l AttributedText attributedText3, @l FMPBannerBackground fMPBannerBackground, @l FMPBannerButton fMPBannerButton, @l FMPBannerPadding fMPBannerPadding, @l List<AnalyticsEvent> list, @l List<AnalyticsEvent> list2, long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f75413b = attributedText;
        this.f75414c = attributedText2;
        this.f75415d = universalImage;
        this.f75416e = deepLink;
        this.f75417f = attributedText3;
        this.f75418g = fMPBannerBackground;
        this.f75419h = fMPBannerButton;
        this.f75420i = fMPBannerPadding;
        this.f75421j = list;
        this.f75422k = list2;
        this.f75423l = j12;
        this.f75424m = str;
        this.f75425n = i12;
        this.f75426o = serpDisplayType;
        this.f75427p = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsFmpBannerItem(this.f75413b, this.f75414c, this.f75415d, this.f75416e, this.f75417f, this.f75418g, this.f75419h, this.f75420i, this.f75421j, this.f75422k, this.f75423l, this.f75424m, i12, this.f75426o, this.f75427p);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f75426o = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsFmpBannerItem)) {
            return false;
        }
        AdvertDetailsFmpBannerItem advertDetailsFmpBannerItem = (AdvertDetailsFmpBannerItem) obj;
        return L.f(this.f75413b, advertDetailsFmpBannerItem.f75413b) && L.f(this.f75414c, advertDetailsFmpBannerItem.f75414c) && L.f(this.f75415d, advertDetailsFmpBannerItem.f75415d) && L.f(this.f75416e, advertDetailsFmpBannerItem.f75416e) && L.f(this.f75417f, advertDetailsFmpBannerItem.f75417f) && L.f(this.f75418g, advertDetailsFmpBannerItem.f75418g) && L.f(this.f75419h, advertDetailsFmpBannerItem.f75419h) && L.f(this.f75420i, advertDetailsFmpBannerItem.f75420i) && L.f(this.f75421j, advertDetailsFmpBannerItem.f75421j) && L.f(this.f75422k, advertDetailsFmpBannerItem.f75422k) && this.f75423l == advertDetailsFmpBannerItem.f75423l && L.f(this.f75424m, advertDetailsFmpBannerItem.f75424m) && this.f75425n == advertDetailsFmpBannerItem.f75425n && this.f75426o == advertDetailsFmpBannerItem.f75426o && this.f75427p == advertDetailsFmpBannerItem.f75427p;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF83025b() {
        return this.f75423l;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF83031h() {
        return this.f75425n;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF83026c() {
        return this.f75424m;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF83032i() {
        return this.f75427p;
    }

    public final int hashCode() {
        AttributedText attributedText = this.f75413b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.f75414c;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        UniversalImage universalImage = this.f75415d;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink = this.f75416e;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        AttributedText attributedText3 = this.f75417f;
        int iHashCode5 = (iHashCode4 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
        FMPBannerBackground fMPBannerBackground = this.f75418g;
        int iHashCode6 = (iHashCode5 + (fMPBannerBackground == null ? 0 : fMPBannerBackground.hashCode())) * 31;
        FMPBannerButton fMPBannerButton = this.f75419h;
        int iHashCode7 = (iHashCode6 + (fMPBannerButton == null ? 0 : fMPBannerButton.hashCode())) * 31;
        FMPBannerPadding fMPBannerPadding = this.f75420i;
        int iHashCode8 = (iHashCode7 + (fMPBannerPadding == null ? 0 : fMPBannerPadding.hashCode())) * 31;
        List<AnalyticsEvent> list = this.f75421j;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<AnalyticsEvent> list2 = this.f75422k;
        return this.f75427p.hashCode() + com.avito.android.actions_sheet.a.h(this.f75426o, r.e(this.f75425n, H.d(r.g((iHashCode9 + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.f75423l), 31, this.f75424m), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsFmpBannerItem(title=");
        sb2.append(this.f75413b);
        sb2.append(", subtitle=");
        sb2.append(this.f75414c);
        sb2.append(", image=");
        sb2.append(this.f75415d);
        sb2.append(", deeplink=");
        sb2.append(this.f75416e);
        sb2.append(", legal=");
        sb2.append(this.f75417f);
        sb2.append(", background=");
        sb2.append(this.f75418g);
        sb2.append(", button=");
        sb2.append(this.f75419h);
        sb2.append(", padding=");
        sb2.append(this.f75420i);
        sb2.append(", onSelect=");
        sb2.append(this.f75421j);
        sb2.append(", onAppear=");
        sb2.append(this.f75422k);
        sb2.append(", id=");
        sb2.append(this.f75423l);
        sb2.append(", stringId=");
        sb2.append(this.f75424m);
        sb2.append(", spanCount=");
        sb2.append(this.f75425n);
        sb2.append(", displayType=");
        sb2.append(this.f75426o);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f75427p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f75413b, i12);
        parcel.writeParcelable(this.f75414c, i12);
        parcel.writeParcelable(this.f75415d, i12);
        parcel.writeParcelable(this.f75416e, i12);
        parcel.writeParcelable(this.f75417f, i12);
        parcel.writeParcelable(this.f75418g, i12);
        parcel.writeParcelable(this.f75419h, i12);
        parcel.writeParcelable(this.f75420i, i12);
        List<AnalyticsEvent> list = this.f75421j;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        List<AnalyticsEvent> list2 = this.f75422k;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeLong(this.f75423l);
        parcel.writeString(this.f75424m);
        parcel.writeInt(this.f75425n);
        parcel.writeString(this.f75426o.name());
        parcel.writeString(this.f75427p.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsFmpBannerItem(AttributedText attributedText, AttributedText attributedText2, UniversalImage universalImage, DeepLink deepLink, AttributedText attributedText3, FMPBannerBackground fMPBannerBackground, FMPBannerButton fMPBannerButton, FMPBannerPadding fMPBannerPadding, List list, List list2, long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1024) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 181;
        } else {
            j13 = j12;
        }
        this(attributedText, attributedText2, universalImage, deepLink, attributedText3, fMPBannerBackground, fMPBannerButton, fMPBannerPadding, list, list2, j13, (i13 & 2048) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8192) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
