package O01;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f11896a = {"SHA-256", "SHA-384", "SHA-512"};

    public static String a(String str) throws NoSuchAlgorithmException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("SHA-256")) {
            return "";
        }
        String[] strArr = f11896a;
        for (int i12 = 0; i12 < 3; i12++) {
            if (strArr[i12].equals("SHA-256")) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(str.getBytes(Constants.ENCODING));
                    return S01.c.a(messageDigest.digest());
                } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
                    return "";
                }
            }
        }
        return "";
    }
}
