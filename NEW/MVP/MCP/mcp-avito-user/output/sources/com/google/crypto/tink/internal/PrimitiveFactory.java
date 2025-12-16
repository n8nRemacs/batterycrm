package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.MessageLite;

/* loaded from: classes6.dex */
public abstract class PrimitiveFactory<PrimitiveT, KeyProtoT extends MessageLite> {
    private final Class<PrimitiveT> clazz;

    public PrimitiveFactory(Class<PrimitiveT> cls) {
        this.clazz = cls;
    }

    public abstract PrimitiveT getPrimitive(KeyProtoT keyprotot);

    public final Class<PrimitiveT> getPrimitiveClass() {
        return this.clazz;
    }
}
