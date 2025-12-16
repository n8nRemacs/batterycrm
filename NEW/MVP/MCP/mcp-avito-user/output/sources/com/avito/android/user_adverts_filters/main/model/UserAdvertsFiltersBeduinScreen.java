package com.avito.android.user_adverts_filters.main.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsFiltersBeduinScreen.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/model/UserAdvertsFiltersBeduinScreen;", "Landroid/os/Parcelable;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertsFiltersBeduinScreen implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsFiltersBeduinScreen> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f316078b;

    /* compiled from: UserAdvertsFiltersBeduinScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertsFiltersBeduinScreen> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsFiltersBeduinScreen createFromParcel(Parcel parcel) {
            return new UserAdvertsFiltersBeduinScreen(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsFiltersBeduinScreen[] newArray(int i12) {
            return new UserAdvertsFiltersBeduinScreen[i12];
        }
    }

    public UserAdvertsFiltersBeduinScreen(@k String str) {
        this.f316078b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserAdvertsFiltersBeduinScreen) && L.f(this.f316078b, ((UserAdvertsFiltersBeduinScreen) obj).f316078b);
    }

    public final int hashCode() {
        return this.f316078b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("UserAdvertsFiltersBeduinScreen(screenName="), this.f316078b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f316078b);
    }
}
