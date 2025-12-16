package com.google.android.gms.internal.fido;

import I41.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzbi {

    /* renamed from: a, reason: collision with root package name */
    public final String f350267a;

    /* renamed from: b, reason: collision with root package name */
    public final zzbg f350268b;

    /* renamed from: c, reason: collision with root package name */
    public zzbg f350269c;

    public /* synthetic */ zzbi(String str, zzbh zzbhVar) {
        zzbg zzbgVar = new zzbg();
        this.f350268b = zzbgVar;
        this.f350269c = zzbgVar;
        str.getClass();
        this.f350267a = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f350267a);
        sb2.append('{');
        zzbg zzbgVar = this.f350268b.f350266c;
        String str = "";
        while (zzbgVar != null) {
            Object obj = zzbgVar.f350265b;
            sb2.append(str);
            String str2 = zzbgVar.f350264a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzbgVar = zzbgVar.f350266c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzbi zza(String str, int i12) {
        String strValueOf = String.valueOf(i12);
        zzbf zzbfVar = new zzbf(null);
        this.f350269c.f350266c = zzbfVar;
        this.f350269c = zzbfVar;
        zzbfVar.f350265b = strValueOf;
        zzbfVar.f350264a = "errorCode";
        return this;
    }

    public final zzbi zzb(String str, @a Object obj) {
        zzbg zzbgVar = new zzbg();
        this.f350269c.f350266c = zzbgVar;
        this.f350269c = zzbgVar;
        zzbgVar.f350265b = obj;
        zzbgVar.f350264a = str;
        return this;
    }
}
