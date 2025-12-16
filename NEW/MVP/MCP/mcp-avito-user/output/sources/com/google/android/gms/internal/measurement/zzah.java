package com.google.android.gms.internal.measurement;

import AK.c;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class zzah implements Iterator<zzaq> {

    /* renamed from: b, reason: collision with root package name */
    public int f350555b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzaf f350556c;

    public zzah(zzaf zzafVar) {
        this.f350556c = zzafVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f350555b < this.f350556c.zzb();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        int i12 = this.f350555b;
        zzaf zzafVar = this.f350556c;
        if (i12 >= zzafVar.zzb()) {
            throw new NoSuchElementException(c.g(this.f350555b, "Out of bounds index: "));
        }
        int i13 = this.f350555b;
        this.f350555b = i13 + 1;
        return zzafVar.zza(i13);
    }
}
