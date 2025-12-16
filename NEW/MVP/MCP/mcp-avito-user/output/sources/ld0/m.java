package Ld0;

import com.avito.android.deep_linking.links.PublishSlotUpdateLink;
import com.avito.android.publish.deeplink.M;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PublishDeepLinkHandlerModule_MakePublishSlotUpdateDeepLinkHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14382a f10045a;

    /* renamed from: b, reason: collision with root package name */
    public final M f10046b;

    public m(C14382a c14382a, M m12) {
        this.f10045a = c14382a;
        this.f10046b = m12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f10045a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PublishSlotUpdateLink.class, new Md0.l(), new C43834a.b.C11809b(this.f10046b));
    }
}
