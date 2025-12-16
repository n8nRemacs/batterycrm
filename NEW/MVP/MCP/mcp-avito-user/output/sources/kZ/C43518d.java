package kz;

import com.avito.android.deep_linking.links.EmployeeOffLimitLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: EmployeeOffLimitLinkModule_ProvideEmployeeOffLimitDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: kz.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C43518d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C43516b f413347a;

    public C43518d(C43516b c43516b) {
        this.f413347a = c43516b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C43516b c43516b = this.f413347a;
        C43517c.f413346a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(EmployeeOffLimitLink.class, new C43519e(), new C43834a.b.C11809b(c43516b));
    }
}
