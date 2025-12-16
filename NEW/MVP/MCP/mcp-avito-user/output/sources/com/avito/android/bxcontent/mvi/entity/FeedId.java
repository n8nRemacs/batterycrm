package com.avito.android.bxcontent.mvi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BxContentState.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/FeedId;", "Landroid/os/Parcelable;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FeedId implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f112036b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<String> f112037c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f112034d = new a(null);

    @Y61.k
    public static final Parcelable.Creator<FeedId> CREATOR = new b();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final FeedId f112035e = new FeedId(null, null, 2, null);

    /* compiled from: BxContentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/FeedId$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BxContentState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<FeedId> {
        @Override // android.os.Parcelable.Creator
        public final FeedId createFromParcel(Parcel parcel) {
            return new FeedId(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final FeedId[] newArray(int i12) {
            return new FeedId[i12];
        }
    }

    public FeedId(String str, List list, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? C42784z0.f406748b : list);
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getF112036b() {
        return this.f112036b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedId)) {
            return false;
        }
        FeedId feedId = (FeedId) obj;
        return L.f(this.f112036b, feedId.f112036b) && L.f(this.f112037c, feedId.f112037c);
    }

    @Y61.k
    public final List<String> getFilters() {
        return this.f112037c;
    }

    public final int hashCode() {
        String str = this.f112036b;
        return this.f112037c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeedId(feedId=");
        sb2.append(this.f112036b);
        sb2.append(", filters=");
        return H.p(sb2, this.f112037c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f112036b);
        parcel.writeStringList(this.f112037c);
    }

    public FeedId(@Y61.l String str, @Y61.k List<String> list) {
        this.f112036b = str;
        this.f112037c = list;
    }
}
