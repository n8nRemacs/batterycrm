package e11;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.C37592n;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: e11.B, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39847B {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public static final C37592n f394270b = new C37592n(1);

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public static final C37592n f394271c = new C37592n(2);

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public static volatile C39847B f394272d;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final File f394273a;

    public C39847B(@j.N File file) {
        this.f394273a = file;
    }

    @j.P
    @j.l0
    public static C39847B a(@j.N Context context) {
        C39847B c39847b = f394272d;
        if (c39847b == null) {
            synchronized (C39847B.class) {
                try {
                    c39847b = f394272d;
                    if (c39847b == null) {
                        File cacheDir = context.getCacheDir();
                        boolean zMkdir = (cacheDir == null || cacheDir.exists()) ? true : cacheDir.mkdir();
                        if (!zMkdir) {
                            return null;
                        }
                        File file = new File(cacheDir, "mytargetcache");
                        if (!file.exists()) {
                            zMkdir = file.mkdir();
                        }
                        if (!zMkdir) {
                            return null;
                        }
                        if (file.isDirectory() && file.canWrite()) {
                            C39847B c39847b2 = new C39847B(file);
                            f394272d = c39847b2;
                            c39847b = c39847b2;
                        }
                    }
                } finally {
                }
            }
        }
        return c39847b;
    }

    public static void d(@j.N InputStream inputStream, @j.N FileOutputStream fileOutputStream) {
        byte[] bArr = new byte[8192];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 8192);
        while (true) {
            try {
                int i12 = bufferedInputStream.read(bArr, 0, 8192);
                if (i12 == -1) {
                    break;
                } else {
                    bufferedOutputStream.write(bArr, 0, i12);
                }
            } finally {
            }
        }
        bufferedOutputStream.flush();
        try {
            bufferedOutputStream.close();
        } catch (Throwable th2) {
            th2.getMessage();
        }
        try {
            bufferedInputStream.close();
        } catch (Throwable th3) {
            th3.getMessage();
        }
    }

    @j.N
    public final File b(@j.N String str, @j.N String str2) {
        String lowerCase;
        StringBuilder sb2 = new StringBuilder("mytrg_");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes(Charset.forName(Constants.ENCODING)));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb3 = new StringBuilder();
            for (byte b12 : bArrDigest) {
                sb3.append(String.format("%02X", Byte.valueOf(b12)));
            }
            lowerCase = sb3.toString().toLowerCase(Locale.ROOT);
        } catch (Throwable unused) {
            lowerCase = null;
        }
        String strS = AK.c.s(sb2, lowerCase, str2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f394273a.getAbsolutePath());
        return new File(AK.c.s(sb4, File.separator, strS));
    }

    @j.l0
    public final synchronized void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f394273a.lastModified() + 604800000 < jCurrentTimeMillis) {
                File[] fileArrListFiles = this.f394273a.listFiles(f394270b);
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (file.isFile() && file.lastModified() + 604800000 < jCurrentTimeMillis) {
                            file.getPath();
                            if (!file.delete()) {
                                file.getAbsolutePath();
                            }
                        }
                    }
                }
                if (!this.f394273a.setLastModified(jCurrentTimeMillis)) {
                    this.f394273a.getAbsolutePath();
                }
            }
            File[] fileArrListFiles2 = this.f394273a.listFiles(f394271c);
            if (fileArrListFiles2 != null && fileArrListFiles2.length > 10) {
                Arrays.sort(fileArrListFiles2, new androidx.camera.core.impl.r0(11));
                for (int length = fileArrListFiles2.length - 1; length >= 10; length--) {
                    fileArrListFiles2[length].getPath();
                    fileArrListFiles2[length].delete();
                }
            }
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    @j.P
    @j.l0
    public final synchronized File e(@j.N InputStream inputStream, @j.N String str) {
        FileOutputStream fileOutputStream;
        c();
        File fileB = b(str, ".mp4");
        fileB.getPath();
        try {
            fileOutputStream = new FileOutputStream(fileB);
            try {
                d(inputStream, fileOutputStream);
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th2.toString();
                }
                return fileB;
            } catch (Throwable th3) {
                th = th3;
                try {
                    th.toString();
                    return null;
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th4.toString();
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }

    @j.P
    @j.l0
    public final synchronized String f(@j.N String str, @j.N String str2) {
        c();
        File fileB = b(str, str2);
        if (fileB.exists()) {
            fileB.getPath();
            try {
                return fileB.getAbsolutePath();
            } catch (Throwable th2) {
                th2.toString();
            }
        }
        return null;
    }
}
