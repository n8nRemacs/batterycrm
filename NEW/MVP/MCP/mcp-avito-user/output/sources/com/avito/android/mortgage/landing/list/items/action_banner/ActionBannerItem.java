package com.avito.android.mortgage.landing.list.items.action_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ActionBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/action_banner/ActionBannerItem;", "Lcom/avito/android/mortgage/landing/list/items/LandingItem;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ActionBannerItem implements LandingItem, b.InterfaceC10495b {

    @k
    public static final Parcelable.Creator<ActionBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f199644b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UniversalImage f199645c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f199646d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f199647e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BannerAction f199648f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ParcelableClickStreamEvent f199649g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f199650h;

    /* compiled from: ActionBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActionBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final ActionBannerItem createFromParcel(Parcel parcel) {
            return new ActionBannerItem(parcel.readString(), (UniversalImage) parcel.readParcelable(ActionBannerItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(ActionBannerItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(ActionBannerItem.class.getClassLoader()), BannerAction.CREATOR.createFromParcel(parcel), (ParcelableClickStreamEvent) parcel.readParcelable(ActionBannerItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ActionBannerItem[] newArray(int i12) {
            return new ActionBannerItem[i12];
        }
    }

    public ActionBannerItem(@k String str, @k UniversalImage universalImage, @k AttributedText attributedText, @k AttributedText attributedText2, @k BannerAction bannerAction, @l ParcelableClickStreamEvent parcelableClickStreamEvent, boolean z12) {
        this.f199644b = str;
        this.f199645c = universalImage;
        this.f199646d = attributedText;
        this.f199647e = attributedText2;
        this.f199648f = bannerAction;
        this.f199649g = parcelableClickStreamEvent;
        this.f199650h = z12;
    }

    @Override // com.avito.android.mortgage.landing.list.items.LandingItem
    @k
    public final LandingItem N() {
        return new ActionBannerItem(this.f199644b, this.f199645c, this.f199646d, this.f199647e, this.f199648f, this.f199649g, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionBannerItem)) {
            return false;
        }
        ActionBannerItem actionBannerItem = (ActionBannerItem) obj;
        return L.f(this.f199644b, actionBannerItem.f199644b) && L.f(this.f199645c, actionBannerItem.f199645c) && L.f(this.f199646d, actionBannerItem.f199646d) && L.f(this.f199647e, actionBannerItem.f199647e) && L.f(this.f199648f, actionBannerItem.f199648f) && L.f(this.f199649g, actionBannerItem.f199649g) && this.f199650h == actionBannerItem.f199650h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF77493b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF77494c() {
        return this.f199644b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public final long getF77499h() {
        return a.C10492a.a(this);
    }

    public final int hashCode() {
        int iHashCode = (this.f199648f.hashCode() + com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.a(this.f199644b.hashCode() * 31, 31, this.f199645c), 31, this.f199646d), 31, this.f199647e)) * 31;
        ParcelableClickStreamEvent parcelableClickStreamEvent = this.f199649g;
        return Boolean.hashCode(this.f199650h) + ((iHashCode + (parcelableClickStreamEvent == null ? 0 : parcelableClickStreamEvent.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionBannerItem(stringId=");
        sb2.append(this.f199644b);
        sb2.append(", image=");
        sb2.append(this.f199645c);
        sb2.append(", title=");
        sb2.append(this.f199646d);
        sb2.append(", description=");
        sb2.append(this.f199647e);
        sb2.append(", action=");
        sb2.append(this.f199648f);
        sb2.append(", viewportAnalytics=");
        sb2.append(this.f199649g);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f199650h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f199644b);
        parcel.writeParcelable(this.f199645c, i12);
        parcel.writeParcelable(this.f199646d, i12);
        parcel.writeParcelable(this.f199647e, i12);
        this.f199648f.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f199649g, i12);
        parcel.writeInt(this.f199650h ? 1 : 0);
    }

    public /* synthetic */ ActionBannerItem(String str, UniversalImage universalImage, AttributedText attributedText, AttributedText attributedText2, BannerAction bannerAction, ParcelableClickStreamEvent parcelableClickStreamEvent, boolean z12, int i12, C42822w c42822w) {
        this(str, universalImage, attributedText, attributedText2, bannerAction, parcelableClickStreamEvent, (i12 & 64) != 0 ? true : z12);
    }
}
