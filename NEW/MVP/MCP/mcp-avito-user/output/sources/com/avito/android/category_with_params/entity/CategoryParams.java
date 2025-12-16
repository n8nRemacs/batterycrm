package com.avito.android.category_with_params.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryParams.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_with_params/entity/CategoryParams;", "Landroid/os/Parcelable;", "_avito_category-with-params_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CategoryParams implements Parcelable {

    @k
    public static final Parcelable.Creator<CategoryParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f117672b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractList f117673c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<List<String>> f117674d;

    /* compiled from: CategoryParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryParams> {
        @Override // android.os.Parcelable.Creator
        public final CategoryParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(CategoryParams.class, parcel, arrayList, iL2, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList2.add(parcel.createStringArrayList());
            }
            return new CategoryParams(string, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryParams[] newArray(int i12) {
            return new CategoryParams[i12];
        }
    }

    public CategoryParams(@k String str, @k AbstractList abstractList, @k List list) {
        this.f117672b = str;
        this.f117673c = abstractList;
        this.f117674d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryParams)) {
            return false;
        }
        CategoryParams categoryParams = (CategoryParams) obj;
        return L.f(this.f117672b, categoryParams.f117672b) && L.f(this.f117673c, categoryParams.f117673c) && L.f(this.f117674d, categoryParams.f117674d);
    }

    public final int hashCode() {
        return this.f117674d.hashCode() + ((this.f117673c.hashCode() + (this.f117672b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryParams(title=");
        sb2.append(this.f117672b);
        sb2.append(", items=");
        sb2.append(this.f117673c);
        sb2.append(", groupedIds=");
        return H.p(sb2, this.f117674d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f117672b);
        AbstractList abstractList = this.f117673c;
        parcel.writeInt(abstractList.size());
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i12);
        }
        Iterator itJ = C0.j(this.f117674d, parcel);
        while (itJ.hasNext()) {
            parcel.writeStringList((List) itJ.next());
        }
    }
}
