package androidx.security.crypto;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import androidx.appcompat.app.r;
import j.InterfaceC42164u;
import j.N;
import j.P;
import j.X;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* loaded from: classes10.dex */
public final class MasterKey {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final String f54458a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class KeyScheme {

        /* renamed from: b, reason: collision with root package name */
        public static final KeyScheme f54459b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ KeyScheme[] f54460c;

        static {
            KeyScheme keyScheme = new KeyScheme("AES256_GCM", 0);
            f54459b = keyScheme;
            f54460c = new KeyScheme[]{keyScheme};
        }

        public KeyScheme() {
            throw null;
        }

        public static KeyScheme valueOf(String str) {
            return (KeyScheme) Enum.valueOf(KeyScheme.class, str);
        }

        public static KeyScheme[] values() {
            return (KeyScheme[]) f54460c.clone();
        }
    }

    public static /* synthetic */ class a {
        static {
            try {
                new int[KeyScheme.values().length][0] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @X
    public static class b {
        @InterfaceC42164u
        public static int a(KeyGenParameterSpec keyGenParameterSpec) {
            return keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds();
        }

        @InterfaceC42164u
        public static boolean b(KeyGenParameterSpec keyGenParameterSpec) {
            return keyGenParameterSpec.isUserAuthenticationRequired();
        }
    }

    @X
    public static class c {
        @InterfaceC42164u
        public static boolean a(KeyGenParameterSpec keyGenParameterSpec) {
            return keyGenParameterSpec.isStrongBoxBacked();
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final String f54461a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public KeyGenParameterSpec f54462b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public KeyScheme f54463c;

        @X
        public static class a {

            @X
            /* renamed from: androidx.security.crypto.MasterKey$d$a$a, reason: collision with other inner class name */
            public static class C1923a {
                @InterfaceC42164u
                public static void a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            @X
            public static class b {
                @InterfaceC42164u
                public static void a(KeyGenParameterSpec.Builder builder, int i12, int i13) {
                    builder.setUserAuthenticationParameters(i12, i13);
                }
            }

            @InterfaceC42164u
            public static String a(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public d(@N Context context) {
            context.getApplicationContext();
            this.f54461a = "_androidx_security_master_key_";
        }

        @N
        public final MasterKey a() {
            KeyScheme keyScheme = this.f54463c;
            if (keyScheme == null && this.f54462b == null) {
                throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
            }
            if (keyScheme == KeyScheme.f54459b) {
                this.f54462b = new KeyGenParameterSpec.Builder(this.f54461a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
            }
            KeyGenParameterSpec keyGenParameterSpec = this.f54462b;
            if (keyGenParameterSpec == null) {
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }
            Object obj = androidx.security.crypto.a.f54464a;
            if (keyGenParameterSpec.getKeySize() != 256) {
                throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
            }
            if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
                throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
            }
            if (keyGenParameterSpec.getPurposes() != 3) {
                throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
            }
            if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
            }
            if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            }
            synchronized (androidx.security.crypto.a.f54464a) {
                String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                if (!keyStore.containsAlias(keystoreAlias)) {
                    try {
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                        keyGenerator.init(keyGenParameterSpec);
                        keyGenerator.generateKey();
                    } catch (ProviderException e12) {
                        throw new GeneralSecurityException(e12.getMessage(), e12);
                    }
                }
            }
            return new MasterKey(keyGenParameterSpec.getKeystoreAlias(), this.f54462b);
        }

        @N
        public final void b() {
            KeyScheme keyScheme = KeyScheme.f54459b;
            if (this.f54462b != null) {
                throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
            }
            this.f54463c = keyScheme;
        }
    }

    public MasterKey(@N String str, @P Object obj) {
        this.f54458a = str;
    }

    @N
    public final String toString() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        boolean zContainsAlias;
        StringBuilder sb2 = new StringBuilder("MasterKey{keyAlias=");
        String str = this.f54458a;
        sb2.append(str);
        sb2.append(", isKeyStoreBacked=");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            zContainsAlias = keyStore.containsAlias(str);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            zContainsAlias = false;
        }
        return r.s("}", sb2, zContainsAlias);
    }
}
