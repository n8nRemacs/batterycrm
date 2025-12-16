package Ra1;

import Y61.k;
import com.vk.push.common.messaging.RemoteMessage;

/* loaded from: classes9.dex */
public final class a implements Z11.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final X11.b f14520a;

    public a(@k X11.b bVar) {
        this.f14520a = bVar;
    }

    @Override // Z11.a
    public final boolean a(@k RemoteMessage remoteMessage) {
        boolean zEquals = remoteMessage.f366991b.getString("vk.from", "").equals("ru.vk.store_ads");
        if (zEquals) {
            this.f14520a.a();
        }
        return zEquals;
    }
}
