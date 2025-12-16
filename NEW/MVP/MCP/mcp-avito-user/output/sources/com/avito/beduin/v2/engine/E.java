package com.avito.beduin.v2.engine;

import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.Metadata;

/* compiled from: RendererStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/E;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final E f336419a = new E();

    @Y61.k
    public static D a(@Y61.k InterfaceC36249i interfaceC36249i) {
        return new F(interfaceC36249i, false);
    }

    @Y61.k
    public static D b(@Y61.k com.avito.beduin.v2.engine.core.K k12) {
        return new F(new com.avito.beduin.v2.engine.component.l("main", null, "Main", k12), false);
    }

    @Y61.k
    public static D c(@Y61.k com.avito.beduin.v2.engine.core.K k12) {
        return new F(new com.avito.beduin.v2.engine.component.l("main", null, "Main", k12), true);
    }
}
