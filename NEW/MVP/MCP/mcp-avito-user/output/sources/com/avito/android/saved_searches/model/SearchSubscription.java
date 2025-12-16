package com.avito.android.saved_searches.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchSubscription.kt */
@InterfaceC19823a
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/model/SearchSubscription;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchSubscription implements Parcelable {

    @k
    public static final Parcelable.Creator<SearchSubscription> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f258373b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f258374c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f258375d;

    /* renamed from: e, reason: collision with root package name */
    public final long f258376e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f258377f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final SearchParams f258378g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f258379h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f258380i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final DeepLink f258381j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final DeepLink f258382k;

    /* compiled from: SearchSubscription.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchSubscription> {
        @Override // android.os.Parcelable.Creator
        public final SearchSubscription createFromParcel(Parcel parcel) {
            return new SearchSubscription(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, (SearchParams) parcel.readParcelable(SearchSubscription.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (DeepLink) parcel.readParcelable(SearchSubscription.class.getClassLoader()), (DeepLink) parcel.readParcelable(SearchSubscription.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchSubscription[] newArray(int i12) {
            return new SearchSubscription[i12];
        }
    }

    public SearchSubscription(@k String str, @k String str2, @k String str3, long j12, boolean z12, @l SearchParams searchParams, @l String str4, @l Integer num, @l DeepLink deepLink, @l DeepLink deepLink2) {
        this.f258373b = str;
        this.f258374c = str2;
        this.f258375d = str3;
        this.f258376e = j12;
        this.f258377f = z12;
        this.f258378g = searchParams;
        this.f258379h = str4;
        this.f258380i = num;
        this.f258381j = deepLink;
        this.f258382k = deepLink2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        SearchSubscription searchSubscription = obj instanceof SearchSubscription ? (SearchSubscription) obj : null;
        if (searchSubscription == null) {
            return false;
        }
        return L.f(this.f258373b, searchSubscription.f258373b);
    }

    public final int hashCode() {
        return this.f258373b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f258373b);
        parcel.writeString(this.f258374c);
        parcel.writeString(this.f258375d);
        parcel.writeLong(this.f258376e);
        parcel.writeInt(this.f258377f ? 1 : 0);
        parcel.writeParcelable(this.f258378g, i12);
        parcel.writeString(this.f258379h);
        Integer num = this.f258380i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f258381j, i12);
        parcel.writeParcelable(this.f258382k, i12);
    }

    public /* synthetic */ SearchSubscription(String str, String str2, String str3, long j12, boolean z12, SearchParams searchParams, String str4, Integer num, DeepLink deepLink, DeepLink deepLink2, int i12, C42822w c42822w) {
        this(str, str2, str3, j12, z12, searchParams, str4, (i12 & 128) != 0 ? null : num, (i12 & 256) != 0 ? null : deepLink, (i12 & 512) != 0 ? null : deepLink2);
    }
}
