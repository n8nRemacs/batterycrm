package com.google.android.gms.internal.common;

import aZ0.InterfaceC19845a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
class zzaa extends zzab {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f350222a = new Object[4];

    /* renamed from: b, reason: collision with root package name */
    public int f350223b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f350224c;

    @InterfaceC19845a
    public final zzaa zza(Object obj) {
        obj.getClass();
        int i12 = this.f350223b;
        int i13 = i12 + 1;
        Object[] objArr = this.f350222a;
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
            this.f350222a = Arrays.copyOf(objArr, i14);
            this.f350224c = false;
        } else if (this.f350224c) {
            this.f350222a = (Object[]) objArr.clone();
            this.f350224c = false;
        }
        Object[] objArr2 = this.f350222a;
        int i15 = this.f350223b;
        this.f350223b = i15 + 1;
        objArr2[i15] = obj;
        return this;
    }
}
