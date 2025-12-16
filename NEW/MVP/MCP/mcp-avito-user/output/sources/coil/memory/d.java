package coil.memory;

import Y61.k;
import Y61.l;
import coil.memory.MemoryCache;
import kotlin.Metadata;

/* compiled from: RealMemoryCache.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/d;", "Lcoil/memory/MemoryCache;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements MemoryCache {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f58526a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f58527b;

    public d(@k g gVar, @k h hVar) {
        this.f58526a = gVar;
        this.f58527b = hVar;
    }

    @Override // coil.memory.MemoryCache
    public final void a(int i12) {
        this.f58526a.a(i12);
        this.f58527b.a(i12);
    }

    @Override // coil.memory.MemoryCache
    @l
    public final MemoryCache.b b(@k MemoryCache.Key key) {
        MemoryCache.b bVarB = this.f58526a.b(key);
        return bVarB == null ? this.f58527b.b(key) : bVarB;
    }

    @Override // coil.memory.MemoryCache
    public final void c(@k MemoryCache.Key key, @k MemoryCache.b bVar) {
        this.f58526a.c(new MemoryCache.Key(key.f58514b, coil.util.c.b(key.f58515c)), bVar.f58521a, coil.util.c.b(bVar.f58522b));
    }
}
