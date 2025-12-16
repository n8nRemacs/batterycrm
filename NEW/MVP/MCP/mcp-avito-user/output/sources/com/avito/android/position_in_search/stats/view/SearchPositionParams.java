package com.avito.android.position_in_search.stats.view;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SearchPositionParams.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/view/SearchPositionParams;", "Landroid/os/Parcelable;", "a", "_avito_position-in-search_stats_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SearchPositionParams implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final long f221756b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f221757c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f221755d = new a(null);

    @k
    public static final Parcelable.Creator<SearchPositionParams> CREATOR = new b();

    /* compiled from: SearchPositionParams.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/position_in_search/stats/view/SearchPositionParams$a;", "", "<init>", "()V", "", "PARAMS_KEY", "Ljava/lang/String;", "_avito_position-in-search_stats_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SearchPositionParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SearchPositionParams> {
        @Override // android.os.Parcelable.Creator
        public final SearchPositionParams createFromParcel(Parcel parcel) {
            return new SearchPositionParams(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchPositionParams[] newArray(int i12) {
            return new SearchPositionParams[i12];
        }
    }

    public SearchPositionParams(long j12, @k String str) {
        this.f221756b = j12;
        this.f221757c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchPositionParams)) {
            return false;
        }
        SearchPositionParams searchPositionParams = (SearchPositionParams) obj;
        return this.f221756b == searchPositionParams.f221756b && L.f(this.f221757c, searchPositionParams.f221757c);
    }

    public final int hashCode() {
        return this.f221757c.hashCode() + (Long.hashCode(this.f221756b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchPositionParams(itemId=");
        sb2.append(this.f221756b);
        sb2.append(", preSelectedPeriod=");
        return C22026a.c(sb2, this.f221757c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f221756b);
        parcel.writeString(this.f221757c);
    }
}
