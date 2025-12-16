package com.avito.android.important_addresses_selection.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ImportantAddressesSelectionLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses_selection/deeplink/ImportantAddressesSelectionLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class ImportantAddressesSelectionLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ImportantAddressesSelectionLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f169717b;

    /* compiled from: ImportantAddressesSelectionLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImportantAddressesSelectionLink> {
        @Override // android.os.Parcelable.Creator
        public final ImportantAddressesSelectionLink createFromParcel(Parcel parcel) {
            return new ImportantAddressesSelectionLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImportantAddressesSelectionLink[] newArray(int i12) {
            return new ImportantAddressesSelectionLink[i12];
        }
    }

    public ImportantAddressesSelectionLink(@Y61.k String str) {
        this.f169717b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImportantAddressesSelectionLink) && L.f(this.f169717b, ((ImportantAddressesSelectionLink) obj).f169717b);
    }

    public final int hashCode() {
        return this.f169717b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("ImportantAddressesSelectionLink(xGeoSession="), this.f169717b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f169717b);
    }
}
