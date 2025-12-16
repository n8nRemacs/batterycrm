package com.avito.android.user_adverts.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsGroupData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertsGroupState;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertsGroupState implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsGroupState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Set<String> f312192b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Set<String> f312193c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Set<String> f312194d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Map<String, DeepLink> f312195e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final UserAdvertsGroupSelectedState f312196f;

    /* compiled from: UserAdvertsGroupData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertsGroupState> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsGroupState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashSet.add(parcel.readString());
            }
            int i14 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashSet2.add(parcel.readString());
            }
            int i16 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                linkedHashSet3.add(parcel.readString());
            }
            int i18 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i18);
            int iC2 = 0;
            while (iC2 != i18) {
                iC2 = f.c(UserAdvertsGroupState.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new UserAdvertsGroupState(linkedHashSet, linkedHashSet2, linkedHashSet3, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsGroupState[] newArray(int i12) {
            return new UserAdvertsGroupState[i12];
        }
    }

    public UserAdvertsGroupState() {
        this(null, null, null, null, 15, null);
    }

    public static UserAdvertsGroupState a(UserAdvertsGroupState userAdvertsGroupState, Set set) {
        return new UserAdvertsGroupState(userAdvertsGroupState.f312192b, set, userAdvertsGroupState.f312194d, userAdvertsGroupState.f312195e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdvertsGroupState)) {
            return false;
        }
        UserAdvertsGroupState userAdvertsGroupState = (UserAdvertsGroupState) obj;
        return L.f(this.f312192b, userAdvertsGroupState.f312192b) && L.f(this.f312193c, userAdvertsGroupState.f312193c) && L.f(this.f312194d, userAdvertsGroupState.f312194d) && L.f(this.f312195e, userAdvertsGroupState.f312195e);
    }

    public final int hashCode() {
        return this.f312195e.hashCode() + m.g(this.f312194d, m.g(this.f312193c, this.f312192b.hashCode() * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertsGroupState(groupedIds=");
        sb2.append(this.f312192b);
        sb2.append(", selectedIds=");
        sb2.append(this.f312193c);
        sb2.append(", actions=");
        sb2.append(this.f312194d);
        sb2.append(", copyDeepLinks=");
        return r.w(sb2, this.f312195e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Set<String> set = this.f312192b;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
        Set<String> set2 = this.f312193c;
        parcel.writeInt(set2.size());
        Iterator<String> it2 = set2.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next());
        }
        Set<String> set3 = this.f312194d;
        parcel.writeInt(set3.size());
        Iterator<String> it3 = set3.iterator();
        while (it3.hasNext()) {
            parcel.writeString(it3.next());
        }
        Iterator itI = C0.i(parcel, this.f312195e);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserAdvertsGroupState(@k Set<String> set, @k Set<String> set2, @k Set<String> set3, @k Map<String, ? extends DeepLink> map) {
        this.f312192b = set;
        this.f312193c = set2;
        this.f312194d = set3;
        this.f312195e = map;
        this.f312196f = set2.isEmpty() ? UserAdvertsGroupSelectedState.f312189d : (set2.size() == set.size() && set2.containsAll(set)) ? UserAdvertsGroupSelectedState.f312187b : UserAdvertsGroupSelectedState.f312188c;
    }

    public UserAdvertsGroupState(Set set, Set set2, Set set3, Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? B0.f406639b : set, (i12 & 2) != 0 ? B0.f406639b : set2, (i12 & 4) != 0 ? B0.f406639b : set3, (i12 & 8) != 0 ? P0.c() : map);
    }
}
