package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.decoder.DecoderException;
import j.P;

/* compiled from: Decoder.java */
/* loaded from: classes6.dex */
public interface e<I, O, E extends DecoderException> {
    @P
    I a();

    @P
    O b();

    void d(I i12);

    void flush();

    String getName();

    void release();
}
