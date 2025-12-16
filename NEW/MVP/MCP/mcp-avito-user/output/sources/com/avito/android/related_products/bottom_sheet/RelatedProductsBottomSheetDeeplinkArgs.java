package com.avito.android.related_products.bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RelatedProductsBottomSheetDeeplinkArgs.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetDeeplinkArgs;", "Landroid/os/Parcelable;", "_avito_related-products_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RelatedProductsBottomSheetDeeplinkArgs implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RelatedProductsBottomSheetDeeplinkArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<String> f252826b;

    /* compiled from: RelatedProductsBottomSheetDeeplinkArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RelatedProductsBottomSheetDeeplinkArgs> {
        @Override // android.os.Parcelable.Creator
        public final RelatedProductsBottomSheetDeeplinkArgs createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashSet.add(parcel.readString());
            }
            return new RelatedProductsBottomSheetDeeplinkArgs(linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final RelatedProductsBottomSheetDeeplinkArgs[] newArray(int i12) {
            return new RelatedProductsBottomSheetDeeplinkArgs[i12];
        }
    }

    public RelatedProductsBottomSheetDeeplinkArgs(@Y61.k Set<String> set) {
        this.f252826b = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelatedProductsBottomSheetDeeplinkArgs) && L.f(this.f252826b, ((RelatedProductsBottomSheetDeeplinkArgs) obj).f252826b);
    }

    public final int hashCode() {
        return this.f252826b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return AK.c.u(new StringBuilder("RelatedProductsBottomSheetDeeplinkArgs(beduinV2Components="), this.f252826b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Set<String> set = this.f252826b;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
    }
}
