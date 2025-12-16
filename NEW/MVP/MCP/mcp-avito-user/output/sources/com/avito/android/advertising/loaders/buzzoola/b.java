package com.avito.android.advertising.loaders.buzzoola;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.net.Uri;
import com.avito.android.remote.model.advertising.BuzzoolaAdType;
import com.avito.android.remote.model.advertising.BuzzoolaPromoType;
import com.avito.android.remote.model.advertising.BuzzoolaRawAsset;
import com.avito.android.remote.model.advertising.BuzzoolaRawConfig;
import com.avito.android.util.C35787f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ob.C44743g;

/* compiled from: BuzzoolaBannerConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/b;", "Lcom/avito/android/advertising/loaders/buzzoola/a;", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.advertising.loaders.buzzoola.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public String f88312a;

    /* compiled from: BuzzoolaBannerConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88313a;

        static {
            int[] iArr = new int[BuzzoolaAdType.values().length];
            try {
                iArr[BuzzoolaAdType.AVITO_DIRECT_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BuzzoolaAdType.AVITO_PREMIUM_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BuzzoolaAdType.AVITO_PREMIUM_BANNER_V2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BuzzoolaAdType.AVITO_CREDIT_BUTTON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BuzzoolaAdType.AVITO_VIDEO_LENTA_MEDIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BuzzoolaAdType.AVITO_VIDEO_LENTA_NATIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BuzzoolaAdType.AVITO_MAIN_MEDIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BuzzoolaAdType.AVITO_MAIN_HTML.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BuzzoolaAdType.AVITO_DIRECT_BANNER_HTML.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BuzzoolaAdType.AVITO_PREMIUM_MEDIA_X2_BANNER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f88313a = iArr;
        }
    }

    @Inject
    public b() {
    }

    public static String e(List list) {
        String strL = l("juristic_info", list);
        if (strL != null) {
            return strL;
        }
        throw new BuzzoolaAssetNotFoundException("juristic_info");
    }

    public static BuzzoolaButton f(List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((BuzzoolaRawAsset) next).getType(), "button")) {
                break;
            }
        }
        BuzzoolaRawAsset buzzoolaRawAsset = (BuzzoolaRawAsset) next;
        Object value = buzzoolaRawAsset != null ? buzzoolaRawAsset.getValue() : null;
        String str = value instanceof String ? (String) value : null;
        if (str == null) {
            return null;
        }
        Map<String, Object> ext = buzzoolaRawAsset.getExt();
        Object obj = ext != null ? ext.get("is_app_install") : null;
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        return new BuzzoolaButton(str, bool != null ? bool.booleanValue() : false);
    }

    public static String g(BuzzoolaRawConfig buzzoolaRawConfig) {
        String domain = buzzoolaRawConfig.getDomain();
        if (domain == null || domain.length() == 0) {
            return null;
        }
        return C44743g.b(domain);
    }

    public static Float h(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((BuzzoolaRawAsset) next).getType(), str)) {
                break;
            }
        }
        BuzzoolaRawAsset buzzoolaRawAsset = (BuzzoolaRawAsset) next;
        Object value = buzzoolaRawAsset != null ? buzzoolaRawAsset.getValue() : null;
        Double d12 = value instanceof Double ? (Double) value : null;
        if (d12 != null) {
            return Float.valueOf((float) d12.doubleValue());
        }
        Object value2 = buzzoolaRawAsset != null ? buzzoolaRawAsset.getValue() : null;
        Float f12 = value2 instanceof Float ? (Float) value2 : null;
        if (f12 != null) {
            return Float.valueOf(f12.floatValue());
        }
        Object value3 = buzzoolaRawAsset != null ? buzzoolaRawAsset.getValue() : null;
        String str2 = value3 instanceof String ? (String) value3 : null;
        if (str2 != null) {
            return C43066x.x0(str2);
        }
        return null;
    }

    public static ArrayList i(List list) {
        ArrayList arrayList;
        Object next;
        Iterator it = list.iterator();
        while (true) {
            arrayList = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((BuzzoolaRawAsset) next).getType(), "image_list")) {
                break;
            }
        }
        BuzzoolaRawAsset buzzoolaRawAsset = (BuzzoolaRawAsset) next;
        Object value = buzzoolaRawAsset != null ? buzzoolaRawAsset.getValue() : null;
        List list2 = value instanceof List ? (List) value : null;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (obj instanceof String) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Uri.parse((String) it2.next()));
            }
        }
        return arrayList;
    }

    public static Integer j(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((BuzzoolaRawAsset) next).getType(), str)) {
                break;
            }
        }
        BuzzoolaRawAsset buzzoolaRawAsset = (BuzzoolaRawAsset) next;
        Object value = buzzoolaRawAsset != null ? buzzoolaRawAsset.getValue() : null;
        Integer num = value instanceof Integer ? (Integer) value : null;
        if (num != null) {
            return Integer.valueOf(num.intValue());
        }
        Object value2 = buzzoolaRawAsset != null ? buzzoolaRawAsset.getValue() : null;
        Long l12 = value2 instanceof Long ? (Long) value2 : null;
        if (l12 != null) {
            return Integer.valueOf((int) l12.longValue());
        }
        Object value3 = buzzoolaRawAsset != null ? buzzoolaRawAsset.getValue() : null;
        String str2 = value3 instanceof String ? (String) value3 : null;
        if (str2 != null) {
            return C43066x.y0(str2);
        }
        return null;
    }

    @SuppressLint({"CustomColorsKotlin"})
    public static BuzzoolaLegal k(List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((BuzzoolaRawAsset) next).getType(), "legal")) {
                break;
            }
        }
        BuzzoolaRawAsset buzzoolaRawAsset = (BuzzoolaRawAsset) next;
        if (buzzoolaRawAsset == null) {
            return null;
        }
        Object value = buzzoolaRawAsset.getValue();
        String str = value instanceof String ? (String) value : null;
        if (str == null) {
            return null;
        }
        Map<String, Object> ext = buzzoolaRawAsset.getExt();
        Object obj = ext != null ? ext.get("text_color") : null;
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 == null) {
            throw new BuzzoolaAssetNotFoundException("text_color");
        }
        Map<String, Object> ext2 = buzzoolaRawAsset.getExt();
        Object obj2 = ext2 != null ? ext2.get("text_color_hover") : null;
        String str3 = obj2 instanceof String ? (String) obj2 : null;
        if (str3 != null) {
            return new BuzzoolaLegal(str, Color.parseColor(str2), Color.parseColor(str3));
        }
        throw new BuzzoolaAssetNotFoundException("text_color_hover");
    }

    public static String l(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((BuzzoolaRawAsset) next).getType(), str)) {
                break;
            }
        }
        BuzzoolaRawAsset buzzoolaRawAsset = (BuzzoolaRawAsset) next;
        Object value = buzzoolaRawAsset != null ? buzzoolaRawAsset.getValue() : null;
        if (value instanceof String) {
            return (String) value;
        }
        return null;
    }

    public static Uri m(String str, List list) {
        String strL = l(str, list);
        if (strL != null) {
            return Uri.parse(strL);
        }
        return null;
    }

    public static BuzzoolaPromoType n(BuzzoolaRawConfig buzzoolaRawConfig) {
        BuzzoolaPromoType promoType = buzzoolaRawConfig.getPromoType();
        if (promoType != null) {
            return promoType;
        }
        throw new BuzzoolaConfigNotFoundException("promo_type");
    }

    public static String o(String str, String str2) {
        return C43066x.a0(str, "{advid}", str2, false);
    }

    public static BuzzoolaTextWithColor p(String str, List list) {
        Integer numA;
        Object next;
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            numA = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((BuzzoolaRawAsset) next).getType(), str)) {
                break;
            }
        }
        BuzzoolaRawAsset buzzoolaRawAsset = (BuzzoolaRawAsset) next;
        Object value = buzzoolaRawAsset != null ? buzzoolaRawAsset.getValue() : null;
        String str2 = value instanceof String ? (String) value : null;
        if (str2 == null) {
            str2 = "";
        }
        if (buzzoolaRawAsset != null) {
            try {
                Map<String, Object> ext = buzzoolaRawAsset.getExt();
                if (ext != null && (obj = ext.get("text_color")) != null) {
                    numA = C35787f0.a((String) obj);
                }
            } catch (Throwable unused) {
            }
        }
        return new BuzzoolaTextWithColor(str2, numA);
    }

    @Override // com.avito.android.advertising.loaders.buzzoola.a
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getF88312a() {
        return this.f88312a;
    }

    @Override // com.avito.android.advertising.loaders.buzzoola.a
    @Y61.k
    public final com.google.gson.k b(@Y61.l Map<String, ? extends Object> map) {
        com.google.gson.k kVar = new com.google.gson.k();
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Number) {
                    kVar.w((Number) value, key);
                } else if (value instanceof String) {
                    kVar.y(key, (String) value);
                } else if (value instanceof Collection) {
                    com.google.gson.f fVar = new com.google.gson.f();
                    for (Object obj : (Iterable) value) {
                        if (obj instanceof Number) {
                            Number number = (Number) obj;
                            fVar.f362000b.add(number == null ? com.google.gson.j.f362193b : new com.google.gson.m(number));
                        } else if (obj instanceof String) {
                            fVar.v((String) obj);
                        }
                    }
                    kVar.t(key, fVar);
                }
            }
        }
        String str = this.f88312a;
        if (str != null) {
            kVar.y("ifa", str);
        }
        return kVar;
    }

    @Override // com.avito.android.advertising.loaders.buzzoola.a
    public final void c(@Y61.l String str) {
        this.f88312a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0253  */
    @Override // com.avito.android.advertising.loaders.buzzoola.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner d(@Y61.k com.avito.android.remote.model.advertising.BuzzoolaRawResponse r39) {
        /*
            Method dump skipped, instructions count: 1542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advertising.loaders.buzzoola.b.d(com.avito.android.remote.model.advertising.BuzzoolaRawResponse):com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner");
    }
}
