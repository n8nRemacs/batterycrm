package sberid.sdk.ui.utils.extensions;

import android.content.Context;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcoil/memory/MemoryCache;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class e extends N implements Y41.a<MemoryCache> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f437903l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(0);
        this.f437903l = context;
    }

    @Override // Y41.a
    public final MemoryCache invoke() {
        MemoryCache.a aVar = new MemoryCache.a(this.f437903l);
        aVar.f58517b = 0.0d;
        aVar.f58518c = 10485760;
        aVar.f58519d = true;
        return aVar.a();
    }
}
