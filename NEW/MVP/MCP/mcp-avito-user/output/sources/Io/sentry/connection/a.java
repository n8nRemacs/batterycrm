package io.sentry.connection;

import androidx.camera.camera2.internal.G;
import io.sentry.event.Event;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AbstractConnection.java */
/* loaded from: classes8.dex */
public abstract class a implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final org.slf4j.a f405091e = org.slf4j.b.d(a.class);

    /* renamed from: f, reason: collision with root package name */
    public static final org.slf4j.a f405092f = org.slf4j.b.e(a.class.getName().concat(".lockdown"));

    /* renamed from: b, reason: collision with root package name */
    public final String f405093b;

    /* renamed from: d, reason: collision with root package name */
    public final h f405095d = new h();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f405094c = new HashSet();

    public a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder("Sentry sentry_version=6,sentry_client=sentry-java/1.7.23-1d154,sentry_key=");
        ThreadLocal<AtomicInteger> threadLocal = io.sentry.environment.a.f405159a;
        sb2.append(str);
        sb2.append(!io.sentry.util.b.a(str2) ? G.f(",sentry_secret=", str2) : "");
        this.f405093b = sb2.toString();
    }

    @Override // io.sentry.connection.d
    public final void L2(Event event) {
        try {
            if (this.f405095d.a()) {
                throw new LockedDownException();
            }
            a(event);
            h hVar = this.f405095d;
            synchronized (hVar) {
                hVar.f405140c = 0L;
                hVar.f405141d = null;
            }
            Iterator it = this.f405094c.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                try {
                    fVar.onSuccess();
                } catch (Exception e12) {
                    f405091e.i("An exception occurred while running an EventSendCallback.onSuccess: " + fVar.getClass().getName(), e12);
                }
            }
        } catch (ConnectionException e13) {
            Iterator it2 = this.f405094c.iterator();
            while (it2.hasNext()) {
                f fVar2 = (f) it2.next();
                try {
                    fVar2.a();
                } catch (Exception e14) {
                    f405091e.i("An exception occurred while running an EventSendCallback.onFailure: ".concat(fVar2.getClass().getName()), e14);
                }
            }
            h hVar2 = this.f405095d;
            synchronized (hVar2) {
                try {
                    if (!hVar2.a()) {
                        Long l12 = e13.f405089b;
                        if (l12 == null) {
                            long j12 = hVar2.f405140c;
                            if (j12 != 0) {
                                hVar2.f405140c = j12 * 2;
                            } else {
                                hVar2.f405140c = hVar2.f405139b;
                            }
                        } else {
                            hVar2.f405140c = l12.longValue();
                        }
                        hVar2.f405140c = Math.min(hVar2.f405138a, hVar2.f405140c);
                        hVar2.f405142e.getClass();
                        hVar2.f405141d = new Date();
                        f405092f.f("Initiated a temporary lockdown because of exception: " + e13.getMessage());
                    }
                    throw e13;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public abstract void a(Event event);
}
