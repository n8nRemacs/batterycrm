package com.google.common.collect;

import com.google.common.collect.InterfaceC37338g3;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Serialization.java */
@XY0.c
@InterfaceC37329f0
@XY0.d
/* loaded from: classes6.dex */
final class S3 {

    /* compiled from: Serialization.java */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Field f359573a;

        public b(Field field, a aVar) throws SecurityException {
            this.f359573a = field;
            field.setAccessible(true);
        }

        public final void a(Serializable serializable, Object obj) throws IllegalAccessException, IllegalArgumentException {
            try {
                this.f359573a.set(serializable, obj);
            } catch (IllegalAccessException e12) {
                throw new AssertionError(e12);
            }
        }
    }

    public static <T> b<T> a(Class<T> cls, String str) {
        try {
            return new b<>(cls.getDeclaredField(str), null);
        } catch (NoSuchFieldException e12) {
            throw new AssertionError(e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void b(Map<K, V> map, ObjectInputStream objectInputStream, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void c(R2<K, V> r22, ObjectInputStream objectInputStream, int i12) throws IOException {
        for (int i13 = 0; i13 < i12; i13++) {
            Collection collection = r22.get(objectInputStream.readObject());
            int i14 = objectInputStream.readInt();
            for (int i15 = 0; i15 < i14; i15++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    public static <E> void d(InterfaceC37338g3<E> interfaceC37338g3, ObjectInputStream objectInputStream, int i12) throws ClassNotFoundException, IOException {
        for (int i13 = 0; i13 < i12; i13++) {
            interfaceC37338g3.add(objectInputStream.readInt(), objectInputStream.readObject());
        }
    }

    public static <K, V> void e(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static <K, V> void f(R2<K, V> r22, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(r22.V().size());
        for (Map.Entry<K, Collection<V>> entry : r22.V().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static <E> void g(InterfaceC37338g3<E> interfaceC37338g3, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(interfaceC37338g3.entrySet().size());
        for (InterfaceC37338g3.a<E> aVar : interfaceC37338g3.entrySet()) {
            objectOutputStream.writeObject(aVar.a());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }
}
