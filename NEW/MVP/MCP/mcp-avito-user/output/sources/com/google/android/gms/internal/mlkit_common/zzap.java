package com.google.android.gms.internal.mlkit_common;

import I41.a;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzap extends zzaq {

    /* renamed from: d, reason: collision with root package name */
    public final transient int f351184d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f351185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzaq f351186f;

    public zzap(zzaq zzaqVar, int i12, int i13) {
        this.f351186f = zzaqVar;
        this.f351184d = i12;
        this.f351185e = i13;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam
    public final int b() {
        return this.f351186f.d() + this.f351184d + this.f351185e;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam
    public final int d() {
        return this.f351186f.d() + this.f351184d;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam
    @a
    public final Object[] e() {
        return this.f351186f.e();
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzae.zza(i12, this.f351185e, "index");
        return this.f351186f.get(i12 + this.f351184d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f351185e;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaq, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzaq subList(int i12, int i13) {
        zzae.zzd(i12, i13, this.f351185e);
        int i14 = this.f351184d;
        return this.f351186f.subList(i12 + i14, i13 + i14);
    }
}
