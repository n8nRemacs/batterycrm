package com.avito.android.advert.item.auto_media.preview;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.MediaSectionType;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoMediaPreviewItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/auto_media/preview/AutoMediaPreviewItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AutoMediaPreviewItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AutoMediaPreviewItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f72937b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f72938c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Image f72939d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f72940e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final MediaSectionType f72941f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final DeepLink f72942g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f72943h;

    /* compiled from: AutoMediaPreviewItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoMediaPreviewItem> {
        @Override // android.os.Parcelable.Creator
        public final AutoMediaPreviewItem createFromParcel(Parcel parcel) {
            return new AutoMediaPreviewItem(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(AutoMediaPreviewItem.class.getClassLoader()), parcel.readString(), (MediaSectionType) parcel.readParcelable(AutoMediaPreviewItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(AutoMediaPreviewItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AutoMediaPreviewItem[] newArray(int i12) {
            return new AutoMediaPreviewItem[i12];
        }
    }

    public AutoMediaPreviewItem(@k String str, @k String str2, @k Image image, @l String str3, @k MediaSectionType mediaSectionType, @k DeepLink deepLink, boolean z12) {
        this.f72937b = str;
        this.f72938c = str2;
        this.f72939d = image;
        this.f72940e = str3;
        this.f72941f = mediaSectionType;
        this.f72942g = deepLink;
        this.f72943h = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoMediaPreviewItem)) {
            return false;
        }
        AutoMediaPreviewItem autoMediaPreviewItem = (AutoMediaPreviewItem) obj;
        return L.f(this.f72937b, autoMediaPreviewItem.f72937b) && L.f(this.f72938c, autoMediaPreviewItem.f72938c) && L.f(this.f72939d, autoMediaPreviewItem.f72939d) && L.f(this.f72940e, autoMediaPreviewItem.f72940e) && this.f72941f == autoMediaPreviewItem.f72941f && L.f(this.f72942g, autoMediaPreviewItem.f72942g) && this.f72943h == autoMediaPreviewItem.f72943h;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF294837b() {
        return this.f72937b;
    }

    public final int hashCode() {
        int iG2 = com.avito.android.actions_sheet.a.g(this.f72939d, H.d(this.f72937b.hashCode() * 31, 31, this.f72938c), 31);
        String str = this.f72940e;
        return Boolean.hashCode(this.f72943h) + com.avito.android.actions_sheet.a.e(this.f72942g, (this.f72941f.hashCode() + ((iG2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoMediaPreviewItem(stringId=");
        sb2.append(this.f72937b);
        sb2.append(", title=");
        sb2.append(this.f72938c);
        sb2.append(", image=");
        sb2.append(this.f72939d);
        sb2.append(", tag=");
        sb2.append(this.f72940e);
        sb2.append(", type=");
        sb2.append(this.f72941f);
        sb2.append(", deeplink=");
        sb2.append(this.f72942g);
        sb2.append(", isMotoWaterAdvert=");
        return r.x(sb2, this.f72943h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f72937b);
        parcel.writeString(this.f72938c);
        parcel.writeParcelable(this.f72939d, i12);
        parcel.writeString(this.f72940e);
        parcel.writeParcelable(this.f72941f, i12);
        parcel.writeParcelable(this.f72942g, i12);
        parcel.writeInt(this.f72943h ? 1 : 0);
    }

    public /* synthetic */ AutoMediaPreviewItem(String str, String str2, Image image, String str3, MediaSectionType mediaSectionType, DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? AutoMediaPreviewItem.class.getName() : str, str2, image, str3, mediaSectionType, deepLink, z12);
    }
}
