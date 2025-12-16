package com.google.android.gms.internal.auth;

import I41.h;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public abstract class zzdc {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f350061f = new Object();

    /* renamed from: g, reason: collision with root package name */
    @h
    public static volatile zzcd f350062g;

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicInteger f350063h;
    public static final /* synthetic */ int zzd = 0;

    /* renamed from: a, reason: collision with root package name */
    public final zzcz f350064a;

    /* renamed from: b, reason: collision with root package name */
    public final String f350065b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f350066c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f350067d = -1;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f350068e;

    static {
        new AtomicReference();
        new zzde(zzcu.zza);
        f350063h = new AtomicInteger();
    }

    public /* synthetic */ zzdc(zzcz zzczVar, String str, Object obj, boolean z12, zzdb zzdbVar) {
        if (zzczVar.f350056a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f350064a = zzczVar;
        this.f350065b = str;
        this.f350066c = obj;
    }

    public static void zzc() {
        f350063h.incrementAndGet();
    }

    public static void zzd(final Context context) {
        Context context2;
        if (f350062g != null || context == null) {
            return;
        }
        Object obj = f350061f;
        synchronized (obj) {
            try {
                if (f350062g == null) {
                    synchronized (obj) {
                        zzcd zzcdVar = f350062g;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzcdVar == null || zzcdVar.f350037a != context) {
                            zzcg.a();
                            zzdd.b();
                            synchronized (zzco.class) {
                                try {
                                    zzco zzcoVar = zzco.f350049c;
                                    if (zzcoVar != null && (context2 = zzcoVar.f350050a) != null && zzcoVar.f350051b != null) {
                                        context2.getContentResolver().unregisterContentObserver(zzco.f350049c.f350051b);
                                    }
                                    zzco.f350049c = null;
                                } finally {
                                }
                            }
                            f350062g = new zzcd(context, zzdo.zza(new zzdj() { // from class: com.google.android.gms.internal.auth.zzct
                                @Override // com.google.android.gms.internal.auth.zzdj
                                public final Object zza() {
                                    Context context3 = context;
                                    Object obj2 = zzdc.f350061f;
                                    return zzcp.zza(context3);
                                }
                            }));
                            f350063h.incrementAndGet();
                        }
                    }
                }
            } finally {
            }
        }
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[PHI: r2
  0x003c: PHI (r2v1 com.google.android.gms.internal.auth.zzdh) = (r2v0 com.google.android.gms.internal.auth.zzdh), (r2v5 com.google.android.gms.internal.auth.zzdh) binds: [B:8:0x0016, B:10:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzb() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzdc.zzb():java.lang.Object");
    }
}
