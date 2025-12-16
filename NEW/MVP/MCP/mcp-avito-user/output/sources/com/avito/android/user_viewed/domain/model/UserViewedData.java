package com.avito.android.user_viewed.domain.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserViewedData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_viewed/domain/model/UserViewedData;", "Landroid/os/Parcelable;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserViewedData implements Parcelable {

    @k
    public static final Parcelable.Creator<UserViewedData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<UserViewedAdvert> f318385b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f318386c;

    /* compiled from: UserViewedData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserViewedData> {
        @Override // android.os.Parcelable.Creator
        public final UserViewedData createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(UserViewedAdvert.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new UserViewedData(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserViewedData[] newArray(int i12) {
            return new UserViewedData[i12];
        }
    }

    public UserViewedData() {
        this(null, null, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserViewedData)) {
            return false;
        }
        UserViewedData userViewedData = (UserViewedData) obj;
        return L.f(this.f318385b, userViewedData.f318385b) && L.f(this.f318386c, userViewedData.f318386c);
    }

    public final int hashCode() {
        int iHashCode = this.f318385b.hashCode() * 31;
        String str = this.f318386c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserViewedData(items=");
        sb2.append(this.f318385b);
        sb2.append(", xHash=");
        return C22026a.c(sb2, this.f318386c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f318385b, parcel);
        while (itJ.hasNext()) {
            ((UserViewedAdvert) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f318386c);
    }

    public UserViewedData(@k List<UserViewedAdvert> list, @l String str) {
        this.f318385b = list;
        this.f318386c = str;
    }

    public UserViewedData(List list, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? null : str);
    }
}
