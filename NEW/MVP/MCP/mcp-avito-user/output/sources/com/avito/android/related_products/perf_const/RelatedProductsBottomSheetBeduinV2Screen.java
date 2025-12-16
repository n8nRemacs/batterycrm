package com.avito.android.related_products.perf_const;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: RelatedProductsPerfConstants.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/related_products/perf_const/RelatedProductsBottomSheetBeduinV2Screen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes16.dex */
public final class RelatedProductsBottomSheetBeduinV2Screen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final RelatedProductsBottomSheetBeduinV2Screen f253005d = new RelatedProductsBottomSheetBeduinV2Screen();

    @k
    public static final Parcelable.Creator<RelatedProductsBottomSheetBeduinV2Screen> CREATOR = new a();

    /* compiled from: RelatedProductsPerfConstants.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RelatedProductsBottomSheetBeduinV2Screen> {
        @Override // android.os.Parcelable.Creator
        public final RelatedProductsBottomSheetBeduinV2Screen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return RelatedProductsBottomSheetBeduinV2Screen.f253005d;
        }

        @Override // android.os.Parcelable.Creator
        public final RelatedProductsBottomSheetBeduinV2Screen[] newArray(int i12) {
            return new RelatedProductsBottomSheetBeduinV2Screen[i12];
        }
    }

    public RelatedProductsBottomSheetBeduinV2Screen() {
        super("RelatedProductsBottomSheetBeduinV2", false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
