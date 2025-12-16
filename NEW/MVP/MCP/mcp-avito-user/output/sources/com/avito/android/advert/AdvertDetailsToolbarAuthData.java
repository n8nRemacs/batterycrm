package com.avito.android.advert;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: AdvertDetailsToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/AdvertDetailsToolbarAuthData;", "Landroid/os/Parcelable;", "ComparisonButton", "Lcom/avito/android/advert/AdvertDetailsToolbarAuthData$ComparisonButton;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface AdvertDetailsToolbarAuthData extends Parcelable {

    /* compiled from: AdvertDetailsToolbarPresenter.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/AdvertDetailsToolbarAuthData$ComparisonButton;", "Lcom/avito/android/advert/AdvertDetailsToolbarAuthData;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class ComparisonButton implements AdvertDetailsToolbarAuthData {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final ComparisonButton f68532b = new ComparisonButton();

        @Y61.k
        public static final Parcelable.Creator<ComparisonButton> CREATOR = new a();

        /* compiled from: AdvertDetailsToolbarPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ComparisonButton> {
            @Override // android.os.Parcelable.Creator
            public final ComparisonButton createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ComparisonButton.f68532b;
            }

            @Override // android.os.Parcelable.Creator
            public final ComparisonButton[] newArray(int i12) {
                return new ComparisonButton[i12];
            }
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
}
