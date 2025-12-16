package com.avito.android.campaigns_sale.network.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BonusInfo.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/BonusInfo;", "Landroid/os/Parcelable;", "", "deltaForLeftThreshold", "Lcom/avito/android/campaigns_sale/network/remote/model/BonusText;", "withoutBonusesText", "withBonusesText", "<init>", "(ILcom/avito/android/campaigns_sale/network/remote/model/BonusText;Lcom/avito/android/campaigns_sale/network/remote/model/BonusText;)V", "I", "c", "()I", "Lcom/avito/android/campaigns_sale/network/remote/model/BonusText;", "e", "()Lcom/avito/android/campaigns_sale/network/remote/model/BonusText;", "d", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BonusInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<BonusInfo> CREATOR = new a();

    @c("deltaForLeftThreshold")
    private final int deltaForLeftThreshold;

    @c("withBonusesText")
    @k
    private final BonusText withBonusesText;

    @c("withoutBonusesText")
    @k
    private final BonusText withoutBonusesText;

    /* compiled from: BonusInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BonusInfo> {
        @Override // android.os.Parcelable.Creator
        public final BonusInfo createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            Parcelable.Creator<BonusText> creator = BonusText.CREATOR;
            return new BonusInfo(i12, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BonusInfo[] newArray(int i12) {
            return new BonusInfo[i12];
        }
    }

    public BonusInfo(int i12, @k BonusText bonusText, @k BonusText bonusText2) {
        this.deltaForLeftThreshold = i12;
        this.withoutBonusesText = bonusText;
        this.withBonusesText = bonusText2;
    }

    /* renamed from: c, reason: from getter */
    public final int getDeltaForLeftThreshold() {
        return this.deltaForLeftThreshold;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final BonusText getWithBonusesText() {
        return this.withBonusesText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final BonusText getWithoutBonusesText() {
        return this.withoutBonusesText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusInfo)) {
            return false;
        }
        BonusInfo bonusInfo = (BonusInfo) obj;
        return this.deltaForLeftThreshold == bonusInfo.deltaForLeftThreshold && L.f(this.withoutBonusesText, bonusInfo.withoutBonusesText) && L.f(this.withBonusesText, bonusInfo.withBonusesText);
    }

    public final int hashCode() {
        return this.withBonusesText.hashCode() + ((this.withoutBonusesText.hashCode() + (Integer.hashCode(this.deltaForLeftThreshold) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "BonusInfo(deltaForLeftThreshold=" + this.deltaForLeftThreshold + ", withoutBonusesText=" + this.withoutBonusesText + ", withBonusesText=" + this.withBonusesText + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.deltaForLeftThreshold);
        this.withoutBonusesText.writeToParcel(parcel, i12);
        this.withBonusesText.writeToParcel(parcel, i12);
    }
}
