package com.avito.android.sx_address.address_video_verification.domain;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SendButton.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/domain/SendButton;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SendButton implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SendButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f292603b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DeepLink f292604c;

    /* compiled from: SendButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SendButton> {
        @Override // android.os.Parcelable.Creator
        public final SendButton createFromParcel(Parcel parcel) {
            return new SendButton(parcel.readString(), (DeepLink) parcel.readParcelable(SendButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SendButton[] newArray(int i12) {
            return new SendButton[i12];
        }
    }

    public SendButton(@Y61.k String str, @Y61.k DeepLink deepLink) {
        this.f292603b = str;
        this.f292604c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendButton)) {
            return false;
        }
        SendButton sendButton = (SendButton) obj;
        return L.f(this.f292603b, sendButton.f292603b) && L.f(this.f292604c, sendButton.f292604c);
    }

    public final int hashCode() {
        return this.f292604c.hashCode() + (this.f292603b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendButton(title=");
        sb2.append(this.f292603b);
        sb2.append(", url=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f292604c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f292603b);
        parcel.writeParcelable(this.f292604c, i12);
    }
}
