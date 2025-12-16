package com.avito.android.trx_promo_impl.analytics;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: TrxPromoBackPressEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/analytics/TrxPromoBackPressEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "FromPage", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrxPromoBackPressEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f303898b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TrxPromoBackPressEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/analytics/TrxPromoBackPressEvent$FromPage;", "", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FromPage {

        /* renamed from: c, reason: collision with root package name */
        public static final FromPage f303899c;

        /* renamed from: d, reason: collision with root package name */
        public static final FromPage f303900d;

        /* renamed from: e, reason: collision with root package name */
        public static final FromPage f303901e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ FromPage[] f303902f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f303903g;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f303904b;

        static {
            FromPage fromPage = new FromPage("CONFIGURE", 0, "trx-promo/configure");
            f303899c = fromPage;
            FromPage fromPage2 = new FromPage("SUCCESS", 1, "trx-promo/configure/success");
            f303900d = fromPage2;
            FromPage fromPage3 = new FromPage("FORBIDDEN", 2, "trx-promo/configure/forbidden");
            f303901e = fromPage3;
            FromPage[] fromPageArr = {fromPage, fromPage2, fromPage3};
            f303902f = fromPageArr;
            f303903g = c.a(fromPageArr);
        }

        public FromPage(String str, int i12, String str2) {
            this.f303904b = str2;
        }

        public static FromPage valueOf(String str) {
            return (FromPage) Enum.valueOf(FromPage.class, str);
        }

        public static FromPage[] values() {
            return (FromPage[]) f303902f.clone();
        }
    }

    public TrxPromoBackPressEvent(@k FromPage fromPage) {
        this.f303898b = new ParametrizedClickStreamEvent(9037, 1, P0.j(new Q("from_page", fromPage.f303904b)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f303898b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f303898b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f303898b.f90248c;
    }
}
