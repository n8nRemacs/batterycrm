package com.google.android.gms.internal.fido;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzff extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final int f350361b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzfg f350362c;

    public zzff(zzfg zzfgVar) {
        this.f350362c = zzfgVar;
    }

    public final int b() {
        if (this.f350361b == -1) {
            return 0;
        }
        return this.f350362c.f350365c[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zzfg zzfgVar = this.f350362c;
        Object[] objArr = zzfgVar.f350364b;
        int iB2 = b();
        int[] iArr = zzfgVar.f350365c;
        int i12 = this.f350361b;
        return Arrays.binarySearch(objArr, iB2, iArr[i12 + 1], obj, i12 == -1 ? zzfg.f350363g : zzfi.f350370b) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfe(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f350362c.f350365c[this.f350361b + 1] - b();
    }
}
