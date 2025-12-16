package com.avito.android.advert.deeplinks;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: AdvertWantToBuyRequestLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/deeplinks/AdvertWantToBuyRequestLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_advert-details_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes10.dex */
public final /* data */ class AdvertWantToBuyRequestLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<AdvertWantToBuyRequestLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f68878b;

    /* compiled from: AdvertWantToBuyRequestLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertWantToBuyRequestLink> {
        @Override // android.os.Parcelable.Creator
        public final AdvertWantToBuyRequestLink createFromParcel(Parcel parcel) {
            return new AdvertWantToBuyRequestLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertWantToBuyRequestLink[] newArray(int i12) {
            return new AdvertWantToBuyRequestLink[i12];
        }
    }

    /* compiled from: AdvertWantToBuyRequestLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/advert/deeplinks/AdvertWantToBuyRequestLink$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/advert/deeplinks/AdvertWantToBuyRequestLink$b$a;", "Lcom/avito/android/advert/deeplinks/AdvertWantToBuyRequestLink$b$b;", "Lcom/avito/android/advert/deeplinks/AdvertWantToBuyRequestLink$b$c;", "_avito_advert-details_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: AdvertWantToBuyRequestLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/deeplinks/AdvertWantToBuyRequestLink$b$a;", "Lcom/avito/android/advert/deeplinks/AdvertWantToBuyRequestLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_advert-details_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f68879b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2005082379;
            }

            @Y61.k
            public final String toString() {
                return "Failure";
            }
        }

        /* compiled from: AdvertWantToBuyRequestLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/deeplinks/AdvertWantToBuyRequestLink$b$b;", "Lcom/avito/android/advert/deeplinks/AdvertWantToBuyRequestLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_advert-details_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.deeplinks.AdvertWantToBuyRequestLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C2157b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C2157b f68880b = new C2157b();

            public C2157b() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C2157b);
            }

            public final int hashCode() {
                return 1509289326;
            }

            @Y61.k
            public final String toString() {
                return "Success";
            }
        }

        /* compiled from: AdvertWantToBuyRequestLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/deeplinks/AdvertWantToBuyRequestLink$b$c;", "Lcom/avito/android/advert/deeplinks/AdvertWantToBuyRequestLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_advert-details_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f68881b = new c();

            public c() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1257847333;
            }

            @Y61.k
            public final String toString() {
                return "ToggleDisabled";
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public AdvertWantToBuyRequestLink(@Y61.k String str) {
        this.f68878b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdvertWantToBuyRequestLink) && L.f(this.f68878b, ((AdvertWantToBuyRequestLink) obj).f68878b);
    }

    public final int hashCode() {
        return this.f68878b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("AdvertWantToBuyRequestLink(itemId="), this.f68878b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f68878b);
    }
}
