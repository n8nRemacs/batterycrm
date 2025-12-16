package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.iu0;
import com.yandex.mobile.ads.impl.z71;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
final class b0<K, V> extends c<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: f, reason: collision with root package name */
    transient z71<? extends List<V>> f382711f;

    public b0(Map<K, Collection<V>> map, z71<? extends List<V>> z71Var) {
        super(map);
        this.f382711f = (z71) iu0.a(z71Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f382711f = (z71) objectInputStream.readObject();
        a((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f382711f);
        objectOutputStream.writeObject(c());
    }
}
