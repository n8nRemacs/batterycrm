package com.avito.android.advertising.loaders.beduin;

import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.adapter.items.avito.AvitoNetworkImageBannerItem;
import com.avito.android.advertising.adapter.items.avito.bdui.AvitoNetworkBDUIBannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.BuzzoolaDirectBannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.CommercialHtmlBannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.media_x2.BuzzoolaMediaX2BannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.premium.BuzzoolaPremiumBannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.premium_v2.BuzzoolaPremiumV2BannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoBannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoGalleryBannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.video.CommercialVideoBannerItem;
import com.avito.android.advertising.adapter.items.yandex.YandexBannerItem;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.InterfaceC28345a;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.util.C35755b0;
import com.avito.beduin.v2.engine.C36272i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CommercialBDUIBannerGetInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advertising_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advertising.loaders.beduin.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28355i {

    /* compiled from: CommercialBDUIBannerGetInteractionHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advertising.loaders.beduin.i$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AdViewType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AdViewType adViewType = AdViewType.f86908b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AdViewType adViewType2 = AdViewType.f86908b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AdViewType adViewType3 = AdViewType.f86908b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: CommercialBDUIBannerGetInteractionHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advertising.loaders.beduin.i$b */
    public static final class b implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f88141b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l lVar) {
            this.f88141b = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final /* synthetic */ void accept(Object obj) {
            this.f88141b.invoke(obj);
        }
    }

    @Y61.k
    public static final com.avito.beduin.v2.engine.field.entity.A a(@Y61.k C36272i c36272i) {
        return new com.avito.beduin.v2.engine.field.entity.A(new com.avito.beduin.v2.engine.field.m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("isError", c36272i.f(true)), new Q("elementType", c36272i.e("advBannerError"))}), null, 2, null);
    }

    @Y61.k
    public static final com.avito.beduin.v2.engine.field.entity.A b(@Y61.k CommercialItem commercialItem, @Y61.k C36272i c36272i, @Y61.l com.avito.beduin.v2.engine.field.entity.A a12) {
        BannerInfo f74925c;
        String strConcat;
        com.avito.beduin.v2.engine.field.m mVar;
        InterfaceC28345a interfaceC28345a = commercialItem instanceof InterfaceC28345a ? (InterfaceC28345a) commercialItem : null;
        if (interfaceC28345a == null || (f74925c = interfaceC28345a.getF74925c()) == null) {
            throw new RuntimeException("CommercialBDUIBannerGetInteractionHandler: bannerInfo is null item: ".concat(commercialItem.getClass().getName()));
        }
        com.avito.android.advertising.h hVar = commercialItem instanceof com.avito.android.advertising.h ? (com.avito.android.advertising.h) commercialItem : null;
        if (hVar == null) {
            throw new RuntimeException("CommercialBDUIBannerGetInteractionHandler: unavailable banner, bannerCode: " + f74925c.getBannerCode() + ", blockId: " + f74925c.c());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (commercialItem instanceof YandexBannerItem) {
            strConcat = "advBannerYandex_".concat(c((pb.e) commercialItem));
        } else if (commercialItem instanceof BuzzoolaDirectBannerItem) {
            strConcat = "advBannerBuzzoola3p_".concat(c((pb.e) commercialItem));
        } else if (commercialItem instanceof BuzzoolaMediaX2BannerItem) {
            strConcat = "advBannerBuzzoolaMediaX2";
        } else if (commercialItem instanceof BuzzoolaPremiumBannerItem) {
            strConcat = "advBannerBuzzoolaPremium_".concat(c((pb.e) commercialItem));
        } else if (commercialItem instanceof BuzzoolaPremiumV2BannerItem) {
            strConcat = "advBannerBuzzoolaPremiumV2";
        } else if (commercialItem instanceof CommercialVideoBannerItem) {
            strConcat = "advBannerVideo";
        } else if (commercialItem instanceof CommercialHtmlBannerItem) {
            strConcat = "advBannerHtml";
        } else if (commercialItem instanceof AvitoNetworkBDUIBannerItem) {
            strConcat = "advBannerBdui_" + ((AvitoNetworkBDUIBannerItem) commercialItem).f87014i.f87963c;
        } else {
            strConcat = commercialItem instanceof AvitoNetworkImageBannerItem ? "advBannerImage_".concat(c((pb.e) commercialItem)) : commercialItem instanceof ProfilePromoBannerItem ? "advBannerProfilePromo" : commercialItem instanceof ProfilePromoGalleryBannerItem ? "advBannerProfilePromoGallery" : "advBannerError";
        }
        linkedHashMap.put("elementType", c36272i.e(strConcat));
        LinkedHashMap linkedHashMapK = P0.k(f74925c.g(), f74925c.f());
        AvitoNetworkBanner.AnalyticsParams analyticsParams = f74925c.f87866A;
        Map mapL = P0.l(P0.l(P0.l(linkedHashMapK, new Q("adv_click_id", analyticsParams != null ? analyticsParams.f87959f : null)), new Q("from_block", 0)), new Q("req_num", Integer.valueOf(f74925c.f87886q + 1)));
        Map<String, com.avito.beduin.v2.engine.field.d> mapC = (a12 == null || (mVar = a12.f336778b) == null) ? null : mVar.f336870a;
        if (mapC == null) {
            mapC = P0.c();
        }
        LinkedHashMap linkedHashMapK2 = P0.k(mapL, mapC);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMapK2.size()));
        for (Map.Entry entry : linkedHashMapK2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap2.put(key, value instanceof String ? c36272i.e((String) value) : value instanceof Long ? c36272i.d(((Number) value).longValue()) : value instanceof Boolean ? c36272i.f(((Boolean) value).booleanValue()) : value instanceof Integer ? c36272i.c(((Number) value).intValue()) : value instanceof Float ? c36272i.b(((Number) value).floatValue()) : value instanceof Double ? c36272i.a(((Number) value).doubleValue()) : value instanceof com.avito.beduin.v2.engine.field.entity.v ? (com.avito.beduin.v2.engine.field.entity.v) value : null);
        }
        linkedHashMap.put("analytics", new com.avito.beduin.v2.engine.field.entity.A(new com.avito.beduin.v2.engine.field.m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("eventParams", new com.avito.beduin.v2.engine.field.entity.A(new com.avito.beduin.v2.engine.field.m(C35755b0.c(linkedHashMap2)), null, 2, null)), new Q("startLoadTime", c36272i.d(f74925c.f87885p))}), null, 2, null));
        if (hVar instanceof AvitoNetworkBDUIBannerItem) {
            AvitoNetworkBanner.BDUI bdui = ((AvitoNetworkBDUIBannerItem) hVar).f87014i;
            Map<String, Object> map = bdui.f87962b;
            if (map == null) {
                StringBuilder sb2 = new StringBuilder("CommercialBDUIBannerGetInteractionHandler: content is empty, creativeId:");
                sb2.append(analyticsParams != null ? analyticsParams.f87955b : null);
                sb2.append(", campaignId:");
                sb2.append(analyticsParams != null ? analyticsParams.f87956c : null);
                throw new RuntimeException(sb2.toString());
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(P0.f(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                String str = value2 instanceof String ? (String) value2 : null;
                linkedHashMap3.put(key2, str != null ? c36272i.e(str) : null);
            }
            linkedHashMap.put("bdUIParams", new com.avito.beduin.v2.engine.field.entity.A(new com.avito.beduin.v2.engine.field.m((Map<String, ? extends com.avito.beduin.v2.engine.field.d>) P0.l(C35755b0.c(linkedHashMap3), new Q("templateType", c36272i.e(bdui.f87963c)))), null, 2, null));
        } else {
            linkedHashMap.put("localDataId", c36272i.e(f74925c.f87871b));
        }
        return new com.avito.beduin.v2.engine.field.entity.A(new com.avito.beduin.v2.engine.field.m(linkedHashMap), null, 2, null);
    }

    public static final String c(pb.e eVar) {
        int iOrdinal = eVar.getAdViewType().ordinal();
        if (iOrdinal == 0) {
            return "list";
        }
        if (iOrdinal == 1) {
            return "grid";
        }
        if (iOrdinal == 2) {
            return "big";
        }
        if (iOrdinal == 3) {
            return "single";
        }
        throw new NoWhenBranchMatchedException();
    }
}
