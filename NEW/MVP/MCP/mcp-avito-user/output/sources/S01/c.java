package S01;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class c {
    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b12 : bArr) {
            String hexString = Integer.toHexString(b12 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public static byte[] b(String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = upperCase.getBytes(Constants.ENCODING);
            for (int i12 = 0; i12 < length; i12++) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("0x");
                int i13 = i12 * 2;
                sb2.append(new String(new byte[]{bytes[i13]}, Constants.ENCODING));
                bArr[i12] = (byte) (((byte) (Byte.decode(sb2.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i13 + 1]}, Constants.ENCODING)).byteValue());
            }
        } catch (UnsupportedEncodingException | NumberFormatException e12) {
            e12.getMessage();
        }
        return bArr;
    }
}
