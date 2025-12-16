package com.avito.android.user_viewed.screen.ui;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: UserViewedScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_viewed/screen/ui/UserViewedScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes5.dex */
public final class UserViewedScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final UserViewedScreen f318482d = new UserViewedScreen();

    @k
    public static final Parcelable.Creator<UserViewedScreen> CREATOR = new a();

    /* compiled from: UserViewedScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserViewedScreen> {
        @Override // android.os.Parcelable.Creator
        public final UserViewedScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return UserViewedScreen.f318482d;
        }

        @Override // android.os.Parcelable.Creator
        public final UserViewedScreen[] newArray(int i12) {
            return new UserViewedScreen[i12];
        }
    }

    public UserViewedScreen() {
        super("UserViewedScreen", false, 2, null);
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
