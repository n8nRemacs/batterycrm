package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: MutableClassToInstanceMap.java */
@InterfaceC37329f0
@XY0.d
@XY0.c
/* renamed from: com.google.common.collect.o3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37386o3<B> extends M0<Class<? extends B>, B> implements E<B>, Serializable {

    /* compiled from: MutableClassToInstanceMap.java */
    /* renamed from: com.google.common.collect.o3$a */
    public class a extends U0<Map.Entry<Class<? extends B>, B>> {

        /* compiled from: MutableClassToInstanceMap.java */
        /* renamed from: com.google.common.collect.o3$a$a, reason: collision with other inner class name */
        public class C10675a extends z4<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
            @Override // com.google.common.collect.z4
            public final Object a(Object obj) {
                return new C37380n3((Map.Entry) obj);
            }
        }

        @Override // com.google.common.collect.U0, com.google.common.collect.B0, com.google.common.collect.S0
        public final Object X() {
            throw null;
        }

        @Override // com.google.common.collect.U0, com.google.common.collect.B0
        /* renamed from: Y */
        public final Collection X() {
            throw null;
        }

        @Override // com.google.common.collect.U0
        /* renamed from: b0 */
        public final Set<Map.Entry<Class<? extends B>, B>> X() {
            throw null;
        }

        @Override // com.google.common.collect.B0, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
            throw null;
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final Object[] toArray() {
            return Z();
        }

        @Override // com.google.common.collect.B0, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C37414t3.c(this, tArr);
        }
    }

    /* compiled from: MutableClassToInstanceMap.java */
    /* renamed from: com.google.common.collect.o3$b */
    public static final class b<B> implements Serializable {
        private static final long serialVersionUID = 0;

        public Object readResolve() {
            new C37386o3();
            throw null;
        }
    }

    public C37386o3() {
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        return new b();
    }

    @Override // com.google.common.collect.M0, com.google.common.collect.S0
    public final Object X() {
        return null;
    }

    @Override // com.google.common.collect.M0
    /* renamed from: Y */
    public final Map<Class<? extends B>, B> X() {
        return null;
    }

    @Override // com.google.common.collect.M0, java.util.Map
    public final Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new a();
    }

    @Override // com.google.common.collect.M0, java.util.Map
    @I41.a
    @InterfaceC19845a
    public final Object put(Object obj, @InterfaceC37434x3 Object obj2) {
        Class<?> cls = (Class) obj;
        Map<Class<?>, Class<?>> map = com.google.common.primitives.q.f360407a;
        cls.getClass();
        Class<?> cls2 = com.google.common.primitives.q.f360407a.get(cls);
        if (cls2 == null) {
            cls2 = cls;
        }
        cls2.cast(obj2);
        return super.put(cls, obj2);
    }

    @Override // com.google.common.collect.M0, java.util.Map
    public final void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Class<?> cls = (Class) entry.getKey();
            Object value = entry.getValue();
            Map<Class<?>, Class<?>> map2 = com.google.common.primitives.q.f360407a;
            cls.getClass();
            Class<?> cls2 = com.google.common.primitives.q.f360407a.get(cls);
            if (cls2 != null) {
                cls = cls2;
            }
            cls.cast(value);
        }
        super.putAll(linkedHashMap);
    }
}
