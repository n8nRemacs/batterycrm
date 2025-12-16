package com.yandex.metrica.impl.ob;

import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.v9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39191v9 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final a f382039a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Ql f382040b;

    /* renamed from: com.yandex.metrica.impl.ob.v9$a */
    public static class a {
    }

    public C39191v9() {
        this(new a(), new Ql());
    }

    @j.P
    public byte[] a(@j.P byte[] bArr, @j.N String str) {
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            a aVar = this.f382039a;
            byte[] bytes = str.getBytes();
            aVar.getClass();
            C39228wm c39228wm = new C39228wm("AES/CBC/PKCS5Padding", bytes, bArrCopyOfRange);
            if (A2.a(bArr)) {
                return null;
            }
            return this.f382040b.uncompress(c39228wm.a(bArr, 16, bArr.length - 16));
        } catch (Throwable unused) {
            return null;
        }
    }

    @j.k0
    public C39191v9(@j.N a aVar, @j.N Ql ql2) {
        this.f382039a = aVar;
        this.f382040b = ql2;
    }
}
