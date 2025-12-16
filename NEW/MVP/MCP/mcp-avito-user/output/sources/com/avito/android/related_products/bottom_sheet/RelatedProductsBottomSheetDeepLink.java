package com.avito.android.related_products.bottom_sheet;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: RelatedProductsBottomSheetDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_related-products_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes16.dex */
public final /* data */ class RelatedProductsBottomSheetDeepLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<RelatedProductsBottomSheetDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f252820b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLink f252821c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f252822d;

    /* compiled from: RelatedProductsBottomSheetDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RelatedProductsBottomSheetDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final RelatedProductsBottomSheetDeepLink createFromParcel(Parcel parcel) {
            return new RelatedProductsBottomSheetDeepLink(parcel.readLong(), (DeepLink) parcel.readParcelable(RelatedProductsBottomSheetDeepLink.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RelatedProductsBottomSheetDeepLink[] newArray(int i12) {
            return new RelatedProductsBottomSheetDeepLink[i12];
        }
    }

    /* compiled from: RelatedProductsBottomSheetDeepLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetDeepLink$b;", "", "a", "b", "c", "Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetDeepLink$b$a;", "Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetDeepLink$b$b;", "Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetDeepLink$b$c;", "_avito_related-products_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: RelatedProductsBottomSheetDeepLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetDeepLink$b$a;", "Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetDeepLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_related-products_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f252823b = new a();
        }

        /* compiled from: RelatedProductsBottomSheetDeepLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetDeepLink$b$b;", "Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetDeepLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_related-products_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetDeepLink$b$b, reason: collision with other inner class name */
        public static final class C7594b implements b, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C7594b f252824b = new C7594b();
        }

        /* compiled from: RelatedProductsBottomSheetDeepLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetDeepLink$b$c;", "Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetDeepLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_related-products_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f252825b = new c();
        }
    }

    public RelatedProductsBottomSheetDeepLink(long j12, @Y61.l DeepLink deepLink, @Y61.l String str) {
        this.f252820b = j12;
        this.f252821c = deepLink;
        this.f252822d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedProductsBottomSheetDeepLink)) {
            return false;
        }
        RelatedProductsBottomSheetDeepLink relatedProductsBottomSheetDeepLink = (RelatedProductsBottomSheetDeepLink) obj;
        return this.f252820b == relatedProductsBottomSheetDeepLink.f252820b && L.f(this.f252821c, relatedProductsBottomSheetDeepLink.f252821c) && L.f(this.f252822d, relatedProductsBottomSheetDeepLink.f252822d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f252820b) * 31;
        DeepLink deepLink = this.f252821c;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.f252822d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelatedProductsBottomSheetDeepLink(itemId=");
        sb2.append(this.f252820b);
        sb2.append(", onFailure=");
        sb2.append(this.f252821c);
        sb2.append(", context=");
        return C22026a.c(sb2, this.f252822d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f252820b);
        parcel.writeParcelable(this.f252821c, i12);
        parcel.writeString(this.f252822d);
    }
}
