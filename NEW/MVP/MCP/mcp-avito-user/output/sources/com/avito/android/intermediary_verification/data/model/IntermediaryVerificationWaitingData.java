package com.avito.android.intermediary_verification.data.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.intermediary_verification.data.model.IntermediaryVerificationData;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IntermediaryVerificationData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/intermediary_verification/data/model/IntermediaryVerificationWaitingData;", "Landroid/os/Parcelable;", "_avito_intermediary-verification_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IntermediaryVerificationWaitingData implements Parcelable {

    @k
    public static final Parcelable.Creator<IntermediaryVerificationWaitingData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f173109b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f173110c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final IntermediaryVerificationData.Button f173111d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final IntermediaryVerificationData.Button f173112e;

    /* compiled from: IntermediaryVerificationData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IntermediaryVerificationWaitingData> {
        @Override // android.os.Parcelable.Creator
        public final IntermediaryVerificationWaitingData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(IntermediaryVerificationWaitingData.class.getClassLoader());
            Parcelable.Creator<IntermediaryVerificationData.Button> creator = IntermediaryVerificationData.Button.CREATOR;
            return new IntermediaryVerificationWaitingData(string, attributedText, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final IntermediaryVerificationWaitingData[] newArray(int i12) {
            return new IntermediaryVerificationWaitingData[i12];
        }
    }

    public IntermediaryVerificationWaitingData(@k String str, @k AttributedText attributedText, @k IntermediaryVerificationData.Button button, @k IntermediaryVerificationData.Button button2) {
        this.f173109b = str;
        this.f173110c = attributedText;
        this.f173111d = button;
        this.f173112e = button2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntermediaryVerificationWaitingData)) {
            return false;
        }
        IntermediaryVerificationWaitingData intermediaryVerificationWaitingData = (IntermediaryVerificationWaitingData) obj;
        return L.f(this.f173109b, intermediaryVerificationWaitingData.f173109b) && L.f(this.f173110c, intermediaryVerificationWaitingData.f173110c) && L.f(this.f173111d, intermediaryVerificationWaitingData.f173111d) && L.f(this.f173112e, intermediaryVerificationWaitingData.f173112e);
    }

    public final int hashCode() {
        return this.f173112e.hashCode() + ((this.f173111d.hashCode() + com.avito.android.actions_sheet.a.b(this.f173109b.hashCode() * 31, 31, this.f173110c)) * 31);
    }

    @k
    public final String toString() {
        return "IntermediaryVerificationWaitingData(title=" + this.f173109b + ", description=" + this.f173110c + ", submitButton=" + this.f173111d + ", leaveButton=" + this.f173112e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f173109b);
        parcel.writeParcelable(this.f173110c, i12);
        this.f173111d.writeToParcel(parcel, i12);
        this.f173112e.writeToParcel(parcel, i12);
    }
}
