package coil.network;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okhttp3.MediaType;

/* compiled from: CacheResponse.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokhttp3/MediaType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class b extends N implements Y41.a<MediaType> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f58556l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f58556l = cVar;
    }

    @Override // Y41.a
    public final MediaType invoke() {
        String str = this.f58556l.f58562f.get("Content-Type");
        if (str != null) {
            return MediaType.INSTANCE.parse(str);
        }
        return null;
    }
}
