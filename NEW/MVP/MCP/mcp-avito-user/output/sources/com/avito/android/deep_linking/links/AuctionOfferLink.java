package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.publish.EditAdvertResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: AuctionOfferLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/AuctionOfferLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class AuctionOfferLink extends DeepLink {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133021b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLink f133022c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133023d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133024e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final b f133020f = new b(null);

    @Y61.k
    public static final Parcelable.Creator<AuctionOfferLink> CREATOR = new c();

    /* compiled from: AuctionOfferLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/AuctionOfferLink$a;", "", "a", "b", "c", "Lcom/avito/android/deep_linking/links/AuctionOfferLink$a$a;", "Lcom/avito/android/deep_linking/links/AuctionOfferLink$a$b;", "Lcom/avito/android/deep_linking/links/AuctionOfferLink$a$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: AuctionOfferLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/AuctionOfferLink$a$a;", "Lcom/avito/android/deep_linking/links/AuctionOfferLink$a;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.AuctionOfferLink$a$a, reason: collision with other inner class name */
        public static final class C3986a implements a, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C3986a f133025b = new C3986a();
        }

        /* compiled from: AuctionOfferLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/AuctionOfferLink$a$b;", "Lcom/avito/android/deep_linking/links/AuctionOfferLink$a;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements a, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f133026b = new b();
        }

        /* compiled from: AuctionOfferLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/AuctionOfferLink$a$c;", "Lcom/avito/android/deep_linking/links/AuctionOfferLink$a;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final EditAdvertResult.Ok f133027b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f133028c;

            public c(@Y61.k EditAdvertResult.Ok ok2, @Y61.k String str) {
                this.f133027b = ok2;
                this.f133028c = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return kotlin.jvm.internal.L.f(this.f133027b, cVar.f133027b) && kotlin.jvm.internal.L.f(this.f133028c, cVar.f133028c);
            }

            public final int hashCode() {
                return this.f133028c.hashCode() + (this.f133027b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SkipAuctionWithRedirect(redirectParams=");
                sb2.append(this.f133027b);
                sb2.append(", itemId=");
                return C22026a.c(sb2, this.f133028c, ')');
            }
        }
    }

    /* compiled from: AuctionOfferLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/AuctionOfferLink$b;", "", "<init>", "()V", "", "ITEM_ID_KEY", "Ljava/lang/String;", "PREVIOUS_RESPONSE_KEY", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: AuctionOfferLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<AuctionOfferLink> {
        @Override // android.os.Parcelable.Creator
        public final AuctionOfferLink createFromParcel(Parcel parcel) {
            return new AuctionOfferLink(parcel.readString(), (DeepLink) parcel.readParcelable(AuctionOfferLink.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuctionOfferLink[] newArray(int i12) {
            return new AuctionOfferLink[i12];
        }
    }

    public AuctionOfferLink(@Y61.k String str, @Y61.l DeepLink deepLink, @Y61.l String str2, @Y61.l String str3) {
        this.f133021b = str;
        this.f133022c = deepLink;
        this.f133023d = str2;
        this.f133024e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionOfferLink)) {
            return false;
        }
        AuctionOfferLink auctionOfferLink = (AuctionOfferLink) obj;
        return kotlin.jvm.internal.L.f(this.f133021b, auctionOfferLink.f133021b) && kotlin.jvm.internal.L.f(this.f133022c, auctionOfferLink.f133022c) && kotlin.jvm.internal.L.f(this.f133023d, auctionOfferLink.f133023d) && kotlin.jvm.internal.L.f(this.f133024e, auctionOfferLink.f133024e);
    }

    public final int hashCode() {
        int iHashCode = this.f133021b.hashCode() * 31;
        DeepLink deepLink = this.f133022c;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.f133023d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133024e;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuctionOfferLink(itemId=");
        sb2.append(this.f133021b);
        sb2.append(", nextLink=");
        sb2.append(this.f133022c);
        sb2.append(", fromPage=");
        sb2.append(this.f133023d);
        sb2.append(", utmSource=");
        return C22026a.c(sb2, this.f133024e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133021b);
        parcel.writeParcelable(this.f133022c, i12);
        parcel.writeString(this.f133023d);
        parcel.writeString(this.f133024e);
    }
}
