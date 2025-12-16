package com.avito.android.wallet_biometry.data;

import Y61.k;
import Y61.l;
import android.security.keystore.KeyGenParameterSpec;
import j.l0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WalletPinCipherRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet_biometry/data/g;", "", "a", "_avito_wallet-biometry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i f329477a;

    /* compiled from: WalletPinCipherRepository.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/wallet_biometry/data/g$a;", "", "<init>", "()V", "", "CIPHER_TRANSFORMATION", "Ljava/lang/String;", "ENCRYPTION_ALGORITHM", "ENCRYPTION_BLOCK_MODE", "ENCRYPTION_PADDING", "KEY_NAME", "", "KEY_SIZE", "I", "_avito_wallet-biometry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public g(@k e eVar, @k i iVar) {
        this.f329477a = iVar;
    }

    @l
    @l0
    public final Cipher a(@k byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, KeyStoreException, InvalidAlgorithmParameterException {
        i iVar = this.f329477a;
        KeyStore keyStore = iVar.f329478a;
        Key key = keyStore != null ? keyStore.getKey("wallet_pin_encryption_secret_key", null) : null;
        SecretKey secretKey = key instanceof SecretKey ? (SecretKey) key : null;
        if (secretKey == null) {
            return null;
        }
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        try {
            cipher.init(2, secretKey, new GCMParameterSpec(128, bArr));
            return cipher;
        } catch (InvalidKeyException e12) {
            KeyStore keyStore2 = iVar.f329478a;
            if (keyStore2 != null) {
                keyStore2.deleteEntry("wallet_pin_encryption_secret_key");
            }
            throw e12;
        }
    }

    @l
    @l0
    public final Cipher b() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyStore keyStore = this.f329477a.f329478a;
        Key key = keyStore != null ? keyStore.getKey("wallet_pin_encryption_secret_key", null) : null;
        SecretKey secretKeyGenerateKey = key instanceof SecretKey ? (SecretKey) key : null;
        if (secretKeyGenerateKey == null) {
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("wallet_pin_encryption_secret_key", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).setUserAuthenticationRequired(true).setInvalidatedByBiometricEnrollment(true).build();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            if (keyGenerator != null) {
                keyGenerator.init(keyGenParameterSpecBuild);
            }
            secretKeyGenerateKey = keyGenerator != null ? keyGenerator.generateKey() : null;
            if (secretKeyGenerateKey == null) {
                return null;
            }
        }
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKeyGenerateKey);
        return cipher;
    }
}
