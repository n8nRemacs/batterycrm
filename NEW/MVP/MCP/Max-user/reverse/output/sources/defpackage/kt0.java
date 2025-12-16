package defpackage;

import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class kt0 {
    static {
        wg7.p((byte) -66, (byte) 122, (byte) -49, (byte) -53, (byte) -105, (byte) -87, (byte) 66, (byte) -24, (byte) -100, (byte) 113, (byte) -103, (byte) -108, (byte) -111, (byte) -29, (byte) -81, (byte) -84);
    }

    public static ByteBuffer a(hf6 hf6Var) {
        List list = hf6Var.q;
        hsi.a("csd-0 and/or csd-1 not found in the format for avcC box.", list.size() >= 2);
        byte[] bArr = (byte[]) list.get(0);
        hsi.a("csd-0 is empty for avcC box.", bArr.length > 0);
        byte[] bArr2 = (byte[]) list.get(1);
        hsi.a("csd-1 is empty for avcC box.", bArr2.length > 0);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferWrap2.limit() + byteBufferWrap.limit() + 200);
        byteBufferAllocate.put((byte) 1);
        zjd zjdVarA = tqi.a(byteBufferWrap);
        hsi.a("SPS data not found in csd0 for avcC box.", zjdVarA.d == 1);
        ByteBuffer byteBuffer = (ByteBuffer) zjdVarA.get(0);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr3 = new byte[iRemaining];
        byteBuffer.get(bArr3);
        byteBuffer.rewind();
        gca gcaVarL = hfi.l(0, bArr3, iRemaining);
        byteBufferAllocate.put((byte) gcaVarL.a);
        byteBufferAllocate.put((byte) gcaVarL.b);
        byteBufferAllocate.put((byte) gcaVarL.c);
        byteBufferAllocate.put((byte) -1);
        byteBufferAllocate.put((byte) -31);
        byteBufferAllocate.putShort((short) byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer);
        byteBuffer.rewind();
        zjd zjdVarA2 = tqi.a(byteBufferWrap2);
        hsi.f("PPS data not found in csd1.", zjdVarA2.d == 1);
        byteBufferAllocate.put((byte) 1);
        ByteBuffer byteBuffer2 = (ByteBuffer) zjdVarA2.get(0);
        byteBufferAllocate.putShort((short) byteBuffer2.remaining());
        byteBufferAllocate.put(byteBuffer2);
        byteBuffer2.rewind();
        byteBufferAllocate.flip();
        return qvi.e("avcC", byteBufferAllocate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.ByteBuffer b(defpackage.hf6 r18) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kt0.b(hf6):java.nio.ByteBuffer");
    }

    public static String c(hf6 hf6Var) {
        String str;
        int i;
        str = hf6Var.n;
        i = hf6Var.H;
        str.getClass();
        switch (str) {
            case "video/dolby-vision":
                hz4 hz4VarH = h(hf6Var);
                hsi.e(hz4VarH, "Dolby Vision Initialization data is not found for format: %s" + str);
                int i2 = hz4VarH.a;
                if (i2 == 5) {
                    return "dvh1";
                }
                if (i2 == 8) {
                    return "hvc1";
                }
                if (i2 == 9) {
                    return "avc1";
                }
                throw new IllegalArgumentException("Unsupported profile " + i2 + " for format: " + str);
            case "video/3gpp":
                return "s263";
            case "video/av01":
                return "av01";
            case "video/hevc":
                return "hvc1";
            case "audio/amr-wb":
                return "sawb";
            case "audio/vorbis":
            case "audio/mp4a-latm":
                return "mp4a";
            case "audio/raw":
                if (i == 2) {
                    return "sowt";
                }
                if (i == 268435456) {
                    return "twos";
                }
                throw new IllegalArgumentException(ho7.f(i, "Unsupported PCM encoding: "));
            case "video/mp4v-es":
                return "mp4v-es";
            case "video/apv":
                return "apv1";
            case "video/avc":
                return "avc1";
            case "audio/3gpp":
                return "samr";
            case "audio/opus":
                return "Opus";
            case "video/x-vnd.on2.vp9":
                return "vp09";
            default:
                throw new IllegalArgumentException("Unsupported format: ".concat(str));
        }
    }

    public static ByteBuffer d(short s) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.put("    ".getBytes(StandardCharsets.UTF_8));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.flip();
        return qvi.e("damr", byteBufferAllocate);
    }

    public static ByteBuffer e(long j, long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.putLong(j2);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.ByteBuffer f(defpackage.hf6 r14) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kt0.f(hf6):java.nio.ByteBuffer");
    }

    public static ByteBuffer g() {
        ArrayList arrayList = new ArrayList();
        String str = zxg.a;
        arrayList.add(ByteBuffer.wrap("isom".getBytes(StandardCharsets.UTF_8)));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(131072);
        byteBufferAllocate.flip();
        arrayList.add(byteBufferAllocate);
        String[] strArr = {"isom", "iso2", "mp41"};
        for (int i = 0; i < 3; i++) {
            arrayList.add(ByteBuffer.wrap(strArr[i].getBytes(StandardCharsets.UTF_8)));
        }
        return qvi.d("ftyp", arrayList);
    }

    public static hz4 h(hf6 hf6Var) {
        int i;
        int i2;
        hz4 hz4VarA = hz4.a(new umb((byte[]) uni.c(hf6Var.q)));
        if (hz4VarA != null || hf6Var.k == null) {
            return hz4VarA;
        }
        Pair pairI = i(hf6Var);
        hsi.e(pairI, "Dolby Vision profile and level is not found.");
        int iIntValue = ((Integer) pairI.first).intValue();
        int iIntValue2 = ((Integer) pairI.second).intValue();
        byte[] bArr = ed3.a;
        byte[] bArr2 = new byte[24];
        if (iIntValue == 8) {
            i = 4;
            i2 = 0;
        } else if (iIntValue == 9) {
            i = 2;
            i2 = 1;
        } else {
            i = 0;
            i2 = 0;
        }
        bArr2[0] = 1;
        bArr2[1] = 0;
        byte b = (byte) ((iIntValue & 127) << 1);
        bArr2[2] = b;
        bArr2[2] = (byte) ((b | ((iIntValue2 >> 5) & 1)) & 255);
        byte b2 = (byte) ((iIntValue2 & 31) << 3);
        bArr2[3] = b2;
        byte b3 = (byte) (b2 | 4);
        bArr2[3] = b3;
        byte b4 = b3;
        bArr2[3] = b4;
        bArr2[3] = (byte) (b4 | 1);
        byte b5 = (byte) (i << 4);
        bArr2[4] = b5;
        bArr2[4] = (byte) (b5 | (i2 << 2));
        return hz4.a(new umb(bArr2));
    }

    public static Pair i(hf6 hf6Var) {
        String str = hf6Var.k;
        hsi.e(str, "Codec string is null for Dolby Vision format.");
        List listY = lk6.S('.').Y(str);
        if (listY.size() < 3) {
            a8i.l("Boxes", "Invalid Dolby Vision codec string: ".concat(str));
            return null;
        }
        return Pair.create(Integer.valueOf(Integer.parseInt((String) listY.get(1))), Integer.valueOf(Integer.parseInt((String) listY.get(2))));
    }

    public static ByteBuffer j(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = 0;
        while (true) {
            arrayDeque.push(Byte.valueOf((byte) (i2 | (i & 127))));
            i >>= 7;
            if (i <= 0) {
                break;
            }
            i2 = 128;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(arrayDeque.size());
        while (!arrayDeque.isEmpty()) {
            byteBufferAllocate.put(((Byte) arrayDeque.removeFirst()).byteValue());
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer k(String str, String str2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        String str3 = zxg.a;
        Charset charset = StandardCharsets.UTF_8;
        byteBufferAllocate.put(str.getBytes(charset));
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(str2.getBytes(charset));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.flip();
        return qvi.e("hdlr", byteBufferAllocate);
    }

    public static ByteBuffer l(hf6 hf6Var) {
        List list = hf6Var.q;
        hsi.a("csd-0 not found in the format for hvcC box.", !list.isEmpty());
        byte[] bArr = (byte[]) list.get(0);
        hsi.a("csd-0 is empty for hvcC box.", bArr.length > 0);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferWrap.limit() + 200);
        zjd zjdVarA = tqi.a(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < zjdVarA.d; i++) {
            ByteBuffer byteBuffer = (ByteBuffer) zjdVarA.get(i);
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(byteBuffer.limit());
            int i2 = 0;
            for (int i3 = 0; i3 < byteBuffer.limit(); i3++) {
                if (byteBuffer.get(i3) != 3 || i2 < 2) {
                    byteBufferAllocate2.put(byteBuffer.get(i3));
                }
                i2 = byteBuffer.get(i3) == 0 ? i2 + 1 : 0;
            }
            byteBufferAllocate2.flip();
            arrayList.add(byteBufferAllocate2);
        }
        byteBufferAllocate.put((byte) 1);
        ByteBuffer byteBuffer2 = (ByteBuffer) arrayList.get(0);
        if (byteBuffer2.get(byteBuffer2.position()) != 64) {
            throw new IllegalArgumentException("First NALU in csd-0 is not the VPS.");
        }
        byteBufferAllocate.put(byteBuffer2.get(6));
        byteBufferAllocate.putInt(byteBuffer2.getInt(7));
        byteBufferAllocate.putInt(byteBuffer2.getInt(11));
        byteBufferAllocate.putShort(byteBuffer2.getShort(15));
        byteBufferAllocate.put(byteBuffer2.get(17));
        byteBufferAllocate.putShort((short) -4096);
        byteBufferAllocate.put((byte) -4);
        int i4 = zjdVarA.d;
        ByteBuffer byteBuffer3 = (ByteBuffer) zjdVarA.get(1);
        int iRemaining = byteBuffer3.remaining();
        byte[] bArr2 = new byte[iRemaining];
        byteBuffer3.get(bArr2);
        byteBuffer3.rewind();
        bca bcaVarJ = hfi.j(bArr2, 0, iRemaining, null);
        byte b = (byte) (bcaVarJ.c | 252);
        byte b2 = (byte) (bcaVarJ.d | 248);
        byte b3 = (byte) (bcaVarJ.e | 248);
        byteBufferAllocate.put(b);
        byteBufferAllocate.put(b2);
        byteBufferAllocate.put(b3);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put((byte) 15);
        byteBufferAllocate.put((byte) i4);
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer4 = (ByteBuffer) zjdVarA.get(i5);
            byteBufferAllocate.put((byte) ((byteBuffer4.get(0) >> 1) & 63));
            byteBufferAllocate.putShort((short) 1);
            byteBufferAllocate.putShort((short) byteBuffer4.limit());
            byteBufferAllocate.put(byteBuffer4);
        }
        byteBufferAllocate.flip();
        return qvi.e("hvcC", byteBufferAllocate);
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x0804  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.ByteBuffer m(java.util.ArrayList r62, defpackage.fa6 r63) {
        /*
            Method dump skipped, instructions count: 2870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kt0.m(java.util.ArrayList, fa6):java.nio.ByteBuffer");
    }

    public static ByteBuffer n(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.limit() + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return qvi.e("stsd", byteBufferAllocate);
    }

    public static long o(long j, long j2) {
        return zxg.e0(j, j2, 1000000L, RoundingMode.HALF_UP);
    }
}
