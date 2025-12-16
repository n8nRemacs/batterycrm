package ru.cyberity.cbr.core.common;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: LocaleUtils.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R'\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0013\u001a\u00020\u0004*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/common/l0;", "", "<init>", "()V", "", "iso3CountryCode", "a", "(Ljava/lang/String;)Ljava/lang/String;", "", "Ljava/util/Locale;", "b", "Lkotlin/C;", "()Ljava/util/Map;", "localeMap", "", "c", "Ljava/util/Set;", "supportedRegions", "(Ljava/util/Locale;)Ljava/lang/String;", "languageWithRegion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final l0 f432743a = new l0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private static final InterfaceC42726C localeMap = C42727D.c(a.f432746a);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private static final Set<String> supportedRegions = C42756l.l0(new String[]{"zh-tw", "pt-br"});

    /* compiled from: LocaleUtils.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/util/HashMap;", "", "Ljava/util/Locale;", "Lkotlin/collections/HashMap;", "a", "()Ljava/util/HashMap;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<HashMap<String, Locale>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f432746a = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap<String, Locale> invoke() {
            String[] iSOCountries = Locale.getISOCountries();
            HashMap<String, Locale> map = new HashMap<>(iSOCountries.length);
            for (String str : iSOCountries) {
                Locale locale = new Locale("", str);
                map.put(locale.getISO3Country().toUpperCase(Locale.ROOT), locale);
            }
            map.put("RKS", new Locale("", "XK"));
            map.put("ANT", new Locale("", "NL"));
            return map;
        }
    }

    private l0() {
    }

    private final Map<String, Locale> a() {
        return (Map) localeMap.getValue();
    }

    @Y61.k
    public final String a(@Y61.k String iso3CountryCode) {
        Locale locale = a().get(iso3CountryCode);
        String country = locale != null ? locale.getCountry() : null;
        return country == null ? iso3CountryCode : country;
    }

    @Y61.k
    public final String a(@Y61.k Locale locale) {
        if (!C43066x.K(locale.getCountry())) {
            String str = locale.getLanguage() + '-' + locale.getCountry().toLowerCase(Locale.ROOT);
            if (supportedRegions.contains(str)) {
                return str;
            }
        }
        return locale.getLanguage();
    }
}
