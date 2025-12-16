package com.yandex.mobile.ads.impl;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.ui.platform.C22491k0;
import com.yandex.mobile.ads.impl.gz;
import com.yandex.mobile.ads.impl.mz0;
import com.yandex.mobile.ads.impl.s10;
import com.yandex.mobile.ads.impl.si;
import com.yandex.mobile.ads.impl.uy0;
import com.yandex.mobile.ads.impl.zs;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.C42833p;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42809i;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import okio.C44802l;
import okio.C44805o;
import okio.InterfaceC44803m;
import okio.InterfaceC44804n;
import okio.P;

@X41.i
/* loaded from: classes8.dex */
public final class qc1 {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final byte[] f389143a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final gz f389144b = gz.b.a(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final lz0 f389145c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final TimeZone f389146d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private static final C43059p f389147e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    public static final boolean f389148f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final String f389149g;

    static {
        byte[] bArr = new byte[0];
        f389143a = bArr;
        f389145c = mz0.a.a(bArr);
        uy0.a.b(bArr);
        P.a aVar = okio.P.f420028e;
        C44805o.f420139e.getClass();
        C44805o[] c44805oArr = {C44805o.a.b("efbbbf"), C44805o.a.b("feff"), C44805o.a.b("fffe"), C44805o.a.b("0000ffff"), C44805o.a.b("ffff0000")};
        aVar.getClass();
        P.a.b(c44805oArr);
        f389146d = TimeZone.getTimeZone("GMT");
        f389147e = new C43059p("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f389148f = false;
        f389149g = C43066x.X("Client", C43066x.U("com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttplib.", bq0.class.getName()));
    }

    public static final int a(byte b12) {
        return b12 & 255;
    }

    public static final boolean d(@Y61.k String str) {
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int a(char c12) {
        if ('0' <= c12 && c12 < ':') {
            return c12 - '0';
        }
        if ('a' <= c12 && c12 < 'g') {
            return c12 - 'W';
        }
        if ('A' > c12 || c12 >= 'G') {
            return -1;
        }
        return c12 - '7';
    }

    @Y61.k
    public static final String[] b(@Y61.k String[] strArr, @Y61.k String[] strArr2, @Y61.k Comparator<? super String> comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i12]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i12++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final int a(short s5) {
        return s5 & 65535;
    }

    @Y61.k
    public static final String c(int i12, int i13, @Y61.k String str) {
        int iA2 = a(i12, i13, str);
        return str.substring(iA2, b(iA2, i13, str));
    }

    public static final long a(int i12) {
        return i12 & 2147483647L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zs a(zs zsVar, th thVar) {
        return zsVar;
    }

    public static final int a(long j12, @Y61.l TimeUnit timeUnit) {
        if (j12 < 0) {
            throw new IllegalStateException(up1.a("timeout", " < 0").toString());
        }
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(j12);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(up1.a("timeout", " too large.").toString());
            }
            if (millis != 0 || j12 <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(up1.a("timeout", " too small.").toString());
        }
        throw new IllegalStateException("unit == null");
    }

    public static final int b(int i12, int i13, @Y61.k String str) {
        int i14 = i13 - 1;
        if (i12 <= i14) {
            while (true) {
                char cCharAt = str.charAt(i14);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i14 + 1;
                }
                if (i14 == i12) {
                    break;
                }
                i14--;
            }
        }
        return i12;
    }

    public static /* synthetic */ int b(String str, char c12, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i12 = str.length();
        }
        return a(str, c12, 0, i12);
    }

    public static final int b(@Y61.k String str) {
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (kotlin.jvm.internal.L.g(cCharAt, 31) <= 0 || kotlin.jvm.internal.L.g(cCharAt, 127) >= 0) {
                return i12;
            }
        }
        return -1;
    }

    public static final int b(int i12, @Y61.l String str) throws NumberFormatException {
        if (str == null) {
            return i12;
        }
        try {
            long j12 = Long.parseLong(str);
            if (j12 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j12 < 0) {
                return 0;
            }
            return (int) j12;
        } catch (NumberFormatException unused) {
            return i12;
        }
    }

