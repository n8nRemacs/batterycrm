package io.sentry.event;

import io.sentry.event.b;
import java.net.InetAddress;
import java.util.concurrent.Callable;

/* compiled from: EventBuilder.java */
/* loaded from: classes8.dex */
class c implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.C11531b f405198b;

    public c(b.C11531b c11531b) {
        this.f405198b = c11531b;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        try {
            this.f405198b.f405195b = InetAddress.getLocalHost().getCanonicalHostName();
            this.f405198b.f405196c = System.currentTimeMillis() + this.f405198b.f405194a;
            this.f405198b.f405197d.set(false);
            return null;
        } catch (Throwable th2) {
            this.f405198b.f405197d.set(false);
            throw th2;
        }
    }
}
