package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: CampaignsSaleLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/CampaignsSaleLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CampaignsSaleLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<CampaignsSaleLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133083b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133084c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133085d;

    /* compiled from: CampaignsSaleLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CampaignsSaleLink> {
        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleLink createFromParcel(Parcel parcel) {
            return new CampaignsSaleLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleLink[] newArray(int i12) {
            return new CampaignsSaleLink[i12];
        }
    }

    /* compiled from: CampaignsSaleLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/CampaignsSaleLink$b;", "", "a", "b", "Lcom/avito/android/deep_linking/links/CampaignsSaleLink$b$a;", "Lcom/avito/android/deep_linking/links/CampaignsSaleLink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: CampaignsSaleLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/CampaignsSaleLink$b$a;", "Lcom/avito/android/deep_linking/links/CampaignsSaleLink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133086b = new a();
        }

        /* compiled from: CampaignsSaleLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/CampaignsSaleLink$b$b;", "Lcom/avito/android/deep_linking/links/CampaignsSaleLink$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.CampaignsSaleLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3989b implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f133087b;

            public C3989b(boolean z12) {
                this.f133087b = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3989b) && this.f133087b == ((C3989b) obj).f133087b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f133087b);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.x(new StringBuilder("Success(reloadPrevScreen="), this.f133087b, ')');
            }
        }
    }

    public CampaignsSaleLink(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.f133083b = str;
        this.f133084c = str2;
        this.f133085d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignsSaleLink)) {
            return false;
        }
        CampaignsSaleLink campaignsSaleLink = (CampaignsSaleLink) obj;
        return kotlin.jvm.internal.L.f(this.f133083b, campaignsSaleLink.f133083b) && kotlin.jvm.internal.L.f(this.f133084c, campaignsSaleLink.f133084c) && kotlin.jvm.internal.L.f(this.f133085d, campaignsSaleLink.f133085d);
    }

    public final int hashCode() {
        int iHashCode = this.f133083b.hashCode() * 31;
        String str = this.f133084c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133085d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignsSaleLink(saleId=");
        sb2.append(this.f133083b);
        sb2.append(", fromPage=");
        sb2.append(this.f133084c);
        sb2.append(", selectedItemId=");
        return C22026a.c(sb2, this.f133085d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133083b);
        parcel.writeString(this.f133084c);
        parcel.writeString(this.f133085d);
    }
}
