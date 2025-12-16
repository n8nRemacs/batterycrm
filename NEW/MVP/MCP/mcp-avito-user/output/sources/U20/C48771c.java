package u20;

import com.avito.android.motivation_screen.MotivationDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MotivationDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: u20.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48771c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C48772d f439731a;

    public C48771c(C48772d c48772d) {
        this.f439731a = c48772d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C48772d c48772d = this.f439731a;
        C48770b.f439730a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MotivationDeeplink.class, new C48773e(), new C43834a.b.C11809b(c48772d));
    }
}
