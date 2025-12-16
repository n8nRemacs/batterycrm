package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class bt extends b41 {
    @Override // com.yandex.mobile.ads.impl.b41
    public final Metadata a(hg0 hg0Var, ByteBuffer byteBuffer) {
        pr0 pr0Var = new pr0(byteBuffer.limit(), byteBuffer.array());
        String strQ = pr0Var.q();
        strQ.getClass();
        String strQ2 = pr0Var.q();
        strQ2.getClass();
        return new Metadata(new EventMessage(strQ, strQ2, pr0Var.p(), pr0Var.p(), Arrays.copyOfRange(pr0Var.c(), pr0Var.d(), pr0Var.e())));
    }
}
