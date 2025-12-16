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

/* compiled from: FlatsButtonClickEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/analytics/flats_groups/FlatsButtonClickEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "FromPage", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlatsButtonClickEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f82820b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FlatsButtonClickEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/flats_groups/FlatsButtonClickEvent$FromPage;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FromPage {

        /* renamed from: c, reason: collision with root package name */
        public static final FromPage f82821c;

        /* renamed from: d, reason: collision with root package name */
        public static final FromPage f82822d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ FromPage[] f82823e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f82824f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f82825b;

        static {
            FromPage fromPage = new FromPage("BUYER", 0, "buyer");
            f82821c = fromPage;
            FromPage fromPage2 = new FromPage("SELLER", 1, "seller");
            f82822d = fromPage2;
            FromPage[] fromPageArr = {fromPage, fromPage2};
            f82823e = fromPageArr;
            f82824f = c.a(fromPageArr);
        }

        public FromPage(String str, int i12, String str2) {
            this.f82825b = str2;
        }

        public static FromPage valueOf(String str) {
            return (FromPage) Enum.valueOf(FromPage.class, str);
        }

        public static FromPage[] values() {
            return (FromPage[]) f82823e.clone();
        }
    }

    public FlatsButtonClickEvent(@k String str, @k FromPage fromPage, @l String str2) {
        this.f82820b = new ParametrizedClickStreamEvent(6260, 4, P0.g(new Q("iid", str), new Q("from_page", fromPage.f82825b), new Q("infomodel_param_id", str2 == null ? "" : str2)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f82820b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f82820b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f82820b.f90248c;
    }
}
