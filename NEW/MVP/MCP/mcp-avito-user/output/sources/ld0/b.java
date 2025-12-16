package Ld0;

import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.publish.deeplink.C33547b;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PublishDeepLinkHandlerModule_MakeAdvertEditDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14382a f10023a;

    /* renamed from: b, reason: collision with root package name */
    public final C33547b f10024b;

    public b(C14382a c14382a, C33547b c33547b) {
        this.f10023a = c14382a;
        this.f10024b = c33547b;
    }

    public static C43834a a(C14382a c14382a, C33547b c33547b) {
        c14382a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MyAdvertLink.Edit.class, new Md0.h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MyAdvertLink.Edit.class), c33547b));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f10023a, this.f10024b);
    }
}
