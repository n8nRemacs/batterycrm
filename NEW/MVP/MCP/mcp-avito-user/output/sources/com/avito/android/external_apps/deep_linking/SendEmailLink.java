package com.avito.android.external_apps.deep_linking;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: SendEmailLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/SendEmailLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_external-apps_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class SendEmailLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<SendEmailLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f155026b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f155027c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f155028d;

    /* compiled from: SendEmailLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SendEmailLink> {
        @Override // android.os.Parcelable.Creator
        public final SendEmailLink createFromParcel(Parcel parcel) {
            return new SendEmailLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SendEmailLink[] newArray(int i12) {
            return new SendEmailLink[i12];
        }
    }

    public SendEmailLink(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        this.f155026b = str;
        this.f155027c = str2;
        this.f155028d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendEmailLink)) {
            return false;
        }
        SendEmailLink sendEmailLink = (SendEmailLink) obj;
        return L.f(this.f155026b, sendEmailLink.f155026b) && L.f(this.f155027c, sendEmailLink.f155027c) && L.f(this.f155028d, sendEmailLink.f155028d);
    }

    public final int hashCode() {
        String str = this.f155026b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f155027c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f155028d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendEmailLink(toEmail=");
        sb2.append(this.f155026b);
        sb2.append(", subject=");
        sb2.append(this.f155027c);
        sb2.append(", info=");
        return C22026a.c(sb2, this.f155028d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f155026b);
        parcel.writeString(this.f155027c);
        parcel.writeString(this.f155028d);
    }
}
