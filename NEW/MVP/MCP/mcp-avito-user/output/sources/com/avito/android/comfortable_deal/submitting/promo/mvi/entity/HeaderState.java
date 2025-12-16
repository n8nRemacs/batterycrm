package com.avito.android.comfortable_deal.submitting.promo.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoState.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/HeaderState;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HeaderState implements Parcelable {

    @k
    public static final Parcelable.Creator<HeaderState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UniversalImage f123171b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f123172c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f123173d;

    /* compiled from: PromoState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HeaderState> {
        @Override // android.os.Parcelable.Creator
        public final HeaderState createFromParcel(Parcel parcel) {
            return new HeaderState((UniversalImage) parcel.readParcelable(HeaderState.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HeaderState[] newArray(int i12) {
            return new HeaderState[i12];
        }
    }

    public HeaderState(@l UniversalImage universalImage, @l String str, @l String str2) {
        this.f123171b = universalImage;
        this.f123172c = str;
        this.f123173d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderState)) {
            return false;
        }
        HeaderState headerState = (HeaderState) obj;
        return L.f(this.f123171b, headerState.f123171b) && L.f(this.f123172c, headerState.f123172c) && L.f(this.f123173d, headerState.f123173d);
    }

    public final int hashCode() {
        UniversalImage universalImage = this.f123171b;
        int iHashCode = (universalImage == null ? 0 : universalImage.hashCode()) * 31;
        String str = this.f123172c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f123173d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderState(image=");
        sb2.append(this.f123171b);
        sb2.append(", title=");
        sb2.append(this.f123172c);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f123173d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f123171b, i12);
        parcel.writeString(this.f123172c);
        parcel.writeString(this.f123173d);
    }
}
