package com.avito.android.rubricator.list.category.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.vertical_main.RubricatorWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryListArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/list/category/model/CategoryListArguments;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CategoryListArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<CategoryListArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f255916b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<RubricatorWidget.RubricatorWidgetAction> f255917c;

    /* compiled from: CategoryListArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryListArguments> {
        @Override // android.os.Parcelable.Creator
        public final CategoryListArguments createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(CategoryListArguments.class, parcel, arrayList, iL2, 1);
            }
            return new CategoryListArguments(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryListArguments[] newArray(int i12) {
            return new CategoryListArguments[i12];
        }
    }

    public CategoryListArguments(@k String str, @k List<RubricatorWidget.RubricatorWidgetAction> list) {
        this.f255916b = str;
        this.f255917c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryListArguments)) {
            return false;
        }
        CategoryListArguments categoryListArguments = (CategoryListArguments) obj;
        return L.f(this.f255916b, categoryListArguments.f255916b) && L.f(this.f255917c, categoryListArguments.f255917c);
    }

    public final int hashCode() {
        return this.f255917c.hashCode() + (this.f255916b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryListArguments(title=");
        sb2.append(this.f255916b);
        sb2.append(", categories=");
        return H.p(sb2, this.f255917c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f255916b);
        Iterator itJ = C0.j(this.f255917c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
