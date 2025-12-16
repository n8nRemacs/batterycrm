package okhttp3.internal.publicsuffix;

import defpackage.at;
import defpackage.ee4;
import defpackage.fni;
import defpackage.hd5;
import defpackage.jbd;
import defpackage.jz6;
import defpackage.lee;
import defpackage.p2c;
import defpackage.tha;
import defpackage.u9g;
import defpackage.ue3;
import defpackage.vmf;
import defpackage.vx;
import defpackage.yua;
import defpackage.zde;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "tha", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {(byte) 42};
    public static final List f = Collections.singletonList("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List listR = vmf.R(str, new char[]{'.'});
        return fni.a((String) ue3.P(listR), "") ? ue3.C(1, listR) : listR;
    }

    public final String a(String str) throws InterruptedException {
        String strA;
        String strA2;
        String strA3;
        int size;
        int size2;
        List listC = c(IDN.toUnicode(str));
        List listR = hd5.a;
        int i = 0;
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        p2c p2cVar = p2c.a;
                        p2c.a.getClass();
                        p2c.i(5, "Failed to read public suffix list", e2);
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i2 = 0; i2 < size3; i2++) {
            String str2 = (String) listC.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            bArr[i2] = str2.getBytes(charset);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strA = null;
                break;
            }
            strA = tha.a(this.c, bArr, i3);
            if (strA != null) {
                break;
            }
            i3++;
        }
        if (size3 > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            int length = bArr2.length - 1;
            for (int i4 = 0; i4 < length; i4++) {
                bArr2[i4] = e;
                strA2 = tha.a(this.c, bArr2, i4);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            int i5 = size3 - 1;
            for (int i6 = 0; i6 < i5; i6++) {
                strA3 = tha.a(this.d, bArr, i6);
                if (strA3 != null) {
                    break;
                }
            }
            strA3 = null;
        } else {
            strA3 = null;
        }
        if (strA3 != null) {
            listR = vmf.R("!".concat(strA3), new char[]{'.'});
        } else if (strA == null && strA2 == null) {
            listR = f;
        } else {
            List listR2 = strA != null ? vmf.R(strA, new char[]{'.'}) : listR;
            if (strA2 != null) {
                listR = vmf.R(strA2, new char[]{'.'});
            }
            if (listR2.size() > listR.size()) {
                listR = listR2;
            }
        }
        if (listC.size() == listR.size() && ((String) listR.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listR.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listR.size();
        } else {
            size = listC.size();
            size2 = listR.size() + 1;
        }
        zde zdeVarF = lee.f(new at(2, c(str)), size - size2);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : zdeVarF) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            ee4.a(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = yua.a;
        jbd jbdVar = new jbd(new jz6(new vx(resourceAsStream, 1, new u9g())));
        try {
            long j = jbdVar.readInt();
            jbdVar.d0(j);
            byte[] bArrI0 = jbdVar.a.i0(j);
            long j2 = jbdVar.readInt();
            jbdVar.d0(j2);
            byte[] bArrI02 = jbdVar.a.i0(j2);
            jbdVar.close();
            synchronized (this) {
                this.c = bArrI0;
                this.d = bArrI02;
            }
            this.b.countDown();
        } finally {
        }
    }
}
