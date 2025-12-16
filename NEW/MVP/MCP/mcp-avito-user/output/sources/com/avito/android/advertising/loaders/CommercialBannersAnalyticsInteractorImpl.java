package com.avito.android.advertising.loaders;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.C30828i;
import com.avito.android.advertising.analytics.events.BannerEvent;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.loaders.yandex.YandexBannerLoader;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.Kundle;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import tb.C48630a;
import tb.C48631b;
import tb.C48633d;
import tb.C48634e;
import tb.C48635f;
import tb.C48636g;
import tb.C48638i;
import tb.C48639j;

/* compiled from: CommercialBannersAnalyticsInteractor.kt */
@com.avito.android.di.B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/CommercialBannersAnalyticsInteractorImpl;", "Lcom/avito/android/advertising/loaders/j;", "a", "EventBitmask", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommercialBannersAnalyticsInteractorImpl implements j {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final EventBitmask f87901i;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BannerPageSource f87902b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f87903c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.a f87904d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C30828i f87905e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f87906f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final HashMap f87907g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f87908h;

    /* compiled from: CommercialBannersAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/CommercialBannersAnalyticsInteractorImpl$EventBitmask;", "Landroid/os/Parcelable;", "Bit", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class EventBitmask implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<EventBitmask> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final byte f87909b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CommercialBannersAnalyticsInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/CommercialBannersAnalyticsInteractorImpl$EventBitmask$Bit;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Bit {

            /* renamed from: c, reason: collision with root package name */
            public static final Bit f87910c;

            /* renamed from: d, reason: collision with root package name */
            public static final Bit f87911d;

            /* renamed from: e, reason: collision with root package name */
            public static final Bit f87912e;

            /* renamed from: f, reason: collision with root package name */
            public static final Bit f87913f;

            /* renamed from: g, reason: collision with root package name */
            public static final Bit f87914g;

            /* renamed from: h, reason: collision with root package name */
            public static final Bit f87915h;

            /* renamed from: i, reason: collision with root package name */
            public static final Bit f87916i;

            /* renamed from: j, reason: collision with root package name */
            public static final Bit f87917j;

            /* renamed from: k, reason: collision with root package name */
            public static final /* synthetic */ Bit[] f87918k;

            /* renamed from: l, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f87919l;

            /* renamed from: b, reason: collision with root package name */
            public final byte f87920b;

            static {
                Bit bit = new Bit("None", 0, (byte) 0);
                Bit bit2 = new Bit("Open", 1, (byte) 1);
                f87910c = bit2;
                Bit bit3 = new Bit("Impression", 2, (byte) 2);
                f87911d = bit3;
                Bit bit4 = new Bit("Render", 3, (byte) 4);
                f87912e = bit4;
                Bit bit5 = new Bit("View", 4, (byte) 8);
                f87913f = bit5;
                Bit bit6 = new Bit("Request", 5, (byte) 16);
                f87914g = bit6;
                Bit bit7 = new Bit("Failed", 6, (byte) 32);
                f87915h = bit7;
                Bit bit8 = new Bit("HtmlError", 7, (byte) 64);
                f87916i = bit8;
                Bit bit9 = new Bit("OnScreen", 8, (byte) -1);
                f87917j = bit9;
                Bit[] bitArr = {bit, bit2, bit3, bit4, bit5, bit6, bit7, bit8, bit9};
                f87918k = bitArr;
                f87919l = kotlin.enums.c.a(bitArr);
            }

            public Bit(String str, int i12, byte b12) {
                this.f87920b = b12;
            }

            public static Bit valueOf(String str) {
                return (Bit) Enum.valueOf(Bit.class, str);
            }

            public static Bit[] values() {
                return (Bit[]) f87918k.clone();
            }
        }

        /* compiled from: CommercialBannersAnalyticsInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EventBitmask> {
            @Override // android.os.Parcelable.Creator
            public final EventBitmask createFromParcel(Parcel parcel) {
                return new EventBitmask(parcel.readByte());
            }

            @Override // android.os.Parcelable.Creator
            public final EventBitmask[] newArray(int i12) {
                return new EventBitmask[i12];
            }
        }

        public EventBitmask(byte b12) {
            this.f87909b = b12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EventBitmask) && this.f87909b == ((EventBitmask) obj).f87909b;
        }

        public final int hashCode() {
            return Byte.hashCode(this.f87909b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("EventBitmask(bitmask="), this.f87909b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeByte(this.f87909b);
        }
    }

    /* compiled from: CommercialBannersAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/CommercialBannersAnalyticsInteractorImpl$a;", "", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CommercialBannersAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BannerInfo f87921l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ CommercialBannersAnalyticsInteractorImpl f87922m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f87923n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ BannerEvent.Type f87924o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BannerInfo bannerInfo, CommercialBannersAnalyticsInteractorImpl commercialBannersAnalyticsInteractorImpl, int i12, BannerEvent.Type type) {
            super(0);
            this.f87921l = bannerInfo;
            this.f87922m = commercialBannersAnalyticsInteractorImpl;
            this.f87923n = i12;
            this.f87924o = type;
        }

        @Override // Y41.a
        public final G0 invoke() {
            if (this.f87921l.e()) {
                CommercialBannersAnalyticsInteractorImpl commercialBannersAnalyticsInteractorImpl = this.f87922m;
                InterfaceC28373a interfaceC28373a = commercialBannersAnalyticsInteractorImpl.f87903c;
                commercialBannersAnalyticsInteractorImpl.f87904d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                interfaceC28373a.c(new com.avito.android.advertising.analytics.events.a(this.f87921l, commercialBannersAnalyticsInteractorImpl.f87908h, commercialBannersAnalyticsInteractorImpl.f87902b, commercialBannersAnalyticsInteractorImpl.f87906f, this.f87923n, this.f87924o, jCurrentTimeMillis));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CommercialBannersAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BannerInfo f87925l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ CommercialBannersAnalyticsInteractorImpl f87926m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BannerEvent.Type f87927n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.advertising.b f87928o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Integer f87929p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BannerInfo bannerInfo, CommercialBannersAnalyticsInteractorImpl commercialBannersAnalyticsInteractorImpl, BannerEvent.Type type, com.avito.android.advertising.b bVar, Integer num) {
            super(0);
            this.f87925l = bannerInfo;
            this.f87926m = commercialBannersAnalyticsInteractorImpl;
            this.f87927n = type;
            this.f87928o = bVar;
            this.f87929p = num;
        }

        @Override // Y41.a
        public final G0 invoke() {
            if (this.f87925l.e()) {
                CommercialBannersAnalyticsInteractorImpl commercialBannersAnalyticsInteractorImpl = this.f87926m;
                InterfaceC28373a interfaceC28373a = commercialBannersAnalyticsInteractorImpl.f87903c;
                commercialBannersAnalyticsInteractorImpl.f87904d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                com.avito.android.advertising.b bVar = this.f87928o;
                String strW = bVar != null ? bVar.W() : null;
                String f88260e = bVar != null ? bVar.getF88260e() : null;
                String f88258c = bVar != null ? bVar.getF88258c() : null;
                String f88257b = bVar != null ? bVar.getF88257b() : null;
                interfaceC28373a.c(new com.avito.android.advertising.analytics.events.f(this.f87925l, commercialBannersAnalyticsInteractorImpl.f87902b, commercialBannersAnalyticsInteractorImpl.f87906f, this.f87927n, jCurrentTimeMillis, strW, f88260e, f88258c, f88257b, commercialBannersAnalyticsInteractorImpl.f87908h, this.f87929p));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CommercialBannersAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Throwable f87930l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Integer f87931m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ CommercialBannersAnalyticsInteractorImpl f87932n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ BannerInfo f87933o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f87934p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Integer f87935q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ BannerEvent.Type f87936r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f87937s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th2, Integer num, CommercialBannersAnalyticsInteractorImpl commercialBannersAnalyticsInteractorImpl, BannerInfo bannerInfo, boolean z12, Integer num2, BannerEvent.Type type, String str) {
            super(0);
            this.f87930l = th2;
            this.f87931m = num;
            this.f87932n = commercialBannersAnalyticsInteractorImpl;
            this.f87933o = bannerInfo;
            this.f87934p = z12;
            this.f87935q = num2;
            this.f87936r = type;
            this.f87937s = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Throwable th2 = this.f87930l;
            Integer numValueOf = th2 instanceof YandexBannerLoader.YandexBannerLoadingException ? Integer.valueOf(((YandexBannerLoader.YandexBannerLoadingException) th2).f88498b) : this.f87931m;
            CommercialBannersAnalyticsInteractorImpl commercialBannersAnalyticsInteractorImpl = this.f87932n;
            InterfaceC28373a interfaceC28373a = commercialBannersAnalyticsInteractorImpl.f87903c;
            commercialBannersAnalyticsInteractorImpl.f87904d.getClass();
            interfaceC28373a.c(new com.avito.android.advertising.analytics.events.b(this.f87933o, this.f87934p, commercialBannersAnalyticsInteractorImpl.f87902b, commercialBannersAnalyticsInteractorImpl.f87906f, this.f87935q, this.f87936r, this.f87937s, numValueOf, System.currentTimeMillis()));
            return G0.f406611a;
        }
    }

    /* compiled from: CommercialBannersAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BannerInfo f87938l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ CommercialBannersAnalyticsInteractorImpl f87939m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BannerEvent.Type f87940n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f87941o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f87942p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BannerInfo bannerInfo, CommercialBannersAnalyticsInteractorImpl commercialBannersAnalyticsInteractorImpl, BannerEvent.Type type, String str, int i12) {
            super(0);
            this.f87938l = bannerInfo;
            this.f87939m = commercialBannersAnalyticsInteractorImpl;
            this.f87940n = type;
            this.f87941o = str;
            this.f87942p = i12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            BannerInfo bannerInfo = this.f87938l;
            if (!bannerInfo.f87889t) {
                bannerInfo.f87889t = true;
                String string = UUID.randomUUID().toString();
                CommercialBannersAnalyticsInteractorImpl commercialBannersAnalyticsInteractorImpl = this.f87939m;
                InterfaceC28373a interfaceC28373a = commercialBannersAnalyticsInteractorImpl.f87903c;
                commercialBannersAnalyticsInteractorImpl.f87904d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                interfaceC28373a.c(new com.avito.android.advertising.analytics.events.d(this.f87938l, commercialBannersAnalyticsInteractorImpl.f87902b, commercialBannersAnalyticsInteractorImpl.f87906f, this.f87940n, this.f87941o, string, commercialBannersAnalyticsInteractorImpl.f87908h, this.f87942p, jCurrentTimeMillis));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CommercialBannersAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BannerInfo f87944m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BannerEvent.Type f87945n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Integer f87946o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BannerInfo bannerInfo, BannerEvent.Type type, Integer num) {
            super(0);
            this.f87944m = bannerInfo;
            this.f87945n = type;
            this.f87946o = num;
        }

        @Override // Y41.a
        public final G0 invoke() {
            CommercialBannersAnalyticsInteractorImpl commercialBannersAnalyticsInteractorImpl = CommercialBannersAnalyticsInteractorImpl.this;
            InterfaceC28373a interfaceC28373a = commercialBannersAnalyticsInteractorImpl.f87903c;
            commercialBannersAnalyticsInteractorImpl.f87904d.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            interfaceC28373a.c(new com.avito.android.advertising.analytics.events.g(this.f87944m, commercialBannersAnalyticsInteractorImpl.f87902b, commercialBannersAnalyticsInteractorImpl.f87906f, this.f87946o, this.f87945n, jCurrentTimeMillis, 3967, 12));
            return G0.f406611a;
        }
    }

    /* compiled from: CommercialBannersAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BannerInfo f87947l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ CommercialBannersAnalyticsInteractorImpl f87948m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f87949n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ BannerEvent.Type f87950o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BannerInfo bannerInfo, CommercialBannersAnalyticsInteractorImpl commercialBannersAnalyticsInteractorImpl, int i12, BannerEvent.Type type) {
            super(0);
            this.f87947l = bannerInfo;
            this.f87948m = commercialBannersAnalyticsInteractorImpl;
            this.f87949n = i12;
            this.f87950o = type;
        }

        @Override // Y41.a
        public final G0 invoke() {
            if (this.f87947l.e()) {
                CommercialBannersAnalyticsInteractorImpl commercialBannersAnalyticsInteractorImpl = this.f87948m;
                InterfaceC28373a interfaceC28373a = commercialBannersAnalyticsInteractorImpl.f87903c;
                commercialBannersAnalyticsInteractorImpl.f87904d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                interfaceC28373a.c(new com.avito.android.advertising.analytics.events.h(this.f87947l, commercialBannersAnalyticsInteractorImpl.f87908h, commercialBannersAnalyticsInteractorImpl.f87902b, commercialBannersAnalyticsInteractorImpl.f87906f, this.f87949n, this.f87950o, jCurrentTimeMillis));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CommercialBannersAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BannerInfo f87952m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Integer f87953n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f87954o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(BannerInfo bannerInfo, Integer num, String str) {
            super(0);
            this.f87952m = bannerInfo;
            this.f87953n = num;
            this.f87954o = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            CommercialBannersAnalyticsInteractorImpl commercialBannersAnalyticsInteractorImpl = CommercialBannersAnalyticsInteractorImpl.this;
            commercialBannersAnalyticsInteractorImpl.f87903c.c(new sb.f(this.f87952m, commercialBannersAnalyticsInteractorImpl.f87902b, this.f87953n, this.f87954o));
            return G0.f406611a;
        }
    }

    static {
        new a(null);
        f87901i = new EventBitmask((byte) 0);
    }

    @Inject
    public CommercialBannersAnalyticsInteractorImpl(@Y61.k BannerPageSource bannerPageSource, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.server_time.a aVar, @Y61.k C30828i c30828i, @Y61.l @com.avito.android.advertising.di.w String str, @com.avito.android.advertising.di.v @Y61.l Kundle kundle, @Y61.k com.avito.android.account.E e12) {
        LinkedHashMap linkedHashMapF;
        this.f87902b = bannerPageSource;
        this.f87903c = interfaceC28373a;
        this.f87904d = aVar;
        this.f87905e = c30828i;
        this.f87906f = str;
        this.f87907g = new HashMap();
        this.f87908h = e12.a();
        if (kundle == null || (linkedHashMapF = kundle.f("COMMERCIAL_BANNER_ANALYTICS_INTERACTOR_TRACKED_EVENTS")) == null) {
            return;
        }
        this.f87907g = new HashMap(linkedHashMapF);
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void K0(@Y61.k BannerInfo bannerInfo, @Y61.l Integer num, @Y61.k BannerEvent.Type type) {
        if (bannerInfo.f87887r && bannerInfo.e()) {
            a(bannerInfo, EventBitmask.Bit.f87914g, new f(bannerInfo, type, num));
        }
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void M4(@Y61.k String str, @Y61.k BannerInfo bannerInfo) {
        this.f87903c.c(new C48635f(bannerInfo, str, this.f87908h, 4775, 8));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void M6(@Y61.k BannerInfo bannerInfo, int i12, @Y61.k BannerEvent.Type type) {
        a(bannerInfo, EventBitmask.Bit.f87913f, new g(bannerInfo, this, i12, type));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void N3(@Y61.k String str, @Y61.k BannerInfo bannerInfo) {
        this.f87903c.c(new C48636g(bannerInfo, str, this.f87908h, 4777, 8));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void P3(@Y61.k String str, @Y61.k BannerInfo bannerInfo, int i12) {
        this.f87903c.c(new C48630a(i12, bannerInfo, str, this.f87908h, this.f87906f));
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.premium.q
    public final void P6(@Y61.k Kundle kundle) {
        kundle.l("COMMERCIAL_BANNER_ANALYTICS_INTERACTOR_TRACKED_EVENTS", this.f87907g);
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void T6(@Y61.k String str, @Y61.k BannerInfo bannerInfo) {
        this.f87903c.c(new C48638i(bannerInfo, str, this.f87908h, 4778, 7));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void V4(@Y61.k String str, @Y61.k BannerInfo bannerInfo) {
        this.f87903c.c(new C48639j(bannerInfo, str, this.f87908h, 4774, 7));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void X3(@Y61.k BannerInfo bannerInfo, int i12, @Y61.l String str, @Y61.k BannerEvent.Type type) {
        a(bannerInfo, EventBitmask.Bit.f87910c, new e(bannerInfo, this, type, str, i12));
    }

    public final void a(BannerInfo bannerInfo, EventBitmask.Bit bit, Y41.a<G0> aVar) {
        String str = (String) bannerInfo.f87870E.getValue();
        EventBitmask eventBitmask = (EventBitmask) this.f87907g.getOrDefault(str, f87901i);
        C30828i c30828i = this.f87905e;
        c30828i.getClass();
        kotlin.reflect.n<Object> nVar = C30828i.f164256k[5];
        boolean zBooleanValue = ((Boolean) c30828i.f164262g.a().invoke()).booleanValue();
        byte b12 = bit.f87920b;
        if (zBooleanValue && ((byte) (eventBitmask.f87909b & b12)) == b12) {
            return;
        }
        if (zBooleanValue) {
            this.f87907g.put(str, new EventBitmask((byte) (b12 | eventBitmask.f87909b)));
        }
        aVar.invoke();
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void d5(@Y61.k String str, @Y61.k BannerInfo bannerInfo) {
        this.f87903c.c(new tb.m(bannerInfo, str, this.f87908h, 4776, 7));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void g5(@Y61.k String str, @Y61.k BannerInfo bannerInfo) {
        this.f87903c.c(new C48634e(bannerInfo, str, this.f87908h, 4785, 7));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void j6(@Y61.k String str, @Y61.k BannerInfo bannerInfo) {
        this.f87903c.c(new tb.l(bannerInfo, str, this.f87908h, 4786, 7));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void k4(@Y61.k String str, @Y61.k BannerInfo bannerInfo) {
        this.f87903c.c(new C48633d(bannerInfo, str, this.f87908h, 4784, 7));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void m4(@Y61.k BannerInfo bannerInfo, @Y61.l com.avito.android.advertising.b bVar, @Y61.l Integer num, @Y61.k BannerEvent.Type type) {
        a(bannerInfo, EventBitmask.Bit.f87912e, new c(bannerInfo, this, type, bVar, num));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void n5(@Y61.k BannerInfo bannerInfo, @Y61.l Integer num, @Y61.l String str) {
        a(bannerInfo, EventBitmask.Bit.f87916i, new h(bannerInfo, num, str));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void o0(int i12, @Y61.k BannerInfo bannerInfo, @Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        this.f87903c.c(new C48631b(bannerInfo, this.f87902b, str, i12, str2, str3));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void o6(@Y61.k BannerInfo bannerInfo, @Y61.l Integer num, boolean z12, @Y61.l Throwable th2, @Y61.l String str, @Y61.l Integer num2, @Y61.k BannerEvent.Type type) {
        a(bannerInfo, EventBitmask.Bit.f87915h, new d(th2, num2, this, bannerInfo, z12, num, type, str));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void r3(@Y61.k BannerInfo bannerInfo, int i12, @Y61.k BannerEvent.Type type) {
        a(bannerInfo, EventBitmask.Bit.f87911d, new b(bannerInfo, this, i12, type));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void u3(@Y61.k BannerInfo bannerInfo, int i12) {
        BannerEvent.Type type = BannerEvent.Type.f87773b;
        a(bannerInfo, EventBitmask.Bit.f87917j, new k(bannerInfo, this, i12));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void z0(@Y61.k BannerInfo bannerInfo, @Y61.l Integer num, @Y61.k BannerEvent.Type type) {
        if (bannerInfo.e()) {
            this.f87904d.getClass();
            this.f87903c.c(new com.avito.android.advertising.analytics.events.e(bannerInfo, this.f87902b, this.f87906f, num, type, System.currentTimeMillis(), 3969, 7));
        }
    }

    public /* synthetic */ CommercialBannersAnalyticsInteractorImpl(BannerPageSource bannerPageSource, InterfaceC28373a interfaceC28373a, com.avito.android.server_time.a aVar, C30828i c30828i, String str, Kundle kundle, com.avito.android.account.E e12, int i12, C42822w c42822w) {
        this(bannerPageSource, interfaceC28373a, aVar, c30828i, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? null : kundle, e12);
    }
}
