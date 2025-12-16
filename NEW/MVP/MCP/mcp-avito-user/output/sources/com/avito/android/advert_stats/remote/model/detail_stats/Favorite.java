package com.avito.android.advert_stats.remote.model.detail_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DetailAdvertStatistics.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/advert_stats/remote/model/detail_stats/Favorite;", "Landroid/os/Parcelable;", "", "description", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Favorite implements Parcelable {

    @k
    public static final Parcelable.Creator<Favorite> CREATOR = new a();

    @c("description")
    @k
    private final String description;

    /* compiled from: DetailAdvertStatistics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Favorite> {
        @Override // android.os.Parcelable.Creator
        public final Favorite createFromParcel(Parcel parcel) {
            return new Favorite(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Favorite[] newArray(int i12) {
            return new Favorite[i12];
        }
    }

    public Favorite(@k String str) {
        this.description = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Favorite) && L.f(this.description, ((Favorite) obj).description);
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        return this.description.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("Favorite(description="), this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.description);
    }
}
