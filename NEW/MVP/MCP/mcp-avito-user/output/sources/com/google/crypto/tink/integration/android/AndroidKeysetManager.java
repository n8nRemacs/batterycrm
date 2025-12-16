package com.google.crypto.tink.integration.android;

import AK.c;
import J41.a;
import aZ0.InterfaceC19845a;
import aZ0.l;
import android.content.Context;
import android.preference.PreferenceManager;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.BinaryKeysetReader;
import com.google.crypto.tink.CleartextKeysetHandle;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.KeysetManager;
import com.google.crypto.tink.KeysetWriter;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Hex;
import j.InterfaceC42155k;
import j.P;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* loaded from: classes6.dex */
public final class AndroidKeysetManager {
    private static final String TAG = "AndroidKeysetManager";
    private static final Object lock = new Object();

    @a
    private KeysetManager keysetManager;
    private final Aead masterAead;
    private final KeysetWriter writer;

    /* renamed from: com.google.crypto.tink.integration.android.AndroidKeysetManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public /* synthetic */ AndroidKeysetManager(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static KeyTemplate.OutputPrefixType fromProto(OutputPrefixType outputPrefixType) {
        int i12 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i12 == 1) {
            return KeyTemplate.OutputPrefixType.TINK;
        }
        if (i12 == 2) {
            return KeyTemplate.OutputPrefixType.LEGACY;
        }
        if (i12 == 3) {
            return KeyTemplate.OutputPrefixType.RAW;
        }
        if (i12 == 4) {
            return KeyTemplate.OutputPrefixType.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC42155k
    public static boolean isAtLeastM() {
        return true;
    }

    @InterfaceC42155k
    private boolean shouldUseKeystore() {
        return this.masterAead != null && isAtLeastM();
    }

    private void write(KeysetManager keysetManager) throws GeneralSecurityException {
        try {
            if (shouldUseKeystore()) {
                keysetManager.getKeysetHandle().write(this.writer, this.masterAead);
            } else {
                CleartextKeysetHandle.write(keysetManager.getKeysetHandle(), this.writer);
            }
        } catch (IOException e12) {
            throw new GeneralSecurityException(e12);
        }
    }

    @InterfaceC19845a
    @a
    @Deprecated
    public synchronized AndroidKeysetManager add(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        KeysetManager keysetManagerAdd = this.keysetManager.add(keyTemplate);
        this.keysetManager = keysetManagerAdd;
        write(keysetManagerAdd);
        return this;
    }

    @InterfaceC19845a
    public synchronized AndroidKeysetManager delete(int i12) {
        KeysetManager keysetManagerDelete = this.keysetManager.delete(i12);
        this.keysetManager = keysetManagerDelete;
        write(keysetManagerDelete);
        return this;
    }

    @InterfaceC19845a
    public synchronized AndroidKeysetManager destroy(int i12) {
        KeysetManager keysetManagerDestroy = this.keysetManager.destroy(i12);
        this.keysetManager = keysetManagerDestroy;
        write(keysetManagerDestroy);
        return this;
    }

    @InterfaceC19845a
    public synchronized AndroidKeysetManager disable(int i12) {
        KeysetManager keysetManagerDisable = this.keysetManager.disable(i12);
        this.keysetManager = keysetManagerDisable;
        write(keysetManagerDisable);
        return this;
    }

    @InterfaceC19845a
    public synchronized AndroidKeysetManager enable(int i12) {
        KeysetManager keysetManagerEnable = this.keysetManager.enable(i12);
        this.keysetManager = keysetManagerEnable;
        write(keysetManagerEnable);
        return this;
    }

    public synchronized KeysetHandle getKeysetHandle() {
        return this.keysetManager.getKeysetHandle();
    }

    public synchronized boolean isUsingKeystore() {
        return shouldUseKeystore();
    }

    @InterfaceC19845a
    @l
    @Deprecated
    public synchronized AndroidKeysetManager promote(int i12) {
        return setPrimary(i12);
    }

    @InterfaceC19845a
    @Deprecated
    public synchronized AndroidKeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        KeysetManager keysetManagerRotate = this.keysetManager.rotate(keyTemplate);
        this.keysetManager = keysetManagerRotate;
        write(keysetManagerRotate);
        return this;
    }

    @InterfaceC19845a
    public synchronized AndroidKeysetManager setPrimary(int i12) {
        KeysetManager primary = this.keysetManager.setPrimary(i12);
        this.keysetManager = primary;
        write(primary);
        return this;
    }

    public static final class Builder {

        @a
        private KeysetManager keysetManager;
        private Context context = null;
        private String keysetName = null;
        private String prefFileName = null;
        private String masterKeyUri = null;
        private Aead masterAead = null;
        private boolean useKeystore = true;
        private KeyTemplate keyTemplate = null;

        private KeysetManager generateKeysetAndWriteToPrefs() throws GeneralSecurityException {
            if (this.keyTemplate == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            KeysetManager keysetManagerAdd = KeysetManager.withEmptyKeyset().add(this.keyTemplate);
            KeysetManager primary = keysetManagerAdd.setPrimary(keysetManagerAdd.getKeysetHandle().getKeysetInfo().getKeyInfo(0).getKeyId());
            SharedPrefKeysetWriter sharedPrefKeysetWriter = new SharedPrefKeysetWriter(this.context, this.keysetName, this.prefFileName);
            if (this.masterAead != null) {
                primary.getKeysetHandle().write(sharedPrefKeysetWriter, this.masterAead);
            } else {
                CleartextKeysetHandle.write(primary.getKeysetHandle(), sharedPrefKeysetWriter);
            }
            return primary;
        }

        @P
        private static byte[] readKeysetFromPrefs(Context context, String str, String str2) throws CharConversionException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return Hex.decode(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(c.k("can't read keyset; the pref value ", str, " is not a valid hex string"));
            }
        }

        private KeysetManager readKeysetInCleartext(byte[] bArr) {
            return KeysetManager.withKeysetHandle(CleartextKeysetHandle.read(BinaryKeysetReader.withBytes(bArr)));
        }

        private KeysetManager readMasterkeyDecryptAndParseKeyset(byte[] bArr) {
            try {
                this.masterAead = new AndroidKeystoreKmsClient().getAead(this.masterKeyUri);
                try {
                    return KeysetManager.withKeysetHandle(KeysetHandle.read(BinaryKeysetReader.withBytes(bArr), this.masterAead));
                } catch (IOException | GeneralSecurityException e12) {
                    try {
                        return readKeysetInCleartext(bArr);
                    } catch (IOException unused) {
                        throw e12;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e13) {
                try {
                    KeysetManager keysetInCleartext = readKeysetInCleartext(bArr);
                    String unused2 = AndroidKeysetManager.TAG;
                    return keysetInCleartext;
                } catch (IOException unused3) {
                    throw e13;
                }
            }
        }

        @P
        private Aead readOrGenerateNewMasterKey() throws KeyStoreException {
            if (!AndroidKeysetManager.isAtLeastM()) {
                String unused = AndroidKeysetManager.TAG;
                return null;
            }
            AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
            try {
                boolean zGenerateKeyIfNotExist = AndroidKeystoreKmsClient.generateKeyIfNotExist(this.masterKeyUri);
                try {
                    return androidKeystoreKmsClient.getAead(this.masterKeyUri);
                } catch (GeneralSecurityException | ProviderException e12) {
                    if (!zGenerateKeyIfNotExist) {
                        throw new KeyStoreException(c.k("the master key ", this.masterKeyUri, " exists but is unusable"), e12);
                    }
                    String unused2 = AndroidKeysetManager.TAG;
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException unused3) {
                String unused4 = AndroidKeysetManager.TAG;
                return null;
            }
        }

        public synchronized AndroidKeysetManager build() {
            AndroidKeysetManager androidKeysetManager;
            try {
                if (this.keysetName == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                synchronized (AndroidKeysetManager.lock) {
                    try {
                        byte[] keysetFromPrefs = readKeysetFromPrefs(this.context, this.keysetName, this.prefFileName);
                        if (keysetFromPrefs == null) {
                            if (this.masterKeyUri != null) {
                                this.masterAead = readOrGenerateNewMasterKey();
                            }
                            this.keysetManager = generateKeysetAndWriteToPrefs();
                        } else if (this.masterKeyUri == null || !AndroidKeysetManager.isAtLeastM()) {
                            this.keysetManager = readKeysetInCleartext(keysetFromPrefs);
                        } else {
                            this.keysetManager = readMasterkeyDecryptAndParseKeyset(keysetFromPrefs);
                        }
                        androidKeysetManager = new AndroidKeysetManager(this, null);
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return androidKeysetManager;
        }

        @InterfaceC19845a
        @Deprecated
        public Builder doNotUseKeystore() {
            this.masterKeyUri = null;
            this.useKeystore = false;
            return this;
        }

        @InterfaceC19845a
        @Deprecated
        public Builder withKeyTemplate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
            this.keyTemplate = KeyTemplate.create(keyTemplate.getTypeUrl(), keyTemplate.getValue().toByteArray(), AndroidKeysetManager.fromProto(keyTemplate.getOutputPrefixType()));
            return this;
        }

        @InterfaceC19845a
        public Builder withMasterKeyUri(String str) {
            if (!str.startsWith(AndroidKeystoreKmsClient.PREFIX)) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.useKeystore) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.masterKeyUri = str;
            return this;
        }

        @InterfaceC19845a
        public Builder withSharedPref(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.context = context;
            this.keysetName = str;
            this.prefFileName = str2;
            return this;
        }

        @InterfaceC19845a
        public Builder withKeyTemplate(KeyTemplate keyTemplate) {
            this.keyTemplate = keyTemplate;
            return this;
        }
    }

    private AndroidKeysetManager(Builder builder) {
        this.writer = new SharedPrefKeysetWriter(builder.context, builder.keysetName, builder.prefFileName);
        this.masterAead = builder.masterAead;
        this.keysetManager = builder.keysetManager;
    }

    @InterfaceC19845a
    @a
    public synchronized AndroidKeysetManager add(KeyTemplate keyTemplate) {
        KeysetManager keysetManagerAdd = this.keysetManager.add(keyTemplate);
        this.keysetManager = keysetManagerAdd;
        write(keysetManagerAdd);
        return this;
    }
}
