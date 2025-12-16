package com.avito.android.advert_core.analytics.realty_ai_design;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: RealtyAiDesignButtonClicked.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/analytics/realty_ai_design/RealtyAiDesignButtonClicked;", "Lcom/avito/android/analytics/provider/clickstream/a;", "PageType", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RealtyAiDesignButtonClicked implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f82838b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RealtyAiDesignButtonClicked.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/realty_ai_design/RealtyAiDesignButtonClicked$PageType;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PageType {

        /* renamed from: b, reason: collision with root package name */
        public static final PageType f82839b;

        /* renamed from: c, reason: collision with root package name */
        public static final PageType f82840c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ PageType[] f82841d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f82842e;

        static {
            PageType pageType = new PageType("FULL", 0);
            f82839b = pageType;
            PageType pageType2 = new PageType("PART", 1);
            f82840c = pageType2;
            PageType[] pageTypeArr = {pageType, pageType2};
            f82841d = pageTypeArr;
            f82842e = c.a(pageTypeArr);
        }

        public PageType() {
            throw null;
        }

        public static PageType valueOf(String str) {
            return (PageType) Enum.valueOf(PageType.class, str);
        }

        public static PageType[] values() {
            return (PageType[]) f82841d.clone();
        }
    }

    public RealtyAiDesignButtonClicked(@k String str, @k PageType pageType) {
        this.f82838b = new ParametrizedClickStreamEvent(16803, 1, P0.g(new Q("iid", str), new Q("from_page", pageType.name())), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f82838b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f82838b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f82838b.f90248c;
    }
}
