package Ld0;

import com.avito.android.deep_linking.links.DraftRefreshLink;
import com.avito.android.publish.deeplink.s;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PublishDeepLinkHandlerModule_MakePublishRefreshDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14382a f10043a;

    /* renamed from: b, reason: collision with root package name */
    public final s f10044b;

    public l(C14382a c14382a, s sVar) {
        this.f10043a = c14382a;
        this.f10044b = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        s sVar = this.f10044b;
        this.f10043a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(DraftRefreshLink.class, new Md0.f(), new C43834a.b.C11809b(sVar));
    }
}
