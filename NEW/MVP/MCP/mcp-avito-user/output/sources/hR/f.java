package Hr;

import Y61.k;
import Y61.l;
import android.util.LruCache;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: ContentBag.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHr/f;", "LHr/a;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class f implements InterfaceC14024a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14025b f7763a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LruCache<Long, Object> f7764b = new LruCache<>(30);

    @Inject
    public f(@k InterfaceC14025b interfaceC14025b) {
        this.f7763a = interfaceC14025b;
    }

    @Override // Hr.InterfaceC14024a
    public final long a(@k Object obj) {
        long jA2 = this.f7763a.a();
        this.f7764b.put(Long.valueOf(jA2), obj);
        return jA2;
    }

    @Override // Hr.InterfaceC14024a
    @l
    public final Object b(@l Long l12) {
        if (l12 == null) {
            return null;
        }
        return this.f7764b.remove(Long.valueOf(l12.longValue()));
    }
}
