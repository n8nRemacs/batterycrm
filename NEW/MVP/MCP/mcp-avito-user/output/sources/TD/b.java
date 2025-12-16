package Td;

import com.avito.android.auth_passwordless.AuthPasswordlessLink;
import com.avito.android.auth_passwordless.links.g;
import com.avito.android.auth_passwordless.links.o;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AuthPasswordlessDeeplinkHandlerModule_ProvideAuthPasswordlessAsyncHandlerMappingFactory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f15754a;

    public b(g gVar) {
        this.f15754a = gVar;
    }

    public static C43834a a(g gVar) {
        C15352a.f15753a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AuthPasswordlessLink.class, new o(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AuthPasswordlessLink.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f15754a);
    }
}
