package org.mockito.internal.creation.bytebuddy;

import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import net.bytebuddy.TypeCache;
import org.mockito.mock.SerializableMode;

/* compiled from: TypeCachingBytecodeGenerator.java */
/* loaded from: classes7.dex */
class C extends ReferenceQueue<ClassLoader> implements InterfaceC44924c {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f421519e = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC44924c f421520b;

    /* renamed from: c, reason: collision with root package name */
    public final TypeCache.e f421521c;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantReadWriteLock f421522d = new ReentrantReadWriteLock();

    /* compiled from: TypeCachingBytecodeGenerator.java */
    public static class b extends TypeCache.c {

        /* renamed from: c, reason: collision with root package name */
        public final SerializableMode f421523c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f421524d;

        public b() {
            throw null;
        }

        public b(Class cls, Set set, SerializableMode serializableMode, boolean z12, a aVar) {
            super(cls, set);
            this.f421523c = serializableMode;
            this.f421524d = z12;
        }

        @Override // net.bytebuddy.TypeCache.c
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f421524d == bVar.f421524d && this.f421523c.equals(bVar.f421523c);
        }

        @Override // net.bytebuddy.TypeCache.c
        public final int hashCode() {
            return this.f421523c.hashCode() + (((super.hashCode() * 31) + (this.f421524d ? 1 : 0)) * 31);
        }
    }

    public C(InterfaceC44924c interfaceC44924c, boolean z12) {
        this.f421520b = interfaceC44924c;
        this.f421521c = new TypeCache.e(z12 ? TypeCache.Sort.f415326b : TypeCache.Sort.f415327c);
    }

    @Override // org.mockito.internal.creation.bytebuddy.InterfaceC44924c
    public final <T> Class<T> a(n<T> nVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f421522d;
        reentrantReadWriteLock.readLock().lock();
        try {
            try {
                return this.f421521c.d(nVar.f421554a.getClassLoader(), new b(nVar.f421554a, nVar.f421555b, nVar.f421556c, nVar.f421557d, null), new B(this, nVar), f421519e);
            } catch (IllegalArgumentException e12) {
                Throwable cause = e12.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw e12;
            }
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }
}
