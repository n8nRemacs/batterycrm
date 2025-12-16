package com.avito.android.wallet.page.deeplink;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: WalletLink.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/wallet/page/deeplink/WalletLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "a", "WalletPageLink", "WalletServiceBalanceLink", "Lcom/avito/android/wallet/page/deeplink/WalletLink$WalletPageLink;", "Lcom/avito/android/wallet/page/deeplink/WalletLink$WalletServiceBalanceLink;", "_avito_wallet-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class WalletLink extends DeepLink {

    /* compiled from: WalletLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/deeplink/WalletLink$WalletPageLink;", "Lcom/avito/android/wallet/page/deeplink/WalletLink;", "_avito_wallet-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class WalletPageLink extends WalletLink {

        @Y61.k
        public static final Parcelable.Creator<WalletPageLink> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f327761b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f327762c;

        /* compiled from: WalletLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WalletPageLink> {
            @Override // android.os.Parcelable.Creator
            public final WalletPageLink createFromParcel(Parcel parcel) {
                return new WalletPageLink(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final WalletPageLink[] newArray(int i12) {
                return new WalletPageLink[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WalletPageLink() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.wallet.page.deeplink.WalletLink
        @Y61.l
        /* renamed from: f, reason: from getter */
        public final String getF327764c() {
            return this.f327762c;
        }

        @Override // com.avito.android.wallet.page.deeplink.WalletLink
        @Y61.l
        /* renamed from: getTheme, reason: from getter */
        public final String getF327763b() {
            return this.f327761b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f327761b);
            parcel.writeString(this.f327762c);
        }

        public /* synthetic */ WalletPageLink(String str, String str2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
        }

        public WalletPageLink(@Y61.l String str, @Y61.l String str2) {
            super(null);
            this.f327761b = str;
            this.f327762c = str2;
        }
    }

    /* compiled from: WalletLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/deeplink/WalletLink$WalletServiceBalanceLink;", "Lcom/avito/android/wallet/page/deeplink/WalletLink;", "_avito_wallet-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class WalletServiceBalanceLink extends WalletLink {

        @Y61.k
        public static final Parcelable.Creator<WalletServiceBalanceLink> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f327763b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f327764c;

        /* compiled from: WalletLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WalletServiceBalanceLink> {
            @Override // android.os.Parcelable.Creator
            public final WalletServiceBalanceLink createFromParcel(Parcel parcel) {
                return new WalletServiceBalanceLink(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final WalletServiceBalanceLink[] newArray(int i12) {
                return new WalletServiceBalanceLink[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WalletServiceBalanceLink() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.wallet.page.deeplink.WalletLink
        @Y61.l
        /* renamed from: f, reason: from getter */
        public final String getF327764c() {
            return this.f327764c;
        }

        @Override // com.avito.android.wallet.page.deeplink.WalletLink
        @Y61.l
        /* renamed from: getTheme, reason: from getter */
        public final String getF327763b() {
            return this.f327763b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f327763b);
            parcel.writeString(this.f327764c);
        }

        public /* synthetic */ WalletServiceBalanceLink(String str, String str2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
        }

        public WalletServiceBalanceLink(@Y61.l String str, @Y61.l String str2) {
            super(null);
            this.f327763b = str;
            this.f327764c = str2;
        }
    }

    /* compiled from: WalletLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/wallet/page/deeplink/WalletLink$a;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/wallet/page/deeplink/WalletLink$a$a;", "Lcom/avito/android/wallet/page/deeplink/WalletLink$a$b;", "_avito_wallet-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a implements InterfaceC14249c.b {

        /* compiled from: WalletLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/deeplink/WalletLink$a$a;", "Lcom/avito/android/wallet/page/deeplink/WalletLink$a;", "_avito_wallet-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.wallet.page.deeplink.WalletLink$a$a, reason: collision with other inner class name */
        public static final class C10160a extends a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f327765b;

            public C10160a(@Y61.l String str) {
                super(null);
                this.f327765b = str;
            }
        }

        /* compiled from: WalletLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/deeplink/WalletLink$a$b;", "Lcom/avito/android/wallet/page/deeplink/WalletLink$a;", "<init>", "()V", "_avito_wallet-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f327766b = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ WalletLink(C42822w c42822w) {
        this();
    }

    @Y61.l
    /* renamed from: f */
    public abstract String getF327764c();

    @Y61.l
    /* renamed from: getTheme */
    public abstract String getF327763b();

    public WalletLink() {
    }
}
