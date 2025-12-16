package com.avito.android.category_items_tree;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TreeDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_items_tree/TreeDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_category-items-tree_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class TreeDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TreeDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f116780b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f116781c;

    /* compiled from: TreeDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TreeDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final TreeDeepLink createFromParcel(Parcel parcel) {
            return new TreeDeepLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TreeDeepLink[] newArray(int i12) {
            return new TreeDeepLink[i12];
        }
    }

    public TreeDeepLink(@k String str, @l String str2) {
        this.f116780b = str;
        this.f116781c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TreeDeepLink)) {
            return false;
        }
        TreeDeepLink treeDeepLink = (TreeDeepLink) obj;
        return L.f(this.f116780b, treeDeepLink.f116780b) && L.f(this.f116781c, treeDeepLink.f116781c);
    }

    public final int hashCode() {
        int iHashCode = this.f116780b.hashCode() * 31;
        String str = this.f116781c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TreeDeepLink(promoType=");
        sb2.append(this.f116780b);
        sb2.append(", promoTypeId=");
        return C22026a.c(sb2, this.f116781c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f116780b);
        parcel.writeString(this.f116781c);
    }
}
