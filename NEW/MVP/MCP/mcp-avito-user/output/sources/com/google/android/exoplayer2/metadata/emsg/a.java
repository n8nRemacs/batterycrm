package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.f;
import com.google.android.exoplayer2.util.F;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: EventMessageDecoder.java */
/* loaded from: classes6.dex */
public final class a extends f {
    public static EventMessage c(F f12) {
        String strM = f12.m();
        strM.getClass();
        String strM2 = f12.m();
        strM2.getClass();
        return new EventMessage(strM, strM2, f12.l(), f12.l(), Arrays.copyOfRange(f12.f348070a, f12.f348071b, f12.f348072c));
    }

    @Override // com.google.android.exoplayer2.metadata.f
    public final Metadata b(com.google.android.exoplayer2.metadata.c cVar, ByteBuffer byteBuffer) {
        return new Metadata(c(new F(byteBuffer.array(), byteBuffer.limit())));
    }
}
