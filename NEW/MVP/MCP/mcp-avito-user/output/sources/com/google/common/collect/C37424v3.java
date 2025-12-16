package com.google.common.collect;

import java.util.Arrays;

/* compiled from: ObjectCountLinkedHashMap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.v3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37424v3<K> extends C37419u3<K> {

    /* renamed from: i, reason: collision with root package name */
    @XY0.e
    public transient long[] f360038i;

    /* renamed from: j, reason: collision with root package name */
    public transient int f360039j;

    /* renamed from: k, reason: collision with root package name */
    public transient int f360040k;

    public C37424v3() {
        this(0);
    }

    @Override // com.google.common.collect.C37419u3
    public final void a() {
        super.a();
        this.f360039j = -2;
        this.f360040k = -2;
    }

    @Override // com.google.common.collect.C37419u3
    public final int c() {
        int i12 = this.f360039j;
        if (i12 == -2) {
            return -1;
        }
        return i12;
    }

    @Override // com.google.common.collect.C37419u3
    public final void h(int i12) {
        super.h(i12);
        this.f360039j = -2;
        this.f360040k = -2;
        long[] jArr = new long[i12];
        this.f360038i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.C37419u3
    public final void i(@InterfaceC37434x3 Object obj, int i12, int i13, int i14) {
        super.i(obj, i12, i13, i14);
        r(this.f360040k, i12);
        r(i12, -2);
    }

    @Override // com.google.common.collect.C37419u3
    public final void j(int i12) {
        int i13 = this.f360015c - 1;
        long j12 = this.f360038i[i12];
        r((int) (j12 >>> 32), (int) j12);
        if (i12 < i13) {
            r((int) (this.f360038i[i13] >>> 32), i12);
            r(i12, (int) this.f360038i[i13]);
        }
        super.j(i12);
    }

    @Override // com.google.common.collect.C37419u3
    public final int k(int i12) {
        int i13 = (int) this.f360038i[i12];
        if (i13 == -2) {
            return -1;
        }
        return i13;
    }

    @Override // com.google.common.collect.C37419u3
    public final int l(int i12, int i13) {
        return i12 == this.f360015c ? i13 : i12;
    }

    @Override // com.google.common.collect.C37419u3
    public final void p(int i12) {
        super.p(i12);
        long[] jArr = this.f360038i;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i12);
        this.f360038i = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i12, -1L);
    }

    public final void r(int i12, int i13) {
        if (i12 == -2) {
            this.f360039j = i13;
        } else {
            long[] jArr = this.f360038i;
            jArr[i12] = (jArr[i12] & (-4294967296L)) | (i13 & 4294967295L);
        }
        if (i13 == -2) {
            this.f360040k = i12;
        } else {
            long[] jArr2 = this.f360038i;
            jArr2[i13] = (4294967295L & jArr2[i13]) | (i12 << 32);
        }
    }

    public C37424v3(int i12) {
        super(3, 0);
    }
}
