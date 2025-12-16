package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: EmailAddConfirmationDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/EmailAddConfirmationDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class EmailAddConfirmationDeepLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<EmailAddConfirmationDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133296b;

    /* compiled from: EmailAddConfirmationDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmailAddConfirmationDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final EmailAddConfirmationDeepLink createFromParcel(Parcel parcel) {
            return new EmailAddConfirmationDeepLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EmailAddConfirmationDeepLink[] newArray(int i12) {
            return new EmailAddConfirmationDeepLink[i12];
        }
    }

    public EmailAddConfirmationDeepLink(@Y61.k String str) {
        this.f133296b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmailAddConfirmationDeepLink) && kotlin.jvm.internal.L.f(this.f133296b, ((EmailAddConfirmationDeepLink) obj).f133296b);
    }

    public final int hashCode() {
        return this.f133296b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("EmailAddConfirmationDeepLink(confirmationCode="), this.f133296b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133296b);
    }
}
