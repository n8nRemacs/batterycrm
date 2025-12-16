package com.avito.android.rubricator.list.category.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.rubricator.list.category.model.CategoryListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CategoryListState.kt */
@d
@H0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rB3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rubricator/list/category/mvi/entity/CategoryListState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "Lcom/avito/android/rubricator/list/category/mvi/entity/CategoriesList;", "list", "filteredList", "", "title", "", "isKeyboardVisible", "query", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/internal/w;)V", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CategoryListState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<? extends CategoryListItem> f255933b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<? extends CategoryListItem> f255934c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f255935d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f255936e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f255937f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f255932g = new a(null);

    @k
    public static final Parcelable.Creator<CategoryListState> CREATOR = new b();

    /* compiled from: CategoryListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rubricator/list/category/mvi/entity/CategoryListState$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CategoryListState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CategoryListState> {
        @Override // android.os.Parcelable.Creator
        public final CategoryListState createFromParcel(Parcel parcel) {
            Parcelable.Creator<CategoriesList> creator = CategoriesList.CREATOR;
            List<CategoryListItem> list = creator.createFromParcel(parcel).f255931b;
            CategoriesList categoriesListCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            return new CategoryListState(list, categoriesListCreateFromParcel != null ? categoriesListCreateFromParcel.f255931b : null, parcel.readString(), parcel.readInt() != 0, parcel.readString(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryListState[] newArray(int i12) {
            return new CategoryListState[i12];
        }
    }

    public CategoryListState() {
        throw null;
    }

    public /* synthetic */ CategoryListState(List list, List list2, String str, boolean z12, String str2, int i12, C42822w c42822w) {
        this(list, list2, str, z12, (i12 & 16) != 0 ? "" : str2, null);
    }

    public static CategoryListState a(CategoryListState categoryListState, List list, List list2, boolean z12, String str, int i12) {
        if ((i12 & 1) != 0) {
            list = categoryListState.f255933b;
        }
        List list3 = list;
        if ((i12 & 2) != 0) {
            list2 = categoryListState.f255934c;
        }
        List list4 = list2;
        String str2 = categoryListState.f255935d;
        if ((i12 & 8) != 0) {
            z12 = categoryListState.f255936e;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            str = categoryListState.f255937f;
        }
        categoryListState.getClass();
        return new CategoryListState(list3, list4, str2, z13, str, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(@Y61.l java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.avito.android.rubricator.list.category.mvi.entity.CategoryListState
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.avito.android.rubricator.list.category.mvi.entity.CategoryListState r5 = (com.avito.android.rubricator.list.category.mvi.entity.CategoryListState) r5
            java.util.List<? extends com.avito.android.rubricator.list.category.model.CategoryListItem> r1 = r5.f255933b
            android.os.Parcelable$Creator<com.avito.android.rubricator.list.category.mvi.entity.CategoriesList> r3 = com.avito.android.rubricator.list.category.mvi.entity.CategoriesList.CREATOR
            java.util.List<? extends com.avito.android.rubricator.list.category.model.CategoryListItem> r3 = r4.f255933b
            boolean r1 = kotlin.jvm.internal.L.f(r3, r1)
            if (r1 != 0) goto L19
            return r2
        L19:
            java.util.List<? extends com.avito.android.rubricator.list.category.model.CategoryListItem> r1 = r4.f255934c
            java.util.List<? extends com.avito.android.rubricator.list.category.model.CategoryListItem> r3 = r5.f255934c
            if (r1 != 0) goto L25
            if (r3 != 0) goto L23
            r1 = r0
            goto L2c
        L23:
            r1 = r2
            goto L2c
        L25:
            if (r3 != 0) goto L28
            goto L23
        L28:
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
        L2c:
            if (r1 != 0) goto L2f
            return r2
        L2f:
            java.lang.String r1 = r4.f255935d
            java.lang.String r3 = r5.f255935d
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 != 0) goto L3a
            return r2
        L3a:
            boolean r1 = r4.f255936e
            boolean r3 = r5.f255936e
            if (r1 == r3) goto L41
            return r2
        L41:
            java.lang.String r1 = r4.f255937f
            java.lang.String r5 = r5.f255937f
            boolean r5 = kotlin.jvm.internal.L.f(r1, r5)
            if (r5 != 0) goto L4c
            return r2
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rubricator.list.category.mvi.entity.CategoryListState.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Parcelable.Creator<CategoriesList> creator = CategoriesList.CREATOR;
        int iHashCode = this.f255933b.hashCode() * 31;
        List<? extends CategoryListItem> list = this.f255934c;
        return this.f255937f.hashCode() + r.i(H.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.f255935d), 31, this.f255936e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryListState(list=");
        sb2.append((Object) CategoriesList.b(this.f255933b));
        sb2.append(", filteredList=");
        List<? extends CategoryListItem> list = this.f255934c;
        sb2.append((Object) (list == null ? "null" : CategoriesList.b(list)));
        sb2.append(", title=");
        sb2.append(this.f255935d);
        sb2.append(", isKeyboardVisible=");
        sb2.append(this.f255936e);
        sb2.append(", query=");
        return C22026a.c(sb2, this.f255937f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        CategoriesList.c(this.f255933b, parcel, i12);
        List<? extends CategoryListItem> list = this.f255934c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            CategoriesList.c(list, parcel, i12);
        }
        parcel.writeString(this.f255935d);
        parcel.writeInt(this.f255936e ? 1 : 0);
        parcel.writeString(this.f255937f);
    }

    public CategoryListState(List list, List list2, String str, boolean z12, String str2, C42822w c42822w) {
        this.f255933b = list;
        this.f255934c = list2;
        this.f255935d = str;
        this.f255936e = z12;
        this.f255937f = str2;
    }
}
