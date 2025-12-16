package com.avito.android.remote;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ApartmentNumberRequestResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/ApartmentNumberRequestResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/ApartmentNumberRequestLink;", "result", "<init>", "(Lcom/avito/android/remote/ApartmentNumberRequestLink;)V", "Lcom/avito/android/remote/ApartmentNumberRequestLink;", "c", "()Lcom/avito/android/remote/ApartmentNumberRequestLink;", "_avito_domoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ApartmentNumberRequestResponse implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ApartmentNumberRequestResponse> CREATOR = new a();

    @com.google.gson.annotations.c("result")
    @Y61.l
    private final ApartmentNumberRequestLink result;

    /* compiled from: ApartmentNumberRequestResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ApartmentNumberRequestResponse> {
        @Override // android.os.Parcelable.Creator
        public final ApartmentNumberRequestResponse createFromParcel(Parcel parcel) {
            return new ApartmentNumberRequestResponse(parcel.readInt() == 0 ? null : ApartmentNumberRequestLink.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ApartmentNumberRequestResponse[] newArray(int i12) {
            return new ApartmentNumberRequestResponse[i12];
        }
    }

    public ApartmentNumberRequestResponse(@Y61.l ApartmentNumberRequestLink apartmentNumberRequestLink) {
        this.result = apartmentNumberRequestLink;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final ApartmentNumberRequestLink getResult() {
        return this.result;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        ApartmentNumberRequestLink apartmentNumberRequestLink = this.result;
        if (apartmentNumberRequestLink == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            apartmentNumberRequestLink.writeToParcel(parcel, i12);
        }
    }
}
