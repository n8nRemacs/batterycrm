package com.avito.beduin.v2.engine.component;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ComponentStatesRegistry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/o;", "", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, AbstractC36250j> f336571a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC36250j f336572b;

    /* compiled from: ComponentStatesRegistry.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/component/o$a;", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final OT0.b f336573a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f336574b;

        public a() {
            throw null;
        }

        public a(@Y61.k OT0.b bVar) {
            Map mapC = P0.c();
            this.f336573a = bVar;
            this.f336574b = new LinkedHashMap(mapC);
        }

        @Y61.k
        public final void a(@Y61.k AbstractC36250j abstractC36250j) {
            this.f336574b.put(abstractC36250j.f336560a, abstractC36250j);
        }
    }

    public o() {
        throw null;
    }

    public o(Map map, AbstractC36250j abstractC36250j, C42822w c42822w) {
        this.f336571a = map;
        this.f336572b = abstractC36250j;
    }
}
