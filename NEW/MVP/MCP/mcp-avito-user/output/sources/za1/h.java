package Za1;

import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.ipc.NoHostsToBindException;

/* loaded from: classes9.dex */
public final class h extends com.vk.push.core.retry.a {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final T11.f f20232e;

    public h(@Y61.k T11.f fVar, @Y61.k com.vk.push.core.backoff.b bVar) {
        super(bVar);
        this.f20232e = fVar.b("IPCClientRetryComponent");
    }

    @Override // com.vk.push.core.retry.a
    @Y61.k
    public final T11.f a() {
        return this.f20232e;
    }

    @Override // com.vk.push.core.retry.a
    public final boolean c(@Y61.k Throwable th2) {
        if (th2 instanceof HostIsNotMasterException) {
            return true;
        }
        return th2 instanceof NoHostsToBindException;
    }
}
