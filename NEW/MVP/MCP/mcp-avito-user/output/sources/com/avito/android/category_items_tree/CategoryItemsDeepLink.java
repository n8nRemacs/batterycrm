package com.avito.android.category_items_tree;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CategoryItemsDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_items_tree/CategoryItemsDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_category-items-tree_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CategoryItemsDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CategoryItemsDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f116775b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f116776c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f116777d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f116778e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f116779f;

    /* compiled from: CategoryItemsDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryItemsDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final CategoryItemsDeepLink createFromParcel(Parcel parcel) {
            return new CategoryItemsDeepLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryItemsDeepLink[] newArray(int i12) {
            return new CategoryItemsDeepLink[i12];
        }
    }

    public CategoryItemsDeepLink(@k String str, @l String str2, @k String str3, @k String str4, @k String str5) {
        this.f116775b = str;
        this.f116776c = str2;
        this.f116777d = str3;
        this.f116778e = str4;
        this.f116779f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryItemsDeepLink)) {
            return false;
        }
        CategoryItemsDeepLink categoryItemsDeepLink = (CategoryItemsDeepLink) obj;
        return L.f(this.f116775b, categoryItemsDeepLink.f116775b) && L.f(this.f116776c, categoryItemsDeepLink.f116776c) && L.f(this.f116777d, categoryItemsDeepLink.f116777d) && L.f(this.f116778e, categoryItemsDeepLink.f116778e) && L.f(this.f116779f, categoryItemsDeepLink.f116779f);
    }

    public final int hashCode() {
        int iHashCode = this.f116775b.hashCode() * 31;
        String str = this.f116776c;
        return this.f116779f.hashCode() + H.d(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f116777d), 31, this.f116778e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryItemsDeepLink(promoType=");
        sb2.append(this.f116775b);
        sb2.append(", promoTypeId=");
        sb2.append(this.f116776c);
        sb2.append(", title=");
        sb2.append(this.f116777d);
        sb2.append(", categoryId=");
        sb2.append(this.f116778e);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f116779f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f116775b);
        parcel.writeString(this.f116776c);
        parcel.writeString(this.f116777d);
        parcel.writeString(this.f116778e);
        parcel.writeString(this.f116779f);
    }
}
