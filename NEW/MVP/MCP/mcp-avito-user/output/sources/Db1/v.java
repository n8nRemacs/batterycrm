package db1;

import java.util.concurrent.Executor;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.internal.C43238h;
import ru.rustore.sdk.core.tasks.f;

/* loaded from: classes9.dex */
public final class v implements X11.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43238h f393967a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final jb1.t f393968b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final T11.f f393969c;

    public v(@Y61.k C43238h c43238h, @Y61.k jb1.r rVar, @Y61.k jb1.t tVar, @Y61.k T11.f fVar) {
        this.f393967a = c43238h;
        this.f393968b = tVar;
        this.f393969c = fVar.b("TopicComponent");
    }

    @Override // X11.b
    @Y61.k
    public final ru.rustore.sdk.core.tasks.f a() {
        this.f393969c.info("Unsubscribe From Topic ".concat("ru.vk.store_ads"));
        f.a aVar = ru.rustore.sdk.core.tasks.f.f436778d;
        C43238h c43238h = this.f393967a;
        s sVar = new s(c43238h, this);
        aVar.getClass();
        ru.rustore.sdk.core.tasks.f fVar = new ru.rustore.sdk.core.tasks.f(null);
        sVar.invoke(new f.b());
        M m12 = (M) c43238h.f411905b.get(M.f410711b);
        Executor executorA = m12 != null ? A0.a(m12) : null;
        if (executorA == null) {
            fVar.a(new t(c43238h), null);
        } else {
            fVar.a(new u(c43238h), executorA);
        }
        return fVar;
    }
}
