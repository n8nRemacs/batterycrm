package com.avito.android.inline_filters.dialog.category_nodes;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CategoryTree.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/TreeNode;", "Landroid/os/Parcelable;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TreeNode implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<TreeNode> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f171394b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DeepLink f171395c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f171396d;

    /* renamed from: e, reason: collision with root package name */
    public final int f171397e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f171398f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f171399g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f171400h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f171401i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f171402j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f171403k;

    /* compiled from: CategoryTree.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TreeNode> {
        @Override // android.os.Parcelable.Creator
        public final TreeNode createFromParcel(Parcel parcel) {
            return new TreeNode(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (DeepLink) parcel.readParcelable(TreeNode.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), (UniversalImage) parcel.readParcelable(TreeNode.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TreeNode[] newArray(int i12) {
            return new TreeNode[i12];
        }
    }

    public TreeNode(@Y61.l Integer num, @Y61.k DeepLink deepLink, boolean z12, int i12, @Y61.l Integer num2, @Y61.k String str, @Y61.l Integer num3, @Y61.l String str2, @Y61.l UniversalImage universalImage, @Y61.l String str3) {
        this.f171394b = num;
        this.f171395c = deepLink;
        this.f171396d = z12;
        this.f171397e = i12;
        this.f171398f = num2;
        this.f171399g = str;
        this.f171400h = num3;
        this.f171401i = str2;
        this.f171402j = universalImage;
        this.f171403k = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TreeNode)) {
            return false;
        }
        TreeNode treeNode = (TreeNode) obj;
        return L.f(this.f171394b, treeNode.f171394b) && L.f(this.f171395c, treeNode.f171395c) && this.f171396d == treeNode.f171396d && this.f171397e == treeNode.f171397e && L.f(this.f171398f, treeNode.f171398f) && L.f(this.f171399g, treeNode.f171399g) && L.f(this.f171400h, treeNode.f171400h) && L.f(this.f171401i, treeNode.f171401i) && L.f(this.f171402j, treeNode.f171402j) && L.f(this.f171403k, treeNode.f171403k);
    }

    public final int hashCode() {
        Integer num = this.f171394b;
        int iE2 = androidx.appcompat.app.r.e(this.f171397e, androidx.appcompat.app.r.i(com.avito.android.actions_sheet.a.e(this.f171395c, (num == null ? 0 : num.hashCode()) * 31, 31), 31, this.f171396d), 31);
        Integer num2 = this.f171398f;
        int iD2 = H.d((iE2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f171399g);
        Integer num3 = this.f171400h;
        int iHashCode = (iD2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f171401i;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UniversalImage universalImage = this.f171402j;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str2 = this.f171403k;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TreeNode(categoryId=");
        sb2.append(this.f171394b);
        sb2.append(", deeplink=");
        sb2.append(this.f171395c);
        sb2.append(", default=");
        sb2.append(this.f171396d);
        sb2.append(", id=");
        sb2.append(this.f171397e);
        sb2.append(", microCategoryId=");
        sb2.append(this.f171398f);
        sb2.append(", title=");
        sb2.append(this.f171399g);
        sb2.append(", parentId=");
        sb2.append(this.f171400h);
        sb2.append(", iconUrl=");
        sb2.append(this.f171401i);
        sb2.append(", categoryImage=");
        sb2.append(this.f171402j);
        sb2.append(", categoryImageBackgroundColor=");
        return C22026a.c(sb2, this.f171403k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Integer num = this.f171394b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f171395c, i12);
        parcel.writeInt(this.f171396d ? 1 : 0);
        parcel.writeInt(this.f171397e);
        Integer num2 = this.f171398f;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeString(this.f171399g);
        Integer num3 = this.f171400h;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        parcel.writeString(this.f171401i);
        parcel.writeParcelable(this.f171402j, i12);
        parcel.writeString(this.f171403k);
    }

    public /* synthetic */ TreeNode(Integer num, DeepLink deepLink, boolean z12, int i12, Integer num2, String str, Integer num3, String str2, UniversalImage universalImage, String str3, int i13, C42822w c42822w) {
        this(num, deepLink, z12, i12, num2, str, num3, str2, (i13 & 256) != 0 ? null : universalImage, (i13 & 512) != 0 ? null : str3);
    }
}
