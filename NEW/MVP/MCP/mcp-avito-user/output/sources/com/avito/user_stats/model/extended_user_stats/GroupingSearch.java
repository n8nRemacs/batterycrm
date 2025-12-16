package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfigStatsV2.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/GroupingSearch;", "Landroid/os/Parcelable;", "", "hint", ChannelContext.Item.PLACEHOLDER, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getHint", "()Ljava/lang/String;", "getPlaceholder", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GroupingSearch implements Parcelable {

    @k
    public static final Parcelable.Creator<GroupingSearch> CREATOR = new a();

    @c("hint")
    @l
    private final String hint;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    /* compiled from: ConfigStatsV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GroupingSearch> {
        @Override // android.os.Parcelable.Creator
        public final GroupingSearch createFromParcel(Parcel parcel) {
            return new GroupingSearch(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupingSearch[] newArray(int i12) {
            return new GroupingSearch[i12];
        }
    }

    public GroupingSearch(@l String str, @l String str2) {
        this.hint = str;
        this.placeholder = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupingSearch)) {
            return false;
        }
        GroupingSearch groupingSearch = (GroupingSearch) obj;
        return L.f(this.hint, groupingSearch.hint) && L.f(this.placeholder, groupingSearch.placeholder);
    }

    public final int hashCode() {
        String str = this.hint;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.placeholder;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupingSearch(hint=");
        sb2.append(this.hint);
        sb2.append(", placeholder=");
        return C22026a.c(sb2, this.placeholder, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.hint);
        parcel.writeString(this.placeholder);
    }
}
