package com.avito.beduin.v2.engine.core.manager;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.L;
import kotlin.Metadata;

/* compiled from: ChildrenManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/core/manager/b;", "Lcom/avito/beduin/v2/engine/core/L;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements L {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Object f336656a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f336657b;

    public b(@l Object obj, @k L l12) {
        this.f336656a = obj;
        this.f336657b = l12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.beduin.v2.engine.core.L, java.lang.Object] */
    @Override // com.avito.beduin.v2.engine.core.L
    public final void destroy() {
        this.f336657b.destroy();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.beduin.v2.engine.core.L, java.lang.Object] */
    @Override // com.avito.beduin.v2.engine.core.L
    @k
    public final InterfaceC36274k getContext() {
        return this.f336657b.getContext();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.beduin.v2.engine.core.L, java.lang.Object] */
    @Override // com.avito.beduin.v2.engine.core.L
    public final void j() {
        this.f336657b.j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.beduin.v2.engine.core.L, java.lang.Object] */
    @Override // com.avito.beduin.v2.engine.core.L
    public final boolean p() {
        return this.f336657b.p();
    }
}
