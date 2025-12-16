package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
public abstract class n7j {
    public static double a(double d, double d2) {
        if (d2 > 1.0d) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum 1.0 is less than minimum " + d2 + '.');
        }
        if (d < d2) {
            return d2;
        }
        if (d > 1.0d) {
            return 1.0d;
        }
        return d;
    }

    public static float b(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int c(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static int d(int i, to7 to7Var) {
        int i2 = to7Var.b;
        int i3 = to7Var.a;
        if (!to7Var.isEmpty()) {
            return i < Integer.valueOf(i3).intValue() ? Integer.valueOf(i3).intValue() : i > Integer.valueOf(i2).intValue() ? Integer.valueOf(i2).intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + to7Var + '.');
    }

    public static long e(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException(utb.l(az1.l(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j2, '.'));
    }

    public static go0 f() throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderB = ab4.b("androidxBiometric", 3);
            ab4.d(builderB);
            ab4.e(builderB);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            ab4.c(keyGenerator, ab4.a(builderB));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new go0(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    public static ro7 g(ro7 ro7Var, int i) {
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = ro7Var.a;
        int i3 = ro7Var.b;
        if (ro7Var.c <= 0) {
            i = -i;
        }
        return new ro7(i2, i3, i);
    }

    public static to7 h(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new to7(i, i2 - 1, 1);
        }
        to7 to7Var = to7.d;
        return to7.d;
    }

    public static BiometricPrompt.CryptoObject i(go0 go0Var) {
        IdentityCredential identityCredential;
        if (go0Var == null) {
            return null;
        }
        Cipher cipher = go0Var.b;
        if (cipher != null) {
            return bb4.b(cipher);
        }
        Signature signature = go0Var.a;
        if (signature != null) {
            return bb4.a(signature);
        }
        Mac mac = go0Var.c;
        if (mac != null) {
            return bb4.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = go0Var.d) == null) {
            return null;
        }
        return cb4.a(identityCredential);
    }
}
