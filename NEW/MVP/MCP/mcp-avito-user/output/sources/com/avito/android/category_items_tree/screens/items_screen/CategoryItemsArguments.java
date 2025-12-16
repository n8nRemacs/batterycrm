package com.avito.android.category_items_tree.screens.items_screen;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryItemsArguments.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/CategoryItemsArguments;", "Landroid/os/Parcelable;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CategoryItemsArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CategoryItemsArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f116795b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f116796c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f116797d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f116798e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f116799f;

    /* compiled from: CategoryItemsArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryItemsArguments> {
        @Override // android.os.Parcelable.Creator
        public final CategoryItemsArguments createFromParcel(Parcel parcel) {
            return new CategoryItemsArguments(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryItemsArguments[] newArray(int i12) {
            return new CategoryItemsArguments[i12];
        }
    }

    public CategoryItemsArguments(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5) {
        this.f116795b = str;
        this.f116796c = str2;
        this.f116797d = str3;
        this.f116798e = str4;
        this.f116799f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryItemsArguments)) {
            return false;
        }
        CategoryItemsArguments categoryItemsArguments = (CategoryItemsArguments) obj;
        return L.f(this.f116795b, categoryItemsArguments.f116795b) && L.f(this.f116796c, categoryItemsArguments.f116796c) && L.f(this.f116797d, categoryItemsArguments.f116797d) && L.f(this.f116798e, categoryItemsArguments.f116798e) && L.f(this.f116799f, categoryItemsArguments.f116799f);
    }

    public final int hashCode() {
        int iHashCode = this.f116795b.hashCode() * 31;
        String str = this.f116796c;
        return this.f116799f.hashCode() + H.d(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f116797d), 31, this.f116798e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryItemsArguments(promoType=");
        sb2.append(this.f116795b);
        sb2.append(", promoTypeId=");
        sb2.append(this.f116796c);
        sb2.append(", title=");
        sb2.append(this.f116797d);
        sb2.append(", categoryId=");
        sb2.append(this.f116798e);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f116799f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f116795b);
        parcel.writeString(this.f116796c);
        parcel.writeString(this.f116797d);
        parcel.writeString(this.f116798e);
        parcel.writeString(this.f116799f);
    }
}
