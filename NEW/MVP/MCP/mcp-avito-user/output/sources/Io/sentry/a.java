package io.sentry;

import com.adjust.sdk.Constants;
import io.sentry.connection.g;
import io.sentry.connection.i;
import io.sentry.connection.j;
import io.sentry.connection.k;
import io.sentry.connection.l;
import io.sentry.marshaller.json.f;
import io.sentry.marshaller.json.h;
import java.io.File;
import java.lang.Thread;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import v41.C49163b;
import w41.C49445a;
import x41.C49765b;
import x41.C49768e;
import y41.C50055a;
import y41.C50056b;
import y41.C50057c;
import y41.C50058d;
import y41.C50062h;
import y41.C50063i;

/* compiled from: DefaultSentryClientFactory.java */
/* loaded from: classes8.dex */
public class a extends d {

    /* renamed from: b, reason: collision with root package name */
    public static final int f405054b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f405055c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f405056d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f405057e;

    /* renamed from: f, reason: collision with root package name */
    public static final org.slf4j.a f405058f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f405059g;

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f405060h;

    /* compiled from: DefaultSentryClientFactory.java */
    public static final class b implements ThreadFactory {

        /* renamed from: f, reason: collision with root package name */
        public static final AtomicInteger f405061f = new AtomicInteger(1);

        /* renamed from: b, reason: collision with root package name */
        public final ThreadGroup f405062b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicInteger f405063c = new AtomicInteger(1);

        /* renamed from: d, reason: collision with root package name */
        public final String f405064d;

        /* renamed from: e, reason: collision with root package name */
        public final int f405065e;

        public b(int i12, C11527a c11527a) {
            SecurityManager securityManager = System.getSecurityManager();
            this.f405062b = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f405064d = "sentry-pool-" + f405061f.getAndIncrement() + "-thread-";
            this.f405065e = i12;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f405062b, runnable, this.f405064d + this.f405063c.getAndIncrement(), 0L);
            if (!thread.isDaemon()) {
                thread.setDaemon(true);
            }
            int priority = thread.getPriority();
            int i12 = this.f405065e;
            if (priority != i12) {
                thread.setPriority(i12);
            }
            return thread;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f405054b = (int) timeUnit.toMillis(1L);
        f405055c = (int) timeUnit.toMillis(5L);
        f405056d = timeUnit.toMillis(1L);
        f405057e = timeUnit.toMillis(1L);
        f405058f = org.slf4j.b.d(a.class);
        f405059g = Boolean.FALSE.toString();
        HashMap map = new HashMap();
        f405060h = map;
        map.put("sync", new ThreadPoolExecutor.CallerRunsPolicy());
        map.put("discardnew", new ThreadPoolExecutor.DiscardPolicy());
        map.put("discardold", new ThreadPoolExecutor.DiscardOldestPolicy());
    }

    @Override // io.sentry.d
    public c a(C49445a c49445a) throws ClassNotFoundException {
        org.slf4j.a aVar = f405058f;
        try {
            c cVar = new c(c(c49445a), f());
            CopyOnWriteArrayList copyOnWriteArrayList = cVar.f405086j;
            try {
                Class.forName("javax.servlet.ServletRequestListener", false, getClass().getClassLoader());
                C49768e c49768e = new C49768e();
                c.f405075m.m(c49768e, "Adding '{}' to the list of builder helpers.");
                copyOnWriteArrayList.add(c49768e);
            } catch (ClassNotFoundException unused) {
                aVar.debug("The current environment doesn't provide access to servlets, or provides an unsupported version.");
            }
            C49765b c49765b = new C49765b();
            c49765b.f442208a = cVar;
            c.f405075m.m(c49765b, "Adding '{}' to the list of builder helpers.");
            copyOnWriteArrayList.add(c49765b);
            b(cVar, c49445a);
            return cVar;
        } catch (Exception e12) {
            aVar.l("Failed to initialize sentry, falling back to no-op client", e12);
            return new c(new i(), new io.sentry.context.d());
        }
    }

