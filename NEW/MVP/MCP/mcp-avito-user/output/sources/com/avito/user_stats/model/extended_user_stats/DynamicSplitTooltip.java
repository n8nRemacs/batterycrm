package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsSplitLocal.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/DynamicSplitTooltip;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DynamicSplitTooltip implements Parcelable {

    @k
    public static final Parcelable.Creator<DynamicSplitTooltip> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Image f338647b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f338648c;

    /* compiled from: StatsSplitLocal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DynamicSplitTooltip> {
        @Override // android.os.Parcelable.Creator
        public final DynamicSplitTooltip createFromParcel(Parcel parcel) {
            return new DynamicSplitTooltip((Image) parcel.readParcelable(DynamicSplitTooltip.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicSplitTooltip[] newArray(int i12) {
            return new DynamicSplitTooltip[i12];
        }
    }

    public DynamicSplitTooltip(@l Image image, @k String str) {
        this.f338647b = image;
        this.f338648c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSplitTooltip)) {
            return false;
        }
        DynamicSplitTooltip dynamicSplitTooltip = (DynamicSplitTooltip) obj;
        return L.f(this.f338647b, dynamicSplitTooltip.f338647b) && L.f(this.f338648c, dynamicSplitTooltip.f338648c);
    }

    public final int hashCode() {
        Image image = this.f338647b;
        return this.f338648c.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DynamicSplitTooltip(image=");
        sb2.append(this.f338647b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f338648c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f338647b, i12);
        parcel.writeString(this.f338648c);
    }
}
