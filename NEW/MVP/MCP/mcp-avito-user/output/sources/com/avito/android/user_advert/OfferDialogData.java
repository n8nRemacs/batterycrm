package com.avito.android.user_advert;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: OfferDialogData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/OfferDialogData;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfferDialogData implements Parcelable {

    @k
    public static final Parcelable.Creator<OfferDialogData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f308194b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f308195c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f308196d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f308197e;

    /* compiled from: OfferDialogData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OfferDialogData> {
        @Override // android.os.Parcelable.Creator
        public final OfferDialogData createFromParcel(Parcel parcel) {
            return new OfferDialogData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OfferDialogData[] newArray(int i12) {
            return new OfferDialogData[i12];
        }
    }

    public OfferDialogData(@k String str, @l String str2, @k String str3, @k String str4) {
        this.f308194b = str;
        this.f308195c = str2;
        this.f308196d = str3;
        this.f308197e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f308194b);
        parcel.writeString(this.f308195c);
        parcel.writeString(this.f308196d);
        parcel.writeString(this.f308197e);
    }
}
