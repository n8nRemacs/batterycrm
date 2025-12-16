package Td;

import com.avito.android.auth_passwordless.AuthPasswordlessEntryLink;
import com.avito.android.auth_passwordless.links.m;
import com.avito.android.auth_passwordless.links.n;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AuthPasswordlessDeeplinkHandlerModule_ProvideAuthPasswordlessEntryAsyncHandlerMappingFactory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final m f15755a;

    public c(m mVar) {
        this.f15755a = mVar;
    }

    public static C43834a a(m mVar) {
        C15352a.f15753a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AuthPasswordlessEntryLink.class, new n(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AuthPasswordlessEntryLink.class), mVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f15755a);
    }
}
