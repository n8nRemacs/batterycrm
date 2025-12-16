package ru.cyberity.cbr.prooface.network;

import Y61.k;
import Y61.l;
import android.util.Base64;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Metadata;
import ru.cyberity.log.a;
import ru.cyberity.log.c;
import ru.cyberity.log.logger.Logger;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0005\u0010\u0018J\u0017\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0005\u0010\u001bJ\u001f\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0005\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001e¨\u0006\""}, d2 = {"Lru/cyberity/cbr/prooface/network/ar2zdFahlgqFwCDaNcK2mMj8NV2W;", "Lru/cyberity/cbr/prooface/network/VEkdd97RzWe;", "<init>", "()V", "Ljava/security/KeyPair;", "AnZ4ntgRZiVOQFYAd", "()Ljava/security/KeyPair;", "Ljava/security/Key;", "privateKey", "publicKey", "Ljavax/crypto/SecretKey;", "(Ljava/security/Key;Ljava/security/Key;)Ljavax/crypto/SecretKey;", "", "uz93gWN1OYgIQ", "(Ljava/lang/String;)Ljava/security/Key;", "", "data", "salt", "([B[B)[B", "buf", "", "off", "length", "Ljava/math/BigInteger;", "([BII)Ljava/math/BigInteger;", "serverPublicKeyBase64", "Lkotlin/G0;", "(Ljava/lang/String;)V", "Ljava/security/KeyPair;", "keyPair", "Ljavax/crypto/SecretKey;", "secretKey", "peujtyiBSfZOKD0yphJi2", "VEkdd97RzWe", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class ar2zdFahlgqFwCDaNcK2mMj8NV2W implements VEkdd97RzWe {

    /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
    @k
    private final KeyPair keyPair = AnZ4ntgRZiVOQFYAd();

    /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
    @l
    private SecretKey secretKey;

    private final Key uz93gWN1OYgIQ(String publicKey) {
        byte[] bArrDecode = Base64.decode(publicKey, 2);
        return KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(AnZ4ntgRZiVOQFYAd(bArrDecode, 1, 32), AnZ4ntgRZiVOQFYAd(bArrDecode, 33, 32)), d8gDEgxuRMWxWXii0.AnZ4ntgRZiVOQFYAd.uz93gWN1OYgIQ()));
    }

    @Override // ru.cyberity.cbr.prooface.network.VEkdd97RzWe
    public void AnZ4ntgRZiVOQFYAd(@k String serverPublicKeyBase64) {
        this.secretKey = AnZ4ntgRZiVOQFYAd(this.keyPair.getPrivate(), uz93gWN1OYgIQ(serverPublicKeyBase64));
    }

    private final KeyPair AnZ4ntgRZiVOQFYAd() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(d8gDEgxuRMWxWXii0.AnZ4ntgRZiVOQFYAd.uz93gWN1OYgIQ());
        return keyPairGenerator.generateKeyPair();
    }

    private final SecretKey AnZ4ntgRZiVOQFYAd(Key privateKey, Key publicKey) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        keyAgreement.init(privateKey);
        keyAgreement.doPhase(publicKey, true);
        SecretKey secretKeyGenerateSecret = keyAgreement.generateSecret("AES");
        Logger.d$default(a.f436064a, c.a(this), "Crypto: secret=" + Base64.encodeToString(secretKeyGenerateSecret.getEncoded(), 2), null, 4, null);
        return secretKeyGenerateSecret;
    }

    private final byte[] uz93gWN1OYgIQ(byte[] data, byte[] salt) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (this.secretKey != null) {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.secretKey, new IvParameterSpec(salt));
            return cipher.doFinal(data);
        }
        throw new InvalidParameterException("Session key is not set");
    }

    @Override // ru.cyberity.cbr.prooface.network.VEkdd97RzWe
    @k
    public byte[] AnZ4ntgRZiVOQFYAd(@k byte[] data, @k byte[] salt) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrUz93gWN1OYgIQ = uz93gWN1OYgIQ(data, salt);
        byte[] encoded = this.keyPair.getPublic().getEncoded();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(encoded.length + 3 + salt.length + 4 + bArrUz93gWN1OYgIQ.length);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.putShort((short) encoded.length);
        byteBufferAllocate.put(encoded);
        byteBufferAllocate.put(salt);
        byteBufferAllocate.putInt(bArrUz93gWN1OYgIQ.length);
        byteBufferAllocate.put(bArrUz93gWN1OYgIQ);
        return byteBufferAllocate.array();
    }

    private final BigInteger AnZ4ntgRZiVOQFYAd(byte[] buf, int off, int length) {
        if (off != 0 || length != buf.length) {
            byte[] bArr = new byte[length];
            System.arraycopy(buf, off, bArr, 0, length);
            buf = bArr;
        }
        return new BigInteger(1, buf);
    }
}
