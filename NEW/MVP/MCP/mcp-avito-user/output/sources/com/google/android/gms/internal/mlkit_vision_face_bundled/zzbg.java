package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Arrays;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzbg extends zzbd {
    public zzbg() {
        this.f353491a = new Object[4];
        this.f353492b = 0;
    }

    public final zzbg zza(Object obj) {
        obj.getClass();
        int i12 = this.f353492b;
        int i13 = i12 + 1;
        Object[] objArr = this.f353491a;
        int length = objArr.length;
        if (length < i13) {
            int i14 = length + (length >> 1) + 1;
            if (i14 < i13) {
                int iHighestOneBit = Integer.highestOneBit(i12);
                i14 = iHighestOneBit + iHighestOneBit;
            }
            if (i14 < 0) {
                i14 = Integer.MAX_VALUE;
            }
            this.f353491a = Arrays.copyOf(objArr, i14);
            this.f353493c = false;
        } else if (this.f353493c) {
            this.f353491a = (Object[]) objArr.clone();
            this.f353493c = false;
        }
        Object[] objArr2 = this.f353491a;
        int i15 = this.f353492b;
        this.f353492b = i15 + 1;
        objArr2[i15] = obj;
        return this;
    }

    public final zzbj zzb() {
        this.f353493c = true;
        Object[] objArr = this.f353491a;
        int i12 = this.f353492b;
        zzbv zzbvVar = zzbj.f353499c;
        return i12 == 0 ? zzbn.f353504f : new zzbn(objArr, i12);
    }
}
