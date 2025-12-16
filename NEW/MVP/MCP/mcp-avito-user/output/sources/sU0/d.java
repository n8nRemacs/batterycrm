package SU0;

import com.avito.beduin.v2.logger.LogLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NetworkRequestLifecycle.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSU0/d;", "LSU0/k;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class d implements k {
    @Override // SU0.k
    public final void a(@Y61.k e eVar) {
        RU0.b bVar = RU0.b.f14467a;
        LogLevel[] logLevelArr = LogLevel.f337864b;
        bVar.getClass();
        if (2 >= RU0.b.f14469c) {
            RU0.b.f14468b.b(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":NetworkLifecycle"), "content loading started: " + eVar);
        }
    }

    @Override // SU0.k
    public final void b(@Y61.k e eVar, @Y61.k Throwable th2) {
        RU0.b bVar = RU0.b.f14467a;
        LogLevel[] logLevelArr = LogLevel.f337864b;
        bVar.getClass();
        if (2 >= RU0.b.f14469c) {
            RU0.b.f14468b.b(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":NetworkLifecycle"), "content loading failed: " + eVar + "; " + th2.getMessage());
        }
    }

    @Override // SU0.k
    public final void c(@Y61.k e eVar) {
        RU0.b bVar = RU0.b.f14467a;
        LogLevel[] logLevelArr = LogLevel.f337864b;
        bVar.getClass();
        if (2 >= RU0.b.f14469c) {
            RU0.b.f14468b.b(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":NetworkLifecycle"), "content loading completed: " + eVar);
        }
    }
}
