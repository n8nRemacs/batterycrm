package com.avito.android.category_with_params.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.category_with_params.entity.ListItem;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryWithParamsState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes12.dex */
public final /* data */ class CategoryWithParamsState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f117695b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<ListItem> f117696c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f117697d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f117698e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f117693f = new a(null);

    @k
    public static final Parcelable.Creator<CategoryWithParamsState> CREATOR = new b();

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final CategoryWithParamsState f117694g = new CategoryWithParamsState("", C42784z0.f406748b, false, false);

    /* compiled from: CategoryWithParamsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsState$a;", "", "<init>", "()V", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CategoryWithParamsState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CategoryWithParamsState> {
        @Override // android.os.Parcelable.Creator
        public final CategoryWithParamsState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(CategoryWithParamsState.class, parcel, arrayList, iL2, 1);
            }
            return new CategoryWithParamsState(string, arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryWithParamsState[] newArray(int i12) {
            return new CategoryWithParamsState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryWithParamsState(@k String str, @k List<? extends ListItem> list, boolean z12, boolean z13) {
        this.f117695b = str;
        this.f117696c = list;
        this.f117697d = z12;
        this.f117698e = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CategoryWithParamsState a(CategoryWithParamsState categoryWithParamsState, String str, AbstractList abstractList, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            str = categoryWithParamsState.f117695b;
        }
        List list = abstractList;
        if ((i12 & 2) != 0) {
            list = categoryWithParamsState.f117696c;
        }
        boolean z13 = (i12 & 8) != 0 ? categoryWithParamsState.f117698e : true;
        categoryWithParamsState.getClass();
        return new CategoryWithParamsState(str, list, z12, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryWithParamsState)) {
            return false;
        }
        CategoryWithParamsState categoryWithParamsState = (CategoryWithParamsState) obj;
        return L.f(this.f117695b, categoryWithParamsState.f117695b) && L.f(this.f117696c, categoryWithParamsState.f117696c) && this.f117697d == categoryWithParamsState.f117697d && this.f117698e == categoryWithParamsState.f117698e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f117698e) + r.i(H.e(this.f117695b.hashCode() * 31, 31, this.f117696c), 31, this.f117697d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryWithParamsState(title=");
        sb2.append(this.f117695b);
        sb2.append(", items=");
        sb2.append(this.f117696c);
        sb2.append(", itemsSelected=");
        sb2.append(this.f117697d);
        sb2.append(", loading=");
        return r.x(sb2, this.f117698e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f117695b);
        Iterator itJ = C0.j(this.f117696c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f117697d ? 1 : 0);
        parcel.writeInt(this.f117698e ? 1 : 0);
    }
}
