package com.google.android.play.core.splitinstall.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import androidx.compose.foundation.text.selection.C21030p;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.internal.http2.Settings;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class g0 {
    public static X509Certificate[][] a(String str) {
        Pair pairA;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                pairA = null;
            } else {
                pairA = h0.a(randomAccessFile, 0);
                if (pairA == null) {
                    pairA = h0.a(randomAccessFile, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                }
            }
            if (pairA == null) {
                throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairA.first;
            long jLongValue = ((Long) pairA.second).longValue();
            long j12 = jLongValue - 20;
            if (j12 >= 0) {
                randomAccessFile.seek(j12);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzf("ZIP64 APK not supported");
                }
            }
            h0.b(byteBuffer);
            long j13 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j13 >= jLongValue) {
                throw new zzf("ZIP Central Directory offset out of range: " + j13 + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            h0.b(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j13 != jLongValue) {
                throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j13 < 32) {
                throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + j13);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(j13 - byteBufferAllocate.capacity());
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new zzf("No APK Signing Block before ZIP Central Directory");
            }
            long j14 = byteBufferAllocate.getLong(0);
            if (j14 < byteBufferAllocate.capacity() || j14 > 2147483639) {
                throw new zzf("APK Signing Block size out of range: " + j14);
            }
            int i12 = (int) (8 + j14);
            long j15 = j13 - i12;
            if (j15 < 0) {
                throw new zzf("APK Signing Block offset out of range: " + j15);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i12);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j15);
            long j16 = j13;
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j17 = byteBufferAllocate2.getLong(0);
            if (j17 != j14) {
                throw new zzf("APK Signing Block sizes in header and footer do not match: " + j17 + " vs " + j14);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j15));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                int i13 = 0;
                while (byteBufferSlice.hasRemaining()) {
                    i13++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i13);
                    }
                    long j18 = byteBufferSlice.getLong();
                    if (j18 < 4 || j18 > 2147483647L) {
                        throw new zzf("APK Signing Block entry #" + i13 + " size out of range: " + j18);
                    }
                    int i14 = (int) j18;
                    int iPosition2 = byteBufferSlice.position() + i14;
                    if (i14 > byteBufferSlice.remaining()) {
                        throw new zzf("APK Signing Block entry #" + i13 + " size out of range: " + i14 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrK = k(randomAccessFile.getChannel(), new d0(e(i14 - 4, byteBufferSlice), jLongValue2, j16, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        return x509CertificateArrK;
                    }
                    long j19 = jLongValue;
                    long j22 = j16;
                    byteBufferSlice.position(iPosition2);
                    jLongValue = j19;
                    j16 = j22;
                }
                throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th2) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th2;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int b(int i12) {
        if (i12 == 1) {
            return 32;
        }
        if (i12 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(AK.c.g(i12, "Unknown content digest algorthm: "));
    }

    public static int c(int i12) {
        if (i12 == 513) {
            return 1;
        }
        if (i12 == 514) {
            return 2;
        }
        if (i12 == 769) {
            return 1;
        }
        switch (i12) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i12))));
        }
    }

    public static String d(int i12) {
        if (i12 == 1) {
            return "SHA-256";
        }
        if (i12 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(AK.c.g(i12, "Unknown content digest algorthm: "));
    }

    public static ByteBuffer e(int i12, ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i13 = i12 + iPosition;
        if (i13 < iPosition || i13 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i13);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i13);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ByteBuffer f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(AK.c.g(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
        }
        int i12 = byteBuffer.getInt();
        if (i12 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i12 <= byteBuffer.remaining()) {
            return e(i12, byteBuffer);
        }
        throw new IOException(androidx.compose.foundation.H.j(i12, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
    }

    public static void g(int i12, byte[] bArr) {
        bArr[1] = (byte) (i12 & 255);
        bArr[2] = (byte) ((i12 >>> 8) & 255);
        bArr[3] = (byte) ((i12 >>> 16) & 255);
        bArr[4] = (byte) (i12 >> 24);
    }

    public static byte[] h(ByteBuffer byteBuffer) throws IOException {
        int i12 = byteBuffer.getInt();
        if (i12 < 0) {
            throw new IOException("Negative length");
        }
        if (i12 > byteBuffer.remaining()) {
            throw new IOException(androidx.compose.foundation.H.j(i12, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
        }
        byte[] bArr = new byte[i12];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static X509Certificate[] i(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferF = f(byteBuffer);
        ByteBuffer byteBufferF2 = f(byteBuffer);
        byte[] bArrH = h(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrH2 = null;
        int i12 = -1;
        byte[] bArrH3 = null;
        int i13 = 0;
        while (byteBufferF2.hasRemaining()) {
            i13++;
            try {
                ByteBuffer byteBufferF3 = f(byteBufferF2);
                if (byteBufferF3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i14 = byteBufferF3.getInt();
                arrayList.add(Integer.valueOf(i14));
                if (i14 != 513 && i14 != 514 && i14 != 769) {
                    switch (i14) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i12 != -1) {
                    int iC2 = c(i14);
                    int iC3 = c(i12);
                    if (iC2 != 1 && iC3 == 1) {
                    }
                }
                bArrH3 = h(byteBufferF3);
                i12 = i14;
            } catch (IOException e12) {
                e = e12;
                throw new SecurityException(AK.c.g(i13, "Failed to parse signature record #"), e);
            } catch (BufferUnderflowException e13) {
                e = e13;
                throw new SecurityException(AK.c.g(i13, "Failed to parse signature record #"), e);
            }
        }
        if (i12 == -1) {
            if (i13 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i12 == 513 || i12 == 514) {
            str = "EC";
        } else if (i12 != 769) {
            switch (i12) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i12))));
            }
        } else {
            str = "DSA";
        }
        if (i12 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i12 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i12 != 769) {
            switch (i12) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i12))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrH));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferF);
            if (!signature.verify(bArrH3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferF.clear();
            ByteBuffer byteBufferF4 = f(byteBufferF);
            ArrayList arrayList2 = new ArrayList();
            int i15 = 0;
            while (byteBufferF4.hasRemaining()) {
                i15++;
                try {
                    ByteBuffer byteBufferF5 = f(byteBufferF4);
                    if (byteBufferF5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i16 = byteBufferF5.getInt();
                    arrayList2.add(Integer.valueOf(i16));
                    if (i16 == i12) {
                        bArrH2 = h(byteBufferF5);
                    }
                } catch (IOException e14) {
                    e = e14;
                    throw new IOException(AK.c.g(i15, "Failed to parse digest record #"), e);
                } catch (BufferUnderflowException e15) {
                    e = e15;
                    throw new IOException(AK.c.g(i15, "Failed to parse digest record #"), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iC4 = c(i12);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iC4), bArrH2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrH2)) {
                throw new SecurityException(d(iC4).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferF6 = f(byteBufferF);
            ArrayList arrayList3 = new ArrayList();
            int i17 = 0;
            while (byteBufferF6.hasRemaining()) {
                i17++;
                byte[] bArrH4 = h(byteBufferF6);
                try {
                    arrayList3.add(new e0((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrH4)), bArrH4));
                } catch (CertificateException e16) {
                    throw new SecurityException(AK.c.g(i17, "Failed to decode certificate #"), e16);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrH, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e17) {
            e = e17;
            throw new SecurityException(AK.c.k("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e18) {
            e = e18;
            throw new SecurityException(AK.c.k("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e19) {
            e = e19;
            throw new SecurityException(AK.c.k("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e22) {
            e = e22;
            throw new SecurityException(AK.c.k("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e23) {
            e = e23;
            throw new SecurityException(AK.c.k("Failed to verify ", str2, " signature"), e);
        }
    }

    public static byte[][] j(int[] iArr, A[] aArr) throws DigestException {
        long j12;
        int i12;
        int length;
        long j13 = 0;
        long jZza = 0;
        int i13 = 0;
        while (true) {
            j12 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (i13 >= 3) {
                break;
            }
            jZza += (aArr[i13].zza() + 1048575) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i13++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(C21030p.a(jZza, "Too many chunks: "));
        }
        int i14 = (int) jZza;
        byte[][] bArr = new byte[iArr.length][];
        int i15 = 0;
        while (true) {
            length = iArr.length;
            if (i15 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(b(iArr[i15]) * i14) + 5];
            bArr2[0] = 90;
            g(i14, bArr2);
            bArr[i15] = bArr2;
            i15++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i16 = 0; i16 < iArr.length; i16++) {
            String strD = d(iArr[i16]);
            try {
                messageDigestArr[i16] = MessageDigest.getInstance(strD);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(strD.concat(" digest not supported"), e12);
            }
        }
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        for (i12 = 3; i17 < i12; i12 = 3) {
            A a12 = aArr[i17];
            long j14 = j13;
            int i22 = i17;
            long jZza2 = a12.zza();
            while (jZza2 > j13) {
                int iMin = (int) Math.min(jZza2, j12);
                g(iMin, bArr3);
                for (int i23 = 0; i23 < length; i23++) {
                    messageDigestArr[i23].update(bArr3);
                }
                long j15 = j14;
                try {
                    a12.a(messageDigestArr, j15, iMin);
                    int i24 = 0;
                    while (i24 < iArr.length) {
                        int i25 = iArr[i24];
                        A a13 = a12;
                        byte[] bArr4 = bArr[i24];
                        int iB2 = b(i25);
                        byte[] bArr5 = bArr3;
                        MessageDigest messageDigest = messageDigestArr[i24];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr4, (i18 * iB2) + 5, iB2);
                        if (iDigest != iB2) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i24++;
                        a12 = a13;
                        bArr3 = bArr5;
                        messageDigestArr = messageDigestArr2;
                    }
                    A a14 = a12;
                    long j16 = iMin;
                    long j17 = j15 + j16;
                    jZza2 -= j16;
                    i18++;
                    j13 = 0;
                    j12 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    a12 = a14;
                    j14 = j17;
                    bArr3 = bArr3;
                } catch (IOException e13) {
                    throw new DigestException(androidx.compose.foundation.H.j(i18, i19, "Failed to digest chunk #", " of section #"), e13);
                }
            }
            i19++;
            i17 = i22 + 1;
            j13 = 0;
            j12 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i26 = 0; i26 < iArr.length; i26++) {
            int i27 = iArr[i26];
            byte[] bArr7 = bArr[i26];
            String strD2 = d(i27);
            try {
                bArr6[i26] = MessageDigest.getInstance(strD2).digest(bArr7);
            } catch (NoSuchAlgorithmException e14) {
                throw new RuntimeException(strD2.concat(" digest not supported"), e14);
            }
        }
        return bArr6;
    }

    public static X509Certificate[][] k(FileChannel fileChannel, d0 d0Var) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferF = f(d0Var.f358750a);
                int i12 = 0;
                while (byteBufferF.hasRemaining()) {
                    i12++;
                    try {
                        arrayList.add(i(f(byteBufferF), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e12) {
                        throw new SecurityException(androidx.camera.camera2.internal.G.e(i12, "Failed to parse/verify signer #", " block"), e12);
                    }
                }
                if (i12 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                long j12 = d0Var.f358751b;
                Z z12 = new Z(fileChannel, 0L, j12);
                long j13 = d0Var.f358753d;
                long j14 = d0Var.f358752c;
                Z z13 = new Z(fileChannel, j14, j13 - j14);
                ByteBuffer byteBufferDuplicate = d0Var.f358754e.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                h0.b(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j12 < 0 || j12 > 4294967295L) {
                    throw new IllegalArgumentException(C21030p.a(j12, "uint32 value of out range: "));
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j12);
                C37208a c37208a = new C37208a(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    iArr[i13] = ((Integer) it.next()).intValue();
                    i13++;
                }
                try {
                    byte[][] bArrJ = j(iArr, new A[]{z12, z13, c37208a});
                    for (int i14 = 0; i14 < size; i14++) {
                        int i15 = iArr[i14];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i15)), bArrJ[i14])) {
                            throw new SecurityException(d(i15).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e13) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e13);
                }
            } catch (IOException e14) {
                throw new SecurityException("Failed to read list of signers", e14);
            }
        } catch (CertificateException e15) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e15);
        }
    }
}
