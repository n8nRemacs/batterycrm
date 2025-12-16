package com.yandex.runtime.bindings.internal;

import com.yandex.runtime.NativeObject;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
class StringDictionary<E> extends AbstractMap<String, E> {
    private ConcurrentHashMap<String, E> map = new ConcurrentHashMap<>();
    private NativeObject nativeObject;

    public StringDictionary(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj) || containsKeyNative(obj);
    }

    public native boolean containsKeyNative(Object obj);

    @Override // java.util.AbstractMap, java.util.Map
    public native Set<Map.Entry<String, E>> entrySet();

    @Override // java.util.AbstractMap, java.util.Map
    public E get(Object obj) {
        E ePutIfAbsent;
        E e12 = this.map.get(obj);
        if (e12 != null) {
            return e12;
        }
        E e13 = getNative(obj);
        return (e13 == null || (ePutIfAbsent = this.map.putIfAbsent((String) obj, e13)) == null) ? e13 : ePutIfAbsent;
    }

    public native E getNative(Object obj);

    @Override // java.util.AbstractMap, java.util.Map
    public native int size();
}
