package com.google.android.gms.internal.mlkit_common;

import AK.c;
import java.util.Arrays;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zzas {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f351191a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    public int f351192b = 0;

    /* renamed from: c, reason: collision with root package name */
    public zzar f351193c;

    public final zzas zza(Object obj, Object obj2) {
        int i12 = this.f351192b + 1;
        Object[] objArr = this.f351191a;
        int length = objArr.length;
        int i13 = i12 + i12;
        if (i13 > length) {
            this.f351191a = Arrays.copyOf(objArr, zzal.a(length, i13));
        }
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(c.k("null value in entry: ", obj.toString(), "=null"));
        }
        Object[] objArr2 = this.f351191a;
        int i14 = this.f351192b;
        int i15 = i14 + i14;
        objArr2[i15] = obj;
        objArr2[i15 + 1] = obj2;
        this.f351192b = i14 + 1;
        return this;
    }

    public final zzat zzb() {
        zzar zzarVar = this.f351193c;
        if (zzarVar != null) {
            throw zzarVar.a();
        }
        zzbb zzbbVarD = zzbb.d(this.f351192b, this.f351191a, this);
        zzar zzarVar2 = this.f351193c;
        if (zzarVar2 == null) {
            return zzbbVarD;
        }
        throw zzarVar2.a();
    }
}
