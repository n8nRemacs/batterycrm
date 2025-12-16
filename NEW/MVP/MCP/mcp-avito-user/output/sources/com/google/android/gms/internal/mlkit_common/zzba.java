package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzba extends zzaq {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f351207d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f351208e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f351209f;

    public zzba(Object[] objArr, int i12, int i13) {
        this.f351207d = objArr;
        this.f351208e = i12;
        this.f351209f = i13;
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzae.zza(i12, this.f351209f, "index");
        Object obj = this.f351207d[i12 + i12 + this.f351208e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f351209f;
    }
}
