package com.avito.android.stories.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StoryBannerItem.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/stories/model/StoryBannerItem;", "Lcom/avito/android/stories/model/a;", "Landroid/os/Parcelable;", "_avito_stories_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StoryBannerItem implements com.avito.android.stories.model.a, Parcelable {

    @k
    public static final Parcelable.Creator<StoryBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f285153b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f285154c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f285155d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f285156e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalColor f285157f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final UniversalColor f285158g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final DeepLink f285159h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final UniversalImage f285160i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final UniversalColor f285161j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final BannerType f285162k;

    /* compiled from: StoryBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StoryBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final StoryBannerItem createFromParcel(Parcel parcel) {
            return new StoryBannerItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(StoryBannerItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(StoryBannerItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(StoryBannerItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(StoryBannerItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(StoryBannerItem.class.getClassLoader()), BannerType.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StoryBannerItem[] newArray(int i12) {
            return new StoryBannerItem[i12];
        }
    }

    public StoryBannerItem(@k String str, @l String str2, @l String str3, @l String str4, @l UniversalColor universalColor, @l UniversalColor universalColor2, @l DeepLink deepLink, @l UniversalImage universalImage, @l UniversalColor universalColor3, @k BannerType bannerType) {
        this.f285153b = str;
        this.f285154c = str2;
        this.f285155d = str3;
        this.f285156e = str4;
        this.f285157f = universalColor;
        this.f285158g = universalColor2;
        this.f285159h = deepLink;
        this.f285160i = universalImage;
        this.f285161j = universalColor3;
        this.f285162k = bannerType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryBannerItem)) {
            return false;
        }
        StoryBannerItem storyBannerItem = (StoryBannerItem) obj;
        return L.f(this.f285153b, storyBannerItem.f285153b) && L.f(this.f285154c, storyBannerItem.f285154c) && L.f(this.f285155d, storyBannerItem.f285155d) && L.f(this.f285156e, storyBannerItem.f285156e) && L.f(this.f285157f, storyBannerItem.f285157f) && L.f(this.f285158g, storyBannerItem.f285158g) && L.f(this.f285159h, storyBannerItem.f285159h) && L.f(this.f285160i, storyBannerItem.f285160i) && L.f(this.f285161j, storyBannerItem.f285161j) && this.f285162k == storyBannerItem.f285162k;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF258546b() {
        return this.f285153b;
    }

    public final int hashCode() {
        int iHashCode = this.f285153b.hashCode() * 31;
        String str = this.f285154c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f285155d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f285156e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UniversalColor universalColor = this.f285157f;
        int iHashCode5 = (iHashCode4 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.f285158g;
        int iHashCode6 = (iHashCode5 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        DeepLink deepLink = this.f285159h;
        int iHashCode7 = (iHashCode6 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        UniversalImage universalImage = this.f285160i;
        int iHashCode8 = (iHashCode7 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UniversalColor universalColor3 = this.f285161j;
        return this.f285162k.hashCode() + ((iHashCode8 + (universalColor3 != null ? universalColor3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "StoryBannerItem(stringId=" + this.f285153b + ", analyticsTitle=" + this.f285154c + ", title=" + this.f285155d + ", subtitle=" + this.f285156e + ", titleColor=" + this.f285157f + ", subtitleColor=" + this.f285158g + ", uri=" + this.f285159h + ", universalImage=" + this.f285160i + ", background=" + this.f285161j + ", type=" + this.f285162k + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f285153b);
        parcel.writeString(this.f285154c);
        parcel.writeString(this.f285155d);
        parcel.writeString(this.f285156e);
        parcel.writeParcelable(this.f285157f, i12);
        parcel.writeParcelable(this.f285158g, i12);
        parcel.writeParcelable(this.f285159h, i12);
        parcel.writeParcelable(this.f285160i, i12);
        parcel.writeParcelable(this.f285161j, i12);
        this.f285162k.writeToParcel(parcel, i12);
    }

    public /* synthetic */ StoryBannerItem(String str, String str2, String str3, String str4, UniversalColor universalColor, UniversalColor universalColor2, DeepLink deepLink, UniversalImage universalImage, UniversalColor universalColor3, BannerType bannerType, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, str3, str4, universalColor, universalColor2, deepLink, universalImage, universalColor3, bannerType);
    }
}
