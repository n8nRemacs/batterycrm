package com.yandex.runtime.bindings;

import com.yandex.runtime.TypeDictionary;

/* loaded from: classes8.dex */
public class TypeDictionaryHandler<T> implements ArchivingHandler<TypeDictionary<T>> {
    private final boolean isOptional;
    private final ArchivingHandler<T> valueHandler;

    public TypeDictionaryHandler(ArchivingHandler<T> archivingHandler) {
        this(false, archivingHandler);
    }

    public TypeDictionaryHandler(boolean z12, ArchivingHandler<T> archivingHandler) {
        this.isOptional = z12;
        this.valueHandler = archivingHandler;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public TypeDictionary<T> add(TypeDictionary<T> typeDictionary, Archive archive) {
        return archive.add(typeDictionary, this.isOptional, this.valueHandler);
    }
}
