package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x91;
import java.io.EOFException;

/* loaded from: classes8.dex */
public final class yr implements x91 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f392057a = new byte[4096];

    @Override // com.yandex.mobile.ads.impl.x91
    public final void a(long j12, int i12, int i13, int i14, @j.P x91.a aVar) {
    }

    @Override // com.yandex.mobile.ads.impl.x91
    public final void b(int i12, pr0 pr0Var) {
        pr0Var.f(i12);
    }

    @Override // com.yandex.mobile.ads.impl.x91
    public final void a(vw vwVar) {
    }

    @Override // com.yandex.mobile.ads.impl.x91
    public final int a(dn dnVar, int i12, boolean z12) throws EOFException {
        int i13 = dnVar.read(this.f392057a, 0, Math.min(this.f392057a.length, i12));
        if (i13 != -1) {
            return i13;
        }
        if (z12) {
            return -1;
        }
        throw new EOFException();
    }
}
