package com.avito.android.categories_global;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CategoriesGlobalDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/categories_global/CategoriesGlobalDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-global_categories-global_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CategoriesGlobalDeepLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<CategoriesGlobalDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f116305b;

    /* compiled from: CategoriesGlobalDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoriesGlobalDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final CategoriesGlobalDeepLink createFromParcel(Parcel parcel) {
            return new CategoriesGlobalDeepLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CategoriesGlobalDeepLink[] newArray(int i12) {
            return new CategoriesGlobalDeepLink[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CategoriesGlobalDeepLink() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CategoriesGlobalDeepLink) && L.f(this.f116305b, ((CategoriesGlobalDeepLink) obj).f116305b);
    }

    public final int hashCode() {
        String str = this.f116305b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("CategoriesGlobalDeepLink(categoryId="), this.f116305b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f116305b);
    }

    public /* synthetic */ CategoriesGlobalDeepLink(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str);
    }

    public CategoriesGlobalDeepLink(@Y61.l String str) {
        this.f116305b = str;
    }
}
