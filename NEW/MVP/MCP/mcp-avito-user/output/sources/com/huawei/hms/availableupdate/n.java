package com.huawei.hms.availableupdate;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.utils.Checker;
import java.io.File;
import java.io.IOException;

/* compiled from: ContentUriHelper.java */
/* loaded from: classes7.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public Context f363406a;

    /* renamed from: b, reason: collision with root package name */
    public String f363407b;

    public static File a(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalFile();
        } catch (IOException unused) {
            return null;
        }
    }

    public static String b(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String c(String str) {
        int iIndexOf;
        String strB;
        String strA = a();
        if (strA != null && (iIndexOf = str.indexOf(47, 1)) >= 0 && "ContentUriHelper".equals(Uri.decode(str.substring(1, iIndexOf))) && (strB = b(new File(strA, Uri.decode(str.substring(iIndexOf + 1))))) != null && strB.startsWith(strA)) {
            return strB;
        }
        return null;
    }

    public void a(Context context) {
        if (this.f363406a == null) {
            Checker.checkNonNull(context, "context must not be null.");
            this.f363406a = context;
        }
    }

    public final String b(String str) {
        String strA = a();
        if (strA == null || !str.startsWith(strA)) {
            return null;
        }
        return Uri.encode("ContentUriHelper") + '/' + str.substring(strA.endsWith("/") ? strA.length() : strA.length() + 1);
    }

    public File a(String str) {
        String strA = a();
        if (strA == null) {
            return null;
        }
        return a(new File(strA, str));
    }

    public final String a() {
        String str;
        Context context = (Context) Checker.assertNonNull(this.f363406a, "mContext is null, call setContext first.");
        synchronized (this) {
            try {
                if (this.f363407b == null) {
                    if (context.getExternalCacheDir() != null) {
                        this.f363407b = b(context.getExternalCacheDir());
                    } else {
                        this.f363407b = b(context.getFilesDir());
                    }
                }
                str = this.f363407b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public Uri a(File file, String str) {
        String strB;
        String strB2 = b(file);
        if (strB2 == null || (strB = b(strB2)) == null) {
            return null;
        }
        return new Uri.Builder().scheme("content").authority(str).encodedPath(strB).build();
    }

    public File a(Uri uri) {
        String strC;
        String encodedPath = uri.getEncodedPath();
        if (encodedPath == null || (strC = c(encodedPath)) == null) {
            return null;
        }
        return a(new File(strC));
    }
}
