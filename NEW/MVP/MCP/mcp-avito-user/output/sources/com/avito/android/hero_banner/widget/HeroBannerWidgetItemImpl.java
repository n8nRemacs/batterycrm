package com.avito.android.hero_banner.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.hero_banner.widget.HeroBannerWidgetItem;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HeroBannerWidgetItemImpl.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hero_banner/widget/HeroBannerWidgetItemImpl;", "Lcom/avito/android/hero_banner/widget/HeroBannerWidgetItem;", "_avito_bx-content_widget_hero-banner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HeroBannerWidgetItemImpl implements HeroBannerWidgetItem {

    @Y61.k
    public static final Parcelable.Creator<HeroBannerWidgetItemImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f161879b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final HeroBannerWidgetItem.HeroBannerItemTitle f161880c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f161881d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f161882e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f161883f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f161884g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final ArrayList f161885h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f161886i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final HeroBannerWidgetItem.UdfToolbarAndStatusBarConfig f161887j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f161888k = SerpViewType.f268585e;

    /* renamed from: l, reason: collision with root package name */
    public final int f161889l = 6;

    /* compiled from: HeroBannerWidgetItemImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HeroBannerWidgetItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final HeroBannerWidgetItemImpl createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            HeroBannerWidgetItem.HeroBannerItemTitle heroBannerItemTitle = (HeroBannerWidgetItem.HeroBannerItemTitle) parcel.readParcelable(HeroBannerWidgetItemImpl.class.getClassLoader());
            AttributedText attributedText = (AttributedText) parcel.readParcelable(HeroBannerWidgetItemImpl.class.getClassLoader());
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(HeroBannerWidgetItemImpl.class.getClassLoader());
            UniversalImage universalImage2 = (UniversalImage) parcel.readParcelable(HeroBannerWidgetItemImpl.class.getClassLoader());
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(HeroBannerWidgetItemImpl.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(HeroBannerWidgetItemImpl.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new HeroBannerWidgetItemImpl(string, heroBannerItemTitle, attributedText, universalImage, universalImage2, universalColor, arrayList, parcel.readString(), (HeroBannerWidgetItem.UdfToolbarAndStatusBarConfig) parcel.readParcelable(HeroBannerWidgetItemImpl.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HeroBannerWidgetItemImpl[] newArray(int i12) {
            return new HeroBannerWidgetItemImpl[i12];
        }
    }

    public HeroBannerWidgetItemImpl(@Y61.k String str, @Y61.k HeroBannerWidgetItem.HeroBannerItemTitle heroBannerItemTitle, @Y61.l AttributedText attributedText, @Y61.l UniversalImage universalImage, @Y61.l UniversalImage universalImage2, @Y61.k UniversalColor universalColor, @Y61.l ArrayList arrayList, @Y61.l String str2, @Y61.l HeroBannerWidgetItem.UdfToolbarAndStatusBarConfig udfToolbarAndStatusBarConfig) {
        this.f161879b = str;
        this.f161880c = heroBannerItemTitle;
        this.f161881d = attributedText;
        this.f161882e = universalImage;
        this.f161883f = universalImage2;
        this.f161884g = universalColor;
        this.f161885h = arrayList;
        this.f161886i = str2;
        this.f161887j = udfToolbarAndStatusBarConfig;
    }

    @Override // com.avito.android.hero_banner.widget.HeroBannerWidgetItem
    @Y61.l
    /* renamed from: W3, reason: from getter */
    public final HeroBannerWidgetItem.UdfToolbarAndStatusBarConfig getF161887j() {
        return this.f161887j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroBannerWidgetItemImpl)) {
            return false;
        }
        HeroBannerWidgetItemImpl heroBannerWidgetItemImpl = (HeroBannerWidgetItemImpl) obj;
        return L.f(this.f161879b, heroBannerWidgetItemImpl.f161879b) && L.f(this.f161880c, heroBannerWidgetItemImpl.f161880c) && L.f(this.f161881d, heroBannerWidgetItemImpl.f161881d) && L.f(this.f161882e, heroBannerWidgetItemImpl.f161882e) && L.f(this.f161883f, heroBannerWidgetItemImpl.f161883f) && L.f(this.f161884g, heroBannerWidgetItemImpl.f161884g) && L.f(this.f161885h, heroBannerWidgetItemImpl.f161885h) && L.f(this.f161886i, heroBannerWidgetItemImpl.f161886i) && L.f(this.f161887j, heroBannerWidgetItemImpl.f161887j);
    }

    @Override // com.avito.android.hero_banner.widget.HeroBannerWidgetItem
    @Y61.l
    /* renamed from: getBackgroundImage, reason: from getter */
    public final UniversalImage getF161883f() {
        return this.f161883f;
    }

    @Override // com.avito.android.hero_banner.widget.HeroBannerWidgetItem
    @Y61.l
    public final List<UniversalColor> getGradientColors() {
        return this.f161885h;
    }

    @Override // com.avito.android.hero_banner.widget.HeroBannerWidgetItem
    @Y61.l
    /* renamed from: getGradientToken, reason: from getter */
    public final String getF161886i() {
        return this.f161886i;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF68289e() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124032b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.hero_banner.widget.HeroBannerWidgetItem
    @Y61.l
    /* renamed from: getImage, reason: from getter */
    public final UniversalImage getF161882e() {
        return this.f161882e;
    }

    @Override // com.avito.android.hero_banner.widget.HeroBannerWidgetItem
    @Y61.k
    /* renamed from: getShadowColor, reason: from getter */
    public final UniversalColor getF161884g() {
        return this.f161884g;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF95534f() {
        return this.f161889l;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF161012d() {
        return this.f161879b;
    }

    @Override // com.avito.android.hero_banner.widget.HeroBannerWidgetItem
    @Y61.l
    /* renamed from: getSubtitle, reason: from getter */
    public final AttributedText getF161881d() {
        return this.f161881d;
    }

    @Override // com.avito.android.hero_banner.widget.HeroBannerWidgetItem
    @Y61.k
    /* renamed from: getTitle, reason: from getter */
    public final HeroBannerWidgetItem.HeroBannerItemTitle getF161880c() {
        return this.f161880c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF95536h() {
        return this.f161888k;
    }

    public final int hashCode() {
        int iHashCode = (this.f161880c.hashCode() + (this.f161879b.hashCode() * 31)) * 31;
        AttributedText attributedText = this.f161881d;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.f161882e;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UniversalImage universalImage2 = this.f161883f;
        int i12 = com.avito.android.actions_sheet.a.i(this.f161884g, (iHashCode3 + (universalImage2 == null ? 0 : universalImage2.hashCode())) * 31, 31);
        ArrayList arrayList = this.f161885h;
        int iHashCode4 = (i12 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str = this.f161886i;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        HeroBannerWidgetItem.UdfToolbarAndStatusBarConfig udfToolbarAndStatusBarConfig = this.f161887j;
        return iHashCode5 + (udfToolbarAndStatusBarConfig != null ? udfToolbarAndStatusBarConfig.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "HeroBannerWidgetItemImpl(stringId=" + this.f161879b + ", title=" + this.f161880c + ", subtitle=" + this.f161881d + ", image=" + this.f161882e + ", backgroundImage=" + this.f161883f + ", shadowColor=" + this.f161884g + ", gradientColors=" + this.f161885h + ", gradientToken=" + this.f161886i + ", udfToolbarAndStatusBarConfig=" + this.f161887j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f161879b);
        parcel.writeParcelable(this.f161880c, i12);
        parcel.writeParcelable(this.f161881d, i12);
        parcel.writeParcelable(this.f161882e, i12);
        parcel.writeParcelable(this.f161883f, i12);
        parcel.writeParcelable(this.f161884g, i12);
        ArrayList arrayList = this.f161885h;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                parcel.writeParcelable((Parcelable) itY.next(), i12);
            }
        }
        parcel.writeString(this.f161886i);
        parcel.writeParcelable(this.f161887j, i12);
    }
}
