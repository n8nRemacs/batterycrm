package com.avito.android.serp.adapter.alert_banner;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.alert_banner.Action;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AlertBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/alert_banner/AlertBannerItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AlertBannerItem implements PersistableSerpItem {

    @Y61.k
    public static final Parcelable.Creator<AlertBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f268897b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f268898c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f268899d;

    /* renamed from: e, reason: collision with root package name */
    public final int f268900e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Action f268901f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Action f268902g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f268903h = SerpViewType.f268585e;

    /* renamed from: i, reason: collision with root package name */
    public final int f268904i = 6;

    /* compiled from: AlertBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AlertBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final AlertBannerItem createFromParcel(Parcel parcel) {
            return new AlertBannerItem(parcel.readString(), (AttributedText) parcel.readParcelable(AlertBannerItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(AlertBannerItem.class.getClassLoader()), parcel.readInt(), (Action) parcel.readParcelable(AlertBannerItem.class.getClassLoader()), (Action) parcel.readParcelable(AlertBannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AlertBannerItem[] newArray(int i12) {
            return new AlertBannerItem[i12];
        }
    }

    public AlertBannerItem(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @InterfaceC42150f int i12, @Y61.l Action action, @Y61.l Action action2) {
        this.f268897b = str;
        this.f268898c = attributedText;
        this.f268899d = attributedText2;
        this.f268900e = i12;
        this.f268901f = action;
        this.f268902g = action2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertBannerItem)) {
            return false;
        }
        AlertBannerItem alertBannerItem = (AlertBannerItem) obj;
        return L.f(this.f268897b, alertBannerItem.f268897b) && L.f(this.f268898c, alertBannerItem.f268898c) && L.f(this.f268899d, alertBannerItem.f268899d) && this.f268900e == alertBannerItem.f268900e && L.f(this.f268901f, alertBannerItem.f268901f) && L.f(this.f268902g, alertBannerItem.f268902g);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78710b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78716h() {
        return this.f268904i;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF250470b() {
        return this.f268897b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78717i() {
        return this.f268903h;
    }

    public final int hashCode() {
        int iHashCode = this.f268897b.hashCode() * 31;
        AttributedText attributedText = this.f268898c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f268899d;
        int iE2 = r.e(this.f268900e, (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31, 31);
        Action action = this.f268901f;
        int iHashCode3 = (iE2 + (action == null ? 0 : action.hashCode())) * 31;
        Action action2 = this.f268902g;
        return iHashCode3 + (action2 != null ? action2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "AlertBannerItem(stringId=" + this.f268897b + ", title=" + this.f268898c + ", textBody=" + this.f268899d + ", style=" + this.f268900e + ", action=" + this.f268901f + ", link=" + this.f268902g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f268897b);
        parcel.writeParcelable(this.f268898c, i12);
        parcel.writeParcelable(this.f268899d, i12);
        parcel.writeInt(this.f268900e);
        parcel.writeParcelable(this.f268901f, i12);
        parcel.writeParcelable(this.f268902g, i12);
    }
}
