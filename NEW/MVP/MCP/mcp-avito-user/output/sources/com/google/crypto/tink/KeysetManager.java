package com.google.crypto.tink;

import J41.a;
import aZ0.InterfaceC19845a;
import aZ0.l;
import com.google.crypto.tink.internal.KeyStatusTypeProtoConverter;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.tinkkey.KeyAccess;
import com.google.crypto.tink.tinkkey.KeyHandle;
import com.google.crypto.tink.tinkkey.internal.ProtoKey;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class KeysetManager {

    @a
    private final Keyset.Builder keysetBuilder;

    private KeysetManager(Keyset.Builder builder) {
        this.keysetBuilder = builder;
    }

    private synchronized Keyset.Key createKeysetKey(KeyData keyData, OutputPrefixType outputPrefixType) {
        int iNewKeyId;
        iNewKeyId = newKeyId();
        if (outputPrefixType == OutputPrefixType.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return Keyset.Key.newBuilder().setKeyData(keyData).setKeyId(iNewKeyId).setStatus(KeyStatusType.ENABLED).setOutputPrefixType(outputPrefixType).build();
    }

    private synchronized boolean keyIdExists(int i12) {
        Iterator<Keyset.Key> it = this.keysetBuilder.getKeyList().iterator();
        while (it.hasNext()) {
            if (it.next().getKeyId() == i12) {
                return true;
            }
        }
        return false;
    }

    private synchronized Keyset.Key newKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        return createKeysetKey(Registry.newKeyData(keyTemplate), keyTemplate.getOutputPrefixType());
    }

    private synchronized int newKeyId() {
        int iRandKeyId;
        iRandKeyId = com.google.crypto.tink.internal.Util.randKeyId();
        while (keyIdExists(iRandKeyId)) {
            iRandKeyId = com.google.crypto.tink.internal.Util.randKeyId();
        }
        return iRandKeyId;
    }

    public static KeysetManager withEmptyKeyset() {
        return new KeysetManager(Keyset.newBuilder());
    }

    public static KeysetManager withKeysetHandle(KeysetHandle keysetHandle) {
        return new KeysetManager(keysetHandle.getKeyset().toBuilder());
    }

    @InterfaceC19845a
    @Deprecated
    public synchronized KeysetManager add(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        addNewKey(keyTemplate, false);
        return this;
    }

    @InterfaceC19845a
    @Deprecated
    public synchronized int addNewKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate, boolean z12) {
        Keyset.Key keyNewKey;
        try {
            keyNewKey = newKey(keyTemplate);
            this.keysetBuilder.addKey(keyNewKey);
            if (z12) {
                this.keysetBuilder.setPrimaryKeyId(keyNewKey.getKeyId());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return keyNewKey.getKeyId();
    }

    @InterfaceC19845a
    public synchronized KeysetManager delete(int i12) {
        if (i12 == this.keysetBuilder.getPrimaryKeyId()) {
            throw new GeneralSecurityException("cannot delete the primary key");
        }
        for (int i13 = 0; i13 < this.keysetBuilder.getKeyCount(); i13++) {
            if (this.keysetBuilder.getKey(i13).getKeyId() == i12) {
                this.keysetBuilder.removeKey(i13);
            }
        }
        throw new GeneralSecurityException("key not found: " + i12);
        return this;
    }

    @InterfaceC19845a
    public synchronized KeysetManager destroy(int i12) {
        try {
            if (i12 == this.keysetBuilder.getPrimaryKeyId()) {
                throw new GeneralSecurityException("cannot destroy the primary key");
            }
            for (int i13 = 0; i13 < this.keysetBuilder.getKeyCount(); i13++) {
                Keyset.Key key = this.keysetBuilder.getKey(i13);
                if (key.getKeyId() == i12) {
                    if (key.getStatus() != KeyStatusType.ENABLED && key.getStatus() != KeyStatusType.DISABLED && key.getStatus() != KeyStatusType.DESTROYED) {
                        throw new GeneralSecurityException("cannot destroy key with id " + i12);
                    }
                    this.keysetBuilder.setKey(i13, key.toBuilder().setStatus(KeyStatusType.DESTROYED).clearKeyData().build());
                }
            }
            throw new GeneralSecurityException("key not found: " + i12);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @InterfaceC19845a
    public synchronized KeysetManager disable(int i12) {
        try {
            if (i12 == this.keysetBuilder.getPrimaryKeyId()) {
                throw new GeneralSecurityException("cannot disable the primary key");
            }
            for (int i13 = 0; i13 < this.keysetBuilder.getKeyCount(); i13++) {
                Keyset.Key key = this.keysetBuilder.getKey(i13);
                if (key.getKeyId() == i12) {
                    if (key.getStatus() != KeyStatusType.ENABLED && key.getStatus() != KeyStatusType.DISABLED) {
                        throw new GeneralSecurityException("cannot disable key with id " + i12);
                    }
                    this.keysetBuilder.setKey(i13, key.toBuilder().setStatus(KeyStatusType.DISABLED).build());
                }
            }
            throw new GeneralSecurityException("key not found: " + i12);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @InterfaceC19845a
    public synchronized KeysetManager enable(int i12) {
        for (int i13 = 0; i13 < this.keysetBuilder.getKeyCount(); i13++) {
            try {
                Keyset.Key key = this.keysetBuilder.getKey(i13);
                if (key.getKeyId() == i12) {
                    KeyStatusType status = key.getStatus();
                    KeyStatusType keyStatusType = KeyStatusType.ENABLED;
                    if (status != keyStatusType && key.getStatus() != KeyStatusType.DISABLED) {
                        throw new GeneralSecurityException("cannot enable key with id " + i12);
                    }
                    this.keysetBuilder.setKey(i13, key.toBuilder().setStatus(keyStatusType).build());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        throw new GeneralSecurityException("key not found: " + i12);
        return this;
    }

    public synchronized KeysetHandle getKeysetHandle() {
        return KeysetHandle.fromKeyset(this.keysetBuilder.build());
    }

    @InterfaceC19845a
    @l
    @Deprecated
    public synchronized KeysetManager promote(int i12) {
        return setPrimary(i12);
    }

    @InterfaceC19845a
    @Deprecated
    public synchronized KeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        addNewKey(keyTemplate, true);
        return this;
    }

    @InterfaceC19845a
    public synchronized KeysetManager setPrimary(int i12) {
        for (int i13 = 0; i13 < this.keysetBuilder.getKeyCount(); i13++) {
            Keyset.Key key = this.keysetBuilder.getKey(i13);
            if (key.getKeyId() == i12) {
                if (!key.getStatus().equals(KeyStatusType.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i12);
                }
                this.keysetBuilder.setPrimaryKeyId(i12);
            }
        }
        throw new GeneralSecurityException("key not found: " + i12);
        return this;
    }

    @InterfaceC19845a
    public synchronized KeysetManager add(KeyTemplate keyTemplate) {
        addNewKey(keyTemplate.getProto(), false);
        return this;
    }

    @InterfaceC19845a
    public synchronized KeysetManager add(KeyHandle keyHandle) {
        try {
            ProtoKey protoKey = (ProtoKey) keyHandle.getKey(com.google.crypto.tink.tinkkey.SecretKeyAccess.insecureSecretAccess());
            if (!keyIdExists(keyHandle.getId())) {
                this.keysetBuilder.addKey(Keyset.Key.newBuilder().setKeyData(protoKey.getProtoKey()).setKeyId(keyHandle.getId()).setStatus(KeyStatusTypeProtoConverter.toProto(keyHandle.getStatus())).setOutputPrefixType(KeyTemplate.toProto(protoKey.getOutputPrefixType())).build());
            } else {
                throw new GeneralSecurityException("Trying to add a key with an ID already contained in the keyset.");
            }
        } catch (ClassCastException e12) {
            throw new UnsupportedOperationException("KeyHandles which contain TinkKeys that are not ProtoKeys are not yet supported.", e12);
        }
        return this;
    }

    @InterfaceC19845a
    public synchronized KeysetManager add(KeyHandle keyHandle, KeyAccess keyAccess) {
        return add(keyHandle);
    }
}
