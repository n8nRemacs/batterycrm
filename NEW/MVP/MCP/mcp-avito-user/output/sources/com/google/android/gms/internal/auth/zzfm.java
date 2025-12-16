package com.google.android.gms.internal.auth;

import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzfm extends zzdr implements RandomAccess, zzez, zzge {

    /* renamed from: c, reason: collision with root package name */
    public long[] f350112c;

    /* renamed from: d, reason: collision with root package name */
    public int f350113d;

    static {
        new zzfm(new long[0], 0, false);
    }

    public zzfm() {
        this(new long[10], 0, true);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f350113d)) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350113d, "Index:", ", Size:"));
        }
        long[] jArr = this.f350112c;
        if (i13 < jArr.length) {
            System.arraycopy(jArr, i12, jArr, i12 + 1, i13 - i12);
        } else {
            long[] jArr2 = new long[e.e(i13, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i12);
            System.arraycopy(this.f350112c, i12, jArr2, i12 + 1, this.f350113d - i12);
            this.f350112c = jArr2;
        }
        this.f350112c[i12] = jLongValue;
        this.f350113d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = zzfa.f350106a;
        collection.getClass();
        if (!(collection instanceof zzfm)) {
            return super.addAll(collection);
        }
        zzfm zzfmVar = (zzfm) collection;
        int i12 = zzfmVar.f350113d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f350113d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        long[] jArr = this.f350112c;
        if (i14 > jArr.length) {
            this.f350112c = Arrays.copyOf(jArr, i14);
        }
        System.arraycopy(zzfmVar.f350112c, 0, this.f350112c, this.f350113d, zzfmVar.f350113d);
        this.f350113d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f350113d) {
            throw new IndexOutOfBoundsException(H.j(i12, this.f350113d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfm)) {
            return super.equals(obj);
        }
        zzfm zzfmVar = (zzfm) obj;
        if (this.f350113d != zzfmVar.f350113d) {
            return false;
        }
        long[] jArr = zzfmVar.f350112c;
        for (int i12 = 0; i12 < this.f350113d; i12++) {
            if (this.f350112c[i12] != jArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i12) {
        d(i12);
        return Long.valueOf(this.f350112c[i12]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i12 = 1;
        for (int i13 = 0; i13 < this.f350113d; i13++) {
            long j12 = this.f350112c[i13];
            Charset charset = zzfa.f350106a;
            i12 = (i12 * 31) + ((int) (j12 ^ (j12 >>> 32)));
        }
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i12 = this.f350113d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f350112c[i13] == jLongValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i12) {
        b();
        d(i12);
        long[] jArr = this.f350112c;
        long j12 = jArr[i12];
        if (i12 < this.f350113d - 1) {
            System.arraycopy(jArr, i12 + 1, jArr, i12, (r3 - i12) - 1);
        }
        this.f350113d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f350112c;
        System.arraycopy(jArr, i13, jArr, i12, this.f350113d - i13);
        this.f350113d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i12, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        d(i12);
        long[] jArr = this.f350112c;
        long j12 = jArr[i12];
        jArr[i12] = jLongValue;
        return Long.valueOf(j12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350113d;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i12) {
        if (i12 >= this.f350113d) {
            return new zzfm(Arrays.copyOf(this.f350112c, i12), this.f350113d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(long j12) {
        b();
        int i12 = this.f350113d;
        long[] jArr = this.f350112c;
        if (i12 == jArr.length) {
            long[] jArr2 = new long[e.e(i12, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i12);
            this.f350112c = jArr2;
        }
        long[] jArr3 = this.f350112c;
        int i13 = this.f350113d;
        this.f350113d = i13 + 1;
        jArr3[i13] = j12;
    }

    public zzfm(long[] jArr, int i12, boolean z12) {
        super(z12);
        this.f350112c = jArr;
        this.f350113d = i12;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Long) obj).longValue());
        return true;
    }
}
