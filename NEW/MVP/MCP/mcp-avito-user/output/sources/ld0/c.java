package Ld0;

import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.publish.deeplink.C33549d;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PublishDeepLinkHandlerModule_MakeAdvertEditDeepLinkV1MappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14382a f10025a;

    /* renamed from: b, reason: collision with root package name */
    public final C33549d f10026b;

    public c(C14382a c14382a, C33549d c33549d) {
        this.f10025a = c14382a;
        this.f10026b = c33549d;
    }

    public static C43834a a(C14382a c14382a, C33549d c33549d) {
        c14382a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MyAdvertLink.EditV1.class, new Md0.i(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MyAdvertLink.EditV1.class), c33549d));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f10025a, this.f10026b);
    }
}
