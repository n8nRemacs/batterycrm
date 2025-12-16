package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

/* compiled from: HashMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.f1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37330f1<K, V> extends AbstractC37336g1<K, V> {

    @XY0.c
    @XY0.d
    private static final long serialVersionUID = 0;

    /* renamed from: i, reason: collision with root package name */
    @XY0.e
    public transient int f359769i;

    public C37330f1() {
        super(new K(12));
        this.f359769i = 2;
        this.f359769i = 2;
    }

    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f359769i = 2;
        int i12 = objectInputStream.readInt();
        p(new K(12));
        S3.c(this, objectInputStream, i12);
    }

    @XY0.c
    @XY0.d
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        S3.f(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.R2
    public final boolean containsKey(@I41.a Object obj) {
        return this.f359734g.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC37328f, com.google.common.collect.R2
    public final int size() {
        return this.f359735h;
    }

    @Override // com.google.common.collect.AbstractC37376n, com.google.common.collect.AbstractC37328f
    /* renamed from: u */
    public final Set<V> k() {
        return new L(this.f359769i);
    }
}
