package com.avito.android.advert_core.analytics.flats_groups;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: AboutDeveloperFlatsButtonClickEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/analytics/flats_groups/AboutDeveloperFlatsButtonClickEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "FromPage", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AboutDeveloperFlatsButtonClickEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f82817b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AboutDeveloperFlatsButtonClickEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/flats_groups/AboutDeveloperFlatsButtonClickEvent$FromPage;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FromPage {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ FromPage[] f82818b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f82819c;

        static {
            FromPage[] fromPageArr = {new FromPage("ITEM", 0, "item"), new FromPage("JK_CATALOG", 1, "jk_catalog")};
            f82818b = fromPageArr;
            f82819c = c.a(fromPageArr);
        }

        public FromPage(String str, int i12, String str2) {
        }

        public static FromPage valueOf(String str) {
            return (FromPage) Enum.valueOf(FromPage.class, str);
        }

        public static FromPage[] values() {
            return (FromPage[]) f82818b.clone();
        }
    }

    public AboutDeveloperFlatsButtonClickEvent(@k String str, @l String str2, @k String str3, @k String str4, @l String str5) {
        FromPage[] fromPageArr = FromPage.f82818b;
        this.f82817b = new ParametrizedClickStreamEvent(5940, 3, P0.g(new Q("iid", str), new Q("uid", str2 == null ? "" : str2), new Q("from_page", "item"), new Q("developer_company_group_id", str3), new Q("development_id", str4), new Q("catalog_jk_action", str5 == null ? "" : str5)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f82817b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f82817b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f82817b.f90248c;
    }
}
