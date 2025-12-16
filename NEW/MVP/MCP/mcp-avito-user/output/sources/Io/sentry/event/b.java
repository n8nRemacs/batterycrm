package io.sentry.event;

import androidx.appcompat.app.r;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import y41.InterfaceC50060f;

/* compiled from: EventBuilder.java */
/* loaded from: classes8.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static final C11531b f405188d;

    /* renamed from: a, reason: collision with root package name */
    public final Event f405189a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f405190b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f405191c;

    /* compiled from: EventBuilder.java */
    /* renamed from: io.sentry.event.b$b, reason: collision with other inner class name */
    public static final class C11531b {

        /* renamed from: e, reason: collision with root package name */
        public static final long f405192e = TimeUnit.SECONDS.toMillis(1);

        /* renamed from: f, reason: collision with root package name */
        public static final org.slf4j.a f405193f = org.slf4j.b.d(C11531b.class);

        /* renamed from: a, reason: collision with root package name */
        public final long f405194a;

        /* renamed from: c, reason: collision with root package name */
        public volatile long f405196c;

        /* renamed from: b, reason: collision with root package name */
        public volatile String f405195b = "unavailable";

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f405197d = new AtomicBoolean(false);

        public C11531b(long j12, a aVar) {
            this.f405194a = j12;
        }
    }

    static {
        long millis = TimeUnit.HOURS.toMillis(5L);
        Charset.forName(Constants.ENCODING);
        f405188d = new C11531b(millis, null);
    }

    public b() {
        UUID uuidRandomUUID = UUID.randomUUID();
        this.f405190b = false;
        this.f405191c = new HashSet();
        this.f405189a = new Event(uuidRandomUUID);
    }

    public final void a() throws ExecutionException, InterruptedException, TimeoutException {
        Date date = this.f405189a.f405168d;
        if ((date != null ? (Date) date.clone() : null) == null) {
            this.f405189a.f405168d = new Date();
        }
        Event event = this.f405189a;
        if (event.f405171g == null) {
            event.f405171g = "java";
        }
        if (event.f405172h == null) {
            HashSet hashSet = this.f405191c;
            d dVar = new d();
            dVar.f405199b = "sentry-java";
            dVar.f405200c = "1.7.23-1d154";
            dVar.f405201d = hashSet;
            event.f405172h = dVar;
        }
        if (event.f405179o == null) {
            C11531b c11531b = f405188d;
            if (c11531b.f405196c < System.currentTimeMillis() && c11531b.f405197d.compareAndSet(false, true)) {
                c cVar = new c(c11531b);
                try {
                    C11531b.f405193f.debug("Updating the hostname cache");
                    FutureTask futureTask = new FutureTask(cVar);
                    new Thread(futureTask).start();
                    futureTask.get(C11531b.f405192e, TimeUnit.MILLISECONDS);
                } catch (Exception e12) {
                    c11531b.f405196c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
                    C11531b.f405193f.k("Localhost hostname lookup failed, keeping the value '{}'. If this persists it may mean your DNS is incorrectly configured and you may want to hardcode your server name: https://docs.sentry.io/clients/java/config/", c11531b.f405195b, e12);
                }
            }
            event.f405179o = c11531b.f405195b;
        }
    }

    public final synchronized Event b() {
        if (this.f405190b) {
            throw new IllegalStateException("A message can't be built twice");
        }
        a();
        c();
        this.f405190b = true;
        return this.f405189a;
    }

    public final void c() {
        Event event = this.f405189a;
        event.f405173i = Collections.unmodifiableMap(event.f405173i);
        event.f405174j = Collections.unmodifiableList(event.f405174j);
        HashMap map = new HashMap();
        for (Map.Entry<String, Map<String, Object>> entry : event.f405175k.entrySet()) {
            map.put(entry.getKey(), Collections.unmodifiableMap(entry.getValue()));
        }
        event.f405175k = Collections.unmodifiableMap(map);
        event.f405180p = Collections.unmodifiableMap(event.a());
        event.f405181q = Collections.unmodifiableMap(event.f405181q);
    }

    public final void d(InterfaceC50060f interfaceC50060f, boolean z12) {
        Event event = this.f405189a;
        if (z12 || !event.f405181q.containsKey(interfaceC50060f.M0())) {
            event.f405181q.put(interfaceC50060f.M0(), interfaceC50060f);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventBuilder{event=");
        sb2.append(this.f405189a);
        sb2.append(", alreadyBuilt=");
        return r.x(sb2, this.f405190b, '}');
    }
}
