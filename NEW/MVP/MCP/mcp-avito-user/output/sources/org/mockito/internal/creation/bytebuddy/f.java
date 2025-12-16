package org.mockito.internal.creation.bytebuddy;

import i81.InterfaceC41243c;
import i81.InterfaceC41246f;
import org.mockito.internal.creation.bytebuddy.l;

/* compiled from: InlineByteBuddyMockMaker.java */
/* loaded from: classes7.dex */
public class f implements InterfaceC44925d, InterfaceC41243c, D71.a {

    /* renamed from: a, reason: collision with root package name */
    public final l f421528a;

    public f() {
        try {
            this.f421528a = new l();
        } catch (NoClassDefFoundError e12) {
            Q71.a.f(e12);
            throw e12;
        }
    }

    @Override // i81.InterfaceC41246f
    public final InterfaceC41246f.c a(Class<?> cls) {
        this.f421528a.getClass();
        return new l.a(cls);
    }

    @Override // D71.a
    public final <T> T b(Class<T> cls) {
        return (T) this.f421528a.b(cls);
    }

    @Override // org.mockito.internal.creation.bytebuddy.InterfaceC44925d
    public final Class c(N71.a aVar) {
        return this.f421528a.c(aVar);
    }

    @Override // i81.InterfaceC41246f
    public final Object d(N71.a aVar, e81.h hVar) {
        return this.f421528a.g(aVar, hVar, false);
    }

    @Override // i81.InterfaceC41246f
    public final e81.h e(Object obj) {
        return this.f421528a.e(obj);
    }
}
