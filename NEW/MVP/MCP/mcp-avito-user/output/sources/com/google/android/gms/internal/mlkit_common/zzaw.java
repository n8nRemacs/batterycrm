package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzaw extends zzaq {

    /* renamed from: f, reason: collision with root package name */
    public static final zzaq f351198f = new zzaw(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f351199d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f351200e;

    public zzaw(Object[] objArr, int i12) {
        this.f351199d = objArr;
        this.f351200e = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaq, com.google.android.gms.internal.mlkit_common.zzam
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f351199d;
        int i12 = this.f351200e;
        System.arraycopy(objArr2, 0, objArr, 0, i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam
    public final int b() {
        return this.f351200e;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam
    public final Object[] e() {
        return this.f351199d;
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzae.zza(i12, this.f351200e, "index");
        Object obj = this.f351199d[i12];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f351200e;
    }
}
