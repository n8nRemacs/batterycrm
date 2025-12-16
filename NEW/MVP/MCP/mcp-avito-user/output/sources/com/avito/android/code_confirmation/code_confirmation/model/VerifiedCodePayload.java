package com.avito.android.code_confirmation.code_confirmation.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ConfirmedCodeInfo.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/model/VerifiedCodePayload;", "Lcom/avito/android/code_confirmation/code_confirmation/model/ConfirmedCodePayload;", "<init>", "()V", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VerifiedCodePayload implements ConfirmedCodePayload {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final VerifiedCodePayload f119579b = new VerifiedCodePayload();

    @k
    public static final Parcelable.Creator<VerifiedCodePayload> CREATOR = new a();

    /* compiled from: ConfirmedCodeInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerifiedCodePayload> {
        @Override // android.os.Parcelable.Creator
        public final VerifiedCodePayload createFromParcel(Parcel parcel) {
            parcel.readInt();
            return VerifiedCodePayload.f119579b;
        }

        @Override // android.os.Parcelable.Creator
        public final VerifiedCodePayload[] newArray(int i12) {
            return new VerifiedCodePayload[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
