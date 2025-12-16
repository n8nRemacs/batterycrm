package com.avito.android.sx_address.list.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ScreenData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/domain/InfoBannerButtonData;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InfoBannerButtonData implements Parcelable {

    @k
    public static final Parcelable.Creator<InfoBannerButtonData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f293153b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f293154c;

    /* compiled from: ScreenData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InfoBannerButtonData> {
        @Override // android.os.Parcelable.Creator
        public final InfoBannerButtonData createFromParcel(Parcel parcel) {
            return new InfoBannerButtonData(parcel.readString(), (DeepLink) parcel.readParcelable(InfoBannerButtonData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final InfoBannerButtonData[] newArray(int i12) {
            return new InfoBannerButtonData[i12];
        }
    }

    public InfoBannerButtonData(@k String str, @k DeepLink deepLink) {
        this.f293153b = str;
        this.f293154c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoBannerButtonData)) {
            return false;
        }
        InfoBannerButtonData infoBannerButtonData = (InfoBannerButtonData) obj;
        return L.f(this.f293153b, infoBannerButtonData.f293153b) && L.f(this.f293154c, infoBannerButtonData.f293154c);
    }

    public final int hashCode() {
        return this.f293154c.hashCode() + (this.f293153b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InfoBannerButtonData(title=");
        sb2.append(this.f293153b);
        sb2.append(", url=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f293154c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f293153b);
        parcel.writeParcelable(this.f293154c, i12);
    }
}
