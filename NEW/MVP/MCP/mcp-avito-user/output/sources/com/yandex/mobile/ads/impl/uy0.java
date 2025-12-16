package com.yandex.mobile.ads.impl;

import kotlin.InterfaceC42830m;
import okio.InterfaceC44803m;

/* loaded from: classes8.dex */
public abstract class uy0 {

    public static final class a {
        public /* synthetic */ a(int i12) {
            this();
        }

        @X41.j
        @InterfaceC42830m
        @X41.n
        @Y61.k
        public static ty0 a(@Y61.k byte[] bArr) {
            int length = bArr.length;
            qc1.a(bArr.length, 0, length);
            return new ty0(null, bArr, length, 0);
        }

        public static ty0 b(byte[] bArr) {
            int length = bArr.length;
            qc1.a(bArr.length, 0, length);
            return new ty0(null, bArr, length, 0);
        }

        private a() {
        }
    }

    static {
        new a(0);
    }

    @X41.j
    @InterfaceC42830m
    @X41.n
    @Y61.k
    public static final ty0 a(@Y61.k byte[] bArr) {
        return a.a(bArr);
    }

    public abstract long a();

    public abstract void a(@Y61.k InterfaceC44803m interfaceC44803m);

    @Y61.l
    public abstract pd0 b();
}
