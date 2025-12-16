package com.avito.android.rubricator.list.category.mvi.entity;

import K51.d;
import X41.g;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.H0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.rubricator.list.category.model.CategoryListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryListState.kt */
@H0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rubricator/list/category/mvi/entity/CategoriesList;", "Landroid/os/Parcelable;", "list", "", "Lcom/avito/android/rubricator/list/category/model/CategoryListItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@g
/* loaded from: classes13.dex */
public final class CategoriesList implements Parcelable {

    @k
    public static final Parcelable.Creator<CategoriesList> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<CategoryListItem> f255931b;

    /* compiled from: CategoryListState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoriesList> {
        @Override // android.os.Parcelable.Creator
        public final CategoriesList createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(CategoryListItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return CategoriesList.a(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CategoriesList[] newArray(int i12) {
            return new CategoriesList[i12];
        }
    }

    private /* synthetic */ CategoriesList(List list) {
        this.f255931b = list;
    }

    public static final /* synthetic */ CategoriesList a(ArrayList arrayList) {
        return new CategoriesList(arrayList);
    }

    public static String b(List<? extends CategoryListItem> list) {
        return "CategoriesList(list=" + list + ')';
    }

    public static void c(List<? extends CategoryListItem> list, @k Parcel parcel, int i12) {
        Iterator itJ = C0.j(list, parcel);
        while (itJ.hasNext()) {
            ((CategoryListItem) itJ.next()).writeToParcel(parcel, i12);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CategoriesList) {
            return L.f(this.f255931b, ((CategoriesList) obj).f255931b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f255931b.hashCode();
    }

    public final String toString() {
        return b(this.f255931b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        c(this.f255931b, parcel, i12);
    }
}
