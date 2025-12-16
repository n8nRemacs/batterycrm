package androidx.profileinstaller;

import androidx.compose.foundation.H;
import j.N;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: ProfileTranscoder.java */
/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f53627a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f53628b = {112, 114, 109, 0};

    @N
    public static byte[] a(@N c[] cVarArr, @N byte[] bArr) throws IOException {
        int i12 = 0;
        int length = 0;
        for (c cVar : cVarArr) {
            length += ((((cVar.f53613g * 2) + 7) & (-8)) / 8) + (cVar.f53611e * 2) + b(bArr, cVar.f53607a, cVar.f53608b).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f53612f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, k.f53640c)) {
            int length2 = cVarArr.length;
            while (i12 < length2) {
                c cVar2 = cVarArr[i12];
                k(byteArrayOutputStream, cVar2, b(bArr, cVar2.f53607a, cVar2.f53608b));
                j(byteArrayOutputStream, cVar2);
                i12++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                k(byteArrayOutputStream, cVar3, b(bArr, cVar3.f53607a, cVar3.f53608b));
            }
            int length3 = cVarArr.length;
            while (i12 < length3) {
                j(byteArrayOutputStream, cVarArr[i12]);
                i12++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    @N
    public static String b(@N byte[] bArr, @N String str, @N String str2) {
        byte[] bArr2 = k.f53642e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = k.f53641d;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return AK.c.s(H.r(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static int[] c(@N ByteArrayInputStream byteArrayInputStream, int i12) {
        int[] iArr = new int[i12];
        int iD2 = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            iD2 += (int) d.d(2, byteArrayInputStream);
            iArr[i13] = iD2;
        }
        return iArr;
    }

    @N
    public static c[] d(@N FileInputStream fileInputStream, @N byte[] bArr, @N byte[] bArr2, c[] cVarArr) throws IOException {
        byte[] bArr3 = k.f53643f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, k.f53644g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iD2 = (int) d.d(2, fileInputStream);
            byte[] bArrC = d.c(fileInputStream, (int) d.d(4, fileInputStream), (int) d.d(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
            try {
                c[] cVarArrF = f(byteArrayInputStream, bArr2, iD2, cVarArr);
                byteArrayInputStream.close();
                return cVarArrF;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(k.f53638a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iD3 = (int) d.d(1, fileInputStream);
        byte[] bArrC2 = d.c(fileInputStream, (int) d.d(4, fileInputStream), (int) d.d(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrC2);
        try {
            c[] cVarArrE = e(byteArrayInputStream2, iD3, cVarArr);
            byteArrayInputStream2.close();
            return cVarArrE;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @N
    public static c[] e(@N ByteArrayInputStream byteArrayInputStream, int i12, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i12 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i12];
        int[] iArr = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int iD2 = (int) d.d(2, byteArrayInputStream);
            iArr[i13] = (int) d.d(2, byteArrayInputStream);
            strArr[i13] = new String(d.b(iD2, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i14 = 0; i14 < i12; i14++) {
            c cVar = cVarArr[i14];
            if (!cVar.f53608b.equals(strArr[i14])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i15 = iArr[i14];
            cVar.f53611e = i15;
            cVar.f53614h = c(byteArrayInputStream, i15);
        }
        return cVarArr;
    }

    @N
    public static c[] f(@N ByteArrayInputStream byteArrayInputStream, @N byte[] bArr, int i12, c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i12 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            d.d(2, byteArrayInputStream);
            String str = new String(d.b((int) d.d(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long jD2 = d.d(4, byteArrayInputStream);
            int iD2 = (int) d.d(2, byteArrayInputStream);
            c cVar = null;
            if (cVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i14 = 0;
                while (true) {
                    if (i14 >= cVarArr.length) {
                        break;
                    }
                    if (cVarArr[i14].f53608b.equals(strSubstring)) {
                        cVar = cVarArr[i14];
                        break;
                    }
                    i14++;
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f53610d = jD2;
            int[] iArrC = c(byteArrayInputStream, iD2);
            if (Arrays.equals(bArr, k.f53642e)) {
                cVar.f53611e = iD2;
                cVar.f53614h = iArrC;
            }
        }
        return cVarArr;
    }

    @N
    public static c[] g(@N FileInputStream fileInputStream, @N byte[] bArr, @N String str) throws IOException {
        if (!Arrays.equals(bArr, k.f53639b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iD2 = (int) d.d(1, fileInputStream);
        byte[] bArrC = d.c(fileInputStream, (int) d.d(4, fileInputStream), (int) d.d(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
        try {
            c[] cVarArrH = h(byteArrayInputStream, str, iD2);
            byteArrayInputStream.close();
            return cVarArrH;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @N
    public static c[] h(@N ByteArrayInputStream byteArrayInputStream, @N String str, int i12) throws IOException {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int iD2 = (int) d.d(2, byteArrayInputStream);
            int iD3 = (int) d.d(2, byteArrayInputStream);
            cVarArr[i13] = new c(str, new String(d.b(iD2, byteArrayInputStream), StandardCharsets.UTF_8), d.d(4, byteArrayInputStream), iD3, (int) d.d(4, byteArrayInputStream), (int) d.d(4, byteArrayInputStream), new int[iD3], new TreeMap());
        }
        for (int i14 = 0; i14 < i12; i14++) {
            c cVar = cVarArr[i14];
            int iAvailable = byteArrayInputStream.available() - cVar.f53612f;
            int iD4 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = cVar.f53615i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iD4 += (int) d.d(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(iD4), 1);
                for (int iD5 = (int) d.d(2, byteArrayInputStream); iD5 > 0; iD5--) {
                    d.d(2, byteArrayInputStream);
                    int iD6 = (int) d.d(1, byteArrayInputStream);
                    if (iD6 != 6 && iD6 != 7) {
                        while (iD6 > 0) {
                            d.d(1, byteArrayInputStream);
                            for (int iD7 = (int) d.d(1, byteArrayInputStream); iD7 > 0; iD7--) {
                                d.d(2, byteArrayInputStream);
                            }
                            iD6--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f53614h = c(byteArrayInputStream, cVar.f53611e);
            int i15 = cVar.f53613g;
            BitSet bitSetValueOf = BitSet.valueOf(d.b((((i15 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i16 = 0; i16 < i15; i16++) {
                int i17 = bitSetValueOf.get(i16) ? 2 : 0;
                if (bitSetValueOf.get(i16 + i15)) {
                    i17 |= 4;
                }
                if (i17 != 0) {
                    Integer num = treeMap.get(Integer.valueOf(i16));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i16), Integer.valueOf(i17 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean i(@N ByteArrayOutputStream byteArrayOutputStream, @N byte[] bArr, @N c[] cVarArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = k.f53638a;
        int i12 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = k.f53639b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(cVarArr, bArr3);
                d.e(byteArrayOutputStream, cVarArr.length, 1);
                d.e(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrA2 = d.a(bArrA);
                d.e(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr4 = k.f53641d;
            if (Arrays.equals(bArr, bArr4)) {
                d.e(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f53615i.size() * 4;
                    String strB = b(bArr4, cVar.f53607a, cVar.f53608b);
                    Charset charset = StandardCharsets.UTF_8;
                    d.f(byteArrayOutputStream, strB.getBytes(charset).length);
                    d.f(byteArrayOutputStream, cVar.f53614h.length);
                    d.e(byteArrayOutputStream, size, 4);
                    d.e(byteArrayOutputStream, cVar.f53609c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator<Integer> it = cVar.f53615i.keySet().iterator();
                    while (it.hasNext()) {
                        d.f(byteArrayOutputStream, it.next().intValue());
                        d.f(byteArrayOutputStream, 0);
                    }
                    for (int i13 : cVar.f53614h) {
                        d.f(byteArrayOutputStream, i13);
                    }
                }
                return true;
            }
            byte[] bArr5 = k.f53640c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA3 = a(cVarArr, bArr5);
                d.e(byteArrayOutputStream, cVarArr.length, 1);
                d.e(byteArrayOutputStream, bArrA3.length, 4);
                byte[] bArrA4 = d.a(bArrA3);
                d.e(byteArrayOutputStream, bArrA4.length, 4);
                byteArrayOutputStream.write(bArrA4);
                return true;
            }
            byte[] bArr6 = k.f53642e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            d.f(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String strB2 = b(bArr6, cVar2.f53607a, cVar2.f53608b);
                Charset charset2 = StandardCharsets.UTF_8;
                d.f(byteArrayOutputStream, strB2.getBytes(charset2).length);
                TreeMap<Integer, Integer> treeMap = cVar2.f53615i;
                d.f(byteArrayOutputStream, treeMap.size());
                d.f(byteArrayOutputStream, cVar2.f53614h.length);
                d.e(byteArrayOutputStream, cVar2.f53609c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    d.f(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i14 : cVar2.f53614h) {
                    d.f(byteArrayOutputStream, i14);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            d.f(byteArrayOutputStream2, cVarArr.length);
            int i15 = 2;
            int i16 = 2;
            for (c cVar3 : cVarArr) {
                d.e(byteArrayOutputStream2, cVar3.f53609c, 4);
                d.e(byteArrayOutputStream2, cVar3.f53610d, 4);
                d.e(byteArrayOutputStream2, cVar3.f53613g, 4);
                String strB3 = b(bArr2, cVar3.f53607a, cVar3.f53608b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                d.f(byteArrayOutputStream2, length2);
                i16 = i16 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i16 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray.length);
            }
            m mVar = new m(e.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(mVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i17 = 0;
            int i18 = 0;
            while (i17 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i17];
                    d.f(byteArrayOutputStream3, i17);
                    d.f(byteArrayOutputStream3, cVar4.f53611e);
                    i18 = i18 + 4 + (cVar4.f53611e * 2);
                    int[] iArr = cVar4.f53614h;
                    int length3 = iArr.length;
                    int i19 = i12;
                    int i22 = i19;
                    while (i19 < length3) {
                        int i23 = iArr[i19];
                        d.f(byteArrayOutputStream3, i23 - i22);
                        i19++;
                        i22 = i23;
                    }
                    i17++;
                    i12 = 0;
                } catch (Throwable th2) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i18 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i18 + ", does not match actual size " + byteArray2.length);
            }
            m mVar2 = new m(e.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i24 = 0;
            int i25 = 0;
            while (i24 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i24];
                    Iterator<Map.Entry<Integer, Integer>> it3 = cVar5.f53615i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        l(byteArrayOutputStream4, iIntValue, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m(byteArrayOutputStream4, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            d.f(byteArrayOutputStream3, i24);
                            int length4 = byteArray3.length + i15 + byteArray4.length;
                            int i26 = i25 + 6;
                            ArrayList arrayList4 = arrayList3;
                            d.e(byteArrayOutputStream3, length4, 4);
                            d.f(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i25 = i26 + length4;
                            i24++;
                            arrayList3 = arrayList4;
                            i15 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i25 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i25 + ", does not match actual size " + byteArray5.length);
            }
            m mVar3 = new m(e.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar3);
            long j12 = 4;
            long size2 = j12 + j12 + 4 + (arrayList2.size() * 16);
            d.e(byteArrayOutputStream, arrayList2.size(), 4);
            int i27 = 0;
            while (i27 < arrayList2.size()) {
                m mVar4 = (m) arrayList2.get(i27);
                d.e(byteArrayOutputStream, mVar4.f53645a.f53620b, 4);
                d.e(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = mVar4.f53646b;
                if (mVar4.f53647c) {
                    long length5 = bArr7.length;
                    byte[] bArrA5 = d.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA5);
                    d.e(byteArrayOutputStream, bArrA5.length, 4);
                    d.e(byteArrayOutputStream, length5, 4);
                    length = bArrA5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    d.e(byteArrayOutputStream, bArr7.length, 4);
                    d.e(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i27++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i28 = 0; i28 < arrayList6.size(); i28++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i28));
            }
            return true;
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream2.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public static void j(@N ByteArrayOutputStream byteArrayOutputStream, @N c cVar) throws IOException {
        m(byteArrayOutputStream, cVar);
        int[] iArr = cVar.f53614h;
        int length = iArr.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int i14 = iArr[i12];
            d.f(byteArrayOutputStream, i14 - i13);
            i12++;
            i13 = i14;
        }
        int i15 = cVar.f53613g;
        byte[] bArr = new byte[(((i15 * 2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : cVar.f53615i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                int i16 = iIntValue / 8;
                bArr[i16] = (byte) (bArr[i16] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i17 = iIntValue + i15;
                int i18 = i17 / 8;
                bArr[i18] = (byte) ((1 << (i17 % 8)) | bArr[i18]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void k(@N ByteArrayOutputStream byteArrayOutputStream, @N c cVar, @N String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        d.f(byteArrayOutputStream, str.getBytes(charset).length);
        d.f(byteArrayOutputStream, cVar.f53611e);
        d.e(byteArrayOutputStream, cVar.f53612f, 4);
        d.e(byteArrayOutputStream, cVar.f53609c, 4);
        d.e(byteArrayOutputStream, cVar.f53613g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void l(@N ByteArrayOutputStream byteArrayOutputStream, int i12, @N c cVar) throws IOException {
        int iBitCount = Integer.bitCount(i12 & (-2));
        int i13 = cVar.f53613g;
        byte[] bArr = new byte[(((iBitCount * i13) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : cVar.f53615i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i14 = 0;
            for (int i15 = 1; i15 <= 4; i15 <<= 1) {
                if (i15 != 1 && (i15 & i12) != 0) {
                    if ((i15 & iIntValue2) == i15) {
                        int i16 = (i14 * i13) + iIntValue;
                        int i17 = i16 / 8;
                        bArr[i17] = (byte) ((1 << (i16 % 8)) | bArr[i17]);
                    }
                    i14++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void m(@N ByteArrayOutputStream byteArrayOutputStream, @N c cVar) throws IOException {
        int i12 = 0;
        for (Map.Entry<Integer, Integer> entry : cVar.f53615i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                d.f(byteArrayOutputStream, iIntValue - i12);
                d.f(byteArrayOutputStream, 0);
                i12 = iIntValue;
            }
        }
    }
}
