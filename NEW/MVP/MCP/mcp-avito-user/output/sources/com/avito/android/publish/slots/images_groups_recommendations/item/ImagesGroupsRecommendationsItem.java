package com.avito.android.publish.slots.images_groups_recommendations.item;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImagesGroupsRecommendationsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/ImagesGroupsRecommendationsItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ImagesGroupsRecommendationsItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<ImagesGroupsRecommendationsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f244191b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Title f244192c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f244193d;

    /* compiled from: ImagesGroupsRecommendationsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImagesGroupsRecommendationsItem> {
        @Override // android.os.Parcelable.Creator
        public final ImagesGroupsRecommendationsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Title title = (Title) parcel.readParcelable(ImagesGroupsRecommendationsItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ImagesGroupsRecommendationsItem.class, parcel, arrayList, iL2, 1);
            }
            return new ImagesGroupsRecommendationsItem(string, title, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ImagesGroupsRecommendationsItem[] newArray(int i12) {
            return new ImagesGroupsRecommendationsItem[i12];
        }
    }

    public ImagesGroupsRecommendationsItem(@Y61.k String str, @Y61.k Title title, @Y61.k ArrayList arrayList) {
        this.f244191b = str;
        this.f244192c = title;
        this.f244193d = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagesGroupsRecommendationsItem)) {
            return false;
        }
        ImagesGroupsRecommendationsItem imagesGroupsRecommendationsItem = (ImagesGroupsRecommendationsItem) obj;
        return L.f(this.f244191b, imagesGroupsRecommendationsItem.f244191b) && L.f(this.f244192c, imagesGroupsRecommendationsItem.f244192c) && this.f244193d.equals(imagesGroupsRecommendationsItem.f244193d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207600b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF244024b() {
        return this.f244191b;
    }

    public final int hashCode() {
        return this.f244193d.hashCode() + ((this.f244192c.hashCode() + (this.f244191b.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImagesGroupsRecommendationsItem(stringId=");
        sb2.append(this.f244191b);
        sb2.append(", title=");
        sb2.append(this.f244192c);
        sb2.append(", recommendations=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f244193d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f244191b);
        parcel.writeParcelable(this.f244192c, i12);
        ArrayList arrayList = this.f244193d;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i12);
        }
    }
}
