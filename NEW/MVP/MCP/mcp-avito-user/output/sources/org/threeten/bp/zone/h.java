package org.threeten.bp.zone;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ZoneRulesInitializer.java */
/* loaded from: classes16.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f422256a;

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference<h> f422257b;

    /* compiled from: ZoneRulesInitializer.java */
    public static class b extends h {
        @Override // org.threeten.bp.zone.h
        public final void a() {
            Iterator it = ServiceLoader.load(i.class, i.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    i.d((i) it.next());
                } catch (ServiceConfigurationError e12) {
                    if (!(e12.getCause() instanceof SecurityException)) {
                        throw e12;
                    }
                }
            }
        }
    }

    static {
        new a();
        f422256a = new AtomicBoolean(false);
        f422257b = new AtomicReference<>();
    }

    public abstract void a();

    /* compiled from: ZoneRulesInitializer.java */
    public static class a extends h {
        @Override // org.threeten.bp.zone.h
        public final void a() {
        }
    }
}
