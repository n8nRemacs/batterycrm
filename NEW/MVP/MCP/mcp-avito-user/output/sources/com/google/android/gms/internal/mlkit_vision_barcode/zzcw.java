package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzcw extends zzce {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f351835g = 0;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f351836e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f351837f;

    static {
        new zzcw(new Object[0], 0);
    }

    public zzcw(Object[] objArr, int i12) {
        this.f351836e = objArr;
        this.f351837f = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzce
    public final zzbx a() {
        return new zzcv(this.f351836e, 1, this.f351837f);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzce
    public final zzcf b() {
        return new zzct(this, this.f351836e, this.f351837f);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzce
    public final zzcf c() {
        return new zzcu(this, new zzcv(this.f351836e, 0, this.f351837f));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzce, java.util.Map
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
            int r1 = r4.f351837f
            r2 = 1
            if (r1 != r2) goto L3
            java.lang.Object[] r1 = r4.f351836e
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode.zzcw.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f351837f;
    }
}
