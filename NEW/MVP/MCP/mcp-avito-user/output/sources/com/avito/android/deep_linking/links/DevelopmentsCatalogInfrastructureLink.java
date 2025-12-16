package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: DevelopmentsCatalogInfrastructureLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DevelopmentsCatalogInfrastructureLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class DevelopmentsCatalogInfrastructureLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DevelopmentsCatalogInfrastructureLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InfrastructureBody f133245b;

    /* compiled from: DevelopmentsCatalogInfrastructureLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DevelopmentsCatalogInfrastructureLink> {
        @Override // android.os.Parcelable.Creator
        public final DevelopmentsCatalogInfrastructureLink createFromParcel(Parcel parcel) {
            return new DevelopmentsCatalogInfrastructureLink(InfrastructureBody.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DevelopmentsCatalogInfrastructureLink[] newArray(int i12) {
            return new DevelopmentsCatalogInfrastructureLink[i12];
        }
    }

    public DevelopmentsCatalogInfrastructureLink(@Y61.k InfrastructureBody infrastructureBody) {
        this.f133245b = infrastructureBody;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f133245b.writeToParcel(parcel, i12);
    }
}
