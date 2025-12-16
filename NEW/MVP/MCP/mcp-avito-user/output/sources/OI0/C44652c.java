package oI0;

import com.avito.android.deep_linking.links.UserAdvertsLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: UserAdvertsDeeplinkHandlerModule_ProvideUserAdvertsDeeplinkHandlerFactory.java */
@e
@y
@x
/* renamed from: oI0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44652c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C44653d f419698a;

    public C44652c(C44653d c44653d) {
        this.f419698a = c44653d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C44653d c44653d = this.f419698a;
        C44651b.f419697a.getClass();
        return new C43834a(UserAdvertsLink.class, null, new C43834a.b.C11809b(c44653d));
    }
}
