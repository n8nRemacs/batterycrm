package com.avito.android.avito_finance_user_profile.view.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceBlockData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/model/AvitoFinanceCardBackground;", "Landroid/os/Parcelable;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AvitoFinanceCardBackground implements Parcelable {

    @k
    public static final Parcelable.Creator<AvitoFinanceCardBackground> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f98029b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalColor f98030c;

    /* compiled from: AvitoFinanceBlockData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AvitoFinanceCardBackground> {
        @Override // android.os.Parcelable.Creator
        public final AvitoFinanceCardBackground createFromParcel(Parcel parcel) {
            return new AvitoFinanceCardBackground(parcel.readString(), (UniversalColor) parcel.readParcelable(AvitoFinanceCardBackground.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AvitoFinanceCardBackground[] newArray(int i12) {
            return new AvitoFinanceCardBackground[i12];
        }
    }

    public AvitoFinanceCardBackground(@l String str, @l UniversalColor universalColor) {
        this.f98029b = str;
        this.f98030c = universalColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvitoFinanceCardBackground)) {
            return false;
        }
        AvitoFinanceCardBackground avitoFinanceCardBackground = (AvitoFinanceCardBackground) obj;
        return L.f(this.f98029b, avitoFinanceCardBackground.f98029b) && L.f(this.f98030c, avitoFinanceCardBackground.f98030c);
    }

    public final int hashCode() {
        String str = this.f98029b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UniversalColor universalColor = this.f98030c;
        return iHashCode + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoFinanceCardBackground(gradient=");
        sb2.append(this.f98029b);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f98030c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f98029b);
        parcel.writeParcelable(this.f98030c, i12);
    }
}
