package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MainSearchResult.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/MainSearchResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/CategorySearch;", "categories", "", "expandAll", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/MainSearchResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getCategories", "Ljava/lang/Boolean;", "getExpandAll", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MainSearchResult implements Parcelable {

    @k
    public static final Parcelable.Creator<MainSearchResult> CREATOR = new Creator();

    @c("categories")
    @l
    private final List<CategorySearch> categories;

    @c("expandAll")
    @l
    private final Boolean expandAll;

    /* compiled from: MainSearchResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MainSearchResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MainSearchResult createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(CategorySearch.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MainSearchResult(arrayList, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MainSearchResult[] newArray(int i12) {
            return new MainSearchResult[i12];
        }
    }

    public MainSearchResult(@l List<CategorySearch> list, @l Boolean bool) {
        this.categories = list;
        this.expandAll = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MainSearchResult copy$default(MainSearchResult mainSearchResult, List list, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = mainSearchResult.categories;
        }
        if ((i12 & 2) != 0) {
            bool = mainSearchResult.expandAll;
        }
        return mainSearchResult.copy(list, bool);
    }

    @l
    public final List<CategorySearch> component1() {
        return this.categories;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getExpandAll() {
        return this.expandAll;
    }

    @k
    public final MainSearchResult copy(@l List<CategorySearch> categories, @l Boolean expandAll) {
        return new MainSearchResult(categories, expandAll);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainSearchResult)) {
            return false;
        }
        MainSearchResult mainSearchResult = (MainSearchResult) other;
        return L.f(this.categories, mainSearchResult.categories) && L.f(this.expandAll, mainSearchResult.expandAll);
    }

    @l
    public final List<CategorySearch> getCategories() {
        return this.categories;
    }

    @l
    public final Boolean getExpandAll() {
        return this.expandAll;
    }

    public int hashCode() {
        List<CategorySearch> list = this.categories;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.expandAll;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MainSearchResult(categories=");
        sb2.append(this.categories);
        sb2.append(", expandAll=");
        return C0.g(sb2, this.expandAll, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<CategorySearch> list = this.categories;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((CategorySearch) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Boolean bool = this.expandAll;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ MainSearchResult(List list, Boolean bool, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : bool);
    }
}
