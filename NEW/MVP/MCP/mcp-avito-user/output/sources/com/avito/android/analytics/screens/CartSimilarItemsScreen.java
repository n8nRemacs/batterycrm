package com.avito.android.analytics.screens;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ScreenPublicConsts.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/CartSimilarItemsScreen;", "Lcom/avito/android/analytics/screens/Screen;", "_avito-discouraged_analytics-screens_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"PerformanceScreenHasNoOwner"})
/* loaded from: classes11.dex */
public final /* data */ class CartSimilarItemsScreen extends Screen {

    @Y61.k
    public static final Parcelable.Creator<CartSimilarItemsScreen> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f90313d;

    /* compiled from: ScreenPublicConsts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CartSimilarItemsScreen> {
        @Override // android.os.Parcelable.Creator
        public final CartSimilarItemsScreen createFromParcel(Parcel parcel) {
            return new CartSimilarItemsScreen(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CartSimilarItemsScreen[] newArray(int i12) {
            return new CartSimilarItemsScreen[i12];
        }
    }

    public CartSimilarItemsScreen(@Y61.k String str) {
        super(str, false, 2, null);
        this.f90313d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CartSimilarItemsScreen) && L.f(this.f90313d, ((CartSimilarItemsScreen) obj).f90313d);
    }

    public final int hashCode() {
        return this.f90313d.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("CartSimilarItemsScreen(remoteScreenName="), this.f90313d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f90313d);
    }
}
