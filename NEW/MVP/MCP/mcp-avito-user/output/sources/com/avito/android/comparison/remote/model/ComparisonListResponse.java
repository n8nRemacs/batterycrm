package com.avito.android.comparison.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonListResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/comparison/remote/model/ComparisonListResponse;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/comparison/remote/model/ComparisonCategoryItem;", "comparisons", "Lcom/avito/android/comparison/remote/model/EmptyStateInfo;", "emptyStateInfo", "<init>", "(Ljava/util/List;Lcom/avito/android/comparison/remote/model/EmptyStateInfo;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/comparison/remote/model/EmptyStateInfo;", "d", "()Lcom/avito/android/comparison/remote/model/EmptyStateInfo;", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ComparisonListResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<ComparisonListResponse> CREATOR = new a();

    @c("comparisons")
    @l
    private final List<ComparisonCategoryItem> comparisons;

    @c("emptyStateInfo")
    @l
    private final EmptyStateInfo emptyStateInfo;

    /* compiled from: ComparisonListResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComparisonListResponse> {
        @Override // android.os.Parcelable.Creator
        public final ComparisonListResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ComparisonCategoryItem.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new ComparisonListResponse(arrayList, parcel.readInt() != 0 ? EmptyStateInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ComparisonListResponse[] newArray(int i12) {
            return new ComparisonListResponse[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonListResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @l
    public final List<ComparisonCategoryItem> c() {
        return this.comparisons;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final EmptyStateInfo getEmptyStateInfo() {
        return this.emptyStateInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparisonListResponse)) {
            return false;
        }
        ComparisonListResponse comparisonListResponse = (ComparisonListResponse) obj;
        return L.f(this.comparisons, comparisonListResponse.comparisons) && L.f(this.emptyStateInfo, comparisonListResponse.emptyStateInfo);
    }

    public final int hashCode() {
        List<ComparisonCategoryItem> list = this.comparisons;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        EmptyStateInfo emptyStateInfo = this.emptyStateInfo;
        return iHashCode + (emptyStateInfo != null ? emptyStateInfo.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ComparisonListResponse(comparisons=" + this.comparisons + ", emptyStateInfo=" + this.emptyStateInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<ComparisonCategoryItem> list = this.comparisons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((ComparisonCategoryItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        EmptyStateInfo emptyStateInfo = this.emptyStateInfo;
        if (emptyStateInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            emptyStateInfo.writeToParcel(parcel, i12);
        }
    }

    public ComparisonListResponse(@l List<ComparisonCategoryItem> list, @l EmptyStateInfo emptyStateInfo) {
        this.comparisons = list;
        this.emptyStateInfo = emptyStateInfo;
    }

    public /* synthetic */ ComparisonListResponse(List list, EmptyStateInfo emptyStateInfo, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? null : emptyStateInfo);
    }
}
