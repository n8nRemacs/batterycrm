package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: CreateRouteLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/CreateRouteLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CreateRouteLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<CreateRouteLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133158b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133159c;

    /* compiled from: CreateRouteLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreateRouteLink> {
        @Override // android.os.Parcelable.Creator
        public final CreateRouteLink createFromParcel(Parcel parcel) {
            return new CreateRouteLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CreateRouteLink[] newArray(int i12) {
            return new CreateRouteLink[i12];
        }
    }

    public CreateRouteLink(@Y61.k String str, @Y61.k String str2) {
        this.f133158b = str;
        this.f133159c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateRouteLink)) {
            return false;
        }
        CreateRouteLink createRouteLink = (CreateRouteLink) obj;
        return kotlin.jvm.internal.L.f(this.f133158b, createRouteLink.f133158b) && kotlin.jvm.internal.L.f(this.f133159c, createRouteLink.f133159c);
    }

    public final int hashCode() {
        return this.f133159c.hashCode() + (this.f133158b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateRouteLink(latitude=");
        sb2.append(this.f133158b);
        sb2.append(", longitude=");
        return C22026a.c(sb2, this.f133159c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133158b);
        parcel.writeString(this.f133159c);
    }
}
