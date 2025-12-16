package com.google.android.gms.internal.fido;

import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzeo extends zzei {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f350339b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f350340c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f350341d;

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReference f350342e;

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLong f350343f;

    /* renamed from: g, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f350344g;

    static {
        String str = Build.FINGERPRINT;
        f350339b = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        f350340c = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        f350341d = "eng".equals(str3) || "userdebug".equals(str3);
        f350342e = new AtomicReference();
        f350343f = new AtomicLong();
        f350344g = new ConcurrentLinkedQueue();
    }

    public static zzdp zzb(String str) {
        AtomicReference atomicReference = f350342e;
        if (atomicReference.get() != null) {
            return ((zzek) atomicReference.get()).zza(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char cCharAt = str.charAt(length);
                if (cCharAt != '$') {
                    if (cCharAt == '.') {
                        break;
                    }
                } else {
                    str = str.replace('$', '.');
                    break;
                }
            } else {
                break;
            }
        }
        zzeo zzeoVar = new zzeo(str);
        if (f350339b || f350340c) {
            new zzej().zza(zzeoVar.zza());
        } else if (f350341d) {
            zzeu.zzc().zzb(false).zza(zzeoVar.zza());
        }
        zzem.f350338a.offer(zzeoVar);
        if (atomicReference.get() != null) {
            while (true) {
                zzeo zzeoVar2 = (zzeo) zzem.f350338a.poll();
                if (zzeoVar2 == null) {
                    break;
                }
                ((zzek) atomicReference.get()).zza(zzeoVar2.zza());
            }
            if (((zzen) f350344g.poll()) != null) {
                f350343f.getAndDecrement();
                throw null;
            }
        }
        return zzeoVar;
    }
}
