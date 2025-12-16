package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsCommonExpenses.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/StatsBonus;", "Landroid/os/Parcelable;", "", "symbol", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getTitle", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StatsBonus implements Parcelable {

    @k
    public static final Parcelable.Creator<StatsBonus> CREATOR = new a();

    @c("symbol")
    @k
    private final String symbol;

    @c("title")
    @k
    private final String title;

    /* compiled from: StatsCommonExpenses.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatsBonus> {
        @Override // android.os.Parcelable.Creator
        public final StatsBonus createFromParcel(Parcel parcel) {
            return new StatsBonus(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StatsBonus[] newArray(int i12) {
            return new StatsBonus[i12];
        }
    }

    public StatsBonus(@k String str, @k String str2) {
        this.symbol = str;
        this.title = str2;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsBonus)) {
            return false;
        }
        StatsBonus statsBonus = (StatsBonus) obj;
        return L.f(this.symbol, statsBonus.symbol) && L.f(this.title, statsBonus.title);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.title.hashCode() + (this.symbol.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatsBonus(symbol=");
        sb2.append(this.symbol);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.symbol);
        parcel.writeString(this.title);
    }
}
