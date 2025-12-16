package defpackage;

import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import tech.kwik.agent15.TlsProtocolException;
import tech.kwik.agent15.alert.DecodeErrorException;
import tech.kwik.agent15.alert.IllegalParameterAlert;

/* loaded from: classes.dex */
public final class hb3 extends h07 {
    public static final SecureRandom e;
    public final byte[] a;
    public final byte[] b;
    public final List c;
    public final ArrayList d;

    static {
        Object[] objArr = {jbg.TLS_AES_128_GCM_SHA256};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        Collections.unmodifiableList(arrayList);
        Object[] objArr2 = {obg.rsa_pss_rsae_sha256};
        ArrayList arrayList2 = new ArrayList(1);
        Object obj2 = objArr2[0];
        Objects.requireNonNull(obj2);
        arrayList2.add(obj2);
        Collections.unmodifiableList(arrayList2);
        new Random();
        e = new SecureRandom();
    }

    public hb3(String str, PublicKey publicKey, ArrayList arrayList, List list, mbg mbgVar, ArrayList arrayList2, tn0 tn0Var) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        hqc hqcVar;
        new ArrayList();
        this.c = arrayList;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(3000);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put(new byte[3]);
        byteBufferAllocate.put((byte) 3);
        byteBufferAllocate.put((byte) 3);
        byte[] bArr = new byte[32];
        this.b = bArr;
        e.nextBytes(bArr);
        byteBufferAllocate.put(bArr);
        byte[] bArr2 = new byte[0];
        byteBufferAllocate.put((byte) bArr2.length);
        if (bArr2.length > 0) {
            byteBufferAllocate.put(bArr2);
        }
        byteBufferAllocate.putShort((short) (arrayList.size() * 2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.putShort(((jbg) it.next()).a);
        }
        byteBufferAllocate.put(new byte[]{1, 0});
        bs bsVar = new bs();
        bsVar.b = str;
        lbg lbgVar = lbg.client_hello;
        urf urfVar = new urf(lbgVar);
        hqc hqcVar2 = new hqc(mbgVar);
        u0f u0fVar = new u0f();
        new ArrayList();
        u0fVar.a = list;
        iz7 iz7Var = new iz7();
        ArrayList arrayList3 = new ArrayList();
        iz7Var.b = arrayList3;
        iz7Var.a = lbgVar;
        if (!iz7.d.contains(mbgVar)) {
            throw new IllegalArgumentException("Named group " + mbgVar + "not supported");
        }
        arrayList3.add(new hz7(mbgVar, publicKey));
        rn5[] rn5VarArr = {bsVar, urfVar, hqcVar2, u0fVar, iz7Var};
        ArrayList arrayList4 = new ArrayList();
        this.d = arrayList4;
        ArrayList arrayList5 = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            rn5 rn5Var = rn5VarArr[i];
            Objects.requireNonNull(rn5Var);
            arrayList5.add(rn5Var);
        }
        arrayList4.addAll(Collections.unmodifiableList(arrayList5));
        ArrayList arrayList6 = this.d;
        int iV = az1.v(3);
        if (iV == 1) {
            hqcVar = new hqc(nbg.psk_ke);
        } else if (iV == 2) {
            hqcVar = new hqc(nbg.psk_dhe_ke);
        } else {
            if (iV != 3) {
                throw new IllegalArgumentException();
            }
            hqcVar = new hqc(new nbg[]{nbg.psk_ke, nbg.psk_dhe_ke});
        }
        arrayList6.add(hqcVar);
        this.d.addAll(arrayList2);
        byteBufferAllocate.putShort((short) this.d.stream().mapToInt(new n0(6)).sum());
        Iterator it2 = this.d.iterator();
        kb3 kb3Var = null;
        int iPosition = -1;
        while (it2.hasNext()) {
            rn5 rn5Var2 = (rn5) it2.next();
            if (rn5Var2 instanceof kb3) {
                kb3Var = (kb3) rn5Var2;
                iPosition = byteBufferAllocate.position();
            }
            byteBufferAllocate.put(rn5Var2.a());
        }
        int iPosition2 = byteBufferAllocate.position();
        byteBufferAllocate.putShort(2, (short) (iPosition2 - 4));
        byte[] bArr3 = new byte[iPosition2];
        this.a = bArr3;
        byteBufferAllocate.get(bArr3);
        if (kb3Var != null) {
            if (tn0Var == null) {
                throw new IllegalArgumentException("BinderCalculator cannot be null when ClientHelloPreSharedKeyExtension is present");
            }
            byte[] bArr4 = new byte[kb3Var.c + iPosition];
            ByteBuffer.wrap(bArr3).get(bArr4);
            ArrayList arrayList7 = kb3Var.b;
            pbg pbgVar = (pbg) tn0Var;
            MessageDigest messageDigest = pbgVar.a;
            short s = pbgVar.e;
            String strF = ho7.f(s * 8, "HmacSHA");
            try {
                messageDigest.reset();
                messageDigest.update(bArr4);
                byte[] bArrDigest = messageDigest.digest();
                SecretKeySpec secretKeySpec = new SecretKeySpec(pbgVar.b(pbgVar.k, "finished", "".getBytes(pbg.u), s), strF);
                Mac mac = Mac.getInstance(strF);
                mac.init(secretKeySpec);
                mac.update(bArrDigest);
                arrayList7.set(0, new ib3(mac.doFinal()));
                byteBufferAllocate.put(kb3Var.a());
                byteBufferAllocate.get(bArr3);
            } catch (InvalidKeyException unused) {
                throw new RuntimeException();
            } catch (NoSuchAlgorithmException unused2) {
                throw new RuntimeException(ho7.i("Missing ", strF, " support"));
            }
        }
    }

    @Override // defpackage.h07
    public final byte[] a() {
        return this.a;
    }

    @Override // defpackage.h07
    public final lbg b() {
        return lbg.client_hello;
    }

    public final String toString() {
        return wy1.j("ClientHello[", (String) this.c.stream().map(new m0(6)).collect(Collectors.joining(",")), "|", (String) this.d.stream().map(new m0(7)).collect(Collectors.joining(",")), "]");
    }

    public hb3(ByteBuffer byteBuffer, i62 i62Var) throws TlsProtocolException {
        this.c = new ArrayList();
        int iPosition = byteBuffer.position();
        if (byteBuffer.remaining() >= 4) {
            if (byteBuffer.remaining() >= 47) {
                if (byteBuffer.get() == lbg.client_hello.a) {
                    if (byteBuffer.remaining() >= (((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255))) {
                        if (byteBuffer.getShort() == 771) {
                            byte[] bArr = new byte[32];
                            this.b = bArr;
                            byteBuffer.get(bArr);
                            int i = byteBuffer.get();
                            if (i > 0) {
                                byteBuffer.get(new byte[i]);
                            }
                            short s = byteBuffer.getShort();
                            for (int i2 = 0; i2 < s; i2 += 2) {
                                Arrays.stream(jbg.values()).filter(new fb3(byteBuffer.getShort(), 0)).findFirst().ifPresent(new m4(5, this));
                            }
                            byte b = byteBuffer.get();
                            byte b2 = byteBuffer.get();
                            if (b == 1 && b2 == 0) {
                                int iPosition2 = byteBuffer.position();
                                ArrayList arrayListC = h07.c(byteBuffer, lbg.client_hello, i62Var);
                                this.d = arrayListC;
                                if (arrayListC.stream().anyMatch(new gb3(0))) {
                                    int i3 = byteBuffer.getShort() & 65535;
                                    while (i3 > 4) {
                                        byteBuffer.position();
                                        byteBuffer.getShort();
                                        int i4 = byteBuffer.getShort() & 65535;
                                        byteBuffer.get(new byte[i4]);
                                        i3 -= i4 + 4;
                                    }
                                    if (!(wy1.d(this.d, 1) instanceof g7c)) {
                                        throw new IllegalParameterAlert("pre_shared_key extension MUST be the last extension in the ClientHello");
                                    }
                                }
                                byte[] bArr2 = new byte[byteBuffer.position() - iPosition];
                                this.a = bArr2;
                                byteBuffer.get(bArr2);
                                return;
                            }
                            throw new IllegalParameterAlert("Invalid legacy compression method");
                        }
                        throw new DecodeErrorException("legacy version must be 0303");
                    }
                    throw new DecodeErrorException("message underflow");
                }
                throw new RuntimeException();
            }
            throw new DecodeErrorException("message underflow");
        }
        throw new DecodeErrorException("message underflow");
    }
}
