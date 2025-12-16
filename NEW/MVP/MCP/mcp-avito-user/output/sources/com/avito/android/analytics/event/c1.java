package com.avito.android.analytics.event;

import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SnippetCallEvent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/event/c1;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c1 implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f90026d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f90027b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f90028c;

    /* compiled from: SnippetCallEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/analytics/event/c1$a;", "", "<init>", "()V", "", "SOURCE_ADVERT_SCREEN", "Ljava/lang/String;", "SOURCE_ADVERT_SNIPPET", "SOURCE_GRID_ADVERT_SNIPPET", "SOURCE_XL_ADVERT_SNIPPET", "TYPE_XL_ADVERT_SNIPPET", "VIEW_GRID_ADVERT_SNIPPET", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static String a(@Y61.k ConstructorAdvertItem constructorAdvertItem) {
            Map<String, String> analyticParams = constructorAdvertItem.getAnalyticParams();
            if (kotlin.jvm.internal.L.f(analyticParams != null ? analyticParams.get("type") : null, "xl")) {
                return "xs";
            }
            Map<String, String> analyticParams2 = constructorAdvertItem.getAnalyticParams();
            return kotlin.jvm.internal.L.f(analyticParams2 != null ? analyticParams2.get("view") : null, "grid") ? "gs" : "s";
        }

        public a() {
        }
    }

    public c1(@Y61.k String str, @Y61.k String str2, boolean z12, @Y61.l String str3, @Y61.l Map<String, String> map, @Y61.l String str4) {
        this.f90027b = new com.avito.android.analytics.provider.clickstream.b(2216, 9);
        LinkedHashMap linkedHashMapJ = kotlin.collections.P0.j(new kotlin.Q("iid", str), new kotlin.Q("from_block", str2), new kotlin.Q("mic_access", Boolean.valueOf(z12)));
        if (map != null) {
            linkedHashMapJ.putAll(map);
        }
        if (str3 != null) {
            linkedHashMapJ.put("wsrc", str3);
        }
        if (str4 != null) {
            linkedHashMapJ.put("from_page", str4);
        }
        this.f90028c = linkedHashMapJ;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f90027b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90028c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f90027b.f90263c;
    }

    public /* synthetic */ c1(String str, String str2, boolean z12, String str3, Map map, String str4, int i12, C42822w c42822w) {
        this(str, str2, z12, str3, (i12 & 16) != 0 ? null : map, (i12 & 32) != 0 ? null : str4);
    }
}
