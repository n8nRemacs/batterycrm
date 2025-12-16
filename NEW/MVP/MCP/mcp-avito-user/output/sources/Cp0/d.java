package CP0;

import Y61.k;
import javax.crypto.Cipher;
import kotlin.Metadata;

/* compiled from: WalletPinCipher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCP0/d;", "", "_avito_wallet-biometry_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final byte[] f2173a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Cipher f2174b;

    public d(@k byte[] bArr, @k Cipher cipher) {
        this.f2173a = bArr;
        this.f2174b = cipher;
    }
}
