package com.avito.android.extended_profile_widgets.adapter;

import K51.d;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import oB.k;

/* compiled from: ExtendedProfileWidgetAction.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/PremiumBannerItemClickAction;", "LoB/k;", "Landroid/os/Parcelable;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PremiumBannerItemClickAction implements k, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PremiumBannerItemClickAction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f154160b;

    /* renamed from: c, reason: collision with root package name */
    public final int f154161c;

    /* compiled from: ExtendedProfileWidgetAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PremiumBannerItemClickAction> {
        @Override // android.os.Parcelable.Creator
        public final PremiumBannerItemClickAction createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(PremiumBannerItemClickAction.class, parcel, arrayList, iL2, 1);
            }
            return new PremiumBannerItemClickAction(parcel.readInt(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PremiumBannerItemClickAction[] newArray(int i12) {
            return new PremiumBannerItemClickAction[i12];
        }
    }

    public PremiumBannerItemClickAction(int i12, @Y61.k ArrayList arrayList) {
        this.f154160b = arrayList;
        this.f154161c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBannerItemClickAction)) {
            return false;
        }
        PremiumBannerItemClickAction premiumBannerItemClickAction = (PremiumBannerItemClickAction) obj;
        return this.f154160b.equals(premiumBannerItemClickAction.f154160b) && this.f154161c == premiumBannerItemClickAction.f154161c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f154161c) + (this.f154160b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PremiumBannerItemClickAction(images=");
        sb2.append(this.f154160b);
        sb2.append(", position=");
        return r.t(sb2, this.f154161c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f154160b, parcel);
        while (itZ.hasNext()) {
            parcel.writeParcelable((Parcelable) itZ.next(), i12);
        }
        parcel.writeInt(this.f154161c);
    }
}
