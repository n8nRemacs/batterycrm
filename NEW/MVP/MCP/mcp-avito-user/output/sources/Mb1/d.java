package mb1;

import Y61.k;
import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.retry.a;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class d extends com.vk.push.core.retry.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final T11.f f414619e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(T11.f fVar) {
        super(a.C10844a.a());
        com.vk.push.core.retry.a.f367143b.getClass();
        this.f414619e = fVar.b("PushTokenRequestRetryComponent");
    }

    @Override // com.vk.push.core.retry.a
    @k
    public final T11.f a() {
        return this.f414619e;
    }

    @Override // com.vk.push.core.retry.a
    public final boolean c(@k Throwable th2) {
        int i12;
        return (th2 instanceof IOException) || ((th2 instanceof VkpnsRequestException) && ((i12 = ((VkpnsRequestException) th2).f367117c) == 429 || (500 <= i12 && i12 < 600)));
    }
}
