package com.google.android.datatransport.runtime.scheduling.persistence;

import VY0.c;
import com.google.android.datatransport.runtime.scheduling.persistence.a;

/* compiled from: EventStoreConfig.java */
@VY0.c
/* loaded from: classes10.dex */
abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.android.datatransport.runtime.scheduling.persistence.a f343243a;

    /* compiled from: EventStoreConfig.java */
    @c.a
    public static abstract class a {
    }

    static {
        a.b bVar = new a.b();
        bVar.f343235a = 10485760L;
        bVar.f343236b = 200;
        bVar.f343237c = 10000;
        bVar.f343238d = 604800000L;
        bVar.f343239e = 81920;
        String strQ = bVar.f343235a == null ? " maxStorageSizeInBytes" : "";
        if (bVar.f343236b == null) {
            strQ = strQ.concat(" loadBatchSize");
        }
        if (bVar.f343237c == null) {
            strQ = androidx.appcompat.app.r.q(strQ, " criticalSectionEnterTimeoutMs");
        }
        if (bVar.f343238d == null) {
            strQ = androidx.appcompat.app.r.q(strQ, " eventCleanUpAge");
        }
        if (bVar.f343239e == null) {
            strQ = androidx.appcompat.app.r.q(strQ, " maxBlobByteSizePerRow");
        }
        if (!strQ.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }
        f343243a = new com.google.android.datatransport.runtime.scheduling.persistence.a(bVar.f343235a.longValue(), bVar.f343236b.intValue(), bVar.f343237c.intValue(), bVar.f343238d.longValue(), bVar.f343239e.intValue(), null);
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
