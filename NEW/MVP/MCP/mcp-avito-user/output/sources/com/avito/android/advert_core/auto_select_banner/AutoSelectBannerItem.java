package com.avito.android.advert_core.auto_select_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.auto_select.SelectButtonParams;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/auto_select_banner/AutoSelectBannerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AutoSelectBannerItem implements BlockItem {

    @k
    public static final Parcelable.Creator<AutoSelectBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f82890b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f82891c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SelectButtonParams f82892d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f82893e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f82894f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Image f82895g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final UniversalImage f82896h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f82897i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f82898j;

    /* renamed from: k, reason: collision with root package name */
    public final int f82899k;

    /* compiled from: AutoSelectBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectBannerItem createFromParcel(Parcel parcel) {
            return new AutoSelectBannerItem((AttributedText) parcel.readParcelable(AutoSelectBannerItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(AutoSelectBannerItem.class.getClassLoader()), (SelectButtonParams) parcel.readParcelable(AutoSelectBannerItem.class.getClassLoader()), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(AutoSelectBannerItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(AutoSelectBannerItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectBannerItem[] newArray(int i12) {
            return new AutoSelectBannerItem[i12];
        }
    }

    public AutoSelectBannerItem(@k AttributedText attributedText, @k AttributedText attributedText2, @k SelectButtonParams selectButtonParams, @k String str, @k String str2, @l Image image, @l UniversalImage universalImage, @l String str3, @k String str4, int i12) {
        this.f82890b = attributedText;
        this.f82891c = attributedText2;
        this.f82892d = selectButtonParams;
        this.f82893e = str;
        this.f82894f = str2;
        this.f82895g = image;
        this.f82896h = universalImage;
        this.f82897i = str3;
        this.f82898j = str4;
        this.f82899k = i12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AutoSelectBannerItem(this.f82890b, this.f82891c, this.f82892d, this.f82893e, this.f82894f, this.f82895g, this.f82896h, this.f82897i, this.f82898j, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectBannerItem)) {
            return false;
        }
        AutoSelectBannerItem autoSelectBannerItem = (AutoSelectBannerItem) obj;
        return L.f(this.f82890b, autoSelectBannerItem.f82890b) && L.f(this.f82891c, autoSelectBannerItem.f82891c) && L.f(this.f82892d, autoSelectBannerItem.f82892d) && L.f(this.f82893e, autoSelectBannerItem.f82893e) && L.f(this.f82894f, autoSelectBannerItem.f82894f) && L.f(this.f82895g, autoSelectBannerItem.f82895g) && L.f(this.f82896h, autoSelectBannerItem.f82896h) && L.f(this.f82897i, autoSelectBannerItem.f82897i) && L.f(this.f82898j, autoSelectBannerItem.f82898j) && this.f82899k == autoSelectBannerItem.f82899k;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79989b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF268904i() {
        return this.f82899k;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283214b() {
        return this.f82898j;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d((this.f82892d.hashCode() + com.avito.android.actions_sheet.a.b(this.f82890b.hashCode() * 31, 31, this.f82891c)) * 31, 31, this.f82893e), 31, this.f82894f);
        Image image = this.f82895g;
        int iHashCode = (iD2 + (image == null ? 0 : image.hashCode())) * 31;
        UniversalImage universalImage = this.f82896h;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str = this.f82897i;
        return Integer.hashCode(this.f82899k) + H.d((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f82898j);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectBannerItem(title=");
        sb2.append(this.f82890b);
        sb2.append(", description=");
        sb2.append(this.f82891c);
        sb2.append(", button=");
        sb2.append(this.f82892d);
        sb2.append(", componentSlug=");
        sb2.append(this.f82893e);
        sb2.append(", targetPage=");
        sb2.append(this.f82894f);
        sb2.append(", image=");
        sb2.append(this.f82895g);
        sb2.append(", universalImage=");
        sb2.append(this.f82896h);
        sb2.append(", style=");
        sb2.append(this.f82897i);
        sb2.append(", stringId=");
        sb2.append(this.f82898j);
        sb2.append(", spanCount=");
        return r.t(sb2, this.f82899k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f82890b, i12);
        parcel.writeParcelable(this.f82891c, i12);
        parcel.writeParcelable(this.f82892d, i12);
        parcel.writeString(this.f82893e);
        parcel.writeString(this.f82894f);
        parcel.writeParcelable(this.f82895g, i12);
        parcel.writeParcelable(this.f82896h, i12);
        parcel.writeString(this.f82897i);
        parcel.writeString(this.f82898j);
        parcel.writeInt(this.f82899k);
    }

    public /* synthetic */ AutoSelectBannerItem(AttributedText attributedText, AttributedText attributedText2, SelectButtonParams selectButtonParams, String str, String str2, Image image, UniversalImage universalImage, String str3, String str4, int i12, int i13, C42822w c42822w) {
        this(attributedText, attributedText2, selectButtonParams, str, str2, (i13 & 32) != 0 ? null : image, (i13 & 64) != 0 ? null : universalImage, (i13 & 128) != 0 ? null : str3, str4, i12);
    }
}
