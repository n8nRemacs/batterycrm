package com.avito.android.stories.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StoryCarouselItem.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/stories/model/StoryCarouselItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/stories/model/a;", "_avito_stories_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StoryCarouselItem implements Parcelable, com.avito.android.stories.model.a {

    @k
    public static final Parcelable.Creator<StoryCarouselItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f285163b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f285164c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f285165d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public List<String> f285166e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f285167f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Color f285168g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f285169h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f285170i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f285171j;

    /* compiled from: StoryCarouselItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StoryCarouselItem> {
        @Override // android.os.Parcelable.Creator
        public final StoryCarouselItem createFromParcel(Parcel parcel) {
            return new StoryCarouselItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(StoryCarouselItem.class.getClassLoader()), parcel.createStringArrayList(), (Image) parcel.readParcelable(StoryCarouselItem.class.getClassLoader()), (Color) parcel.readParcelable(StoryCarouselItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoryCarouselItem[] newArray(int i12) {
            return new StoryCarouselItem[i12];
        }
    }

    public StoryCarouselItem(@k String str, @k String str2, @l DeepLink deepLink, @l List<String> list, @l Image image, @l Color color, @l String str3, boolean z12, @l String str4) {
        this.f285163b = str;
        this.f285164c = str2;
        this.f285165d = deepLink;
        this.f285166e = list;
        this.f285167f = image;
        this.f285168g = color;
        this.f285169h = str3;
        this.f285170i = z12;
        this.f285171j = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryCarouselItem)) {
            return false;
        }
        StoryCarouselItem storyCarouselItem = (StoryCarouselItem) obj;
        return L.f(this.f285163b, storyCarouselItem.f285163b) && L.f(this.f285164c, storyCarouselItem.f285164c) && L.f(this.f285165d, storyCarouselItem.f285165d) && L.f(this.f285166e, storyCarouselItem.f285166e) && L.f(this.f285167f, storyCarouselItem.f285167f) && L.f(this.f285168g, storyCarouselItem.f285168g) && L.f(this.f285169h, storyCarouselItem.f285169h) && this.f285170i == storyCarouselItem.f285170i && L.f(this.f285171j, storyCarouselItem.f285171j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281152b() {
        return this.f285164c;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f285163b.hashCode() * 31, 31, this.f285164c);
        DeepLink deepLink = this.f285165d;
        int iHashCode = (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        List<String> list = this.f285166e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Image image = this.f285167f;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Color color = this.f285168g;
        int iHashCode4 = (iHashCode3 + (color == null ? 0 : color.hashCode())) * 31;
        String str = this.f285169h;
        int i12 = r.i((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f285170i);
        String str2 = this.f285171j;
        return i12 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StoryCarouselItem(storyId=");
        sb2.append(this.f285163b);
        sb2.append(", stringId=");
        sb2.append(this.f285164c);
        sb2.append(", deeplink=");
        sb2.append(this.f285165d);
        sb2.append(", storiesIds=");
        sb2.append(this.f285166e);
        sb2.append(", image=");
        sb2.append(this.f285167f);
        sb2.append(", backgroundColor=");
        sb2.append(this.f285168g);
        sb2.append(", title=");
        sb2.append(this.f285169h);
        sb2.append(", isViewed=");
        sb2.append(this.f285170i);
        sb2.append(", badgeText=");
        return C22026a.c(sb2, this.f285171j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f285163b);
        parcel.writeString(this.f285164c);
        parcel.writeParcelable(this.f285165d, i12);
        parcel.writeStringList(this.f285166e);
        parcel.writeParcelable(this.f285167f, i12);
        parcel.writeParcelable(this.f285168g, i12);
        parcel.writeString(this.f285169h);
        parcel.writeInt(this.f285170i ? 1 : 0);
        parcel.writeString(this.f285171j);
    }

    public /* synthetic */ StoryCarouselItem(String str, String str2, DeepLink deepLink, List list, Image image, Color color, String str3, boolean z12, String str4, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? str : str2, deepLink, (i12 & 8) != 0 ? null : list, image, color, str3, z12, (i12 & 256) != 0 ? null : str4);
    }
}
