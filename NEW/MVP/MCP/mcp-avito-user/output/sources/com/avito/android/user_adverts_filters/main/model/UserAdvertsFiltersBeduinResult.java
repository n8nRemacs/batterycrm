package com.avito.android.user_adverts_filters.main.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: UserAdvertsFiltersBeduinResult.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/model/UserAdvertsFiltersBeduinResult;", "Landroid/os/Parcelable;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertsFiltersBeduinResult implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsFiltersBeduinResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UserAdvertsFiltersBeduinScreen f316076b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f316077c;

    /* compiled from: UserAdvertsFiltersBeduinResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertsFiltersBeduinResult> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsFiltersBeduinResult createFromParcel(Parcel parcel) {
            UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreenCreateFromParcel = UserAdvertsFiltersBeduinScreen.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(UserAdvertsFiltersBeduinScreen.CREATOR.createFromParcel(parcel), UserAdvertsFiltersBeduinModel.CREATOR.createFromParcel(parcel));
            }
            return new UserAdvertsFiltersBeduinResult(userAdvertsFiltersBeduinScreenCreateFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsFiltersBeduinResult[] newArray(int i12) {
            return new UserAdvertsFiltersBeduinResult[i12];
        }
    }

    public UserAdvertsFiltersBeduinResult(@k UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen, @k LinkedHashMap linkedHashMap) {
        this.f316076b = userAdvertsFiltersBeduinScreen;
        this.f316077c = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdvertsFiltersBeduinResult)) {
            return false;
        }
        UserAdvertsFiltersBeduinResult userAdvertsFiltersBeduinResult = (UserAdvertsFiltersBeduinResult) obj;
        return L.f(this.f316076b, userAdvertsFiltersBeduinResult.f316076b) && this.f316077c.equals(userAdvertsFiltersBeduinResult.f316077c);
    }

    public final int hashCode() {
        return this.f316077c.hashCode() + (this.f316076b.f316078b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertsFiltersBeduinResult(initialScreenId=");
        sb2.append(this.f316076b);
        sb2.append(", screens=");
        return h.e(sb2, this.f316077c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f316076b.writeToParcel(parcel, i12);
        LinkedHashMap linkedHashMap = this.f316077c;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((UserAdvertsFiltersBeduinScreen) entry.getKey()).writeToParcel(parcel, i12);
            ((UserAdvertsFiltersBeduinModel) entry.getValue()).writeToParcel(parcel, i12);
        }
    }
}
