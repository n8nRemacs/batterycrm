package com.avito.android.analytics.screens;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: UserAdvertsScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/UserAdvertsScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito-discouraged_analytics-screens_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes11.dex */
public final class UserAdvertsScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final UserAdvertsScreen f90543d = new UserAdvertsScreen();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final String f90544e = "advertisements";

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final String f90545f = "adverts-list";

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final String f90546g = "seller-adverts-search";

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final String f90547h = "seller-adverts-search-result";

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final String f90548i = "seller-adverts-select";

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final String f90549j = "seller-adverts-actions";

    @Y61.k
    public static final Parcelable.Creator<UserAdvertsScreen> CREATOR = new a();

    /* compiled from: UserAdvertsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertsScreen> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return UserAdvertsScreen.f90543d;
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsScreen[] newArray(int i12) {
            return new UserAdvertsScreen[i12];
        }
    }

    public UserAdvertsScreen() {
        super("AuthorizedUserAccount", false);
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
