package com.avito.android.inline_filters.category_nodes;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CategoryTreeLink.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/category_nodes/CategoryTreeLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class CategoryTreeLink extends DeepLink implements Parcelable {

    @k
    public static final Parcelable.Creator<CategoryTreeLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SearchParams f171068b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PresentationType f171069c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f171070d;

    /* compiled from: CategoryTreeLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryTreeLink> {
        @Override // android.os.Parcelable.Creator
        public final CategoryTreeLink createFromParcel(Parcel parcel) {
            SearchParams searchParams = (SearchParams) parcel.readParcelable(CategoryTreeLink.class.getClassLoader());
            Boolean boolValueOf = null;
            PresentationType presentationTypeValueOf = parcel.readInt() == 0 ? null : PresentationType.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CategoryTreeLink(searchParams, presentationTypeValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryTreeLink[] newArray(int i12) {
            return new CategoryTreeLink[i12];
        }
    }

    public /* synthetic */ CategoryTreeLink(SearchParams searchParams, PresentationType presentationType, Boolean bool, int i12, C42822w c42822w) {
        this(searchParams, (i12 & 2) != 0 ? null : presentationType, (i12 & 4) != 0 ? null : bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryTreeLink)) {
            return false;
        }
        CategoryTreeLink categoryTreeLink = (CategoryTreeLink) obj;
        return L.f(this.f171068b, categoryTreeLink.f171068b) && this.f171069c == categoryTreeLink.f171069c && L.f(this.f171070d, categoryTreeLink.f171070d);
    }

    public final int hashCode() {
        int iHashCode = this.f171068b.hashCode() * 31;
        PresentationType presentationType = this.f171069c;
        int iHashCode2 = (iHashCode + (presentationType == null ? 0 : presentationType.hashCode())) * 31;
        Boolean bool = this.f171070d;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryTreeLink(searchParams=");
        sb2.append(this.f171068b);
        sb2.append(", presentationType=");
        sb2.append(this.f171069c);
        sb2.append(", truncateToSubtree=");
        return C0.g(sb2, this.f171070d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f171068b, i12);
        PresentationType presentationType = this.f171069c;
        if (presentationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(presentationType.name());
        }
        Boolean bool = this.f171070d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public CategoryTreeLink(@k SearchParams searchParams, @l PresentationType presentationType, @l Boolean bool) {
        this.f171068b = searchParams;
        this.f171069c = presentationType;
        this.f171070d = bool;
    }
}
