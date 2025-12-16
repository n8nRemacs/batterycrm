package com.avito.android.delivery;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.delivery.CardType;
import kotlin.Metadata;

/* compiled from: SelectedPaymentCard.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery/SelectedPaymentCard;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SelectedPaymentCard implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectedPaymentCard> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f134753b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f134754c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CardType f134755d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f134756e;

    /* compiled from: SelectedPaymentCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectedPaymentCard> {
        @Override // android.os.Parcelable.Creator
        public final SelectedPaymentCard createFromParcel(Parcel parcel) {
            return new SelectedPaymentCard(parcel.readString(), parcel.readString(), CardType.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectedPaymentCard[] newArray(int i12) {
            return new SelectedPaymentCard[i12];
        }
    }

    public SelectedPaymentCard(@k String str, @k String str2, @k CardType cardType, @k String str3) {
        this.f134753b = str;
        this.f134754c = str2;
        this.f134755d = cardType;
        this.f134756e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f134753b);
        parcel.writeString(this.f134754c);
        parcel.writeString(this.f134755d.name());
        parcel.writeString(this.f134756e);
    }
}
