package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.common.C37591m;
import j.P;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import mZ0.C44035b;

/* compiled from: UserMetadata.java */
/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final e f361064a;

    /* renamed from: b, reason: collision with root package name */
    public final C37591m f361065b;

    /* renamed from: c, reason: collision with root package name */
    public final String f361066c;

    /* renamed from: d, reason: collision with root package name */
    public final a f361067d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    public final a f361068e = new a(true);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicMarkableReference<String> f361069f = new AtomicMarkableReference<>(null, false);

    /* compiled from: UserMetadata.java */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicMarkableReference<b> f361070a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<Callable<Void>> f361071b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        public final boolean f361072c;

        public a(boolean z12) {
            this.f361072c = z12;
            this.f361070a = new AtomicMarkableReference<>(new b(z12 ? 8192 : 1024), false);
        }

        public final boolean a(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.f361070a.getReference().b(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<b> atomicMarkableReference = this.f361070a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    i iVar = new i(this, 1);
                    AtomicReference<Callable<Void>> atomicReference = this.f361071b;
                    while (true) {
                        if (atomicReference.compareAndSet(null, iVar)) {
                            j.this.f361065b.a(iVar);
                            break;
                        }
                        if (atomicReference.get() != null) {
                            break;
                        }
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public j(String str, C44035b c44035b, C37591m c37591m) {
        this.f361066c = str;
        this.f361064a = new e(c44035b);
        this.f361065b = c37591m;
    }

    public static j c(String str, C44035b c44035b, C37591m c37591m) {
        e eVar = new e(c44035b);
        j jVar = new j(str, c44035b, c37591m);
        jVar.f361067d.f361070a.getReference().c(eVar.b(str, false));
        jVar.f361068e.f361070a.getReference().c(eVar.b(str, true));
        jVar.f361069f.set(eVar.c(str), false);
        return jVar;
    }

    @P
    public static String d(String str, C44035b c44035b) {
        return new e(c44035b).c(str);
    }

    public final Map<String, String> a() {
        Map<String, String> mapUnmodifiableMap;
        b reference = this.f361067d.f361070a.getReference();
        synchronized (reference) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f361032a));
        }
        return mapUnmodifiableMap;
    }

    public final Map<String, String> b() {
        Map<String, String> mapUnmodifiableMap;
        b reference = this.f361068e.f361070a.getReference();
        synchronized (reference) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f361032a));
        }
        return mapUnmodifiableMap;
    }

    public final void e(String str, String str2) {
        this.f361067d.a(str, str2);
    }

    public final void f() {
        a aVar = this.f361067d;
        synchronized (aVar) {
            aVar.f361070a.getReference().c(null);
            AtomicMarkableReference<b> atomicMarkableReference = aVar.f361070a;
            atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
        }
        i iVar = new i(aVar, 1);
        AtomicReference<Callable<Void>> atomicReference = aVar.f361071b;
        while (!atomicReference.compareAndSet(null, iVar)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        j.this.f361065b.a(iVar);
    }

    public final void g(String str) {
        this.f361068e.a("com.crashlytics.version-control-info", str);
    }

    public final void h(String str) {
        String strA = b.a(1024, str);
        synchronized (this.f361069f) {
            try {
                String reference = this.f361069f.getReference();
                if (strA == null ? reference == null : strA.equals(reference)) {
                    return;
                }
                this.f361069f.set(strA, true);
                this.f361065b.a(new i(this, 0));
            } finally {
            }
        }
    }
}
