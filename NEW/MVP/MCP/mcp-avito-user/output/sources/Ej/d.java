package EJ;

import Y61.k;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: AvCallsVideoRendererStorageImpl.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEJ/d;", "LMJ/b;", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements MJ.b {
    @Inject
    public d() {
    }

    @Override // MJ.b
    @k
    public final synchronized MJ.a a(@k String str, boolean z12) {
        return new c(com.avito.avcalls.android.video.view_api.c.f332530a.a(str, z12));
    }

    @Override // MJ.b
    public final synchronized void b(@k String str, boolean z12) {
        com.avito.avcalls.android.video.view_api.c.f332530a.b(str, z12);
    }
}
