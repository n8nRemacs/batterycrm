package com.huawei.hms.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Base64;
import androidx.compose.ui.graphics.colorspace.e;
import com.huawei.hms.support.log.HMSLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes7.dex */
public class ReadApkFileUtil {
    public static final String EMUI10_PK = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx4nUogUyMCmzHhaEb420yvpw9zBs+ETzE9Qm77bGxl1Iml9JEkBkNTsUWOstLgUBajNhV+BAMVBHKMEdzoQbL5kIHkTgUVM65yewd+5+BhrcB9OQ3LHp+0BN6aLKZh71T4WvsvHFhfhQpShuGWkRkSaVGLFTHxX70kpWLzeZ3RtqiEUNIufPR2SFCH6EmecJ+HdkmBOh603IblCpGxwSWse0fDI98wZBEmV88RFaiYEgyiezLlWvXzqIj6I/xuyd5nGAegjH2y3cmoDE6CubecoB1jf4KdgACXgdiQ4Oc63MfLGTor3l6RCqeUk4APAMtyhK83jc72W1sdXMd/sj2wIDAQAB";
    public static final String EMUI11_PK = "MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAqq2eRTMYr2JHLtvuZzfgPrgU8oatD4Rar9fOD7E00es2VhtB3vTyaT2BvYPUPA/nbkHRPak3EZX77CfWj9tzLgSHJE8XLk9C+2ESkdrxCDA6z7I8X+cBDnA05OlCJeZFjnUbjYB8SP8M3BttdrvqtVPxTkEJhchC7UXnMLaJ3kQ3ZPjN7ubjYzO4rv7EtEpqr2bX+qjnSLIZZuUXraxqfdBuhGDIYq62dNsqiyrhX1mfvA3+43N4ZIs3BdfSYII8BNFmFxf+gyf1aoq386R2kAjHcrfOOhjAbZh+R1OAGLWPCqi3E9nB8EsZkeoTW/oIP6pJvgL3bnxq+1viT2dmZyipMgcx/3N6FJqkd67j/sPMtPlHJuq8/s0silzs13jAw1WBV6tWHFkLGpkWGs8jp50wQtndtY8cCPl2XPGmdPN72agH+zsHuKqr/HOB2TuzzaO8rKlGIDQlzZcCSHB28nnvOyBVN9xzLkbYiLnHfd6bTwzNPeqjWrTnPwKyH3BPAgMBAAE=";
    public static final String KEY_SIGNATURE = "Signature:";
    public static final String KEY_SIGNATURE2 = "Signature2:";
    public static final String KEY_SIGNATURE3 = "Signature3:";

    /* renamed from: a, reason: collision with root package name */
    public static final String f363717a = "ReadApkFileUtil";

    /* renamed from: b, reason: collision with root package name */
    public static String f363718b;

    /* renamed from: c, reason: collision with root package name */
    public static String f363719c;

    /* renamed from: d, reason: collision with root package name */
    public static String f363720d;

    /* renamed from: e, reason: collision with root package name */
    public static String f363721e;

    /* renamed from: f, reason: collision with root package name */
    public static String f363722f;

    public static byte[] a(ZipFile zipFile) {
        return a(zipFile, "META-INF/MANIFEST.MF");
    }

