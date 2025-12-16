package com.google.android.gms.internal.mlkit_vision_face;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzch extends zzbp {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f353021g = 0;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f353022e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f353023f;

    static {
        new zzch(new Object[0], 0);
    }

    public zzch(Object[] objArr, int i12) {
        this.f353022e = objArr;
        this.f353023f = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbp
    public final zzbi a() {
        return new zzcg(this.f353022e, 1, this.f353023f);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbp
    public final zzbq b() {
        return new zzce(this, this.f353022e, this.f353023f);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbp
    public final zzbq c() {
        return new zzcf(this, new zzcg(this.f353022e, 0, this.f353023f));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbp, java.util.Map
    @I41.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(@I41.a java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L5
        L3:
            r5 = r0
            goto L1d
        L5:
            int r1 = r4.f353023f
            r2 = 1
            if (r1 != r2) goto L3
            java.lang.Object[] r1 = r4.f353022e
            r3 = 0
            r3 = r1[r3]
            r3.getClass()
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L3
            r5 = r1[r2]
            r5.getClass()
        L1d:
            if (r5 != 0) goto L20
            return r0
        L20:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzch.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f353023f;
    }
}
