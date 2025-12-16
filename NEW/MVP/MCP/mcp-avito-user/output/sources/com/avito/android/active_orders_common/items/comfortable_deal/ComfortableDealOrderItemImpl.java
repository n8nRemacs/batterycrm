package com.avito.android.active_orders_common.items.comfortable_deal;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders_common/items/comfortable_deal/ComfortableDealOrderItemImpl;", "Lcom/avito/android/active_orders_common/items/comfortable_deal/ComfortableDealOrderItem;", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ComfortableDealOrderItemImpl implements ComfortableDealOrderItem {

    @k
    public static final Parcelable.Creator<ComfortableDealOrderItemImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f68320b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f68321c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f68322d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f68323e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f68324f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final DeepLink f68325g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final DeepLink f68326h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f68327i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f68328j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final BannerPayload f68329k;

    /* compiled from: ComfortableDealItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComfortableDealOrderItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final ComfortableDealOrderItemImpl createFromParcel(Parcel parcel) {
            return new ComfortableDealOrderItemImpl(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(ComfortableDealOrderItemImpl.class.getClassLoader()), (Image) parcel.readParcelable(ComfortableDealOrderItemImpl.class.getClassLoader()), (Image) parcel.readParcelable(ComfortableDealOrderItemImpl.class.getClassLoader()), (DeepLink) parcel.readParcelable(ComfortableDealOrderItemImpl.class.getClassLoader()), (DeepLink) parcel.readParcelable(ComfortableDealOrderItemImpl.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : BannerPayload.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ComfortableDealOrderItemImpl[] newArray(int i12) {
            return new ComfortableDealOrderItemImpl[i12];
        }
    }

    public ComfortableDealOrderItemImpl(@k String str, @l String str2, @l AttributedText attributedText, @l Image image, @l Image image2, @k DeepLink deepLink, @k DeepLink deepLink2, boolean z12, @l String str3, @l BannerPayload bannerPayload) {
        this.f68320b = str;
        this.f68321c = str2;
        this.f68322d = attributedText;
        this.f68323e = image;
        this.f68324f = image2;
        this.f68325g = deepLink;
        this.f68326h = deepLink2;
        this.f68327i = z12;
        this.f68328j = str3;
        this.f68329k = bannerPayload;
    }

    @Override // com.avito.android.active_orders_common.items.comfortable_deal.ComfortableDealOrderItem
    @l
    /* renamed from: E3, reason: from getter */
    public final BannerPayload getF68329k() {
        return this.f68329k;
    }

    @Override // com.avito.android.active_orders_common.items.comfortable_deal.ComfortableDealOrderItem
    @l
    /* renamed from: H1, reason: from getter */
    public final Image getF68324f() {
        return this.f68324f;
    }

    @Override // com.avito.android.active_orders_common.items.comfortable_deal.ComfortableDealOrderItem
    /* renamed from: b4, reason: from getter */
    public final boolean getF68327i() {
        return this.f68327i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComfortableDealOrderItemImpl)) {
            return false;
        }
        ComfortableDealOrderItemImpl comfortableDealOrderItemImpl = (ComfortableDealOrderItemImpl) obj;
        return L.f(this.f68320b, comfortableDealOrderItemImpl.f68320b) && L.f(this.f68321c, comfortableDealOrderItemImpl.f68321c) && L.f(this.f68322d, comfortableDealOrderItemImpl.f68322d) && L.f(this.f68323e, comfortableDealOrderItemImpl.f68323e) && L.f(this.f68324f, comfortableDealOrderItemImpl.f68324f) && L.f(this.f68325g, comfortableDealOrderItemImpl.f68325g) && L.f(this.f68326h, comfortableDealOrderItemImpl.f68326h) && this.f68327i == comfortableDealOrderItemImpl.f68327i && L.f(this.f68328j, comfortableDealOrderItemImpl.f68328j) && L.f(this.f68329k, comfortableDealOrderItemImpl.f68329k);
    }

    @Override // com.avito.android.active_orders_common.items.comfortable_deal.ComfortableDealOrderItem
    @k
    /* renamed from: getDeepLink, reason: from getter */
    public final DeepLink getF68325g() {
        return this.f68325g;
    }

    @Override // com.avito.android.active_orders_common.items.comfortable_deal.ComfortableDealOrderItem
    @l
    /* renamed from: getDescription, reason: from getter */
    public final AttributedText getF68322d() {
        return this.f68322d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75092b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.active_orders_common.items.comfortable_deal.ComfortableDealOrderItem
    @k
    /* renamed from: getOnShowDeeplink, reason: from getter */
    public final DeepLink getF68326h() {
        return this.f68326h;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288411b() {
        return this.f68320b;
    }

    @Override // com.avito.android.active_orders_common.items.comfortable_deal.ComfortableDealOrderItem
    @l
    /* renamed from: getTitle, reason: from getter */
    public final String getF68321c() {
        return this.f68321c;
    }

    public final int hashCode() {
        int iHashCode = this.f68320b.hashCode() * 31;
        String str = this.f68321c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f68322d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Image image = this.f68323e;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.f68324f;
        int i12 = r.i(com.avito.android.actions_sheet.a.e(this.f68326h, com.avito.android.actions_sheet.a.e(this.f68325g, (iHashCode4 + (image2 == null ? 0 : image2.hashCode())) * 31, 31), 31), 31, this.f68327i);
        String str2 = this.f68328j;
        int iHashCode5 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BannerPayload bannerPayload = this.f68329k;
        return iHashCode5 + (bannerPayload != null ? bannerPayload.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ComfortableDealOrderItemImpl(stringId=" + this.f68320b + ", title=" + this.f68321c + ", description=" + this.f68322d + ", imageItem=" + this.f68323e + ", imageAvatar=" + this.f68324f + ", deepLink=" + this.f68325g + ", onShowDeeplink=" + this.f68326h + ", useFullScreenWidth=" + this.f68327i + ", agentName=" + this.f68328j + ", bannerPayload=" + this.f68329k + ')';
    }

    @Override // com.avito.android.active_orders_common.items.comfortable_deal.ComfortableDealOrderItem
    @l
    /* renamed from: u2, reason: from getter */
    public final String getF68328j() {
        return this.f68328j;
    }

    @Override // com.avito.android.active_orders_common.items.comfortable_deal.ComfortableDealOrderItem
    @l
    /* renamed from: v0, reason: from getter */
    public final Image getF68323e() {
        return this.f68323e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f68320b);
        parcel.writeString(this.f68321c);
        parcel.writeParcelable(this.f68322d, i12);
        parcel.writeParcelable(this.f68323e, i12);
        parcel.writeParcelable(this.f68324f, i12);
        parcel.writeParcelable(this.f68325g, i12);
        parcel.writeParcelable(this.f68326h, i12);
        parcel.writeInt(this.f68327i ? 1 : 0);
        parcel.writeString(this.f68328j);
        BannerPayload bannerPayload = this.f68329k;
        if (bannerPayload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bannerPayload.writeToParcel(parcel, i12);
        }
    }
}
