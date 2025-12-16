package com.google.android.gms.internal.mlkit_vision_face;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzcg extends zzbn {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f353018d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f353019e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f353020f;

    public zzcg(Object[] objArr, int i12, int i13) {
        this.f353018d = objArr;
        this.f353019e = i12;
        this.f353020f = i13;
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzab.zza(i12, this.f353020f, "index");
        Object obj = this.f353018d[i12 + i12 + this.f353019e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f353020f;
    }
}
