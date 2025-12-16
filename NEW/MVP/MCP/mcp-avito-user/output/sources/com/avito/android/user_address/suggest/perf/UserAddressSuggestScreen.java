package com.avito.android.user_address.suggest.perf;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: UserAddressSuggestScreen.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/suggest/perf/UserAddressSuggestScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes4.dex */
public final class UserAddressSuggestScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final UserAddressSuggestScreen f308153d = new UserAddressSuggestScreen();

    @k
    public static final Parcelable.Creator<UserAddressSuggestScreen> CREATOR = new a();

    /* compiled from: UserAddressSuggestScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAddressSuggestScreen> {
        @Override // android.os.Parcelable.Creator
        public final UserAddressSuggestScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return UserAddressSuggestScreen.f308153d;
        }

        @Override // android.os.Parcelable.Creator
        public final UserAddressSuggestScreen[] newArray(int i12) {
            return new UserAddressSuggestScreen[i12];
        }
    }

    public UserAddressSuggestScreen() {
        super("UserAddressSuggest", false, 2, null);
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