    public static final int a(@Y61.k String[] strArr, @Y61.k si.a aVar) {
        int length = strArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (aVar.compare(strArr[i12], "TLS_FALLBACK_SCSV") == 0) {
                return i12;
            }
        }
        return -1;
    }

    @Y61.k
    public static final <T> List<T> b(@Y61.k List<? extends T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static final void a(long j12, long j13, long j14) {
        if ((j13 | j14) < 0 || j13 > j12 || j12 - j13 < j14) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Y61.k
    public static final ThreadFactory a(@Y61.k String str, boolean z12) {
        return new T1(str, z12, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread a(String str, boolean z12, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z12);
        return thread;
    }

    public static final boolean a(@Y61.k String[] strArr, @Y61.l String[] strArr2, @Y61.k Comparator<? super String> comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = C42809i.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Y61.k
    public static final String a(@Y61.k s10 s10Var, boolean z12) {
        String strG;
        if (C43066x.q(s10Var.g(), ":", false)) {
            strG = "[" + s10Var.g() + ']';
        } else {
            strG = s10Var.g();
        }
        if (!z12 && s10Var.i() == s10.b.a(s10Var.l())) {
            return strG;
        }
        StringBuilder sbB = C22491k0.b(strG, ':');
        sbB.append(s10Var.i());
        return sbB.toString();
    }

    @Y61.k
    public static final String[] a(@Y61.k String str, @Y61.k String[] strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static final int a(int i12, int i13, @Y61.k String str) {
        while (i12 < i13) {
            char cCharAt = str.charAt(i12);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i12;
            }
            i12++;
        }
        return i13;
    }

    public static final int a(int i12, int i13, @Y61.k String str, @Y61.k String str2) {
        while (i12 < i13) {
            if (C43066x.r(str2, str.charAt(i12))) {
                return i12;
            }
            i12++;
        }
        return i13;
    }

    public static final int a(@Y61.k String str, char c12, int i12, int i13) {
        while (i12 < i13) {
            if (str.charAt(i12) == c12) {
                return i12;
            }
            i12++;
        }
        return i13;
    }

    public static final boolean a(@Y61.k String str) {
        return f389147e.e(str);
    }

    @Y61.k
    public static final String a(@Y61.k String str, @Y61.k Object... objArr) {
        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Y61.k
    public static final gz a(@Y61.k List<ez> list) {
        gz.a aVar = new gz.a();
        for (ez ezVar : list) {
            aVar.b(ezVar.a().t(), ezVar.b().t());
        }
        return aVar.a();
    }

    public static final boolean a(@Y61.k s10 s10Var, @Y61.k s10 s10Var2) {
        return kotlin.jvm.internal.L.f(s10Var.g(), s10Var2.g()) && s10Var.i() == s10Var2.i() && kotlin.jvm.internal.L.f(s10Var.l(), s10Var2.l());
    }

    @Y61.k
    public static final zs.b a(@Y61.k zs.a aVar) {
        return new G0(aVar, 14);
    }

    public static final void a(@Y61.k InterfaceC44803m interfaceC44803m, int i12) {
        interfaceC44803m.writeByte((i12 >>> 16) & 255);
        interfaceC44803m.writeByte((i12 >>> 8) & 255);
        interfaceC44803m.writeByte(i12 & 255);
    }

    public static final int a(@Y61.k InterfaceC44804n interfaceC44804n) {
        return (interfaceC44804n.readByte() & 255) | ((interfaceC44804n.readByte() & 255) << 16) | ((interfaceC44804n.readByte() & 255) << 8);
    }

    public static final boolean a(@Y61.k okio.e0 e0Var, int i12, @Y61.k TimeUnit timeUnit) {
        boolean z12;
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = e0Var.timeout().getHasDeadline() ? e0Var.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        e0Var.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i12)) + jNanoTime);
        try {
            C44802l c44802l = new C44802l();
            while (e0Var.read(c44802l, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                c44802l.a();
            }
            z12 = true;
        } catch (InterruptedIOException unused) {
            z12 = false;
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
            }
        } catch (Throwable th2) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                e0Var.timeout().clearDeadline();
            } else {
                e0Var.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th2;
        }
        if (jDeadlineNanoTime == Long.MAX_VALUE) {
            e0Var.timeout().clearDeadline();
        } else {
            e0Var.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
        }
        return z12;
    }

    public static final boolean a(@Y61.k okio.e0 e0Var, @Y61.k TimeUnit timeUnit) {
        try {
            return a(e0Var, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final boolean a(@Y61.k Socket socket, @Y61.k InterfaceC44804n interfaceC44804n) throws SocketException {
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z12 = !interfaceC44804n.W2();
                socket.setSoTimeout(soTimeout);
                return z12;
            } catch (Throwable th2) {
                socket.setSoTimeout(soTimeout);
                throw th2;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final int a(@Y61.k C44802l c44802l) {
        int i12 = 0;
        while (!c44802l.W2() && c44802l.m(0L) == 61) {
            i12++;
            c44802l.readByte();
        }
        return i12;
    }

    public static final int a(int i12, @Y61.k String str) {
        int length = str.length();
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i12;
            }
            i12++;
        }
        return str.length();
    }

    public static final long a(@Y61.k iz0 iz0Var) {
        String strA = iz0Var.h().a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @SafeVarargs
    @Y61.k
    public static final <T> List<T> a(@Y61.k T... tArr) {
        Object[] objArr = (Object[]) tArr.clone();
        return Collections.unmodifiableList(C42745f0.U(Arrays.copyOf(objArr, objArr.length)));
    }

    @Y61.k
    public static final <K, V> Map<K, V> a(@Y61.k Map<K, ? extends V> map) {
        if (map.isEmpty()) {
            return kotlin.collections.P0.c();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static final void a(@Y61.k Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e12) {
            throw e12;
        } catch (Exception unused) {
        }
    }

    public static final void a(@Y61.k Socket socket) throws IOException {
        try {
            socket.close();
        } catch (AssertionError e12) {
            throw e12;
        } catch (RuntimeException e13) {
            if (!kotlin.jvm.internal.L.f(e13.getMessage(), "bio == null")) {
                throw e13;
            }
        } catch (Exception unused) {
        }
    }

    public static final void a(@Y61.k ArrayList arrayList, Object obj) {
        if (arrayList.contains(obj)) {
            return;
        }
        arrayList.add(obj);
    }

    @Y61.k
    public static final Exception a(@Y61.k IOException iOException, @Y61.k List list) {
        if (list.size() > 1) {
            System.out.getClass();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C42833p.a(iOException, (Exception) it.next());
        }
        return iOException;
    }
}
