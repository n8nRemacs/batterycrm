package com.avito.android.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: ApartmentNumberRequestResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/ApartmentNumberRequestLink;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_domoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ApartmentNumberRequestLink implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ApartmentNumberRequestLink> CREATOR = new a();

    @com.google.gson.annotations.c("link")
    @Y61.k
    private final DeepLink link;

    /* compiled from: ApartmentNumberRequestResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ApartmentNumberRequestLink> {
        @Override // android.os.Parcelable.Creator
        public final ApartmentNumberRequestLink createFromParcel(Parcel parcel) {
            return new ApartmentNumberRequestLink((DeepLink) parcel.readParcelable(ApartmentNumberRequestLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ApartmentNumberRequestLink[] newArray(int i12) {
            return new ApartmentNumberRequestLink[i12];
        }
    }

    public ApartmentNumberRequestLink(@Y61.k DeepLink deepLink) {
        this.link = deepLink;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final DeepLink getLink() {
        return this.link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApartmentNumberRequestLink) && kotlin.jvm.internal.L.f(this.link, ((ApartmentNumberRequestLink) obj).link);
    }

    public final int hashCode() {
        return this.link.hashCode();
    }

    @Y61.k
    public final String toString() {
        return com.avito.android.actions_sheet.a.v(new StringBuilder("ApartmentNumberRequestLink(link="), this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.link, i12);
    }
}
