package com.yandex.runtime.attestation_storage.internal;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.google.android.gms.tasks.InterfaceC37023f;
import com.google.android.gms.tasks.InterfaceC37024g;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.b;
import com.google.android.play.core.integrity.c;
import com.google.android.play.core.integrity.d;
import com.yandex.runtime.Runtime;
import com.yandex.runtime.attestation.EcPublicKey;
import com.yandex.runtime.logging.Logger;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class PlatformKeystoreImpl implements PlatformKeystore {
    private static final int CERTIFICATE_VALID_YEARS = 10;
    private static final String KEY_ALIAS_BASE = "MAPKIT_ATTESTED_KEY_";
    private String alias;
    private KeyStore keyStore;
    private KeyStore.PrivateKeyEntry privateKeyEntry;

    private PlatformKeystoreImpl(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, UnrecoverableEntryException {
        this.alias = str;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.keyStore = keyStore;
            try {
                keyStore.load(null);
                if (hasEntry()) {
                    tryLoadEntry();
                }
            } catch (NoSuchAlgorithmException e12) {
                throw new IllegalStateException("Can't check the integrity of keystore: " + e12.getMessage());
            }
        } catch (KeyStoreException e13) {
            throw new IllegalStateException("No Android Key Store in the system: " + e13.getMessage());
        }
    }

    public static boolean attestationAvailable() throws CertificateException {
        Provider provider = Security.getProvider("AndroidKeyStore");
        if (provider == null || provider.getService("KeyPairGenerator", "EC") == null || provider.getService("KeyFactory", "EC") == null || Security.getProviders("Signature.NONEwithECDSA").length == 0) {
            return false;
        }
        try {
            CertificateFactory.getInstance("X.509");
            return Security.getProviders("MessageDigest.SHA-256").length != 0;
        } catch (CertificateException unused) {
            return false;
        }
    }

    public static void cleanupUnusedKeys(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            try {
                keyStore.load(null);
                try {
                    Iterator it = Collections.list(keyStore.aliases()).iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (str2.startsWith(KEY_ALIAS_BASE)) {
                            if (str != null) {
                                if (str2.equals(KEY_ALIAS_BASE + str)) {
                                }
                            }
                            keyStore.deleteEntry(str2);
                        }
                    }
                } catch (KeyStoreException e12) {
                    Logger.error("Could not delete entry: " + e12.getMessage());
                }
            } catch (IOException e13) {
                Logger.error("Could not load keystore for key cleanup. I/O error: " + e13.getMessage());
            } catch (NoSuchAlgorithmException e14) {
                Logger.error("Could not load keystore for key cleanup. No such algorithm for checking keystore integrity: " + e14.getMessage());
            } catch (CertificateException e15) {
                Logger.error("Could not load keystore for key cleanup. Could not load certificate: " + e15.getMessage());
            }
        } catch (KeyStoreException e16) {
            Logger.error("Could not get keystore implementation for key cleanup: " + e16.getMessage());
        }
    }

    public static PlatformKeystore createKeystore(String str) {
        try {
            return new PlatformKeystoreImpl(KEY_ALIAS_BASE + str);
        } catch (IOException | CertificateException unused) {
            return null;
        }
    }

    private String createNonce(byte[] bArr) throws NoSuchAlgorithmException, CertificateException {
        try {
            byte[] certificateChain = getCertificateChain();
            if (certificateChain == null) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(certificateChain);
            return Base64.encodeToString(messageDigest.digest(), 10);
        } catch (NoSuchAlgorithmException e12) {
            throw new IllegalStateException("No SHA-256 algorithm in the environment: " + e12.getMessage());
        }
    }

    private byte[] getCertificateChain() throws CertificateException {
        if (this.privateKeyEntry == null) {
            throw new IllegalStateException("Key entry is null. Generate key first.");
        }
        try {
            try {
                return CertificateFactory.getInstance("X.509").generateCertPath(Arrays.asList(this.privateKeyEntry.getCertificateChain())).getEncoded();
            } catch (CertificateEncodingException | CertificateException unused) {
                return null;
            }
        } catch (CertificateException e12) {
            throw new IllegalStateException("X.509 is unsupported in the system: " + e12.getMessage());
        }
    }

    private boolean hasEntry() {
        try {
            return this.keyStore.containsAlias(this.alias);
        } catch (KeyStoreException e12) {
            throw new IllegalStateException("Keystore is not initialized: " + e12.getMessage());
        }
    }

    private void tryLoadEntry() throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException {
        try {
            KeyStore.Entry entry = this.keyStore.getEntry(this.alias, null);
            if (entry == null) {
                return;
            }
            if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                throw new IllegalStateException("Key entry is not an instance of a KeyStore.PrivateKeyEntry");
            }
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
            this.privateKeyEntry = privateKeyEntry;
            if (privateKeyEntry.getPrivateKey().getAlgorithm() != "EC") {
                removeKey();
            }
        } catch (KeyStoreException e12) {
            throw new IllegalStateException("Keystore has not been loaded: " + e12.getMessage());
        } catch (NoSuchAlgorithmException e13) {
            throw new IllegalStateException("No such algorithm in the environment: " + e13.getMessage());
        } catch (UnrecoverableEntryException e14) {
            throw new IllegalStateException("Entry is protected: " + e14.getMessage());
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public byte[] ecSign(byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (this.privateKeyEntry == null) {
            throw new IllegalStateException("Key entry is null. Generate key first.");
        }
        try {
            Signature signature = Signature.getInstance("NONEwithECDSA");
            try {
                signature.initSign(this.privateKeyEntry.getPrivateKey());
                try {
                    signature.update(bArr);
                    return signature.sign();
                } catch (SignatureException e12) {
                    throw new IllegalStateException("Could not sign provided data: " + e12.getMessage());
                }
            } catch (InvalidKeyException e13) {
                throw new IllegalStateException("Key provided for signing is invalid: " + e13.getMessage());
            }
        } catch (NoSuchAlgorithmException e14) {
            throw new IllegalStateException("No NONEwithECDSA support: " + e14.getMessage());
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public void generateKey(byte[] bArr) throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException, UnrecoverableEntryException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            try {
                Calendar calendar = Calendar.getInstance();
                Date time = calendar.getTime();
                calendar.add(1, 10);
                keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(this.alias, 4).setDigests("NONE").setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setAttestationChallenge(bArr).setKeySize(256).setCertificateNotBefore(time).setCertificateNotAfter(calendar.getTime()).build());
                keyPairGenerator.generateKeyPair();
                tryLoadEntry();
            } catch (InvalidAlgorithmParameterException e12) {
                throw new IllegalStateException("Arguments for initialization of EC algorithm are invalid: " + e12.getMessage());
            }
        } catch (NoSuchAlgorithmException e13) {
            throw new IllegalStateException("EC algorithm is unsupported in AndroidKeyStore: " + e13.getMessage());
        } catch (NoSuchProviderException e14) {
            throw new IllegalStateException("No Android Key Store in the system: " + e14.getMessage());
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public byte[] getAppAttestKeyAssertion() {
        throw new UnsupportedOperationException("No AppAttest for Android");
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public String getAppAttestKeyId() {
        throw new UnsupportedOperationException("No AppAttest for Android");
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public String getApplicationId() {
        throw new UnsupportedOperationException("Should not be used for Android");
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public EcPublicKey getEcPublicKey() {
        try {
            ECPoint w12 = ((ECPublicKeySpec) KeyFactory.getInstance("EC").getKeySpec(this.privateKeyEntry.getCertificate().getPublicKey(), ECPublicKeySpec.class)).getW();
            return new EcPublicKey(w12.getAffineX().toByteArray(), w12.getAffineY().toByteArray());
        } catch (NoSuchAlgorithmException e12) {
            throw new IllegalStateException("EC algorithm is unsupported in AndroidKeyStore: " + e12.getMessage());
        } catch (InvalidKeySpecException e13) {
            throw new IllegalStateException("Invalid KeySpec or key could not be processed: " + e13.getMessage());
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public byte[] getKeystoreProof() {
        return getCertificateChain();
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public boolean hasKey() {
        return this.privateKeyEntry != null;
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public void removeKey() throws KeyStoreException {
        this.privateKeyEntry = null;
        if (hasEntry()) {
            try {
                this.keyStore.deleteEntry(this.alias);
            } catch (KeyStoreException e12) {
                throw new IllegalStateException("Keystore is not initialized: " + e12.getMessage());
            }
        }
    }

    @Override // com.yandex.runtime.attestation_storage.internal.PlatformKeystore
    public void requestAttestKey(byte[] bArr, long j12, final AttestationListener attestationListener) throws NoSuchAlgorithmException, CertificateException {
        String strCreateNonce = createNonce(bArr);
        if (strCreateNonce == null) {
            attestationListener.onAttestationFailed("Could not create nonce");
        }
        c.a aVarA = c.a();
        aVarA.c(strCreateNonce);
        aVarA.b(j12);
        Task<d> taskA = b.a(Runtime.getApplicationContext()).a(aVarA.a());
        taskA.g(new InterfaceC37024g<d>() { // from class: com.yandex.runtime.attestation_storage.internal.PlatformKeystoreImpl.1
            @Override // com.google.android.gms.tasks.InterfaceC37024g
            public void onSuccess(d dVar) {
                attestationListener.onAttestationReceived(dVar.a().getBytes());
            }
        });
        taskA.e(new InterfaceC37023f() { // from class: com.yandex.runtime.attestation_storage.internal.PlatformKeystoreImpl.2
            @Override // com.google.android.gms.tasks.InterfaceC37023f
            public void onFailure(Exception exc) {
                attestationListener.onAttestationFailed(exc.getMessage());
            }
        });
    }
}
