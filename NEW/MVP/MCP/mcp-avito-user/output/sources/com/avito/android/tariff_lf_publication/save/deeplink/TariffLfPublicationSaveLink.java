package com.avito.android.tariff_lf_publication.save.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TariffLfPublicationSaveLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_publication/save/deeplink/TariffLfPublicationSaveLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class TariffLfPublicationSaveLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffLfPublicationSaveLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f301132b;

    /* compiled from: TariffLfPublicationSaveLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffLfPublicationSaveLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffLfPublicationSaveLink createFromParcel(Parcel parcel) {
            return new TariffLfPublicationSaveLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffLfPublicationSaveLink[] newArray(int i12) {
            return new TariffLfPublicationSaveLink[i12];
        }
    }

    /* compiled from: TariffLfPublicationSaveLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff_lf_publication/save/deeplink/TariffLfPublicationSaveLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/tariff_lf_publication/save/deeplink/TariffLfPublicationSaveLink$b$a;", "Lcom/avito/android/tariff_lf_publication/save/deeplink/TariffLfPublicationSaveLink$b$b;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TariffLfPublicationSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_lf_publication/save/deeplink/TariffLfPublicationSaveLink$b$a;", "Lcom/avito/android/tariff_lf_publication/save/deeplink/TariffLfPublicationSaveLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f301133b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: TariffLfPublicationSaveLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_lf_publication/save/deeplink/TariffLfPublicationSaveLink$b$b;", "Lcom/avito/android/tariff_lf_publication/save/deeplink/TariffLfPublicationSaveLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff_lf_publication.save.deeplink.TariffLfPublicationSaveLink$b$b, reason: collision with other inner class name */
        public static final class C9214b extends b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C9214b f301134b = new C9214b();

            public C9214b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public TariffLfPublicationSaveLink(@k String str) {
        this.f301132b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffLfPublicationSaveLink) && L.f(this.f301132b, ((TariffLfPublicationSaveLink) obj).f301132b);
    }

    public final int hashCode() {
        return this.f301132b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("TariffLfPublicationSaveLink(remoteContext="), this.f301132b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f301132b);
    }
}
