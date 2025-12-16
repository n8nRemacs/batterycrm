package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import androidx.collection.C20199a;
import j.B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzcg implements zzcl {

    /* renamed from: h, reason: collision with root package name */
    @B
    public static final C20199a f350040h = new C20199a();
    public static final String[] zza = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f350041a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f350042b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f350043c;

    /* renamed from: d, reason: collision with root package name */
    public final ContentObserver f350044d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f350045e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Map f350046f;

    /* renamed from: g, reason: collision with root package name */
    @B
    public final ArrayList f350047g;

    public zzcg(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzcf zzcfVar = new zzcf(this);
        this.f350044d = zzcfVar;
        this.f350045e = new Object();
        this.f350047g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f350041a = contentResolver;
        this.f350042b = uri;
        this.f350043c = runnable;
        contentResolver.registerContentObserver(uri, false, zzcfVar);
    }

    public static synchronized void a() {
        try {
            for (zzcg zzcgVar : f350040h.values()) {
                zzcgVar.f350041a.unregisterContentObserver(zzcgVar.f350044d);
            }
            f350040h.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzcg zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzcg zzcgVar;
        synchronized (zzcg.class) {
            C20199a c20199a = f350040h;
            zzcgVar = (zzcg) c20199a.get(uri);
            if (zzcgVar == null) {
                try {
                    zzcg zzcgVar2 = new zzcg(contentResolver, uri, runnable);
                    try {
                        c20199a.put(uri, zzcgVar2);
                    } catch (SecurityException unused) {
                    }
                    zzcgVar = zzcgVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzcgVar;
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        Map map;
        Map mapEmptyMap = this.f350046f;
        if (mapEmptyMap == null) {
            synchronized (this.f350045e) {
                try {
                    mapEmptyMap = this.f350046f;
                    if (mapEmptyMap == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            map = (Map) zzcj.zza(new zzck() { // from class: com.google.android.gms.internal.auth.zzce
                                @Override // com.google.android.gms.internal.auth.zzck
                                public final Object zza() {
                                    zzcg zzcgVar = this.zza;
                                    Cursor cursorQuery = zzcgVar.f350041a.query(zzcgVar.f350042b, zzcg.zza, null, null, null);
                                    if (cursorQuery == null) {
                                        return Collections.emptyMap();
                                    }
                                    try {
                                        int count = cursorQuery.getCount();
                                        if (count == 0) {
                                            return Collections.emptyMap();
                                        }
                                        Map c20199a = count <= 256 ? new C20199a(count) : new HashMap(count, 1.0f);
                                        while (cursorQuery.moveToNext()) {
                                            c20199a.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                        }
                                        cursorQuery.close();
                                        return c20199a;
                                    } finally {
                                        cursorQuery.close();
                                    }
                                }
                            });
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = null;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                        this.f350046f = map;
                        mapEmptyMap = map;
                    }
                } finally {
                }
            }
        }
        if (mapEmptyMap == null) {
            mapEmptyMap = Collections.emptyMap();
        }
        return (String) mapEmptyMap.get(str);
    }

    public final void zze() {
        synchronized (this.f350045e) {
            this.f350046f = null;
            zzdc.zzc();
        }
        synchronized (this) {
            try {
                Iterator it = this.f350047g.iterator();
                while (it.hasNext()) {
                    ((zzch) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
