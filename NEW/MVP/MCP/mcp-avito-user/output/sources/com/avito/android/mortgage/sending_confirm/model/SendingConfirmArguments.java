package com.avito.android.mortgage.sending_confirm.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.LegalRequirements;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SendingConfirmArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/model/SendingConfirmArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SendingConfirmArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<SendingConfirmArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LegalRequirements f203547b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f203548c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f203549d;

    /* compiled from: SendingConfirmArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SendingConfirmArguments> {
        @Override // android.os.Parcelable.Creator
        public final SendingConfirmArguments createFromParcel(Parcel parcel) {
            return new SendingConfirmArguments(LegalRequirements.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SendingConfirmArguments[] newArray(int i12) {
            return new SendingConfirmArguments[i12];
        }
    }

    public SendingConfirmArguments(@k LegalRequirements legalRequirements, @k String str, @k String str2) {
        this.f203547b = legalRequirements;
        this.f203548c = str;
        this.f203549d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendingConfirmArguments)) {
            return false;
        }
        SendingConfirmArguments sendingConfirmArguments = (SendingConfirmArguments) obj;
        return L.f(this.f203547b, sendingConfirmArguments.f203547b) && L.f(this.f203548c, sendingConfirmArguments.f203548c) && L.f(this.f203549d, sendingConfirmArguments.f203549d);
    }

    public final int hashCode() {
        return this.f203549d.hashCode() + H.d(this.f203547b.hashCode() * 31, 31, this.f203548c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendingConfirmArguments(content=");
        sb2.append(this.f203547b);
        sb2.append(", applicationId=");
        sb2.append(this.f203548c);
        sb2.append(", applicationStage=");
        return C22026a.c(sb2, this.f203549d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f203547b.writeToParcel(parcel, i12);
        parcel.writeString(this.f203548c);
        parcel.writeString(this.f203549d);
    }
}
