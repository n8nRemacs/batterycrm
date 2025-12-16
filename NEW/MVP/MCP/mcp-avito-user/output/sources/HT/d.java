package Ht;

import com.avito.android.deeplink.RestartPublishLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RestartPublishDeepLinkModule_ProvideRestartPublishDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f7805a;

    public d(b bVar) {
        this.f7805a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = this.f7805a;
        c.f7804a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RestartPublishLink.class, new e(), new C43834a.b.C11809b(bVar));
    }
}
