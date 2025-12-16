package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: EnumHashBiMap.java */
@XY0.b
@InterfaceC37329f0
@XY0.d
/* renamed from: com.google.common.collect.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37359k0<K extends Enum<K>, V> extends AbstractC37304b<K, V> {

    @XY0.c
    private static final long serialVersionUID = 0;

    /* renamed from: g, reason: collision with root package name */
    public transient Class<K> f359808g;

    @XY0.c
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.f359808g = (Class) object;
        c0(new EnumMap(this.f359808g), new HashMap());
        S3.b(this, objectInputStream, objectInputStream.readInt());
    }

    @XY0.c
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f359808g);
        S3.e(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC37304b, com.google.common.collect.A
    public final A O() {
        return this.f359635c;
    }

    @Override // com.google.common.collect.AbstractC37304b
    public final Object a0(Object obj) {
        Enum r12 = (Enum) obj;
        r12.getClass();
        return r12;
    }

    @Override // com.google.common.collect.AbstractC37304b, com.google.common.collect.M0, java.util.Map
    public final boolean containsValue(@I41.a Object obj) {
        return this.f359635c.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC37304b, com.google.common.collect.M0, java.util.Map
    @I41.a
    @InterfaceC19845a
    public final Object put(Object obj, @InterfaceC37434x3 Object obj2) {
        return super.put((Enum) obj, obj2);
    }
}
