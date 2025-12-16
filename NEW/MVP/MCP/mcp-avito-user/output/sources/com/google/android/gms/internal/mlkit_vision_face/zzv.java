package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzv {

    /* renamed from: a, reason: collision with root package name */
    public final String f353480a;

    /* renamed from: b, reason: collision with root package name */
    public final zzu f353481b;

    /* renamed from: c, reason: collision with root package name */
    public zzu f353482c;

    public /* synthetic */ zzv(String str, zzs zzsVar) {
        zzu zzuVar = new zzu(null);
        this.f353481b = zzuVar;
        this.f353482c = zzuVar;
        this.f353480a = str;
    }

    public final void a(String str, String str2) {
        zzt zztVar = new zzt(null);
        this.f353482c.f353479c = zztVar;
        this.f353482c = zztVar;
        zztVar.f353478b = str2;
        zztVar.f353477a = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f353480a);
        sb2.append('{');
        zzu zzuVar = this.f353481b.f353479c;
        String str = "";
        while (zzuVar != null) {
            Object obj = zzuVar.f353478b;
            sb2.append(str);
            String str2 = zzuVar.f353477a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzuVar = zzuVar.f353479c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzv zza(String str, float f12) {
        a(str, String.valueOf(f12));
        return this;
    }

    public final zzv zzb(String str, int i12) {
        a(str, String.valueOf(i12));
        return this;
    }

    public final zzv zzc(String str, @a Object obj) {
        zzu zzuVar = new zzu(null);
        this.f353482c.f353479c = zzuVar;
        this.f353482c = zzuVar;
        zzuVar.f353478b = obj;
        zzuVar.f353477a = str;
        return this;
    }

    public final zzv zzd(String str, boolean z12) {
        a("trackingEnabled", String.valueOf(z12));
        return this;
    }
}
