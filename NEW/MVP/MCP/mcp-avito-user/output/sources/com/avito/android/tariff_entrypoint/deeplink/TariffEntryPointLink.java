package com.avito.android.tariff_entrypoint.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TariffEntryPointLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_entrypoint/deeplink/TariffEntryPointLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "b", "_avito_tariff-entrypoint_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffEntryPointLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<TariffEntryPointLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f298703b;

    /* compiled from: TariffEntryPointLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffEntryPointLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffEntryPointLink createFromParcel(Parcel parcel) {
            return new TariffEntryPointLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffEntryPointLink[] newArray(int i12) {
            return new TariffEntryPointLink[i12];
        }
    }

    /* compiled from: TariffEntryPointLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_entrypoint/deeplink/TariffEntryPointLink$b;", "", "a", "b", "Lcom/avito/android/tariff_entrypoint/deeplink/TariffEntryPointLink$b$a;", "Lcom/avito/android/tariff_entrypoint/deeplink/TariffEntryPointLink$b$b;", "_avito_tariff-entrypoint_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: TariffEntryPointLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_entrypoint/deeplink/TariffEntryPointLink$b$a;", "Lcom/avito/android/tariff_entrypoint/deeplink/TariffEntryPointLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_tariff-entrypoint_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f298704b = new a();
        }

        /* compiled from: TariffEntryPointLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_entrypoint/deeplink/TariffEntryPointLink$b$b;", "Lcom/avito/android/tariff_entrypoint/deeplink/TariffEntryPointLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_tariff-entrypoint_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff_entrypoint.deeplink.TariffEntryPointLink$b$b, reason: collision with other inner class name */
        public static final class C9135b implements b, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C9135b f298705b = new C9135b();
        }
    }

    public TariffEntryPointLink(@l String str) {
        this.f298703b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f298703b);
    }
}
