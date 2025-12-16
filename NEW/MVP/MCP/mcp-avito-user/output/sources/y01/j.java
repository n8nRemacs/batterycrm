package y01;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;

/* compiled from: SecretUtil.java */
/* loaded from: classes7.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f442822a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f442823b = new Object();

    public static String a(String str) {
        String str2 = (String) f442822a.get(str);
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    public static void b(Context context, String str, String str2, String str3, String str4, String str5) throws Throwable {
        String strA = t.a(context.getApplicationContext());
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strA);
            sb2.append("/files/math/m");
            d("m", str, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strA);
            sb3.append("/files/panda/p");
            d("p", str2, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(strA);
            sb4.append("/files/panda/d");
            d("d", str3, sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(strA);
            sb5.append("/files/math/t");
            d("t", str4, sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(strA);
            sb6.append("/files/s");
            d("s", str5, sb6.toString());
        } catch (IOException unused) {
            HMSLog.e("c", "save key IOException.");
        }
    }

    public static void c(String str, Context context) throws Throwable {
        String strA = t.a(context.getApplicationContext());
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strA);
            sb2.append("/files/s");
            d("s", str, sb2.toString());
        } catch (IOException unused) {
            HMSLog.e("c", "save keyS IOException.");
        }
    }

    public static void d(String str, String str2, String str3) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        HMSLog.i("c", "save local secret key.");
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(str3);
            w.c(file);
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), Constants.ENCODING);
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(outputStreamWriter);
                try {
                    bufferedWriter2.write(str2);
                    bufferedWriter2.flush();
                    f442822a.put(str, str2);
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter2);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStreamWriter = null;
        }
    }

    public static String e(Context context) throws UnsupportedEncodingException {
        String strA;
        if (TextUtils.isEmpty(a("s"))) {
            HMSLog.i("c", "work key is empty, execute init.");
            g(context);
        }
        String strA2 = N01.a.a(a("s"), f());
        if (x.a(strA2)) {
            return strA2;
        }
        synchronized (j.class) {
            strA = N01.a.a(a("s"), f());
            if (x.a(strA)) {
                HMSLog.i("c", "keyS has been upgraded, no require operate again.");
            } else {
                String strA3 = a("s");
                String strA4 = a("m");
                String strA5 = a("p");
                String strA6 = a("d");
                String strA7 = a("t");
                new S01.d();
                strA = N01.a.a(strA3, (byte[]) S01.a.a(strA4, strA5, strA6, S01.c.b(strA7), 16, true).clone());
                if (x.a(strA)) {
                    HMSLog.i("c", "keyS is encrypt by RootKeyUtil, upgrade encrypt mode.");
                    c(N01.a.c(strA, f()), context);
                } else {
                    strA = N01.a.a(a("s"), S01.a.a(a("m"), a("p"), a("d"), S01.c.b(a("t")), 32, false));
                    if (x.a(strA)) {
                        HMSLog.i("c", "keyS is encrypt by ExportRootKey with sha1, upgrade encrypt mode to sha256.");
                        c(N01.a.c(strA, f()), context);
                    } else {
                        HMSLog.e("c", "all mode unable to decrypt root key.");
                        strA = "";
                    }
                }
            }
        }
        return strA;
    }

    public static byte[] f() {
        return S01.a.a(a("m"), a("p"), a("d"), S01.c.b(a("t")), 32, true);
    }

    public static void g(Context context) {
        synchronized (f442823b) {
            try {
                h(context.getApplicationContext());
                if (!TextUtils.isEmpty(a("s"))) {
                    HMSLog.i("c", "The local secret is already in separate file mode.");
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t.a(context.getApplicationContext()));
                sb2.append("/shared_prefs/LocalAvengers.xml");
                File file = new File(sb2.toString());
                if (file.exists()) {
                    if (file.exists()) {
                        file.delete();
                    }
                    HMSLog.i("c", "destroy C, delete file LocalAvengers.xml.");
                }
                byte[] bArrA = S01.b.a(32);
                byte[] bArrA2 = S01.b.a(32);
                byte[] bArrA3 = S01.b.a(32);
                byte[] bArrA4 = S01.b.a(32);
                String strA = S01.c.a(bArrA);
                String strA2 = S01.c.a(bArrA2);
                String strA3 = S01.c.a(bArrA3);
                String strA4 = S01.c.a(bArrA4);
                b(context, strA, strA2, strA3, strA4, N01.a.c(S01.c.a(S01.b.a(32)), S01.a.a(strA, strA2, strA3, S01.c.b(strA4), 32, true)));
                HMSLog.i("c", "generate D.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void h(Context context) throws Throwable {
        if (!TextUtils.isEmpty(a("s"))) {
            HMSLog.i("c", "secretKeyCache not empty.");
            return;
        }
        HashMap map = f442822a;
        map.clear();
        String strA = t.a(context);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        String strB = w.b(strA + "/files/math/m");
        String strB2 = w.b(strA + "/files/panda/p");
        String strB3 = w.b(strA + "/files/panda/d");
        String strB4 = w.b(strA + "/files/math/t");
        String strB5 = w.b(strA + "/files/s");
        if (x.a(strB, strB2, strB3, strB4, strB5)) {
            map.put("m", strB);
            map.put("p", strB2);
            map.put("d", strB3);
            map.put("t", strB4);
            map.put("s", strB5);
        }
    }
}
