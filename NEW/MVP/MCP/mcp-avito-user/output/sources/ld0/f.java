package Ld0;

import com.avito.android.deep_linking.links.CollectPublishParamsLink;
import com.avito.android.publish.deeplink.o;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PublishDeepLinkHandlerModule_MakeCollectPublishParamsDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14382a f10031a;

    /* renamed from: b, reason: collision with root package name */
    public final o f10032b;

    public f(C14382a c14382a, o oVar) {
        this.f10031a = c14382a;
        this.f10032b = oVar;
    }

    public static C43834a a(C14382a c14382a, o oVar) {
        c14382a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CollectPublishParamsLink.class, new Md0.e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CollectPublishParamsLink.class), oVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f10031a, this.f10032b);
    }
}
