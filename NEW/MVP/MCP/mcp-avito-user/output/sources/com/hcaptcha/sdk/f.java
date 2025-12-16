package com.hcaptcha.sdk;

import android.content.Context;
import android.os.Build;
import android.webkit.JavascriptInterface;
import com.adjust.sdk.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;
import dalvik.system.DexFile;
import edu.umd.cs.findbugs.annotations.Nullable;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import lombok.Generated;
import lombok.NonNull;
import okhttp3.HttpUrl;

/* loaded from: classes7.dex */
final class f implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static String f363096c = "[]";

    /* renamed from: d, reason: collision with root package name */
    public static String f363097d;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Context f363098b;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public f(@NonNull Context context) {
        if (context == null) {
            throw new NullPointerException("context is marked non-null but is null");
        }
        this.f363098b = context;
    }

    public static ArrayList a(String str, String str2) throws NoSuchAlgorithmException, IOException {
        ArrayList arrayList = new ArrayList(512);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
        MessageDigest messageDigest3 = MessageDigest.getInstance("MD5");
        DexFile dexFile = new DexFile(str2);
        try {
            Enumeration<String> enumerationEntries = dexFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                String strNextElement = enumerationEntries.nextElement();
                if (strNextElement.startsWith("com.google.android.") || strNextElement.startsWith("android.")) {
                    messageDigest.update(strNextElement.getBytes(Constants.ENCODING));
                } else if (strNextElement.startsWith(str)) {
                    messageDigest2.update(strNextElement.getBytes(Constants.ENCODING));
                } else {
                    messageDigest3.update(strNextElement.getBytes(Constants.ENCODING));
                }
            }
            dexFile.close();
            arrayList.add("sys_".concat(String.format("%032x", new BigInteger(1, messageDigest.digest()))));
            arrayList.add("deps_".concat(String.format("%032x", new BigInteger(1, messageDigest3.digest()))));
            arrayList.add("app_".concat(String.format("%032x", new BigInteger(1, messageDigest2.digest()))));
            arrayList.add("aver_" + Build.VERSION.RELEASE);
            arrayList.add("sdk_" + "3.8.0_32".replace('.', '_'));
            return arrayList;
        } catch (Throwable th2) {
            dexFile.close();
            throw th2;
        }
    }

    public static HashMap b() {
        HashMap map = new HashMap();
        Process processStart = null;
        try {
            processStart = new ProcessBuilder("/system/bin/getprop").start();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream(), Constants.ENCODING));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        processStart.destroy();
                        return map;
                    }
                    if (line.endsWith("]")) {
                        sb2.replace(0, sb2.length() == 0 ? 0 : sb2.length() - 1, line);
                        String[] strArrSplit = sb2.toString().split("]: \\[");
                        String strSubstring = strArrSplit[0].substring(1);
                        if (strSubstring.startsWith("ro")) {
                            map.put(strSubstring, strArrSplit[1].substring(0, r4.length() - 2));
                        }
                    } else {
                        sb2.append(line);
                    }
                }
            } finally {
            }
        } catch (Throwable th2) {
            if (processStart != null) {
                processStart.destroy();
            }
            throw th2;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Context context = ((f) obj).f363098b;
        Context context2 = this.f363098b;
        return context2 != null ? context2.equals(context) : context == null;
    }

    @JavascriptInterface
    public String getDebugInfo() {
        String str = f363096c;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            String str2 = f363096c;
            if (str2 != null) {
                return str2;
            }
            try {
                String strC = new ObjectMapper().c(a(this.f363098b.getPackageName(), this.f363098b.getPackageCodePath()));
                f363096c = strC;
                return strC;
            } catch (IOException | NoSuchAlgorithmException unused) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
        }
    }

    @JavascriptInterface
    public String getSysDebug() {
        String str = f363097d;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            String str2 = f363097d;
            if (str2 != null) {
                return str2;
            }
            try {
                String strC = new ObjectMapper().c(b());
                f363097d = strC;
                return strC;
            } catch (IOException unused) {
                return "{}";
            }
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public final int hashCode() {
        Context context = this.f363098b;
        return (context == null ? 43 : context.hashCode()) + 59;
    }

    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public final String toString() {
        return "HCaptchaDebugInfo(context=" + this.f363098b + ")";
    }
}
