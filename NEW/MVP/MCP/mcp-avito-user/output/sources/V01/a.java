package V01;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.common.PackageConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f16864a = Uri.parse("content://com.huawei.hwid");

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f16865b = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539"};

    public static String a(Context context) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.createDeviceProtectedStorageContext().getFilesDir());
        return AK.c.s(sb2, File.separator, "aegis");
    }

    public static String b(byte[] bArr) {
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

    public static void c(ByteArrayInputStream byteArrayInputStream, Context context) throws Throwable {
        FileOutputStream fileOutputStream;
        String strA = a(context);
        if (!new File(strA).exists() && !TextUtils.isEmpty(strA)) {
            File file = new File(strA);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        File file2 = new File(strA, "hmsrootcas.bks");
        if (file2.exists()) {
            file2.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (IOException unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int i12 = byteArrayInputStream.read(bArr, 0, 2048);
                if (i12 == -1) {
                    h.a(fileOutputStream);
                    return;
                }
                fileOutputStream.write(bArr, 0, i12);
            }
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            h.a(fileOutputStream2);
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            h.a(fileOutputStream2);
            throw th;
        }
    }

    public static byte[] d(Context context, String str) {
        PackageInfo packageInfo;
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e12) {
            e12.getMessage();
        } catch (Exception e13) {
            e13.getMessage();
        }
        return new byte[0];
    }

    public static boolean e(String str) throws NumberFormatException {
        int i12;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = "4.0.2.300".split("\\.");
        int length = strArrSplit.length;
        int length2 = strArrSplit2.length;
        int iMax = Math.max(length, length2);
        int i13 = 0;
        while (i13 < iMax) {
            if (i13 < length) {
                try {
                    i12 = Integer.parseInt(strArrSplit[i13]);
                } catch (Exception e12) {
                    e12.getMessage();
                    return i13 >= length2;
                }
            } else {
                i12 = 0;
            }
            int i14 = i13 < length2 ? Integer.parseInt(strArrSplit2[i13]) : 0;
            if (i12 < i14) {
                return false;
            }
            if (i12 > i14) {
                return true;
            }
            i13++;
        }
        return true;
    }

    public static String f(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return b(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e12) {
            e12.getMessage();
            return "";
        }
    }

    public static boolean g(Context context) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a(context));
        return new File(AK.c.s(sb2, File.separator, "hmsrootcas.bks")).exists();
    }

    public static synchronized FileInputStream h(Context context) {
        InputStream inputStreamOpenInputStream;
        if (context != null) {
            if (e.f16866a == null) {
                e.f16866a = context.getApplicationContext();
            }
        }
        Context context2 = e.f16866a;
        ByteArrayInputStream byteArrayInputStream = null;
        if (context2 == null) {
            return null;
        }
        if (!e(j.a("com.huawei.hwid")) && !e(j.a(PackageConstants.SERVICES_PACKAGE_ALL_SCENE))) {
            j.a("com.huawei.hwid");
            return null;
        }
        byte[] bArrD = d(context2, "com.huawei.hwid");
        String[] strArr = f16865b;
        int length = strArr.length;
        int i12 = 0;
        while (true) {
            if (i12 < length) {
                if (strArr[i12].equalsIgnoreCase(f(bArrD))) {
                    break;
                }
                i12++;
            } else if (!"E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539".equalsIgnoreCase(f(d(context2, PackageConstants.SERVICES_PACKAGE_ALL_SCENE)))) {
                return null;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStreamOpenInputStream = context2.getContentResolver().openInputStream(Uri.withAppendedPath(f16864a, "files/hmsrootcas.bks"));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i13 = inputStreamOpenInputStream.read(bArr);
                    if (i13 <= -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i13);
                }
                byteArrayOutputStream.flush();
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                try {
                    String string = k.a(context2).getString("bks_hash", "");
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    String strB = "";
                    if (byteArray != null) {
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            strB = b(messageDigest.digest());
                        } catch (NoSuchAlgorithmException unused) {
                        }
                    }
                    if (!g(context2) || !string.equals(strB)) {
                        c(byteArrayInputStream2, context2);
                        k.a(context2).edit().putString("bks_hash", strB).apply();
                    }
                    h.a(inputStreamOpenInputStream);
                    h.a(byteArrayOutputStream);
                    h.a(byteArrayInputStream2);
                } catch (Exception unused2) {
                    byteArrayInputStream = byteArrayInputStream2;
                    h.a(inputStreamOpenInputStream);
                    h.a(byteArrayOutputStream);
                    h.a(byteArrayInputStream);
                    return i(context2);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = byteArrayInputStream2;
                    h.a(inputStreamOpenInputStream);
                    h.a(byteArrayOutputStream);
                    h.a(byteArrayInputStream);
                    throw th;
                }
            } catch (Exception unused3) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused4) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamOpenInputStream = null;
        }
        return i(context2);
    }

    public static FileInputStream i(Context context) {
        if (!g(context)) {
            return null;
        }
        try {
            return new FileInputStream(a(context) + File.separator + "hmsrootcas.bks");
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
