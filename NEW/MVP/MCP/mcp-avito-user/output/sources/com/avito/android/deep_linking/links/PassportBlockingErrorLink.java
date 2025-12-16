package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: PassportLinks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportBlockingErrorLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class PassportBlockingErrorLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PassportBlockingErrorLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableTextUserDialog f133536b;

    /* compiled from: PassportLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportBlockingErrorLink> {
        @Override // android.os.Parcelable.Creator
        public final PassportBlockingErrorLink createFromParcel(Parcel parcel) {
            return new PassportBlockingErrorLink(PrintableTextUserDialog.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PassportBlockingErrorLink[] newArray(int i12) {
            return new PassportBlockingErrorLink[i12];
        }
    }

    public PassportBlockingErrorLink(@Y61.k PrintableTextUserDialog printableTextUserDialog) {
        this.f133536b = printableTextUserDialog;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PassportBlockingErrorLink) && kotlin.jvm.internal.L.f(this.f133536b, ((PassportBlockingErrorLink) obj).f133536b);
    }

    public final int hashCode() {
        return this.f133536b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "PassportBlockingErrorLink(userDialog=" + this.f133536b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f133536b.writeToParcel(parcel, i12);
    }
}
