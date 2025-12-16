package com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UspBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/UspBannerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UspBannerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<UspBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f273310b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f273311c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UspBannerItemBadge f273312d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UspBannerItemButton f273313e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalImage f273314f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f273315g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final UspBannerItemSettings f273316h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final UspBannerItemAnalytics f273317i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f273318j;

    /* compiled from: UspBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UspBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final UspBannerItem createFromParcel(Parcel parcel) {
            return new UspBannerItem((AttributedText) parcel.readParcelable(UspBannerItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(UspBannerItem.class.getClassLoader()), parcel.readInt() == 0 ? null : UspBannerItemBadge.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UspBannerItemButton.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(UspBannerItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(UspBannerItem.class.getClassLoader()), UspBannerItemSettings.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UspBannerItemAnalytics.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UspBannerItem[] newArray(int i12) {
            return new UspBannerItem[i12];
        }
    }

    public UspBannerItem(@k AttributedText attributedText, @l AttributedText attributedText2, @l UspBannerItemBadge uspBannerItemBadge, @l UspBannerItemButton uspBannerItemButton, @l UniversalImage universalImage, @l DeepLink deepLink, @k UspBannerItemSettings uspBannerItemSettings, @l UspBannerItemAnalytics uspBannerItemAnalytics, @k String str) {
        this.f273310b = attributedText;
        this.f273311c = attributedText2;
        this.f273312d = uspBannerItemBadge;
        this.f273313e = uspBannerItemButton;
        this.f273314f = universalImage;
        this.f273315g = deepLink;
        this.f273316h = uspBannerItemSettings;
        this.f273317i = uspBannerItemAnalytics;
        this.f273318j = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UspBannerItem)) {
            return false;
        }
        UspBannerItem uspBannerItem = (UspBannerItem) obj;
        return L.f(this.f273310b, uspBannerItem.f273310b) && L.f(this.f273311c, uspBannerItem.f273311c) && L.f(this.f273312d, uspBannerItem.f273312d) && L.f(this.f273313e, uspBannerItem.f273313e) && L.f(this.f273314f, uspBannerItem.f273314f) && L.f(this.f273315g, uspBannerItem.f273315g) && L.f(this.f273316h, uspBannerItem.f273316h) && L.f(this.f273317i, uspBannerItem.f273317i) && L.f(this.f273318j, uspBannerItem.f273318j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269870b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272718b() {
        return this.f273318j;
    }

    public final int hashCode() {
        int iHashCode = this.f273310b.hashCode() * 31;
        AttributedText attributedText = this.f273311c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UspBannerItemBadge uspBannerItemBadge = this.f273312d;
        int iHashCode3 = (iHashCode2 + (uspBannerItemBadge == null ? 0 : uspBannerItemBadge.hashCode())) * 31;
        UspBannerItemButton uspBannerItemButton = this.f273313e;
        int iHashCode4 = (iHashCode3 + (uspBannerItemButton == null ? 0 : uspBannerItemButton.hashCode())) * 31;
        UniversalImage universalImage = this.f273314f;
        int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink = this.f273315g;
        int iHashCode6 = (this.f273316h.hashCode() + ((iHashCode5 + (deepLink == null ? 0 : deepLink.hashCode())) * 31)) * 31;
        UspBannerItemAnalytics uspBannerItemAnalytics = this.f273317i;
        return this.f273318j.hashCode() + ((iHashCode6 + (uspBannerItemAnalytics != null ? uspBannerItemAnalytics.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UspBannerItem(title=");
        sb2.append(this.f273310b);
        sb2.append(", subtitle=");
        sb2.append(this.f273311c);
        sb2.append(", badge=");
        sb2.append(this.f273312d);
        sb2.append(", button=");
        sb2.append(this.f273313e);
        sb2.append(", image=");
        sb2.append(this.f273314f);
        sb2.append(", deeplink=");
        sb2.append(this.f273315g);
        sb2.append(", settings=");
        sb2.append(this.f273316h);
        sb2.append(", analytics=");
        sb2.append(this.f273317i);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f273318j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f273310b, i12);
        parcel.writeParcelable(this.f273311c, i12);
        UspBannerItemBadge uspBannerItemBadge = this.f273312d;
        if (uspBannerItemBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uspBannerItemBadge.writeToParcel(parcel, i12);
        }
        UspBannerItemButton uspBannerItemButton = this.f273313e;
        if (uspBannerItemButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uspBannerItemButton.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f273314f, i12);
        parcel.writeParcelable(this.f273315g, i12);
        this.f273316h.writeToParcel(parcel, i12);
        UspBannerItemAnalytics uspBannerItemAnalytics = this.f273317i;
        if (uspBannerItemAnalytics == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uspBannerItemAnalytics.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f273318j);
    }

    public /* synthetic */ UspBannerItem(AttributedText attributedText, AttributedText attributedText2, UspBannerItemBadge uspBannerItemBadge, UspBannerItemButton uspBannerItemButton, UniversalImage universalImage, DeepLink deepLink, UspBannerItemSettings uspBannerItemSettings, UspBannerItemAnalytics uspBannerItemAnalytics, String str, int i12, C42822w c42822w) {
        this(attributedText, attributedText2, uspBannerItemBadge, uspBannerItemButton, universalImage, deepLink, uspBannerItemSettings, uspBannerItemAnalytics, (i12 & 256) != 0 ? attributedText.getText() : str);
    }
}
