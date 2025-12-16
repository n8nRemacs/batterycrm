package com.avito.android.user_adverts.tab_screens.adverts.domain.model.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DisclaimerItemDomain.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/DisclaimerItemDomain;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertsBaseItemDomain;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DisclaimerItemDomain implements UserAdvertsBaseItemDomain {

    @k
    public static final Parcelable.Creator<DisclaimerItemDomain> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f315014b;

    /* compiled from: DisclaimerItemDomain.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DisclaimerItemDomain> {
        @Override // android.os.Parcelable.Creator
        public final DisclaimerItemDomain createFromParcel(Parcel parcel) {
            return new DisclaimerItemDomain(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DisclaimerItemDomain[] newArray(int i12) {
            return new DisclaimerItemDomain[i12];
        }
    }

    public DisclaimerItemDomain(@k String str) {
        this.f315014b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisclaimerItemDomain) && L.f(this.f315014b, ((DisclaimerItemDomain) obj).f315014b);
    }

    public final int hashCode() {
        return this.f315014b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("DisclaimerItemDomain(value="), this.f315014b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f315014b);
    }
}
