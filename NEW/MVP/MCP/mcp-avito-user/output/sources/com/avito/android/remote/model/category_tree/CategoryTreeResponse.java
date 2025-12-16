package com.avito.android.remote.model.category_tree;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryTreeResponse.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\nJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/category_tree/CategoryTreeResponse;", "Landroid/os/Parcelable;", "", "currentNodeId", "", "Lcom/avito/android/remote/model/category_tree/CategoryTreeNode;", "tree", "<init>", "(ILjava/util/List;)V", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/avito/android/remote/model/category_tree/CategoryTreeResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getCurrentNodeId", "Ljava/util/List;", "getTree", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CategoryTreeResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<CategoryTreeResponse> CREATOR = new Creator();

    @c("current")
    private final int currentNodeId;

    @c("items")
    @l
    private final List<CategoryTreeNode> tree;

    /* compiled from: CategoryTreeResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CategoryTreeResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CategoryTreeResponse createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            int i12 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = a.c(CategoryTreeNode.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new CategoryTreeResponse(i12, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CategoryTreeResponse[] newArray(int i12) {
            return new CategoryTreeResponse[i12];
        }
    }

    public CategoryTreeResponse(int i12, @l List<CategoryTreeNode> list) {
        this.currentNodeId = i12;
        this.tree = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoryTreeResponse copy$default(CategoryTreeResponse categoryTreeResponse, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = categoryTreeResponse.currentNodeId;
        }
        if ((i13 & 2) != 0) {
            list = categoryTreeResponse.tree;
        }
        return categoryTreeResponse.copy(i12, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrentNodeId() {
        return this.currentNodeId;
    }

    @l
    public final List<CategoryTreeNode> component2() {
        return this.tree;
    }

    @k
    public final CategoryTreeResponse copy(int currentNodeId, @l List<CategoryTreeNode> tree) {
        return new CategoryTreeResponse(currentNodeId, tree);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryTreeResponse)) {
            return false;
        }
        CategoryTreeResponse categoryTreeResponse = (CategoryTreeResponse) other;
        return this.currentNodeId == categoryTreeResponse.currentNodeId && L.f(this.tree, categoryTreeResponse.tree);
    }

    public final int getCurrentNodeId() {
        return this.currentNodeId;
    }

    @l
    public final List<CategoryTreeNode> getTree() {
        return this.tree;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.currentNodeId) * 31;
        List<CategoryTreeNode> list = this.tree;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryTreeResponse(currentNodeId=");
        sb2.append(this.currentNodeId);
        sb2.append(", tree=");
        return H.p(sb2, this.tree, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.currentNodeId);
        List<CategoryTreeNode> list = this.tree;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((CategoryTreeNode) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
