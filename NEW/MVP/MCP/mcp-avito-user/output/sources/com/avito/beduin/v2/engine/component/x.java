package com.avito.beduin.v2.engine.component;

import java.util.HashMap;
import kotlin.Metadata;

/* compiled from: InMemoryComponentsStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/component/x;", "Lcom/avito/beduin/v2/engine/component/z;", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class x implements z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, y> f336586a = new HashMap<>();

    @Override // com.avito.beduin.v2.engine.component.z
    @Y61.k
    public final A a() {
        return new A(this.f336586a);
    }

    @Override // com.avito.beduin.v2.engine.component.z
    public final void b(@Y61.k String str, @Y61.k y yVar) {
        this.f336586a.put(str, yVar);
    }

    @Override // com.avito.beduin.v2.engine.component.z
    @Y61.l
    public final y get(@Y61.k String str) {
        return this.f336586a.get(str);
    }
}
