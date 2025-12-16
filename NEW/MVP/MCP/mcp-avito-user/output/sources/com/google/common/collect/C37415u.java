package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ArrayListMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37415u<K, V> extends AbstractC37420v<K, V> {

    @XY0.c
    @XY0.d
    private static final long serialVersionUID = 0;

    /* renamed from: i, reason: collision with root package name */
    @XY0.e
    public transient int f360011i;

    public C37415u() {
        super(new K(12));
        F.b(3, "expectedValuesPerKey");
        this.f360011i = 3;
    }

    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f360011i = 3;
        int i12 = objectInputStream.readInt();
        p(new K());
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

    @Override // com.google.common.collect.AbstractC37322e, com.google.common.collect.AbstractC37328f
    /* renamed from: u */
    public final List<V> k() {
        return new ArrayList(this.f360011i);
    }
}
