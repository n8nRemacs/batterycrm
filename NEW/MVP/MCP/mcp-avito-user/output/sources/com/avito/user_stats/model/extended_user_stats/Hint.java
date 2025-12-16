package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StatsDynamicItems.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/Hint;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/user_stats/model/extended_user_stats/HintItemLegend;", "legend", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/user_stats/model/extended_user_stats/HintItemLegend;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/user_stats/model/extended_user_stats/HintItemLegend;", "c", "()Lcom/avito/user_stats/model/extended_user_stats/HintItemLegend;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Hint implements Parcelable {

    @k
    public static final Parcelable.Creator<Hint> CREATOR = new a();

    @c("description")
    @l
    private final String description;

    @c("legend")
    @l
    private final HintItemLegend legend;

    @c("title")
    @l
    private final String title;

    /* compiled from: StatsDynamicItems.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Hint> {
        @Override // android.os.Parcelable.Creator
        public final Hint createFromParcel(Parcel parcel) {
            return new Hint(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : HintItemLegend.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Hint[] newArray(int i12) {
            return new Hint[i12];
        }
    }

    public Hint() {
        this(null, null, null, 7, null);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final HintItemLegend getLegend() {
        return this.legend;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hint)) {
            return false;
        }
        Hint hint = (Hint) obj;
        return L.f(this.title, hint.title) && L.f(this.description, hint.description) && L.f(this.legend, hint.legend);
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        HintItemLegend hintItemLegend = this.legend;
        return iHashCode2 + (hintItemLegend != null ? hintItemLegend.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "Hint(title=" + this.title + ", description=" + this.description + ", legend=" + this.legend + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        HintItemLegend hintItemLegend = this.legend;
        if (hintItemLegend == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hintItemLegend.writeToParcel(parcel, i12);
        }
    }

    public Hint(@l String str, @l String str2, @l HintItemLegend hintItemLegend) {
        this.title = str;
        this.description = str2;
        this.legend = hintItemLegend;
    }

    public /* synthetic */ Hint(String str, String str2, HintItemLegend hintItemLegend, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : hintItemLegend);
    }
}
