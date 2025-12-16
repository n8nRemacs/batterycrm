package com.avito.beduin.v2.engine.core.manager;

import Y41.l;
import Y61.k;
import com.avito.beduin.v2.engine.core.M;
import com.avito.beduin.v2.engine.core.N;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReadersManager.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/core/manager/j;", "Lcom/avito/beduin/v2/engine/core/manager/i;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f336673a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.engine.utils.a f336674b = new com.avito.beduin.v2.engine.utils.a();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.engine.utils.a f336675c = new com.avito.beduin.v2.engine.utils.a();

    public j(@k N n12) {
        this.f336673a = n12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.beduin.v2.engine.core.N, java.lang.Object] */
    @Override // com.avito.beduin.v2.engine.core.manager.i
    @k
    public final N.a a(@k M m12, boolean z12) {
        (z12 ? this.f336675c : this.f336674b).a(m12);
        return new N.e(this.f336673a, m12);
    }

    @Override // com.avito.beduin.v2.engine.core.manager.i
    public final void b() {
        this.f336674b.f336909a.clear();
        this.f336675c.f336909a.clear();
    }

    @Override // com.avito.beduin.v2.engine.core.manager.i
    public final void c(@k M m12) {
        this.f336674b.b(m12);
        this.f336675c.b(m12);
    }

    @Override // com.avito.beduin.v2.engine.core.manager.i
    public final void d(@k l<? super M, G0> lVar) {
        Iterator it = this.f336674b.c().iterator();
        while (it.hasNext()) {
            ((M) it.next()).e(lVar);
        }
        Iterator it2 = this.f336675c.c().iterator();
        while (it2.hasNext()) {
            lVar.invoke((M) it2.next());
        }
    }
}
