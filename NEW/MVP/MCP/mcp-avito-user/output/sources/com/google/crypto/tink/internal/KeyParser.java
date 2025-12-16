package com.google.crypto.tink.internal;

import I41.h;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.util.Bytes;

/* loaded from: classes6.dex */
public abstract class KeyParser<SerializationT extends Serialization> {
    private final Bytes objectIdentifier;
    private final Class<SerializationT> serializationClass;

    public interface KeyParsingFunction<SerializationT extends Serialization> {
        Key parseKey(SerializationT serializationt, @h SecretKeyAccess secretKeyAccess);
    }

    public static <SerializationT extends Serialization> KeyParser<SerializationT> create(final KeyParsingFunction<SerializationT> keyParsingFunction, Bytes bytes, Class<SerializationT> cls) {
        return (KeyParser<SerializationT>) new KeyParser<SerializationT>(bytes, cls) { // from class: com.google.crypto.tink.internal.KeyParser.1
            @Override // com.google.crypto.tink.internal.KeyParser
            public Key parseKey(SerializationT serializationt, @h SecretKeyAccess secretKeyAccess) {
                return keyParsingFunction.parseKey(serializationt, secretKeyAccess);
            }
        };
    }

    public final Bytes getObjectIdentifier() {
        return this.objectIdentifier;
    }

    public final Class<SerializationT> getSerializationClass() {
        return this.serializationClass;
    }

    public abstract Key parseKey(SerializationT serializationt, @h SecretKeyAccess secretKeyAccess);

    private KeyParser(Bytes bytes, Class<SerializationT> cls) {
        this.objectIdentifier = bytes;
        this.serializationClass = cls;
    }
}
