package ru.cyberity.cbr.prooface.network;

import Y61.k;
import java.math.BigInteger;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/prooface/network/d8gDEgxuRMWxWXii0;", "", "Ljava/security/spec/EllipticCurve;", "AnZ4ntgRZiVOQFYAd", "Ljava/security/spec/ECParameterSpec;", "uz93gWN1OYgIQ", "Ljava/math/BigInteger;", "Ljava/math/BigInteger;", "P", "peujtyiBSfZOKD0yphJi2", "N", "MyHc7quGyJKbnAIkFgd", "A", "U4mhkUewPl2fPUTo32", "B", "E9gFqwO2FE5yBJACCUilu8lqyiR", "Gx", "Hxrfc64cpBNzdXtCQnYxNm1uSR", "Gy", "<init>", "()V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class d8gDEgxuRMWxWXii0 {

    @k
    public static final d8gDEgxuRMWxWXii0 AnZ4ntgRZiVOQFYAd = new d8gDEgxuRMWxWXii0();

    /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
    @k
    private static final BigInteger P = new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951");

    /* renamed from: peujtyiBSfZOKD0yphJi2, reason: from kotlin metadata */
    @k
    private static final BigInteger N = new BigInteger("115792089210356248762697446949407573529996955224135760342422259061068512044369");

    /* renamed from: MyHc7quGyJKbnAIkFgd, reason: from kotlin metadata */
    @k
    private static final BigInteger A = new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853948");

    /* renamed from: U4mhkUewPl2fPUTo32, reason: from kotlin metadata */
    @k
    private static final BigInteger B = new BigInteger("41058363725152142129326129780047268409114441015993725554835256314039467401291");

    /* renamed from: E9gFqwO2FE5yBJACCUilu8lqyiR, reason: from kotlin metadata */
    @k
    private static final BigInteger Gx = new BigInteger("48439561293906451759052585252797914202762949526041747995844080717082404635286");

    /* renamed from: Hxrfc64cpBNzdXtCQnYxNm1uSR, reason: from kotlin metadata */
    @k
    private static final BigInteger Gy = new BigInteger("36134250956749795798585127919587881956611106672985015071877198253568414405109");

    private d8gDEgxuRMWxWXii0() {
    }

    @k
    public final EllipticCurve AnZ4ntgRZiVOQFYAd() {
        return new EllipticCurve(new ECFieldFp(P), A, B);
    }

    @k
    public final ECParameterSpec uz93gWN1OYgIQ() {
        return new ECParameterSpec(AnZ4ntgRZiVOQFYAd(), new ECPoint(Gx, Gy), N, 1);
    }
}
