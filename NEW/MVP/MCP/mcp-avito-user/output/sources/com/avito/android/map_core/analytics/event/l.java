package com.avito.android.map_core.analytics.event;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.SearchParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MapOnboardingEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/map_core/analytics/event/l;", "Lcom/avito/android/analytics/provider/clickstream/a;", "<init>", "()V", "a", "b", "Lcom/avito/android/map_core/analytics/event/l$a;", "Lcom/avito/android/map_core/analytics/event/l$b;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class l implements com.avito.android.analytics.provider.clickstream.a {

    /* compiled from: MapOnboardingEvent.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/map_core/analytics/event/l$a;", "Lcom/avito/android/map_core/analytics/event/l;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends l implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f185627b;

        public a(@Y61.k SearchParams searchParams, @Y61.l String str) {
            super(null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String categoryId = searchParams.getCategoryId();
            if (categoryId != null) {
                linkedHashMap.put("cid", categoryId);
            }
            if (str != null) {
                linkedHashMap.put("type", str);
            }
            m.a(linkedHashMap, searchParams);
            G0 g02 = G0.f406611a;
            this.f185627b = new ParametrizedClickStreamEvent(14626, 0, linkedHashMap, null, 8, null);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF328428b() {
            return this.f185627b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f185627b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF328429c() {
            return this.f185627b.f90248c;
        }
    }

    /* compiled from: MapOnboardingEvent.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/map_core/analytics/event/l$b;", "Lcom/avito/android/map_core/analytics/event/l;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends l implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f185628b;

        public b(@Y61.k SearchParams searchParams, @Y61.l String str) {
            super(null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String categoryId = searchParams.getCategoryId();
            if (categoryId != null) {
                linkedHashMap.put("cid", categoryId);
            }
            if (str != null) {
                linkedHashMap.put("type", str);
            }
            m.a(linkedHashMap, searchParams);
            G0 g02 = G0.f406611a;
            this.f185628b = new ParametrizedClickStreamEvent(14625, 0, linkedHashMap, null, 8, null);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF328428b() {
            return this.f185628b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f185628b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF328429c() {
            return this.f185628b.f90248c;
        }
    }

    public /* synthetic */ l(C42822w c42822w) {
        this();
    }

    public l() {
    }
}
