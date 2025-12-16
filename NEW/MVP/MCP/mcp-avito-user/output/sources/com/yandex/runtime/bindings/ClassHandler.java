package com.yandex.runtime.bindings;

import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes8.dex */
public class ClassHandler<T extends Serializable> implements ArchivingHandler<T> {
    private final boolean isOptional;
    private Class<T> itemClass;

    public ClassHandler(Class<T> cls) {
        this(false, cls);
    }

    public ClassHandler(boolean z12, Class<T> cls) {
        this.isOptional = z12;
        this.itemClass = cls;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public T add(T t12, Archive archive) {
        return (T) archive.add((Archive) t12, this.isOptional, (Class<Archive>) this.itemClass);
    }
}
