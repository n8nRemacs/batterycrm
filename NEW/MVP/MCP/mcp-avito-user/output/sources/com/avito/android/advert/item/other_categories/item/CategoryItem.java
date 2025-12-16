package com.avito.android.advert.item.other_categories.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CategoryItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/other_categories/item/CategoryItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CategoryItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<CategoryItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f77858b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f77859c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f77860d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UniversalImage f77861e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f77862f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f77863g;

    /* compiled from: CategoryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryItem> {
        @Override // android.os.Parcelable.Creator
        public final CategoryItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            return new CategoryItem((DeepLink) parcel.readParcelable(CategoryItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(CategoryItem.class.getClassLoader()), string, string2, string3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryItem[] newArray(int i12) {
            return new CategoryItem[i12];
        }
    }

    public CategoryItem(@k DeepLink deepLink, @k UniversalImage universalImage, @k String str, @k String str2, @l String str3, @l String str4) {
        this.f77858b = str;
        this.f77859c = str2;
        this.f77860d = str3;
        this.f77861e = universalImage;
        this.f77862f = deepLink;
        this.f77863g = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryItem)) {
            return false;
        }
        CategoryItem categoryItem = (CategoryItem) obj;
        return L.f(this.f77858b, categoryItem.f77858b) && L.f(this.f77859c, categoryItem.f77859c) && L.f(this.f77860d, categoryItem.f77860d) && L.f(this.f77861e, categoryItem.f77861e) && L.f(this.f77862f, categoryItem.f77862f) && L.f(this.f77863g, categoryItem.f77863g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF77403b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF77404c() {
        return this.f77859c;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f77858b.hashCode() * 31, 31, this.f77859c);
        String str = this.f77860d;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f77862f, com.avito.android.actions_sheet.a.a((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f77861e), 31);
        String str2 = this.f77863g;
        return iE2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryItem(title=");
        sb2.append(this.f77858b);
        sb2.append(", stringId=");
        sb2.append(this.f77859c);
        sb2.append(", subtitle=");
        sb2.append(this.f77860d);
        sb2.append(", image=");
        sb2.append(this.f77861e);
        sb2.append(", deeplink=");
        sb2.append(this.f77862f);
        sb2.append(", rightEdgeIcon=");
        return C22026a.c(sb2, this.f77863g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f77858b);
        parcel.writeString(this.f77859c);
        parcel.writeString(this.f77860d);
        parcel.writeParcelable(this.f77861e, i12);
        parcel.writeParcelable(this.f77862f, i12);
        parcel.writeString(this.f77863g);
    }

    public /* synthetic */ CategoryItem(String str, String str2, String str3, UniversalImage universalImage, DeepLink deepLink, String str4, int i12, C42822w c42822w) {
        this(deepLink, universalImage, str, (i12 & 2) != 0 ? str : str2, str3, str4);
    }
}
