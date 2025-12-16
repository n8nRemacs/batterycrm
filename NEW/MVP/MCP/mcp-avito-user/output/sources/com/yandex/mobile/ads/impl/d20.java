package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.c20;
import java.io.EOFException;

/* loaded from: classes8.dex */
public final class d20 {

    /* renamed from: a, reason: collision with root package name */
    private final pr0 f384508a = new pr0(10);

    @j.P
    public final Metadata a(to toVar, @j.P c20.a aVar) {
        Metadata metadataA = null;
        int i12 = 0;
        while (true) {
            try {
                toVar.b(this.f384508a.c(), 0, 10, false);
                this.f384508a.e(0);
                if (this.f384508a.w() != 4801587) {
                    break;
                }
                this.f384508a.f(3);
                int iS2 = this.f384508a.s();
                int i13 = iS2 + 10;
                if (metadataA == null) {
                    byte[] bArr = new byte[i13];
                    System.arraycopy(this.f384508a.c(), 0, bArr, 0, 10);
                    toVar.b(bArr, 10, iS2, false);
                    metadataA = new c20(aVar).a(i13, bArr);
                } else {
                    toVar.a(false, iS2);
                }
                i12 += i13;
            } catch (EOFException unused) {
            }
        }
        toVar.c();
        toVar.a(false, i12);
        return metadataA;
    }
}
