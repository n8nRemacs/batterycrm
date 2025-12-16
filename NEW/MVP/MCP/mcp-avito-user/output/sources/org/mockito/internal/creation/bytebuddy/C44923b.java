package org.mockito.internal.creation.bytebuddy;

import i81.InterfaceC41246f;
import org.mockito.internal.creation.bytebuddy.w;

/* compiled from: ByteBuddyMockMaker.java */
/* renamed from: org.mockito.internal.creation.bytebuddy.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44923b implements InterfaceC44925d {

    /* renamed from: a, reason: collision with root package name */
    public final w f421527a;

    public C44923b() {
        try {
            this.f421527a = new w();
        } catch (NoClassDefFoundError e12) {
            Q71.a.f(e12);
            throw e12;
        }
    }

    @Override // i81.InterfaceC41246f
    public final InterfaceC41246f.c a(Class<?> cls) {
        this.f421527a.getClass();
        return new w.a(cls);
    }

    @Override // org.mockito.internal.creation.bytebuddy.InterfaceC44925d
    public final Class c(N71.a aVar) {
        return this.f421527a.c(aVar);
    }

    @Override // i81.InterfaceC41246f
    public final Object d(N71.a aVar, e81.h hVar) {
        return this.f421527a.d(aVar, hVar);
    }

    @Override // i81.InterfaceC41246f
    public final e81.h e(Object obj) {
        return this.f421527a.e(obj);
    }
}
