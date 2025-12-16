package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import j.B;
import j.P;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzfv implements zzfw {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f350773a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    @B
    @P
    public HashMap<String, String> f350774b = null;

    /* renamed from: c, reason: collision with root package name */
    @B
    public final HashMap<String, Boolean> f350775c = new HashMap<>(16, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    @B
    public final HashMap<String, Integer> f350776d = new HashMap<>(16, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    @B
    public final HashMap<String, Long> f350777e = new HashMap<>(16, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    @B
    public final HashMap<String, Float> f350778f = new HashMap<>(16, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    @B
    @P
    public Object f350779g = null;

    /* renamed from: h, reason: collision with root package name */
    @B
    public boolean f350780h = false;

    /* renamed from: i, reason: collision with root package name */
    @B
    public final String[] f350781i = new String[0];

    /* renamed from: j, reason: collision with root package name */
    public final zzga f350782j = new zzga();

    @Override // com.google.android.gms.internal.measurement.zzfw
    @P
    public final String zza(@P ContentResolver contentResolver, String str, @P String str2) {
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                if (this.f350774b == null) {
                    this.f350773a.set(false);
                    this.f350774b = new HashMap<>(16, 1.0f);
                    this.f350779g = new Object();
                    contentResolver.registerContentObserver(zzfu.zza, true, new zzfx(this));
                } else if (this.f350773a.getAndSet(false)) {
                    this.f350774b.clear();
                    this.f350775c.clear();
                    this.f350776d.clear();
                    this.f350777e.clear();
                    this.f350778f.clear();
                    this.f350779g = new Object();
                    this.f350780h = false;
                }
                Object obj = this.f350779g;
                if (this.f350774b.containsKey(str)) {
                    String str3 = this.f350774b.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : this.f350781i) {
                    if (str.startsWith(str4)) {
                        if (!this.f350780h) {
                            try {
                                HashMap<String, String> map = (HashMap) this.f350782j.zza(contentResolver, this.f350781i, new zzfz() { // from class: com.google.android.gms.internal.measurement.zzfy
                                    @Override // com.google.android.gms.internal.measurement.zzfz
                                    public final Map zza(int i12) {
                                        return new HashMap(i12, 1.0f);
                                    }
                                });
                                if (!map.isEmpty()) {
                                    Set<String> setKeySet = map.keySet();
                                    setKeySet.removeAll(this.f350775c.keySet());
                                    setKeySet.removeAll(this.f350776d.keySet());
                                    setKeySet.removeAll(this.f350777e.keySet());
                                    setKeySet.removeAll(this.f350778f.keySet());
                                }
                                if (!map.isEmpty()) {
                                    if (this.f350774b.isEmpty()) {
                                        this.f350774b = map;
                                    } else {
                                        this.f350774b.putAll(map);
                                    }
                                }
                                this.f350780h = true;
                            } catch (zzgb unused) {
                            }
                            if (this.f350774b.containsKey(str)) {
                                String str5 = this.f350774b.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                try {
                    String strZza = this.f350782j.zza(contentResolver, str);
                    if (strZza != null && strZza.equals(null)) {
                        strZza = null;
                    }
                    synchronized (this) {
                        try {
                            if (obj == this.f350779g) {
                                this.f350774b.put(str, strZza);
                            }
                        } finally {
                        }
                    }
                    if (strZza != null) {
                        return strZza;
                    }
                    return null;
                } catch (zzgb unused2) {
                    return null;
                }
            } finally {
            }
        }
    }
}
