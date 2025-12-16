package com.avito.android.user_stats.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47204b;

/* compiled from: UserStatsLink.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/deeplink/UserStatsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class UserStatsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<UserStatsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f316990b;

    /* renamed from: c, reason: collision with root package name */
    public final long f316991c;

    /* renamed from: d, reason: collision with root package name */
    public final long f316992d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f316993e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f316994f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<String> f316995g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<String> f316996h;

    /* compiled from: UserStatsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserStatsLink> {
        @Override // android.os.Parcelable.Creator
        public final UserStatsLink createFromParcel(Parcel parcel) {
            return new UserStatsLink(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final UserStatsLink[] newArray(int i12) {
            return new UserStatsLink[i12];
        }
    }

    public UserStatsLink() {
        this(0, 0L, 0L, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f316990b);
        parcel.writeLong(this.f316991c);
        parcel.writeLong(this.f316992d);
        parcel.writeString(this.f316993e);
        parcel.writeString(this.f316994f);
        parcel.writeStringList(this.f316995g);
        parcel.writeStringList(this.f316996h);
    }

    public UserStatsLink(int i12, long j12, long j13, String str, String str2, List list, List list2, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12, (i13 & 2) != 0 ? 0L : j12, (i13 & 4) == 0 ? j13 : 0L, (i13 & 8) != 0 ? "" : str, (i13 & 16) == 0 ? str2 : "", (i13 & 32) != 0 ? C42784z0.f406748b : list, (i13 & 64) != 0 ? C42784z0.f406748b : list2);
    }

    public UserStatsLink(int i12, long j12, long j13, @k String str, @k String str2, @k List<String> list, @k List<String> list2) {
        this.f316990b = i12;
        this.f316991c = j12;
        this.f316992d = j13;
        this.f316993e = str;
        this.f316994f = str2;
        this.f316995g = list;
        this.f316996h = list2;
    }
}
