package MJ0;

import com.avito.android.user_stats.deeplink.UserStatsLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: UserStatsLinkHandlerModule_ProvideUserStatsLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f10589a;

    public c(d dVar) {
        this.f10589a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f10589a;
        b.f10588a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(UserStatsLink.class, new g(), new C43834a.b.C11809b(dVar));
    }
}
