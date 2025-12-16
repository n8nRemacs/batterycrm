package com.google.android.gms.internal.auth;

import android.os.StrictMode;
import androidx.collection.C20199a;
import j.B;
import j.P;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzdd implements zzcl {

    /* renamed from: a, reason: collision with root package name */
    @B
    public static final C20199a f350069a = new C20199a();

    /* JADX WARN: Multi-variable type inference failed */
    @P
    public static zzdd a() {
        zzdd zzddVar;
        if (zzcc.zzb()) {
            throw null;
        }
        synchronized (zzdd.class) {
            try {
                zzddVar = (zzdd) f350069a.get(null);
                if (zzddVar == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zzddVar;
    }

    public static synchronized void b() {
        C20199a c20199a = f350069a;
        Iterator it = c20199a.values().iterator();
        if (it.hasNext()) {
            ((zzdd) it.next()).getClass();
            throw null;
        }
        c20199a.clear();
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    @P
    public final Object zzb(String str) {
        throw null;
    }
}
