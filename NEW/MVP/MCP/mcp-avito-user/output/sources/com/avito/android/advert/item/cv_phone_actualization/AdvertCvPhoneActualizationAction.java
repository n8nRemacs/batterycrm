package com.avito.android.advert.item.cv_phone_actualization;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCvPhoneActualizationItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/cv_phone_actualization/AdvertCvPhoneActualizationAction;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertCvPhoneActualizationAction implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertCvPhoneActualizationAction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f75026b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AdvertCvPhoneActualizationActionType f75027c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f75028d;

    /* compiled from: AdvertCvPhoneActualizationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertCvPhoneActualizationAction> {
        @Override // android.os.Parcelable.Creator
        public final AdvertCvPhoneActualizationAction createFromParcel(Parcel parcel) {
            return new AdvertCvPhoneActualizationAction(parcel.readString(), AdvertCvPhoneActualizationActionType.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(AdvertCvPhoneActualizationAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertCvPhoneActualizationAction[] newArray(int i12) {
            return new AdvertCvPhoneActualizationAction[i12];
        }
    }

    public AdvertCvPhoneActualizationAction(@k String str, @k AdvertCvPhoneActualizationActionType advertCvPhoneActualizationActionType, @l DeepLink deepLink) {
        this.f75026b = str;
        this.f75027c = advertCvPhoneActualizationActionType;
        this.f75028d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertCvPhoneActualizationAction)) {
            return false;
        }
        AdvertCvPhoneActualizationAction advertCvPhoneActualizationAction = (AdvertCvPhoneActualizationAction) obj;
        return L.f(this.f75026b, advertCvPhoneActualizationAction.f75026b) && this.f75027c == advertCvPhoneActualizationAction.f75027c && L.f(this.f75028d, advertCvPhoneActualizationAction.f75028d);
    }

    public final int hashCode() {
        int iHashCode = (this.f75027c.hashCode() + (this.f75026b.hashCode() * 31)) * 31;
        DeepLink deepLink = this.f75028d;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertCvPhoneActualizationAction(title=");
        sb2.append(this.f75026b);
        sb2.append(", type=");
        sb2.append(this.f75027c);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f75028d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f75026b);
        parcel.writeString(this.f75027c.name());
        parcel.writeParcelable(this.f75028d, i12);
    }

    public /* synthetic */ AdvertCvPhoneActualizationAction(String str, AdvertCvPhoneActualizationActionType advertCvPhoneActualizationActionType, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, advertCvPhoneActualizationActionType, (i12 & 4) != 0 ? null : deepLink);
    }
}
