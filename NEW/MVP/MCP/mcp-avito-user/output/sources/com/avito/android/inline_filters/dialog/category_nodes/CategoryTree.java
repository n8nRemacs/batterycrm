package com.avito.android.inline_filters.dialog.category_nodes;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryTree.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/CategoryTree;", "Landroid/os/Parcelable;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CategoryTree implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CategoryTree> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f171391b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TreeNode f171392c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f171393d;

    /* compiled from: CategoryTree.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryTree> {
        @Override // android.os.Parcelable.Creator
        public final CategoryTree createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            TreeNode treeNodeCreateFromParcel = TreeNode.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(TreeNode.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CategoryTree(i12, treeNodeCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryTree[] newArray(int i12) {
            return new CategoryTree[i12];
        }
    }

    public CategoryTree(int i12, @Y61.k TreeNode treeNode, @Y61.k ArrayList arrayList) {
        this.f171391b = i12;
        this.f171392c = treeNode;
        this.f171393d = arrayList;
    }

    public static CategoryTree a(CategoryTree categoryTree, int i12) {
        TreeNode treeNode = categoryTree.f171392c;
        ArrayList arrayList = categoryTree.f171393d;
        categoryTree.getClass();
        return new CategoryTree(i12, treeNode, arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryTree)) {
            return false;
        }
        CategoryTree categoryTree = (CategoryTree) obj;
        return this.f171391b == categoryTree.f171391b && L.f(this.f171392c, categoryTree.f171392c) && this.f171393d.equals(categoryTree.f171393d);
    }

    public final int hashCode() {
        return this.f171393d.hashCode() + ((this.f171392c.hashCode() + (Integer.hashCode(this.f171391b) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryTree(selectedId=");
        sb2.append(this.f171391b);
        sb2.append(", root=");
        sb2.append(this.f171392c);
        sb2.append(", nodes=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f171393d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f171391b);
        this.f171392c.writeToParcel(parcel, i12);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f171393d, parcel);
        while (itZ.hasNext()) {
            ((TreeNode) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
