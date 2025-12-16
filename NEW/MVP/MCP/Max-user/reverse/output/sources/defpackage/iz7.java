package defpackage;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.NamedParameterSpec;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import tech.kwik.agent15.alert.DecodeErrorException;

/* loaded from: classes.dex */
public final class iz7 extends rn5 {
    public static final Map c;
    public static final List d;
    public lbg a;
    public ArrayList b;

    static {
        mbg mbgVar = mbg.secp256r1;
        mbg mbgVar2 = mbg.x25519;
        mbg mbgVar3 = mbg.x448;
        AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(mbgVar, 65);
        AbstractMap.SimpleEntry simpleEntry2 = new AbstractMap.SimpleEntry(mbgVar2, 32);
        AbstractMap.SimpleEntry simpleEntry3 = new AbstractMap.SimpleEntry(mbgVar3, 56);
        Map.Entry[] entryArr = {simpleEntry, simpleEntry2, simpleEntry3};
        HashMap map = new HashMap(3);
        for (int i = 0; i < 3; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        c = Collections.unmodifiableMap(map);
        Object[] objArr = {mbg.secp256r1, mbg.x25519};
        ArrayList arrayList = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj = objArr[i2];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        d = Collections.unmodifiableList(arrayList);
    }

    public static ECParameterSpec c(String str) throws NoSuchAlgorithmException, InvalidParameterSpecException {
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
            algorithmParameters.init(new ECGenParameterSpec(str));
            return (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class);
        } catch (NoSuchAlgorithmException unused) {
            throw new RuntimeException("Missing support for EC algorithm");
        } catch (InvalidParameterSpecException unused2) {
            throw new RuntimeException("Inappropriate parameter specification");
        }
    }

    public static void e(byte[] bArr) {
        int length = bArr.length - 1;
        for (int i = 0; length > i; i++) {
            byte b = bArr[length];
            bArr[length] = bArr[i];
            bArr[i] = b;
            length--;
        }
    }

    public static void f(ByteBuffer byteBuffer, byte[] bArr) {
        if (bArr.length == 32) {
            byteBuffer.put(bArr);
            return;
        }
        if (bArr.length < 32) {
            for (int i = 0; i < 32 - bArr.length; i++) {
                byteBuffer.put((byte) 0);
            }
            byteBuffer.put(bArr, 0, bArr.length);
            return;
        }
        if (bArr.length > 32) {
            for (int i2 = 0; i2 < bArr.length - 32; i2++) {
                if (bArr[i2] != 0) {
                    throw new RuntimeException(wy1.h("W Affine more then 32 bytes, leading bytes not 0 ", yx0.a(bArr)));
                }
            }
            byteBuffer.put(bArr, bArr.length - 32, 32);
        }
    }

    @Override // defpackage.rn5
    public final byte[] a() {
        ArrayList arrayList = this.b;
        short sSum = (short) arrayList.stream().map(new m0(26)).mapToInt(new n0(12)).map(new fz7()).sum();
        lbg lbgVar = this.a;
        lbg lbgVar2 = lbg.client_hello;
        short s = lbgVar == lbgVar2 ? (short) (sSum + 2) : sSum;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(s + 4);
        byteBufferAllocate.putShort(kbg.key_share.a);
        byteBufferAllocate.putShort(s);
        if (lbgVar == lbgVar2) {
            byteBufferAllocate.putShort(sSum);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hz7 hz7Var = (hz7) it.next();
            byteBufferAllocate.putShort(hz7Var.a.a);
            mbg mbgVar = hz7Var.a;
            Map map = c;
            byteBufferAllocate.putShort(((Integer) map.get(mbgVar)).shortValue());
            mbg mbgVar2 = hz7Var.a;
            if (mbgVar2 == mbg.secp256r1) {
                byteBufferAllocate.put((byte) 4);
                f(byteBufferAllocate, ((ECPublicKey) hz7Var.a()).getW().getAffineX().toByteArray());
                f(byteBufferAllocate, ((ECPublicKey) hz7Var.a()).getW().getAffineY().toByteArray());
            } else {
                if (mbgVar2 != mbg.x25519 && mbgVar2 != mbg.x448) {
                    throw new RuntimeException();
                }
                byte[] byteArray = e5.r(hz7Var.a()).getU().toByteArray();
                if (byteArray.length > ((Integer) map.get(hz7Var.a)).intValue()) {
                    throw new RuntimeException("Invalid " + hz7Var.a + " key length: " + byteArray.length);
                }
                if (byteArray.length < ((Integer) map.get(hz7Var.a)).intValue()) {
                    e(byteArray);
                    byteArray = Arrays.copyOf(byteArray, ((Integer) map.get(hz7Var.a)).intValue());
                } else {
                    e(byteArray);
                }
                byteBufferAllocate.put(byteArray);
            }
        }
        return byteBufferAllocate.array();
    }

    public final int d(ByteBuffer byteBuffer) throws NoSuchAlgorithmException, DecodeErrorException {
        ArrayList arrayList = this.b;
        int iPosition = byteBuffer.position();
        if (byteBuffer.remaining() < 4) {
            throw new DecodeErrorException("extension underflow");
        }
        Optional optionalFindFirst = Arrays.stream(mbg.values()).filter(new fb3(byteBuffer.getShort(), 5)).findFirst();
        int i = byteBuffer.getShort();
        if (byteBuffer.remaining() < i) {
            throw new DecodeErrorException("extension underflow");
        }
        if (optionalFindFirst.isPresent() && d.contains(optionalFindFirst.get())) {
            mbg mbgVar = (mbg) optionalFindFirst.get();
            if (i != ((Integer) c.get(mbgVar)).intValue()) {
                throw new DecodeErrorException("Invalid " + mbgVar.name() + " key length: " + i);
            }
            if (mbgVar == mbg.secp256r1) {
                if (byteBuffer.get() != 4) {
                    throw new DecodeErrorException("EC keys must be in legacy form");
                }
                int i2 = i - 1;
                byte[] bArr = new byte[i2];
                byteBuffer.get(bArr);
                try {
                    arrayList.add(new gz7(mbgVar, (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, i2 / 2)), new BigInteger(1, Arrays.copyOfRange(bArr, i2 / 2, i2))), c(mbgVar.name())))));
                } catch (NoSuchAlgorithmException unused) {
                    throw new RuntimeException("Missing support for EC algorithm");
                } catch (InvalidKeySpecException unused2) {
                    throw new RuntimeException("Inappropriate parameter specification");
                }
            } else if (mbgVar == mbg.x25519 || mbgVar == mbg.x448) {
                byte[] bArr2 = new byte[i];
                byteBuffer.get(bArr2);
                try {
                    e(bArr2);
                    BigInteger bigInteger = new BigInteger(bArr2);
                    KeyFactory keyFactory = KeyFactory.getInstance("XDH");
                    ilb.f();
                    NamedParameterSpec namedParameterSpecE = ilb.e(mbgVar.name().toUpperCase());
                    e5.v();
                    arrayList.add(new hz7(mbgVar, keyFactory.generatePublic(e5.s(namedParameterSpecE, bigInteger))));
                } catch (NoSuchAlgorithmException unused3) {
                    throw new RuntimeException("Missing support for EC algorithm");
                } catch (InvalidKeySpecException unused4) {
                    throw new RuntimeException("Inappropriate parameter specification");
                }
            }
        } else {
            byteBuffer.get(new byte[i]);
        }
        return byteBuffer.position() - iPosition;
    }
}
