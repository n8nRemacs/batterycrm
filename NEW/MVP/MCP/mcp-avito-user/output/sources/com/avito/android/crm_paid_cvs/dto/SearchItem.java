package com.avito.android.crm_paid_cvs.dto;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/SearchItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<SearchItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f130376b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f130377c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f130378d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f130379e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f130380f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f130381g;

    /* compiled from: SearchItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchItem createFromParcel(Parcel parcel) {
            return new SearchItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(SearchItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(SearchItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchItem[] newArray(int i12) {
            return new SearchItem[i12];
        }
    }

    public SearchItem(@k String str, @k String str2, @k String str3, boolean z12, @k DeepLink deepLink, @l DeepLink deepLink2) {
        this.f130376b = str;
        this.f130377c = str2;
        this.f130378d = str3;
        this.f130379e = z12;
        this.f130380f = deepLink;
        this.f130381g = deepLink2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchItem)) {
            return false;
        }
        SearchItem searchItem = (SearchItem) obj;
        return L.f(this.f130376b, searchItem.f130376b) && L.f(this.f130377c, searchItem.f130377c) && L.f(this.f130378d, searchItem.f130378d) && this.f130379e == searchItem.f130379e && L.f(this.f130380f, searchItem.f130380f) && L.f(this.f130381g, searchItem.f130381g);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF118933d() {
        return this.f130376b;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f130380f, r.i(H.d(H.d(this.f130376b.hashCode() * 31, 31, this.f130377c), 31, this.f130378d), 31, this.f130379e), 31);
        DeepLink deepLink = this.f130381g;
        return iE2 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchItem(stringId=");
        sb2.append(this.f130376b);
        sb2.append(", title=");
        sb2.append(this.f130377c);
        sb2.append(", description=");
        sb2.append(this.f130378d);
        sb2.append(", hasNewSearches=");
        sb2.append(this.f130379e);
        sb2.append(", openDeeplink=");
        sb2.append(this.f130380f);
        sb2.append(", editDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f130381g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f130376b);
        parcel.writeString(this.f130377c);
        parcel.writeString(this.f130378d);
        parcel.writeInt(this.f130379e ? 1 : 0);
        parcel.writeParcelable(this.f130380f, i12);
        parcel.writeParcelable(this.f130381g, i12);
    }
}
