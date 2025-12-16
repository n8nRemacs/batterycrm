package com.avito.android.component.advert_badge_bar.badge;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.util.groupable_item.GroupingOutput;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BadgeItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/badge/BadgeItem;", "Lcom/avito/android/lib/util/groupable_item/a;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BadgeItem implements com.avito.android.lib.util.groupable_item.a, ParcelableItem {

    @k
    public static final Parcelable.Creator<BadgeItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f124943b;

    /* renamed from: c, reason: collision with root package name */
    public final int f124944c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f124945d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f124946e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalColor f124947f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final UniversalColor f124948g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final UniversalColor f124949h;

    /* renamed from: i, reason: collision with root package name */
    public final int f124950i;

    /* renamed from: j, reason: collision with root package name */
    public final int f124951j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final UniversalImage f124952k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final DeepLink f124953l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f124954m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f124955n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final GroupingOutput f124956o;

    /* compiled from: BadgeItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BadgeItem> {
        @Override // android.os.Parcelable.Creator
        public final BadgeItem createFromParcel(Parcel parcel) {
            return new BadgeItem(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(BadgeItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(BadgeItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(BadgeItem.class.getClassLoader()), parcel.readInt(), parcel.readInt(), (UniversalImage) parcel.readParcelable(BadgeItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(BadgeItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, (GroupingOutput) parcel.readParcelable(BadgeItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeItem[] newArray(int i12) {
            return new BadgeItem[i12];
        }
    }

    public BadgeItem(@k String str, int i12, @k String str2, @k String str3, @l UniversalColor universalColor, @l UniversalColor universalColor2, @l UniversalColor universalColor3, int i13, int i14, @l UniversalImage universalImage, @l DeepLink deepLink, boolean z12, boolean z13, @k GroupingOutput groupingOutput) {
        this.f124943b = str;
        this.f124944c = i12;
        this.f124945d = str2;
        this.f124946e = str3;
        this.f124947f = universalColor;
        this.f124948g = universalColor2;
        this.f124949h = universalColor3;
        this.f124950i = i13;
        this.f124951j = i14;
        this.f124952k = universalImage;
        this.f124953l = deepLink;
        this.f124954m = z12;
        this.f124955n = z13;
        this.f124956o = groupingOutput;
    }

    @Override // com.avito.android.lib.util.groupable_item.a
    /* renamed from: W, reason: from getter */
    public final boolean getF124955n() {
        return this.f124955n;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.lib.util.groupable_item.a
    @k
    /* renamed from: f, reason: from getter */
    public final GroupingOutput getF124956o() {
        return this.f124956o;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF125281c() {
        return this.f124943b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f124943b);
        parcel.writeInt(this.f124944c);
        parcel.writeString(this.f124945d);
        parcel.writeString(this.f124946e);
        parcel.writeParcelable(this.f124947f, i12);
        parcel.writeParcelable(this.f124948g, i12);
        parcel.writeParcelable(this.f124949h, i12);
        parcel.writeInt(this.f124950i);
        parcel.writeInt(this.f124951j);
        parcel.writeParcelable(this.f124952k, i12);
        parcel.writeParcelable(this.f124953l, i12);
        parcel.writeInt(this.f124954m ? 1 : 0);
        parcel.writeInt(this.f124955n ? 1 : 0);
        parcel.writeParcelable(this.f124956o, i12);
    }

    public /* synthetic */ BadgeItem(String str, int i12, String str2, String str3, UniversalColor universalColor, UniversalColor universalColor2, UniversalColor universalColor3, int i13, int i14, UniversalImage universalImage, DeepLink deepLink, boolean z12, boolean z13, GroupingOutput groupingOutput, int i15, C42822w c42822w) {
        this(str, i12, str2, str3, universalColor, universalColor2, universalColor3, (i15 & 128) != 0 ? Integer.MAX_VALUE : i13, (i15 & 256) != 0 ? Integer.MAX_VALUE : i14, (i15 & 512) != 0 ? null : universalImage, (i15 & 1024) != 0 ? null : deepLink, (i15 & 2048) != 0 ? false : z12, (i15 & 4096) != 0 ? false : z13, (i15 & 8192) != 0 ? new GroupingOutput() : groupingOutput);
    }
}
