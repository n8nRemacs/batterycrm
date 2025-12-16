package com.huawei.hms.framework.common;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes7.dex */
public class StringUtils {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f363473a = false;

    public static boolean a() throws ClassNotFoundException {
        ClassLoader classLoader = SecurityBase64Utils.class.getClassLoader();
        if (classLoader == null) {
            return false;
        }
        try {
            classLoader.loadClass("com.huawei.secure.android.common.util.SafeString");
            synchronized (StringUtils.class) {
                f363473a = true;
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static String anonymizeMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i12 = 0; i12 < charArray.length; i12++) {
            if (i12 % 2 != 0) {
                charArray[i12] = '*';
            }
        }
        return new String(charArray);
    }

    public static String byte2Str(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new String(bArr, Constants.ENCODING);
        } catch (UnsupportedEncodingException e12) {
            Logger.w("StringUtils.byte2str error: UnsupportedEncodingException", anonymizeMessage(e12.getMessage()));
            return "";
        }
    }

    public static String collection2String(Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(";");
        }
        return sb2.toString().substring(0, sb2.length() - 1);
    }

    public static String format(String str, Object... objArr) {
        return str == null ? "" : String.format(Locale.ROOT, str, objArr);
    }

    public static byte[] getBytes(long j12) {
        return getBytes(String.valueOf(j12));
    }

    public static String getTraceInfo(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        StringBuilder sb2 = new StringBuilder(1024);
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb2.append("at ");
            sb2.append(stackTraceElement.toString());
            sb2.append(";");
        }
        return sb2.toString();
    }

    public static String replace(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (!f363473a && !a()) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(charSequence)) {
                return str;
            }
            try {
                return str.replace(charSequence, charSequence2);
            } catch (Exception unused) {
                return str;
            }
        }
        if (str == null || charSequence == null || charSequence2 == null) {
            return str;
        }
        try {
            return str.replace(charSequence, charSequence2);
        } catch (Exception e12) {
            e12.getMessage();
            return str;
        }
    }

    public static byte[] str2Byte(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            return str.getBytes(Constants.ENCODING);
        } catch (UnsupportedEncodingException e12) {
            Logger.w("StringUtils.str2Byte error: UnsupportedEncodingException", anonymizeMessage(e12.getMessage()));
            return new byte[0];
        }
    }

    public static boolean strEquals(String str, String str2) {
        return str == str2 || (str != null && str.equals(str2));
    }

    public static boolean stringToBoolean(String str, boolean z12) {
        if (TextUtils.isEmpty(str)) {
            return z12;
        }
        try {
            return Boolean.valueOf(str).booleanValue();
        } catch (NumberFormatException e12) {
            Logger.w("StringUtils", "String to Integer catch NumberFormatException." + anonymizeMessage(e12.getMessage()));
            return z12;
        }
    }

    public static int stringToInteger(String str, int i12) {
        if (TextUtils.isEmpty(str)) {
            return i12;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e12) {
            Logger.w("StringUtils", "String to Integer catch NumberFormatException." + anonymizeMessage(e12.getMessage()));
            return i12;
        }
    }

    public static long stringToLong(String str, long j12) {
        if (TextUtils.isEmpty(str)) {
            return j12;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e12) {
            Logger.w("StringUtils", "String to Long catch NumberFormatException." + anonymizeMessage(e12.getMessage()));
            return j12;
        }
    }

    public static String substring(String str, int i12) {
        if (!a()) {
            if (!TextUtils.isEmpty(str) && str.length() >= i12 && i12 >= 0) {
                try {
                    return str.substring(i12);
                } catch (Exception unused) {
                }
            }
            return "";
        }
        if (str == null || str.length() < i12 || i12 < 0) {
            return "";
        }
        try {
            return str.substring(i12);
        } catch (Exception e12) {
            e12.getMessage();
            return "";
        }
    }

    public static String toLowerCase(String str) {
        return str == null ? "" : str.toLowerCase(Locale.ROOT);
    }

    public static byte[] getBytes(String str) {
        byte[] bArr = new byte[0];
        if (str == null) {
            return bArr;
        }
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            Logger.w("StringUtils", "the content has error while it is converted to bytes");
            return bArr;
        }
    }

    public static String substring(String str, int i12, int i13) {
        if (!f363473a && !a()) {
            if (!TextUtils.isEmpty(str) && i12 >= 0 && i13 <= str.length() && i13 >= i12) {
                try {
                    return str.substring(i12, i13);
                } catch (Exception unused) {
                }
            }
            return "";
        }
        if (str == null || i12 < 0 || i13 > str.length() || i13 < i12) {
            return "";
        }
        try {
            return str.substring(i12, i13);
        } catch (Exception e12) {
            e12.getMessage();
            return "";
        }
    }
}
