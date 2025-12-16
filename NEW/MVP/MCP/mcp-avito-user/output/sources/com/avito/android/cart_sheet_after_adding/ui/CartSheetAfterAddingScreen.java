package com.avito.android.cart_sheet_after_adding.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: Screens.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/ui/CartSheetAfterAddingScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes12.dex */
public final class CartSheetAfterAddingScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final CartSheetAfterAddingScreen f115482d = new CartSheetAfterAddingScreen();

    @Y61.k
    public static final Parcelable.Creator<CartSheetAfterAddingScreen> CREATOR = new a();

    /* compiled from: Screens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CartSheetAfterAddingScreen> {
        @Override // android.os.Parcelable.Creator
        public final CartSheetAfterAddingScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return CartSheetAfterAddingScreen.f115482d;
        }

        @Override // android.os.Parcelable.Creator
        public final CartSheetAfterAddingScreen[] newArray(int i12) {
            return new CartSheetAfterAddingScreen[i12];
        }
    }

    public CartSheetAfterAddingScreen() {
        super("CartSheetAfterAdding", false, 2, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
