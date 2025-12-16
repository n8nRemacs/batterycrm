package coil;

import coil.j;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImageLoader.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcoil/memory/MemoryCache;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class g extends N implements Y41.a<MemoryCache> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j.a f58413l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j.a aVar) {
        super(0);
        this.f58413l = aVar;
    }

    @Override // Y41.a
    public final MemoryCache invoke() {
        return new MemoryCache.a(this.f58413l.f58505a).a();
    }
}
