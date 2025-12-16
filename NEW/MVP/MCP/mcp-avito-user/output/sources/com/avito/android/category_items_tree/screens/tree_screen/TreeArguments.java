package com.avito.android.category_items_tree.screens.tree_screen;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TreeArguments.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_items_tree/screens/tree_screen/TreeArguments;", "Landroid/os/Parcelable;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TreeArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<TreeArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f117020b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f117021c;

    /* compiled from: TreeArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TreeArguments> {
        @Override // android.os.Parcelable.Creator
        public final TreeArguments createFromParcel(Parcel parcel) {
            return new TreeArguments(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TreeArguments[] newArray(int i12) {
            return new TreeArguments[i12];
        }
    }

    public TreeArguments(@Y61.k String str, @Y61.l String str2) {
        this.f117020b = str;
        this.f117021c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TreeArguments)) {
            return false;
        }
        TreeArguments treeArguments = (TreeArguments) obj;
        return L.f(this.f117020b, treeArguments.f117020b) && L.f(this.f117021c, treeArguments.f117021c);
    }

    public final int hashCode() {
        int iHashCode = this.f117020b.hashCode() * 31;
        String str = this.f117021c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TreeArguments(promoType=");
        sb2.append(this.f117020b);
        sb2.append(", promoTypeId=");
        return C22026a.c(sb2, this.f117021c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f117020b);
        parcel.writeString(this.f117021c);
    }
}
