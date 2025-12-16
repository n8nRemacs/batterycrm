package com.avito.android.master_plan.adapter.info;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InfoItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/master_plan/adapter/info/InfoItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InfoItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<InfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f185996b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f185997c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f185998d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f185999e;

    /* compiled from: InfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InfoItem> {
        @Override // android.os.Parcelable.Creator
        public final InfoItem createFromParcel(Parcel parcel) {
            return new InfoItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(InfoItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final InfoItem[] newArray(int i12) {
            return new InfoItem[i12];
        }
    }

    public InfoItem(@k String str, @k String str2, @l String str3, @l DeepLink deepLink) {
        this.f185996b = str;
        this.f185997c = str2;
        this.f185998d = str3;
        this.f185999e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoItem)) {
            return false;
        }
        InfoItem infoItem = (InfoItem) obj;
        return L.f(this.f185996b, infoItem.f185996b) && L.f(this.f185997c, infoItem.f185997c) && L.f(this.f185998d, infoItem.f185998d) && L.f(this.f185999e, infoItem.f185999e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF137323b() {
        return this.f185996b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f185996b.hashCode() * 31, 31, this.f185997c);
        String str = this.f185998d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f185999e;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InfoItem(stringId=");
        sb2.append(this.f185996b);
        sb2.append(", title=");
        sb2.append(this.f185997c);
        sb2.append(", subtitle=");
        sb2.append(this.f185998d);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f185999e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f185996b);
        parcel.writeString(this.f185997c);
        parcel.writeString(this.f185998d);
        parcel.writeParcelable(this.f185999e, i12);
    }

    public /* synthetic */ InfoItem(String str, String str2, String str3, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : deepLink);
    }
}
