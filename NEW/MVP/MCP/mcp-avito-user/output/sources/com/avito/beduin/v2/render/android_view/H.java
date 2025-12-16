package com.avito.beduin.v2.render.android_view;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ViewComponentsRegistry.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/H;", "Lcom/avito/beduin/v2/engine/component/p;", "a", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class H implements com.avito.beduin.v2.engine.component.p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, n<?>> f337921a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n<?> f337922b;

    /* compiled from: ViewComponentsRegistry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/H$a;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.component.meta.android_view.b f337923a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f337924b;

        public a() {
            throw null;
        }

        public a(@Y61.k com.avito.beduin.v2.component.meta.android_view.b bVar) {
            Map mapC = P0.c();
            this.f337923a = bVar;
            this.f337924b = new LinkedHashMap(mapC);
        }
    }

    public H() {
        throw null;
    }

    public H(Map map, n nVar, C42822w c42822w) {
        this.f337921a = map;
        this.f337922b = nVar;
    }
}
