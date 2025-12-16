package com.avito.beduin.v2.render.compose;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ComposeComponentsRegistry.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/render/compose/i;", "Lcom/avito/beduin/v2/engine/component/p;", "a", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.render.compose.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36352i implements com.avito.beduin.v2.engine.component.p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, AbstractC36347d<?>> f338074a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC36347d<?> f338075b;

    /* compiled from: ComposeComponentsRegistry.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/compose/i$a;", "", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.render.compose.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.component.meta.compose.a f338076a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f338077b;

        public a() {
            throw null;
        }

        public a(@Y61.k com.avito.beduin.v2.component.meta.compose.a aVar) {
            Map mapC = P0.c();
            this.f338076a = aVar;
            this.f338077b = new LinkedHashMap(mapC);
        }
    }

    public C36352i() {
        throw null;
    }

    public C36352i(Map map, AbstractC36347d abstractC36347d, C42822w c42822w) {
        this.f338074a = map;
        this.f338075b = abstractC36347d;
    }
}
