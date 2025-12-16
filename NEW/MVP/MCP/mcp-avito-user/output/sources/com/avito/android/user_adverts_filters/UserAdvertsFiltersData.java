package com.avito.android.user_adverts_filters;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.webrtc.h;

/* compiled from: UserAdvertsFiltersData.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_filters/UserAdvertsFiltersData;", "Landroid/os/Parcelable;", "a", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertsFiltersData implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, Object> f315951b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, Object> f315952c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f315953d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f315950e = new a(null);

    @k
    public static final Parcelable.Creator<UserAdvertsFiltersData> CREATOR = new b();

    /* compiled from: UserAdvertsFiltersData.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts_filters/UserAdvertsFiltersData$a;", "", "<init>", "()V", "", "ARG_USER_ADVERTS_FILTERS_DATA", "Ljava/lang/String;", "EXTRA_USER_ADVERTS_FILTERS_DATA", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static UserAdvertsFiltersData a(@k Intent intent) {
            UserAdvertsFiltersData userAdvertsFiltersData = (UserAdvertsFiltersData) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("user_adverts_filters_host_extra_data", UserAdvertsFiltersData.class) : intent.getParcelableExtra("user_adverts_filters_host_extra_data"));
            if (userAdvertsFiltersData == null) {
                return new UserAdvertsFiltersData(null, null, null, 7, null);
            }
            return userAdvertsFiltersData;
        }

        public a() {
        }
    }

    /* compiled from: UserAdvertsFiltersData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UserAdvertsFiltersData> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsFiltersData createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = h.c(UserAdvertsFiltersData.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            int i13 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
            int iC3 = 0;
            while (iC3 != i13) {
                iC3 = h.c(UserAdvertsFiltersData.class, parcel, linkedHashMap2, parcel.readString(), iC3, 1);
            }
            return new UserAdvertsFiltersData(parcel.readString(), linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsFiltersData[] newArray(int i12) {
            return new UserAdvertsFiltersData[i12];
        }
    }

    public UserAdvertsFiltersData() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdvertsFiltersData)) {
            return false;
        }
        UserAdvertsFiltersData userAdvertsFiltersData = (UserAdvertsFiltersData) obj;
        return L.f(this.f315951b, userAdvertsFiltersData.f315951b) && L.f(this.f315952c, userAdvertsFiltersData.f315952c) && L.f(this.f315953d, userAdvertsFiltersData.f315953d);
    }

    public final int hashCode() {
        int iC2 = c.c(this.f315951b.hashCode() * 31, 31, this.f315952c);
        String str = this.f315953d;
        return iC2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertsFiltersData(filterParams=");
        sb2.append(this.f315951b);
        sb2.append(", defaultFilterParams=");
        sb2.append(this.f315952c);
        sb2.append(", profileTab=");
        return C22026a.c(sb2, this.f315953d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f315951b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            h.h(parcel, (String) entry.getKey(), entry);
        }
        Iterator itI2 = C0.i(parcel, this.f315952c);
        while (itI2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itI2.next();
            h.h(parcel, (String) entry2.getKey(), entry2);
        }
        parcel.writeString(this.f315953d);
    }

    public UserAdvertsFiltersData(@l String str, @k Map map, @k Map map2) {
        this.f315951b = map;
        this.f315952c = map2;
        this.f315953d = str;
    }

    public /* synthetic */ UserAdvertsFiltersData(Map map, Map map2, String str, int i12, C42822w c42822w) {
        this((i12 & 4) != 0 ? null : str, (i12 & 1) != 0 ? P0.c() : map, (i12 & 2) != 0 ? P0.c() : map2);
    }
}
