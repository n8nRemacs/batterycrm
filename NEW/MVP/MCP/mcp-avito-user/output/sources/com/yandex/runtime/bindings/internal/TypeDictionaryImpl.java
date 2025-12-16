package com.yandex.runtime.bindings.internal;

import AK.c;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.TypeDictionary;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final class TypeDictionaryImpl<T> implements TypeDictionary<T> {
    private Map<String, T> map;
    private NativeObject nativeObject;

    private TypeDictionaryImpl(NativeObject nativeObject) {
        this.map = new ConcurrentHashMap();
        this.nativeObject = nativeObject;
    }

    private <U extends T> U getItemByKey(String str) {
        U u12;
        T t12 = this.map.get(str);
        if (t12 != null || this.nativeObject == null) {
            return t12;
        }
        U u13 = (U) getItemNative(str);
        return (u13 == null || (u12 = (U) this.map.putIfAbsent(str, u13)) == null) ? u13 : u12;
    }

    private native Object getItemNative(String str);

    private native List<String> getKeys();

    private <U> String keyForClass(Class<U> cls) {
        try {
            return (String) cls.getMethod("getNativeName", new Class[0]).invoke(null, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e12) {
            throw new IllegalArgumentException(c.k("Objects of class ", cls.getName(), " cannot be stored in com.yandex.runtime.bindings.internal.TypeDictionaryImpl"), e12);
        }
    }

    @Override // com.yandex.runtime.TypeDictionary
    public Map<String, T> getAllItems() {
        if (this.nativeObject != null) {
            Iterator<String> it = getKeys().iterator();
            while (it.hasNext()) {
                getItemByKey(it.next());
            }
        }
        return this.map;
    }

    @Override // com.yandex.runtime.TypeDictionary
    public <U extends T> U getItem(Class<U> cls) {
        String strKeyForClass = keyForClass(cls);
        if (strKeyForClass == null) {
            return null;
        }
        return (U) getItemByKey(strKeyForClass);
    }

    public TypeDictionaryImpl(Map<String, T> map) {
        new ConcurrentHashMap();
        this.map = map;
    }
}
