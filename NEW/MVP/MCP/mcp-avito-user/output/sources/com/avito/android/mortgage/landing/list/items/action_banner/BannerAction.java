package com.avito.android.mortgage.landing.list.items.action_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActionBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/action_banner/BannerAction;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BannerAction implements Parcelable {

    @k
    public static final Parcelable.Creator<BannerAction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f199651b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f199652c;

    /* compiled from: ActionBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BannerAction> {
        @Override // android.os.Parcelable.Creator
        public final BannerAction createFromParcel(Parcel parcel) {
            return new BannerAction(parcel.readString(), (DeepLink) parcel.readParcelable(BannerAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BannerAction[] newArray(int i12) {
            return new BannerAction[i12];
        }
    }

    public BannerAction(@l String str, @l DeepLink deepLink) {
        this.f199651b = str;
        this.f199652c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAction)) {
            return false;
        }
        BannerAction bannerAction = (BannerAction) obj;
        return L.f(this.f199651b, bannerAction.f199651b) && L.f(this.f199652c, bannerAction.f199652c);
    }

    public final int hashCode() {
        String str = this.f199651b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeepLink deepLink = this.f199652c;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerAction(actionTitle=");
        sb2.append(this.f199651b);
        sb2.append(", actionDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f199652c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f199651b);
        parcel.writeParcelable(this.f199652c, i12);
    }
}
