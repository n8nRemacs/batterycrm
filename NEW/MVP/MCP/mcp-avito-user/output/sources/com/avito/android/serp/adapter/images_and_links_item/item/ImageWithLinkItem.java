package com.avito.android.serp.adapter.images_and_links_item.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.section.SectionElement;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImageWithLinkItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/images_and_links_item/item/ImageWithLinkItem;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/remote/model/section/SectionElement;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageWithLinkItem implements com.avito.conveyor_item.a, SectionElement {

    @k
    public static final Parcelable.Creator<ImageWithLinkItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f270187b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UniversalImage f270188c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f270189d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f270190e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f270191f;

    /* compiled from: ImageWithLinkItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImageWithLinkItem> {
        @Override // android.os.Parcelable.Creator
        public final ImageWithLinkItem createFromParcel(Parcel parcel) {
            return new ImageWithLinkItem(parcel.readString(), (UniversalImage) parcel.readParcelable(ImageWithLinkItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(ImageWithLinkItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageWithLinkItem[] newArray(int i12) {
            return new ImageWithLinkItem[i12];
        }
    }

    public ImageWithLinkItem(@k String str, @k UniversalImage universalImage, @k DeepLink deepLink, @l String str2, boolean z12) {
        this.f270187b = str;
        this.f270188c = universalImage;
        this.f270189d = deepLink;
        this.f270190e = str2;
        this.f270191f = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    public final long getId() {
        return getF223480b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223480b() {
        return this.f270187b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f270187b);
        parcel.writeParcelable(this.f270188c, i12);
        parcel.writeParcelable(this.f270189d, i12);
        parcel.writeString(this.f270190e);
        parcel.writeInt(this.f270191f ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImageWithLinkItem(String str, UniversalImage universalImage, DeepLink deepLink, String str2, boolean z12, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            str = "image_with_link_item:" + UUID.randomUUID();
        }
        this(str, universalImage, deepLink, str2, (i12 & 16) != 0 ? false : z12);
    }
}
