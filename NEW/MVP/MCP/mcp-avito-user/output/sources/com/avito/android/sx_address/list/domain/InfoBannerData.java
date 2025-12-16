package com.avito.android.sx_address.list.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ScreenData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/domain/InfoBannerData;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InfoBannerData implements Parcelable {

    @k
    public static final Parcelable.Creator<InfoBannerData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final InfoBannerButtonData f293155b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f293156c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f293157d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f293158e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f293159f;

    /* compiled from: ScreenData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InfoBannerData> {
        @Override // android.os.Parcelable.Creator
        public final InfoBannerData createFromParcel(Parcel parcel) {
            return new InfoBannerData(parcel.readInt() == 0 ? null : InfoBannerButtonData.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(InfoBannerData.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InfoBannerData[] newArray(int i12) {
            return new InfoBannerData[i12];
        }
    }

    public InfoBannerData(@l InfoBannerButtonData infoBannerButtonData, @k AttributedText attributedText, boolean z12, @k String str, @k String str2) {
        this.f293155b = infoBannerButtonData;
        this.f293156c = attributedText;
        this.f293157d = z12;
        this.f293158e = str;
        this.f293159f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoBannerData)) {
            return false;
        }
        InfoBannerData infoBannerData = (InfoBannerData) obj;
        return L.f(this.f293155b, infoBannerData.f293155b) && L.f(this.f293156c, infoBannerData.f293156c) && this.f293157d == infoBannerData.f293157d && L.f(this.f293158e, infoBannerData.f293158e) && L.f(this.f293159f, infoBannerData.f293159f);
    }

    public final int hashCode() {
        InfoBannerButtonData infoBannerButtonData = this.f293155b;
        return this.f293159f.hashCode() + H.d(r.i(com.avito.android.actions_sheet.a.b((infoBannerButtonData == null ? 0 : infoBannerButtonData.hashCode()) * 31, 31, this.f293156c), 31, this.f293157d), 31, this.f293158e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InfoBannerData(button=");
        sb2.append(this.f293155b);
        sb2.append(", description=");
        sb2.append(this.f293156c);
        sb2.append(", isClosable=");
        sb2.append(this.f293157d);
        sb2.append(", title=");
        sb2.append(this.f293158e);
        sb2.append(", type=");
        return C22026a.c(sb2, this.f293159f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        InfoBannerButtonData infoBannerButtonData = this.f293155b;
        if (infoBannerButtonData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            infoBannerButtonData.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f293156c, i12);
        parcel.writeInt(this.f293157d ? 1 : 0);
        parcel.writeString(this.f293158e);
        parcel.writeString(this.f293159f);
    }
}
