package com.avito.android.comfortable_deal.deal.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.deal.item.callrecord.PlaySpeed;
import com.avito.android.remote.model.ParcelableEntity;
import kotlin.Metadata;

/* compiled from: SpeedEntity.kt */
@d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/model/SpeedEntity;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SpeedEntity implements ParcelableEntity<String> {

    @k
    public static final Parcelable.Creator<SpeedEntity> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PlaySpeed f121562b;

    /* compiled from: SpeedEntity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SpeedEntity> {
        @Override // android.os.Parcelable.Creator
        public final SpeedEntity createFromParcel(Parcel parcel) {
            return new SpeedEntity(PlaySpeed.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SpeedEntity[] newArray(int i12) {
            return new SpeedEntity[i12];
        }
    }

    public SpeedEntity(@k PlaySpeed playSpeed) {
        this.f121562b = playSpeed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpeedEntity) && this.f121562b == ((SpeedEntity) obj).f121562b;
    }

    @Override // com.avito.android.remote.model.Entity
    public final Object getId() {
        return this.f121562b.name();
    }

    @Override // com.avito.android.remote.model.Entity
    @k
    /* renamed from: getName */
    public final String getF119974b() {
        PlaySpeed playSpeed = this.f121562b;
        return playSpeed.f121206c.format(Float.valueOf(playSpeed.f121205b)).replace('.', ',').concat("x");
    }

    public final int hashCode() {
        return this.f121562b.hashCode();
    }

    @k
    public final String toString() {
        return "SpeedEntity(speed=" + this.f121562b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f121562b.name());
    }
}
