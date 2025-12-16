package P01;

import S01.c;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f12772a = new HashMap();

    public static SecretKey a(String str) {
        SecretKey secretKeyGenerateKey = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f12772a.get(str) == null) {
            synchronized (b.class) {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                                        keyStore.load(null);
                                        Key key = keyStore.getKey(str, null);
                                        if (key instanceof SecretKey) {
                                            secretKeyGenerateKey = (SecretKey) key;
                                        } else {
                                            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                                            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
                                            secretKeyGenerateKey = keyGenerator.generateKey();
                                        }
                                    } catch (KeyStoreException e12) {
                                        e12.getMessage();
                                    }
                                } catch (UnrecoverableKeyException e13) {
                                    e13.getMessage();
                                }
                            } catch (IOException e14) {
                                e14.getMessage();
                            } catch (CertificateException e15) {
                                e15.getMessage();
                            }
                        } catch (InvalidAlgorithmParameterException e16) {
                            e16.getMessage();
                        } catch (Exception e17) {
                            e17.getMessage();
                        }
                    } catch (NoSuchAlgorithmException e18) {
                        e18.getMessage();
                    } catch (NoSuchProviderException e19) {
                        e19.getMessage();
                    }
                    f12772a.put(str, secretKeyGenerateKey);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (SecretKey) f12772a.get(str);
    }

    public static String b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new String(c(str, c.b(str2)), Constants.ENCODING);
            } catch (UnsupportedEncodingException e12) {
                e12.getMessage();
            }
        }
        return "";
    }

    public static byte[] c(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr.length <= 12) {
            return bArr2;
        }
        SecretKey secretKeyA = a(str);
        byte[] bArr3 = new byte[0];
        if (secretKeyA == null || bArr.length <= 12) {
            return bArr3;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeyA, new GCMParameterSpec(128, bArrCopyOf));
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        } catch (InvalidAlgorithmParameterException e12) {
            e12.getMessage();
            return bArr3;
        } catch (InvalidKeyException e13) {
            e13.getMessage();
            return bArr3;
        } catch (NoSuchAlgorithmException e14) {
            e14.getMessage();
            return bArr3;
        } catch (BadPaddingException e15) {
            e15.getMessage();
            return bArr3;
        } catch (IllegalBlockSizeException e16) {
            e16.getMessage();
            return bArr3;
        } catch (NoSuchPaddingException e17) {
            e17.getMessage();
            return bArr3;
        } catch (Exception e18) {
            e18.getMessage();
            return bArr3;
        }
    }

    public static String d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return c.a(e(str, str2.getBytes(Constants.ENCODING)));
            } catch (UnsupportedEncodingException e12) {
                e12.getMessage();
            }
        }
        return "";
    }

    public static byte[] e(String str, byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            return bArr2;
        }
        SecretKey secretKeyA = a(str);
        byte[] bArrCopyOf = new byte[0];
        if (secretKeyA == null) {
            return bArrCopyOf;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeyA);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] iv2 = cipher.getIV();
            if (iv2 != null && iv2.length == 12) {
                bArrCopyOf = Arrays.copyOf(iv2, iv2.length + bArrDoFinal.length);
                System.arraycopy(bArrDoFinal, 0, bArrCopyOf, iv2.length, bArrDoFinal.length);
                return bArrCopyOf;
            }
            return bArrCopyOf;
        } catch (InvalidKeyException e12) {
            e12.getMessage();
            return bArrCopyOf;
        } catch (NoSuchAlgorithmException e13) {
            e13.getMessage();
            return bArrCopyOf;
        } catch (BadPaddingException e14) {
            e14.getMessage();
            return bArrCopyOf;
        } catch (IllegalBlockSizeException e15) {
            e15.getMessage();
            return bArrCopyOf;
        } catch (NoSuchPaddingException e16) {
            e16.getMessage();
            return bArrCopyOf;
        } catch (Exception e17) {
            e17.getMessage();
            return bArrCopyOf;
        }
    }
}
