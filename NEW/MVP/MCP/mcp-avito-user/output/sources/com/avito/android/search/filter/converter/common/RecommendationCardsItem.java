package com.avito.android.search.filter.converter.common;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecommendationCardsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/converter/common/RecommendationCardsItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecommendationCardsItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<RecommendationCardsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f262931b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f262932c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f262933d;

    /* compiled from: RecommendationCardsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecommendationCardsItem> {
        @Override // android.os.Parcelable.Creator
        public final RecommendationCardsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(RecommendationCardsItem.class, parcel, arrayList, iL2, 1);
            }
            return new RecommendationCardsItem(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendationCardsItem[] newArray(int i12) {
            return new RecommendationCardsItem[i12];
        }
    }

    public RecommendationCardsItem(@k String str, @k String str2, @k ArrayList arrayList) {
        this.f262931b = str;
        this.f262932c = str2;
        this.f262933d = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendationCardsItem)) {
            return false;
        }
        RecommendationCardsItem recommendationCardsItem = (RecommendationCardsItem) obj;
        return L.f(this.f262931b, recommendationCardsItem.f262931b) && L.f(this.f262932c, recommendationCardsItem.f262932c) && this.f262933d.equals(recommendationCardsItem.f262933d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74796b() {
        return getF265059b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF265059b() {
        return this.f262931b;
    }

    public final int hashCode() {
        return this.f262933d.hashCode() + H.d(this.f262931b.hashCode() * 31, 31, this.f262932c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecommendationCardsItem(stringId=");
        sb2.append(this.f262931b);
        sb2.append(", title=");
        sb2.append(this.f262932c);
        sb2.append(", cards=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f262933d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f262931b);
        parcel.writeString(this.f262932c);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f262933d, parcel);
        while (itZ.hasNext()) {
            parcel.writeParcelable((Parcelable) itZ.next(), i12);
        }
    }
}
