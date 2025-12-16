package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.AbstractC37437y1;
import com.google.common.collect.S3;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: ImmutableListMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.s1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37407s1<K, V> extends AbstractC37437y1<K, V> implements InterfaceC37408s2<K, V> {

    @XY0.c
    @XY0.d
    private static final long serialVersionUID = 0;

    /* compiled from: ImmutableListMultimap.java */
    /* renamed from: com.google.common.collect.s1$a */
    public static final class a<K, V> extends AbstractC37437y1.b<K, V> {
    }

    public C37407s1() {
        throw null;
    }

    public static <K, V> C37407s1<K, V> q() {
        return C37341h0.f359790i;
    }

    public static C37407s1 r(String str) {
        a aVar = new a();
        F.a("charset", str);
        K k12 = (K) aVar.f360078a;
        Collection arrayList = (Collection) k12.get("charset");
        if (arrayList == null) {
            arrayList = new ArrayList();
            k12.put("charset", arrayList);
        }
        arrayList.add(str);
        Set<Map.Entry<K, V>> setEntrySet = k12.entrySet();
        if (setEntrySet.isEmpty()) {
            return C37341h0.f359790i;
        }
        AbstractC37412t1.b bVar = new AbstractC37412t1.b(setEntrySet.size());
        int size = 0;
        for (Map.Entry<K, V> entry : setEntrySet) {
            K key = entry.getKey();
            AbstractC37401r1 abstractC37401r1V = AbstractC37401r1.v((Collection) entry.getValue());
            if (!abstractC37401r1V.isEmpty()) {
                bVar.c(key, abstractC37401r1V);
                size = abstractC37401r1V.size() + size;
            }
        }
        return new C37407s1(bVar.a(true), size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        int i12 = objectInputStream.readInt();
        if (i12 < 0) {
            throw new InvalidObjectException(AK.c.g(i12, "Invalid key count "));
        }
        AbstractC37412t1.b bVar = new AbstractC37412t1.b();
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i15 = objectInputStream.readInt();
            if (i15 <= 0) {
                throw new InvalidObjectException(AK.c.g(i15, "Invalid value count "));
            }
            O4<Object> o42 = AbstractC37401r1.f359977c;
            AbstractC37401r1.a aVar = new AbstractC37401r1.a();
            for (int i16 = 0; i16 < i15; i16++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                aVar.g(object2);
            }
            bVar.c(object, aVar.i());
            i13 += i15;
        }
        try {
            AbstractC37437y1.d.f360080a.a(this, bVar.a(true));
            S3.b<AbstractC37437y1> bVar2 = AbstractC37437y1.d.f360081b;
            bVar2.getClass();
            try {
                bVar2.f359573a.set(this, Integer.valueOf(i13));
            } catch (IllegalAccessException e12) {
                throw new AssertionError(e12);
            }
        } catch (IllegalArgumentException e13) {
            throw ((InvalidObjectException) new InvalidObjectException(e13.getMessage()).initCause(e13));
        }
    }

    @XY0.c
    @XY0.d
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        S3.f(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC37437y1, com.google.common.collect.R2, com.google.common.collect.T3
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final Collection a(@I41.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC37437y1, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public final Collection get(Object obj) {
        AbstractC37401r1 abstractC37401r1 = (AbstractC37401r1) this.f360073g.get(obj);
        if (abstractC37401r1 != null) {
            return abstractC37401r1;
        }
        O4<Object> o42 = AbstractC37401r1.f359977c;
        return I3.f359390f;
    }

    @Override // com.google.common.collect.AbstractC37437y1
    /* renamed from: n */
    public final AbstractC37378n1 get(Object obj) {
        AbstractC37401r1 abstractC37401r1 = (AbstractC37401r1) this.f360073g.get(obj);
        if (abstractC37401r1 != null) {
            return abstractC37401r1;
        }
        O4<Object> o42 = AbstractC37401r1.f359977c;
        return I3.f359390f;
    }

    @Override // com.google.common.collect.AbstractC37437y1
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final AbstractC37378n1 p() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC37437y1, com.google.common.collect.R2, com.google.common.collect.T3
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final List a(@I41.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC37437y1, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public final List get(Object obj) {
        AbstractC37401r1 abstractC37401r1 = (AbstractC37401r1) this.f360073g.get(obj);
        if (abstractC37401r1 != null) {
            return abstractC37401r1;
        }
        O4<Object> o42 = AbstractC37401r1.f359977c;
        return I3.f359390f;
    }
}
