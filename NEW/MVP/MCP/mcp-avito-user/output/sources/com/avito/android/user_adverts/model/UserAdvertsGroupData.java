package com.avito.android.user_adverts.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsGroupData.kt */
@d
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertsGroupData;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertsGroupData implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsGroupData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<UserAdvertsShortcutGroup, UserAdvertsGroupState> f312182b;

    /* renamed from: c, reason: collision with root package name */
    public final int f312183c;

    /* compiled from: UserAdvertsGroupData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertsGroupData> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsGroupData createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(parcel.readParcelable(UserAdvertsGroupData.class.getClassLoader()), UserAdvertsGroupState.CREATOR.createFromParcel(parcel));
            }
            return new UserAdvertsGroupData(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsGroupData[] newArray(int i12) {
            return new UserAdvertsGroupData[i12];
        }
    }

    public UserAdvertsGroupData(@k Map<UserAdvertsShortcutGroup, UserAdvertsGroupState> map) {
        this.f312182b = map;
        Iterator<T> it = map.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((UserAdvertsGroupState) it.next()).f312193c.size();
        }
        this.f312183c = size;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserAdvertsGroupData) && L.f(this.f312182b, ((UserAdvertsGroupData) obj).f312182b);
    }

    public final int hashCode() {
        return this.f312182b.hashCode();
    }

    @k
    public final String toString() {
        return r.w(new StringBuilder("UserAdvertsGroupData(shortcutGroups="), this.f312182b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f312182b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeParcelable((Parcelable) entry.getKey(), i12);
            ((UserAdvertsGroupState) entry.getValue()).writeToParcel(parcel, i12);
        }
    }
}
