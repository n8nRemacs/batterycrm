package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.http.auth.AUTH;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class yxg {
    public static final byte[] a;
    public static final j17 b = a8i.k(new String[0]);
    public static final pod c;
    public static final ejb d;
    public static final TimeZone e;
    public static final yid f;
    public static final String g;

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0137, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxg.<clinit>():void");
    }

    public static final boolean a(ga7 ga7Var, ga7 ga7Var2) {
        return fni.a(ga7Var.e, ga7Var2.e) && ga7Var.f == ga7Var2.f && fni.a(ga7Var.b, ga7Var2.b);
    }

    public static final int b() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(10L);
        if (millis > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) throws IOException {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!fni.a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(char c2, int i, int i2, String str) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (vmf.t(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int g(String str, char c2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return e(c2, i, i2, str);
    }

    public static final String h(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(ood oodVar) {
        String strA = oodVar.X.a(HTTP.CONTENT_LEN);
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        return Collections.unmodifiableList(ve3.j(Arrays.copyOf(objArr2, objArr2.length)));
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (fni.b(cCharAt, 31) <= 0 || fni.b(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int n(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean p(String str) {
        return str.equalsIgnoreCase(AUTH.WWW_AUTH_RESP) || str.equalsIgnoreCase(SM.COOKIE) || str.equalsIgnoreCase(AUTH.PROXY_AUTH_RESP) || str.equalsIgnoreCase(SM.SET_COOKIE);
    }

    public static final int q(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        if ('a' <= c2 && 'f' >= c2) {
            return c2 - 'W';
        }
        if ('A' <= c2 && 'F' >= c2) {
            return c2 - '7';
        }
        return -1;
    }

    public static final Charset r(wv0 wv0Var, Charset charset) {
        int iY = wv0Var.Y(d);
        if (iY == -1) {
            return charset;
        }
        if (iY == 0) {
            return StandardCharsets.UTF_8;
        }
        if (iY == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (iY == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (iY == 3) {
            Charset charset2 = lb2.a;
            Charset charset3 = lb2.e;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            lb2.e = charsetForName;
            return charsetForName;
        }
        if (iY != 4) {
            throw new AssertionError();
        }
        Charset charset4 = lb2.a;
        Charset charset5 = lb2.d;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        lb2.d = charsetForName2;
        return charsetForName2;
    }

    public static final int s(wv0 wv0Var) {
        return (wv0Var.readByte() & 255) | ((wv0Var.readByte() & 255) << 16) | ((wv0Var.readByte() & 255) << 8);
    }

    public static final boolean t(x6f x6fVar, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jNanoTime = System.nanoTime();
        long jC = x6fVar.m().e() ? x6fVar.m().c() - jNanoTime : Long.MAX_VALUE;
        x6fVar.m().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            qu0 qu0Var = new qu0();
            while (x6fVar.b(qu0Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                qu0Var.l();
            }
            if (jC == BuildConfig.MAX_TIME_TO_UPLOAD) {
                x6fVar.m().a();
                return true;
            }
            x6fVar.m().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == BuildConfig.MAX_TIME_TO_UPLOAD) {
                x6fVar.m().a();
                return false;
            }
            x6fVar.m().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == BuildConfig.MAX_TIME_TO_UPLOAD) {
                x6fVar.m().a();
            } else {
                x6fVar.m().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final j17 u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c17 c17Var = (c17) it.next();
            xx0 xx0Var = c17Var.b;
            xx0 xx0Var2 = c17Var.c;
            String strL = xx0Var.l();
            String strL2 = xx0Var2.l();
            arrayList.add(strL);
            arrayList.add(vmf.c0(strL2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new j17((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String v(defpackage.ga7 r4, boolean r5) {
        /*
            int r0 = r4.f
            java.lang.String r1 = r4.e
            java.lang.String r2 = ":"
            r3 = 0
            boolean r2 = defpackage.vmf.s(r1, r2, r3)
            if (r2 == 0) goto L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "["
            r2.<init>(r3)
            r2.append(r1)
            r1 = 93
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L20:
            if (r5 != 0) goto L4e
            java.lang.String r4 = r4.b
            int r5 = r4.hashCode()
            r2 = 3213448(0x310888, float:4.503E-39)
            if (r5 == r2) goto L3e
            r2 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r5 == r2) goto L33
            goto L49
        L33:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L49
            r4 = 443(0x1bb, float:6.21E-43)
            goto L4a
        L3e:
            java.lang.String r5 = "http"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L49
            r4 = 80
            goto L4a
        L49:
            r4 = -1
        L4a:
            if (r0 == r4) goto L4d
            goto L4e
        L4d:
            return r1
        L4e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r5 = 58
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxg.v(ga7, boolean):java.lang.String");
    }

    public static final List w(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static final int x(int i, String str) throws NumberFormatException {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String y(int i, int i2, String str) {
        int iM = m(i, i2, str);
        return str.substring(iM, n(iM, i2, str));
    }

    public static final void z(IOException iOException, List list) {
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            saj.a(iOException, (Exception) it.next());
        }
    }
}
