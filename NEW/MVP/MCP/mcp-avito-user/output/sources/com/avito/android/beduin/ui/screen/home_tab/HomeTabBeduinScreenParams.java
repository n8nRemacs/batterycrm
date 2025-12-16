package com.avito.android.beduin.ui.screen.home_tab;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.beduin.ui.screen.BeduinScreenRootOpenParams;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HomeTabBeduinScreenParams.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/home_tab/HomeTabBeduinScreenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HomeTabBeduinScreenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<HomeTabBeduinScreenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BeduinScreenRootOpenParams f104407b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f104408c;

    /* compiled from: HomeTabBeduinScreenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HomeTabBeduinScreenParams> {
        @Override // android.os.Parcelable.Creator
        public final HomeTabBeduinScreenParams createFromParcel(Parcel parcel) {
            return new HomeTabBeduinScreenParams(BeduinScreenRootOpenParams.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final HomeTabBeduinScreenParams[] newArray(int i12) {
            return new HomeTabBeduinScreenParams[i12];
        }
    }

    public HomeTabBeduinScreenParams(@k BeduinScreenRootOpenParams beduinScreenRootOpenParams, boolean z12) {
        this.f104407b = beduinScreenRootOpenParams;
        this.f104408c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTabBeduinScreenParams)) {
            return false;
        }
        HomeTabBeduinScreenParams homeTabBeduinScreenParams = (HomeTabBeduinScreenParams) obj;
        return L.f(this.f104407b, homeTabBeduinScreenParams.f104407b) && this.f104408c == homeTabBeduinScreenParams.f104408c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104408c) + (this.f104407b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HomeTabBeduinScreenParams(beduinScreenParams=");
        sb2.append(this.f104407b);
        sb2.append(", showNavigation=");
        return r.x(sb2, this.f104408c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f104407b.writeToParcel(parcel, i12);
        parcel.writeInt(this.f104408c ? 1 : 0);
    }
}
