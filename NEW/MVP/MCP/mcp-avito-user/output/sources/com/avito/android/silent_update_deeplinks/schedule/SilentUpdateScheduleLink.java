package com.avito.android.silent_update_deeplinks.schedule;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.silent_update.DownloadUpdateConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: SilentUpdateScheduleLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update_deeplinks/schedule/SilentUpdateScheduleLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_silent-update-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class SilentUpdateScheduleLink extends DeepLink {

    @k
    public static final Parcelable.Creator<SilentUpdateScheduleLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DownloadUpdateConfig f283774b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f283775c;

    /* compiled from: SilentUpdateScheduleLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SilentUpdateScheduleLink> {
        @Override // android.os.Parcelable.Creator
        public final SilentUpdateScheduleLink createFromParcel(Parcel parcel) {
            return new SilentUpdateScheduleLink((DownloadUpdateConfig) parcel.readParcelable(SilentUpdateScheduleLink.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SilentUpdateScheduleLink[] newArray(int i12) {
            return new SilentUpdateScheduleLink[i12];
        }
    }

    public SilentUpdateScheduleLink(@k DownloadUpdateConfig downloadUpdateConfig, @l String str) {
        this.f283774b = downloadUpdateConfig;
        this.f283775c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SilentUpdateScheduleLink)) {
            return false;
        }
        SilentUpdateScheduleLink silentUpdateScheduleLink = (SilentUpdateScheduleLink) obj;
        return L.f(this.f283774b, silentUpdateScheduleLink.f283774b) && L.f(this.f283775c, silentUpdateScheduleLink.f283775c);
    }

    public final int hashCode() {
        int iHashCode = this.f283774b.hashCode() * 31;
        String str = this.f283775c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SilentUpdateScheduleLink(config=");
        sb2.append(this.f283774b);
        sb2.append(", sourceScreen=");
        return C22026a.c(sb2, this.f283775c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f283774b, i12);
        parcel.writeString(this.f283775c);
    }
}
