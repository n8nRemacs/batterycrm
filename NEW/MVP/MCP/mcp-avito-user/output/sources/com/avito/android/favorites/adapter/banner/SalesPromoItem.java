package com.avito.android.favorites.adapter.banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.vertical_main.SalesPromoWidget;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: SalesPromoItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/banner/SalesPromoItem;", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SalesPromoItem implements FavoriteListItem {

    @k
    public static final Parcelable.Creator<SalesPromoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f156524b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f156525c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f156526d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f156527e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalImage f156528f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f156529g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final DeepLink f156530h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final UniversalColor f156531i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f156532j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final UniversalImage f156533k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final SalesPromoWidget.AnalyticalParams f156534l;

    /* compiled from: SalesPromoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SalesPromoItem> {
        @Override // android.os.Parcelable.Creator
        public final SalesPromoItem createFromParcel(Parcel parcel) {
            return new SalesPromoItem(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(SalesPromoItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(SalesPromoItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(SalesPromoItem.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(SalesPromoItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SalesPromoItem.class.getClassLoader()), parcel.readString(), (UniversalImage) parcel.readParcelable(SalesPromoItem.class.getClassLoader()), (SalesPromoWidget.AnalyticalParams) parcel.readParcelable(SalesPromoItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SalesPromoItem[] newArray(int i12) {
            return new SalesPromoItem[i12];
        }
    }

    public SalesPromoItem(@k String str, @l String str2, @k AttributedText attributedText, @k AttributedText attributedText2, @l UniversalImage universalImage, @l String str3, @l DeepLink deepLink, @l UniversalColor universalColor, @l String str4, @l UniversalImage universalImage2, @l SalesPromoWidget.AnalyticalParams analyticalParams) {
        this.f156524b = str;
        this.f156525c = str2;
        this.f156526d = attributedText;
        this.f156527e = attributedText2;
        this.f156528f = universalImage;
        this.f156529g = str3;
        this.f156530h = deepLink;
        this.f156531i = universalColor;
        this.f156532j = str4;
        this.f156533k = universalImage2;
        this.f156534l = analyticalParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124032b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF156715b() {
        return this.f156524b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f156524b);
        parcel.writeString(this.f156525c);
        parcel.writeParcelable(this.f156526d, i12);
        parcel.writeParcelable(this.f156527e, i12);
        parcel.writeParcelable(this.f156528f, i12);
        parcel.writeString(this.f156529g);
        parcel.writeParcelable(this.f156530h, i12);
        parcel.writeParcelable(this.f156531i, i12);
        parcel.writeString(this.f156532j);
        parcel.writeParcelable(this.f156533k, i12);
        parcel.writeParcelable(this.f156534l, i12);
    }
}
