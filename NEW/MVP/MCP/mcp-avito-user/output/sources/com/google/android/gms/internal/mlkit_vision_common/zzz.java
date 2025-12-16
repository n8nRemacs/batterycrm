package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
final class zzz extends zzr {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f352934g = 0;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f352935e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f352936f;

    static {
        new zzz(new Object[0], 0);
    }

    public zzz(Object[] objArr, int i12) {
        this.f352935e = objArr;
        this.f352936f = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    public final zzl a() {
        return new zzy(this.f352935e, 1, this.f352936f);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    public final zzs b() {
        return new zzw(this, this.f352935e, this.f352936f);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    public final zzs c() {
        return new zzx(this, new zzy(this.f352935e, 0, this.f352936f));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr, java.util.Map
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
            int r1 = r4.f352936f
            r2 = 1
            if (r1 != r2) goto L3
            java.lang.Object[] r1 = r4.f352935e
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzz.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f352936f;
    }
}
