package com.avito.android.loyalty.ui;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: LoyaltyScreens.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/BadgeDetailsV3Screen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes14.dex */
public final class BadgeDetailsV3Screen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final BadgeDetailsV3Screen f183245d = new BadgeDetailsV3Screen();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f183246e = "details";

    @k
    public static final Parcelable.Creator<BadgeDetailsV3Screen> CREATOR = new a();

    /* compiled from: LoyaltyScreens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BadgeDetailsV3Screen> {
        @Override // android.os.Parcelable.Creator
        public final BadgeDetailsV3Screen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return BadgeDetailsV3Screen.f183245d;
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeDetailsV3Screen[] newArray(int i12) {
            return new BadgeDetailsV3Screen[i12];
        }
    }

    public BadgeDetailsV3Screen() {
        super("BadgeDetailsV3", false, 2, null);
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
