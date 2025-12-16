package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zzan extends zzak {
    public zzan() {
        this.f351179a = new Object[4];
        this.f351180b = 0;
    }

    public final zzan zzb(Object obj) {
        obj.getClass();
        int i12 = this.f351180b + 1;
        Object[] objArr = this.f351179a;
        int length = objArr.length;
        if (length < i12) {
            this.f351179a = Arrays.copyOf(objArr, zzal.a(length, i12));
            this.f351181c = false;
        } else if (this.f351181c) {
            this.f351179a = (Object[]) objArr.clone();
            this.f351181c = false;
        }
        Object[] objArr2 = this.f351179a;
        int i13 = this.f351180b;
        this.f351180b = i13 + 1;
        objArr2[i13] = obj;
        return this;
    }

    public final zzaq zzc() {
        this.f351181c = true;
        Object[] objArr = this.f351179a;
        int i12 = this.f351180b;
        zzbe zzbeVar = zzaq.f351187c;
        return i12 == 0 ? zzaw.f351198f : new zzaw(objArr, i12);
    }
}
