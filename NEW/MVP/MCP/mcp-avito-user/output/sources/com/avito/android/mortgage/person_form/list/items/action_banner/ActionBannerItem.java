package com.avito.android.mortgage.person_form.list.items.action_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.conveyor_item.a;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ActionBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/action_banner/ActionBannerItem;", "Lcom/avito/android/mortgage/person_form/list/items/PersonFormItem;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ActionBannerItem implements PersonFormItem, b.InterfaceC10495b {

    @k
    public static final Parcelable.Creator<ActionBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f200563b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f200564c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f200565d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f200566e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f200567f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f200568g;

    /* compiled from: ActionBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActionBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final ActionBannerItem createFromParcel(Parcel parcel) {
            return new ActionBannerItem((DeepLink) parcel.readParcelable(ActionBannerItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ActionBannerItem[] newArray(int i12) {
            return new ActionBannerItem[i12];
        }
    }

    public ActionBannerItem(@l DeepLink deepLink, @k String str, @k String str2, @k String str3, @l String str4, boolean z12) {
        this.f200563b = str;
        this.f200564c = str2;
        this.f200565d = str3;
        this.f200566e = str4;
        this.f200567f = deepLink;
        this.f200568g = z12;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    @k
    public final PersonFormItem N() {
        return new ActionBannerItem(this.f200567f, this.f200563b, this.f200564c, this.f200565d, this.f200566e, false);
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
        return L.f(this.f200563b, actionBannerItem.f200563b) && L.f(this.f200564c, actionBannerItem.f200564c) && L.f(this.f200565d, actionBannerItem.f200565d) && L.f(this.f200566e, actionBannerItem.f200566e) && L.f(this.f200567f, actionBannerItem.f200567f) && this.f200568g == actionBannerItem.f200568g;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF200700n() {
        return this.f200568g;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    public final boolean getHasError() {
        return false;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF121320b() {
        return this.f200563b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public final long getF270103g() {
        return a.C10492a.a(this);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f200563b.hashCode() * 31, 31, this.f200564c), 31, this.f200565d);
        String str = this.f200566e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f200567f;
        return Boolean.hashCode(this.f200568g) + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionBannerItem(stringId=");
        sb2.append(this.f200563b);
        sb2.append(", title=");
        sb2.append(this.f200564c);
        sb2.append(", description=");
        sb2.append(this.f200565d);
        sb2.append(", actionTitle=");
        sb2.append(this.f200566e);
        sb2.append(", actionLink=");
        sb2.append(this.f200567f);
        sb2.append(", enabled=");
        return r.x(sb2, this.f200568g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f200563b);
        parcel.writeString(this.f200564c);
        parcel.writeString(this.f200565d);
        parcel.writeString(this.f200566e);
        parcel.writeParcelable(this.f200567f, i12);
        parcel.writeInt(this.f200568g ? 1 : 0);
    }

    public /* synthetic */ ActionBannerItem(String str, String str2, String str3, String str4, DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
        this(deepLink, str, str2, str3, str4, (i12 & 32) != 0 ? true : z12);
    }
}
