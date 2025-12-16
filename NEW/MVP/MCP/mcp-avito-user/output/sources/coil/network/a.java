package coil.network;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okhttp3.CacheControl;

/* compiled from: CacheResponse.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokhttp3/CacheControl;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class a extends N implements Y41.a<CacheControl> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f58555l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(0);
        this.f58555l = cVar;
    }

    @Override // Y41.a
    public final CacheControl invoke() {
        return CacheControl.INSTANCE.parse(this.f58555l.f58562f);
    }
}