    @TargetApi(19)
    public static void b(byte[] bArr) throws Throwable {
        Throwable th2;
        ByteArrayInputStream byteArrayInputStream;
        BufferedReader bufferedReader;
        if (bArr == null) {
            HMSLog.e(f363717a, "manifest is null！");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader2 = null;
        f363718b = null;
        f363719c = null;
        f363720d = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream, StandardCharsets.UTF_8));
            } catch (Exception unused) {
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                String strA = a(bufferedReader);
                while (strA != null) {
                    if (strA.length() != 0) {
                        if (strA.startsWith("ApkHash:")) {
                            f363721e = a(strA.substring(strA.indexOf(":") + 1));
                        }
                        if (strA.startsWith(KEY_SIGNATURE)) {
                            f363718b = a(strA.substring(strA.indexOf(":") + 1));
                            strA = a(bufferedReader);
                        } else if (strA.startsWith(KEY_SIGNATURE2)) {
                            f363719c = a(strA.substring(strA.indexOf(":") + 1));
                            strA = a(bufferedReader);
                        } else if (strA.startsWith(KEY_SIGNATURE3)) {
                            f363720d = a(strA.substring(strA.indexOf(":") + 1));
                            strA = a(bufferedReader);
                        } else {
                            stringBuffer.append(strA);
                            stringBuffer.append("\r\n");
                        }
                    }
                    strA = a(bufferedReader);
                }
                f363722f = stringBuffer.toString();
            } catch (Exception unused2) {
                bufferedReader2 = bufferedReader;
                try {
                    HMSLog.e(f363717a, "loadApkCert Exception!");
                    bufferedReader = bufferedReader2;
                    IOUtils.closeQuietly((InputStream) byteArrayInputStream);
                    IOUtils.closeQuietly((Reader) bufferedReader);
                } catch (Throwable th4) {
                    th2 = th4;
                    IOUtils.closeQuietly((InputStream) byteArrayInputStream);
                    IOUtils.closeQuietly((Reader) bufferedReader2);
                    throw th2;
                }
            } catch (Throwable th5) {
                th2 = th5;
                bufferedReader2 = bufferedReader;
                IOUtils.closeQuietly((InputStream) byteArrayInputStream);
                IOUtils.closeQuietly((Reader) bufferedReader2);
                throw th2;
            }
        } catch (Exception unused3) {
            byteArrayInputStream = null;
        } catch (Throwable th6) {
            th2 = th6;
            byteArrayInputStream = null;
        }
        IOUtils.closeQuietly((InputStream) byteArrayInputStream);
        IOUtils.closeQuietly((Reader) bufferedReader);
    }

    public static String bytesToString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i12 = 0; i12 < bArr.length; i12++) {
            byte b12 = bArr[i12];
            int i13 = i12 * 2;
            cArr2[i13] = cArr[(b12 & 255) >>> 4];
            cArr2[i13 + 1] = cArr[b12 & 15];
        }
        return String.valueOf(cArr2);
    }

    public static boolean c() {
        try {
        } catch (Exception e12) {
            HMSLog.i(f363717a, "verifyMDMSignatureV3 MDM verify Exception!:" + e12.getMessage());
        }
        if (a(Base64.decode(EMUI11_PK, 0), a(f363722f, "SHA-384"), b(f363720d), "SHA384withRSA")) {
            HMSLog.i(f363717a, "verifyMDMSignatureV3 verify successful!");
            return true;
        }
        HMSLog.i(f363717a, "verifyMDMSignatureV3 verify failure!");
        return false;
    }

    public static boolean checkSignature() {
        if (f363720d != null) {
            return c();
        }
        if (f363719c != null) {
            return b();
        }
        if (f363718b != null) {
            return a();
        }
        return false;
    }

    public static String getHmsPath(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.huawei.hwid", 128).sourceDir;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e(f363717a, "HMS is not found!");
            return null;
        }
    }

    @TargetApi(19)
    public static boolean isCertFound(String str) throws Throwable {
        ZipFile zipFile;
        boolean z12 = false;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e12) {
            e = e12;
        }
        try {
            boolean z13 = zipFile.getEntry("META-INF/HUAWEI.CER") != null;
            if (z13) {
                b(a(zipFile, "META-INF/HUAWEI.CER"));
            }
            try {
                zipFile.close();
            } catch (IOException e13) {
                HMSLog.e(f363717a, "zipFile.close Exception!" + e13.getMessage());
            }
            z12 = z13;
        } catch (Exception e14) {
            e = e14;
            zipFile2 = zipFile;
            HMSLog.e(f363717a, "isCertFound Exception!" + e.getMessage());
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e15) {
                    HMSLog.e(f363717a, "zipFile.close Exception!" + e15.getMessage());
                }
            }
            return z12;
        } catch (Throwable th3) {
            th = th3;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e16) {
                    HMSLog.e(f363717a, "zipFile.close Exception!" + e16.getMessage());
                }
            }
            throw th;
        }
        return z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static boolean verifyApkHash(String str) throws Throwable {
        ZipFile zipFile;
        ?? sb2 = 0;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e12) {
            e = e12;
        }
        try {
            byte[] bArrA = a(zipFile);
            ArrayList<String> arrayListA = a(bArrA);
            if (arrayListA != null) {
                bArrA = a(arrayListA);
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArrA);
            String strBytesToString = bytesToString(messageDigest.digest());
            String str2 = f363721e;
            if (str2 != null) {
                if (str2.equals(strBytesToString)) {
                    try {
                        zipFile.close();
                        return true;
                    } catch (Exception e13) {
                        HMSLog.i(f363717a, "close stream Exception!" + e13.getMessage());
                        return true;
                    }
                }
            }
            try {
                zipFile.close();
                return false;
            } catch (Exception e14) {
                HMSLog.i(f363717a, "close stream Exception!" + e14.getMessage());
                return false;
            }
        } catch (Exception e15) {
            e = e15;
            zipFile2 = zipFile;
            HMSLog.i(f363717a, "verifyApkHash Exception!" + e.getMessage());
            if (zipFile2 == null) {
                return false;
            }
            try {
                zipFile2.close();
                return false;
            } catch (Exception e16) {
                String str3 = f363717a;
                sb2 = new StringBuilder("close stream Exception!");
                sb2.append(e16.getMessage());
                HMSLog.i(str3, sb2.toString());
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            sb2 = zipFile;
            if (sb2 != 0) {
                try {
                    sb2.close();
                } catch (Exception e17) {
                    HMSLog.i(f363717a, "close stream Exception!" + e17.getMessage());
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static byte[] a(ZipFile zipFile, String str) throws Throwable {
        Throwable th2;
        InputStream inputStream;
        Exception e12;
        Throwable th3;
        BufferedInputStream bufferedInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ?? bufferedOutputStream;
        byte[] bArr;
        ZipEntry entry = zipFile.getEntry(str);
        OutputStream outputStream = null;
        if (entry == null) {
            return null;
        }
        try {
            inputStream = zipFile.getInputStream(entry);
            if (inputStream == null) {
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) null);
                IOUtils.closeQuietly((OutputStream) null);
                IOUtils.closeQuietly((OutputStream) null);
                return null;
            }
            try {
                bufferedInputStream = new BufferedInputStream(inputStream);
                try {
                    bArr = new byte[4096];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Exception e13) {
                    e12 = e13;
                    byteArrayOutputStream = null;
                    bufferedOutputStream = byteArrayOutputStream;
                    HMSLog.i(f363717a, "getManifestBytes Exception!" + e12.getMessage());
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                    return null;
                } catch (Throwable th4) {
                    th3 = th4;
                    byteArrayOutputStream = null;
                }
            } catch (Exception e14) {
                e12 = e14;
                bufferedInputStream = null;
                byteArrayOutputStream = null;
                bufferedOutputStream = byteArrayOutputStream;
                HMSLog.i(f363717a, "getManifestBytes Exception!" + e12.getMessage());
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                return null;
            } catch (Throwable th5) {
                th2 = th5;
                th3 = th2;
                bufferedInputStream = null;
                byteArrayOutputStream = null;
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly(outputStream);
                throw th3;
            }
            try {
                bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
                try {
                    try {
                        for (int i12 = bufferedInputStream.read(bArr, 0, 4096); i12 > 0; i12 = bufferedInputStream.read(bArr, 0, 4096)) {
                            bufferedOutputStream.write(bArr, 0, i12);
                        }
                        bufferedOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                        return byteArray;
                    } catch (Exception e15) {
                        e12 = e15;
                        bufferedOutputStream = bufferedOutputStream;
                        HMSLog.i(f363717a, "getManifestBytes Exception!" + e12.getMessage());
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                        return null;
                    }
                } catch (Throwable th6) {
                    th3 = th6;
                    outputStream = bufferedOutputStream;
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly(outputStream);
                    throw th3;
                }
            } catch (Exception e16) {
                e12 = e16;
                bufferedOutputStream = 0;
            } catch (Throwable th7) {
                th3 = th7;
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly(outputStream);
                throw th3;
            }
        } catch (Exception e17) {
            e12 = e17;
            inputStream = null;
        } catch (Throwable th8) {
            th2 = th8;
            inputStream = null;
        }
    }

    @TargetApi(19)
    public static ArrayList<String> a(byte[] bArr) throws IOException {
        if (bArr == null) {
            HMSLog.e(f363717a, "manifest is null！");
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream, StandardCharsets.UTF_8));
                try {
                    if (a(bufferedReader, arrayList)) {
                        bufferedReader.close();
                        byteArrayInputStream.close();
                        return arrayList;
                    }
                    bufferedReader.close();
                    byteArrayInputStream.close();
                    return null;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            HMSLog.e(f363717a, "getManifestLinesArrary IOException!");
            return null;
        }
    }

    public static boolean b() {
        try {
        } catch (Exception e12) {
            HMSLog.i(f363717a, "verifyMDMSignatureV2 MDM verify Exception!:" + e12.getMessage());
        }
        if (a(Base64.decode(EMUI10_PK, 0), a(f363722f, "SHA-256"), b(f363719c), "SHA256withRSA")) {
            HMSLog.i(f363717a, "verifyMDMSignatureV2 verify successful!");
            return true;
        }
        HMSLog.i(f363717a, "verifyMDMSignatureV2 verify failure!");
        return false;
    }

    public static byte[] b(String str) {
        int i12;
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        int length = str.length();
        if (length % 2 == 0) {
            i12 = length / 2;
        } else {
            i12 = (length / 2) + 1;
        }
        byte[] bArr = new byte[i12];
        for (int i13 = 0; i13 < length; i13 += 2) {
            int i14 = i13 + 1;
            if (i14 < length) {
                bArr[i13 / 2] = (byte) (Character.digit(str.charAt(i14), 16) + (Character.digit(str.charAt(i13), 16) << 4));
            } else {
                bArr[i13 / 2] = (byte) (Character.digit(str.charAt(i13), 16) << 4);
            }
        }
        return bArr;
    }

    @TargetApi(19)
    public static byte[] a(ArrayList<String> arrayList) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.UTF_8));
        try {
            try {
                Collections.sort(arrayList);
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    String str = arrayList.get(i12);
                    bufferedWriter.write(str, 0, str.length());
                    bufferedWriter.write("\r\n", 0, 2);
                }
                bufferedWriter.flush();
            } catch (Exception e12) {
                HMSLog.i(f363717a, "getManifestBytesbySorted Exception!" + e12.getMessage());
            }
            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
            IOUtils.closeQuietly((Writer) bufferedWriter);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
            IOUtils.closeQuietly((Writer) bufferedWriter);
            throw th2;
        }
    }

    public static boolean a(BufferedReader bufferedReader, ArrayList<String> arrayList) throws IOException {
        String strA = a(bufferedReader);
        boolean z12 = false;
        while (strA != null) {
            if (strA.equals("Name: META-INF/HUAWEI.CER")) {
                String strA2 = a(bufferedReader);
                while (true) {
                    if (strA2 == null) {
                        break;
                    }
                    if (strA2.startsWith("Name:")) {
                        strA = strA2;
                        break;
                    }
                    strA2 = a(bufferedReader);
                }
                z12 = true;
            }
            if (strA.length() != 0) {
                arrayList.add(strA);
            }
            strA = a(bufferedReader);
        }
        return z12;
    }

    public static String a(BufferedReader bufferedReader) throws IOException {
        int i12;
        if (bufferedReader == null || (i12 = bufferedReader.read()) == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(10);
        while (i12 != -1) {
            char c12 = (char) i12;
            if (c12 == '\n') {
                break;
            }
            if (sb2.length() < 4096) {
                sb2.append(c12);
                i12 = bufferedReader.read();
            } else {
                throw new IOException("cert line is too long!");
            }
        }
        String string = sb2.toString();
        return (string.isEmpty() || !string.endsWith("\r")) ? string : e.h(1, 0, string);
    }

    public static boolean a() {
        try {
            if (a(b("30820122300d06092a864886f70d01010105000382010f003082010a0282010100a3d269348ac59923f65e8111c337605e29a1d1bc54fa96c1445050dd14d8d63b10f9f0230bb87ef348183660bedcabfdec045e235ed96935799fcdb4af5c97717ff3b0954eaf1b723225b3a00f81cbd67ce6dc5a4c07f7741ad3bf1913a480c6e267ab1740f409edd2dc33c8b718a8e30e56d9a93f321723c1d0c9ea62115f996812ceef186954595e39a19b74245542c407f7dddb1d12e6eedcfc0bd7cd945ef7255ad0fc9e796258e0fb5e52a23013d15033a32b4071b65f3f924ae5c5761e22327b4d2ae60f4158a5eb15565ba079de29b81540f5fbb3be101a95357f367fc661d797074ff3826950029c52223e4594673a24a334cae62d63b838ba3df9770203010001"), a(f363722f, "SHA-256"), b(f363718b), "SHA256withRSA")) {
                HMSLog.i(f363717a, "verifyMDMSignatureV1 verify successful!");
                return true;
            }
            HMSLog.i(f363717a, "verifyMDMSignatureV1 verify failure!");
            return false;
        } catch (Exception e12) {
            HMSLog.i(f363717a, "verifyMDMSignatureV1 MDM verify Exception!:" + e12.getMessage());
            return false;
        }
    }

    public static boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Signature signature = Signature.getInstance(str);
        signature.initVerify(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr)));
        signature.update(bArr2);
        return signature.verify(bArr3);
    }

    @TargetApi(19)
    public static byte[] a(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        messageDigest.update(str.getBytes(StandardCharsets.UTF_8.name()));
        return messageDigest.digest();
    }

    public static String a(String str) {
        return str != null ? Pattern.compile("\\s*|\t|\r|\n").matcher(str).replaceAll("") : "";
    }
}
