package com.avito.android.advert_stats.remote.model.detail_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DetailAdvertStatistics.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/advert_stats/remote/model/detail_stats/Stats;", "Landroid/os/Parcelable;", "", "actions", "vasActions", "<init>", "(ILjava/lang/Integer;)V", "I", "c", "()I", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Stats implements Parcelable {

    @k
    public static final Parcelable.Creator<Stats> CREATOR = new a();

    @c("actions")
    private final int actions;

    @c("vasActions")
    @l
    private final Integer vasActions;

    /* compiled from: DetailAdvertStatistics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Stats> {
        @Override // android.os.Parcelable.Creator
        public final Stats createFromParcel(Parcel parcel) {
            return new Stats(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Stats[] newArray(int i12) {
            return new Stats[i12];
        }
    }

    public Stats(int i12, @l Integer num) {
        this.actions = i12;
        this.vasActions = num;
    }

    /* renamed from: c, reason: from getter */
    public final int getActions() {
        return this.actions;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Integer getVasActions() {
        return this.vasActions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stats)) {
            return false;
        }
        Stats stats = (Stats) obj;
        return this.actions == stats.actions && L.f(this.vasActions, stats.vasActions);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.actions) * 31;
        Integer num = this.vasActions;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stats(actions=");
        sb2.append(this.actions);
        sb2.append(", vasActions=");
        return s.j(sb2, this.vasActions, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.actions);
        Integer num = this.vasActions;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
