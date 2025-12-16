package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
class zzbg extends zzbh {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f352989a;

    /* renamed from: b, reason: collision with root package name */
    public int f352990b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f352991c;

    public final zzbg zza(Object obj) {
        obj.getClass();
        int i12 = this.f352990b;
        int i13 = i12 + 1;
        Object[] objArr = this.f352989a;
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
            this.f352989a = Arrays.copyOf(objArr, i14);
            this.f352991c = false;
        } else if (this.f352991c) {
            this.f352989a = (Object[]) objArr.clone();
            this.f352991c = false;
        }
        Object[] objArr2 = this.f352989a;
        int i15 = this.f352990b;
        this.f352990b = i15 + 1;
        objArr2[i15] = obj;
        return this;
    }
}
