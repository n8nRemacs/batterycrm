package Ph;

import dagger.internal.p;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;

/* compiled from: LabelTokenJoinerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: Ph.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14786c implements dagger.internal.h<C14785b> {

    /* renamed from: a, reason: collision with root package name */
    public final h f13235a;

    /* renamed from: b, reason: collision with root package name */
    public final p f13236b;

    public C14786c(h hVar, p pVar) {
        this.f13235a = hVar;
        this.f13236b = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14785b((f) this.f13235a.get(), (Map) this.f13236b.get());
    }
}
