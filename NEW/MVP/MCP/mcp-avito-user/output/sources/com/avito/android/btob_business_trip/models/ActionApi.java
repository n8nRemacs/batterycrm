package com.avito.android.btob_business_trip.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripInfoModels.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/models/ActionApi;", "Landroid/os/Parcelable;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ActionApi implements Parcelable {

    @k
    public static final Parcelable.Creator<ActionApi> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f107847b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f107848c;

    /* compiled from: B2bBusinessTripInfoModels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActionApi> {
        @Override // android.os.Parcelable.Creator
        public final ActionApi createFromParcel(Parcel parcel) {
            return new ActionApi((DeepLink) parcel.readParcelable(ActionApi.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionApi[] newArray(int i12) {
            return new ActionApi[i12];
        }
    }

    public ActionApi(@k DeepLink deepLink, @k String str) {
        this.f107847b = deepLink;
        this.f107848c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionApi)) {
            return false;
        }
        ActionApi actionApi = (ActionApi) obj;
        return L.f(this.f107847b, actionApi.f107847b) && L.f(this.f107848c, actionApi.f107848c);
    }

    public final int hashCode() {
        return this.f107848c.hashCode() + (this.f107847b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionApi(deeplink=");
        sb2.append(this.f107847b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f107848c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f107847b, i12);
        parcel.writeString(this.f107848c);
    }
}
