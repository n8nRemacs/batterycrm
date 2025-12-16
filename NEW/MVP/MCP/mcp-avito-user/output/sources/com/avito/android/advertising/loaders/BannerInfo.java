package com.avito.android.advertising.loaders;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.LoadedNetworkBanner;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.remote.model.advertising.AdNetworkBannerItem;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerItem;
import com.avito.android.remote.model.advertising.BuzzoolaNetworkBannerItem;
import com.avito.android.remote.model.advertising.MyTargetNetworkBannerItem;
import com.avito.android.remote.model.advertising.YandexNetworkBannerItem;
import com.avito.android.util.V2;
import com.avito.konveyor.item_visibility_tracker.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: BannerInfoContainer.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/BannerInfo;", "Landroid/os/Parcelable;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "a", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BannerInfo implements Parcelable, b.InterfaceC10495b {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final AvitoNetworkBanner.AnalyticsParams f87866A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final Map<String, ? extends Object> f87867B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f87868C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f87869D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f87870E;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f87871b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f87872c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f87873d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f87874e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f87875f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f87876g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f87877h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f87878i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f87879j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f87880k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f87881l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f87882m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f87883n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final Integer f87884o;

    /* renamed from: p, reason: collision with root package name */
    public final long f87885p;

    /* renamed from: q, reason: collision with root package name */
    public final int f87886q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f87887r;

    /* renamed from: s, reason: collision with root package name */
    public final long f87888s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f87889t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f87890u;

    /* renamed from: v, reason: collision with root package name */
    public int f87891v;

    /* renamed from: w, reason: collision with root package name */
    public final long f87892w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public Integer f87893x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final Integer f87894y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final Integer f87895z;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public static final a f87863F = new a(null);

    @Y61.k
    public static final Parcelable.Creator<BannerInfo> CREATOR = new b();

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public static final Object f87864G = P0.g(new Q("blockId", "block_id"), new Q("bannerCode", "banner_code"), new Q("bannerPagetype", "banner_pagetype"), new Q("bannerPageType", "banner_pagetype"), new Q("sellingSystem", "selling_system"), new Q("advRequestId", "adv_request_id"));

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public static final BannerInfo f87865H = new BannerInfo("", "", null, null, null, null, null, "", "", "", "", null, null, null, 0, 0, false, 0, false, false, 0, 0, null, null, null, null, null, 134215680, null);

    /* compiled from: BannerInfoContainer.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advertising/loaders/BannerInfo$a;", "", "<init>", "()V", "", "", "keyTransformMap", "Ljava/util/Map;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static BannerInfo b(@Y61.k String str, long j12, @Y61.l AvitoNetworkBanner.AnalyticsParams analyticsParams, @Y61.l Map map) {
            return new BannerInfo(str, null, null, null, null, null, null, null, null, null, null, null, null, null, j12, 0, false, 0L, false, false, 0, 0L, null, null, null, analyticsParams, map, 33538046, null);
        }

        public static BannerInfo c(a aVar, String str, AdNetworkBannerItem adNetworkBannerItem, long j12, Integer num, int i12, boolean z12, long j13, boolean z13, boolean z14, long j14, String str2, Map map, LoadedNetworkBanner loadedNetworkBanner, com.avito.android.advertising.b bVar, Integer num2, int i13) {
            long j15 = (i13 & 64) != 0 ? 0L : j13;
            boolean z15 = (i13 & 128) != 0 ? false : z13;
            boolean z16 = (i13 & 256) != 0 ? false : z14;
            long j16 = (i13 & 512) != 0 ? -1L : j14;
            String str3 = (i13 & 1024) != 0 ? null : str2;
            LoadedNetworkBanner loadedNetworkBanner2 = (i13 & 4096) != 0 ? null : loadedNetworkBanner;
            com.avito.android.advertising.b bVar2 = (i13 & 8192) != 0 ? null : bVar;
            Integer num3 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num2;
            aVar.getClass();
            if (bVar2 == null) {
                bVar2 = loadedNetworkBanner2 != null ? loadedNetworkBanner2.f86903f : null;
            }
            if (adNetworkBannerItem instanceof AvitoNetworkBannerItem) {
                AvitoNetworkBanner avitoNetworkBanner = bVar2 instanceof AvitoNetworkBanner ? (AvitoNetworkBanner) bVar2 : null;
                AvitoNetworkBannerItem avitoNetworkBannerItem = (AvitoNetworkBannerItem) adNetworkBannerItem;
                String blockId2 = avitoNetworkBannerItem.getBlockId();
                String alid = adNetworkBannerItem.getAlid();
                String bannerCode = adNetworkBannerItem.getBannerCode();
                String categoryId = adNetworkBannerItem.getCategoryId();
                String microCategoryId = adNetworkBannerItem.getMicroCategoryId();
                String locationId = adNetworkBannerItem.getLocationId();
                String blockId22 = avitoNetworkBannerItem.getBlockId();
                Integer numT = avitoNetworkBanner != null ? avitoNetworkBanner.T() : null;
                AvitoNetworkBanner.AnalyticsParams analyticParams = avitoNetworkBanner != null ? avitoNetworkBanner.getF88026n() : null;
                Map<String, Object> params = avitoNetworkBannerItem.getParams();
                return new BannerInfo(str, blockId2, alid, bannerCode, categoryId, microCategoryId, locationId, "", "", "avito", blockId22, null, str3, num, j12, i12, z12, j15, z15, z16, 0, j16, null, numT, num3, analyticParams, d(map, params != null ? params.get("advRequestId") : null), 5244928, null);
            }
            if (adNetworkBannerItem instanceof YandexNetworkBannerItem) {
                YandexNetworkBannerItem yandexNetworkBannerItem = (YandexNetworkBannerItem) adNetworkBannerItem;
                return new BannerInfo(str, yandexNetworkBannerItem.getBlockId(), adNetworkBannerItem.getAlid(), adNetworkBannerItem.getBannerCode(), adNetworkBannerItem.getCategoryId(), adNetworkBannerItem.getMicroCategoryId(), adNetworkBannerItem.getLocationId(), yandexNetworkBannerItem.getPartnerId(), yandexNetworkBannerItem.getStatId(), "yandex", "6_" + C43066x.U("R-M-", yandexNetworkBannerItem.getBlockId()) + '-' + yandexNetworkBannerItem.getStatId() + "-rtb", null, str3, num, j12, i12, z12, j15, z15, z16, 0, j16, null, null, num3, null, map, 47187968, null);
            }
            if (adNetworkBannerItem instanceof MyTargetNetworkBannerItem) {
                MyTargetNetworkBannerItem myTargetNetworkBannerItem = (MyTargetNetworkBannerItem) adNetworkBannerItem;
                return new BannerInfo(str, String.valueOf(myTargetNetworkBannerItem.getBlockId().intValue()), adNetworkBannerItem.getAlid(), adNetworkBannerItem.getBannerCode(), adNetworkBannerItem.getCategoryId(), adNetworkBannerItem.getMicroCategoryId(), adNetworkBannerItem.getLocationId(), "", "", "myTarget", "9_" + myTargetNetworkBannerItem.getBlockId().intValue(), null, str3, num, j12, i12, z12, j15, z15, z16, 0, j16, null, null, num3, null, map, 47187968, null);
            }
            if (!(adNetworkBannerItem instanceof BuzzoolaNetworkBannerItem)) {
                V2.f318762a.d("BannerInfo", "EMPTY BannerInfo returned");
                return BannerInfo.f87865H;
            }
            BuzzoolaBanner buzzoolaBanner = bVar2 instanceof BuzzoolaBanner ? (BuzzoolaBanner) bVar2 : null;
            BuzzoolaNetworkBannerItem buzzoolaNetworkBannerItem = (BuzzoolaNetworkBannerItem) adNetworkBannerItem;
            String blockId23 = buzzoolaNetworkBannerItem.getBlockId();
            String alid2 = adNetworkBannerItem.getAlid();
            String bannerCode2 = adNetworkBannerItem.getBannerCode();
            String categoryId2 = adNetworkBannerItem.getCategoryId();
            String microCategoryId2 = adNetworkBannerItem.getMicroCategoryId();
            String locationId2 = adNetworkBannerItem.getLocationId();
            String blockId24 = buzzoolaNetworkBannerItem.getBlockId();
            String strZ4 = buzzoolaBanner != null ? buzzoolaBanner.Z4() : null;
            Integer numT2 = buzzoolaBanner != null ? buzzoolaBanner.T() : null;
            Map<String, Object> params2 = buzzoolaNetworkBannerItem.getParams();
            return new BannerInfo(str, blockId23, alid2, bannerCode2, categoryId2, microCategoryId2, locationId2, "", "", "buzzoola", blockId24, strZ4, str3, num, j12, i12, z12, j15, z15, z16, 0, j16, null, numT2, num3, null, d(map, params2 != null ? params2.get("advRequestId") : null), 38797312, null);
        }

        public static Map d(Map map, Object obj) {
            if ((map == null && obj == null) || obj == null) {
                return map;
            }
            if (map instanceof HashMap) {
                ((HashMap) map).put("adv_request_id", obj);
                return map;
            }
            if (map == null) {
                map = P0.c();
            }
            HashMap map2 = new HashMap(map);
            map2.put("adv_request_id", obj);
            return map2;
        }

        @Y61.k
        public final BannerInfo a(@Y61.k CommercialBanner commercialBanner, @Y61.l com.avito.android.advertising.b bVar, @Y61.l Integer num) {
            boolean zBooleanValue;
            LoadedNetworkBanner loadedNetworkBanner = commercialBanner.f86892i;
            com.avito.android.advertising.b bVar2 = bVar == null ? loadedNetworkBanner != null ? loadedNetworkBanner.f86903f : null : bVar;
            Object objT = bVar2 != null ? bVar2.T() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(commercialBanner.f86885b);
            if (objT == null) {
                objT = "";
            }
            sb2.append(objT);
            String string = sb2.toString();
            AdNetworkBannerItem<?> adNetworkBannerItemC = commercialBanner.c();
            boolean zBooleanValue2 = false;
            int i12 = loadedNetworkBanner != null ? loadedNetworkBanner.f86900c : 0;
            long j12 = loadedNetworkBanner != null ? loadedNetworkBanner.f86901d : 0L;
            if (loadedNetworkBanner != null) {
                Boolean bool = loadedNetworkBanner.f86902e.get(string + "_isOpened");
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            } else {
                zBooleanValue = false;
            }
            if (loadedNetworkBanner != null) {
                Boolean bool2 = loadedNetworkBanner.f86902e.get(string + "_isOnScreen");
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                }
            }
            return c(this, commercialBanner.f86885b, adNetworkBannerItemC, commercialBanner.f86889f, commercialBanner.f86890g, i12, commercialBanner.f86887d, j12, zBooleanValue, zBooleanValue2, 0L, commercialBanner.f86891h, commercialBanner.f86888e, commercialBanner.f86892i, bVar2, num, 512);
        }

        public a() {
        }
    }

    /* compiled from: BannerInfoContainer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BannerInfo> {
        @Override // android.os.Parcelable.Creator
        public final BannerInfo createFromParcel(Parcel parcel) {
            Integer num;
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            long j12 = parcel.readLong();
            int i12 = parcel.readInt();
            boolean z12 = parcel.readInt() != 0;
            long j13 = parcel.readLong();
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            long j14 = parcel.readLong();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            AvitoNetworkBanner.AnalyticsParams analyticsParamsCreateFromParcel = parcel.readInt() == 0 ? null : AvitoNetworkBanner.AnalyticsParams.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                num = numValueOf;
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                num = numValueOf;
                int iC2 = 0;
                while (iC2 != i14) {
                    iC2 = org.webrtc.h.c(BannerInfo.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new BannerInfo(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, num, j12, i12, z12, j13, z13, z14, i13, j14, numValueOf2, numValueOf3, numValueOf4, analyticsParamsCreateFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BannerInfo[] newArray(int i12) {
            return new BannerInfo[i12];
        }
    }

    /* compiled from: BannerInfoContainer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Long> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Long invoke() {
            String str;
            BannerInfo bannerInfo = BannerInfo.this;
            long j12 = 31;
            long jHashCode = (((bannerInfo.c().hashCode() * j12) + bannerInfo.f87885p) * j12) + bannerInfo.f87888s;
            if (bannerInfo.getAlid() != null) {
                jHashCode = (jHashCode * j12) + r5.hashCode();
            }
            AvitoNetworkBanner.AnalyticsParams analyticsParams = bannerInfo.f87866A;
            if (analyticsParams != null && (str = analyticsParams.f87955b) != null) {
                jHashCode = (jHashCode * j12) + str.hashCode();
            }
            return Long.valueOf(jHashCode);
        }
    }

    /* compiled from: BannerInfoContainer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<String> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return String.valueOf(BannerInfo.this.getF278855n());
        }
    }

    /* compiled from: BannerInfoContainer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<String> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            a aVar = BannerInfo.f87863F;
            BannerInfo bannerInfo = BannerInfo.this;
            String str = bannerInfo.f87871b;
            aVar.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            Object obj = bannerInfo.f87894y;
            if (obj == null) {
                obj = "";
            }
            sb2.append(obj);
            return sb2.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public BannerInfo(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.k String str8, @Y61.k String str9, @Y61.k String str10, @Y61.k String str11, @Y61.l String str12, @Y61.l String str13, @Y61.l Integer num, long j12, int i12, boolean z12, long j13, boolean z13, boolean z14, int i13, long j14, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4, @Y61.l AvitoNetworkBanner.AnalyticsParams analyticsParams, @Y61.l Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap;
        this.f87871b = str;
        this.f87872c = str2;
        this.f87873d = str3;
        this.f87874e = str4;
        this.f87875f = str5;
        this.f87876g = str6;
        this.f87877h = str7;
        this.f87878i = str8;
        this.f87879j = str9;
        this.f87880k = str10;
        this.f87881l = str11;
        this.f87882m = str12;
        this.f87883n = str13;
        this.f87884o = num;
        this.f87885p = j12;
        this.f87886q = i12;
        this.f87887r = z12;
        this.f87888s = j13;
        this.f87889t = z13;
        this.f87890u = z14;
        this.f87891v = i13;
        this.f87892w = j14;
        this.f87893x = num2;
        this.f87894y = num3;
        this.f87895z = num4;
        this.f87866A = analyticsParams;
        this.f87867B = map;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(P0.f(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str14 = (String) f87864G.get(entry.getKey());
                if (str14 == null) {
                    str14 = (String) entry.getKey();
                }
                linkedHashMap.put(str14, entry.getValue());
            }
        } else {
            linkedHashMap = null;
        }
        this.f87867B = linkedHashMap;
        this.f87868C = C42727D.c(new e());
        this.f87869D = C42727D.c(new c());
        this.f87870E = C42727D.c(new d());
    }

    @Y61.k
    public final String c() {
        Object obj;
        Map<String, ? extends Object> map = this.f87867B;
        if (map == null || (obj = map.get("block_id")) == null) {
            obj = this.f87872c;
        }
        String str = obj instanceof String ? (String) obj : null;
        return str == null ? "" : str;
    }

    @Y61.k
    public final String d() {
        Object obj;
        Map<String, ? extends Object> map = this.f87867B;
        if (map == null || (obj = map.get("selling_system")) == null) {
            obj = this.f87880k;
        }
        String str = obj instanceof String ? (String) obj : null;
        return str == null ? "" : str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return (getAlid() == null || getBannerCode() == null) ? false : true;
    }

    @Y61.k
    public final LinkedHashMap f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AvitoNetworkBanner.AnalyticsParams analyticsParams = this.f87866A;
        if (analyticsParams != null) {
            String str = analyticsParams.f87955b;
            if (str != null) {
                linkedHashMap.put("adv_creative_id", str);
            }
            String str2 = analyticsParams.f87956c;
            if (str2 != null) {
                linkedHashMap.put("adv_campaign_id", str2);
            }
            String str3 = analyticsParams.f87957d;
            if (str3 != null) {
                linkedHashMap.put("template_type_id", str3);
            }
            linkedHashMap.put("url_click_in", Integer.valueOf(analyticsParams.f87961h ? 1 : 0));
        }
        return linkedHashMap;
    }

    @Y61.k
    public final LinkedHashMap g() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.f87878i;
        if (str.length() > 0) {
            linkedHashMap.put("adpartner", str);
        }
        String str2 = this.f87872c;
        if (str2.length() > 0) {
            linkedHashMap.put("block_id", str2);
        }
        String str3 = this.f87880k;
        if (str3.length() > 0) {
            linkedHashMap.put("selling_system", str3);
        }
        String str4 = this.f87881l;
        if (str4.length() > 0) {
            linkedHashMap.put("adslot", str4);
        }
        String str5 = this.f87879j;
        if (str5.length() > 0) {
            linkedHashMap.put("statid", str5);
        }
        if (str5.length() > 0) {
            linkedHashMap.put("statid", Integer.valueOf(Integer.parseInt(str5)));
        }
        String str6 = this.f87873d;
        if (str6 != null) {
            linkedHashMap.put("alid", str6);
        }
        String str7 = this.f87874e;
        if (str7 == null) {
            str7 = "app";
        }
        linkedHashMap.put("banner_code", str7);
        String str8 = this.f87875f;
        if (str8 != null) {
            linkedHashMap.put("cid", str8);
        }
        String str9 = this.f87876g;
        if (str9 != null) {
            linkedHashMap.put("mcid", str9);
        }
        String str10 = this.f87877h;
        if (str10 != null) {
            linkedHashMap.put("lid", str10);
        }
        Integer num = this.f87895z;
        if (num != null) {
            org.webrtc.h.i(num, "position", linkedHashMap);
        }
        Integer num2 = this.f87884o;
        if (num2 != null) {
            org.webrtc.h.i(num2, "page_number", linkedHashMap);
        }
        Map<String, ? extends Object> map = this.f87867B;
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    linkedHashMap.put(key, value);
                }
            }
        }
        return linkedHashMap;
    }

    @Y61.l
    public final String getAlid() {
        Object obj;
        Map<String, ? extends Object> map = this.f87867B;
        if (map == null || (obj = map.get("alid")) == null) {
            obj = this.f87873d;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Y61.l
    public final String getBannerCode() {
        Object obj;
        Map<String, ? extends Object> map = this.f87867B;
        if (map == null || (obj = map.get("banner_code")) == null) {
            obj = this.f87874e;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public final long getF278855n() {
        return ((Number) this.f87869D.getValue()).longValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f87871b);
        parcel.writeString(this.f87872c);
        parcel.writeString(this.f87873d);
        parcel.writeString(this.f87874e);
        parcel.writeString(this.f87875f);
        parcel.writeString(this.f87876g);
        parcel.writeString(this.f87877h);
        parcel.writeString(this.f87878i);
        parcel.writeString(this.f87879j);
        parcel.writeString(this.f87880k);
        parcel.writeString(this.f87881l);
        parcel.writeString(this.f87882m);
        parcel.writeString(this.f87883n);
        Integer num = this.f87884o;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeLong(this.f87885p);
        parcel.writeInt(this.f87886q);
        parcel.writeInt(this.f87887r ? 1 : 0);
        parcel.writeLong(this.f87888s);
        parcel.writeInt(this.f87889t ? 1 : 0);
        parcel.writeInt(this.f87890u ? 1 : 0);
        parcel.writeInt(this.f87891v);
        parcel.writeLong(this.f87892w);
        Integer num2 = this.f87893x;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.f87894y;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Integer num4 = this.f87895z;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
        AvitoNetworkBanner.AnalyticsParams analyticsParams = this.f87866A;
        if (analyticsParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analyticsParams.writeToParcel(parcel, i12);
        }
        Map<String, ? extends Object> map = this.f87867B;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
        }
    }

    public /* synthetic */ BannerInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, long j12, int i12, boolean z12, long j13, boolean z13, boolean z14, int i13, long j14, Integer num2, Integer num3, Integer num4, AvitoNetworkBanner.AnalyticsParams analyticsParams, Map map, int i14, C42822w c42822w) {
        this(str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : str7, (i14 & 128) != 0 ? "" : str8, (i14 & 256) != 0 ? "" : str9, (i14 & 512) != 0 ? "" : str10, (i14 & 1024) == 0 ? str11 : "", (i14 & 2048) != 0 ? null : str12, (i14 & 4096) != 0 ? null : str13, (i14 & 8192) != 0 ? null : num, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0L : j12, (32768 & i14) != 0 ? 0 : i12, (i14 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? false : z12, (i14 & 131072) == 0 ? j13 : 0L, (i14 & 262144) != 0 ? false : z13, (i14 & 524288) == 0 ? z14 : false, (i14 & 1048576) != 0 ? -1 : i13, (i14 & 2097152) != 0 ? -1L : j14, (i14 & 4194304) != 0 ? null : num2, (i14 & 8388608) != 0 ? null : num3, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : num4, (i14 & 33554432) != 0 ? null : analyticsParams, (i14 & 67108864) == 0 ? map : null);
    }
}
