package qI0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.Navigation;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.UserAdvertsSearchStartFromType;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListParams;
import com.avito.android.util.C35755b0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.text.C43066x;

/* compiled from: ProfileItemsSearchEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqI0/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f429156b;

    /* compiled from: ProfileItemsSearchEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f429157a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f429158b;

        static {
            int[] iArr = new int[UserAdvertsSearchStartFromType.values().length];
            try {
                UserAdvertsSearchStartFromType userAdvertsSearchStartFromType = UserAdvertsSearchStartFromType.f312778b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UserAdvertsSearchStartFromType userAdvertsSearchStartFromType2 = UserAdvertsSearchStartFromType.f312778b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f429157a = iArr;
            int[] iArr2 = new int[UserAdvertsListParams.SearchInfo.StartType.values().length];
            try {
                UserAdvertsListParams.SearchInfo.StartType startType = UserAdvertsListParams.SearchInfo.StartType.f314705b;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UserAdvertsListParams.SearchInfo.StartType startType2 = UserAdvertsListParams.SearchInfo.StartType.f314705b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f429158b = iArr2;
        }
    }

    public c() {
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public c(@l String str, @l Integer num, @k String str2, @k String str3, boolean z12, @k Map<String, ? extends Object> map) {
        Q q12 = new Q("q", (str == null || str.length() == 0) ? "EMPTY_QUERY" : str);
        Q q13 = new Q("total", Integer.valueOf(num != null ? num.intValue() : -1));
        Q q14 = new Q("pagetype", str3);
        Q q15 = new Q("profile_tab", str2);
        Q q16 = new Q("search_in_title", Boolean.valueOf(z12));
        Object obj = map.get("space");
        String str4 = null;
        if (obj != null && (string = obj.toString()) != null) {
            String string = C43066x.K(string) ? null : string;
            if (string != null) {
                switch (string.hashCode()) {
                    case -473972602:
                        if (string.equals("3328183")) {
                            string = "Только в Бизнес 360";
                            break;
                        }
                        break;
                    case -473253896:
                        if (string.equals("3331545")) {
                            string = "Только на Авито";
                            break;
                        }
                        break;
                    case -473253895:
                        if (string.equals("3331546")) {
                            string = "На Авито и Бизнес 360";
                            break;
                        }
                        break;
                }
                str4 = string;
            }
        }
        Map mapG = P0.g(q12, q13, q14, q15, q16, new Q("avitopro_search_space", str4));
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str5 = (String) entry.getKey();
            switch (str5.hashCode()) {
                case -1386804544:
                    if (!str5.equals("onlyWithPhoto")) {
                        break;
                    } else {
                        str5 = "only_with_photo";
                        break;
                    }
                case -434000161:
                    if (!str5.equals("metroIds")) {
                        break;
                    } else {
                        str5 = "metro_list";
                        break;
                    }
                case -26774448:
                    if (!str5.equals("sortOrder")) {
                        break;
                    } else {
                        str5 = "sortd";
                        break;
                    }
                case 116520:
                    if (!str5.equals("vas")) {
                        break;
                    } else {
                        str5 = "avitopro_search_vas_type";
                        break;
                    }
                case 552298179:
                    if (!str5.equals("locationIds")) {
                        break;
                    } else {
                        str5 = "pp_geo_list";
                        break;
                    }
                case 1335334986:
                    if (!str5.equals("districtIds")) {
                        break;
                    } else {
                        str5 = "district_list";
                        break;
                    }
                case 1537759450:
                    if (!str5.equals(Navigation.CATEGORY_IDS)) {
                        break;
                    } else {
                        str5 = "categories";
                        break;
                    }
                case 1661860344:
                    if (!str5.equals("sortType")) {
                        break;
                    } else {
                        str5 = "sortf";
                        break;
                    }
            }
            linkedHashMap.put(str5, entry.getValue());
        }
        this.f429156b = new ParametrizedClickStreamEvent(4357, 10, C35755b0.c(P0.k(mapG, linkedHashMap)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f429156b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f429156b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f429156b.f90248c;
    }
}
