package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public abstract class b41 implements fg0 {
    @Override // com.yandex.mobile.ads.impl.fg0
    @j.P
    public final Metadata a(hg0 hg0Var) {
        ByteBuffer byteBuffer = hg0Var.f390951c;
        byteBuffer.getClass();
        db.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (hg0Var.e()) {
            return null;
        }
        return a(hg0Var, byteBuffer);
    }

    @j.P
    public abstract Metadata a(hg0 hg0Var, ByteBuffer byteBuffer);
}
