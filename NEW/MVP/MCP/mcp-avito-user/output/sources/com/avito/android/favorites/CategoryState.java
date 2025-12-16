package com.avito.android.favorites;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: CategoryState.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/CategoryState;", "Landroid/os/Parcelable;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CategoryState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CategoryState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f156206b;

    /* renamed from: c, reason: collision with root package name */
    public final int f156207c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f156208d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<CategoryChipable> f156209e;

    /* compiled from: CategoryState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryState> {
        @Override // android.os.Parcelable.Creator
        public final CategoryState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(CategoryChipable.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CategoryState(string, i12, numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryState[] newArray(int i12) {
            return new CategoryState[i12];
        }
    }

    public CategoryState() {
        this(null, 0, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CategoryState a(CategoryState categoryState, String str, int i12, ArrayList arrayList, int i13) {
        if ((i13 & 1) != 0) {
            str = categoryState.f156206b;
        }
        if ((i13 & 2) != 0) {
            i12 = categoryState.f156207c;
        }
        Integer num = (i13 & 4) != 0 ? categoryState.f156208d : null;
        List list = arrayList;
        if ((i13 & 8) != 0) {
            list = categoryState.f156209e;
        }
        categoryState.getClass();
        return new CategoryState(str, i12, num, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryState)) {
            return false;
        }
        CategoryState categoryState = (CategoryState) obj;
        return kotlin.jvm.internal.L.f(this.f156206b, categoryState.f156206b) && this.f156207c == categoryState.f156207c && kotlin.jvm.internal.L.f(this.f156208d, categoryState.f156208d) && kotlin.jvm.internal.L.f(this.f156209e, categoryState.f156209e);
    }

    public final int hashCode() {
        String str = this.f156206b;
        int iE2 = androidx.appcompat.app.r.e(this.f156207c, (str == null ? 0 : str.hashCode()) * 31, 31);
        Integer num = this.f156208d;
        return this.f156209e.hashCode() + ((iE2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryState(queryParam=");
        sb2.append(this.f156206b);
        sb2.append(", currentCategoryId=");
        sb2.append(this.f156207c);
        sb2.append(", pendingCategoryId=");
        sb2.append(this.f156208d);
        sb2.append(", categories=");
        return androidx.compose.foundation.H.p(sb2, this.f156209e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f156206b);
        parcel.writeInt(this.f156207c);
        Integer num = this.f156208d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Iterator itJ = com.akita.compose.theme.re23.style.C0.j(this.f156209e, parcel);
        while (itJ.hasNext()) {
            ((CategoryChipable) itJ.next()).writeToParcel(parcel, i12);
        }
    }

    public CategoryState(@Y61.l String str, int i12, @Y61.l Integer num, @Y61.k List<CategoryChipable> list) {
        this.f156206b = str;
        this.f156207c = i12;
        this.f156208d = num;
        this.f156209e = list;
    }

    public CategoryState(String str, int i12, Integer num, List list, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? C42784z0.f406748b : list);
    }
}
