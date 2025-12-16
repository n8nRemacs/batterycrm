package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class sfi {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};
    public static final /* synthetic */ int c = 0;

    public static byte[] a(tv4[] tv4VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (tv4 tv4Var : tv4VarArr) {
            length += ((((tv4Var.g * 2) + 7) & (-8)) / 8) + (tv4Var.e * 2) + b(tv4Var.a, tv4Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + tv4Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, tfi.c)) {
            int length2 = tv4VarArr.length;
            while (i < length2) {
                tv4 tv4Var2 = tv4VarArr[i];
                n(byteArrayOutputStream, tv4Var2, b(tv4Var2.a, tv4Var2.b, bArr));
                m(byteArrayOutputStream, tv4Var2);
                i++;
            }
        } else {
            for (tv4 tv4Var3 : tv4VarArr) {
                n(byteArrayOutputStream, tv4Var3, b(tv4Var3.a, tv4Var3.b, bArr));
            }
            int length3 = tv4VarArr.length;
            while (i < length3) {
                m(byteArrayOutputStream, tv4VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = tfi.e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = tfi.d;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return ho7.l(az1.m(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static Bitmap c(Uri uri) throws Throwable {
        Throwable th;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = zm.d.getContentResolver();
        ParcelFileDescriptor parcelFileDescriptor = null;
        bitmapDecodeFile = null;
        bitmapDecodeFile = null;
        Bitmap bitmapDecodeFile = null;
        try {
            parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            try {
                try {
                    int iE = new pk5(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).e(1, "Orientation");
                    parcelFileDescriptorOpenFileDescriptor.close();
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = contentResolver.openFileDescriptor(uri, "r");
                    Point pointA = tfi.a(parcelFileDescriptorOpenFileDescriptor2.getFileDescriptor(), iE);
                    parcelFileDescriptorOpenFileDescriptor2.close();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = tfi.d(pointA, 2048, 2048);
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    int iF = tfi.f(iE);
                    if (iF == 0) {
                        gbj.c(parcelFileDescriptorOpenFileDescriptor);
                        return bitmapDecodeFileDescriptor;
                    }
                    Matrix matrix = new Matrix();
                    matrix.setRotate(iF);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFileDescriptor, 0, 0, bitmapDecodeFileDescriptor.getWidth(), bitmapDecodeFileDescriptor.getHeight(), matrix, true);
                    bitmapDecodeFileDescriptor.recycle();
                    gbj.c(parcelFileDescriptorOpenFileDescriptor);
                    return bitmapCreateBitmap;
                } catch (IOException e) {
                    e = e;
                    if (e instanceof FileNotFoundException) {
                        String string = uri.toString();
                        try {
                            if (new File(string).exists()) {
                                bitmapDecodeFile = BitmapFactory.decodeFile(string, new BitmapFactory.Options());
                            } else {
                                wqi.o("sfi", null, "file by path %s not exists", Arrays.copyOf(new Object[]{string}, 1));
                            }
                        } catch (Throwable th2) {
                            wqi.p("sfi", "getBitmapFromExternalStorage fail", th2);
                        }
                    } else {
                        wqi.e("sfi", "getBitmapFromPath: failed to get bitmap", e);
                    }
                    gbj.c(parcelFileDescriptorOpenFileDescriptor);
                    return bitmapDecodeFile;
                }
            } catch (Throwable th3) {
                th = th3;
                parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                gbj.c(parcelFileDescriptor);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            parcelFileDescriptorOpenFileDescriptor = null;
        } catch (Throwable th4) {
            th = th4;
            gbj.c(parcelFileDescriptor);
            throw th;
        }
    }

    public static int d(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                return i4;
            }
            i4 = (bArr[i] & 255) | (i4 << 8);
            i += i3;
            i2 = i5;
        }
    }

    public static int[] e(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iD = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iD += (int) jaj.d(byteArrayInputStream, 2);
            iArr[i2] = iD;
        }
        return iArr;
    }

    public static tv4[] f(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, tv4[] tv4VarArr) throws IOException {
        byte[] bArr3 = tfi.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, tfi.g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iD = (int) jaj.d(fileInputStream, 2);
            byte[] bArrC = jaj.c(fileInputStream, (int) jaj.d(fileInputStream, 4), (int) jaj.d(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
            try {
                tv4[] tv4VarArrH = h(byteArrayInputStream, bArr2, iD, tv4VarArr);
                byteArrayInputStream.close();
                return tv4VarArrH;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(tfi.a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iD2 = (int) jaj.d(fileInputStream, 1);
        byte[] bArrC2 = jaj.c(fileInputStream, (int) jaj.d(fileInputStream, 4), (int) jaj.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrC2);
        try {
            tv4[] tv4VarArrG = g(byteArrayInputStream2, iD2, tv4VarArr);
            byteArrayInputStream2.close();
            return tv4VarArrG;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static tv4[] g(ByteArrayInputStream byteArrayInputStream, int i, tv4[] tv4VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new tv4[0];
        }
        if (i != tv4VarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iD = (int) jaj.d(byteArrayInputStream, 2);
            iArr[i2] = (int) jaj.d(byteArrayInputStream, 2);
            strArr[i2] = new String(jaj.b(byteArrayInputStream, iD), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            tv4 tv4Var = tv4VarArr[i3];
            if (!tv4Var.b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            tv4Var.e = i4;
            tv4Var.h = e(byteArrayInputStream, i4);
        }
        return tv4VarArr;
    }

    public static tv4[] h(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, tv4[] tv4VarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new tv4[0];
        }
        if (i != tv4VarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            jaj.d(byteArrayInputStream, 2);
            String str = new String(jaj.b(byteArrayInputStream, (int) jaj.d(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jD = jaj.d(byteArrayInputStream, 4);
            int iD = (int) jaj.d(byteArrayInputStream, 2);
            tv4 tv4Var = null;
            if (tv4VarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= tv4VarArr.length) {
                        break;
                    }
                    if (tv4VarArr[i3].b.equals(strSubstring)) {
                        tv4Var = tv4VarArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (tv4Var == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            tv4Var.d = jD;
            int[] iArrE = e(byteArrayInputStream, iD);
            if (Arrays.equals(bArr, tfi.e)) {
                tv4Var.e = iD;
                tv4Var.h = iArrE;
            }
        }
        return tv4VarArr;
    }

    public static tv4[] i(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, tfi.b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iD = (int) jaj.d(fileInputStream, 1);
        byte[] bArrC = jaj.c(fileInputStream, (int) jaj.d(fileInputStream, 4), (int) jaj.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
        try {
            tv4[] tv4VarArrJ = j(byteArrayInputStream, str, iD);
            byteArrayInputStream.close();
            return tv4VarArrJ;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static tv4[] j(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new tv4[0];
        }
        tv4[] tv4VarArr = new tv4[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iD = (int) jaj.d(byteArrayInputStream, 2);
            int iD2 = (int) jaj.d(byteArrayInputStream, 2);
            tv4VarArr[i3] = new tv4(str, new String(jaj.b(byteArrayInputStream, iD), StandardCharsets.UTF_8), jaj.d(byteArrayInputStream, 4), iD2, (int) jaj.d(byteArrayInputStream, 4), (int) jaj.d(byteArrayInputStream, 4), new int[iD2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            tv4 tv4Var = tv4VarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = tv4Var.f;
            int i6 = tv4Var.g;
            TreeMap treeMap = tv4Var.i;
            int i7 = iAvailable - i5;
            int iD3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iD3 += (int) jaj.d(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iD3), 1);
                int iD4 = (int) jaj.d(byteArrayInputStream, 2);
                while (iD4 > 0) {
                    jaj.d(byteArrayInputStream, 2);
                    int iD5 = (int) jaj.d(byteArrayInputStream, 1);
                    if (iD5 != 6 && iD5 != 7) {
                        while (iD5 > 0) {
                            jaj.d(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iD6 = (int) jaj.d(byteArrayInputStream, 1); iD6 > 0; iD6--) {
                                jaj.d(byteArrayInputStream, 2);
                            }
                            iD5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iD4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            tv4Var.h = e(byteArrayInputStream, tv4Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(jaj.b(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return tv4VarArr;
    }

    public static void k(MediaFormat mediaFormat, LogSessionId logSessionId) {
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        mediaFormat.setString("log-session-id", logSessionId.getStringId());
    }

    /* JADX WARN: Finally extract failed */
    public static boolean l(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, tv4[] tv4VarArr) throws IOException {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = tfi.a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = tfi.b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(tv4VarArr, bArr3);
                jaj.f(byteArrayOutputStream, tv4VarArr.length, 1);
                jaj.f(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrA2 = jaj.a(bArrA);
                jaj.f(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr4 = tfi.d;
            if (Arrays.equals(bArr, bArr4)) {
                jaj.f(byteArrayOutputStream, tv4VarArr.length, 1);
                for (tv4 tv4Var : tv4VarArr) {
                    int size = tv4Var.i.size() * 4;
                    String strB = b(tv4Var.a, tv4Var.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    jaj.g(strB.getBytes(charset).length, byteArrayOutputStream);
                    jaj.g(tv4Var.h.length, byteArrayOutputStream);
                    jaj.f(byteArrayOutputStream, size, 4);
                    jaj.f(byteArrayOutputStream, tv4Var.c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator it = tv4Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        jaj.g(((Integer) it.next()).intValue(), byteArrayOutputStream);
                        jaj.g(0, byteArrayOutputStream);
                    }
                    for (int i2 : tv4Var.h) {
                        jaj.g(i2, byteArrayOutputStream);
                    }
                }
                return true;
            }
            byte[] bArr5 = tfi.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA3 = a(tv4VarArr, bArr5);
                jaj.f(byteArrayOutputStream, tv4VarArr.length, 1);
                jaj.f(byteArrayOutputStream, bArrA3.length, 4);
                byte[] bArrA4 = jaj.a(bArrA3);
                jaj.f(byteArrayOutputStream, bArrA4.length, 4);
                byteArrayOutputStream.write(bArrA4);
                return true;
            }
            byte[] bArr6 = tfi.e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            jaj.g(tv4VarArr.length, byteArrayOutputStream);
            for (tv4 tv4Var2 : tv4VarArr) {
                String str = tv4Var2.a;
                TreeMap treeMap = tv4Var2.i;
                String strB2 = b(str, tv4Var2.b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                jaj.g(strB2.getBytes(charset2).length, byteArrayOutputStream);
                jaj.g(treeMap.size(), byteArrayOutputStream);
                jaj.g(tv4Var2.h.length, byteArrayOutputStream);
                jaj.f(byteArrayOutputStream, tv4Var2.c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    jaj.g(((Integer) it2.next()).intValue(), byteArrayOutputStream);
                }
                for (int i3 : tv4Var2.h) {
                    jaj.g(i3, byteArrayOutputStream);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            jaj.g(tv4VarArr.length, byteArrayOutputStream2);
            int i4 = 2;
            int i5 = 2;
            for (tv4 tv4Var3 : tv4VarArr) {
                jaj.f(byteArrayOutputStream2, tv4Var3.c, 4);
                jaj.f(byteArrayOutputStream2, tv4Var3.d, 4);
                jaj.f(byteArrayOutputStream2, tv4Var3.g, 4);
                String strB3 = b(tv4Var3.a, tv4Var3.b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                jaj.g(length2, byteArrayOutputStream2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            n6i n6iVar = new n6i(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(n6iVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < tv4VarArr.length) {
                try {
                    tv4 tv4Var4 = tv4VarArr[i6];
                    jaj.g(i6, byteArrayOutputStream3);
                    jaj.g(tv4Var4.e, byteArrayOutputStream3);
                    i7 = i7 + 4 + (tv4Var4.e * i4);
                    int[] iArr = tv4Var4.h;
                    int length3 = iArr.length;
                    int i8 = i;
                    int i9 = i4;
                    int i10 = i8;
                    while (i10 < length3) {
                        int i11 = iArr[i10];
                        jaj.g(i11 - i8, byteArrayOutputStream3);
                        i10++;
                        i8 = i11;
                    }
                    i6++;
                    i4 = i9;
                    i = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            n6i n6iVar2 = new n6i(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(n6iVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < tv4VarArr.length) {
                try {
                    tv4 tv4Var5 = tv4VarArr[i12];
                    Iterator it3 = tv4Var5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        o(byteArrayOutputStream4, iIntValue, tv4Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            p(byteArrayOutputStream4, tv4Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            jaj.g(i12, byteArrayOutputStream3);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i13 + 6;
                            ArrayList arrayList4 = arrayList3;
                            jaj.f(byteArrayOutputStream3, length4, 4);
                            jaj.g(iIntValue, byteArrayOutputStream3);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i14 + length4;
                            i12++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            n6i n6iVar3 = new n6i(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(n6iVar3);
            long j2 = 4;
            long size2 = j2 + j2 + 4 + (arrayList2.size() * 16);
            jaj.f(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                n6i n6iVar4 = (n6i) arrayList2.get(i15);
                int i16 = n6iVar4.a;
                byte[] bArr7 = n6iVar4.b;
                if (i16 == 1) {
                    j = 0;
                } else if (i16 == 2) {
                    j = 1;
                } else if (i16 == 3) {
                    j = 2;
                } else if (i16 == 4) {
                    j = 3;
                } else {
                    if (i16 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                jaj.f(byteArrayOutputStream, j, 4);
                jaj.f(byteArrayOutputStream, size2, 4);
                if (n6iVar4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrA5 = jaj.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA5);
                    jaj.f(byteArrayOutputStream, bArrA5.length, 4);
                    jaj.f(byteArrayOutputStream, length5, 4);
                    length = bArrA5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    jaj.f(byteArrayOutputStream, bArr7.length, 4);
                    jaj.f(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i15++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, tv4 tv4Var) throws IOException {
        p(byteArrayOutputStream, tv4Var);
        int i = tv4Var.g;
        int[] iArr = tv4Var.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            jaj.g(i4 - i3, byteArrayOutputStream);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : tv4Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, tv4 tv4Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        jaj.g(str.getBytes(charset).length, byteArrayOutputStream);
        jaj.g(tv4Var.e, byteArrayOutputStream);
        jaj.f(byteArrayOutputStream, tv4Var.f, 4);
        jaj.f(byteArrayOutputStream, tv4Var.c, 4);
        jaj.f(byteArrayOutputStream, tv4Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void o(ByteArrayOutputStream byteArrayOutputStream, int i, tv4 tv4Var) throws IOException {
        int i2 = tv4Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : tv4Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, tv4 tv4Var) throws IOException {
        int i = 0;
        for (Map.Entry entry : tv4Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                jaj.g(iIntValue - i, byteArrayOutputStream);
                jaj.g(0, byteArrayOutputStream);
                i = iIntValue;
            }
        }
    }
}
