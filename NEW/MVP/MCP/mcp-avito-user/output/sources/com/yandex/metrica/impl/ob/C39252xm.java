package com.yandex.metrica.impl.ob;

import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.xm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39252xm implements Cm {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39228wm f382208a;

    public C39252xm() {
        this(new C39204vm(F0.g().e()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // com.yandex.metrica.impl.ob.Cm
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.yandex.metrica.impl.ob.Bm a(@j.N com.yandex.metrica.impl.ob.C38715c0 r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.q()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1e
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L1e
            com.yandex.metrica.impl.ob.wm r1 = r2.f382208a     // Catch: java.lang.Throwable -> L1e
            byte[] r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1e
            r1 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            com.yandex.metrica.impl.ob.Bm r1 = new com.yandex.metrica.impl.ob.Bm
            com.yandex.metrica.impl.ob.c0 r3 = r3.f(r0)
            com.yandex.metrica.impl.ob.Em r0 = com.yandex.metrica.impl.ob.Em.AES_VALUE_ENCRYPTION
            r1.<init>(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C39252xm.a(com.yandex.metrica.impl.ob.c0):com.yandex.metrica.impl.ob.Bm");
    }

    public C39252xm(@j.N C39204vm c39204vm) {
        this(new C39228wm("AES/CBC/PKCS5Padding", c39204vm.b(), c39204vm.a()));
    }

    @j.k0
    public C39252xm(@j.N C39228wm c39228wm) {
        this.f382208a = c39228wm;
    }

    @Override // com.yandex.metrica.impl.ob.Cm
    @j.N
    public byte[] a(@j.P byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            byte[] bArrDecode = Base64.decode(bArr, 0);
            C39228wm c39228wm = this.f382208a;
            c39228wm.getClass();
            return c39228wm.a(bArrDecode, 0, bArrDecode.length);
        } catch (Throwable unused) {
            return bArr2;
        }
    }
}
