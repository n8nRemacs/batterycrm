package com.google.android.gms.internal.measurement;

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

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzgg implements zzgj {

    /* renamed from: h, reason: collision with root package name */
    @B
    public static final C20199a f350789h = new C20199a();

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f350790i = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f350791a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f350792b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f350793c;

    /* renamed from: d, reason: collision with root package name */
    public final ContentObserver f350794d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f350795e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Map<String, String> f350796f;

    /* renamed from: g, reason: collision with root package name */
    @B
    public final ArrayList f350797g;

    public zzgg(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgi zzgiVar = new zzgi(this);
        this.f350794d = zzgiVar;
        this.f350795e = new Object();
        this.f350797g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f350791a = contentResolver;
        this.f350792b = uri;
        this.f350793c = runnable;
        contentResolver.registerContentObserver(uri, false, zzgiVar);
    }

    public static synchronized void a() {
        try {
            for (zzgg zzggVar : f350789h.values()) {
                zzggVar.f350791a.unregisterContentObserver(zzggVar.f350794d);
            }
            f350789h.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgg zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgg zzggVar;
        synchronized (zzgg.class) {
            C20199a c20199a = f350789h;
            zzggVar = (zzgg) c20199a.get(uri);
            if (zzggVar == null) {
                try {
                    zzgg zzggVar2 = new zzgg(contentResolver, uri, runnable);
                    try {
                        c20199a.put(uri, zzggVar2);
                    } catch (SecurityException unused) {
                    }
                    zzggVar = zzggVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzggVar;
    }

    public final void zzd() {
        synchronized (this.f350795e) {
            this.f350796f = null;
            this.f350793c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f350797g.iterator();
                while (it.hasNext()) {
                    ((zzgh) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgj
    public final /* synthetic */ Object zza(String str) {
        return zza().get(str);
    }

    public final Map<String, String> zza() {
        Map<String, String> map;
        Map<String, String> map2 = this.f350796f;
        if (map2 == null) {
            synchronized (this.f350795e) {
                try {
                    map2 = this.f350796f;
                    if (map2 == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                map = (Map) zzgm.zza(new zzgl() { // from class: com.google.android.gms.internal.measurement.zzgf
                                    @Override // com.google.android.gms.internal.measurement.zzgl
                                    public final Object zza() {
                                        zzgg zzggVar = this.f350788a;
                                        Cursor cursorQuery = zzggVar.f350791a.query(zzggVar.f350792b, zzgg.f350790i, null, null, null);
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
                            }
                            this.f350796f = map;
                            map2 = map;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    }
                } finally {
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }
}
