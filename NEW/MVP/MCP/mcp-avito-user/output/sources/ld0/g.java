package Ld0;

import com.avito.android.deep_linking.links.DraftPublicationLink;
import com.avito.android.publish.deeplink.q;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PublishDeepLinkHandlerModule_MakeDraftPublicationDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14382a f10033a;

    /* renamed from: b, reason: collision with root package name */
    public final q f10034b;

    public g(C14382a c14382a, q qVar) {
        this.f10033a = c14382a;
        this.f10034b = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        q qVar = this.f10034b;
        this.f10033a.getClass();
        return new C43834a(DraftPublicationLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DraftPublicationLink.class), qVar));
    }
}
