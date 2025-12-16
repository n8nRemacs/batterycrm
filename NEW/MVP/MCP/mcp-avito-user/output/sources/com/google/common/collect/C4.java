package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: TreeMultimap.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public class C4<K, V> extends AbstractC37382o<K, V> {

    @XY0.c
    @XY0.d
    private static final long serialVersionUID = 0;

    /* renamed from: i, reason: collision with root package name */
    public transient Comparator<? super K> f359280i;

    /* renamed from: j, reason: collision with root package name */
    public transient Comparator<? super V> f359281j;

    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator<? super K> comparator = (Comparator) objectInputStream.readObject();
        comparator.getClass();
        this.f359280i = comparator;
        Comparator<? super V> comparator2 = (Comparator) objectInputStream.readObject();
        comparator2.getClass();
        this.f359281j = comparator2;
        p(new TreeMap(this.f359280i));
        S3.c(this, objectInputStream, objectInputStream.readInt());
    }

    @XY0.c
    @XY0.d
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f359280i);
        objectOutputStream.writeObject(this.f359281j);
        S3.f(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC37382o, com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    public final Map V() {
        return (NavigableMap) super.V();
    }

    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.AbstractC37346i
    public final Map<K, Collection<V>> c() {
        return m();
    }

    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.R2
    public final boolean containsKey(@I41.a Object obj) {
        return this.f359734g.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.r, com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37328f, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    @XY0.c
    public final Collection get(@InterfaceC37434x3 Object obj) {
        return (NavigableSet) super.get((C4<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractC37382o, com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractC37328f
    public final Collection<V> l(@InterfaceC37434x3 K k12) {
        if (k12 == null) {
            this.f359280i.compare(k12, k12);
        }
        return k();
    }

    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.R2
    public final int size() {
        return this.f359735h;
    }

    @Override // com.google.common.collect.r, com.google.common.collect.AbstractC37376n
    /* renamed from: w */
    public final SortedSet<V> k() {
        return new TreeSet(this.f359281j);
    }

    @Override // com.google.common.collect.AbstractC37382o
    /* renamed from: x */
    public final SortedMap V() {
        return (NavigableMap) super.V();
    }

    @Override // com.google.common.collect.AbstractC37382o
    /* renamed from: y */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.r, com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37328f, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    @XY0.c
    public final Set get(@InterfaceC37434x3 Object obj) {
        return (NavigableSet) super.get((C4<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.r, com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37328f, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    @XY0.c
    public final SortedSet get(@InterfaceC37434x3 Object obj) {
        return (NavigableSet) super.get((C4<K, V>) obj);
    }
}
