package com.yandex.runtime.bindings;

import java.lang.Enum;

/* loaded from: classes8.dex */
public class EnumHandler<T extends Enum<T>> implements ArchivingHandler<T> {
    private Class<T> enumClass;
    private final boolean isOptional;

    public EnumHandler(Class<T> cls) {
        this(false, cls);
    }

    public EnumHandler(boolean z12, Class<T> cls) {
        this.isOptional = z12;
        this.enumClass = cls;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public T add(T t12, Archive archive) {
        return (T) archive.add((Archive) t12, this.isOptional, (Class<Archive>) this.enumClass);
    }
}
