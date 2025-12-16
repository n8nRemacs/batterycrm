package com.avito.android.advert_multi_items.param;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MultiItemParamHeaderItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_multi_items/param/MultiItemParamHeaderItem;", "Landroid/os/Parcelable;", "_avito_advert-multi-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MultiItemParamHeaderItem implements Parcelable {

    @k
    public static final Parcelable.Creator<MultiItemParamHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f85901b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f85902c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f85903d;

    /* compiled from: MultiItemParamHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MultiItemParamHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final MultiItemParamHeaderItem createFromParcel(Parcel parcel) {
            return new MultiItemParamHeaderItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(MultiItemParamHeaderItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MultiItemParamHeaderItem[] newArray(int i12) {
            return new MultiItemParamHeaderItem[i12];
        }
    }

    public MultiItemParamHeaderItem(@k String str, @l String str2, @l DeepLink deepLink) {
        this.f85901b = str;
        this.f85902c = str2;
        this.f85903d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiItemParamHeaderItem)) {
            return false;
        }
        MultiItemParamHeaderItem multiItemParamHeaderItem = (MultiItemParamHeaderItem) obj;
        return L.f(this.f85901b, multiItemParamHeaderItem.f85901b) && L.f(this.f85902c, multiItemParamHeaderItem.f85902c) && L.f(this.f85903d, multiItemParamHeaderItem.f85903d);
    }

    public final int hashCode() {
        int iHashCode = this.f85901b.hashCode() * 31;
        String str = this.f85902c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f85903d;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiItemParamHeaderItem(title=");
        sb2.append(this.f85901b);
        sb2.append(", deeplinkTitle=");
        sb2.append(this.f85902c);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f85903d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f85901b);
        parcel.writeString(this.f85902c);
        parcel.writeParcelable(this.f85903d, i12);
    }

    public /* synthetic */ MultiItemParamHeaderItem(String str, String str2, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : deepLink);
    }
}