    public final void b(c cVar, C49445a c49445a) throws ClassNotFoundException {
        String strB = C49163b.b("release", c49445a);
        if (strB != null) {
            cVar.f405077a = strB;
        }
        String strB2 = C49163b.b("dist", c49445a);
        if (strB2 != null) {
            cVar.f405078b = strB2;
        }
        String strB3 = C49163b.b("environment", c49445a);
        if (strB3 != null) {
            cVar.f405079c = strB3;
        }
        String strB4 = C49163b.b("servername", c49445a);
        if (strB4 != null) {
            cVar.f405080d = strB4;
        }
        Map<String, String> mapB = io.sentry.util.b.b(C49163b.b("tags", c49445a), "tags");
        if (!mapB.isEmpty()) {
            for (Map.Entry<String, String> entry : mapB.entrySet()) {
                cVar.f405081e.put(entry.getKey(), entry.getValue());
            }
        }
        String strB5 = C49163b.b("mdctags", c49445a);
        if (io.sentry.util.b.a(strB5)) {
            strB5 = C49163b.b("extratags", c49445a);
            if (!io.sentry.util.b.a(strB5)) {
                f405058f.f("The 'extratags' option is deprecated, please use the 'mdctags' option instead.");
            }
        }
        Set setEmptySet = io.sentry.util.b.a(strB5) ? Collections.emptySet() : new HashSet(Arrays.asList(strB5.split(",")));
        if (!setEmptySet.isEmpty()) {
            Iterator it = setEmptySet.iterator();
            while (it.hasNext()) {
                cVar.f405082f.add((String) it.next());
            }
        }
        Map<String, String> mapB2 = io.sentry.util.b.b(C49163b.b("extra", c49445a), "extras");
        if (!mapB2.isEmpty()) {
            for (Map.Entry<String, String> entry2 : mapB2.entrySet()) {
                cVar.f405083g.put(entry2.getKey(), entry2.getValue());
            }
        }
        if (!f405059g.equalsIgnoreCase(C49163b.b("uncaught.handler.enabled", c49445a))) {
            org.slf4j.a aVar = e.f405156c;
            aVar.debug("Configuring uncaught exception handler.");
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                aVar.debug("default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'");
            }
            e eVar = new e();
            eVar.f405158b = Boolean.TRUE;
            eVar.f405157a = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(eVar);
            cVar.f405088l = eVar;
        }
        Iterator it2 = g(c49445a).iterator();
        while (it2.hasNext()) {
            io.sentry.jvmti.b.f405207a.add((String) it2.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [io.sentry.connection.b] */
    /* JADX WARN: Type inference failed for: r1v34, types: [io.sentry.connection.c] */
    public final io.sentry.connection.d c(C49445a c49445a) throws ClassNotFoundException {
        Proxy proxy;
        l lVar;
        io.sentry.connection.a iVar;
        io.sentry.connection.c cVar;
        io.sentry.buffer.b bVarE;
        String str = c49445a.f441272d;
        boolean zEqualsIgnoreCase = str.equalsIgnoreCase("http");
        org.slf4j.a aVar = f405058f;
        if (zEqualsIgnoreCase || str.equalsIgnoreCase(Constants.SCHEME)) {
            aVar.m(str.toUpperCase(), "Using an {} connection to Sentry.");
            URI uri = c49445a.f441278j;
            String str2 = c49445a.f441271c;
            Charset charset = g.f405124n;
            try {
                URL url = new URL(uri.toString() + "api/" + str2 + "/store/");
                String strB = C49163b.b("http.proxy.host", c49445a);
                String strB2 = C49163b.b("http.proxy.user", c49445a);
                String strB3 = C49163b.b("http.proxy.password", c49445a);
                int iIntValue = io.sentry.util.b.c(80, C49163b.b("http.proxy.port", c49445a)).intValue();
                if (strB != null) {
                    Proxy proxy2 = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(strB, iIntValue));
                    if (strB2 != null && strB3 != null) {
                        k kVar = new k();
                        kVar.f405146a = strB2;
                        kVar.f405147b = strB3;
                        Authenticator.setDefault(kVar);
                    }
                    proxy = proxy2;
                } else {
                    proxy = null;
                }
                String strB4 = C49163b.b("sample.rate", c49445a);
                Double dValueOf = io.sentry.util.b.a(strB4) ? null : Double.valueOf(Double.parseDouble(strB4));
                if (dValueOf != null) {
                    double dDoubleValue = dValueOf.doubleValue();
                    Random random = new Random();
                    l lVar2 = new l();
                    lVar2.f405148a = dDoubleValue;
                    lVar2.f405149b = random;
                    lVar = lVar2;
                } else {
                    lVar = null;
                }
                g gVar = new g(url, c49445a.f441270b, c49445a.f441269a, proxy, lVar);
                gVar.f405132j = d(c49445a);
                gVar.f405133k = io.sentry.util.b.c(Integer.valueOf(f405054b), C49163b.b("timeout", c49445a)).intValue();
                gVar.f405134l = io.sentry.util.b.c(Integer.valueOf(f405055c), C49163b.b("readtimeout", c49445a)).intValue();
                gVar.f405135m = c49445a.f441276h.contains("naive");
                iVar = gVar;
            } catch (MalformedURLException e12) {
                throw new IllegalArgumentException("Couldn't build a valid URL from the Sentry API.", e12);
            }
        } else if (str.equalsIgnoreCase("out")) {
            aVar.debug("Using StdOut to send events.");
            j jVar = new j(System.out);
            jVar.f405145h = d(c49445a);
            iVar = jVar;
        } else {
            if (!str.equalsIgnoreCase("noop")) {
                throw new IllegalStateException(AK.c.k("Couldn't create a connection for the protocol '", str, "'"));
            }
            aVar.debug("Using noop to send events.");
            iVar = new i();
        }
        io.sentry.connection.a bVar = iVar;
        String strB5 = C49163b.b("buffer.enabled", c49445a);
        boolean z12 = strB5 != null ? Boolean.parseBoolean(strB5) : true;
        String str3 = f405059g;
        if (!z12 || (bVarE = e(c49445a)) == null) {
            cVar = null;
        } else {
            String strB6 = C49163b.b("buffer.flushtime", c49445a);
            long jLongValue = (io.sentry.util.b.a(strB6) ? 60000L : Long.valueOf(Long.parseLong(strB6))).longValue();
            boolean z13 = !str3.equalsIgnoreCase(C49163b.b("buffer.gracefulshutdown", c49445a));
            String strB7 = C49163b.b("buffer.shutdowntimeout", c49445a);
            Long lValueOf = Long.valueOf(f405056d);
            if (!io.sentry.util.b.a(strB7)) {
                lValueOf = Long.valueOf(Long.parseLong(strB7));
            }
            ?? cVar2 = new io.sentry.connection.c(bVar, bVarE, jLongValue, z13, lValueOf.longValue());
            bVar = cVar2;
            cVar = cVar2;
        }
        if (!str3.equalsIgnoreCase(C49163b.b("async", c49445a))) {
            int iIntValue2 = io.sentry.util.b.c(Integer.valueOf(Runtime.getRuntime().availableProcessors()), C49163b.b("async.threads", c49445a)).intValue();
            int iIntValue3 = io.sentry.util.b.c(1, C49163b.b("async.priority", c49445a)).intValue();
            int iIntValue4 = io.sentry.util.b.c(50, C49163b.b("async.queuesize", c49445a)).intValue();
            LinkedBlockingDeque linkedBlockingDeque = iIntValue4 == -1 ? new LinkedBlockingDeque() : new LinkedBlockingDeque(iIntValue4);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            b bVar2 = new b(iIntValue3, null);
            String strB8 = C49163b.b("async.queue.overflow", c49445a);
            String lowerCase = !io.sentry.util.b.a(strB8) ? strB8.toLowerCase() : "discardold";
            HashMap map = f405060h;
            RejectedExecutionHandler rejectedExecutionHandler = (RejectedExecutionHandler) map.get(lowerCase);
            if (rejectedExecutionHandler == null) {
                throw new RuntimeException(androidx.compose.ui.graphics.colorspace.e.n("RejectedExecutionHandler not found: '", lowerCase, "', valid choices are: ", Arrays.toString(map.keySet().toArray())));
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iIntValue2, iIntValue2, 0L, timeUnit, linkedBlockingDeque, bVar2, rejectedExecutionHandler);
            boolean z14 = !str3.equalsIgnoreCase(C49163b.b("async.gracefulshutdown", c49445a));
            String strB9 = C49163b.b("async.shutdowntimeout", c49445a);
            Long lValueOf2 = Long.valueOf(f405057e);
            if (!io.sentry.util.b.a(strB9)) {
                lValueOf2 = Long.valueOf(Long.parseLong(strB9));
            }
            bVar = new io.sentry.connection.b(bVar, threadPoolExecutor, z14, lValueOf2.longValue());
        }
        return cVar != null ? cVar.a(bVar) : bVar;
    }

    public final io.sentry.marshaller.json.e d(C49445a c49445a) throws ClassNotFoundException {
        int iIntValue = io.sentry.util.b.c(1000, C49163b.b("maxmessagelength", c49445a)).intValue();
        io.sentry.marshaller.json.e eVar = new io.sentry.marshaller.json.e(iIntValue);
        h hVar = new h();
        String strB = C49163b.b("stacktrace.hidecommon", c49445a);
        String str = f405059g;
        hVar.f405226b = !str.equalsIgnoreCase(strB);
        hVar.f405225a = g(c49445a);
        eVar.a(C50062h.class, hVar);
        eVar.a(C50056b.class, new io.sentry.marshaller.json.b(hVar));
        eVar.a(C50058d.class, new f(iIntValue));
        eVar.a(C50063i.class, new io.sentry.marshaller.json.i());
        eVar.a(C50055a.class, new io.sentry.marshaller.json.a());
        eVar.a(C50057c.class, new io.sentry.marshaller.json.c());
        eVar.f405214c = !str.equalsIgnoreCase(C49163b.b("compression", c49445a));
        return eVar;
    }

    public io.sentry.buffer.b e(C49445a c49445a) throws ClassNotFoundException {
        String strB = C49163b.b("buffer.dir", c49445a);
        if (strB != null) {
            return new io.sentry.buffer.b(new File(strB), io.sentry.util.b.c(10, C49163b.b("buffer.size", c49445a)).intValue());
        }
        return null;
    }

    public io.sentry.context.b f() {
        return new io.sentry.context.d();
    }

    public List g(C49445a c49445a) throws ClassNotFoundException {
        String strB = C49163b.b("stacktrace.app.packages", c49445a);
        if (io.sentry.util.b.a(strB)) {
            if (strB == null) {
                f405058f.f("No 'stacktrace.app.packages' was configured, this option is highly recommended as it affects stacktrace grouping and display on Sentry. See documentation: https://docs.sentry.io/clients/java/config/#in-application-stack-frames");
            }
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strB.split(",")) {
            if (!str.trim().equals("")) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
