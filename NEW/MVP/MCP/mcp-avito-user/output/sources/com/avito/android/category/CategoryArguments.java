package com.avito.android.category;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.remote.model.Location;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CategoryArguments.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/CategoryArguments;", "Landroid/os/Parcelable;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CategoryArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CategoryArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Location f116451b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final TreeClickStreamParent f116452c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f116453d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f116454e;

    /* compiled from: CategoryArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryArguments> {
        @Override // android.os.Parcelable.Creator
        public final CategoryArguments createFromParcel(Parcel parcel) {
            return new CategoryArguments((Location) parcel.readParcelable(CategoryArguments.class.getClassLoader()), (TreeClickStreamParent) parcel.readParcelable(CategoryArguments.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryArguments[] newArray(int i12) {
            return new CategoryArguments[i12];
        }
    }

    public CategoryArguments() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryArguments)) {
            return false;
        }
        CategoryArguments categoryArguments = (CategoryArguments) obj;
        return L.f(this.f116451b, categoryArguments.f116451b) && L.f(this.f116452c, categoryArguments.f116452c) && L.f(this.f116453d, categoryArguments.f116453d);
    }

    public final int hashCode() {
        Location location = this.f116451b;
        int iHashCode = (location == null ? 0 : location.hashCode()) * 31;
        TreeClickStreamParent treeClickStreamParent = this.f116452c;
        int iHashCode2 = (iHashCode + (treeClickStreamParent == null ? 0 : treeClickStreamParent.hashCode())) * 31;
        String str = this.f116453d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryArguments(location=");
        sb2.append(this.f116451b);
        sb2.append(", treeParent=");
        sb2.append(this.f116452c);
        sb2.append(", categoryId=");
        return C22026a.c(sb2, this.f116453d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f116451b, i12);
        parcel.writeParcelable(this.f116452c, i12);
        parcel.writeString(this.f116453d);
    }

    public CategoryArguments(@Y61.l Location location, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.l String str) {
        this.f116451b = location;
        this.f116452c = treeClickStreamParent;
        this.f116453d = str;
    }

    public /* synthetic */ CategoryArguments(Location location, TreeClickStreamParent treeClickStreamParent, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : location, (i12 & 2) != 0 ? null : treeClickStreamParent, (i12 & 4) != 0 ? null : str);
    }
}
