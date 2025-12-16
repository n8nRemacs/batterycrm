package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public abstract class d41 extends y31<x71, y71, v71> implements u71 {
    public d41() {
        super(new x71[2], new y71[2]);
        f();
    }

    public abstract t71 a(byte[] bArr, int i12, boolean z12);

    @Override // com.yandex.mobile.ads.impl.u71
    public final void a(long j12) {
    }

    @Override // com.yandex.mobile.ads.impl.y31
    public final x71 c() {
        return new x71();
    }

    @Override // com.yandex.mobile.ads.impl.y31
    public final wn d() {
        return new c41(this);
    }

    @Override // com.yandex.mobile.ads.impl.y31
    @j.P
    public final v71 a(vn vnVar, wn wnVar, boolean z12) {
        x71 x71Var = (x71) vnVar;
        y71 y71Var = (y71) wnVar;
        try {
            ByteBuffer byteBuffer = x71Var.f390951c;
            byteBuffer.getClass();
            y71Var.a(x71Var.f390953e, a(byteBuffer.array(), byteBuffer.limit(), z12), x71Var.f391573i);
            y71Var.c();
            return null;
        } catch (v71 e12) {
            return e12;
        }
    }
}
