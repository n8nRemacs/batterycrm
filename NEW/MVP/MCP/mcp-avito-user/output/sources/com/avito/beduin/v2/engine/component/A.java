package com.avito.beduin.v2.engine.component;

import java.util.HashMap;
import kotlin.Metadata;

/* compiled from: ReadOnlyInMemoryComponentsStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/component/A;", "Lcom/avito/beduin/v2/engine/component/B;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class A implements B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final HashMap f336554a;

    public A(@Y61.k HashMap map) {
        this.f336554a = map;
    }

    @Override // com.avito.beduin.v2.engine.component.B
    @Y61.l
    public final y get(@Y61.k String str) {
        return (y) this.f336554a.get(str);
    }
}
