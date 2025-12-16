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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertsGroupInfo;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertsGroupInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsGroupInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Set<String> f312184b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Set<String> f312185c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, DeepLink> f312186d;

    /* compiled from: UserAdvertsGroupData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertsGroupInfo> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsGroupInfo createFromParcel(Parcel parcel) {
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
            LinkedHashMap linkedHashMap = new LinkedHashMap(i16);
            int iC2 = 0;
            while (iC2 != i16) {
                iC2 = f.c(UserAdvertsGroupInfo.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new UserAdvertsGroupInfo(linkedHashSet, linkedHashSet2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsGroupInfo[] newArray(int i12) {
            return new UserAdvertsGroupInfo[i12];
        }
    }

    public UserAdvertsGroupInfo() {
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
        if (!(obj instanceof UserAdvertsGroupInfo)) {
            return false;
        }
        UserAdvertsGroupInfo userAdvertsGroupInfo = (UserAdvertsGroupInfo) obj;
        return L.f(this.f312184b, userAdvertsGroupInfo.f312184b) && L.f(this.f312185c, userAdvertsGroupInfo.f312185c) && L.f(this.f312186d, userAdvertsGroupInfo.f312186d);
    }

    public final int hashCode() {
        return this.f312186d.hashCode() + m.g(this.f312185c, this.f312184b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertsGroupInfo(selectedIds=");
        sb2.append(this.f312184b);
        sb2.append(", actions=");
        sb2.append(this.f312185c);
        sb2.append(", copyDeeplinks=");
        return r.w(sb2, this.f312186d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Set<String> set = this.f312184b;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
        Set<String> set2 = this.f312185c;
        parcel.writeInt(set2.size());
        Iterator<String> it2 = set2.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next());
        }
        Iterator itI = C0.i(parcel, this.f312186d);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i12);
        }
    }

    public UserAdvertsGroupInfo(Set set, Set set2, Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? B0.f406639b : set, (i12 & 2) != 0 ? B0.f406639b : set2, (i12 & 4) != 0 ? P0.c() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserAdvertsGroupInfo(@k Set<String> set, @k Set<String> set2, @k Map<String, ? extends DeepLink> map) {
        this.f312184b = set;
        this.f312185c = set2;
        this.f312186d = map;
    }
}
