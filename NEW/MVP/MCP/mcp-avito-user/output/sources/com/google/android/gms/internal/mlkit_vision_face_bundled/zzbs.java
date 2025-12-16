package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzbs extends zzbl {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f353516g = 0;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f353517e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f353518f;

    static {
        new zzbs(new Object[0], 0);
    }

    public zzbs(Object[] objArr, int i12) {
        this.f353517e = objArr;
        this.f353518f = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbl
    public final zzbf a() {
        return new zzbr(this.f353517e, 1, this.f353518f);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbl
    public final zzbm b() {
        return new zzbp(this, this.f353517e, this.f353518f);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbl
    public final zzbm c() {
        return new zzbq(this, new zzbr(this.f353517e, 0, this.f353518f));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbl, java.util.Map
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
            int r1 = r4.f353518f
            r2 = 1
            if (r1 != r2) goto L3
            java.lang.Object[] r1 = r4.f353517e
            r3 = 0
            r3 = r1[r3]
            java.util.Objects.requireNonNull(r3)
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L3
            r5 = r1[r2]
            java.util.Objects.requireNonNull(r5)
        L1d:
            if (r5 != 0) goto L20
            return r0
        L20:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzbs.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f353518f;
    }
}
