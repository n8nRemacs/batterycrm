package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Arrays;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
class zzj extends zzk {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f352853a;

    /* renamed from: b, reason: collision with root package name */
    public int f352854b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f352855c;

    public final zzj zza(Object obj) {
        obj.getClass();
        int i12 = this.f352854b;
        int i13 = i12 + 1;
        Object[] objArr = this.f352853a;
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
            this.f352853a = Arrays.copyOf(objArr, i14);
            this.f352855c = false;
        } else if (this.f352855c) {
            this.f352853a = (Object[]) objArr.clone();
            this.f352855c = false;
        }
        Object[] objArr2 = this.f352853a;
        int i15 = this.f352854b;
        this.f352854b = i15 + 1;
        objArr2[i15] = obj;
        return this;
    }
}
