package com.avito.android.vas_discount.v2;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: VasDiscountV2Screen.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_discount/v2/VasDiscountV2Screen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes5.dex */
public final class VasDiscountV2Screen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final VasDiscountV2Screen f319746d = new VasDiscountV2Screen();

    @k
    public static final Parcelable.Creator<VasDiscountV2Screen> CREATOR = new a();

    /* compiled from: VasDiscountV2Screen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasDiscountV2Screen> {
        @Override // android.os.Parcelable.Creator
        public final VasDiscountV2Screen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return VasDiscountV2Screen.f319746d;
        }

        @Override // android.os.Parcelable.Creator
        public final VasDiscountV2Screen[] newArray(int i12) {
            return new VasDiscountV2Screen[i12];
        }
    }

    public VasDiscountV2Screen() {
        super("VasDiscountMvi", false, 2, null);
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
