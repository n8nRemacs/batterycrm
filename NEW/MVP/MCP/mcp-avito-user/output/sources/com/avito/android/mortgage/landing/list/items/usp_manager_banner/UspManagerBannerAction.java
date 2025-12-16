package com.avito.android.mortgage.landing.list.items.usp_manager_banner;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UspManagerBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/usp_manager_banner/UspManagerBannerAction;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UspManagerBannerAction implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<UspManagerBannerAction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f200027b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DeepLink f200028c;

    /* compiled from: UspManagerBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UspManagerBannerAction> {
        @Override // android.os.Parcelable.Creator
        public final UspManagerBannerAction createFromParcel(Parcel parcel) {
            return new UspManagerBannerAction(parcel.readString(), (DeepLink) parcel.readParcelable(UspManagerBannerAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UspManagerBannerAction[] newArray(int i12) {
            return new UspManagerBannerAction[i12];
        }
    }

    public UspManagerBannerAction(@Y61.k String str, @Y61.k DeepLink deepLink) {
        this.f200027b = str;
        this.f200028c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UspManagerBannerAction)) {
            return false;
        }
        UspManagerBannerAction uspManagerBannerAction = (UspManagerBannerAction) obj;
        return L.f(this.f200027b, uspManagerBannerAction.f200027b) && L.f(this.f200028c, uspManagerBannerAction.f200028c);
    }

    public final int hashCode() {
        return this.f200028c.hashCode() + (this.f200027b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UspManagerBannerAction(title=");
        sb2.append(this.f200027b);
        sb2.append(", url=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f200028c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f200027b);
        parcel.writeParcelable(this.f200028c, i12);
    }
}
