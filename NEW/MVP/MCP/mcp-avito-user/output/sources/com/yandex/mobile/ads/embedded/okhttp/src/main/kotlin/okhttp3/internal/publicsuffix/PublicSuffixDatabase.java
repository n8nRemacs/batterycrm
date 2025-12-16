package com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix;

import Y61.k;
import Y61.l;
import com.yandex.mobile.ads.impl.qc1;
import com.yandex.mobile.ads.impl.ts0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.sequences.C43033p;
import kotlin.text.C43066x;
import okio.C;
import okio.M;
import okio.Y;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yandex/mobile/ads/embedded/okhttp/src/main/kotlin/okhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "a", "mobileads_externalRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes8.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    @k
    private static final byte[] f382818e;

    /* renamed from: f, reason: collision with root package name */
    @k
    private static final List<String> f382819f;

    /* renamed from: g, reason: collision with root package name */
    @k
    private static final PublicSuffixDatabase f382820g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f382821h = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    private final AtomicBoolean f382822a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    @k
    private final CountDownLatch f382823b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    private byte[] f382824c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f382825d;

    public static final class a {
        public /* synthetic */ a(int i12) {
            this();
        }

        public static final String a(byte[] bArr, byte[][] bArr2, int i12) {
            int i13;
            boolean z12;
            int iA2;
            int iA3;
            int i14 = -1;
            int i15 = PublicSuffixDatabase.f382821h;
            int length = bArr.length;
            int i16 = 0;
            while (i16 < length) {
                int i17 = (i16 + length) / 2;
                while (i17 > i14 && bArr[i17] != 10) {
                    i17 += i14;
                }
                int i18 = i17 + 1;
                int i19 = 1;
                while (true) {
                    i13 = i18 + i19;
                    if (bArr[i13] == 10) {
                        break;
                    }
                    i19++;
                }
                int i22 = i13 - i18;
                int i23 = i12;
                boolean z13 = false;
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    if (z13) {
                        iA2 = 46;
                        z12 = false;
                    } else {
                        z12 = z13;
                        iA2 = qc1.a(bArr2[i23][i24]);
                    }
                    iA3 = iA2 - qc1.a(bArr[i18 + i25]);
                    if (iA3 != 0) {
                        break;
                    }
                    i25++;
                    i24++;
                    if (i25 == i22) {
                        break;
                    }
                    if (bArr2[i23].length != i24) {
                        z13 = z12;
                    } else {
                        if (i23 == bArr2.length - 1) {
                            break;
                        }
                        i23++;
                        z13 = true;
                        i24 = -1;
                    }
                }
                if (iA3 >= 0) {
                    if (iA3 <= 0) {
                        int i26 = i22 - i25;
                        int length2 = bArr2[i23].length - i24;
                        int length3 = bArr2.length;
                        for (int i27 = i23 + 1; i27 < length3; i27++) {
                            length2 += bArr2[i27].length;
                        }
                        if (length2 >= i26) {
                            if (length2 <= i26) {
                                return new String(bArr, i18, i22, StandardCharsets.UTF_8);
                            }
                        }
                        length = i17;
                    }
                    i16 = i13 + 1;
                } else {
                    length = i17;
                }
                i14 = -1;
            }
            return null;
        }

        private a() {
        }

        @k
        public static PublicSuffixDatabase a() {
            return PublicSuffixDatabase.f382820g;
        }
    }

    static {
        new a(0);
        f382818e = new byte[]{42};
        f382819f = Collections.singletonList("*");
        f382820g = new PublicSuffixDatabase();
    }

    private final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(okhttp3.internal.publicsuffix.PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        Y y12 = new Y(new C(M.g(resourceAsStream)));
        try {
            byte[] bArrP5 = y12.p5(y12.readInt());
            byte[] bArrP52 = y12.p5(y12.readInt());
            G0 g02 = G0.f406611a;
            c.a(y12, null);
            synchronized (this) {
                this.f382824c = bArrP5;
                this.f382825d = bArrP52;
            }
            this.f382823b.countDown();
        } finally {
        }
    }

    @l
    public final String a(@k String str) throws InterruptedException {
        String strA;
        String strA2;
        String strA3;
        List<String> listE0;
        int size;
        int size2;
        List listE02 = C43066x.e0(IDN.toUnicode(str), new char[]{'.'});
        if (L.f(C42745f0.Q(listE02), "")) {
            listE02 = C42745f0.x(listE02);
        }
        if (this.f382822a.get() || !this.f382822a.compareAndSet(false, true)) {
            try {
                this.f382823b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z12 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (Throwable th2) {
                        if (z12) {
                            Thread.currentThread().interrupt();
                        }
                        throw th2;
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z12 = true;
                } catch (IOException e12) {
                    int i12 = ts0.f390303c;
                    ts0.f390301a.getClass();
                    ts0.a(5, "Failed to read public suffix list", e12);
                    if (z12) {
                    }
                }
            }
            if (z12) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f382824c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listE02.size();
        byte[][] bArr = new byte[size3][];
        for (int i13 = 0; i13 < size3; i13++) {
            bArr[i13] = ((String) listE02.get(i13)).getBytes(StandardCharsets.UTF_8);
        }
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                strA = null;
                break;
            }
            byte[] bArr2 = this.f382824c;
            if (bArr2 == null) {
                bArr2 = null;
            }
            strA = a.a(bArr2, bArr, i14);
            if (strA != null) {
                break;
            }
            i14++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i15 = 0; i15 < length; i15++) {
                bArr3[i15] = f382818e;
                byte[] bArr4 = this.f382824c;
                if (bArr4 == null) {
                    bArr4 = null;
                }
                strA2 = a.a(bArr4, bArr3, i15);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            int i16 = size3 - 1;
            for (int i17 = 0; i17 < i16; i17++) {
                byte[] bArr5 = this.f382825d;
                if (bArr5 == null) {
                    bArr5 = null;
                }
                strA3 = a.a(bArr5, bArr, i17);
                if (strA3 != null) {
                    break;
                }
            }
            strA3 = null;
        } else {
            strA3 = null;
        }
        if (strA3 != null) {
            listE0 = C43066x.e0("!".concat(strA3), new char[]{'.'});
        } else if (strA == null && strA2 == null) {
            listE0 = f382819f;
        } else {
            listE0 = strA != null ? C43066x.e0(strA, new char[]{'.'}) : C42784z0.f406748b;
            List<String> listE03 = strA2 != null ? C43066x.e0(strA2, new char[]{'.'}) : C42784z0.f406748b;
            if (listE0.size() <= listE03.size()) {
                listE0 = listE03;
            }
        }
        if (listE02.size() == listE0.size() && listE0.get(0).charAt(0) != '!') {
            return null;
        }
        if (listE0.get(0).charAt(0) == '!') {
            size = listE02.size();
            size2 = listE0.size();
        } else {
            size = listE02.size();
            size2 = listE0.size() + 1;
        }
        int i18 = size - size2;
        List listE04 = C43066x.e0(str, new char[]{'.'});
        if (L.f(C42745f0.Q(listE04), "")) {
            listE04 = C42745f0.x(listE04);
        }
        return C43033p.w(C43033p.f(new C42770s0(listE04), i18), ".", null, 62);
    }
}
