package com.avito.beduin.v2.engine;

import com.avito.beduin.v2.engine.H;
import com.avito.beduin.v2.engine.field.c;
import com.avito.beduin.v2.engine.field.entity.w;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FieldFactory.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/o;", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f336896a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f336897b;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@Y61.l H.a aVar) {
        H h12 = aVar != null ? new H(aVar, null, 2, 0 == true ? 1 : 0) : new H(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        EnableTypedPrimitives.f336458c.getClass();
        EnableTypedPrimitives enableTypedPrimitives = EnableTypedPrimitives.f336459d;
        EnableTypedPrimitives enableTypedPrimitives2 = h12.f336487n;
        this.f336896a = enableTypedPrimitives2 == enableTypedPrimitives || enableTypedPrimitives2 == EnableTypedPrimitives.f336460e;
        this.f336897b = h12.f336489p;
    }

    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.d a(@Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k String str, @Y61.k Map<String, ? extends com.avito.beduin.v2.engine.field.f<?>> map) {
        c.a aVar = new c.a(this.f336897b);
        for (Map.Entry<String, ? extends com.avito.beduin.v2.engine.field.f<?>> entry : map.entrySet()) {
            aVar.a(entry.getKey(), entry.getValue());
        }
        return new com.avito.beduin.v2.engine.field.entity.d(jVar, str, new com.avito.beduin.v2.engine.field.h(aVar.f336771b), aVar.f336770a ? new com.avito.beduin.v2.engine.field.h(aVar.f336772c) : null, null, null, 48, null);
    }

    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.w b(@Y61.k com.avito.beduin.v2.engine.field.j jVar, double d12) {
        return this.f336896a ? new w.b(jVar, d12) : new w.e(jVar, String.valueOf(d12));
    }

    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.w c(@Y61.k com.avito.beduin.v2.engine.field.j jVar, long j12) {
        return this.f336896a ? new w.d(jVar, j12) : new w.e(jVar, String.valueOf(j12));
    }

    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.w d(@Y61.k com.avito.beduin.v2.engine.field.j jVar, boolean z12) {
        return this.f336896a ? new w.a(jVar, z12) : new w.e(jVar, String.valueOf(z12));
    }
}
