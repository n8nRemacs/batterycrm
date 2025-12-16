package Oa1;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.G0;

/* loaded from: classes9.dex */
public final class D implements ru.rustore.sdk.reactive.core.a {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f12330a = new ScheduledThreadPoolExecutor(1);

    @Override // ru.rustore.sdk.reactive.core.a
    public final void a(Y41.a<G0> aVar) {
        this.f12330a.submit(new B(0, aVar));
    }
}
